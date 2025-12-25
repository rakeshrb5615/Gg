package com.google.android.gms.internal.measurement;
public final class zzqu implements com.google.android.gms.internal.measurement.zzqt {
    public static final com.google.android.gms.internal.measurement.zzkm zza;

    static zzqu()
    {
        com.google.android.gms.internal.measurement.zzkg v0_3 = new com.google.android.gms.internal.measurement.zzkg(com.google.android.gms.internal.measurement.zzkb.zza("com.google.android.gms.measurement")).zza().zzb();
        com.google.android.gms.internal.measurement.zzqu.zza = v0_3.zzd("measurement.add_first_launch_logging_timestamp.service", 0);
        v0_3.zzc("measurement.id.add_first_launch_logging_timestamp.service", 0);
        return;
    }

    public zzqu()
    {
        return;
    }

    public final boolean zza()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzqu.zza.zzd()).booleanValue();
    }
}
