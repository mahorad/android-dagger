package mahorad.com.android_dagger.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import javax.inject.Inject;

import mahorad.com.android_dagger.base.BaseApplication;
import mahorad.com.android_dagger.base.BaseService;
import mahorad.com.android_dagger.di.qualifier.ApplicationContext;
import mahorad.com.android_dagger.util.A;
import mahorad.com.android_dagger.util.B;
import mahorad.com.android_dagger.util.C;
import mahorad.com.android_dagger.util.MyServiceDependency;
import mahorad.com.android_dagger.util.X;
import timber.log.Timber;

/**
 * Created by mahan on 2017-08-26.
 */

public class SomeService extends BaseService {

    private static final String TAG = "DaggerDependencyInjection";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @ApplicationContext
    @Inject
    Context applicationContext;

    @Inject
    MyServiceDependency myServiceDependency;

    @Inject
//    A object; // can instantiate A, can instantiate and inject the dependency
    B object; // cannot instantiate B, need to inject by requesting component
//    C object; // will inject constructor argument dependencies
//    X object; // can instantiate X, no injectable dependencies

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.tag(TAG).d("SERVICE: applicationContext   %d", applicationContext.hashCode());
        Timber.tag(TAG).d("SERVICE: serviceDependency    %d", myServiceDependency.hashCode());
        Timber.tag(TAG).d("===========================================================");
        object.invoke();
    }
}
