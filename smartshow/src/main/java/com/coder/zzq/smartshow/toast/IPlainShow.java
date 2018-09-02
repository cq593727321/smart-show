package com.coder.zzq.smartshow.toast;

import android.util.TypedValue;
import android.view.Gravity;
import android.widget.Toast;

public interface IPlainShow {
    void show(CharSequence msg);

    void showAtTop(CharSequence msg);

    void showInCenter(CharSequence msg);

    void showAtLocation(CharSequence msg, int gravity, float xOffsetDp, float yOffsetDp);


    void showLong(CharSequence msg);

    void showLongAtTop(CharSequence msg);

    void showLongInCenter(CharSequence msg);

    void showLongAtLocation(CharSequence msg, int gravity, float xOffsetDp, float yOffsetDp);
}
