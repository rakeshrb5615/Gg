package com.google.android.gms.internal.fido;
public abstract class zzbi extends com.google.android.gms.internal.fido.zzbj implements java.util.NavigableSet, com.google.android.gms.internal.fido.zzbz {
    final transient java.util.Comparator zza;
    transient com.google.android.gms.internal.fido.zzbi zzb;

    public zzbi(java.util.Comparator p1)
    {
        this.zza = p1;
        return;
    }

    public static com.google.android.gms.internal.fido.zzbu zzq(java.util.Comparator p2)
    {
        if (!com.google.android.gms.internal.fido.zzbp.zza.equals(p2)) {
            return new com.google.android.gms.internal.fido.zzbu(com.google.android.gms.internal.fido.zzbs.zza, p2);
        } else {
            return com.google.android.gms.internal.fido.zzbu.zzc;
        }
    }

    public Object ceiling(Object p2)
    {
        p2.getClass();
        return com.google.android.gms.internal.fido.zzbk.zza(this.zzp(p2, 1), 0);
    }

    public final java.util.Comparator comparator()
    {
        return this.zza;
    }

    public bridge synthetic java.util.Iterator descendingIterator()
    {
        return this.zzr();
    }

    public final bridge synthetic java.util.NavigableSet descendingSet()
    {
        return this.zzl();
    }

    public Object first()
    {
        return this.zzd().next();
    }

    public Object floor(Object p2)
    {
        p2.getClass();
        return com.google.android.gms.internal.fido.zzbm.zza(this.zzm(p2, 1).zzr(), 0);
    }

    public final synthetic java.util.NavigableSet headSet(Object p1, boolean p2)
    {
        p1.getClass();
        return this.zzm(p1, p2);
    }

    public final synthetic java.util.SortedSet headSet(Object p2)
    {
        p2.getClass();
        return this.zzm(p2, 0);
    }

    public Object higher(Object p2)
    {
        p2.getClass();
        return com.google.android.gms.internal.fido.zzbk.zza(this.zzp(p2, 0), 0);
    }

    public bridge synthetic java.util.Iterator iterator()
    {
        return this.zzd();
    }

    public Object last()
    {
        return this.zzr().next();
    }

    public Object lower(Object p2)
    {
        p2.getClass();
        return com.google.android.gms.internal.fido.zzbm.zza(this.zzm(p2, 0).zzr(), 0);
    }

    public final Object pollFirst()
    {
        throw new UnsupportedOperationException();
    }

    public final Object pollLast()
    {
        throw new UnsupportedOperationException();
    }

    public final bridge synthetic java.util.NavigableSet subSet(Object p1, boolean p2, Object p3, boolean p4)
    {
        return this.zzn(p1, p2, p3, p4);
    }

    public final bridge synthetic java.util.SortedSet subSet(Object p3, Object p4)
    {
        return this.zzn(p3, 1, p4, 0);
    }

    public final synthetic java.util.NavigableSet tailSet(Object p1, boolean p2)
    {
        p1.getClass();
        return this.zzp(p1, p2);
    }

    public final synthetic java.util.SortedSet tailSet(Object p2)
    {
        p2.getClass();
        return this.zzp(p2, 1);
    }

    public abstract com.google.android.gms.internal.fido.zzcb zzd();

    public abstract com.google.android.gms.internal.fido.zzbi zzf();

    public final com.google.android.gms.internal.fido.zzbi zzl()
    {
        com.google.android.gms.internal.fido.zzbi v0 = this.zzb;
        if (v0 == null) {
            v0 = this.zzf();
            this.zzb = v0;
            v0.zzb = this;
        }
        return v0;
    }

    public abstract com.google.android.gms.internal.fido.zzbi zzm();

    public final com.google.android.gms.internal.fido.zzbi zzn(Object p2, boolean p3, Object p4, boolean p5)
    {
        int v0_2;
        p2.getClass();
        p4.getClass();
        if (this.zza.compare(p2, p4) > 0) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        com.google.android.gms.internal.fido.zzap.zzc(v0_2);
        return this.zzo(p2, p3, p4, p5);
    }

    public abstract com.google.android.gms.internal.fido.zzbi zzo();

    public abstract com.google.android.gms.internal.fido.zzbi zzp();

    public abstract com.google.android.gms.internal.fido.zzcb zzr();
}
