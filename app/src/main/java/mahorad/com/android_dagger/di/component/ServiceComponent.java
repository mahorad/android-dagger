package mahorad.com.android_dagger.di.component;

import dagger.Component;
import mahorad.com.android_dagger.di.module.BaseServiceModule;
import mahorad.com.android_dagger.di.scope.PerService;
import mahorad.com.android_dagger.util.MyAppSingletonDependency;
import mahorad.com.android_dagger.util.O;

/**
 * Created by Mahan Rad on 2017-08-30.
 */

@PerService
@Component(modules = BaseServiceModule.class, dependencies = ApplicationComponent.class)
public interface ServiceComponent {

    void inject(O o);

}