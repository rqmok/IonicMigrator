/**
 */
package migrator.impl;

import java.util.Collection;

import migrator.Migrator;
import migrator.MigratorPackage;
import migrator.mBase;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>mBase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link migrator.impl.mBaseImpl#getMigrators <em>Migrators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class mBaseImpl extends MinimalEObjectImpl.Container implements mBase {
	/**
	 * The cached value of the '{@link #getMigrators() <em>Migrators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMigrators()
	 * @generated
	 * @ordered
	 */
	protected EList<Migrator> migrators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected mBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MigratorPackage.Literals.MBASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Migrator> getMigrators() {
		if (migrators == null) {
			migrators = new EObjectContainmentEList<Migrator>(Migrator.class, this, MigratorPackage.MBASE__MIGRATORS);
		}
		return migrators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MigratorPackage.MBASE__MIGRATORS:
			return ((InternalEList<?>) getMigrators()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MigratorPackage.MBASE__MIGRATORS:
			return getMigrators();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MigratorPackage.MBASE__MIGRATORS:
			getMigrators().clear();
			getMigrators().addAll((Collection<? extends Migrator>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MigratorPackage.MBASE__MIGRATORS:
			getMigrators().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MigratorPackage.MBASE__MIGRATORS:
			return migrators != null && !migrators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //mBaseImpl
