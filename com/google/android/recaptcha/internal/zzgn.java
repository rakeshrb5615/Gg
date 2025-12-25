package com.google.android.recaptcha.internal;
public final class zzgn implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzgn zza;

    static zzgn()
    {
        com.google.android.recaptcha.internal.zzgn.zza = new com.google.android.recaptcha.internal.zzgn();
        return;
    }

    private zzgn()
    {
        return;
    }

    private static final boolean zzb(java.util.List p2)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList(i7.j.X(p2, 10));
        int v2_5 = p2.iterator();
        while (v2_5.hasNext()) {
            v0_1.add(Boolean.valueOf(((com.google.android.recaptcha.internal.zzue) v2_5.next()).zzR()));
        }
        if (v0_1.contains(Boolean.FALSE)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final varargs void zza(int p4, com.google.android.recaptcha.internal.zzgd p5, com.google.android.recaptcha.internal.zzue[] p6)
    {
        if (!com.google.android.recaptcha.internal.zzgn.zzb(i7.h.i0(p6))) {
            throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
        } else {
            com.google.android.recaptcha.internal.zzce v4_1 = p6.length;
            int v0_0 = 0;
            while (v0_0 < v4_1) {
                p5.zzc().zzb(p6[v0_0].zzi());
                v0_0++;
            }
            return;
        }
    }
}
