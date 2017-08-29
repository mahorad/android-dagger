package mahorad.com.android_dagger.util;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by Mahan Rad on 2017-08-29.
 */

public class A {

    private static final String TAG = "DaggerDependencyInjection";

    /**
     * @Inject-annotated fields with @Inject-annotated constructor indicate
     * Dagger can create new instances of the class and inject it's fields if required.
     */

    @Inject
    X x;

    @Inject
    public A() {}

    public void invoke() {
        Timber.tag(TAG).d("x   %s", System.identityHashCode(x));
        x.invoke();
    }

}
