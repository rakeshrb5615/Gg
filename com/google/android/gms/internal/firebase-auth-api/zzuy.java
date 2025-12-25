package com.google.android.gms.internal.firebase-auth-api;
public final class zzuy extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzuy zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;

    static zzuy()
    {
        com.google.android.gms.internal.firebase-auth-api.zzuy v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzuy();
        com.google.android.gms.internal.firebase-auth-api.zzuy.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzuy, v0_1);
        return;
    }

    private zzuy()
    {
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzuy zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzuy.zzc;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzuy zza(com.google.android.gms.internal.firebase-auth-api.zzajv p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzuy) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzuy.zzc, p1, p2));
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzuy zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzuy.zzc;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzva.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzuy();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzuy$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzuy.zzc, "\u0000\u0000", 0);
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzuy.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_14 = com.google.android.gms.internal.firebase-auth-api.zzuy.zzd;
                if (v1_14 != null) {
                    return v1_14;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzuy.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzuy.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzuy.zzd = v1_1;
                    }
                    return v1_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }
}
