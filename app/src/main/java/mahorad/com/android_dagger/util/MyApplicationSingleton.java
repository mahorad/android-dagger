package mahorad.com.android_dagger.util;

import javax.inject.Inject;

/**
 * Created by Mahan Rad on 2017-08-22.
 */

public class MyApplicationSingleton {

    public int getHashCode() {
        return System.identityHashCode(this);
    }

}
