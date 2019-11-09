/**
 */
package migrator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see migrator.MigratorPackage
 * @generated
 */
public interface MigratorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MigratorFactory eINSTANCE = migrator.impl.MigratorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>mBase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>mBase</em>'.
	 * @generated
	 */
	mBase createmBase();

	/**
	 * Returns a new object of class '<em>Migrator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Migrator</em>'.
	 * @generated
	 */
	Migrator createMigrator();

	/**
	 * Returns a new object of class '<em>Ion Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ion Button</em>'.
	 * @generated
	 */
	IonButton createIonButton();

	/**
	 * Returns a new object of class '<em>Ion View Did Load</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ion View Did Load</em>'.
	 * @generated
	 */
	IonViewDidLoad createIonViewDidLoad();

	/**
	 * Returns a new object of class '<em>Ion Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ion Label</em>'.
	 * @generated
	 */
	IonLabel createIonLabel();

	/**
	 * Returns a new object of class '<em>Ionic Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ionic Import</em>'.
	 * @generated
	 */
	IonicImport createIonicImport();

	/**
	 * Returns a new object of class '<em>Ionic Page Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ionic Page Annotation</em>'.
	 * @generated
	 */
	IonicPageAnnotation createIonicPageAnnotation();

	/**
	 * Returns a new object of class '<em>Ion Navbar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ion Navbar</em>'.
	 * @generated
	 */
	IonNavbar createIonNavbar();

	/**
	 * Returns a new object of class '<em>Rename Files</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Files</em>'.
	 * @generated
	 */
	RenameFiles createRenameFiles();

	/**
	 * Returns a new object of class '<em>Injectable Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Injectable Annotation</em>'.
	 * @generated
	 */
	InjectableAnnotation createInjectableAnnotation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MigratorPackage getMigratorPackage();

} //MigratorFactory
