package com.example.realtoast;

import android.content.Context;
import android.widget.Toast;

public class RealToast {
    public void simpleToast(Context context,String msg){
        Toast.makeText(context, ""+msg, Toast.LENGTH_SHORT).show();
    }
}
