package com.google.android.gms.internal.firebase-auth-api;
public final class zzzt implements com.google.android.gms.internal.firebase-auth-api.zzzp {

    public zzzt()
    {
        return;
    }

    public final synthetic Object zza(String p1, java.security.Provider p2)
    {
        if (p2 != null) {
            return java.security.KeyPairGenerator.getInstance(p1, p2);
        } else {
            return java.security.KeyPairGenerator.getInstance(p1);
        }
    }
}
