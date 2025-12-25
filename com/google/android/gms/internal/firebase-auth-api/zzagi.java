package com.google.android.gms.internal.firebase-auth-api;
public final class zzagi {

    public static String zza(String p4)
    {
        try {
            String v4_2 = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[] {String})).invoke(0, new Object[] {p4}));
        } catch (Exception) {
            return 0;
        }
        if (!(v4_2 instanceof String)) {
            return 0;
        } else {
            return ((String) v4_2);
        }
    }
}
