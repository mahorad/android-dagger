package mahorad.com.android_dagger.util;

import javax.inject.Inject;

import mahorad.com.android_dagger.di.component.DaggerServiceComponent;
import mahorad.com.android_dagger.di.module.BaseServiceModule;
import timber.log.Timber;

/**
 * Created by mahan on 2017-08-30.
 */

public class O {

    private static final String TAG = "DaggerDependencyInjection";

    @Inject
    Q q;

    public O() {}

    public void invoke() {
        injectDependencies();
        Timber.tag(TAG).d("q   %s", System.identityHashCode(q));
        q.invoke();
    }

    private void injectDependencies() {
        if (q != null) return;
        DaggerServiceComponent
                .builder()
                .baseServiceModule(new BaseServiceModule())
                .build()
                .inject(this);
    }

}
