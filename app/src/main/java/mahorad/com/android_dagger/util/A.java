package mahorad.com.android_dagger.util;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by Mahan Rad on 2017-08-29.
 */

public class A {

    private static final String TAG = "DaggerDependencyInjection";

    /**
     * @Inject-annotated fields without @Inject-annotated constructor:
     * Dagger will inject those fields if required, but will not create new instances.
     */
    @Inject
    B b;

    @Inject
    public A() {}

    public void invoke() {
        Timber.tag(TAG).d("b   %s", System.identityHashCode(b));
        b.invoke();
    }

}
