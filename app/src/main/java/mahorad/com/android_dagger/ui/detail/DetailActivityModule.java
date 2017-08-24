package mahorad.com.android_dagger.ui.detail;

import android.content.Context;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import mahorad.com.android_dagger.base.BaseActivity;
import mahorad.com.android_dagger.di.module.BaseActivityModule;
import mahorad.com.android_dagger.di.scope.PerActivity;
import mahorad.com.android_dagger.util.MyDetailActivityDependency;

/**
 * Created by Mahan Rad on 2017-08-22.
 */

@Module(includes = BaseActivityModule.class)
public abstract class DetailActivityModule {

//    @Provides
//    public Context context(DetailActivity activity) {
//        return activity.getBaseContext();
//    }

    @Provides
    @PerActivity
    static MyDetailActivityDependency myActivityDependency() {
        return new MyDetailActivityDependency();
    }

}
