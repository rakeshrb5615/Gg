package com.google.android.gms.internal.auth;
final class zzfn implements com.google.android.gms.internal.auth.zzfu {
    private final com.google.android.gms.internal.auth.zzfu[] zza;

    public varargs zzfn(com.google.android.gms.internal.auth.zzfu[] p1)
    {
        this.zza = p1;
        return;
    }

    public final com.google.android.gms.internal.auth.zzft zzb(Class p5)
    {
        int v1_0 = 0;
        while (v1_0 < 2) {
            com.google.android.gms.internal.auth.zzfu v2_0 = this.zza[v1_0];
            if (!v2_0.zzc(p5)) {
                v1_0++;
            } else {
                return v2_0.zzb(p5);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(p5.getName()));
    }

    public final boolean zzc(Class p5)
    {
        int v2 = 0;
        while (v2 < 2) {
            if (!this.zza[v2].zzc(p5)) {
                v2++;
            } else {
                return 1;
            }
        }
        return 0;
    }
}
