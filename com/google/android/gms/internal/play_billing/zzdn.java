package com.google.android.gms.internal.play_billing;
public final class zzdn extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzdn zzb;
    private int zzd;
    private String zze;

    static zzdn()
    {
        com.google.android.gms.internal.play_billing.zzdn v0_1 = new com.google.android.gms.internal.play_billing.zzdn();
        com.google.android.gms.internal.play_billing.zzdn.zzb = v0_1;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzdn, v0_1);
        return;
    }

    private zzdn()
    {
        this.zze = "";
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.play_billing.zzdn zza()
    {
        return com.google.android.gms.internal.play_billing.zzdn.zzb;
    }

    public final Object zzb(int p1, Object p2, Object p3)
    {
        com.google.android.gms.internal.play_billing.zzdn v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.gms.internal.play_billing.zzfi.zzt(com.google.android.gms.internal.play_billing.zzdn.zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] {"zzd", "zze"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.gms.internal.play_billing.zzdn();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.gms.internal.play_billing.zzdm(0);
                    } else {
                        if (v1_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.play_billing.zzdn.zzb;
                        }
                    }
                }
            }
        }
    }
}
