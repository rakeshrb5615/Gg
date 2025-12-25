package com.google.android.gms.internal.measurement;
public abstract class zzlh implements java.lang.Iterable, java.io.Serializable {
    public static final com.google.android.gms.internal.measurement.zzlh zzb;
    private int zza;

    static zzlh()
    {
        com.google.android.gms.internal.measurement.zzlh.zzb = new com.google.android.gms.internal.measurement.zzlg(com.google.android.gms.internal.measurement.zzmp.zzb);
        return;
    }

    public zzlh()
    {
        this.zza = 0;
        return;
    }

    public static com.google.android.gms.internal.measurement.zzlh zzh(byte[] p3, int p4, int p5)
    {
        com.google.android.gms.internal.measurement.zzlh.zzj(p4, (p4 + p5), p3.length);
        byte[] v1_1 = new byte[p5];
        System.arraycopy(p3, p4, v1_1, 0, p5);
        return new com.google.android.gms.internal.measurement.zzlg(v1_1);
    }

    public static int zzj(int p3, int p4, int p5)
    {
        int v1_0 = (p4 - p3);
        if ((((p3 | p4) | v1_0) | (p5 - p4)) >= 0) {
            return v1_0;
        } else {
            if (p3 < null) {
                String v0_2 = new StringBuilder((String.valueOf(p3).length() + 21));
                v0_2.append("Beginning index: ");
                v0_2.append(p3);
                v0_2.append(" < 0");
                throw new IndexOutOfBoundsException(v0_2.toString());
            } else {
                if (p4 >= p3) {
                    StringBuilder v2_2 = new StringBuilder(((String.valueOf(p4).length() + 15) + String.valueOf(p5).length()));
                    v2_2.append("End index: ");
                    v2_2.append(p4);
                    v2_2.append(" >= ");
                    v2_2.append(p5);
                    throw new IndexOutOfBoundsException(v2_2.toString());
                } else {
                    StringBuilder v2_4 = new StringBuilder(((String.valueOf(p3).length() + 44) + String.valueOf(p4).length()));
                    v2_4.append("Beginning index larger than ending index: ");
                    v2_4.append(p3);
                    v2_4.append(", ");
                    v2_4.append(p4);
                    throw new IndexOutOfBoundsException(v2_4.toString());
                }
            }
        }
    }

    public abstract boolean equals();

    public final int hashCode()
    {
        int v0_0 = this.zza;
        if (v0_0 == 0) {
            v0_0 = this.zzg(this.zzc(), 0, this.zzc());
            if (v0_0 == 0) {
                v0_0 = 1;
            }
            this.zza = v0_0;
        }
        return v0_0;
    }

    public final synthetic java.util.Iterator iterator()
    {
        return new com.google.android.gms.internal.measurement.zzla(this);
    }

    public final String toString()
    {
        String v2_3;
        String v0_5 = Integer.toHexString(System.identityHashCode(this));
        int v1 = this.zzc();
        if (this.zzc() > 50) {
            v2_3 = com.google.android.gms.internal.measurement.zzog.zza(this.zze(0, 47)).concat("...");
        } else {
            v2_3 = com.google.android.gms.internal.measurement.zzog.zza(this);
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

    public abstract int zzc();

    public abstract com.google.android.gms.internal.measurement.zzlh zze();

    public abstract void zzf();

    public abstract int zzg();

    public final int zzi()
    {
        return this.zza;
    }
}
