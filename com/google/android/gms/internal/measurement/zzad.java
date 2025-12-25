package com.google.android.gms.internal.measurement;
final class zzad implements java.util.Iterator {
    final synthetic com.google.android.gms.internal.measurement.zzae zza;
    private int zzb;

    public zzad(com.google.android.gms.internal.measurement.zzae p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        this.zzb = 0;
        return;
    }

    public final boolean hasNext()
    {
        if (this.zzb >= this.zza.zzh()) {
            return 0;
        } else {
            return 1;
        }
    }

    public final bridge synthetic Object next()
    {
        java.util.NoSuchElementException v0_0 = this.zza;
        if (this.zzb >= v0_0.zzh()) {
            String v1_3 = this.zzb;
            throw new java.util.NoSuchElementException(v1.a.m(new StringBuilder((String.valueOf(v1_3).length() + 21)), "Out of bounds index: ", v1_3));
        } else {
            String v1_2 = this.zzb;
            this.zzb = (v1_2 + 1);
            return v0_0.zzl(v1_2);
        }
    }
}
