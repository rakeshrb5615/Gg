package com.google.android.gms.internal.firebase-auth-api;
public final class zzzy implements com.google.android.gms.internal.firebase-auth-api.zzzp {

    public zzzy()
    {
        return;
    }

    public final synthetic Object zza(String p1, java.security.Provider p2)
    {
        if (p2 != null) {
            return java.security.Signature.getInstance(p1, p2);
        } else {
            return java.security.Signature.getInstance(p1);
        }
    }
}
