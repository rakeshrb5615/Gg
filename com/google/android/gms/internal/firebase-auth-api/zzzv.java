package com.google.android.gms.internal.firebase-auth-api;
public final class zzzv implements com.google.android.gms.internal.firebase-auth-api.zzzp {

    public zzzv()
    {
        return;
    }

    public final synthetic Object zza(String p1, java.security.Provider p2)
    {
        if (p2 != null) {
            return java.security.MessageDigest.getInstance(p1, p2);
        } else {
            return java.security.MessageDigest.getInstance(p1);
        }
    }
}
