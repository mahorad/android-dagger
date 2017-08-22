package mahorad.com.android_dagger.ui;

import dagger.Module;
import dagger.Provides;
import mahorad.com.android_dagger.di.scope.PerActivity;
import mahorad.com.android_dagger.util.MyActivityDependency;

/**
 * Created by Mahan Rad on 2017-08-22.
 */

@Module
public class MainActivityModule {

    @PerActivity
    @Provides
    public MyActivityDependency myActivityDependency() {
        return new MyActivityDependency();
    }
}
