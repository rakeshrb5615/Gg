package com.google.android.gms.internal.play_billing;
public final class zzjf extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzjf zzb;
    private int zzd;
    private com.google.android.gms.internal.play_billing.zzfn zze;
    private String zzf;
    private boolean zzg;

    static zzjf()
    {
        com.google.android.gms.internal.play_billing.zzjf v0_1 = new com.google.android.gms.internal.play_billing.zzjf();
        com.google.android.gms.internal.play_billing.zzjf.zzb = v0_1;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzjf, v0_1);
        return;
    }

    private zzjf()
    {
        this.zze = com.google.android.gms.internal.play_billing.zzfi.zzr();
        this.zzf = "";
        return;
    }

    public static synthetic void zzA(com.google.android.gms.internal.play_billing.zzjf p1, boolean p2)
    {
        p1.zzd = (p1.zzd | 2);
        p1.zzg = p2;
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.play_billing.zzjf zzc()
    {
        return com.google.android.gms.internal.play_billing.zzjf.zzb;
    }

    public static com.google.android.gms.internal.play_billing.zzjf zzd()
    {
        return com.google.android.gms.internal.play_billing.zzjf.zzb;
    }

    public final Object zzb(int p3, Object p4, Object p5)
    {
        com.google.android.gms.internal.play_billing.zzjf v3_1 = (p3 - 1);
        if (v3_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v3_1 == 2) {
                return com.google.android.gms.internal.play_billing.zzfi.zzt(com.google.android.gms.internal.play_billing.zzjf.zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000\u0003\u1007\u0001", new Object[] {"zzd", "zze", com.google.android.gms.internal.play_billing.zzjd, "zzf", "zzg"}));
            } else {
                if (v3_1 == 3) {
                    return new com.google.android.gms.internal.play_billing.zzjf();
                } else {
                    if (v3_1 == 4) {
                        return new com.google.android.gms.internal.play_billing.zzja(0);
                    } else {
                        if (v3_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.play_billing.zzjf.zzb;
                        }
                    }
                }
            }
        }
    }
}
