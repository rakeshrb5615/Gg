package com.google.android.gms.internal.auth;
final class zzev extends com.google.android.gms.internal.auth.zzdq implements java.util.RandomAccess, com.google.android.gms.internal.auth.zzey, com.google.android.gms.internal.auth.zzgd {
    private static final com.google.android.gms.internal.auth.zzev zza;
    private int[] zzb;
    private int zzc;

    static zzev()
    {
        int[] v2 = new int[0];
        com.google.android.gms.internal.auth.zzev v0_1 = new com.google.android.gms.internal.auth.zzev(v2, 0);
        com.google.android.gms.internal.auth.zzev.zza = v0_1;
        v0_1.zzb();
        return;
    }

    public zzev()
    {
        int[] v0_1 = new int[10];
        this(v0_1, 0);
        return;
    }

    private zzev(int[] p1, int p2)
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

    public final synthetic void add(int p5, Object p6)
    {
        IndexOutOfBoundsException v6_3 = ((Integer) p6).intValue();
        this.zza();
        if (p5 >= 0) {
            int[] v0_6 = this.zzc;
            if (p5 <= v0_6) {
                int[] v1_0 = this.zzb;
                if (v0_6 >= v1_0.length) {
                    int[] v0_3 = new int[(((v0_6 * 3) / 2) + 1)];
                    System.arraycopy(v1_0, 0, v0_3, 0, p5);
                    System.arraycopy(this.zzb, p5, v0_3, (p5 + 1), (this.zzc - p5));
                    this.zzb = v0_3;
                } else {
                    System.arraycopy(v1_0, p5, v1_0, (p5 + 1), (v0_6 - p5));
                }
                this.zzb[p5] = v6_3;
                this.zzc = (this.zzc + 1);
                this.modCount = (this.modCount + 1);
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzf(p5));
    }

    public final bridge synthetic boolean add(Object p1)
    {
        this.zze(((Integer) p1).intValue());
        return 1;
    }

    public final boolean addAll(java.util.Collection p6)
    {
        this.zza();
        com.google.android.gms.internal.auth.zzez.zze(p6);
        if ((p6 instanceof com.google.android.gms.internal.auth.zzev)) {
            int v0_5 = ((com.google.android.gms.internal.auth.zzev) p6).zzc;
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
                    System.arraycopy(((com.google.android.gms.internal.auth.zzev) p6).zzb, 0, this.zzb, this.zzc, ((com.google.android.gms.internal.auth.zzev) p6).zzc);
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
            if ((p6 instanceof com.google.android.gms.internal.auth.zzev)) {
                if (this.zzc == ((com.google.android.gms.internal.auth.zzev) p6).zzc) {
                    int v1_0 = 0;
                    while (v1_0 < this.zzc) {
                        if (this.zzb[v1_0] == ((com.google.android.gms.internal.auth.zzev) p6).zzb[v1_0]) {
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
        this.zzg(p2);
        return Integer.valueOf(this.zzb[p2]);
    }

    public final int hashCode()
    {
        int v0_0 = 1;
        int v1 = 0;
        while (v1 < this.zzc) {
            v0_0 = ((v0_0 * 31) + this.zzb[v1]);
            v1++;
        }
        return v0_0;
    }

    public final int indexOf(Object p5)
    {
        if ((p5 instanceof Integer)) {
            int v5_2 = ((Integer) p5).intValue();
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
        this.zzg(p5);
        int[] v0 = this.zzb;
        int v1 = v0[p5];
        int v2_0 = this.zzc;
        if (p5 < (v2_0 - 1)) {
            System.arraycopy(v0, (p5 + 1), v0, p5, ((v2_0 - p5) - 1));
        }
        this.zzc = (this.zzc - 1);
        this.modCount = (this.modCount + 1);
        return Integer.valueOf(v1);
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
        int v4_2 = ((Integer) p4).intValue();
        this.zza();
        this.zzg(p3);
        int[] v0 = this.zzb;
        int v1 = v0[p3];
        v0[p3] = v4_2;
        return Integer.valueOf(v1);
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
            return new com.google.android.gms.internal.auth.zzev(java.util.Arrays.copyOf(this.zzb, p3), this.zzc);
        }
    }

    public final void zze(int p5)
    {
        this.zza();
        int[] v0_0 = this.zzc;
        int v1_1 = this.zzb;
        if (v0_0 == v1_1.length) {
            int v2_5 = new int[(((v0_0 * 3) / 2) + 1)];
            System.arraycopy(v1_1, 0, v2_5, 0, v0_0);
            this.zzb = v2_5;
        }
        int[] v0_1 = this.zzb;
        int v1_0 = this.zzc;
        this.zzc = (v1_0 + 1);
        v0_1[v1_0] = p5;
        return;
    }
}
