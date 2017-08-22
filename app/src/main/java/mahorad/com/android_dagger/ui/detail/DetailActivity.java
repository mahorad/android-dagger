package mahorad.com.android_dagger.ui.detail;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import javax.inject.Inject;

import mahorad.com.android_dagger.R;
import mahorad.com.android_dagger.base.BaseActivity;
import mahorad.com.android_dagger.di.qualifier.ApplicationContext;
import mahorad.com.android_dagger.util.MyApplicationSingleton;
import mahorad.com.android_dagger.util.MyDetailActivityDependency;
import timber.log.Timber;

/**
 * Created by mahan on 2017-08-22.
 */

public class DetailActivity extends BaseActivity {

    private static final String TAG = "DaggerDependencyInjection";

    @Inject
    MyDetailActivityDependency myActivityDependency;

    @Inject
    MyApplicationSingleton myApplicationSingleton;

    @Inject
    @ApplicationContext
    Context applicationContext;

    @Inject
    Context activityContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Timber.tag(TAG).d("====================== DETAIL ACTIVITY ====================");
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

    public void toMaster(View view) {
        navigator.toMaster(getBaseContext());
    }
}
