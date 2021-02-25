package in.obvious.ws.writingkotlin;

import android.text.TextUtils;
import android.util.Patterns;

public class StringUtil {

    private StringUtil() {}

    public final static boolean isValidEmail(CharSequence target) {
        return !TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }
}
