package mahorad.com.android_dagger.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import mahorad.com.android_dagger.util.MyApplicationSingleton;

/**
 * Created by a239453 on 2017-08-22.
 */

@Module
public class ApplicationModule {

    @Singleton
    @Provides
    public MyApplicationSingleton myApplicationSingleton() {
        return new MyApplicationSingleton();
    }


}
