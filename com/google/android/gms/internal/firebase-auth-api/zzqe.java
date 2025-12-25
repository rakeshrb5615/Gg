package com.google.android.gms.internal.firebase-auth-api;
public final class zzqe implements com.google.android.gms.internal.firebase-auth-api.zzqf {
    private final com.google.android.gms.internal.firebase-auth-api.zzaaj zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzxb zzb;

    private zzqe(com.google.android.gms.internal.firebase-auth-api.zzxb p1, com.google.android.gms.internal.firebase-auth-api.zzaaj p2)
    {
        this.zzb = p1;
        this.zza = p2;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzqe zza(com.google.android.gms.internal.firebase-auth-api.zzxb p2)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzqe(p2, com.google.android.gms.internal.firebase-auth-api.zzqn.zza(p2.zzf()));
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzqe zzb(com.google.android.gms.internal.firebase-auth-api.zzxb p2)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzqe(p2, com.google.android.gms.internal.firebase-auth-api.zzqn.zzb(p2.zzf()));
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzxb zza()
    {
        return this.zzb;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaaj zzc()
    {
        return this.zza;
    }
}
