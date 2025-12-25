package com.google.android.gms.internal.measurement;
public final class zzqo implements com.google.android.gms.internal.measurement.zzqn {
    public static final com.google.android.gms.internal.measurement.zzkm zza;
    public static final com.google.android.gms.internal.measurement.zzkm zzb;
    public static final com.google.android.gms.internal.measurement.zzkm zzc;
    public static final com.google.android.gms.internal.measurement.zzkm zzd;
    public static final com.google.android.gms.internal.measurement.zzkm zze;
    public static final com.google.android.gms.internal.measurement.zzkm zzf;

    static zzqo()
    {
        com.google.android.gms.internal.measurement.zzkm v0_4 = new com.google.android.gms.internal.measurement.zzkg(com.google.android.gms.internal.measurement.zzkb.zza("com.google.android.gms.measurement")).zza().zzb();
        com.google.android.gms.internal.measurement.zzqo.zza = v0_4.zzd("measurement.test.boolean_flag", 0);
        com.google.android.gms.internal.measurement.zzqo.zzb = v0_4.zzc("measurement.test.cached_long_flag", -1);
        com.google.android.gms.internal.measurement.zzqo.zzc = v0_4.zze("measurement.test.double_flag", -4609434218613702656);
        com.google.android.gms.internal.measurement.zzqo.zzd = v0_4.zzc("measurement.test.int_flag", -2);
        com.google.android.gms.internal.measurement.zzqo.zze = v0_4.zzc("measurement.test.long_flag", -1);
        com.google.android.gms.internal.measurement.zzqo.zzf = v0_4.zzf("measurement.test.string_flag", "---");
        return;
    }

    public zzqo()
    {
        return;
    }

    public final boolean zza()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzqo.zza.zzd()).booleanValue();
    }

    public final long zzb()
    {
        return ((Long) com.google.android.gms.internal.measurement.zzqo.zzb.zzd()).longValue();
    }

    public final double zzc()
    {
        return ((Double) com.google.android.gms.internal.measurement.zzqo.zzc.zzd()).doubleValue();
    }

    public final long zzd()
    {
        return ((Long) com.google.android.gms.internal.measurement.zzqo.zzd.zzd()).longValue();
    }

    public final long zze()
    {
        return ((Long) com.google.android.gms.internal.measurement.zzqo.zze.zzd()).longValue();
    }

    public final String zzf()
    {
        return ((String) com.google.android.gms.internal.measurement.zzqo.zzf.zzd());
    }
}
