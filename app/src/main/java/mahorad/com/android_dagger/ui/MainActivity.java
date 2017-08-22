package mahorad.com.android_dagger.ui;

import android.content.Context;
import android.os.Bundle;

import javax.inject.Inject;

import mahorad.com.android_dagger.R;
import mahorad.com.android_dagger.base.BaseActivity;
import mahorad.com.android_dagger.di.qualifier.ApplicationContext;
import mahorad.com.android_dagger.util.MyActivityDependency;
import mahorad.com.android_dagger.util.MyApplicationSingleton;
import timber.log.Timber;

/**
 * Created by Mahan Rad on 2017-08-22.
 */

public class MainActivity extends BaseActivity {

    private static final String TAG = "DaggerDependencyInjection";

    @Inject
    MyActivityDependency myActivityDependency;

    @Inject
    MyApplicationSingleton myApplicationSingleton;

    @Inject
    @ApplicationContext
    Context applicationContext;

    @Inject
    Context activityContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timber.tag(TAG).d("===========================================================");
        Timber.tag(TAG).d("myActivityDependency %d", myActivityDependency.getHashCode());
        Timber.tag(TAG).d("===========================================================");
        Timber.tag(TAG).d("applicationContext   %d", applicationContext.hashCode());
        Timber.tag(TAG).d("Application.Context  %d", getApplication().getBaseContext().hashCode());
        Timber.tag(TAG).d("===========================================================");
        Timber.tag(TAG).d("activityContext      %d", activityContext.hashCode());
        Timber.tag(TAG).d("Activity.Context     %d", getBaseContext().hashCode());

        Timber.tag(TAG).d("===========================================================");
        for (int i = 0; i < 5; i++) {
            Timber.tag(TAG).d("myActivitySingleton  %d", myApplicationSingleton.getHashCode());
        }
    }
}
