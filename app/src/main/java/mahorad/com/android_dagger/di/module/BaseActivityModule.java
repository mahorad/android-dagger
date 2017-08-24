package mahorad.com.android_dagger.di.module;

import android.app.Activity;
import android.content.Context;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import mahorad.com.android_dagger.di.scope.PerActivity;

/**
 * Created by Mahan Rad on 2017-08-24.
 */

@Module
public abstract class BaseActivityModule {

    @Provides
    @PerActivity
    static Context context(Activity activity) {
        return activity;
    }

}
