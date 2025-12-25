package com.google.android.gms.internal.location;
public abstract class zzeu extends java.util.AbstractCollection implements java.io.Serializable {
    private static final Object[] zza;

    static zzeu()
    {
        Object[] v0_1 = new Object[0];
        com.google.android.gms.internal.location.zzeu.zza = v0_1;
        return;
    }

    public zzeu()
    {
        return;
    }

    public final boolean add(Object p1)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(java.util.Collection p1)
    {
        throw new UnsupportedOperationException();
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public bridge synthetic java.util.Iterator iterator()
    {
        return this.zza();
    }

    public final boolean remove(Object p1)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(java.util.Collection p1)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(java.util.Collection p1)
    {
        throw new UnsupportedOperationException();
    }

    public final java.util.Spliterator spliterator()
    {
        return java.util.Spliterators.spliterator(this, 1296);
    }

    public final Object[] toArray()
    {
        return this.toArray(com.google.android.gms.internal.location.zzeu.zza);
    }

    public final Object[] toArray(Object[] p5)
    {
        p5.getClass();
        int v0_1 = this.size();
        int v1_1 = p5.length;
        if (v1_1 >= v0_1) {
            if (v1_1 > v0_1) {
                p5[v0_1] = 0;
            }
        } else {
            Object[] v3 = this.zzb();
            if (v3 != null) {
                return java.util.Arrays.copyOfRange(v3, this.zzc(), this.zzd(), p5.getClass());
            } else {
                if (v1_1 != 0) {
                    p5 = java.util.Arrays.copyOf(p5, 0);
                }
                p5 = java.util.Arrays.copyOf(p5, v0_1);
            }
        }
        this.zzg(p5, 0);
        return p5;
    }

    public abstract com.google.android.gms.internal.location.zzez zza();

    public Object[] zzb()
    {
        throw 0;
    }

    public int zzc()
    {
        throw 0;
    }

    public int zzd()
    {
        throw 0;
    }

    public com.google.android.gms.internal.location.zzex zze()
    {
        throw 0;
    }

    public abstract boolean zzf();

    public int zzg(Object[] p1, int p2)
    {
        throw 0;
    }
}
