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
import migrator.IonNavbar;
import migrator.MigratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ion Navbar</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IonNavbarImpl extends ComponentImpl implements IonNavbar {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IonNavbarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MigratorPackage.Literals.ION_NAVBAR;
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
        try {
            doc = Jsoup.parse(input, "UTF-8", "");
            // Select all navbar
            Elements navbars = doc.select("ion-navbar");
            for (Element v3Navbar : navbars) {
                Element v4Navbar = new Element("ion-toolbar");

                //Loop through old tag attributes to get all attributes
                for (Attribute attribute : v3Navbar.attributes()) {
                    v4Navbar.attr(attribute.getKey(), attribute.getValue());
                }

                // Replace old tags with new tags
                v3Navbar.replaceWith(v4Navbar);

                // Adding children into new tags
                Elements v3NavbarChildren = v3Navbar.children();
                for( Element v3Child : v3NavbarChildren){
                    v4Navbar.appendChild(v3Child);
                }
            }
            return doc.toString();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return "error in parsing Navbar";
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
				return MigratorPackage.ION_NAVBAR___MIGRATE__STRING_STRING;
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
		case MigratorPackage.ION_NAVBAR___MIGRATE__STRING_STRING:
			return migrate((String) arguments.get(0), (String) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //IonNavbarImpl
