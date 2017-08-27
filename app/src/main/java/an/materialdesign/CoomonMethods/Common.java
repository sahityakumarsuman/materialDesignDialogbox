package an.materialdesign.CoomonMethods;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.Toast;

/**
 * Created by sahitya on 25/8/17.
 */

public class Common {


    public static int getScreenWidth(Activity activity) {
        Point size = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(size);
        return size.x;
    }

    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();

    }
}
