/**
 */
package migrator.impl;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import migrator.Component;
import migrator.IonLabel;
import migrator.MigratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ion Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IonLabelImpl extends ComponentImpl implements IonLabel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IonLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MigratorPackage.Literals.ION_LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String migrate(final String projectPath, final String filePath) {
		File input = new File(projectPath + "\\" + filePath);

        Document doc;

        try {
            doc = Jsoup.parse(input, "UTF-8", "");
            Elements labels = doc.select("ion-label");

            for (Element label: labels) {
                Element v4Label = new Element("ion-label");
                for (Attribute attribute: label.attributes()) {
                    if (!attribute.toString().equals("ion-label")) {
                        if (attribute.toString().equals("floating")) {
                            v4Label.attr("position", "floating");
                        } else {
                            v4Label.attr(attribute.getKey(), attribute.getValue());
                        }
                    }
                }

                label.replaceWith(v4Label);
                String labelText = label.text();
                v4Label.append(labelText);
            }

            return doc.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Component.class) {
			switch (baseOperationID) {
			case MigratorPackage.COMPONENT___MIGRATE__STRING_STRING:
				return MigratorPackage.ION_LABEL___MIGRATE__STRING_STRING;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MigratorPackage.ION_LABEL___MIGRATE__STRING_STRING:
			return migrate((String) arguments.get(0), (String) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //IonLabelImpl
