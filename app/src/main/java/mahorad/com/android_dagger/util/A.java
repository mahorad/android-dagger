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

    /**
     * @Inject-annotated fields without @Inject-annotated constructor indicate
     * Dagger shall inject those fields if required, but cannot create new instances.
     */

    /**
     * @Inject-annotated Non-Empty constructors indicate Dagger shall try to provide
     * the arguments and pass them to constructor.
     */

    /**
     * @Inject-annotated Empty constructor indicates Dagger can create instances of it's class.
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
