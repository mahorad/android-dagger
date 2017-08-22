package mahorad.com.android_dagger.ui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import mahorad.com.android_dagger.R;
import mahorad.com.android_dagger.di.qualifier.ApplicationContext;
import mahorad.com.android_dagger.util.MyActivityDependency;
import mahorad.com.android_dagger.util.MyApplicationSingleton;
import timber.log.Timber;

/**
 * Created by Mahan Rad on 2017-08-22.
 */

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "DaggerDependencyInjection";

    @Inject
    MyActivityDependency myActivityDependency;

    @Inject
    MyApplicationSingleton myApplicationSingleton;

    @Inject
    @ApplicationContext
    Context applicationContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timber.tag(TAG).d("===========================================================");
        Timber.tag(TAG).d("myActivityDependency %d", myActivityDependency.getHashCode());
        Timber.tag(TAG).d("applicationContext   %d", applicationContext.hashCode());
        Timber.tag(TAG).d("Application.Context  %d", getApplication().getBaseContext().hashCode());

        Timber.tag(TAG).d("===========================================================");
        for (int i = 0; i < 5; i++) {
            Timber.tag(TAG).d("myActivitySingleton %d", myApplicationSingleton.getHashCode());
        }
    }
}
