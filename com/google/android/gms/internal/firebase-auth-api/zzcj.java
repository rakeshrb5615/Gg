package com.google.android.gms.internal.firebase-auth-api;
public final class zzcj {

    public static com.google.android.gms.internal.firebase-auth-api.zzcb zza(byte[] p2)
    {
        try {
            com.google.android.gms.internal.firebase-auth-api.zzcb v2_3 = com.google.android.gms.internal.firebase-auth-api.zzxb.zza(p2, com.google.android.gms.internal.firebase-auth-api.zzaku.zza());
            com.google.android.gms.internal.firebase-auth-api.zzoi v0_5 = com.google.android.gms.internal.firebase-auth-api.zzoz.zza();
            com.google.android.gms.internal.firebase-auth-api.zzcb v2_4 = com.google.android.gms.internal.firebase-auth-api.zzqe.zza(v2_3);
        } catch (com.google.android.gms.internal.firebase-auth-api.zzcb v2_1) {
            throw new java.security.GeneralSecurityException("Failed to parse proto", v2_1);
        }
        if (v0_5.zzc(v2_4)) {
            return v0_5.zza(v2_4);
        } else {
            return new com.google.android.gms.internal.firebase-auth-api.zzoi(v2_4);
        }
    }

    public static byte[] zza(com.google.android.gms.internal.firebase-auth-api.zzcb p2)
    {
        if (!(p2 instanceof com.google.android.gms.internal.firebase-auth-api.zzoi)) {
            return ((com.google.android.gms.internal.firebase-auth-api.zzqe) com.google.android.gms.internal.firebase-auth-api.zzoz.zza().zza(p2, com.google.android.gms.internal.firebase-auth-api.zzqe)).zza().zzk();
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zzoi) p2).zzb().zza().zzk();
        }
    }
}
