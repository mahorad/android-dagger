package mahorad.com.android_dagger.util;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by mahan on 2017-08-29.
 */

public class Y {

    private static final String TAG = "DaggerDependencyInjection";

    /**
     * @Inject-annotated Empty constructor indicates Dagger can create instances of it's class.
     */

    @Inject
    public Y() {}

    public void invoke() {
        Timber.tag(TAG).d("Y is instantiated");
        Timber.tag(TAG).d("===========================================================");
    }

}
