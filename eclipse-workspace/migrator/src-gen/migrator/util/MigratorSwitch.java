/**
 */
package migrator.util;

import migrator.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see migrator.MigratorPackage
 * @generated
 */
public class MigratorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MigratorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MigratorSwitch() {
		if (modelPackage == null) {
			modelPackage = MigratorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MigratorPackage.MBASE: {
			mBase mBase = (mBase) theEObject;
			T result = casemBase(mBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MigratorPackage.MIGRATOR: {
			Migrator migrator = (Migrator) theEObject;
			T result = caseMigrator(migrator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MigratorPackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MigratorPackage.ION_BUTTON: {
			IonButton ionButton = (IonButton) theEObject;
			T result = caseIonButton(ionButton);
			if (result == null)
				result = caseComponent(ionButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MigratorPackage.ION_VIEW_DID_LOAD: {
			IonViewDidLoad ionViewDidLoad = (IonViewDidLoad) theEObject;
			T result = caseIonViewDidLoad(ionViewDidLoad);
			if (result == null)
				result = caseComponent(ionViewDidLoad);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MigratorPackage.ION_LABEL: {
			IonLabel ionLabel = (IonLabel) theEObject;
			T result = caseIonLabel(ionLabel);
			if (result == null)
				result = caseComponent(ionLabel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MigratorPackage.IONIC_IMPORT: {
			IonicImport ionicImport = (IonicImport) theEObject;
			T result = caseIonicImport(ionicImport);
			if (result == null)
				result = caseComponent(ionicImport);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MigratorPackage.IONIC_PAGE_ANNOTATION: {
			IonicPageAnnotation ionicPageAnnotation = (IonicPageAnnotation) theEObject;
			T result = caseIonicPageAnnotation(ionicPageAnnotation);
			if (result == null)
				result = caseComponent(ionicPageAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MigratorPackage.ION_NAVBAR: {
			IonNavbar ionNavbar = (IonNavbar) theEObject;
			T result = caseIonNavbar(ionNavbar);
			if (result == null)
				result = caseComponent(ionNavbar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MigratorPackage.RENAME_FILES: {
			RenameFiles renameFiles = (RenameFiles) theEObject;
			T result = caseRenameFiles(renameFiles);
			if (result == null)
				result = caseComponent(renameFiles);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MigratorPackage.INJECTABLE_ANNOTATION: {
			InjectableAnnotation injectableAnnotation = (InjectableAnnotation) theEObject;
			T result = caseInjectableAnnotation(injectableAnnotation);
			if (result == null)
				result = caseComponent(injectableAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>mBase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>mBase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemBase(mBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Migrator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Migrator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMigrator(Migrator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ion Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ion Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIonButton(IonButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ion View Did Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ion View Did Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIonViewDidLoad(IonViewDidLoad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ion Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ion Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIonLabel(IonLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ionic Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ionic Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIonicImport(IonicImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ionic Page Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ionic Page Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIonicPageAnnotation(IonicPageAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ion Navbar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ion Navbar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIonNavbar(IonNavbar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Files</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Files</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameFiles(RenameFiles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Injectable Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Injectable Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInjectableAnnotation(InjectableAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MigratorSwitch
