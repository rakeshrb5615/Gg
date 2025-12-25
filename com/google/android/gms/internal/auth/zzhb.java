package com.google.android.gms.internal.auth;
final class zzhb implements java.util.ListIterator {
    final java.util.ListIterator zza;
    final synthetic int zzb;
    final synthetic com.google.android.gms.internal.auth.zzhd zzc;

    public zzhb(com.google.android.gms.internal.auth.zzhd p1, int p2)
    {
        this.zzc = p1;
        this.zzb = p2;
        this.zza = com.google.android.gms.internal.auth.zzhd.zza(p1).listIterator(p2);
        return;
    }

    public final synthetic void add(Object p1)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext()
    {
        return this.zza.hasNext();
    }

    public final boolean hasPrevious()
    {
        return this.zza.hasPrevious();
    }

    public final bridge synthetic Object next()
    {
        return ((String) this.zza.next());
    }

    public final int nextIndex()
    {
        return this.zza.nextIndex();
    }

    public final bridge synthetic Object previous()
    {
        return ((String) this.zza.previous());
    }

    public final int previousIndex()
    {
        return this.zza.previousIndex();
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }

    public final synthetic void set(Object p1)
    {
        throw new UnsupportedOperationException();
    }
}
