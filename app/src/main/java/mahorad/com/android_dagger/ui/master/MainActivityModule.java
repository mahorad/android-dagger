package mahorad.com.android_dagger.ui.master;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import mahorad.com.android_dagger.di.module.BaseActivityModule;
import mahorad.com.android_dagger.di.scope.PerActivity;
import mahorad.com.android_dagger.util.MyMasterActivityDependency;

/**
 * Created by Mahan Rad on 2017-08-22.
 */

@Module(includes = BaseActivityModule.class)
public abstract class MainActivityModule {

    @Provides
    static Context context(MainActivity activity) {
        return activity.getBaseContext();
    }

    @Provides
    @PerActivity
    static MyMasterActivityDependency myActivityDependency() {
        return new MyMasterActivityDependency();
    }

}
