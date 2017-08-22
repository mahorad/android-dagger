package mahorad.com.android_dagger.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import mahorad.com.android_dagger.navigate.Navigator;

/**
 * Created by mahan on 2017-08-22.
 */

public class BaseActivity extends AppCompatActivity {

    @Inject
    protected Navigator navigator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
    }
}
