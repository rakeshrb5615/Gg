package com.google.android.gms.internal.firebase-auth-api;
public final class zzzr implements com.google.android.gms.internal.firebase-auth-api.zzzp {

    public zzzr()
    {
        return;
    }

    public final synthetic Object zza(String p1, java.security.Provider p2)
    {
        if (p2 != null) {
            return javax.crypto.KeyAgreement.getInstance(p1, p2);
        } else {
            return javax.crypto.KeyAgreement.getInstance(p1);
        }
    }
}
