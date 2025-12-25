package com.google.android.gms.internal.play_billing;
final class zzer extends com.google.android.gms.internal.play_billing.zzdu implements java.util.RandomAccess, com.google.android.gms.internal.play_billing.zzfn {
    private static final double[] zza;
    private double[] zzb;
    private int zzc;

    static zzer()
    {
        double[] v1 = new double[0];
        com.google.android.gms.internal.play_billing.zzer.zza = v1;
        new com.google.android.gms.internal.play_billing.zzer(v1, 0, 0);
        return;
    }

    public zzer()
    {
        this(com.google.android.gms.internal.play_billing.zzer.zza, 0, 1);
        return;
    }

    private zzer(double[] p1, int p2, boolean p3)
    {
        super(p3);
        super.zzb = p1;
        super.zzc = p2;
        return;
    }

    private static int zzh(int p4)
    {
        return v1.a.c(p4, 3, 2, 1, 10);
    }

    private final String zzi(int p4)
    {
        return v1.a.i("Index:", p4, this.zzc, ", Size:");
    }

    private final void zzj(int p2)
    {
        if ((p2 < null) || (p2 >= this.zzc)) {
            throw new IndexOutOfBoundsException(this.zzi(p2));
        } else {
            return;
        }
    }

    public final synthetic void add(int p6, Object p7)
    {
        double v0 = ((Double) p7).doubleValue();
        this.zza();
        if (p6 >= 0) {
            double[] v7_7 = this.zzc;
            if (p6 <= v7_7) {
                int v2 = (p6 + 1);
                double[] v3_0 = this.zzb;
                int v4_0 = v3_0.length;
                if (v7_7 >= v4_0) {
                    double[] v7_4 = new double[com.google.android.gms.internal.play_billing.zzer.zzh(v4_0)];
                    System.arraycopy(this.zzb, 0, v7_4, 0, p6);
                    System.arraycopy(this.zzb, p6, v7_4, v2, (this.zzc - p6));
                    this.zzb = v7_4;
                } else {
                    System.arraycopy(v3_0, p6, v3_0, v2, (v7_7 - p6));
                }
                this.zzb[p6] = v0;
                this.zzc = (this.zzc + 1);
                this.modCount = (this.modCount + 1);
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzi(p6));
    }

    public final bridge synthetic boolean add(Object p3)
    {
        this.zzf(((Double) p3).doubleValue());
        return 1;
    }

    public final boolean addAll(java.util.Collection p6)
    {
        this.zza();
        Class vtmp1 = p6.getClass();
        if ((p6 instanceof com.google.android.gms.internal.play_billing.zzer)) {
            int v0_5 = ((com.google.android.gms.internal.play_billing.zzer) p6).zzc;
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
                    System.arraycopy(((com.google.android.gms.internal.play_billing.zzer) p6).zzb, 0, this.zzb, this.zzc, ((com.google.android.gms.internal.play_billing.zzer) p6).zzc);
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
            if ((p9 instanceof com.google.android.gms.internal.play_billing.zzer)) {
                if (this.zzc == ((com.google.android.gms.internal.play_billing.zzer) p9).zzc) {
                    int v1_0 = 0;
                    while (v1_0 < this.zzc) {
                        if (Double.doubleToLongBits(this.zzb[v1_0]) == Double.doubleToLongBits(((com.google.android.gms.internal.play_billing.zzer) p9).zzb[v1_0])) {
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
        this.zzj(p4);
        return Double.valueOf(this.zzb[p4]);
    }

    public final int hashCode()
    {
        int v0 = 0;
        int v1_0 = 1;
        while (v0 < this.zzc) {
            int v2_4 = Double.doubleToLongBits(this.zzb[v0]);
            v1_0 = ((v1_0 * 31) + ((int) (v2_4 ^ (v2_4 >> 32))));
            v0++;
        }
        return v1_0;
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
        this.zzj(p6);
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
        this.zzj(p5);
        double[] v6_2 = this.zzb;
        double v2 = v6_2[p5];
        v6_2[p5] = v0;
        return Double.valueOf(v2);
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
            double[] v4_3;
            if (p4 != null) {
                v4_3 = java.util.Arrays.copyOf(this.zzb, p4);
            } else {
                v4_3 = com.google.android.gms.internal.play_billing.zzer.zza;
            }
            return new com.google.android.gms.internal.play_billing.zzer(v4_3, this.zzc, 1);
        }
    }

    public final double zze(int p4)
    {
        this.zzj(p4);
        return this.zzb[p4];
    }

    public final void zzf(double p5)
    {
        this.zza();
        int v1_2 = this.zzb.length;
        if (this.zzc == v1_2) {
            double[] v0_3 = new double[com.google.android.gms.internal.play_billing.zzer.zzh(v1_2)];
            System.arraycopy(this.zzb, 0, v0_3, 0, this.zzc);
            this.zzb = v0_3;
        }
        double[] v0_1 = this.zzb;
        int v1_0 = this.zzc;
        this.zzc = (v1_0 + 1);
        v0_1[v1_0] = p5;
        return;
    }

    public final void zzg(int p2)
    {
        int v0_1 = this.zzb.length;
        if (p2 > v0_1) {
            if (v0_1 == 0) {
                double[] v2_4 = new double[Math.max(p2, 10)];
                this.zzb = v2_4;
                return;
            }
            while (v0_1 < p2) {
                v0_1 = com.google.android.gms.internal.play_billing.zzer.zzh(v0_1);
            }
            this.zzb = java.util.Arrays.copyOf(this.zzb, v0_1);
            return;
        } else {
            return;
        }
    }
}
