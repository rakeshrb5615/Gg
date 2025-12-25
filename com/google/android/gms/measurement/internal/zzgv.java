package com.google.android.gms.measurement.internal;
public final class zzgv {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final android.os.Bundle zzd;

    public zzgv(String p1, String p2, android.os.Bundle p3, long p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzd = p3;
        this.zzc = p4;
        return;
    }

    public static com.google.android.gms.measurement.internal.zzgv zza(com.google.android.gms.measurement.internal.zzbg p6)
    {
        return new com.google.android.gms.measurement.internal.zzgv(p6.zza, p6.zzc, p6.zzb.zzf(), p6.zzd);
    }

    public final String toString()
    {
        String v0_0 = this.zzb;
        String v1_1 = this.zzd.toString();
        String v3 = this.zza;
        StringBuilder v4_3 = new StringBuilder(((((String.valueOf(v0_0).length() + 13) + String.valueOf(v3).length()) + 8) + v1_1.length()));
        v4_3.append("origin=");
        v4_3.append(v0_0);
        v4_3.append(",name=");
        v4_3.append(v3);
        return v1.a.n(v4_3, ",params=", v1_1);
    }

    public final com.google.android.gms.measurement.internal.zzbg zzb()
    {
        return new com.google.android.gms.measurement.internal.zzbg(this.zza, new com.google.android.gms.measurement.internal.zzbe(new android.os.Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
