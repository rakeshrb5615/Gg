package com.google.android.gms.internal.play_billing;
public final class zzdk extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzdk zzb;
    private com.google.android.gms.internal.play_billing.zzfn zzd;

    static zzdk()
    {
        com.google.android.gms.internal.play_billing.zzdk v0_1 = new com.google.android.gms.internal.play_billing.zzdk();
        com.google.android.gms.internal.play_billing.zzdk.zzb = v0_1;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzdk, v0_1);
        return;
    }

    private zzdk()
    {
        this.zzd = com.google.android.gms.internal.play_billing.zzfi.zzr();
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzdj zza()
    {
        return ((com.google.android.gms.internal.play_billing.zzdj) com.google.android.gms.internal.play_billing.zzdk.zzb.zzl());
    }

    public static bridge synthetic com.google.android.gms.internal.play_billing.zzdk zzc()
    {
        return com.google.android.gms.internal.play_billing.zzdk.zzb;
    }

    public static synthetic void zzd(com.google.android.gms.internal.play_billing.zzdk p2, Iterable p3)
    {
        com.google.android.gms.internal.play_billing.zzfn v0_0 = p2.zzd;
        if (!v0_0.zzc()) {
            p2.zzd = v0_0.zzd((v0_0.size() + v0_0.size()));
        }
        com.google.android.gms.internal.play_billing.zzds.zzg(p3, p2.zzd);
        return;
    }

    public final Object zzb(int p1, Object p2, Object p3)
    {
        com.google.android.gms.internal.play_billing.zzdk v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.gms.internal.play_billing.zzfi.zzt(com.google.android.gms.internal.play_billing.zzdk.zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] {"zzd", com.google.android.gms.internal.play_billing.zzdi}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.gms.internal.play_billing.zzdk();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.gms.internal.play_billing.zzdj(0);
                    } else {
                        if (v1_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.play_billing.zzdk.zzb;
                        }
                    }
                }
            }
        }
    }
}
