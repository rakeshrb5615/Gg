package com.google.android.gms.location;
public final class zza {
    private long zza;

    public zza()
    {
        this.zza = -9223372036854775808;
        return;
    }

    public final com.google.android.gms.location.zza zza(long p3)
    {
        int v0_2;
        if (p3 < 0) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_2, "intervalMillis can\'t be negative.");
        this.zza = p3;
        return this;
    }

    public final com.google.android.gms.location.zzb zzb()
    {
        int v0_2;
        if (this.zza == -9223372036854775808) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v0_2, "Must set intervalMillis.");
        return new com.google.android.gms.location.zzb(this.zza, 1, 0, 0, 0, 0, 0, 0, 0);
    }
}
