package com.google.android.gms.internal.firebase-auth-api;
public abstract class zzag extends java.util.AbstractCollection implements java.io.Serializable {
    private static final Object[] zza;

    static zzag()
    {
        Object[] v0_1 = new Object[0];
        com.google.android.gms.internal.firebase-auth-api.zzag.zza = v0_1;
        return;
    }

    public zzag()
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

    public synthetic java.util.Iterator iterator()
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

    public java.util.Spliterator spliterator()
    {
        return java.util.Spliterators.spliterator(this, 1296);
    }

    public final Object[] toArray()
    {
        return this.toArray(com.google.android.gms.internal.firebase-auth-api.zzag.zza);
    }

    public final Object[] toArray(Object[] p4)
    {
        com.google.android.gms.internal.firebase-auth-api.zzu.zza(p4);
        int v0_0 = this.size();
        if (p4.length >= v0_0) {
            if (p4.length > v0_0) {
                p4[v0_0] = 0;
            }
        } else {
            int v1_0 = this.zze();
            if (v1_0 == 0) {
                if (p4.length != 0) {
                    p4 = java.util.Arrays.copyOf(p4, 0);
                }
                p4 = java.util.Arrays.copyOf(p4, v0_0);
            } else {
                return java.util.Arrays.copyOfRange(v1_0, this.zzb(), this.zza(), p4.getClass());
            }
        }
        this.zza(p4, 0);
        return p4;
    }

    public int zza()
    {
        throw new UnsupportedOperationException();
    }

    public int zza(Object[] p4, int p5)
    {
        com.google.android.gms.internal.firebase-auth-api.zzay v0_1 = ((com.google.android.gms.internal.firebase-auth-api.zzay) this.iterator());
        while (v0_1.hasNext()) {
            int v2 = (p5 + 1);
            p4[p5] = v0_1.next();
            p5 = v2;
        }
        return p5;
    }

    public int zzb()
    {
        throw new UnsupportedOperationException();
    }

    public com.google.android.gms.internal.firebase-auth-api.zzah zzc()
    {
        if (!this.isEmpty()) {
            return com.google.android.gms.internal.firebase-auth-api.zzah.zza(this.toArray());
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzah.zzg();
        }
    }

    public abstract com.google.android.gms.internal.firebase-auth-api.zzay zzd();

    public Object[] zze()
    {
        return 0;
    }
}
