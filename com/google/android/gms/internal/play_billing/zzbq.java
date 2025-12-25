package com.google.android.gms.internal.play_billing;
public abstract class zzbq extends java.util.AbstractCollection implements java.io.Serializable {
    private static final Object[] zza;

    static zzbq()
    {
        Object[] v0_1 = new Object[0];
        com.google.android.gms.internal.play_billing.zzbq.zza = v0_1;
        return;
    }

    public zzbq()
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
        return this.zze();
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
        return this.toArray(com.google.android.gms.internal.play_billing.zzbq.zza);
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
            Object[] v3 = this.zzg();
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

    public int zza(Object[] p1, int p2)
    {
        throw 0;
    }

    public int zzb()
    {
        throw new UnsupportedOperationException();
    }

    public int zzc()
    {
        throw new UnsupportedOperationException();
    }

    public com.google.android.gms.internal.play_billing.zzbt zzd()
    {
        throw 0;
    }

    public abstract com.google.android.gms.internal.play_billing.zzch zze();

    public abstract boolean zzf();

    public Object[] zzg()
    {
        return 0;
    }
}
