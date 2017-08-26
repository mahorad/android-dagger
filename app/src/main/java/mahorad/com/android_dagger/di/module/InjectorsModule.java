package mahorad.com.android_dagger.di.module;

import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;
import mahorad.com.android_dagger.di.scope.PerActivity;
import mahorad.com.android_dagger.di.scope.PerService;
import mahorad.com.android_dagger.service.SomeService;
import mahorad.com.android_dagger.service.SomeServiceModule;
import mahorad.com.android_dagger.ui.detail.DetailActivity;
import mahorad.com.android_dagger.ui.detail.DetailActivityModule;
import mahorad.com.android_dagger.ui.master.MainActivity;
import mahorad.com.android_dagger.ui.master.MainActivityModule;

/**
 * Created by Mahan Rad on 2017-08-22.
 */

@Module(includes = AndroidInjectionModule.class)
public abstract class InjectorsModule {

    @PerActivity
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity masterActivityInjector();

    @PerActivity
    @ContributesAndroidInjector(modules = DetailActivityModule.class)
    abstract DetailActivity detailActivityInjector();

    @PerService
    @ContributesAndroidInjector(modules = SomeServiceModule.class)
    abstract SomeService someService();

}
