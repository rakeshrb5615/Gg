package com.google.android.gms.internal.play_billing;
final class zzdy extends com.google.android.gms.internal.play_billing.zzdu implements java.util.RandomAccess, com.google.android.gms.internal.play_billing.zzfn {
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;

    static zzdy()
    {
        boolean[] v1 = new boolean[0];
        com.google.android.gms.internal.play_billing.zzdy.zza = v1;
        new com.google.android.gms.internal.play_billing.zzdy(v1, 0, 0);
        return;
    }

    public zzdy()
    {
        this(com.google.android.gms.internal.play_billing.zzdy.zza, 0, 1);
        return;
    }

    private zzdy(boolean[] p1, int p2, boolean p3)
    {
        super(p3);
        super.zzb = p1;
        super.zzc = p2;
        return;
    }

    private static int zzg(int p4)
    {
        return v1.a.c(p4, 3, 2, 1, 10);
    }

    private final String zzh(int p4)
    {
        return v1.a.i("Index:", p4, this.zzc, ", Size:");
    }

    private final void zzi(int p2)
    {
        if ((p2 < null) || (p2 >= this.zzc)) {
            throw new IndexOutOfBoundsException(this.zzh(p2));
        } else {
            return;
        }
    }

    public final synthetic void add(int p5, Object p6)
    {
        IndexOutOfBoundsException v6_3 = ((Boolean) p6).booleanValue();
        this.zza();
        if (p5 >= 0) {
            boolean[] v0_4 = this.zzc;
            if (p5 <= v0_4) {
                int v1 = (p5 + 1);
                boolean[] v2_0 = this.zzb;
                int v3_0 = v2_0.length;
                if (v0_4 >= v3_0) {
                    boolean[] v0_1 = new boolean[com.google.android.gms.internal.play_billing.zzdy.zzg(v3_0)];
                    System.arraycopy(this.zzb, 0, v0_1, 0, p5);
                    System.arraycopy(this.zzb, p5, v0_1, v1, (this.zzc - p5));
                    this.zzb = v0_1;
                } else {
                    System.arraycopy(v2_0, p5, v2_0, v1, (v0_4 - p5));
                }
                this.zzb[p5] = v6_3;
                this.zzc = (this.zzc + 1);
                this.modCount = (this.modCount + 1);
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzh(p5));
    }

    public final bridge synthetic boolean add(Object p1)
    {
        this.zze(((Boolean) p1).booleanValue());
        return 1;
    }

    public final boolean addAll(java.util.Collection p6)
    {
        this.zza();
        Class vtmp1 = p6.getClass();
        if ((p6 instanceof com.google.android.gms.internal.play_billing.zzdy)) {
            int v0_5 = ((com.google.android.gms.internal.play_billing.zzdy) p6).zzc;
            if (v0_5 != 0) {
                int v2_1 = this.zzc;
                if ((2147483647 - v2_1) < v0_5) {
                    throw new OutOfMemoryError();
                } else {
                    int v2_0 = (v2_1 + v0_5);
                    int v0_0 = this.zzb;
                    if (v2_0 > v0_0.length) {
                        this.zzb = java.util.Arrays.copyOf(v0_0, v2_0);
                    }
                    System.arraycopy(((com.google.android.gms.internal.play_billing.zzdy) p6).zzb, 0, this.zzb, this.zzc, ((com.google.android.gms.internal.play_billing.zzdy) p6).zzc);
                    this.zzc = v2_0;
                    this.modCount = (this.modCount + 1);
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return super.addAll(p6);
        }
    }

    public final boolean contains(Object p2)
    {
        if (this.indexOf(p2) == -1) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean equals(Object p6)
    {
        if (this != p6) {
            if ((p6 instanceof com.google.android.gms.internal.play_billing.zzdy)) {
                if (this.zzc == ((com.google.android.gms.internal.play_billing.zzdy) p6).zzc) {
                    int v1_0 = 0;
                    while (v1_0 < this.zzc) {
                        if (this.zzb[v1_0] == ((com.google.android.gms.internal.play_billing.zzdy) p6).zzb[v1_0]) {
                            v1_0++;
                        } else {
                            return 0;
                        }
                    }
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return super.equals(p6);
            }
        } else {
            return 1;
        }
    }

    public final synthetic Object get(int p2)
    {
        this.zzi(p2);
        return Boolean.valueOf(this.zzb[p2]);
    }

    public final int hashCode()
    {
        int v0 = 0;
        int v1_0 = 1;
        while (v0 < this.zzc) {
            v1_0 = ((v1_0 * 31) + com.google.android.gms.internal.play_billing.zzfo.zza(this.zzb[v0]));
            v0++;
        }
        return v1_0;
    }

    public final int indexOf(Object p5)
    {
        if ((p5 instanceof Boolean)) {
            boolean v5_2 = ((Boolean) p5).booleanValue();
            int v2 = 0;
            while (v2 < this.zzc) {
                if (this.zzb[v2] != v5_2) {
                    v2++;
                } else {
                    return v2;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }

    public final bridge synthetic Object remove(int p5)
    {
        this.zza();
        this.zzi(p5);
        boolean[] v0 = this.zzb;
        boolean v1 = v0[p5];
        int v2_0 = this.zzc;
        if (p5 < (v2_0 - 1)) {
            System.arraycopy(v0, (p5 + 1), v0, p5, ((v2_0 - p5) - 1));
        }
        this.zzc = (this.zzc - 1);
        this.modCount = (this.modCount + 1);
        return Boolean.valueOf(v1);
    }

    public final void removeRange(int p3, int p4)
    {
        this.zza();
        if (p4 < p3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        } else {
            System.arraycopy(this.zzb, p4, this.zzb, p3, (this.zzc - p4));
            this.zzc = (this.zzc - (p4 - p3));
            this.modCount = (this.modCount + 1);
            return;
        }
    }

    public final bridge synthetic Object set(int p3, Object p4)
    {
        boolean v4_2 = ((Boolean) p4).booleanValue();
        this.zza();
        this.zzi(p3);
        boolean[] v0 = this.zzb;
        boolean v1 = v0[p3];
        v0[p3] = v4_2;
        return Boolean.valueOf(v1);
    }

    public final int size()
    {
        return this.zzc;
    }

    public final bridge synthetic com.google.android.gms.internal.play_billing.zzfn zzd(int p4)
    {
        if (p4 < this.zzc) {
            throw new IllegalArgumentException();
        } else {
            boolean[] v4_3;
            if (p4 != null) {
                v4_3 = java.util.Arrays.copyOf(this.zzb, p4);
            } else {
                v4_3 = com.google.android.gms.internal.play_billing.zzdy.zza;
            }
            return new com.google.android.gms.internal.play_billing.zzdy(v4_3, this.zzc, 1);
        }
    }

    public final void zze(boolean p5)
    {
        this.zza();
        int v1_2 = this.zzb.length;
        if (this.zzc == v1_2) {
            boolean[] v0_3 = new boolean[com.google.android.gms.internal.play_billing.zzdy.zzg(v1_2)];
            System.arraycopy(this.zzb, 0, v0_3, 0, this.zzc);
            this.zzb = v0_3;
        }
        boolean[] v0_1 = this.zzb;
        int v1_0 = this.zzc;
        this.zzc = (v1_0 + 1);
        v0_1[v1_0] = p5;
        return;
    }

    public final boolean zzf(int p2)
    {
        this.zzi(p2);
        return this.zzb[p2];
    }
}
