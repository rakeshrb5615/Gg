package com.google.android.gms.internal.firebase-auth-api;
public final class zzmy {
    private static final Object zza = None;
    private static final String zzb = "zzmy";
    private com.google.android.gms.internal.firebase-auth-api.zzbw zzc;

    static zzmy()
    {
        com.google.android.gms.internal.firebase-auth-api.zzmy.zza = new Object();
        return;
    }

    private zzmy(com.google.android.gms.internal.firebase-auth-api.zzmy$zza p5)
    {
        new com.google.android.gms.internal.firebase-auth-api.zznf(com.google.android.gms.internal.firebase-auth-api.zzmy$zza.zza(p5), com.google.android.gms.internal.firebase-auth-api.zzmy$zza.zzc(p5), com.google.android.gms.internal.firebase-auth-api.zzmy$zza.zzd(p5));
        this.zzc = com.google.android.gms.internal.firebase-auth-api.zzmy$zza.zzb(p5);
        return;
    }

    public synthetic zzmy(com.google.android.gms.internal.firebase-auth-api.zzmy$zza p1, com.google.android.gms.internal.firebase-auth-api.zzna p2)
    {
        this(p1);
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzbm p1, com.google.android.gms.internal.firebase-auth-api.zzby p2, com.google.android.gms.internal.firebase-auth-api.zzba p3)
    {
        if (p3 == null) {
            com.google.android.gms.internal.firebase-auth-api.zzbz.zza(p1, p2, com.google.android.gms.internal.firebase-auth-api.zzbf.zza());
            return;
        } else {
            try {
                byte[] v0_1 = new byte[0];
                p1.zza(p2, p3, v0_1);
                return;
            } catch (java.io.IOException v1_1) {
                throw new java.security.GeneralSecurityException(v1_1);
            }
        }
    }

    public static bridge synthetic Object zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzmy.zza;
    }

    public static bridge synthetic String zzc()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzmy.zzb;
    }

    public static synthetic boolean zzd()
    {
        return 1;
    }

    public final declared_synchronized com.google.android.gms.internal.firebase-auth-api.zzbm zza()
    {
        return this.zzc.zza();
    }
}
