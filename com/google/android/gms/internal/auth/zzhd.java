package com.google.android.gms.internal.auth;
public final class zzhd extends java.util.AbstractList implements java.util.RandomAccess, com.google.android.gms.internal.auth.zzfe {
    private final com.google.android.gms.internal.auth.zzfe zza;

    public zzhd(com.google.android.gms.internal.auth.zzfe p1)
    {
        this.zza = p1;
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.auth.zzfe zza(com.google.android.gms.internal.auth.zzhd p0)
    {
        return p0.zza;
    }

    public final bridge synthetic Object get(int p2)
    {
        return ((com.google.android.gms.internal.auth.zzfd) this.zza).zzf(p2);
    }

    public final java.util.Iterator iterator()
    {
        return new com.google.android.gms.internal.auth.zzhc(this);
    }

    public final java.util.ListIterator listIterator(int p2)
    {
        return new com.google.android.gms.internal.auth.zzhb(this, p2);
    }

    public final int size()
    {
        return this.zza.size();
    }

    public final com.google.android.gms.internal.auth.zzfe zze()
    {
        return this;
    }

    public final java.util.List zzg()
    {
        return this.zza.zzg();
    }
}
