package mahorad.com.android_dagger.util;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by mahan on 2017-08-30.
 */

public class O {

    private static final String TAG = "DaggerDependencyInjection";

    @Inject
    Q q;

    @Inject
    public O() {}

    public void invoke() {
        Timber.tag(TAG).d("q   %s", System.identityHashCode(q));
        q.invoke();
    }

}
