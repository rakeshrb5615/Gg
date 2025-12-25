package com.google.android.gms.internal.firebase-auth-api;
public final class zzxn extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzxn zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private int zzf;
    private com.google.android.gms.internal.firebase-auth-api.zzxq zzg;

    static zzxn()
    {
        com.google.android.gms.internal.firebase-auth-api.zzxn v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzxn();
        com.google.android.gms.internal.firebase-auth-api.zzxn.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxn, v0_1);
        return;
    }

    private zzxn()
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxn zza(com.google.android.gms.internal.firebase-auth-api.zzajv p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzxn) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxn.zzc, p1, p2));
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzxn p0, com.google.android.gms.internal.firebase-auth-api.zzxq p1)
    {
        p1.getClass();
        p0.zzg = p1;
        p0.zze = (p0.zze | 1);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxn$zza zzb()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzxn$zza) com.google.android.gms.internal.firebase-auth-api.zzxn.zzc.zzm());
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzxn zzc()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzxn.zzc;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzamv zze()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzamv) com.google.android.gms.internal.firebase-auth-api.zzxn.zzc.zza(com.google.android.gms.internal.firebase-auth-api.zzalf$zze.zzg, 0, 0));
    }

    public final int zza()
    {
        return this.zzf;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzxp.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzxn();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzxn$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxn.zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000", new Object[] {"zze", "zzf", "zzg"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzxn.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zzxn.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzxn.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzxn.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzxn.zzd = v1_1;
                    }
                    return v1_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzxq zzd()
    {
        com.google.android.gms.internal.firebase-auth-api.zzxq v0 = this.zzg;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.firebase-auth-api.zzxq.zzc();
        }
        return v0;
    }
}
