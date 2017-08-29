package mahorad.com.android_dagger.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import mahorad.com.android_dagger.di.qualifier.ApplicationContext;
import mahorad.com.android_dagger.util.B;
import mahorad.com.android_dagger.util.MyAppSingletonDependency;
import mahorad.com.android_dagger.util.A;
import mahorad.com.android_dagger.util.C;

/**
 * Created by Mahan Rad on 2017-08-22.
 */

@Module
public abstract class ApplicationModule {

    @Binds
    @ApplicationContext
    abstract Context context(Application application);

    @Singleton
    @Provides
    static MyAppSingletonDependency myApplicationSingleton() {
        return new MyAppSingletonDependency();
    }

    @Singleton
    @Provides
    static A provideA() {
        return new A();
    }
}
