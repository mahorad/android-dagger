package mahorad.com.android_dagger.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import mahorad.com.android_dagger.di.qualifier.ApplicationContext;
import mahorad.com.android_dagger.util.MyApplicationSingleton;

/**
 * Created by Mahan Rad on 2017-08-22.
 */

@Module
public class ApplicationModule {

    @ApplicationContext
    @Provides
    public Context context(Application application) {
        return application.getBaseContext();
    }

    @Singleton
    @Provides
    public MyApplicationSingleton myApplicationSingleton() {
        return new MyApplicationSingleton();
    }


}
