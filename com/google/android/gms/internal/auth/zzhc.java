package com.google.android.gms.internal.auth;
final class zzhc implements java.util.Iterator {
    final java.util.Iterator zza;
    final synthetic com.google.android.gms.internal.auth.zzhd zzb;

    public zzhc(com.google.android.gms.internal.auth.zzhd p1)
    {
        this.zzb = p1;
        this.zza = com.google.android.gms.internal.auth.zzhd.zza(p1).iterator();
        return;
    }

    public final boolean hasNext()
    {
        return this.zza.hasNext();
    }

    public final bridge synthetic Object next()
    {
        return ((String) this.zza.next());
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }
}
