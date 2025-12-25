package com.google.android.gms.internal.firebase-auth-api;
public final class zzve extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzve zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private com.google.android.gms.internal.firebase-auth-api.zzxb zzf;

    static zzve()
    {
        com.google.android.gms.internal.firebase-auth-api.zzve v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzve();
        com.google.android.gms.internal.firebase-auth-api.zzve.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzve, v0_1);
        return;
    }

    private zzve()
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzve$zza zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzve$zza) com.google.android.gms.internal.firebase-auth-api.zzve.zzc.zzm());
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzve p0, com.google.android.gms.internal.firebase-auth-api.zzxb p1)
    {
        p1.getClass();
        p0.zzf = p1;
        p0.zze = (p0.zze | 1);
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzve zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzve.zzc;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzve zzc()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzve.zzc;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzvd.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzve();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzve$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzve.zzc, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1009\u0000", new Object[] {"zze", "zzf"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzve.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zzve.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzve.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzve.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzve.zzd = v1_1;
                    }
                    return v1_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzxb zzd()
    {
        com.google.android.gms.internal.firebase-auth-api.zzxb v0 = this.zzf;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.firebase-auth-api.zzxb.zzc();
        }
        return v0;
    }
}
