package com.google.android.gms.internal.firebase-auth-api;
public final class zzwe extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzwe zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private com.google.android.gms.internal.firebase-auth-api.zzwh zzf;
    private int zzg;
    private int zzh;

    static zzwe()
    {
        com.google.android.gms.internal.firebase-auth-api.zzwe v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzwe();
        com.google.android.gms.internal.firebase-auth-api.zzwe.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzwe, v0_1);
        return;
    }

    private zzwe()
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzwe zza(com.google.android.gms.internal.firebase-auth-api.zzajv p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzwe) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzwe.zzc, p1, p2));
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzwe p0, int p1)
    {
        p0.zzg = p1;
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzwe p0, com.google.android.gms.internal.firebase-auth-api.zzwh p1)
    {
        p1.getClass();
        p0.zzf = p1;
        p0.zze = (p0.zze | 1);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzwe$zza zzc()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzwe$zza) com.google.android.gms.internal.firebase-auth-api.zzwe.zzc.zzm());
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzwe zzd()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzwe.zzc;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzwe zze()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzwe.zzc;
    }

    public final int zza()
    {
        return this.zzg;
    }

    public final Object zza(int p2, Object p3, Object p4)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzwd.zza[(p2 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzwe();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzwe$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzwe.zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u000b\u0003\u000b", new Object[] {"zze", "zzf", "zzg", "zzh"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzwe.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v2_15 = com.google.android.gms.internal.firebase-auth-api.zzwe.zzd;
                if (v2_15 != null) {
                    return v2_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v2_1 = com.google.android.gms.internal.firebase-auth-api.zzwe.zzd;
                    if (v2_1 == null) {
                        v2_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzwe.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzwe.zzd = v2_1;
                    }
                    return v2_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final int zzb()
    {
        return this.zzh;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzwh zzf()
    {
        com.google.android.gms.internal.firebase-auth-api.zzwh v0 = this.zzf;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.firebase-auth-api.zzwh.zze();
        }
        return v0;
    }
}
