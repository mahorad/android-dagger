package mahorad.com.android_dagger.di.module;

import dagger.Module;
import dagger.Provides;
import mahorad.com.android_dagger.di.scope.PerService;
import mahorad.com.android_dagger.util.O;

/**
 * Created by Mahan Rad on 2017-08-30.
 */

@Module
public class BaseServiceModule {

    @PerService
    @Provides
    public O providesO() {
        return new O();
    }

}