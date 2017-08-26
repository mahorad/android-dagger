package mahorad.com.android_dagger.base;

import android.app.Service;

import dagger.android.AndroidInjection;

/**
 * Created by mahan on 2017-08-26.
 */

public abstract class BaseService extends Service {

    @Override
    public void onCreate() {
        AndroidInjection.inject(this);
        super.onCreate();
    }

}
