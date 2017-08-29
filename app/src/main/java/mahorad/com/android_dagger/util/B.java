package mahorad.com.android_dagger.util;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by Mahan Rad on 2017-08-29.
 */

public class B {

    private static final String TAG = "DaggerDependencyInjection";

    @Inject
    C c;

    @Inject
    public B() {}

    public void invoke() {
        Timber.tag(TAG).d("c   %s", System.identityHashCode(c));
        c.invoke();
    }

}
