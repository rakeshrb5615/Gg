package com.google.android.gms.internal.firebase-auth-api;
public final class zzvt extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzvt zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private int zzf;
    private com.google.android.gms.internal.firebase-auth-api.zzajv zzg;

    static zzvt()
    {
        com.google.android.gms.internal.firebase-auth-api.zzvt v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzvt();
        com.google.android.gms.internal.firebase-auth-api.zzvt.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzvt, v0_1);
        return;
    }

    private zzvt()
    {
        this.zzg = com.google.android.gms.internal.firebase-auth-api.zzajv.zza;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzvt$zza zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzvt$zza) com.google.android.gms.internal.firebase-auth-api.zzvt.zzc.zzm());
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzvt p0, com.google.android.gms.internal.firebase-auth-api.zzajv p1)
    {
        p1.getClass();
        p0.zzg = p1;
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzvt p0, com.google.android.gms.internal.firebase-auth-api.zzvw p1)
    {
        p0.zze = p1.zza();
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzvt p0, com.google.android.gms.internal.firebase-auth-api.zzvy p1)
    {
        p0.zzf = p1.zza();
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzvt zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzvt.zzc;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzvt zzc()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzvt.zzc;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzvs.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzvt();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzvt$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzvt.zzc, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\u000c\u0002\u000c\u000b\n", new Object[] {"zze", "zzf", "zzg"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzvt.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zzvt.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzvt.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzvt.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzvt.zzd = v1_1;
                    }
                    return v1_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzvw zzd()
    {
        com.google.android.gms.internal.firebase-auth-api.zzvw v0_1 = com.google.android.gms.internal.firebase-auth-api.zzvw.zza(this.zze);
        if (v0_1 == null) {
            v0_1 = com.google.android.gms.internal.firebase-auth-api.zzvw.zze;
        }
        return v0_1;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzvy zze()
    {
        com.google.android.gms.internal.firebase-auth-api.zzvy v0_1 = com.google.android.gms.internal.firebase-auth-api.zzvy.zza(this.zzf);
        if (v0_1 == null) {
            v0_1 = com.google.android.gms.internal.firebase-auth-api.zzvy.zzf;
        }
        return v0_1;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzajv zzf()
    {
        return this.zzg;
    }
}
