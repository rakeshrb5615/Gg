package com.google.android.gms.internal.play_billing;
final class zzgt extends com.google.android.gms.internal.play_billing.zzdu implements java.util.RandomAccess {
    private static final Object[] zza;
    private static final com.google.android.gms.internal.play_billing.zzgt zzb;
    private Object[] zzc;
    private int zzd;

    static zzgt()
    {
        Object[] v1 = new Object[0];
        com.google.android.gms.internal.play_billing.zzgt.zza = v1;
        com.google.android.gms.internal.play_billing.zzgt.zzb = new com.google.android.gms.internal.play_billing.zzgt(v1, 0, 0);
        return;
    }

    public zzgt()
    {
        this(com.google.android.gms.internal.play_billing.zzgt.zza, 0, 1);
        return;
    }

    private zzgt(Object[] p1, int p2, boolean p3)
    {
        super(p3);
        super.zzc = p1;
        super.zzd = p2;
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzgt zze()
    {
        return com.google.android.gms.internal.play_billing.zzgt.zzb;
    }

    private static int zzg(int p4)
    {
        return v1.a.c(p4, 3, 2, 1, 10);
    }

    private final String zzh(int p4)
    {
        return v1.a.i("Index:", p4, this.zzd, ", Size:");
    }

    private final void zzi(int p2)
    {
        if ((p2 < null) || (p2 >= this.zzd)) {
            throw new IndexOutOfBoundsException(this.zzh(p2));
        } else {
            return;
        }
    }

    public final void add(int p5, Object p6)
    {
        this.zza();
        if (p5 >= 0) {
            Object[] v0_2 = this.zzd;
            if (p5 <= v0_2) {
                int v1 = (p5 + 1);
                Object[] v2_0 = this.zzc;
                int v3_0 = v2_0.length;
                if (v0_2 >= v3_0) {
                    Object[] v0_1 = new Object[com.google.android.gms.internal.play_billing.zzgt.zzg(v3_0)];
                    System.arraycopy(this.zzc, 0, v0_1, 0, p5);
                    System.arraycopy(this.zzc, p5, v0_1, v1, (this.zzd - p5));
                    this.zzc = v0_1;
                } else {
                    System.arraycopy(v2_0, p5, v2_0, v1, (v0_2 - p5));
                }
                this.zzc[p5] = p6;
                this.zzd = (this.zzd + 1);
                this.modCount = (this.modCount + 1);
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzh(p5));
    }

    public final boolean add(Object p4)
    {
        this.zza();
        int v1_2 = this.zzc.length;
        if (this.zzd == v1_2) {
            this.zzc = java.util.Arrays.copyOf(this.zzc, com.google.android.gms.internal.play_billing.zzgt.zzg(v1_2));
        }
        int v0_1 = this.zzc;
        int v1_0 = this.zzd;
        this.zzd = (v1_0 + 1);
        v0_1[v1_0] = p4;
        this.modCount = (this.modCount + 1);
        return 1;
    }

    public final Object get(int p2)
    {
        this.zzi(p2);
        return this.zzc[p2];
    }

    public final Object remove(int p5)
    {
        this.zza();
        this.zzi(p5);
        Object[] v0 = this.zzc;
        Object v1 = v0[p5];
        int v2_0 = this.zzd;
        if (p5 < (v2_0 - 1)) {
            System.arraycopy(v0, (p5 + 1), v0, p5, ((v2_0 - p5) - 1));
        }
        this.zzd = (this.zzd - 1);
        this.modCount = (this.modCount + 1);
        return v1;
    }

    public final Object set(int p3, Object p4)
    {
        this.zza();
        this.zzi(p3);
        Object[] v0 = this.zzc;
        Object v1 = v0[p3];
        v0[p3] = p4;
        this.modCount = (this.modCount + 1);
        return v1;
    }

    public final int size()
    {
        return this.zzd;
    }

    public final bridge synthetic com.google.android.gms.internal.play_billing.zzfn zzd(int p4)
    {
        if (p4 < this.zzd) {
            throw new IllegalArgumentException();
        } else {
            Object[] v4_3;
            if (p4 != null) {
                v4_3 = java.util.Arrays.copyOf(this.zzc, p4);
            } else {
                v4_3 = com.google.android.gms.internal.play_billing.zzgt.zza;
            }
            return new com.google.android.gms.internal.play_billing.zzgt(v4_3, this.zzd, 1);
        }
    }

    public final void zzf(int p2)
    {
        int v0_1 = this.zzc.length;
        if (p2 > v0_1) {
            if (v0_1 == 0) {
                Object[] v2_4 = new Object[Math.max(p2, 10)];
                this.zzc = v2_4;
                return;
            }
            while (v0_1 < p2) {
                v0_1 = com.google.android.gms.internal.play_billing.zzgt.zzg(v0_1);
            }
            this.zzc = java.util.Arrays.copyOf(this.zzc, v0_1);
            return;
        } else {
            return;
        }
    }
}
