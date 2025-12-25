package com.google.android.gms.internal.firebase-auth-api;
public final class zzzw implements com.google.android.gms.internal.firebase-auth-api.zzzp {

    public zzzw()
    {
        return;
    }

    public final synthetic Object zza(String p1, java.security.Provider p2)
    {
        if (p2 != null) {
            return javax.crypto.Mac.getInstance(p1, p2);
        } else {
            return javax.crypto.Mac.getInstance(p1);
        }
    }
}
