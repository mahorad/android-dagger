package mahorad.com.android_dagger.util;

/**
 * Created by a239453 on 2017-08-22.
 */

public class MyApplicationSingleton {

    public int getHashCode() {
        return System.identityHashCode(this);
    }

}
