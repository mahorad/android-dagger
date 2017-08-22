package mahorad.com.android_dagger.di.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import mahorad.com.android_dagger.di.scope.PerActivity;
import mahorad.com.android_dagger.ui.master.MainActivity;
import mahorad.com.android_dagger.ui.master.MainActivityModule;

/**
 * Created by Mahan Rad on 2017-08-22.
 */

@Module
public abstract class ActivityModule {

    @PerActivity
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivityInjector();

}
