package com.google.android.gms.internal.firebase-auth-api;
final class zzana extends com.google.android.gms.internal.firebase-auth-api.zzajp implements java.util.RandomAccess {
    private static final Object[] zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzana zzb;
    private Object[] zzc;
    private int zzd;

    static zzana()
    {
        Object[] v1 = new Object[0];
        com.google.android.gms.internal.firebase-auth-api.zzana.zza = v1;
        com.google.android.gms.internal.firebase-auth-api.zzana.zzb = new com.google.android.gms.internal.firebase-auth-api.zzana(v1, 0, 0);
        return;
    }

    public zzana()
    {
        this(com.google.android.gms.internal.firebase-auth-api.zzana.zza, 0, 1);
        return;
    }

    private zzana(Object[] p1, int p2, boolean p3)
    {
        super(p3);
        super.zzc = p1;
        super.zzd = p2;
        return;
    }

    private static int zzb(int p4)
    {
        return v1.a.c(p4, 3, 2, 1, 10);
    }

    private final String zzc(int p4)
    {
        return v1.a.i("Index:", p4, this.zzd, ", Size:");
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzana zzd()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzana.zzb;
    }

    private final void zzd(int p2)
    {
        if ((p2 < null) || (p2 >= this.zzd)) {
            throw new IndexOutOfBoundsException(this.zzc(p2));
        } else {
            return;
        }
    }

    public final void add(int p5, Object p6)
    {
        this.zza();
        if (p5 >= 0) {
            Object[] v0_3 = this.zzd;
            if (p5 <= v0_3) {
                Object[] v1_2 = this.zzc;
                if (v0_3 >= v1_2.length) {
                    Object[] v0_2 = new Object[com.google.android.gms.internal.firebase-auth-api.zzana.zzb(v1_2.length)];
                    System.arraycopy(this.zzc, 0, v0_2, 0, p5);
                    System.arraycopy(this.zzc, p5, v0_2, (p5 + 1), (this.zzd - p5));
                    this.zzc = v0_2;
                } else {
                    System.arraycopy(v1_2, p5, v1_2, (p5 + 1), (v0_3 - p5));
                }
                this.zzc[p5] = p6;
                this.zzd = (this.zzd + 1);
                this.modCount = (this.modCount + 1);
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzc(p5));
    }

    public final boolean add(Object p4)
    {
        this.zza();
        int v1_1 = this.zzc;
        if (this.zzd == v1_1.length) {
            this.zzc = java.util.Arrays.copyOf(this.zzc, com.google.android.gms.internal.firebase-auth-api.zzana.zzb(v1_1.length));
        }
        int v0_2 = this.zzc;
        int v1_0 = this.zzd;
        this.zzd = (v1_0 + 1);
        v0_2[v1_0] = p4;
        this.modCount = (this.modCount + 1);
        return 1;
    }

    public final Object get(int p2)
    {
        this.zzd(p2);
        return this.zzc[p2];
    }

    public final Object remove(int p5)
    {
        this.zza();
        this.zzd(p5);
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
        this.zzd(p3);
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

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzalm zza(int p4)
    {
        if (p4 < this.zzd) {
            throw new IllegalArgumentException();
        } else {
            Object[] v4_3;
            if (p4 != null) {
                v4_3 = java.util.Arrays.copyOf(this.zzc, p4);
            } else {
                v4_3 = com.google.android.gms.internal.firebase-auth-api.zzana.zza;
            }
            return new com.google.android.gms.internal.firebase-auth-api.zzana(v4_3, this.zzd, 1);
        }
    }
}
