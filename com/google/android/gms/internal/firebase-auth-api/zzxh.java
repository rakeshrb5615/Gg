package com.google.android.gms.internal.firebase-auth-api;
public final class zzxh extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzxh zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private com.google.android.gms.internal.firebase-auth-api.zzalm zzf;

    static zzxh()
    {
        com.google.android.gms.internal.firebase-auth-api.zzxh v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzxh();
        com.google.android.gms.internal.firebase-auth-api.zzxh.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxh, v0_1);
        return;
    }

    private zzxh()
    {
        this.zzf = com.google.android.gms.internal.firebase-auth-api.zzalf.zzp();
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxh zza(java.io.InputStream p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzxh) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxh.zzc, p1, p2));
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxh zza(byte[] p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzxh) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxh.zzc, p1, p2));
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzxh p0, int p1)
    {
        p0.zze = p1;
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzxh p2, com.google.android.gms.internal.firebase-auth-api.zzxh$zzb p3)
    {
        p3.getClass();
        com.google.android.gms.internal.firebase-auth-api.zzalm v0_0 = p2.zzf;
        if (!v0_0.zzc()) {
            p2.zzf = com.google.android.gms.internal.firebase-auth-api.zzalf.zza(v0_0);
        }
        p2.zzf.add(p3);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxh$zza zzc()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzxh$zza) com.google.android.gms.internal.firebase-auth-api.zzxh.zzc.zzm());
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzxh zzd()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzxh.zzc;
    }

    public final int zza()
    {
        return this.zzf.size();
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzxh$zzb zza(int p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzxh$zzb) this.zzf.get(p2));
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzxj.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzxh();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzxh$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxh.zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[] {"zze", "zzf", com.google.android.gms.internal.firebase-auth-api.zzxh$zzb}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzxh.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zzxh.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzxh.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzxh.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzxh.zzd = v1_1;
                    }
                    return v1_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final int zzb()
    {
        return this.zze;
    }

    public final java.util.List zze()
    {
        return this.zzf;
    }
}
