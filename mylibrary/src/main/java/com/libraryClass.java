package com;

import android.content.Context;
import android.widget.Toast;

public class libraryClass {
    public static void MyMessage(Context c, String msg){
        Toast.makeText(c, "This msg sent by Library" + msg, Toast.LENGTH_SHORT).show();
    }
}
