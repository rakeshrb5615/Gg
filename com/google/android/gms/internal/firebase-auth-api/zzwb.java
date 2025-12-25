package com.google.android.gms.internal.firebase-auth-api;
public final class zzwb extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzwb zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private int zzf;
    private com.google.android.gms.internal.firebase-auth-api.zzwh zzg;
    private com.google.android.gms.internal.firebase-auth-api.zzajv zzh;

    static zzwb()
    {
        com.google.android.gms.internal.firebase-auth-api.zzwb v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzwb();
        com.google.android.gms.internal.firebase-auth-api.zzwb.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzwb, v0_1);
        return;
    }

    private zzwb()
    {
        this.zzh = com.google.android.gms.internal.firebase-auth-api.zzajv.zza;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzwb zza(com.google.android.gms.internal.firebase-auth-api.zzajv p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzwb) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzwb.zzc, p1, p2));
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzwb p0, com.google.android.gms.internal.firebase-auth-api.zzajv p1)
    {
        p1.getClass();
        p0.zzh = p1;
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzwb p0, com.google.android.gms.internal.firebase-auth-api.zzwh p1)
    {
        p1.getClass();
        p0.zzg = p1;
        p0.zze = (p0.zze | 1);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzwb$zza zzb()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzwb$zza) com.google.android.gms.internal.firebase-auth-api.zzwb.zzc.zzm());
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzwb zzc()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzwb.zzc;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzwb zzd()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzwb.zzc;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzamv zzg()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzamv) com.google.android.gms.internal.firebase-auth-api.zzwb.zzc.zza(com.google.android.gms.internal.firebase-auth-api.zzalf$zze.zzg, 0, 0));
    }

    public final int zza()
    {
        return this.zzf;
    }

    public final Object zza(int p2, Object p3, Object p4)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzwa.zza[(p2 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzwb();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzwb$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzwb.zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000\u0003\n", new Object[] {"zze", "zzf", "zzg", "zzh"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzwb.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v2_15 = com.google.android.gms.internal.firebase-auth-api.zzwb.zzd;
                if (v2_15 != null) {
                    return v2_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v2_1 = com.google.android.gms.internal.firebase-auth-api.zzwb.zzd;
                    if (v2_1 == null) {
                        v2_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzwb.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzwb.zzd = v2_1;
                    }
                    return v2_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzwh zze()
    {
        com.google.android.gms.internal.firebase-auth-api.zzwh v0 = this.zzg;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.firebase-auth-api.zzwh.zze();
        }
        return v0;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzajv zzf()
    {
        return this.zzh;
    }
}
