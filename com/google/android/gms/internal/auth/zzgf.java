package com.google.android.gms.internal.auth;
final class zzgf extends com.google.android.gms.internal.auth.zzdq implements java.util.RandomAccess {
    private static final com.google.android.gms.internal.auth.zzgf zza;
    private Object[] zzb;
    private int zzc;

    static zzgf()
    {
        Object[] v2 = new Object[0];
        com.google.android.gms.internal.auth.zzgf v0_1 = new com.google.android.gms.internal.auth.zzgf(v2, 0);
        com.google.android.gms.internal.auth.zzgf.zza = v0_1;
        v0_1.zzb();
        return;
    }

    public zzgf()
    {
        Object[] v0_1 = new Object[10];
        this(v0_1, 0);
        return;
    }

    private zzgf(Object[] p1, int p2)
    {
        this.zzb = p1;
        this.zzc = p2;
        return;
    }

    public static com.google.android.gms.internal.auth.zzgf zze()
    {
        return com.google.android.gms.internal.auth.zzgf.zza;
    }

    private final String zzf(int p4)
    {
        return v1.a.i("Index:", p4, this.zzc, ", Size:");
    }

    private final void zzg(int p2)
    {
        if ((p2 < null) || (p2 >= this.zzc)) {
            throw new IndexOutOfBoundsException(this.zzf(p2));
        } else {
            return;
        }
    }

    public final void add(int p5, Object p6)
    {
        this.zza();
        if (p5 >= 0) {
            Object[] v0_4 = this.zzc;
            if (p5 <= v0_4) {
                Object[] v1_1 = this.zzb;
                if (v0_4 >= v1_1.length) {
                    Object[] v0_3 = new Object[(((v0_4 * 3) / 2) + 1)];
                    System.arraycopy(v1_1, 0, v0_3, 0, p5);
                    System.arraycopy(this.zzb, p5, v0_3, (p5 + 1), (this.zzc - p5));
                    this.zzb = v0_3;
                } else {
                    System.arraycopy(v1_1, p5, v1_1, (p5 + 1), (v0_4 - p5));
                }
                this.zzb[p5] = p6;
                this.zzc = (this.zzc + 1);
                this.modCount = (this.modCount + 1);
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzf(p5));
    }

    public final boolean add(Object p5)
    {
        this.zza();
        Object[] v0_0 = this.zzc;
        int v1_1 = this.zzb;
        if (v0_0 == v1_1.length) {
            this.zzb = java.util.Arrays.copyOf(v1_1, (((v0_0 * 3) / 2) + 1));
        }
        Object[] v0_2 = this.zzb;
        int v1_0 = this.zzc;
        this.zzc = (v1_0 + 1);
        v0_2[v1_0] = p5;
        this.modCount = (this.modCount + 1);
        return 1;
    }

    public final Object get(int p2)
    {
        this.zzg(p2);
        return this.zzb[p2];
    }

    public final Object remove(int p5)
    {
        this.zza();
        this.zzg(p5);
        Object[] v0 = this.zzb;
        Object v1 = v0[p5];
        int v2_0 = this.zzc;
        if (p5 < (v2_0 - 1)) {
            System.arraycopy(v0, (p5 + 1), v0, p5, ((v2_0 - p5) - 1));
        }
        this.zzc = (this.zzc - 1);
        this.modCount = (this.modCount + 1);
        return v1;
    }

    public final Object set(int p3, Object p4)
    {
        this.zza();
        this.zzg(p3);
        Object[] v0 = this.zzb;
        Object v1 = v0[p3];
        v0[p3] = p4;
        this.modCount = (this.modCount + 1);
        return v1;
    }

    public final int size()
    {
        return this.zzc;
    }

    public final bridge synthetic com.google.android.gms.internal.auth.zzey zzd(int p3)
    {
        if (p3 < this.zzc) {
            throw new IllegalArgumentException();
        } else {
            return new com.google.android.gms.internal.auth.zzgf(java.util.Arrays.copyOf(this.zzb, p3), this.zzc);
        }
    }
}
