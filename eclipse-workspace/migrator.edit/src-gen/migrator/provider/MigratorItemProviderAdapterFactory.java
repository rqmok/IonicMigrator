/**
 */
package migrator.provider;

import java.util.ArrayList;
import java.util.Collection;

import migrator.util.MigratorAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MigratorItemProviderAdapterFactory extends MigratorAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MigratorItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link migrator.mBase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected mBaseItemProvider mBaseItemProvider;

	/**
	 * This creates an adapter for a {@link migrator.mBase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createmBaseAdapter() {
		if (mBaseItemProvider == null) {
			mBaseItemProvider = new mBaseItemProvider(this);
		}

		return mBaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link migrator.Migrator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MigratorItemProvider migratorItemProvider;

	/**
	 * This creates an adapter for a {@link migrator.Migrator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMigratorAdapter() {
		if (migratorItemProvider == null) {
			migratorItemProvider = new MigratorItemProvider(this);
		}

		return migratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link migrator.IonButton} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IonButtonItemProvider ionButtonItemProvider;

	/**
	 * This creates an adapter for a {@link migrator.IonButton}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIonButtonAdapter() {
		if (ionButtonItemProvider == null) {
			ionButtonItemProvider = new IonButtonItemProvider(this);
		}

		return ionButtonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link migrator.IonViewDidLoad} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IonViewDidLoadItemProvider ionViewDidLoadItemProvider;

	/**
	 * This creates an adapter for a {@link migrator.IonViewDidLoad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIonViewDidLoadAdapter() {
		if (ionViewDidLoadItemProvider == null) {
			ionViewDidLoadItemProvider = new IonViewDidLoadItemProvider(this);
		}

		return ionViewDidLoadItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link migrator.IonLabel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IonLabelItemProvider ionLabelItemProvider;

	/**
	 * This creates an adapter for a {@link migrator.IonLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIonLabelAdapter() {
		if (ionLabelItemProvider == null) {
			ionLabelItemProvider = new IonLabelItemProvider(this);
		}

		return ionLabelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link migrator.IonicImport} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IonicImportItemProvider ionicImportItemProvider;

	/**
	 * This creates an adapter for a {@link migrator.IonicImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIonicImportAdapter() {
		if (ionicImportItemProvider == null) {
			ionicImportItemProvider = new IonicImportItemProvider(this);
		}

		return ionicImportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link migrator.IonicPageAnnotation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IonicPageAnnotationItemProvider ionicPageAnnotationItemProvider;

	/**
	 * This creates an adapter for a {@link migrator.IonicPageAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIonicPageAnnotationAdapter() {
		if (ionicPageAnnotationItemProvider == null) {
			ionicPageAnnotationItemProvider = new IonicPageAnnotationItemProvider(this);
		}

		return ionicPageAnnotationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link migrator.IonNavbar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IonNavbarItemProvider ionNavbarItemProvider;

	/**
	 * This creates an adapter for a {@link migrator.IonNavbar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIonNavbarAdapter() {
		if (ionNavbarItemProvider == null) {
			ionNavbarItemProvider = new IonNavbarItemProvider(this);
		}

		return ionNavbarItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link migrator.RenameFiles} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenameFilesItemProvider renameFilesItemProvider;

	/**
	 * This creates an adapter for a {@link migrator.RenameFiles}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRenameFilesAdapter() {
		if (renameFilesItemProvider == null) {
			renameFilesItemProvider = new RenameFilesItemProvider(this);
		}

		return renameFilesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link migrator.InjectableAnnotation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InjectableAnnotationItemProvider injectableAnnotationItemProvider;

	/**
	 * This creates an adapter for a {@link migrator.InjectableAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInjectableAnnotationAdapter() {
		if (injectableAnnotationItemProvider == null) {
			injectableAnnotationItemProvider = new InjectableAnnotationItemProvider(this);
		}

		return injectableAnnotationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (mBaseItemProvider != null)
			mBaseItemProvider.dispose();
		if (migratorItemProvider != null)
			migratorItemProvider.dispose();
		if (ionButtonItemProvider != null)
			ionButtonItemProvider.dispose();
		if (ionViewDidLoadItemProvider != null)
			ionViewDidLoadItemProvider.dispose();
		if (ionLabelItemProvider != null)
			ionLabelItemProvider.dispose();
		if (ionicImportItemProvider != null)
			ionicImportItemProvider.dispose();
		if (ionicPageAnnotationItemProvider != null)
			ionicPageAnnotationItemProvider.dispose();
		if (ionNavbarItemProvider != null)
			ionNavbarItemProvider.dispose();
		if (renameFilesItemProvider != null)
			renameFilesItemProvider.dispose();
		if (injectableAnnotationItemProvider != null)
			injectableAnnotationItemProvider.dispose();
	}

}