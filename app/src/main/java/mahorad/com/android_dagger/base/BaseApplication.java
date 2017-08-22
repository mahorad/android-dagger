package mahorad.com.android_dagger.base;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import mahorad.com.android_dagger.di.component.DaggerBaseApplicationComponent;
import timber.log.Timber;

/**
 * Created by Mahan Rad on 2017-08-22.
 */

public class BaseApplication extends Application
        implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> activityInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        injectDependencies();

        Timber.plant(new Timber.DebugTree());
    }

    private void injectDependencies() {
        DaggerBaseApplicationComponent
                .builder()
                .application(this)
                .build()
                .inject(this);
    }
    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityInjector;
    }
}
