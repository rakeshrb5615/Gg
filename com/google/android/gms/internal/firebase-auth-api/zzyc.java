package com.google.android.gms.internal.firebase-auth-api;
public final class zzyc extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzyc zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private String zze;
    private com.google.android.gms.internal.firebase-auth-api.zzalm zzf;

    static zzyc()
    {
        com.google.android.gms.internal.firebase-auth-api.zzyc v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzyc();
        com.google.android.gms.internal.firebase-auth-api.zzyc.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzyc, v0_1);
        return;
    }

    private zzyc()
    {
        this.zze = "";
        this.zzf = com.google.android.gms.internal.firebase-auth-api.zzalf.zzp();
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzyc zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzyc.zzc;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzyc zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzyc.zzc;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzyb.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzyc();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzyc$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzyc.zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b", new Object[] {"zze", "zzf", com.google.android.gms.internal.firebase-auth-api.zzxe}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzyc.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zzyc.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzyc.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzyc.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzyc.zzd = v1_1;
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
