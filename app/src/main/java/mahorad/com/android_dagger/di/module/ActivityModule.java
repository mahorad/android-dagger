package mahorad.com.android_dagger.di.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import mahorad.com.android_dagger.ui.MainActivity;
import mahorad.com.android_dagger.ui.MainActivityModule;

/**
 * Created by Mahan Rad on 2017-08-22.
 */

@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivityInjector();

}
