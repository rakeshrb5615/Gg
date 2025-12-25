package com.google.android.gms.measurement.internal;
final class zzbd implements java.util.Iterator {
    final java.util.Iterator zza;
    final synthetic com.google.android.gms.measurement.internal.zzbe zzb;

    public zzbd(com.google.android.gms.measurement.internal.zzbe p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        this.zza = p1.zzg().keySet().iterator();
        return;
    }

    public final boolean hasNext()
    {
        return this.zza.hasNext();
    }

    public final bridge synthetic Object next()
    {
        return this.zza();
    }

    public final void remove()
    {
        throw new UnsupportedOperationException("Remove not supported");
    }

    public final String zza()
    {
        return ((String) this.zza.next());
    }
}
