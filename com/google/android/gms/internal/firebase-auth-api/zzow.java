package com.google.android.gms.internal.firebase-auth-api;
public final class zzow {
    private static final com.google.android.gms.internal.firebase-auth-api.zzow zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzov zzb;
    private final java.util.concurrent.atomic.AtomicReference zzc;

    static zzow()
    {
        com.google.android.gms.internal.firebase-auth-api.zzow.zza = new com.google.android.gms.internal.firebase-auth-api.zzow();
        com.google.android.gms.internal.firebase-auth-api.zzow.zzb = new com.google.android.gms.internal.firebase-auth-api.zzov(0);
        return;
    }

    public zzow()
    {
        this.zzc = new java.util.concurrent.atomic.AtomicReference();
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzow zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzow.zza;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzol zza()
    {
        com.google.android.gms.internal.firebase-auth-api.zzov v0_2 = ((com.google.android.gms.internal.firebase-auth-api.zzol) this.zzc.get());
        if (v0_2 == null) {
            v0_2 = com.google.android.gms.internal.firebase-auth-api.zzow.zzb;
        }
        return v0_2;
    }
}
