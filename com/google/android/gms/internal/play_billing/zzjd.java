package com.google.android.gms.internal.play_billing;
public final class zzjd extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzjd zzb;
    private int zzd;
    private int zze;
    private String zzf;

    static zzjd()
    {
        com.google.android.gms.internal.play_billing.zzjd v0_1 = new com.google.android.gms.internal.play_billing.zzjd();
        com.google.android.gms.internal.play_billing.zzjd.zzb = v0_1;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzjd, v0_1);
        return;
    }

    private zzjd()
    {
        this.zzf = "";
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.play_billing.zzjd zzc()
    {
        return com.google.android.gms.internal.play_billing.zzjd.zzb;
    }

    public final Object zzb(int p2, Object p3, Object p4)
    {
        com.google.android.gms.internal.play_billing.zzjd v2_1 = (p2 - 1);
        if (v2_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v2_1 == 2) {
                return com.google.android.gms.internal.play_billing.zzfi.zzt(com.google.android.gms.internal.play_billing.zzjd.zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1008\u0001", new Object[] {"zzd", "zze", com.google.android.gms.internal.play_billing.zzjc.zza, "zzf"}));
            } else {
                if (v2_1 == 3) {
                    return new com.google.android.gms.internal.play_billing.zzjd();
                } else {
                    if (v2_1 == 4) {
                        return new com.google.android.gms.internal.play_billing.zzjb(0);
                    } else {
                        if (v2_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.play_billing.zzjd.zzb;
                        }
                    }
                }
            }
        }
    }
}
