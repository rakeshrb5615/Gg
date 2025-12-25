package com.google.android.gms.internal.firebase-auth-api;
final class zzajy extends com.google.android.gms.internal.firebase-auth-api.zzaka {
    private int zza;
    private final int zzb;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzajv zzc;

    public zzajy(com.google.android.gms.internal.firebase-auth-api.zzajv p2)
    {
        java.util.Objects.requireNonNull(p2);
        this.zzc = p2;
        this.zza = 0;
        this.zzb = p2.zzb();
        return;
    }

    public final boolean hasNext()
    {
        if (this.zza >= this.zzb) {
            return 0;
        } else {
            return 1;
        }
    }

    public final byte zza()
    {
        java.util.NoSuchElementException v0_0 = this.zza;
        if (v0_0 >= this.zzb) {
            throw new java.util.NoSuchElementException();
        } else {
            this.zza = (v0_0 + 1);
            return this.zzc.zzb(v0_0);
        }
    }
}
