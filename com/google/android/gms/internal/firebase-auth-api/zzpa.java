package com.google.android.gms.internal.firebase-auth-api;
public final class zzpa {
    private static com.google.android.gms.internal.firebase-auth-api.zzpa zza;
    private final java.util.concurrent.atomic.AtomicReference zzb;

    static zzpa()
    {
        com.google.android.gms.internal.firebase-auth-api.zzpa.zza = new com.google.android.gms.internal.firebase-auth-api.zzpa();
        return;
    }

    public zzpa()
    {
        this.zzb = new java.util.concurrent.atomic.AtomicReference(com.google.android.gms.internal.firebase-auth-api.zzpw.zza().zza());
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzpa zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzpa.zza;
    }

    public final Object zza(com.google.android.gms.internal.firebase-auth-api.zzbi p2, Class p3)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzpw) this.zzb.get()).zza(p2, p3);
    }

    public final declared_synchronized void zza(com.google.android.gms.internal.firebase-auth-api.zzps p2)
    {
        this.zzb.set(com.google.android.gms.internal.firebase-auth-api.zzpw.zza(((com.google.android.gms.internal.firebase-auth-api.zzpw) this.zzb.get())).zza(p2).zza());
        return;
    }

    public final declared_synchronized void zza(com.google.android.gms.internal.firebase-auth-api.zzpz p2)
    {
        this.zzb.set(com.google.android.gms.internal.firebase-auth-api.zzpw.zza(((com.google.android.gms.internal.firebase-auth-api.zzpw) this.zzb.get())).zza(p2).zza());
        return;
    }
}
