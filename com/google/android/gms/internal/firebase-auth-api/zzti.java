package com.google.android.gms.internal.firebase-auth-api;
public final class zzti extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzti zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private com.google.android.gms.internal.firebase-auth-api.zzto zzf;
    private com.google.android.gms.internal.firebase-auth-api.zzwe zzg;

    static zzti()
    {
        com.google.android.gms.internal.firebase-auth-api.zzti v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzti();
        com.google.android.gms.internal.firebase-auth-api.zzti.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzti, v0_1);
        return;
    }

    private zzti()
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzti$zza zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzti$zza) com.google.android.gms.internal.firebase-auth-api.zzti.zzc.zzm());
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzti zza(com.google.android.gms.internal.firebase-auth-api.zzajv p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzti) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzti.zzc, p1, p2));
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzti p0, com.google.android.gms.internal.firebase-auth-api.zzto p1)
    {
        p1.getClass();
        p0.zzf = p1;
        p0.zze = (p0.zze | 1);
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzti p0, com.google.android.gms.internal.firebase-auth-api.zzwe p1)
    {
        p1.getClass();
        p0.zzg = p1;
        p0.zze = (p0.zze | 2);
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzti zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzti.zzc;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zztk.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzti();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzti$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzti.zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] {"zze", "zzf", "zzg"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzti.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zzti.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzti.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzti.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzti.zzd = v1_1;
                    }
                    return v1_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzto zzc()
    {
        com.google.android.gms.internal.firebase-auth-api.zzto v0 = this.zzf;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.firebase-auth-api.zzto.zzd();
        }
        return v0;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzwe zzd()
    {
        com.google.android.gms.internal.firebase-auth-api.zzwe v0 = this.zzg;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.firebase-auth-api.zzwe.zze();
        }
        return v0;
    }
}
