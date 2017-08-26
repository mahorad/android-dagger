package mahorad.com.android_dagger.util;

/**
 * Created by Mahan Rad on 2017-08-26.
 */

public class MyServiceDependency {

    public int getHashCode() {
        return System.identityHashCode(this);
    }

}
