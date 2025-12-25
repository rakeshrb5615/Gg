package com.google.android.gms.internal.firebase-auth-api;
public abstract class zzajv implements java.io.Serializable, java.lang.Iterable {
    public static final com.google.android.gms.internal.firebase-auth-api.zzajv zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzakc zzb;
    private int zzc;

    static zzajv()
    {
        com.google.android.gms.internal.firebase-auth-api.zzajv.zza = new com.google.android.gms.internal.firebase-auth-api.zzakg(com.google.android.gms.internal.firebase-auth-api.zzalh.zzb);
        com.google.android.gms.internal.firebase-auth-api.zzajv.zzb = new com.google.android.gms.internal.firebase-auth-api.zzakf(0);
        new com.google.android.gms.internal.firebase-auth-api.zzajx();
        return;
    }

    public zzajv()
    {
        this.zzc = 0;
        return;
    }

    public static synthetic int zza(byte p0)
    {
        return (p0 & 255);
    }

    public static int zza(int p3, int p4, int p5)
    {
        String v0_0 = (p4 - p3);
        if ((((p3 | p4) | v0_0) | (p5 - p4)) >= 0) {
            return v0_0;
        } else {
            if (p3 < null) {
                throw new IndexOutOfBoundsException(v1.a.j("Beginning index: ", p3, " < 0"));
            } else {
                if (p4 >= p3) {
                    throw new IndexOutOfBoundsException(v1.a.i("End index: ", p4, p5, " >= "));
                } else {
                    throw new IndexOutOfBoundsException(v1.a.i("Beginning index larger than ending index: ", p3, p4, ", "));
                }
            }
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzajv zza(String p2)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzakg(p2.getBytes(com.google.android.gms.internal.firebase-auth-api.zzalh.zza));
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzajv zza(byte[] p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzajv.zza(p2, 0, p2.length);
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzajv zza(byte[] p2, int p3, int p4)
    {
        com.google.android.gms.internal.firebase-auth-api.zzajv.zza(p3, (p3 + p4), p2.length);
        return new com.google.android.gms.internal.firebase-auth-api.zzakg(com.google.android.gms.internal.firebase-auth-api.zzajv.zzb.zza(p2, p3, p4));
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzajv zzb(byte[] p1)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzakg(p1);
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzake zzc(int p2)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzake(p2, 0);
    }

    public abstract boolean equals();

    public final int hashCode()
    {
        int v0_0 = this.zzc;
        if (v0_0 == 0) {
            v0_0 = this.zzb(this.zzb(), 0, this.zzb());
            if (v0_0 == 0) {
                v0_0 = 1;
            }
            this.zzc = v0_0;
        }
        return v0_0;
    }

    public synthetic java.util.Iterator iterator()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzajy(this);
    }

    public final String toString()
    {
        String v2_3;
        String v0_5 = Integer.toHexString(System.identityHashCode(this));
        int v1 = this.zzb();
        if (this.zzb() > 50) {
            v2_3 = g2.g.d(com.google.android.gms.internal.firebase-auth-api.zzann.zza(this.zza(0, 47)), "...");
        } else {
            v2_3 = com.google.android.gms.internal.firebase-auth-api.zzann.zza(this);
        }
        StringBuilder v3_3 = new StringBuilder("<ByteString@");
        v3_3.append(v0_5);
        v3_3.append(" size=");
        v3_3.append(v1);
        v3_3.append(" contents=\"");
        return v1.a.n(v3_3, v2_3, "\">");
    }

    public abstract byte zza();

    public final int zza()
    {
        return this.zzc;
    }

    public abstract com.google.android.gms.internal.firebase-auth-api.zzajv zza();

    public abstract void zza();

    public abstract void zza();

    public abstract byte zzb();

    public abstract int zzb();

    public abstract int zzb();

    public abstract com.google.android.gms.internal.firebase-auth-api.zzakh zzc();

    public final byte[] zzd()
    {
        byte[] v0_0 = this.zzb();
        if (v0_0 != null) {
            byte[] v1 = new byte[v0_0];
            this.zza(v1, 0, 0, v0_0);
            return v1;
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzalh.zzb;
        }
    }
}
