package mahorad.com.android_dagger.ui.master;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import javax.inject.Inject;

import mahorad.com.android_dagger.R;
import mahorad.com.android_dagger.base.BaseActivity;
import mahorad.com.android_dagger.di.qualifier.ApplicationContext;
import mahorad.com.android_dagger.service.SomeService;
import mahorad.com.android_dagger.util.MyCommonActivityDependency;
import mahorad.com.android_dagger.util.MyMasterActivityDependency;
import mahorad.com.android_dagger.util.MyAppSingletonDependency;
import timber.log.Timber;

/**
 * Created by Mahan Rad on 2017-08-22.
 */

public class MainActivity extends BaseActivity {

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
    MyMasterActivityDependency myActivityDependency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
    }

    @Override
    protected void onResume() {
        super.onResume();
        printDependencies();

    }

    private void printDependencies() {
        Timber.tag(TAG).d(".");
        Timber.tag(TAG).d("====================== MASTER ACTIVITY ====================");
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
        Timber.tag(TAG).d("========================= MASTER DESTROYED =======================");
    }

    public void toDetail(View view) {
        navigator.toDetail(getBaseContext());
    }

    public void startService(View view) {
        Intent intent = new Intent(this, SomeService.class);
        startService(intent);
    }
}
