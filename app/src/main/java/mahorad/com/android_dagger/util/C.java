package mahorad.com.android_dagger.util;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by Mahan Rad on 2017-08-29.
 */

public class C {

    private static final String TAG = "DaggerDependencyInjection";

    /**
     * @Inject-annotated Non-Empty constructors indicate Dagger shall try to provide
     * the arguments and pass them to constructor.
     */

    X x;
    Y y;

    @Inject
    public C(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public void invoke() {
        Timber.tag(TAG).d("x   %s", System.identityHashCode(x));
        Timber.tag(TAG).d("y   %s", System.identityHashCode(y));
        Timber.tag(TAG).d("===========================================================");
    }

}
