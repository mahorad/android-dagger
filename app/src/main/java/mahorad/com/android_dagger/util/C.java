package mahorad.com.android_dagger.util;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by Mahan Rad on 2017-08-29.
 */

public class C {

    private static final String TAG = "DaggerDependencyInjection";

    @Inject
    public C() {}

    public void invoke() {
        Timber.tag(TAG).d("singleton C is instantiated");
        Timber.tag(TAG).d("===========================================================");
    }

}
