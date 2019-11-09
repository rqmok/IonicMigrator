/**
 */
package migrator.impl;

import migrator.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MigratorFactoryImpl extends EFactoryImpl implements MigratorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MigratorFactory init() {
		try {
			MigratorFactory theMigratorFactory = (MigratorFactory) EPackage.Registry.INSTANCE
					.getEFactory(MigratorPackage.eNS_URI);
			if (theMigratorFactory != null) {
				return theMigratorFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MigratorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MigratorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MigratorPackage.MBASE:
			return createmBase();
		case MigratorPackage.MIGRATOR:
			return createMigrator();
		case MigratorPackage.ION_BUTTON:
			return createIonButton();
		case MigratorPackage.ION_VIEW_DID_LOAD:
			return createIonViewDidLoad();
		case MigratorPackage.ION_LABEL:
			return createIonLabel();
		case MigratorPackage.IONIC_IMPORT:
			return createIonicImport();
		case MigratorPackage.IONIC_PAGE_ANNOTATION:
			return createIonicPageAnnotation();
		case MigratorPackage.ION_NAVBAR:
			return createIonNavbar();
		case MigratorPackage.RENAME_FILES:
			return createRenameFiles();
		case MigratorPackage.INJECTABLE_ANNOTATION:
			return createInjectableAnnotation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public mBase createmBase() {
		mBaseImpl mBase = new mBaseImpl();
		return mBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Migrator createMigrator() {
		MigratorImpl migrator = new MigratorImpl();
		return migrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IonButton createIonButton() {
		IonButtonImpl ionButton = new IonButtonImpl();
		return ionButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IonViewDidLoad createIonViewDidLoad() {
		IonViewDidLoadImpl ionViewDidLoad = new IonViewDidLoadImpl();
		return ionViewDidLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IonLabel createIonLabel() {
		IonLabelImpl ionLabel = new IonLabelImpl();
		return ionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IonicImport createIonicImport() {
		IonicImportImpl ionicImport = new IonicImportImpl();
		return ionicImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IonicPageAnnotation createIonicPageAnnotation() {
		IonicPageAnnotationImpl ionicPageAnnotation = new IonicPageAnnotationImpl();
		return ionicPageAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IonNavbar createIonNavbar() {
		IonNavbarImpl ionNavbar = new IonNavbarImpl();
		return ionNavbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenameFiles createRenameFiles() {
		RenameFilesImpl renameFiles = new RenameFilesImpl();
		return renameFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InjectableAnnotation createInjectableAnnotation() {
		InjectableAnnotationImpl injectableAnnotation = new InjectableAnnotationImpl();
		return injectableAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MigratorPackage getMigratorPackage() {
		return (MigratorPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MigratorPackage getPackage() {
		return MigratorPackage.eINSTANCE;
	}

} //MigratorFactoryImpl
