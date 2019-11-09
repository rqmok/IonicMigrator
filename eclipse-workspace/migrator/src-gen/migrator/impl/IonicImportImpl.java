/**
 */
package migrator.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import migrator.Component;
import migrator.IonicImport;
import migrator.MigratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ionic Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IonicImportImpl extends ComponentImpl implements IonicImport {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IonicImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MigratorPackage.Literals.IONIC_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String migrate(final String projectPath, final String filePath) {
		String newVersion = "";
        try{
            newVersion = new String(Files.readAllBytes(Paths.get(projectPath, filePath)));
            if(newVersion.contains("ionic-angular")){
                newVersion = newVersion.replaceAll("ionic-angular","@ionic/angular");
            }
            return newVersion;
        }catch(IOException e){
            System.out.println(e);
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
				return MigratorPackage.IONIC_IMPORT___MIGRATE__STRING_STRING;
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
		case MigratorPackage.IONIC_IMPORT___MIGRATE__STRING_STRING:
			return migrate((String) arguments.get(0), (String) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //IonicImportImpl
