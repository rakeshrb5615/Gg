package com.google.android.gms.internal.measurement;
final class zzaq implements java.util.Iterator {
    final synthetic com.google.android.gms.internal.measurement.zzas zza;
    private int zzb;

    public zzaq(com.google.android.gms.internal.measurement.zzas p1)
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
        int v1 = this.zzb;
        if (v1 >= this.zza.zzb().length()) {
            throw new java.util.NoSuchElementException();
        } else {
            this.zzb = (v1 + 1);
            return new com.google.android.gms.internal.measurement.zzas(String.valueOf(v1));
        }
    }
}
