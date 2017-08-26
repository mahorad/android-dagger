package mahorad.com.android_dagger.service;

import dagger.Module;
import dagger.Provides;
import mahorad.com.android_dagger.di.scope.PerService;
import mahorad.com.android_dagger.util.MyServiceDependency;

/**
 * Created by mahan on 2017-08-26.
 */

@Module
public class SomeServiceModule {

    @PerService
    @Provides
    static MyServiceDependency myServiceDependency() {
        return new MyServiceDependency();
    }

}
