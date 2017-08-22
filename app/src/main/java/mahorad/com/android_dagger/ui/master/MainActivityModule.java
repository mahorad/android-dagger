package mahorad.com.android_dagger.ui.master;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import mahorad.com.android_dagger.di.scope.PerActivity;
import mahorad.com.android_dagger.util.MyMasterActivityDependency;

/**
 * Created by Mahan Rad on 2017-08-22.
 */

@Module
public class MainActivityModule {

    @Provides
    public Context context(MainActivity activity) {
        return activity.getBaseContext();
    }

    @PerActivity
    @Provides
    public MyMasterActivityDependency myActivityDependency() {
        return new MyMasterActivityDependency();
    }
}
