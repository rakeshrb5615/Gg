package com.google.android.gms.internal.firebase-auth-api;
public final class zzwl extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzwl zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private com.google.android.gms.internal.firebase-auth-api.zzwo zzf;

    static zzwl()
    {
        com.google.android.gms.internal.firebase-auth-api.zzwl v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzwl();
        com.google.android.gms.internal.firebase-auth-api.zzwl.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzwl, v0_1);
        return;
    }

    private zzwl()
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzwl$zza zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzwl$zza) com.google.android.gms.internal.firebase-auth-api.zzwl.zzc.zzm());
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzwl zza(com.google.android.gms.internal.firebase-auth-api.zzajv p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzwl) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzwl.zzc, p1, p2));
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzwl p0, com.google.android.gms.internal.firebase-auth-api.zzwo p1)
    {
        p1.getClass();
        p0.zzf = p1;
        p0.zze = (p0.zze | 1);
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzwl zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzwl.zzc;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzwn.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzwl();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzwl$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzwl.zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] {"zze", "zzf"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzwl.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zzwl.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzwl.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzwl.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzwl.zzd = v1_1;
                    }
                    return v1_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzwo zzc()
    {
        com.google.android.gms.internal.firebase-auth-api.zzwo v0 = this.zzf;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.firebase-auth-api.zzwo.zzf();
        }
        return v0;
    }
}
