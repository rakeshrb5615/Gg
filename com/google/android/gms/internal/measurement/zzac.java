package com.google.android.gms.internal.measurement;
final class zzac implements java.util.Iterator {
    final synthetic java.util.Iterator zza;
    final synthetic java.util.Iterator zzb;

    public zzac(com.google.android.gms.internal.measurement.zzae p1, java.util.Iterator p2, java.util.Iterator p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        return;
    }

    public final boolean hasNext()
    {
        if (!this.zza.hasNext()) {
            return this.zzb.hasNext();
        } else {
            return 1;
        }
    }

    public final bridge synthetic Object next()
    {
        java.util.NoSuchElementException v0_0 = this.zza;
        if (!v0_0.hasNext()) {
            java.util.NoSuchElementException v0_6 = this.zzb;
            if (!v0_6.hasNext()) {
                throw new java.util.NoSuchElementException();
            } else {
                return new com.google.android.gms.internal.measurement.zzas(((String) v0_6.next()));
            }
        } else {
            return new com.google.android.gms.internal.measurement.zzas(((Integer) v0_0.next()).toString());
        }
    }
}
