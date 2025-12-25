package com.google.android.gms.internal.auth;
public final class zzhr extends com.google.android.gms.internal.auth.zzeu implements com.google.android.gms.internal.auth.zzfx {
    private static final com.google.android.gms.internal.auth.zzhr zzb;
    private com.google.android.gms.internal.auth.zzey zzd;

    static zzhr()
    {
        com.google.android.gms.internal.auth.zzhr v0_1 = new com.google.android.gms.internal.auth.zzhr();
        com.google.android.gms.internal.auth.zzhr.zzb = v0_1;
        com.google.android.gms.internal.auth.zzeu.zzg(com.google.android.gms.internal.auth.zzhr, v0_1);
        return;
    }

    private zzhr()
    {
        this.zzd = com.google.android.gms.internal.auth.zzeu.zzc();
        return;
    }

    public static synthetic com.google.android.gms.internal.auth.zzhr zzj()
    {
        return com.google.android.gms.internal.auth.zzhr.zzb;
    }

    public static com.google.android.gms.internal.auth.zzhr zzk(byte[] p1)
    {
        return ((com.google.android.gms.internal.auth.zzhr) com.google.android.gms.internal.auth.zzeu.zzb(com.google.android.gms.internal.auth.zzhr.zzb, p1));
    }

    public final Object zzi(int p1, Object p2, Object p3)
    {
        com.google.android.gms.internal.auth.zzhr v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.gms.internal.auth.zzeu.zzf(com.google.android.gms.internal.auth.zzhr.zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] {"zzd"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.gms.internal.auth.zzhr();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.gms.internal.auth.zzhq(0);
                    } else {
                        if (v1_1 == 5) {
                            return com.google.android.gms.internal.auth.zzhr.zzb;
                        } else {
                            return 0;
                        }
                    }
                }
            }
        }
    }

    public final java.util.List zzl()
    {
        return this.zzd;
    }
}
