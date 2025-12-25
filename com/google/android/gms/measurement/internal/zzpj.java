package com.google.android.gms.measurement.internal;
public final class zzpj {
    private final long zza;
    private final com.google.android.gms.internal.measurement.zzib zzb;
    private final String zzc;
    private final java.util.Map zzd;
    private final com.google.android.gms.measurement.internal.zzls zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final int zzi;

    public synthetic zzpj(long p1, com.google.android.gms.internal.measurement.zzib p3, String p4, java.util.Map p5, com.google.android.gms.measurement.internal.zzls p6, long p7, long p9, long p11, int p13, byte[] p14)
    {
        this.zza = p1;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        this.zze = p6;
        this.zzf = p7;
        this.zzg = p9;
        this.zzh = p11;
        this.zzi = p13;
        return;
    }

    public final com.google.android.gms.measurement.internal.zzot zza()
    {
        return new com.google.android.gms.measurement.internal.zzot(this.zzc, this.zzd, this.zze, 0);
    }

    public final com.google.android.gms.measurement.internal.zzom zzb()
    {
        android.os.Bundle v5_1 = new android.os.Bundle();
        com.google.android.gms.measurement.internal.zzom v0_5 = this.zzd.entrySet().iterator();
        while (v0_5.hasNext()) {
            long v1_2 = ((java.util.Map$Entry) v0_5.next());
            v5_1.putString(((String) v1_2.getKey()), ((String) v1_2.getValue()));
        }
        return new com.google.android.gms.measurement.internal.zzom(this.zza, this.zzb.zzcc(), this.zzc, v5_1, this.zze.zza(), this.zzg, "");
    }

    public final long zzc()
    {
        return this.zza;
    }

    public final com.google.android.gms.internal.measurement.zzib zzd()
    {
        return this.zzb;
    }

    public final String zze()
    {
        return this.zzc;
    }

    public final com.google.android.gms.measurement.internal.zzls zzf()
    {
        return this.zze;
    }

    public final long zzg()
    {
        return this.zzf;
    }

    public final long zzh()
    {
        return this.zzh;
    }

    public final int zzi()
    {
        return this.zzi;
    }
}
