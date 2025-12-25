package com.google.android.gms.internal.play_billing;
public abstract class zzei implements java.lang.Iterable, java.io.Serializable {
    public static final com.google.android.gms.internal.play_billing.zzei zzb;
    private int zza;

    static zzei()
    {
        com.google.android.gms.internal.play_billing.zzei.zzb = new com.google.android.gms.internal.play_billing.zzeg(com.google.android.gms.internal.play_billing.zzfo.zzb);
        return;
    }

    public zzei()
    {
        this.zza = 0;
        return;
    }

    public static int zzh(int p3, int p4, int p5)
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

    public static com.google.android.gms.internal.play_billing.zzei zzj(byte[] p3, int p4, int p5)
    {
        com.google.android.gms.internal.play_billing.zzei.zzh(p4, (p4 + p5), p3.length);
        byte[] v1_1 = new byte[p5];
        System.arraycopy(p3, p4, v1_1, 0, p5);
        return new com.google.android.gms.internal.play_billing.zzeg(v1_1);
    }

    public abstract boolean equals();

    public final int hashCode()
    {
        int v0_0 = this.zza;
        if (v0_0 == 0) {
            v0_0 = this.zze(this.zzd(), 0, this.zzd());
            if (v0_0 == 0) {
                v0_0 = 1;
            }
            this.zza = v0_0;
        }
        return v0_0;
    }

    public final synthetic java.util.Iterator iterator()
    {
        return new com.google.android.gms.internal.play_billing.zzea(this);
    }

    public final String toString()
    {
        String v2_3;
        String v0_5 = Integer.toHexString(System.identityHashCode(this));
        int v1 = this.zzd();
        if (this.zzd() > 50) {
            v2_3 = com.google.android.gms.internal.play_billing.zzhf.zza(this.zzf(0, 47)).concat("...");
        } else {
            v2_3 = com.google.android.gms.internal.play_billing.zzhf.zza(this);
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

    public abstract com.google.android.gms.internal.play_billing.zzei zzf();

    public abstract void zzg();

    public final int zzi()
    {
        return this.zza;
    }
}
