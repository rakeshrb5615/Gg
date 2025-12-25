package com.google.android.gms.internal.auth;
public abstract class zzee implements java.lang.Iterable, java.io.Serializable {
    private static final java.util.Comparator zza;
    public static final com.google.android.gms.internal.auth.zzee zzb;
    private static final com.google.android.gms.internal.auth.zzed zzd;
    private int zzc;

    static zzee()
    {
        com.google.android.gms.internal.auth.zzee.zzb = new com.google.android.gms.internal.auth.zzeb(com.google.android.gms.internal.auth.zzez.zzd);
        com.google.android.gms.internal.auth.zzee.zzd = new com.google.android.gms.internal.auth.zzed(0);
        com.google.android.gms.internal.auth.zzee.zza = new com.google.android.gms.internal.auth.zzdw();
        return;
    }

    public zzee()
    {
        this.zzc = 0;
        return;
    }

    public static int zzi(int p3, int p4, int p5)
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

    public static com.google.android.gms.internal.auth.zzee zzk(byte[] p3, int p4, int p5)
    {
        com.google.android.gms.internal.auth.zzee.zzi(p4, (p4 + p5), p3.length);
        byte[] v1_1 = new byte[p5];
        System.arraycopy(p3, p4, v1_1, 0, p5);
        return new com.google.android.gms.internal.auth.zzeb(v1_1);
    }

    public static com.google.android.gms.internal.auth.zzee zzl(String p2)
    {
        return new com.google.android.gms.internal.auth.zzeb(p2.getBytes(com.google.android.gms.internal.auth.zzez.zzb));
    }

    public abstract boolean equals();

    public final int hashCode()
    {
        int v0_0 = this.zzc;
        if (v0_0 == 0) {
            v0_0 = this.zze(this.zzd(), 0, this.zzd());
            if (v0_0 == 0) {
                v0_0 = 1;
            }
            this.zzc = v0_0;
        }
        return v0_0;
    }

    public final synthetic java.util.Iterator iterator()
    {
        return new com.google.android.gms.internal.auth.zzdv(this);
    }

    public final String toString()
    {
        String v2_3;
        String v0_5 = Integer.toHexString(System.identityHashCode(this));
        int v1 = this.zzd();
        if (this.zzd() > 50) {
            v2_3 = com.google.android.gms.internal.auth.zzgw.zza(this.zzf(0, 47)).concat("...");
        } else {
            v2_3 = com.google.android.gms.internal.auth.zzgw.zza(this);
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

    public abstract int zze();

    public abstract com.google.android.gms.internal.auth.zzee zzf();

    public abstract String zzg();

    public abstract boolean zzh();

    public final int zzj()
    {
        return this.zzc;
    }

    public final String zzm(java.nio.charset.Charset p2)
    {
        if (this.zzd() != 0) {
            return this.zzg(p2);
        } else {
            return "";
        }
    }
}
