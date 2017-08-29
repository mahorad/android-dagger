package mahorad.com.android_dagger.util;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by mahan on 2017-08-29.
 */

public class X {

    private static final String TAG = "DaggerDependencyInjection";

    /**
     * @Inject-annotated Empty constructor indicates Dagger can create instances of it's class.
     */

    @Inject
    public X() {}

    public void invoke() {
        Timber.tag(TAG).d("X is instantiated");
        Timber.tag(TAG).d("===========================================================");
    }

}
