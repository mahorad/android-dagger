package mahorad.com.android_dagger.base;

import android.app.Activity;
import android.app.Application;
import android.app.Service;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.HasServiceInjector;
import mahorad.com.android_dagger.di.component.ApplicationComponent;
import mahorad.com.android_dagger.di.component.DaggerApplicationComponent;
import timber.log.Timber;

/**
 * Created by Mahan Rad on 2017-08-22.
 */

public class BaseApplication extends Application
        implements HasActivityInjector, HasServiceInjector {

    @Inject
    DispatchingAndroidInjector<Activity> activityInjector;

    @Inject
    DispatchingAndroidInjector<Service> serviceInjector;

    private static ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        buildApplicationComponent();
        injectDependencies();
        Timber.plant(new Timber.DebugTree());
    }

    private void injectDependencies() {
        component.inject(this);
    }

    private void buildApplicationComponent() {
        component = DaggerApplicationComponent
                .builder()
                .application(this)
                .build();
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityInjector;
    }

    @Override
    public AndroidInjector<Service> serviceInjector() {
        return serviceInjector;
    }

    public static ApplicationComponent component() {
        return component;
    }
}
