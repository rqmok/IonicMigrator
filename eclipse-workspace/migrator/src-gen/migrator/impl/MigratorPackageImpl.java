/**
 */
package migrator.impl;

import migrator.Component;
import migrator.InjectableAnnotation;
import migrator.IonButton;
import migrator.IonLabel;
import migrator.IonNavbar;
import migrator.IonViewDidLoad;
import migrator.IonicImport;
import migrator.IonicPageAnnotation;
import migrator.Migrator;
import migrator.MigratorFactory;
import migrator.MigratorPackage;
import migrator.RenameFiles;
import migrator.mBase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MigratorPackageImpl extends EPackageImpl implements MigratorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass migratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ionButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ionViewDidLoadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ionLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ionicImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ionicPageAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ionNavbarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renameFilesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass injectableAnnotationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see migrator.MigratorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MigratorPackageImpl() {
		super(eNS_URI, MigratorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MigratorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MigratorPackage init() {
		if (isInited)
			return (MigratorPackage) EPackage.Registry.INSTANCE.getEPackage(MigratorPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMigratorPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MigratorPackageImpl theMigratorPackage = registeredMigratorPackage instanceof MigratorPackageImpl
				? (MigratorPackageImpl) registeredMigratorPackage
				: new MigratorPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMigratorPackage.createPackageContents();

		// Initialize created meta-data
		theMigratorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMigratorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MigratorPackage.eNS_URI, theMigratorPackage);
		return theMigratorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getmBase() {
		return mBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getmBase_Migrators() {
		return (EReference) mBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMigrator() {
		return migratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMigrator_Name() {
		return (EAttribute) migratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMigrator_ProjectPath() {
		return (EAttribute) migratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMigrator_Components() {
		return (EReference) migratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Name() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_FilePath() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComponent__Migrate__String_String() {
		return componentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIonButton() {
		return ionButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIonButton__Migrate__String_String() {
		return ionButtonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIonViewDidLoad() {
		return ionViewDidLoadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIonViewDidLoad__Migrate__String_String() {
		return ionViewDidLoadEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIonLabel() {
		return ionLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIonLabel__Migrate__String_String() {
		return ionLabelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIonicImport() {
		return ionicImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIonicImport__Migrate__String_String() {
		return ionicImportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIonicPageAnnotation() {
		return ionicPageAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIonicPageAnnotation__Migrate__String_String() {
		return ionicPageAnnotationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIonNavbar() {
		return ionNavbarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIonNavbar__Migrate__String_String() {
		return ionNavbarEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRenameFiles() {
		return renameFilesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRenameFiles__Migrate__String_String() {
		return renameFilesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInjectableAnnotation() {
		return injectableAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInjectableAnnotation__Migrate__String_String() {
		return injectableAnnotationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MigratorFactory getMigratorFactory() {
		return (MigratorFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		mBaseEClass = createEClass(MBASE);
		createEReference(mBaseEClass, MBASE__MIGRATORS);

		migratorEClass = createEClass(MIGRATOR);
		createEAttribute(migratorEClass, MIGRATOR__NAME);
		createEAttribute(migratorEClass, MIGRATOR__PROJECT_PATH);
		createEReference(migratorEClass, MIGRATOR__COMPONENTS);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEAttribute(componentEClass, COMPONENT__FILE_PATH);
		createEOperation(componentEClass, COMPONENT___MIGRATE__STRING_STRING);

		ionButtonEClass = createEClass(ION_BUTTON);
		createEOperation(ionButtonEClass, ION_BUTTON___MIGRATE__STRING_STRING);

		ionViewDidLoadEClass = createEClass(ION_VIEW_DID_LOAD);
		createEOperation(ionViewDidLoadEClass, ION_VIEW_DID_LOAD___MIGRATE__STRING_STRING);

		ionLabelEClass = createEClass(ION_LABEL);
		createEOperation(ionLabelEClass, ION_LABEL___MIGRATE__STRING_STRING);

		ionicImportEClass = createEClass(IONIC_IMPORT);
		createEOperation(ionicImportEClass, IONIC_IMPORT___MIGRATE__STRING_STRING);

		ionicPageAnnotationEClass = createEClass(IONIC_PAGE_ANNOTATION);
		createEOperation(ionicPageAnnotationEClass, IONIC_PAGE_ANNOTATION___MIGRATE__STRING_STRING);

		ionNavbarEClass = createEClass(ION_NAVBAR);
		createEOperation(ionNavbarEClass, ION_NAVBAR___MIGRATE__STRING_STRING);

		renameFilesEClass = createEClass(RENAME_FILES);
		createEOperation(renameFilesEClass, RENAME_FILES___MIGRATE__STRING_STRING);

		injectableAnnotationEClass = createEClass(INJECTABLE_ANNOTATION);
		createEOperation(injectableAnnotationEClass, INJECTABLE_ANNOTATION___MIGRATE__STRING_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ionButtonEClass.getESuperTypes().add(this.getComponent());
		ionViewDidLoadEClass.getESuperTypes().add(this.getComponent());
		ionLabelEClass.getESuperTypes().add(this.getComponent());
		ionicImportEClass.getESuperTypes().add(this.getComponent());
		ionicPageAnnotationEClass.getESuperTypes().add(this.getComponent());
		ionNavbarEClass.getESuperTypes().add(this.getComponent());
		renameFilesEClass.getESuperTypes().add(this.getComponent());
		injectableAnnotationEClass.getESuperTypes().add(this.getComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(mBaseEClass, mBase.class, "mBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getmBase_Migrators(), this.getMigrator(), null, "migrators", null, 0, -1, mBase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(migratorEClass, Migrator.class, "Migrator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMigrator_Name(), ecorePackage.getEString(), "name", null, 0, 1, Migrator.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMigrator_ProjectPath(), ecorePackage.getEString(), "projectPath", null, 0, 1, Migrator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMigrator_Components(), this.getComponent(), null, "components", null, 0, -1, Migrator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_FilePath(), ecorePackage.getEString(), "filePath", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getComponent__Migrate__String_String(), ecorePackage.getEString(), "migrate", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "projectPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ionButtonEClass, IonButton.class, "IonButton", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIonButton__Migrate__String_String(), ecorePackage.getEString(), "migrate", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "projectPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ionViewDidLoadEClass, IonViewDidLoad.class, "IonViewDidLoad", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIonViewDidLoad__Migrate__String_String(), ecorePackage.getEString(), "migrate", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "projectPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ionLabelEClass, IonLabel.class, "IonLabel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIonLabel__Migrate__String_String(), ecorePackage.getEString(), "migrate", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "projectPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ionicImportEClass, IonicImport.class, "IonicImport", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIonicImport__Migrate__String_String(), ecorePackage.getEString(), "migrate", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "projectPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ionicPageAnnotationEClass, IonicPageAnnotation.class, "IonicPageAnnotation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIonicPageAnnotation__Migrate__String_String(), ecorePackage.getEString(), "migrate", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "projectPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ionNavbarEClass, IonNavbar.class, "IonNavbar", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIonNavbar__Migrate__String_String(), ecorePackage.getEString(), "migrate", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "projectPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(renameFilesEClass, RenameFiles.class, "RenameFiles", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getRenameFiles__Migrate__String_String(), ecorePackage.getEString(), "migrate", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "projectPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(injectableAnnotationEClass, InjectableAnnotation.class, "InjectableAnnotation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getInjectableAnnotation__Migrate__String_String(), ecorePackage.getEString(), "migrate", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "projectPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MigratorPackageImpl
