package com.google.android.gms.internal.firebase-auth-api;
final class zzali extends com.google.android.gms.internal.firebase-auth-api.zzajp implements com.google.android.gms.internal.firebase-auth-api.zzalm, java.util.RandomAccess {
    private static final int[] zza;
    private int[] zzb;
    private int zzc;

    static zzali()
    {
        int[] v1 = new int[0];
        com.google.android.gms.internal.firebase-auth-api.zzali.zza = v1;
        new com.google.android.gms.internal.firebase-auth-api.zzali(v1, 0, 0);
        return;
    }

    public zzali()
    {
        this(com.google.android.gms.internal.firebase-auth-api.zzali.zza, 0, 1);
        return;
    }

    private zzali(int[] p1, int p2, boolean p3)
    {
        super(p3);
        super.zzb = p1;
        super.zzc = p2;
        return;
    }

    private static int zze(int p4)
    {
        return v1.a.c(p4, 3, 2, 1, 10);
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
            int[] v0_5 = this.zzc;
            if (p5 <= v0_5) {
                int[] v1_0 = this.zzb;
                if (v0_5 >= v1_0.length) {
                    int[] v0_2 = new int[com.google.android.gms.internal.firebase-auth-api.zzali.zze(v1_0.length)];
                    System.arraycopy(this.zzb, 0, v0_2, 0, p5);
                    System.arraycopy(this.zzb, p5, v0_2, (p5 + 1), (this.zzc - p5));
                    this.zzb = v0_2;
                } else {
                    System.arraycopy(v1_0, p5, v1_0, (p5 + 1), (v0_5 - p5));
                }
                this.zzb[p5] = v6_3;
                this.zzc = (this.zzc + 1);
                this.modCount = (this.modCount + 1);
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzf(p5));
    }

    public final synthetic boolean add(Object p1)
    {
        this.zzc(((Integer) p1).intValue());
        return 1;
    }

    public final boolean addAll(java.util.Collection p6)
    {
        this.zza();
        com.google.android.gms.internal.firebase-auth-api.zzalh.zza(p6);
        if ((p6 instanceof com.google.android.gms.internal.firebase-auth-api.zzali)) {
            int v0_5 = ((com.google.android.gms.internal.firebase-auth-api.zzali) p6).zzc;
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
                    System.arraycopy(((com.google.android.gms.internal.firebase-auth-api.zzali) p6).zzb, 0, this.zzb, this.zzc, ((com.google.android.gms.internal.firebase-auth-api.zzali) p6).zzc);
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
            if ((p6 instanceof com.google.android.gms.internal.firebase-auth-api.zzali)) {
                if (this.zzc == ((com.google.android.gms.internal.firebase-auth-api.zzali) p6).zzc) {
                    int v1_0 = 0;
                    while (v1_0 < this.zzc) {
                        if (this.zzb[v1_0] == ((com.google.android.gms.internal.firebase-auth-api.zzali) p6).zzb[v1_0]) {
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

    public final synthetic Object get(int p1)
    {
        return Integer.valueOf(this.zzb(p1));
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
            int v0_1 = this.size();
            int v2 = 0;
            while (v2 < v0_1) {
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

    public final synthetic Object remove(int p5)
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

    public final synthetic Object set(int p3, Object p4)
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

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzalm zza(int p4)
    {
        if (p4 < this.zzc) {
            throw new IllegalArgumentException();
        } else {
            int[] v4_3;
            if (p4 != null) {
                v4_3 = java.util.Arrays.copyOf(this.zzb, p4);
            } else {
                v4_3 = com.google.android.gms.internal.firebase-auth-api.zzali.zza;
            }
            return new com.google.android.gms.internal.firebase-auth-api.zzali(v4_3, this.zzc, 1);
        }
    }

    public final int zzb(int p2)
    {
        this.zzg(p2);
        return this.zzb[p2];
    }

    public final void zzc(int p5)
    {
        this.zza();
        int v1_1 = this.zzb;
        if (this.zzc == v1_1.length) {
            int[] v0_4 = new int[com.google.android.gms.internal.firebase-auth-api.zzali.zze(v1_1.length)];
            System.arraycopy(this.zzb, 0, v0_4, 0, this.zzc);
            this.zzb = v0_4;
        }
        int[] v0_1 = this.zzb;
        int v1_0 = this.zzc;
        this.zzc = (v1_0 + 1);
        v0_1[v1_0] = p5;
        return;
    }

    public final void zzd(int p3)
    {
        int v0_0 = this.zzb;
        if (p3 > v0_0.length) {
            if (v0_0.length != 0) {
                int v0_1 = v0_0.length;
                while (v0_1 < p3) {
                    v0_1 = com.google.android.gms.internal.firebase-auth-api.zzali.zze(v0_1);
                }
                this.zzb = java.util.Arrays.copyOf(this.zzb, v0_1);
                return;
            } else {
                int[] v3_2 = new int[Math.max(p3, 10)];
                this.zzb = v3_2;
                return;
            }
        } else {
            return;
        }
    }
}
