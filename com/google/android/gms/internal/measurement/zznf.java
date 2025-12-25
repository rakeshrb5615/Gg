package com.google.android.gms.internal.measurement;
public final class zznf {
    private final com.google.android.gms.internal.measurement.zzne zza;

    private zznf(com.google.android.gms.internal.measurement.zzot p1, Object p2, com.google.android.gms.internal.measurement.zzot p3, Object p4)
    {
        this.zza = new com.google.android.gms.internal.measurement.zzne(p1, "", p3, "");
        return;
    }

    public static com.google.android.gms.internal.measurement.zznf zza(com.google.android.gms.internal.measurement.zzot p0, Object p1, com.google.android.gms.internal.measurement.zzot p2, Object p3)
    {
        return new com.google.android.gms.internal.measurement.zznf(p0, "", p2, "");
    }

    public static void zzb(com.google.android.gms.internal.measurement.zzlm p2, com.google.android.gms.internal.measurement.zzne p3, Object p4, Object p5)
    {
        com.google.android.gms.internal.measurement.zzlw.zzf(p2, p3.zza, 1, p4);
        com.google.android.gms.internal.measurement.zzlw.zzf(p2, p3.zzc, 2, p5);
        return;
    }

    public static int zzc(com.google.android.gms.internal.measurement.zzne p2, Object p3, Object p4)
    {
        return (com.google.android.gms.internal.measurement.zzlw.zzh(p2.zza, 1, p3) + com.google.android.gms.internal.measurement.zzlw.zzh(p2.zzc, 2, p4));
    }

    public final int zzd(int p2, Object p3, Object p4)
    {
        return v1.a.b(com.google.android.gms.internal.measurement.zznf.zzc(this.zza, p3, p4), com.google.android.gms.internal.measurement.zznf.zzc(this.zza, p3, p4), com.google.android.gms.internal.measurement.zzlm.zzz((p2 << 3)));
    }

    public final com.google.android.gms.internal.measurement.zzne zze()
    {
        return this.zza;
    }
}
