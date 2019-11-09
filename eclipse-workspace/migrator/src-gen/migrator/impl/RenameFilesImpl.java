/**
 */
package migrator.impl;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import migrator.Component;
import migrator.MigratorPackage;
import migrator.RenameFiles;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rename Files</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RenameFilesImpl extends ComponentImpl implements RenameFiles {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenameFilesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MigratorPackage.Literals.RENAME_FILES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String migrate(final String projectPath, final String filePath) {
		String[] filePathComponents = filePath.split("\\\\");
        String directory = projectPath + "\\";
        for (int i = 0; i < filePathComponents.length - 1; i++) {
            directory += filePathComponents[i] + "\\";
        }

        File pageDirectory = new File(directory);
        File[] allFiles = pageDirectory.listFiles();

        for (File file: allFiles) {
            String filename = file.getName();
            if (filename.endsWith(".html") ||
                    (filename.endsWith(".ts") && !filename.contains(".module")) ||
                    filename.endsWith(".scss")) {
                String[] fileComponents = filename.split("\\.");
                String prefix = fileComponents[0];
                String suffix = fileComponents[1];
                String newFilename = prefix + ".page." + suffix;
                file.renameTo(new File(directory + newFilename));
            }
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
				return MigratorPackage.RENAME_FILES___MIGRATE__STRING_STRING;
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
		case MigratorPackage.RENAME_FILES___MIGRATE__STRING_STRING:
			return migrate((String) arguments.get(0), (String) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RenameFilesImpl
