package mahorad.com.android_dagger.util;

import javax.inject.Inject;

import mahorad.com.android_dagger.base.BaseApplication;
import timber.log.Timber;

/**
 * Created by Mahan Rad on 2017-08-29.
 */

public class B {

    private static final String TAG = "DaggerDependencyInjection";

    /**
     * @Inject-annotated fields without @Inject-annotated constructor indicate
     * Dagger cannot instantiate but will inject dependencies if requested from component.
     */

    @Inject
    Y y;

    public B() {
        BaseApplication.component().inject(this);
    }

    public void invoke() {
        Timber.tag(TAG).d("y   %s", System.identityHashCode(y));
        y.invoke();
    }

}
