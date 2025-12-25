package com.google.android.gms.internal.measurement;
final class zzmg extends com.google.android.gms.internal.measurement.zzku implements java.util.RandomAccess, com.google.android.gms.internal.measurement.zzmm, com.google.android.gms.internal.measurement.zznt {
    private static final int[] zza;
    private static final com.google.android.gms.internal.measurement.zzmg zzb;
    private int[] zzc;
    private int zzd;

    static zzmg()
    {
        int[] v1 = new int[0];
        com.google.android.gms.internal.measurement.zzmg.zza = v1;
        com.google.android.gms.internal.measurement.zzmg.zzb = new com.google.android.gms.internal.measurement.zzmg(v1, 0, 0);
        return;
    }

    public zzmg()
    {
        this(com.google.android.gms.internal.measurement.zzmg.zza, 0, 1);
        return;
    }

    private zzmg(int[] p1, int p2, boolean p3)
    {
        super(p3);
        super.zzc = p1;
        super.zzd = p2;
        return;
    }

    public static com.google.android.gms.internal.measurement.zzmg zzd()
    {
        return com.google.android.gms.internal.measurement.zzmg.zzb;
    }

    private static int zzj(int p4)
    {
        return v1.a.c(p4, 3, 2, 1, 10);
    }

    private final void zzk(int p2)
    {
        if ((p2 < null) || (p2 >= this.zzd)) {
            throw new IndexOutOfBoundsException(this.zzl(p2));
        } else {
            return;
        }
    }

    private final String zzl(int p5)
    {
        return com.google.android.gms.internal.measurement.zzkw.zza(this.zzd, p5, 13, "Index:", ", Size:");
    }

    public final synthetic void add(int p5, Object p6)
    {
        IndexOutOfBoundsException v6_3 = ((Integer) p6).intValue();
        this.zzcF();
        if (p5 >= 0) {
            int[] v0_4 = this.zzd;
            if (p5 <= v0_4) {
                int v1 = (p5 + 1);
                int[] v2_0 = this.zzc;
                int v3_0 = v2_0.length;
                if (v0_4 >= v3_0) {
                    int[] v0_1 = new int[com.google.android.gms.internal.measurement.zzmg.zzj(v3_0)];
                    System.arraycopy(this.zzc, 0, v0_1, 0, p5);
                    System.arraycopy(this.zzc, p5, v0_1, v1, (this.zzd - p5));
                    this.zzc = v0_1;
                } else {
                    System.arraycopy(v2_0, p5, v2_0, v1, (v0_4 - p5));
                }
                this.zzc[p5] = v6_3;
                this.zzd = (this.zzd + 1);
                this.modCount = (this.modCount + 1);
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzl(p5));
    }

    public final bridge synthetic boolean add(Object p1)
    {
        this.zzh(((Integer) p1).intValue());
        return 1;
    }

    public final boolean addAll(java.util.Collection p6)
    {
        this.zzcF();
        Class vtmp1 = p6.getClass();
        if ((p6 instanceof com.google.android.gms.internal.measurement.zzmg)) {
            int v0_5 = ((com.google.android.gms.internal.measurement.zzmg) p6).zzd;
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
                    System.arraycopy(((com.google.android.gms.internal.measurement.zzmg) p6).zzc, 0, this.zzc, this.zzd, ((com.google.android.gms.internal.measurement.zzmg) p6).zzd);
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

    public final boolean equals(Object p6)
    {
        if (this != p6) {
            if ((p6 instanceof com.google.android.gms.internal.measurement.zzmg)) {
                if (this.zzd == ((com.google.android.gms.internal.measurement.zzmg) p6).zzd) {
                    int v1_0 = 0;
                    while (v1_0 < this.zzd) {
                        if (this.zzc[v1_0] == ((com.google.android.gms.internal.measurement.zzmg) p6).zzc[v1_0]) {
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
        this.zzk(p2);
        return Integer.valueOf(this.zzc[p2]);
    }

    public final int hashCode()
    {
        int v0 = 0;
        int v1_0 = 1;
        while (v0 < this.zzd) {
            v1_0 = ((v1_0 * 31) + this.zzc[v0]);
            v0++;
        }
        return v1_0;
    }

    public final int indexOf(Object p5)
    {
        if ((p5 instanceof Integer)) {
            int v5_2 = ((Integer) p5).intValue();
            int v2 = 0;
            while (v2 < this.zzd) {
                if (this.zzc[v2] != v5_2) {
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
        this.zzcF();
        this.zzk(p5);
        int[] v0 = this.zzc;
        int v1 = v0[p5];
        int v2_0 = this.zzd;
        if (p5 < (v2_0 - 1)) {
            System.arraycopy(v0, (p5 + 1), v0, p5, ((v2_0 - p5) - 1));
        }
        this.zzd = (this.zzd - 1);
        this.modCount = (this.modCount + 1);
        return Integer.valueOf(v1);
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

    public final bridge synthetic Object set(int p3, Object p4)
    {
        int v4_2 = ((Integer) p4).intValue();
        this.zzcF();
        this.zzk(p3);
        int[] v0 = this.zzc;
        int v1 = v0[p3];
        v0[p3] = v4_2;
        return Integer.valueOf(v1);
    }

    public final int size()
    {
        return this.zzd;
    }

    public final com.google.android.gms.internal.measurement.zzmm zze(int p4)
    {
        if (p4 < this.zzd) {
            throw new IllegalArgumentException();
        } else {
            int[] v4_3;
            if (p4 != null) {
                v4_3 = java.util.Arrays.copyOf(this.zzc, p4);
            } else {
                v4_3 = com.google.android.gms.internal.measurement.zzmg.zza;
            }
            return new com.google.android.gms.internal.measurement.zzmg(v4_3, this.zzd, 1);
        }
    }

    public final int zzf(int p2)
    {
        this.zzk(p2);
        return this.zzc[p2];
    }

    public final bridge synthetic com.google.android.gms.internal.measurement.zzmo zzg(int p1)
    {
        return this.zze(p1);
    }

    public final void zzh(int p5)
    {
        this.zzcF();
        int v1_2 = this.zzc.length;
        if (this.zzd == v1_2) {
            int[] v0_3 = new int[com.google.android.gms.internal.measurement.zzmg.zzj(v1_2)];
            System.arraycopy(this.zzc, 0, v0_3, 0, this.zzd);
            this.zzc = v0_3;
        }
        int[] v0_1 = this.zzc;
        int v1_0 = this.zzd;
        this.zzd = (v1_0 + 1);
        v0_1[v1_0] = p5;
        return;
    }

    public final void zzi(int p2)
    {
        int v0_1 = this.zzc.length;
        if (p2 > v0_1) {
            if (v0_1 == 0) {
                int[] v2_4 = new int[Math.max(p2, 10)];
                this.zzc = v2_4;
                return;
            }
            while (v0_1 < p2) {
                v0_1 = com.google.android.gms.internal.measurement.zzmg.zzj(v0_1);
            }
            this.zzc = java.util.Arrays.copyOf(this.zzc, v0_1);
            return;
        } else {
            return;
        }
    }
}
