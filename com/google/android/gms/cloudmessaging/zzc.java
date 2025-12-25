package com.google.android.gms.cloudmessaging;
public final class zzc extends java.lang.ClassLoader {

    public zzc()
    {
        return;
    }

    public final Class loadClass(String p2, boolean p3)
    {
        if (!java.util.Objects.equals(p2, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(p2, p3);
        } else {
            if (android.util.Log.isLoggable("CloudMessengerCompat", 3)) {
                android.util.Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            }
            return com.google.android.gms.cloudmessaging.zzd;
        }
    }
}
