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
import migrator.IonButton;
import migrator.MigratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ion Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IonButtonImpl extends ComponentImpl implements IonButton {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IonButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MigratorPackage.Literals.ION_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String migrate(final String projectPath, final String filePath) {
		File input = new File(projectPath + "\\" + filePath);
        // DOM structure of the file
        Document doc;
        try{
            doc = Jsoup.parse(input, "UTF-8", "");
            // Select all buttons
            Elements buttons = doc.select("button");

            for (Element button : buttons){
                // Ionic 3 button
                System.out.println(button.toString());
                // Ionic 4 button
                Element v4Button = new Element("ion-button");
                // Loop through all attributes of v3 button
                for (Attribute attribute : button.attributes()) {
                    // We only want to change ion-buttons, not regular ones
                    if (!attribute.toString().equals("ion-button")) {
                        // Change attributes from v3 to v4 according to docs
                        // Any that don't change can just have the old key and value
                        // from the v3 button
                        if (attribute.toString().equals("clear")) {
                            v4Button.attr("fill", "clear");
                        } else {
                            v4Button.attr(attribute.getKey(), attribute.getValue());
                        }
                    }
                }
                System.out.println(v4Button.toString() + "\n");
                // Replace the old button with the new button in the DOM structure
                button.replaceWith(v4Button);

                // Adding children / text
                String v3ButtonText = button.text();
                System.out.println("v3 button children: " + v3ButtonText);
                v4Button.append(v3ButtonText);
            }
            // The new DOM structure can be given to the model
            // to be generated using Acceleo
            System.out.println(doc.toString());
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
				return MigratorPackage.ION_BUTTON___MIGRATE__STRING_STRING;
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
		case MigratorPackage.ION_BUTTON___MIGRATE__STRING_STRING:
			return migrate((String) arguments.get(0), (String) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //IonButtonImpl
