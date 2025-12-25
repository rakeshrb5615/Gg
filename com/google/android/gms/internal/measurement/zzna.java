package com.google.android.gms.internal.measurement;
final class zzna extends com.google.android.gms.internal.measurement.zzku implements java.util.RandomAccess, com.google.android.gms.internal.measurement.zzmn, com.google.android.gms.internal.measurement.zznt {
    private static final long[] zza;
    private static final com.google.android.gms.internal.measurement.zzna zzb;
    private long[] zzc;
    private int zzd;

    static zzna()
    {
        long[] v1 = new long[0];
        com.google.android.gms.internal.measurement.zzna.zza = v1;
        com.google.android.gms.internal.measurement.zzna.zzb = new com.google.android.gms.internal.measurement.zzna(v1, 0, 0);
        return;
    }

    public zzna()
    {
        this(com.google.android.gms.internal.measurement.zzna.zza, 0, 1);
        return;
    }

    private zzna(long[] p1, int p2, boolean p3)
    {
        super(p3);
        super.zzc = p1;
        super.zzd = p2;
        return;
    }

    public static com.google.android.gms.internal.measurement.zzna zze()
    {
        return com.google.android.gms.internal.measurement.zzna.zzb;
    }

    private static int zzi(int p4)
    {
        return v1.a.c(p4, 3, 2, 1, 10);
    }

    private final void zzj(int p2)
    {
        if ((p2 < null) || (p2 >= this.zzd)) {
            throw new IndexOutOfBoundsException(this.zzk(p2));
        } else {
            return;
        }
    }

    private final String zzk(int p5)
    {
        return com.google.android.gms.internal.measurement.zzkw.zza(this.zzd, p5, 13, "Index:", ", Size:");
    }

