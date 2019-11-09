/**
 */
package migrator.util;

import migrator.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see migrator.MigratorPackage
 * @generated
 */
public class MigratorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MigratorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MigratorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MigratorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MigratorSwitch<Adapter> modelSwitch = new MigratorSwitch<Adapter>() {
		@Override
		public Adapter casemBase(mBase object) {
			return createmBaseAdapter();
		}

		@Override
		public Adapter caseMigrator(Migrator object) {
			return createMigratorAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseIonButton(IonButton object) {
			return createIonButtonAdapter();
		}

		@Override
		public Adapter caseIonViewDidLoad(IonViewDidLoad object) {
			return createIonViewDidLoadAdapter();
		}

		@Override
		public Adapter caseIonLabel(IonLabel object) {
			return createIonLabelAdapter();
		}

		@Override
		public Adapter caseIonicImport(IonicImport object) {
			return createIonicImportAdapter();
		}

		@Override
		public Adapter caseIonicPageAnnotation(IonicPageAnnotation object) {
			return createIonicPageAnnotationAdapter();
		}

		@Override
		public Adapter caseIonNavbar(IonNavbar object) {
			return createIonNavbarAdapter();
		}

		@Override
		public Adapter caseRenameFiles(RenameFiles object) {
			return createRenameFilesAdapter();
		}

		@Override
		public Adapter caseInjectableAnnotation(InjectableAnnotation object) {
			return createInjectableAnnotationAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link migrator.mBase <em>mBase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see migrator.mBase
	 * @generated
	 */
	public Adapter createmBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link migrator.Migrator <em>Migrator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see migrator.Migrator
	 * @generated
	 */
	public Adapter createMigratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link migrator.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see migrator.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link migrator.IonButton <em>Ion Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see migrator.IonButton
	 * @generated
	 */
	public Adapter createIonButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link migrator.IonViewDidLoad <em>Ion View Did Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see migrator.IonViewDidLoad
	 * @generated
	 */
	public Adapter createIonViewDidLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link migrator.IonLabel <em>Ion Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see migrator.IonLabel
	 * @generated
	 */
	public Adapter createIonLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link migrator.IonicImport <em>Ionic Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see migrator.IonicImport
	 * @generated
	 */
	public Adapter createIonicImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link migrator.IonicPageAnnotation <em>Ionic Page Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see migrator.IonicPageAnnotation
	 * @generated
	 */
	public Adapter createIonicPageAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link migrator.IonNavbar <em>Ion Navbar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see migrator.IonNavbar
	 * @generated
	 */
	public Adapter createIonNavbarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link migrator.RenameFiles <em>Rename Files</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see migrator.RenameFiles
	 * @generated
	 */
	public Adapter createRenameFilesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link migrator.InjectableAnnotation <em>Injectable Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see migrator.InjectableAnnotation
	 * @generated
	 */
	public Adapter createInjectableAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MigratorAdapterFactory
