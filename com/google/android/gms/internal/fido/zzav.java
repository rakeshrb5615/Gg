package com.google.android.gms.internal.fido;
public abstract class zzav extends java.util.AbstractCollection implements java.io.Serializable {
    private static final Object[] zzl;

    static zzav()
    {
        Object[] v0_1 = new Object[0];
        com.google.android.gms.internal.fido.zzav.zzl = v0_1;
        return;
    }

    public zzav()
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

    public abstract boolean contains();

    public bridge synthetic java.util.Iterator iterator()
    {
        return this.zzd();
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

    public final Object[] toArray()
    {
        return this.toArray(com.google.android.gms.internal.fido.zzav.zzl);
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
            Object[] v3 = this.zze();
            if (v3 != null) {
                return java.util.Arrays.copyOfRange(v3, this.zzc(), this.zzb(), p5.getClass());
            } else {
                if (v1_1 != 0) {
                    p5 = java.util.Arrays.copyOf(p5, 0);
                }
                p5 = java.util.Arrays.copyOf(p5, v0_1);
            }
        }
        this.zza(p5, 0);
        return p5;
    }

    public int zza(Object[] p4, int p5)
    {
        p5 = this.zzd();
        int v0 = 0;
        while (p5.hasNext()) {
            int v2 = (v0 + 1);
            p4[v0] = p5.next();
            v0 = v2;
        }
        return v0;
    }

    public int zzb()
    {
        throw new UnsupportedOperationException();
    }

    public int zzc()
    {
        throw new UnsupportedOperationException();
    }

    public abstract com.google.android.gms.internal.fido.zzcb zzd();

    public Object[] zze()
    {
        return 0;
    }
}
