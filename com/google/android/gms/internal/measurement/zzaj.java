package com.google.android.gms.internal.measurement;
final class zzaj implements java.util.Iterator {
    final synthetic java.util.Iterator zza;

    public zzaj(java.util.Iterator p1)
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
        return new com.google.android.gms.internal.measurement.zzas(((String) this.zza.next()));
    }
}
