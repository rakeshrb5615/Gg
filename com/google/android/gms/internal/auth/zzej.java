package com.google.android.gms.internal.auth;
final class zzej extends com.google.android.gms.internal.auth.zzdq implements java.util.RandomAccess, com.google.android.gms.internal.auth.zzey, com.google.android.gms.internal.auth.zzgd {
    private static final com.google.android.gms.internal.auth.zzej zza;
    private double[] zzb;
    private int zzc;

    static zzej()
    {
        double[] v2 = new double[0];
        com.google.android.gms.internal.auth.zzej v0_1 = new com.google.android.gms.internal.auth.zzej(v2, 0);
        com.google.android.gms.internal.auth.zzej.zza = v0_1;
        v0_1.zzb();
        return;
    }

    public zzej()
    {
        double[] v0_1 = new double[10];
        this(v0_1, 0);
        return;
    }

    private zzej(double[] p1, int p2)
    {
        this.zzb = p1;
        this.zzc = p2;
        return;
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

    public final synthetic void add(int p6, Object p7)
    {
        double v0 = ((Double) p7).doubleValue();
        this.zza();
        if (p6 >= 0) {
            double[] v7_9 = this.zzc;
            if (p6 <= v7_9) {
                double[] v2_0 = this.zzb;
                if (v7_9 >= v2_0.length) {
                    double[] v7_6 = new double[(((v7_9 * 3) / 2) + 1)];
                    System.arraycopy(v2_0, 0, v7_6, 0, p6);
                    System.arraycopy(this.zzb, p6, v7_6, (p6 + 1), (this.zzc - p6));
                    this.zzb = v7_6;
                } else {
                    System.arraycopy(v2_0, p6, v2_0, (p6 + 1), (v7_9 - p6));
                }
                this.zzb[p6] = v0;
                this.zzc = (this.zzc + 1);
                this.modCount = (this.modCount + 1);
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzf(p6));
    }

    public final bridge synthetic boolean add(Object p3)
    {
        this.zze(((Double) p3).doubleValue());
        return 1;
    }

    public final boolean addAll(java.util.Collection p6)
    {
        this.zza();
        com.google.android.gms.internal.auth.zzez.zze(p6);
        if ((p6 instanceof com.google.android.gms.internal.auth.zzej)) {
            int v0_5 = ((com.google.android.gms.internal.auth.zzej) p6).zzc;
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
                    System.arraycopy(((com.google.android.gms.internal.auth.zzej) p6).zzb, 0, this.zzb, this.zzc, ((com.google.android.gms.internal.auth.zzej) p6).zzc);
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

    public final boolean equals(Object p9)
    {
        if (this != p9) {
            if ((p9 instanceof com.google.android.gms.internal.auth.zzej)) {
                if (this.zzc == ((com.google.android.gms.internal.auth.zzej) p9).zzc) {
                    int v1_0 = 0;
                    while (v1_0 < this.zzc) {
                        if (Double.doubleToLongBits(this.zzb[v1_0]) == Double.doubleToLongBits(((com.google.android.gms.internal.auth.zzej) p9).zzb[v1_0])) {
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
                return super.equals(p9);
            }
        } else {
            return 1;
        }
    }

    public final synthetic Object get(int p4)
    {
        this.zzg(p4);
        return Double.valueOf(this.zzb[p4]);
    }

    public final int hashCode()
    {
        int v0_0 = 1;
        int v1 = 0;
        while (v1 < this.zzc) {
            v0_0 = ((v0_0 * 31) + com.google.android.gms.internal.auth.zzez.zzc(Double.doubleToLongBits(this.zzb[v1])));
            v1++;
        }
        return v0_0;
    }

    public final int indexOf(Object p8)
    {
        if ((p8 instanceof Double)) {
            double v2 = ((Double) p8).doubleValue();
            int v0_1 = 0;
            while (v0_1 < this.zzc) {
                if (this.zzb[v0_1] != v2) {
                    v0_1++;
                } else {
                    return v0_1;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }

    public final bridge synthetic Object remove(int p6)
    {
        this.zza();
        this.zzg(p6);
        double[] v0 = this.zzb;
        double v1 = v0[p6];
        int v3_0 = this.zzc;
        if (p6 < (v3_0 - 1)) {
            System.arraycopy(v0, (p6 + 1), v0, p6, ((v3_0 - p6) - 1));
        }
        this.zzc = (this.zzc - 1);
        this.modCount = (this.modCount + 1);
        return Double.valueOf(v1);
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

    public final bridge synthetic Object set(int p5, Object p6)
    {
        double v0 = ((Double) p6).doubleValue();
        this.zza();
        this.zzg(p5);
        double[] v6_2 = this.zzb;
        double v2 = v6_2[p5];
        v6_2[p5] = v0;
        return Double.valueOf(v2);
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
            return new com.google.android.gms.internal.auth.zzej(java.util.Arrays.copyOf(this.zzb, p3), this.zzc);
        }
    }

    public final void zze(double p5)
    {
        this.zza();
        double[] v0_0 = this.zzc;
        int v1_1 = this.zzb;
        if (v0_0 == v1_1.length) {
            int v2_5 = new double[(((v0_0 * 3) / 2) + 1)];
            System.arraycopy(v1_1, 0, v2_5, 0, v0_0);
            this.zzb = v2_5;
        }
        double[] v0_1 = this.zzb;
        int v1_0 = this.zzc;
        this.zzc = (v1_0 + 1);
        v0_1[v1_0] = p5;
        return;
    }
}
