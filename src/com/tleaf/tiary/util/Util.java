package com.tleaf.tiary.util;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Util {
	public static void tst(Context context, String msg) {
		Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
	}
	
	public static void ll(String tag, String msg) {
		Log.d(tag, msg);
	}
	
	public static void ll(String tag, int msg) {
		Log.d(tag, ""+msg);
	}
}
