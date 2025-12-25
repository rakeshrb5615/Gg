package com.google.android.gms.internal.firebase-auth-api;
public final class zzzs implements com.google.android.gms.internal.firebase-auth-api.zzzp {

    public zzzs()
    {
        return;
    }

    public final synthetic Object zza(String p1, java.security.Provider p2)
    {
        if (p2 != null) {
            return javax.crypto.Cipher.getInstance(p1, p2);
        } else {
            return javax.crypto.Cipher.getInstance(p1);
        }
    }
}
