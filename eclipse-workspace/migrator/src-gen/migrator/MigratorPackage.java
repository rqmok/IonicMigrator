/**
 */
package migrator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see migrator.MigratorFactory
 * @model kind="package"
 * @generated
 */
public interface MigratorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "migrator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fit4003.org/migrator";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "migrator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MigratorPackage eINSTANCE = migrator.impl.MigratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link migrator.impl.mBaseImpl <em>mBase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see migrator.impl.mBaseImpl
	 * @see migrator.impl.MigratorPackageImpl#getmBase()
	 * @generated
	 */
	int MBASE = 0;

	/**
	 * The feature id for the '<em><b>Migrators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBASE__MIGRATORS = 0;

	/**
	 * The number of structural features of the '<em>mBase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>mBase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link migrator.impl.MigratorImpl <em>Migrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see migrator.impl.MigratorImpl
	 * @see migrator.impl.MigratorPackageImpl#getMigrator()
	 * @generated
	 */
	int MIGRATOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Project Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATOR__PROJECT_PATH = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATOR__COMPONENTS = 2;

	/**
	 * The number of structural features of the '<em>Migrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Migrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link migrator.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see migrator.impl.ComponentImpl
	 * @see migrator.impl.MigratorPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FILE_PATH = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Migrate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___MIGRATE__STRING_STRING = 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link migrator.impl.IonButtonImpl <em>Ion Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see migrator.impl.IonButtonImpl
	 * @see migrator.impl.MigratorPackageImpl#getIonButton()
	 * @generated
	 */
	int ION_BUTTON = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_BUTTON__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_BUTTON__FILE_PATH = COMPONENT__FILE_PATH;

	/**
	 * The number of structural features of the '<em>Ion Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_BUTTON_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Migrate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_BUTTON___MIGRATE__STRING_STRING = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ion Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_BUTTON_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link migrator.impl.IonViewDidLoadImpl <em>Ion View Did Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see migrator.impl.IonViewDidLoadImpl
	 * @see migrator.impl.MigratorPackageImpl#getIonViewDidLoad()
	 * @generated
	 */
	int ION_VIEW_DID_LOAD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_VIEW_DID_LOAD__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_VIEW_DID_LOAD__FILE_PATH = COMPONENT__FILE_PATH;

	/**
	 * The number of structural features of the '<em>Ion View Did Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_VIEW_DID_LOAD_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Migrate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_VIEW_DID_LOAD___MIGRATE__STRING_STRING = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ion View Did Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_VIEW_DID_LOAD_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link migrator.impl.IonLabelImpl <em>Ion Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see migrator.impl.IonLabelImpl
	 * @see migrator.impl.MigratorPackageImpl#getIonLabel()
	 * @generated
	 */
	int ION_LABEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_LABEL__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_LABEL__FILE_PATH = COMPONENT__FILE_PATH;

	/**
	 * The number of structural features of the '<em>Ion Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_LABEL_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Migrate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_LABEL___MIGRATE__STRING_STRING = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ion Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_LABEL_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link migrator.impl.IonicImportImpl <em>Ionic Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see migrator.impl.IonicImportImpl
	 * @see migrator.impl.MigratorPackageImpl#getIonicImport()
	 * @generated
	 */
	int IONIC_IMPORT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IONIC_IMPORT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IONIC_IMPORT__FILE_PATH = COMPONENT__FILE_PATH;

	/**
	 * The number of structural features of the '<em>Ionic Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IONIC_IMPORT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Migrate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IONIC_IMPORT___MIGRATE__STRING_STRING = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ionic Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IONIC_IMPORT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link migrator.impl.IonicPageAnnotationImpl <em>Ionic Page Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see migrator.impl.IonicPageAnnotationImpl
	 * @see migrator.impl.MigratorPackageImpl#getIonicPageAnnotation()
	 * @generated
	 */
	int IONIC_PAGE_ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IONIC_PAGE_ANNOTATION__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IONIC_PAGE_ANNOTATION__FILE_PATH = COMPONENT__FILE_PATH;

	/**
	 * The number of structural features of the '<em>Ionic Page Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IONIC_PAGE_ANNOTATION_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Migrate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IONIC_PAGE_ANNOTATION___MIGRATE__STRING_STRING = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ionic Page Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IONIC_PAGE_ANNOTATION_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link migrator.impl.IonNavbarImpl <em>Ion Navbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see migrator.impl.IonNavbarImpl
	 * @see migrator.impl.MigratorPackageImpl#getIonNavbar()
	 * @generated
	 */
	int ION_NAVBAR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_NAVBAR__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_NAVBAR__FILE_PATH = COMPONENT__FILE_PATH;

	/**
	 * The number of structural features of the '<em>Ion Navbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_NAVBAR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Migrate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_NAVBAR___MIGRATE__STRING_STRING = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ion Navbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ION_NAVBAR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link migrator.impl.RenameFilesImpl <em>Rename Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see migrator.impl.RenameFilesImpl
	 * @see migrator.impl.MigratorPackageImpl#getRenameFiles()
	 * @generated
	 */
	int RENAME_FILES = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_FILES__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_FILES__FILE_PATH = COMPONENT__FILE_PATH;

	/**
	 * The number of structural features of the '<em>Rename Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_FILES_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Migrate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_FILES___MIGRATE__STRING_STRING = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rename Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_FILES_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link migrator.impl.InjectableAnnotationImpl <em>Injectable Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see migrator.impl.InjectableAnnotationImpl
	 * @see migrator.impl.MigratorPackageImpl#getInjectableAnnotation()
	 * @generated
	 */
	int INJECTABLE_ANNOTATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTABLE_ANNOTATION__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTABLE_ANNOTATION__FILE_PATH = COMPONENT__FILE_PATH;

	/**
	 * The number of structural features of the '<em>Injectable Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTABLE_ANNOTATION_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Migrate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTABLE_ANNOTATION___MIGRATE__STRING_STRING = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Injectable Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTABLE_ANNOTATION_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link migrator.mBase <em>mBase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>mBase</em>'.
	 * @see migrator.mBase
	 * @generated
	 */
	EClass getmBase();

	/**
	 * Returns the meta object for the containment reference list '{@link migrator.mBase#getMigrators <em>Migrators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Migrators</em>'.
	 * @see migrator.mBase#getMigrators()
	 * @see #getmBase()
	 * @generated
	 */
	EReference getmBase_Migrators();

	/**
	 * Returns the meta object for class '{@link migrator.Migrator <em>Migrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Migrator</em>'.
	 * @see migrator.Migrator
	 * @generated
	 */
	EClass getMigrator();

	/**
	 * Returns the meta object for the attribute '{@link migrator.Migrator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see migrator.Migrator#getName()
	 * @see #getMigrator()
	 * @generated
	 */
	EAttribute getMigrator_Name();

	/**
	 * Returns the meta object for the attribute '{@link migrator.Migrator#getProjectPath <em>Project Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Path</em>'.
	 * @see migrator.Migrator#getProjectPath()
	 * @see #getMigrator()
	 * @generated
	 */
	EAttribute getMigrator_ProjectPath();

	/**
	 * Returns the meta object for the containment reference list '{@link migrator.Migrator#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see migrator.Migrator#getComponents()
	 * @see #getMigrator()
	 * @generated
	 */
	EReference getMigrator_Components();

	/**
	 * Returns the meta object for class '{@link migrator.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see migrator.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link migrator.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see migrator.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link migrator.Component#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see migrator.Component#getFilePath()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_FilePath();

	/**
	 * Returns the meta object for the '{@link migrator.Component#migrate(java.lang.String, java.lang.String) <em>Migrate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Migrate</em>' operation.
	 * @see migrator.Component#migrate(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getComponent__Migrate__String_String();

	/**
	 * Returns the meta object for class '{@link migrator.IonButton <em>Ion Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ion Button</em>'.
	 * @see migrator.IonButton
	 * @generated
	 */
	EClass getIonButton();

	/**
	 * Returns the meta object for the '{@link migrator.IonButton#migrate(java.lang.String, java.lang.String) <em>Migrate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Migrate</em>' operation.
	 * @see migrator.IonButton#migrate(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIonButton__Migrate__String_String();

	/**
	 * Returns the meta object for class '{@link migrator.IonViewDidLoad <em>Ion View Did Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ion View Did Load</em>'.
	 * @see migrator.IonViewDidLoad
	 * @generated
	 */
	EClass getIonViewDidLoad();

	/**
	 * Returns the meta object for the '{@link migrator.IonViewDidLoad#migrate(java.lang.String, java.lang.String) <em>Migrate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Migrate</em>' operation.
	 * @see migrator.IonViewDidLoad#migrate(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIonViewDidLoad__Migrate__String_String();

	/**
	 * Returns the meta object for class '{@link migrator.IonLabel <em>Ion Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ion Label</em>'.
	 * @see migrator.IonLabel
	 * @generated
	 */
	EClass getIonLabel();

	/**
	 * Returns the meta object for the '{@link migrator.IonLabel#migrate(java.lang.String, java.lang.String) <em>Migrate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Migrate</em>' operation.
	 * @see migrator.IonLabel#migrate(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIonLabel__Migrate__String_String();

	/**
	 * Returns the meta object for class '{@link migrator.IonicImport <em>Ionic Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ionic Import</em>'.
	 * @see migrator.IonicImport
	 * @generated
	 */
	EClass getIonicImport();

	/**
	 * Returns the meta object for the '{@link migrator.IonicImport#migrate(java.lang.String, java.lang.String) <em>Migrate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Migrate</em>' operation.
	 * @see migrator.IonicImport#migrate(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIonicImport__Migrate__String_String();

	/**
	 * Returns the meta object for class '{@link migrator.IonicPageAnnotation <em>Ionic Page Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ionic Page Annotation</em>'.
	 * @see migrator.IonicPageAnnotation
	 * @generated
	 */
	EClass getIonicPageAnnotation();

	/**
	 * Returns the meta object for the '{@link migrator.IonicPageAnnotation#migrate(java.lang.String, java.lang.String) <em>Migrate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Migrate</em>' operation.
	 * @see migrator.IonicPageAnnotation#migrate(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIonicPageAnnotation__Migrate__String_String();

	/**
	 * Returns the meta object for class '{@link migrator.IonNavbar <em>Ion Navbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ion Navbar</em>'.
	 * @see migrator.IonNavbar
	 * @generated
	 */
	EClass getIonNavbar();

	/**
	 * Returns the meta object for the '{@link migrator.IonNavbar#migrate(java.lang.String, java.lang.String) <em>Migrate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Migrate</em>' operation.
	 * @see migrator.IonNavbar#migrate(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIonNavbar__Migrate__String_String();

	/**
	 * Returns the meta object for class '{@link migrator.RenameFiles <em>Rename Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Files</em>'.
	 * @see migrator.RenameFiles
	 * @generated
	 */
	EClass getRenameFiles();

	/**
	 * Returns the meta object for the '{@link migrator.RenameFiles#migrate(java.lang.String, java.lang.String) <em>Migrate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Migrate</em>' operation.
	 * @see migrator.RenameFiles#migrate(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getRenameFiles__Migrate__String_String();

	/**
	 * Returns the meta object for class '{@link migrator.InjectableAnnotation <em>Injectable Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Injectable Annotation</em>'.
	 * @see migrator.InjectableAnnotation
	 * @generated
	 */
	EClass getInjectableAnnotation();

	/**
	 * Returns the meta object for the '{@link migrator.InjectableAnnotation#migrate(java.lang.String, java.lang.String) <em>Migrate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Migrate</em>' operation.
	 * @see migrator.InjectableAnnotation#migrate(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getInjectableAnnotation__Migrate__String_String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MigratorFactory getMigratorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link migrator.impl.mBaseImpl <em>mBase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see migrator.impl.mBaseImpl
		 * @see migrator.impl.MigratorPackageImpl#getmBase()
		 * @generated
		 */
		EClass MBASE = eINSTANCE.getmBase();

		/**
		 * The meta object literal for the '<em><b>Migrators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBASE__MIGRATORS = eINSTANCE.getmBase_Migrators();

		/**
		 * The meta object literal for the '{@link migrator.impl.MigratorImpl <em>Migrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see migrator.impl.MigratorImpl
		 * @see migrator.impl.MigratorPackageImpl#getMigrator()
		 * @generated
		 */
		EClass MIGRATOR = eINSTANCE.getMigrator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATOR__NAME = eINSTANCE.getMigrator_Name();

		/**
		 * The meta object literal for the '<em><b>Project Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATOR__PROJECT_PATH = eINSTANCE.getMigrator_ProjectPath();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATOR__COMPONENTS = eINSTANCE.getMigrator_Components();

		/**
		 * The meta object literal for the '{@link migrator.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see migrator.impl.ComponentImpl
		 * @see migrator.impl.MigratorPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__FILE_PATH = eINSTANCE.getComponent_FilePath();

		/**
		 * The meta object literal for the '<em><b>Migrate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___MIGRATE__STRING_STRING = eINSTANCE.getComponent__Migrate__String_String();

		/**
		 * The meta object literal for the '{@link migrator.impl.IonButtonImpl <em>Ion Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see migrator.impl.IonButtonImpl
		 * @see migrator.impl.MigratorPackageImpl#getIonButton()
		 * @generated
		 */
		EClass ION_BUTTON = eINSTANCE.getIonButton();

		/**
		 * The meta object literal for the '<em><b>Migrate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ION_BUTTON___MIGRATE__STRING_STRING = eINSTANCE.getIonButton__Migrate__String_String();

		/**
		 * The meta object literal for the '{@link migrator.impl.IonViewDidLoadImpl <em>Ion View Did Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see migrator.impl.IonViewDidLoadImpl
		 * @see migrator.impl.MigratorPackageImpl#getIonViewDidLoad()
		 * @generated
		 */
		EClass ION_VIEW_DID_LOAD = eINSTANCE.getIonViewDidLoad();

		/**
		 * The meta object literal for the '<em><b>Migrate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ION_VIEW_DID_LOAD___MIGRATE__STRING_STRING = eINSTANCE.getIonViewDidLoad__Migrate__String_String();

		/**
		 * The meta object literal for the '{@link migrator.impl.IonLabelImpl <em>Ion Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see migrator.impl.IonLabelImpl
		 * @see migrator.impl.MigratorPackageImpl#getIonLabel()
		 * @generated
		 */
		EClass ION_LABEL = eINSTANCE.getIonLabel();

		/**
		 * The meta object literal for the '<em><b>Migrate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ION_LABEL___MIGRATE__STRING_STRING = eINSTANCE.getIonLabel__Migrate__String_String();

		/**
		 * The meta object literal for the '{@link migrator.impl.IonicImportImpl <em>Ionic Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see migrator.impl.IonicImportImpl
		 * @see migrator.impl.MigratorPackageImpl#getIonicImport()
		 * @generated
		 */
		EClass IONIC_IMPORT = eINSTANCE.getIonicImport();

		/**
		 * The meta object literal for the '<em><b>Migrate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IONIC_IMPORT___MIGRATE__STRING_STRING = eINSTANCE.getIonicImport__Migrate__String_String();

		/**
		 * The meta object literal for the '{@link migrator.impl.IonicPageAnnotationImpl <em>Ionic Page Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see migrator.impl.IonicPageAnnotationImpl
		 * @see migrator.impl.MigratorPackageImpl#getIonicPageAnnotation()
		 * @generated
		 */
		EClass IONIC_PAGE_ANNOTATION = eINSTANCE.getIonicPageAnnotation();

		/**
		 * The meta object literal for the '<em><b>Migrate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IONIC_PAGE_ANNOTATION___MIGRATE__STRING_STRING = eINSTANCE
				.getIonicPageAnnotation__Migrate__String_String();

		/**
		 * The meta object literal for the '{@link migrator.impl.IonNavbarImpl <em>Ion Navbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see migrator.impl.IonNavbarImpl
		 * @see migrator.impl.MigratorPackageImpl#getIonNavbar()
		 * @generated
		 */
		EClass ION_NAVBAR = eINSTANCE.getIonNavbar();

		/**
		 * The meta object literal for the '<em><b>Migrate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ION_NAVBAR___MIGRATE__STRING_STRING = eINSTANCE.getIonNavbar__Migrate__String_String();

		/**
		 * The meta object literal for the '{@link migrator.impl.RenameFilesImpl <em>Rename Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see migrator.impl.RenameFilesImpl
		 * @see migrator.impl.MigratorPackageImpl#getRenameFiles()
		 * @generated
		 */
		EClass RENAME_FILES = eINSTANCE.getRenameFiles();

		/**
		 * The meta object literal for the '<em><b>Migrate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RENAME_FILES___MIGRATE__STRING_STRING = eINSTANCE.getRenameFiles__Migrate__String_String();

		/**
		 * The meta object literal for the '{@link migrator.impl.InjectableAnnotationImpl <em>Injectable Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see migrator.impl.InjectableAnnotationImpl
		 * @see migrator.impl.MigratorPackageImpl#getInjectableAnnotation()
		 * @generated
		 */
		EClass INJECTABLE_ANNOTATION = eINSTANCE.getInjectableAnnotation();

		/**
		 * The meta object literal for the '<em><b>Migrate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INJECTABLE_ANNOTATION___MIGRATE__STRING_STRING = eINSTANCE
				.getInjectableAnnotation__Migrate__String_String();

	}

} //MigratorPackage
