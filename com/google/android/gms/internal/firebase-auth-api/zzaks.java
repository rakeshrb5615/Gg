package com.google.android.gms.internal.firebase-auth-api;
final class zzaks extends com.google.android.gms.internal.firebase-auth-api.zzajp implements com.google.android.gms.internal.firebase-auth-api.zzalm, java.util.RandomAccess {
    private static final double[] zza;
    private double[] zzb;
    private int zzc;

    static zzaks()
    {
        double[] v1 = new double[0];
        com.google.android.gms.internal.firebase-auth-api.zzaks.zza = v1;
        new com.google.android.gms.internal.firebase-auth-api.zzaks(v1, 0, 0);
        return;
    }

    public zzaks()
    {
        this(com.google.android.gms.internal.firebase-auth-api.zzaks.zza, 0, 1);
        return;
    }

    private zzaks(double[] p1, int p2, boolean p3)
    {
        super(p3);
        super.zzb = p1;
        super.zzc = p2;
        return;
    }

    private static int zzd(int p4)
    {
        return v1.a.c(p4, 3, 2, 1, 10);
    }

    private final String zze(int p4)
    {
        return v1.a.i("Index:", p4, this.zzc, ", Size:");
    }

    private final void zzf(int p2)
    {
        if ((p2 < null) || (p2 >= this.zzc)) {
            throw new IndexOutOfBoundsException(this.zze(p2));
        } else {
            return;
        }
    }

    public final synthetic void add(int p6, Object p7)
    {
        double v0 = ((Double) p7).doubleValue();
        this.zza();
        if (p6 >= 0) {
            double[] v7_8 = this.zzc;
            if (p6 <= v7_8) {
                double[] v2_0 = this.zzb;
                if (v7_8 >= v2_0.length) {
                    double[] v7_5 = new double[com.google.android.gms.internal.firebase-auth-api.zzaks.zzd(v2_0.length)];
                    System.arraycopy(this.zzb, 0, v7_5, 0, p6);
                    System.arraycopy(this.zzb, p6, v7_5, (p6 + 1), (this.zzc - p6));
                    this.zzb = v7_5;
                } else {
                    System.arraycopy(v2_0, p6, v2_0, (p6 + 1), (v7_8 - p6));
                }
                this.zzb[p6] = v0;
                this.zzc = (this.zzc + 1);
                this.modCount = (this.modCount + 1);
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zze(p6));
    }

    public final synthetic boolean add(Object p3)
    {
        this.zza(((Double) p3).doubleValue());
        return 1;
    }

    public final boolean addAll(java.util.Collection p6)
    {
        this.zza();
        com.google.android.gms.internal.firebase-auth-api.zzalh.zza(p6);
        if ((p6 instanceof com.google.android.gms.internal.firebase-auth-api.zzaks)) {
            int v0_5 = ((com.google.android.gms.internal.firebase-auth-api.zzaks) p6).zzc;
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
                    System.arraycopy(((com.google.android.gms.internal.firebase-auth-api.zzaks) p6).zzb, 0, this.zzb, this.zzc, ((com.google.android.gms.internal.firebase-auth-api.zzaks) p6).zzc);
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
            if ((p9 instanceof com.google.android.gms.internal.firebase-auth-api.zzaks)) {
                if (this.zzc == ((com.google.android.gms.internal.firebase-auth-api.zzaks) p9).zzc) {
                    int v1_0 = 0;
                    while (v1_0 < this.zzc) {
                        if (Double.doubleToLongBits(this.zzb[v1_0]) == Double.doubleToLongBits(((com.google.android.gms.internal.firebase-auth-api.zzaks) p9).zzb[v1_0])) {
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

    public final synthetic Object get(int p3)
    {
        return Double.valueOf(this.zzb(p3));
    }

    public final int hashCode()
    {
        int v0_0 = 1;
        int v1 = 0;
        while (v1 < this.zzc) {
            v0_0 = ((v0_0 * 31) + com.google.android.gms.internal.firebase-auth-api.zzalh.zza(Double.doubleToLongBits(this.zzb[v1])));
            v1++;
        }
        return v0_0;
    }

    public final int indexOf(Object p8)
    {
        if ((p8 instanceof Double)) {
            double v2 = ((Double) p8).doubleValue();
            int v8_2 = this.size();
            int v0_1 = 0;
            while (v0_1 < v8_2) {
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

    public final synthetic Object remove(int p6)
    {
        this.zza();
        this.zzf(p6);
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

    public final synthetic Object set(int p5, Object p6)
    {
        double v0 = ((Double) p6).doubleValue();
        this.zza();
        this.zzf(p5);
        double[] v6_2 = this.zzb;
        double v2 = v6_2[p5];
        v6_2[p5] = v0;
        return Double.valueOf(v2);
    }

    public final int size()
    {
        return this.zzc;
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzalm zza(int p4)
    {
        if (p4 < this.zzc) {
            throw new IllegalArgumentException();
        } else {
            double[] v4_3;
            if (p4 != null) {
                v4_3 = java.util.Arrays.copyOf(this.zzb, p4);
            } else {
                v4_3 = com.google.android.gms.internal.firebase-auth-api.zzaks.zza;
            }
            return new com.google.android.gms.internal.firebase-auth-api.zzaks(v4_3, this.zzc, 1);
        }
    }

    public final void zza(double p5)
    {
        this.zza();
        int v1_1 = this.zzb;
        if (this.zzc == v1_1.length) {
            double[] v0_4 = new double[com.google.android.gms.internal.firebase-auth-api.zzaks.zzd(v1_1.length)];
            System.arraycopy(this.zzb, 0, v0_4, 0, this.zzc);
            this.zzb = v0_4;
        }
        double[] v0_1 = this.zzb;
        int v1_0 = this.zzc;
        this.zzc = (v1_0 + 1);
        v0_1[v1_0] = p5;
        return;
    }

    public final double zzb(int p4)
    {
        this.zzf(p4);
        return this.zzb[p4];
    }

    public final void zzc(int p3)
    {
        int v0_0 = this.zzb;
        if (p3 > v0_0.length) {
            if (v0_0.length != 0) {
                int v0_1 = v0_0.length;
                while (v0_1 < p3) {
                    v0_1 = com.google.android.gms.internal.firebase-auth-api.zzaks.zzd(v0_1);
                }
                this.zzb = java.util.Arrays.copyOf(this.zzb, v0_1);
                return;
            } else {
                double[] v3_2 = new double[Math.max(p3, 10)];
                this.zzb = v3_2;
                return;
            }
        } else {
            return;
        }
    }
}
