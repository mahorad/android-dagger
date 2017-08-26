package mahorad.com.android_dagger.util;

/**
 * Created by Mahan Rad on 2017-08-22.
 */

public class MyAppSingletonDependency {

    public int getHashCode() {
        return System.identityHashCode(this);
    }

}
