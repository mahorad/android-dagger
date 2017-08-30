package mahorad.com.android_dagger.util;

import javax.inject.Inject;

/**
 * Created by mahan on 2017-08-30.
 */

public class Q {

    O o;

    @Inject
    public Q(O o) {
        this.o = o;
    }

}
