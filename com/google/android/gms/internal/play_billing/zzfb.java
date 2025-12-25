package com.google.android.gms.internal.play_billing;
final class zzfb extends com.google.android.gms.internal.play_billing.zzdu implements java.util.RandomAccess, com.google.android.gms.internal.play_billing.zzfn {
    private static final float[] zza;
    private float[] zzb;
    private int zzc;

    static zzfb()
    {
        float[] v1 = new float[0];
        com.google.android.gms.internal.play_billing.zzfb.zza = v1;
        new com.google.android.gms.internal.play_billing.zzfb(v1, 0, 0);
        return;
    }

    public zzfb()
    {
        this(com.google.android.gms.internal.play_billing.zzfb.zza, 0, 1);
        return;
    }

    private zzfb(float[] p1, int p2, boolean p3)
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

    public final synthetic void add(int p5, Object p6)
    {
        IndexOutOfBoundsException v6_3 = ((Float) p6).floatValue();
        this.zza();
        if (p5 >= 0) {
            float[] v0_4 = this.zzc;
            if (p5 <= v0_4) {
                int v1 = (p5 + 1);
                float[] v2_0 = this.zzb;
                int v3_0 = v2_0.length;
                if (v0_4 >= v3_0) {
                    float[] v0_1 = new float[com.google.android.gms.internal.play_billing.zzfb.zzh(v3_0)];
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
        throw new IndexOutOfBoundsException(this.zzi(p5));
    }

    public final bridge synthetic boolean add(Object p1)
    {
        this.zzf(((Float) p1).floatValue());
        return 1;
    }

    public final boolean addAll(java.util.Collection p6)
    {
        this.zza();
        Class vtmp1 = p6.getClass();
        if ((p6 instanceof com.google.android.gms.internal.play_billing.zzfb)) {
            int v0_5 = ((com.google.android.gms.internal.play_billing.zzfb) p6).zzc;
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
                    System.arraycopy(((com.google.android.gms.internal.play_billing.zzfb) p6).zzb, 0, this.zzb, this.zzc, ((com.google.android.gms.internal.play_billing.zzfb) p6).zzc);
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
            if ((p6 instanceof com.google.android.gms.internal.play_billing.zzfb)) {
                if (this.zzc == ((com.google.android.gms.internal.play_billing.zzfb) p6).zzc) {
                    int v1_0 = 0;
                    while (v1_0 < this.zzc) {
                        if (Float.floatToIntBits(this.zzb[v1_0]) == Float.floatToIntBits(((com.google.android.gms.internal.play_billing.zzfb) p6).zzb[v1_0])) {
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
        this.zzj(p2);
        return Float.valueOf(this.zzb[p2]);
    }

    public final int hashCode()
    {
        int v0 = 0;
        int v1_0 = 1;
        while (v0 < this.zzc) {
            v1_0 = ((v1_0 * 31) + Float.floatToIntBits(this.zzb[v0]));
            v0++;
        }
        return v1_0;
    }

    public final int indexOf(Object p5)
    {
        if ((p5 instanceof Float)) {
            float v5_2 = ((Float) p5).floatValue();
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
        this.zzj(p5);
        float[] v0 = this.zzb;
        float v1 = v0[p5];
        int v2_0 = this.zzc;
        if (p5 < (v2_0 - 1)) {
            System.arraycopy(v0, (p5 + 1), v0, p5, ((v2_0 - p5) - 1));
        }
        this.zzc = (this.zzc - 1);
        this.modCount = (this.modCount + 1);
        return Float.valueOf(v1);
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
        float v4_2 = ((Float) p4).floatValue();
        this.zza();
        this.zzj(p3);
        float[] v0 = this.zzb;
        float v1 = v0[p3];
        v0[p3] = v4_2;
        return Float.valueOf(v1);
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
            float[] v4_3;
            if (p4 != null) {
                v4_3 = java.util.Arrays.copyOf(this.zzb, p4);
            } else {
                v4_3 = com.google.android.gms.internal.play_billing.zzfb.zza;
            }
            return new com.google.android.gms.internal.play_billing.zzfb(v4_3, this.zzc, 1);
        }
    }

    public final float zze(int p2)
    {
        this.zzj(p2);
        return this.zzb[p2];
    }

    public final void zzf(float p5)
    {
        this.zza();
        int v1_2 = this.zzb.length;
        if (this.zzc == v1_2) {
            float[] v0_3 = new float[com.google.android.gms.internal.play_billing.zzfb.zzh(v1_2)];
            System.arraycopy(this.zzb, 0, v0_3, 0, this.zzc);
            this.zzb = v0_3;
        }
        float[] v0_1 = this.zzb;
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
                float[] v2_4 = new float[Math.max(p2, 10)];
                this.zzb = v2_4;
                return;
            }
            while (v0_1 < p2) {
                v0_1 = com.google.android.gms.internal.play_billing.zzfb.zzh(v0_1);
            }
            this.zzb = java.util.Arrays.copyOf(this.zzb, v0_1);
            return;
        } else {
            return;
        }
    }
}
