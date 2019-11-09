/**
 */
package migrator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>mBase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link migrator.mBase#getMigrators <em>Migrators</em>}</li>
 * </ul>
 *
 * @see migrator.MigratorPackage#getmBase()
 * @model
 * @generated
 */
public interface mBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Migrators</b></em>' containment reference list.
	 * The list contents are of type {@link migrator.Migrator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Migrators</em>' containment reference list.
	 * @see migrator.MigratorPackage#getmBase_Migrators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Migrator> getMigrators();

} // mBase
