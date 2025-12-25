package com.google.android.gms.internal.firebase-auth-api;
public final class zzxq extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzxq zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private String zze;

    static zzxq()
    {
        com.google.android.gms.internal.firebase-auth-api.zzxq v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzxq();
        com.google.android.gms.internal.firebase-auth-api.zzxq.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxq, v0_1);
        return;
    }

    private zzxq()
    {
        this.zze = "";
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxq$zza zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzxq$zza) com.google.android.gms.internal.firebase-auth-api.zzxq.zzc.zzm());
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxq zza(com.google.android.gms.internal.firebase-auth-api.zzajv p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzxq) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxq.zzc, p1, p2));
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzxq p0, String p1)
    {
        p1.getClass();
        p0.zze = p1;
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzxq zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzxq.zzc;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxq zzc()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzxq.zzc;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzxs.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzxq();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzxq$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxq.zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] {"zze"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzxq.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zzxq.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzxq.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzxq.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzxq.zzd = v1_1;
                    }
                    return v1_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final String zzd()
    {
        return this.zze;
    }
}
