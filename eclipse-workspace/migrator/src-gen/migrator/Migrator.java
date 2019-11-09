/**
 */
package migrator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Migrator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link migrator.Migrator#getName <em>Name</em>}</li>
 *   <li>{@link migrator.Migrator#getProjectPath <em>Project Path</em>}</li>
 *   <li>{@link migrator.Migrator#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see migrator.MigratorPackage#getMigrator()
 * @model
 * @generated
 */
public interface Migrator extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see migrator.MigratorPackage#getMigrator_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link migrator.Migrator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Project Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Path</em>' attribute.
	 * @see #setProjectPath(String)
	 * @see migrator.MigratorPackage#getMigrator_ProjectPath()
	 * @model
	 * @generated
	 */
	String getProjectPath();

	/**
	 * Sets the value of the '{@link migrator.Migrator#getProjectPath <em>Project Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Path</em>' attribute.
	 * @see #getProjectPath()
	 * @generated
	 */
	void setProjectPath(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link migrator.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see migrator.MigratorPackage#getMigrator_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

} // Migrator
