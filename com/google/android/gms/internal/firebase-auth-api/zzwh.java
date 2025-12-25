package com.google.android.gms.internal.firebase-auth-api;
public final class zzwh extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzwh zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private int zzf;

    static zzwh()
    {
        com.google.android.gms.internal.firebase-auth-api.zzwh v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzwh();
        com.google.android.gms.internal.firebase-auth-api.zzwh.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzwh, v0_1);
        return;
    }

    private zzwh()
    {
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzwh p0, int p1)
    {
        p0.zzf = p1;
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzwh p0, com.google.android.gms.internal.firebase-auth-api.zzvy p1)
    {
        p0.zze = p1.zza();
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzwh$zza zzc()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzwh$zza) com.google.android.gms.internal.firebase-auth-api.zzwh.zzc.zzm());
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzwh zzd()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzwh.zzc;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzwh zze()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzwh.zzc;
    }

    public final int zza()
    {
        return this.zzf;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzwg.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzwh();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzwh$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzwh.zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000c\u0002\u000b", new Object[] {"zze", "zzf"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzwh.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zzwh.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzwh.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzwh.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzwh.zzd = v1_1;
                    }
                    return v1_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzvy zzb()
    {
        com.google.android.gms.internal.firebase-auth-api.zzvy v0_1 = com.google.android.gms.internal.firebase-auth-api.zzvy.zza(this.zze);
        if (v0_1 == null) {
            v0_1 = com.google.android.gms.internal.firebase-auth-api.zzvy.zzf;
        }
        return v0_1;
    }
}
