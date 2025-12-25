package com.google.android.gms.internal.measurement;
final class zzar implements java.util.Iterator {
    final synthetic com.google.android.gms.internal.measurement.zzas zza;
    private int zzb;

    public zzar(com.google.android.gms.internal.measurement.zzas p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        this.zzb = 0;
        return;
    }

    public final boolean hasNext()
    {
        if (this.zzb >= this.zza.zzb().length()) {
            return 0;
        } else {
            return 1;
        }
    }

    public final bridge synthetic Object next()
    {
        java.util.NoSuchElementException v0_0 = this.zza;
        int v2 = this.zzb;
        if (v2 >= v0_0.zzb().length()) {
            throw new java.util.NoSuchElementException();
        } else {
            this.zzb = (v2 + 1);
            return new com.google.android.gms.internal.measurement.zzas(String.valueOf(v0_0.zzb().charAt(v2)));
        }
    }
}
