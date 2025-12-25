package com.google.android.gms.internal.auth;
final class zzfi extends com.google.android.gms.internal.auth.zzfk {

    private zzfi()
    {
        super(0);
        return;
    }

    public synthetic zzfi(com.google.android.gms.internal.auth.zzfh p1)
    {
        super(0);
        return;
    }

    public final void zza(Object p1, long p2)
    {
        ((com.google.android.gms.internal.auth.zzey) com.google.android.gms.internal.auth.zzhi.zzf(p1, p2)).zzb();
        return;
    }

    public final void zzb(Object p5, Object p6, long p7)
    {
        com.google.android.gms.internal.auth.zzey v0_1 = ((com.google.android.gms.internal.auth.zzey) com.google.android.gms.internal.auth.zzhi.zzf(p5, p7));
        com.google.android.gms.internal.auth.zzey v6_1 = ((com.google.android.gms.internal.auth.zzey) com.google.android.gms.internal.auth.zzhi.zzf(p6, p7));
        int v1 = v0_1.size();
        int v2_1 = v6_1.size();
        if ((v1 > 0) && (v2_1 > 0)) {
            if (!v0_1.zzc()) {
                v0_1 = v0_1.zzd((v2_1 + v1));
            }
            v0_1.addAll(v6_1);
        }
        if (v1 > 0) {
            v6_1 = v0_1;
        }
        com.google.android.gms.internal.auth.zzhi.zzp(p5, p7, v6_1);
        return;
    }
}
