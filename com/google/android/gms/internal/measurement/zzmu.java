package com.google.android.gms.internal.measurement;
final class zzmu implements java.util.Iterator {
    private final java.util.Iterator zza;

    public zzmu(java.util.Iterator p1)
    {
        this.zza = p1;
        return;
    }

    public final boolean hasNext()
    {
        return this.zza.hasNext();
    }

    public final bridge synthetic Object next()
    {
        java.util.Map$Entry v0_2 = ((java.util.Map$Entry) this.zza.next());
        if (!(v0_2.getValue() instanceof com.google.android.gms.internal.measurement.zzmv)) {
            return v0_2;
        } else {
            return new com.google.android.gms.internal.measurement.zzmt(v0_2, 0);
        }
    }

    public final void remove()
    {
        this.zza.remove();
        return;
    }
}
