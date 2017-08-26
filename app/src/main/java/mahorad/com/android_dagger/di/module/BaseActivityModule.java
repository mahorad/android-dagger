package mahorad.com.android_dagger.di.module;

import dagger.Module;
import dagger.Provides;
import mahorad.com.android_dagger.util.MyCommonActivityDependency;

/**
 * Created by Mahan Rad on 2017-08-24.
 */

@Module
public abstract class BaseActivityModule {

    @Provides
    static MyCommonActivityDependency myCommonActivityDependency() {
        return new MyCommonActivityDependency();
    }

}