    public final synthetic void add(int p6, Object p7)
    {
        long v0 = ((Long) p7).longValue();
        this.zzcF();
        if (p6 >= 0) {
            long[] v7_7 = this.zzd;
            if (p6 <= v7_7) {
                int v2 = (p6 + 1);
                long[] v3_0 = this.zzc;
                int v4_0 = v3_0.length;
                if (v7_7 >= v4_0) {
                    long[] v7_4 = new long[com.google.android.gms.internal.measurement.zzna.zzi(v4_0)];
                    System.arraycopy(this.zzc, 0, v7_4, 0, p6);
                    System.arraycopy(this.zzc, p6, v7_4, v2, (this.zzd - p6));
                    this.zzc = v7_4;
                } else {
                    System.arraycopy(v3_0, p6, v3_0, v2, (v7_7 - p6));
                }
                this.zzc[p6] = v0;
                this.zzd = (this.zzd + 1);
                this.modCount = (this.modCount + 1);
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzk(p6));
    }

    public final bridge synthetic boolean add(Object p3)
    {
        this.zzf(((Long) p3).longValue());
        return 1;
    }

    public final boolean addAll(java.util.Collection p6)
    {
        this.zzcF();
        Class vtmp1 = p6.getClass();
        if ((p6 instanceof com.google.android.gms.internal.measurement.zzna)) {
            int v0_5 = ((com.google.android.gms.internal.measurement.zzna) p6).zzd;
            if (v0_5 != 0) {
                int v2_1 = this.zzd;
                if ((2147483647 - v2_1) < v0_5) {
                    throw new OutOfMemoryError();
                } else {
                    int v2_0 = (v2_1 + v0_5);
                    int v0_0 = this.zzc;
                    if (v2_0 > v0_0.length) {
                        this.zzc = java.util.Arrays.copyOf(v0_0, v2_0);
                    }
                    System.arraycopy(((com.google.android.gms.internal.measurement.zzna) p6).zzc, 0, this.zzc, this.zzd, ((com.google.android.gms.internal.measurement.zzna) p6).zzd);
                    this.zzd = v2_0;
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
            if ((p9 instanceof com.google.android.gms.internal.measurement.zzna)) {
                if (this.zzd == ((com.google.android.gms.internal.measurement.zzna) p9).zzd) {
                    int v1_0 = 0;
                    while (v1_0 < this.zzd) {
                        if (this.zzc[v1_0] == ((com.google.android.gms.internal.measurement.zzna) p9).zzc[v1_0]) {
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
        return Long.valueOf(this.zzc[p4]);
    }

    public final int hashCode()
    {
        int v0 = 0;
        int v1_0 = 1;
        while (v0 < this.zzd) {
            long v3 = this.zzc[v0];
            v1_0 = ((v1_0 * 31) + ((int) (v3 ^ (v3 >> 32))));
            v0++;
        }
        return v1_0;
    }

    public final int indexOf(Object p8)
    {
        if ((p8 instanceof Long)) {
            long v2 = ((Long) p8).longValue();
            int v0_1 = 0;
            while (v0_1 < this.zzd) {
                if (this.zzc[v0_1] != v2) {
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
        this.zzcF();
        this.zzj(p6);
        long[] v0 = this.zzc;
        long v1 = v0[p6];
        int v3_0 = this.zzd;
        if (p6 < (v3_0 - 1)) {
            System.arraycopy(v0, (p6 + 1), v0, p6, ((v3_0 - p6) - 1));
        }
        this.zzd = (this.zzd - 1);
        this.modCount = (this.modCount + 1);
        return Long.valueOf(v1);
    }

    public final void removeRange(int p3, int p4)
    {
        this.zzcF();
        if (p4 < p3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        } else {
            System.arraycopy(this.zzc, p4, this.zzc, p3, (this.zzd - p4));
            this.zzd = (this.zzd - (p4 - p3));
            this.modCount = (this.modCount + 1);
            return;
        }
    }

    public final bridge synthetic Object set(int p5, Object p6)
    {
        long v0 = ((Long) p6).longValue();
        this.zzcF();
        this.zzj(p5);
        long[] v6_2 = this.zzc;
        long v2 = v6_2[p5];
        v6_2[p5] = v0;
        return Long.valueOf(v2);
    }

    public final int size()
    {
        return this.zzd;
    }

    public final long zzc(int p4)
    {
        this.zzj(p4);
        return this.zzc[p4];
    }

    public final com.google.android.gms.internal.measurement.zzmn zzd(int p4)
    {
        if (p4 < this.zzd) {
            throw new IllegalArgumentException();
        } else {
            long[] v4_3;
            if (p4 != null) {
                v4_3 = java.util.Arrays.copyOf(this.zzc, p4);
            } else {
                v4_3 = com.google.android.gms.internal.measurement.zzna.zza;
            }
            return new com.google.android.gms.internal.measurement.zzna(v4_3, this.zzd, 1);
        }
    }

    public final void zzf(long p5)
    {
        this.zzcF();
        int v1_2 = this.zzc.length;
        if (this.zzd == v1_2) {
            long[] v0_3 = new long[com.google.android.gms.internal.measurement.zzna.zzi(v1_2)];
            System.arraycopy(this.zzc, 0, v0_3, 0, this.zzd);
            this.zzc = v0_3;
        }
        long[] v0_1 = this.zzc;
        int v1_0 = this.zzd;
        this.zzd = (v1_0 + 1);
        v0_1[v1_0] = p5;
        return;
    }

    public final bridge synthetic com.google.android.gms.internal.measurement.zzmo zzg(int p1)
    {
        return this.zzd(p1);
    }

    public final void zzh(int p2)
    {
        int v0_1 = this.zzc.length;
        if (p2 > v0_1) {
            if (v0_1 == 0) {
                long[] v2_4 = new long[Math.max(p2, 10)];
                this.zzc = v2_4;
                return;
            }
            while (v0_1 < p2) {
                v0_1 = com.google.android.gms.internal.measurement.zzna.zzi(v0_1);
            }
            this.zzc = java.util.Arrays.copyOf(this.zzc, v0_1);
            return;
        } else {
            return;
        }
    }
}
