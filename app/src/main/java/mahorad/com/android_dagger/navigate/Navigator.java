package mahorad.com.android_dagger.navigate;

import android.content.Context;
import android.content.Intent;

import javax.inject.Inject;
import javax.inject.Singleton;

import mahorad.com.android_dagger.ui.detail.DetailActivity;
import mahorad.com.android_dagger.ui.master.MainActivity;

/**
 * Created by mahan on 2017-08-22.
 */

@Singleton
public final class Navigator {

    @Inject
    Navigator() {}

    public void toDetail(Context context) {
        Intent intent = new Intent(context, DetailActivity.class);
        context.startActivity(intent);
    }

    public void toMaster(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

}