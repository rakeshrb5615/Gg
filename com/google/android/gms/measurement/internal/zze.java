package com.google.android.gms.measurement.internal;
final class zze {
    private final com.google.android.gms.measurement.internal.zzji zza;

    public zze(com.google.android.gms.measurement.internal.zzji p1)
    {
        this.zza = p1;
        return;
    }

    public static com.google.android.gms.measurement.internal.zze zzc(String p2)
    {
        if ((!android.text.TextUtils.isEmpty(p2)) && (p2.length() <= 1)) {
            com.google.android.gms.measurement.internal.zzji v2_1 = com.google.android.gms.measurement.internal.zzjl.zzj(p2.charAt(0));
        } else {
            v2_1 = com.google.android.gms.measurement.internal.zzji.zza;
        }
        return new com.google.android.gms.measurement.internal.zze(v2_1);
    }

    public final com.google.android.gms.measurement.internal.zzji zza()
    {
        return this.zza;
    }

    public final String zzb()
    {
        return String.valueOf(com.google.android.gms.measurement.internal.zzjl.zzm(this.zza));
    }
}
