package mahorad.com.android_dagger.util;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by mahan on 2017-08-30.
 */

public class Q {

    private static final String TAG = "DaggerDependencyInjection";

    O o;

    @Inject
    public Q(O o) {
        this.o = o;
    }

    public void invoke() {
        Timber.tag(TAG).d("o   %s", System.identityHashCode(o));
    }

}
