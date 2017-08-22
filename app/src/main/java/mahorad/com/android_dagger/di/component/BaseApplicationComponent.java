package mahorad.com.android_dagger.di.component;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import mahorad.com.android_dagger.base.BaseApplication;
import mahorad.com.android_dagger.di.module.ActivityModule;
import mahorad.com.android_dagger.di.module.ApplicationModule;

/**
 * Created by Mahan Rad on 2017-08-22.
 */

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        ActivityModule.class,
        ApplicationModule.class,
})
public interface BaseApplicationComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        BaseApplicationComponent build();
    }

    void inject(BaseApplication app);

}
