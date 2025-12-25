package com.google.android.gms.internal.firebase-auth-api;
public final class zzoj {
    private java.util.HashMap zza;

    public zzoj()
    {
        this.zza = new java.util.HashMap();
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzok zza()
    {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        } else {
            IllegalStateException v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzok(java.util.Collections.unmodifiableMap(this.zza), 0);
            this.zza = 0;
            return v0_1;
        }
    }
}
