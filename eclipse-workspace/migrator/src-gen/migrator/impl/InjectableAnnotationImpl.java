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
import migrator.InjectableAnnotation;
import migrator.MigratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Injectable Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InjectableAnnotationImpl extends ComponentImpl implements InjectableAnnotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InjectableAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MigratorPackage.Literals.INJECTABLE_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String migrate(final String projectPath, final String filePath) {
		try{
            String newVersion = new String(Files.readAllBytes(Paths.get(projectPath, filePath)));
            if(newVersion.contains("@Injectable()")){
                // Finds where the '(' starts in the Injectable annotation
                int startingBracket = newVersion.indexOf("@Injectable()") + 12;

                // Make the change to have the providedIn value
                newVersion = newVersion.substring(0, startingBracket) + "{\n\t providedIn: 'root'\n}" + newVersion.substring(startingBracket);
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
				return MigratorPackage.INJECTABLE_ANNOTATION___MIGRATE__STRING_STRING;
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
		case MigratorPackage.INJECTABLE_ANNOTATION___MIGRATE__STRING_STRING:
			return migrate((String) arguments.get(0), (String) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //InjectableAnnotationImpl
