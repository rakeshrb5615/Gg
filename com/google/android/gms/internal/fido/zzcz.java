package com.google.android.gms.internal.fido;
public abstract class zzcz implements java.lang.Iterable, java.io.Serializable {
    private static final java.util.Comparator zza;
    public static final com.google.android.gms.internal.fido.zzcz zzb;
    private static final com.google.android.gms.internal.fido.zzcy zzd;
    private int zzc;

    static zzcz()
    {
        com.google.android.gms.internal.fido.zzcz.zzb = new com.google.android.gms.internal.fido.zzcw(com.google.android.gms.internal.fido.zzde.zzd);
        com.google.android.gms.internal.fido.zzcz.zzd = new com.google.android.gms.internal.fido.zzcy(0);
        com.google.android.gms.internal.fido.zzcz.zza = new com.google.android.gms.internal.fido.zzcr();
        return;
    }

    public zzcz()
    {
        this.zzc = 0;
        return;
    }

    public static int zzj(int p3, int p4, int p5)
    {
        String v1_0 = (p4 - p3);
        if ((((p3 | p4) | v1_0) | (p5 - p4)) >= 0) {
            return v1_0;
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

    public static com.google.android.gms.internal.fido.zzcz zzl(byte[] p2, int p3, int p4)
    {
        com.google.android.gms.internal.fido.zzcz.zzj(0, p4, p2.length);
        byte[] v1 = new byte[p4];
        System.arraycopy(p2, 0, v1, 0, p4);
        return new com.google.android.gms.internal.fido.zzcw(v1);
    }

    public abstract boolean equals();

    public final int hashCode()
    {
        int v0_0 = this.zzc;
        if (v0_0 == 0) {
            v0_0 = this.zzf(this.zzd(), 0, this.zzd());
            if (v0_0 == 0) {
                v0_0 = 1;
            }
            this.zzc = v0_0;
        }
        return v0_0;
    }

    public final synthetic java.util.Iterator iterator()
    {
        return new com.google.android.gms.internal.fido.zzcq(this);
    }

    public final String toString()
    {
        String v2_3;
        String v0_5 = Integer.toHexString(System.identityHashCode(this));
        int v1 = this.zzd();
        if (this.zzd() > 50) {
            v2_3 = com.google.android.gms.internal.fido.zzdg.zza(this.zzg(0, 47)).concat("...");
        } else {
            v2_3 = com.google.android.gms.internal.fido.zzdg.zza(this);
        }
        StringBuilder v3_3 = new StringBuilder("<ByteString@");
        v3_3.append(v0_5);
        v3_3.append(" size=");
        v3_3.append(v1);
        v3_3.append(" contents=\"");
        return v1.a.n(v3_3, v2_3, "\">");
    }

    public abstract byte zza();

    public abstract byte zzb();

    public abstract int zzd();

    public abstract void zze();

    public abstract int zzf();

    public abstract com.google.android.gms.internal.fido.zzcz zzg();

    public abstract java.io.InputStream zzh();

    public abstract java.nio.ByteBuffer zzi();

    public final int zzk()
    {
        return this.zzc;
    }

    public final byte[] zzm()
    {
        byte[] v0_0 = this.zzd();
        if (v0_0 != null) {
            byte[] v1 = new byte[v0_0];
            this.zze(v1, 0, 0, v0_0);
            return v1;
        } else {
            return com.google.android.gms.internal.fido.zzde.zzd;
        }
    }
}
