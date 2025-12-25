package com.google.android.gms.internal.firebase-auth-api;
public final class zzvv extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzvv zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private com.google.android.gms.internal.firebase-auth-api.zzajv zzf;
    private com.google.android.gms.internal.firebase-auth-api.zzxk zzg;

    static zzvv()
    {
        com.google.android.gms.internal.firebase-auth-api.zzvv v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzvv();
        com.google.android.gms.internal.firebase-auth-api.zzvv.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzvv, v0_1);
        return;
    }

    private zzvv()
    {
        this.zzf = com.google.android.gms.internal.firebase-auth-api.zzajv.zza;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzvv$zza zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzvv$zza) com.google.android.gms.internal.firebase-auth-api.zzvv.zzc.zzm());
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzvv zza(java.io.InputStream p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzvv) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzvv.zzc, p1, p2));
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzvv p1)
    {
        p1.zzg = 0;
        p1.zze = (p1.zze & -2);
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzvv p0, com.google.android.gms.internal.firebase-auth-api.zzajv p1)
    {
        p1.getClass();
        p0.zzf = p1;
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzvv p0, com.google.android.gms.internal.firebase-auth-api.zzxk p1)
    {
        p1.getClass();
        p0.zzg = p1;
        p0.zze = (p0.zze | 1);
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzvv zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzvv.zzc;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzvx.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzvv();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzvv$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzvv.zzc, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\u1009\u0000", new Object[] {"zze", "zzf", "zzg"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzvv.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zzvv.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzvv.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzvv.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzvv.zzd = v1_1;
                    }
                    return v1_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzajv zzc()
    {
        return this.zzf;
    }
}
