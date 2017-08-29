package mahorad.com.android_dagger.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import javax.inject.Inject;

import mahorad.com.android_dagger.base.BaseService;
import mahorad.com.android_dagger.di.qualifier.ApplicationContext;
import mahorad.com.android_dagger.util.MyServiceDependency;
import mahorad.com.android_dagger.util.A;
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
    A a;

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.tag(TAG).d("SERVICE: applicationContext   %d", applicationContext.hashCode());
        Timber.tag(TAG).d("SERVICE: serviceDependency    %d", myServiceDependency.hashCode());
        Timber.tag(TAG).d("===========================================================");
        a.invoke();
    }
}
