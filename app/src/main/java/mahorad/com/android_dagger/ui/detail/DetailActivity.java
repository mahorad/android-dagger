package mahorad.com.android_dagger.ui.detail;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import javax.inject.Inject;

import mahorad.com.android_dagger.R;
import mahorad.com.android_dagger.base.BaseActivity;
import mahorad.com.android_dagger.di.qualifier.ApplicationContext;
import mahorad.com.android_dagger.util.MyAppSingletonDependency;
import mahorad.com.android_dagger.util.MyCommonActivityDependency;
import mahorad.com.android_dagger.util.MyDetailActivityDependency;
import timber.log.Timber;

/**
 * Created by mahan on 2017-08-22.
 */

public class DetailActivity extends BaseActivity {

    private static final String TAG = "DaggerDependencyInjection";

    @Inject
    @ApplicationContext
    Context applicationContext;

    @Inject
    MyAppSingletonDependency mySingletonDependency;

    @Inject
    Context activityContext;

    @Inject
    MyCommonActivityDependency myCommonActivityDependency;

    @Inject
    MyDetailActivityDependency myActivityDependency;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        printDependencies();
    }

    private void printDependencies() {
        Timber.tag(TAG).d(".");
        Timber.tag(TAG).d("====================== DETAIL ACTIVITY ====================");
        Timber.tag(TAG).d("applicationContext   %d", applicationContext.hashCode());
        Timber.tag(TAG).d("Application.Context  %d", getApplication().getApplicationContext().hashCode());
        Timber.tag(TAG).d("===========================================================");
        Timber.tag(TAG).d("myAppSingletonDependency  %d", mySingletonDependency.getHashCode());
        Timber.tag(TAG).d("===========================================================");
        Timber.tag(TAG).d("activityContext      %d", activityContext.hashCode());
        Timber.tag(TAG).d("Activity.Context     %d", getBaseContext().hashCode());
        Timber.tag(TAG).d("===========================================================");
        Timber.tag(TAG).d("myCommonActivitiesDependency %d", myCommonActivityDependency.getHashCode());
        Timber.tag(TAG).d("===========================================================");
        Timber.tag(TAG).d("myActivityDependency %d", myActivityDependency.getHashCode());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Timber.tag(TAG).d("========================= DETAIL DESTROYED =======================");
    }

    public void toMaster(View view) {
        navigator.toMaster(getBaseContext());
    }
}
