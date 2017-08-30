package mahorad.com.android_dagger.di.component;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import mahorad.com.android_dagger.base.BaseApplication;
import mahorad.com.android_dagger.di.module.ApplicationModule;
import mahorad.com.android_dagger.di.module.InjectorsModule;
import mahorad.com.android_dagger.util.B;

/**
 * Created by Mahan Rad on 2017-08-22.
 */

@Singleton
@Component(modules = { ApplicationModule.class, InjectorsModule.class, })
public interface ApplicationComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        ApplicationComponent build();
    }

    void inject(BaseApplication baseApplication);

    void inject(B b);

}
