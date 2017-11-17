package com.jiangdg.oktoast;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/** 自定义Material design风格Toast
 *  使用链式调用，提供两种方式创建Toast
 *  (1) makeToast：继承Toast
 *
 * Created by jiangdongguo on 2017/11/1.
 */

public class OkToast extends Toast{
    public static final int TYPE_INFO = 0;
    public static final int TYPE_WARNING = 1;
    public static final int TYPE_SUCCESS = 2;
    public static final int TYPE_ERROR = 3;
    public static final int DURATION_LONG = Toast.LENGTH_LONG;
    public static final int DURATION_SHORT = Toast.LENGTH_SHORT;

    private Context mContext;

    public OkToast(Context context) {
        super(context);
        this.mContext = context;
    }

    public static OkToast makeToast(Context context,String msg) {
        return makeToast(context,msg,TYPE_INFO,DURATION_SHORT);
    }

    public static OkToast makeToast(Context context,String msg,int type,int duration) {
        OkToast okToast = new OkToast(context);

        return okToast;
    }
}
