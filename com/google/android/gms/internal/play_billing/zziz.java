package com.google.android.gms.internal.play_billing;
public final class zziz extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zziz zzb;
    private int zzd;
    private int zze;

    static zziz()
    {
        com.google.android.gms.internal.play_billing.zziz v0_1 = new com.google.android.gms.internal.play_billing.zziz();
        com.google.android.gms.internal.play_billing.zziz.zzb = v0_1;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zziz, v0_1);
        return;
    }

    private zziz()
    {
        return;
    }

    public static synthetic void zzA(com.google.android.gms.internal.play_billing.zziz p0, int p1)
    {
        p0.zze = (p1 - 1);
        p0.zzd = (p0.zzd | 1);
        return;
    }

    public static com.google.android.gms.internal.play_billing.zziw zzc()
    {
        return ((com.google.android.gms.internal.play_billing.zziw) com.google.android.gms.internal.play_billing.zziz.zzb.zzl());
    }

    public static bridge synthetic com.google.android.gms.internal.play_billing.zziz zzd()
    {
        return com.google.android.gms.internal.play_billing.zziz.zzb;
    }

    public final Object zzb(int p1, Object p2, Object p3)
    {
        com.google.android.gms.internal.play_billing.zziz v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.gms.internal.play_billing.zzfi.zzt(com.google.android.gms.internal.play_billing.zziz.zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u180c\u0000", new Object[] {"zzd", "zze", com.google.android.gms.internal.play_billing.zzix.zza}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.gms.internal.play_billing.zziz();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.gms.internal.play_billing.zziw(0);
                    } else {
                        if (v1_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.play_billing.zziz.zzb;
                        }
                    }
                }
            }
        }
    }
}
