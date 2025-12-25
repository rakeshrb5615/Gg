package com.google.android.gms.internal.firebase-auth-api;
public final class zzbj {
    private final com.google.android.gms.internal.firebase-auth-api.zzcb zza;

    private zzbj(com.google.android.gms.internal.firebase-auth-api.zzcb p1)
    {
        this.zza = p1;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzbj zza(com.google.android.gms.internal.firebase-auth-api.zzcb p1)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzbj(p1);
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzxb zzb()
    {
        com.google.android.gms.internal.firebase-auth-api.zzxb v0_0 = this.zza;
        if (!(v0_0 instanceof com.google.android.gms.internal.firebase-auth-api.zzoi)) {
            return ((com.google.android.gms.internal.firebase-auth-api.zzqe) com.google.android.gms.internal.firebase-auth-api.zzoz.zza().zza(this.zza, com.google.android.gms.internal.firebase-auth-api.zzqe)).zza();
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zzoi) v0_0).zzb().zza();
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzcb zza()
    {
        com.google.android.gms.internal.firebase-auth-api.zzcb v0_0 = this.zza;
        if (v0_0 == null) {
            return com.google.android.gms.internal.firebase-auth-api.zzcj.zza(this.zzb().zzk());
        } else {
            return v0_0;
        }
    }
}
