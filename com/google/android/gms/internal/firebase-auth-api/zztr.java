package com.google.android.gms.internal.firebase-auth-api;
public final class zztr extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zztr zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;

    static zztr()
    {
        com.google.android.gms.internal.firebase-auth-api.zztr v0_1 = new com.google.android.gms.internal.firebase-auth-api.zztr();
        com.google.android.gms.internal.firebase-auth-api.zztr.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zztr, v0_1);
        return;
    }

    private zztr()
    {
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zztr p0, int p1)
    {
        p0.zze = p1;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zztr$zza zzb()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zztr$zza) com.google.android.gms.internal.firebase-auth-api.zztr.zzc.zzm());
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zztr zzc()
    {
        return com.google.android.gms.internal.firebase-auth-api.zztr.zzc;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zztr zzd()
    {
        return com.google.android.gms.internal.firebase-auth-api.zztr.zzc;
    }

    public final int zza()
    {
        return this.zze;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zztt.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zztr();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zztr$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zztr.zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[] {"zze"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zztr.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zztr.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zztr.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zztr.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zztr.zzd = v1_1;
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
