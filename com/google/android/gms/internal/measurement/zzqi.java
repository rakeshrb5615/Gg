package com.google.android.gms.internal.measurement;
public final class zzqi implements com.google.android.gms.internal.measurement.zzqh {
    public static final com.google.android.gms.internal.measurement.zzkm zza;

    static zzqi()
    {
        com.google.android.gms.internal.measurement.zzkm v0_4 = new com.google.android.gms.internal.measurement.zzkg(com.google.android.gms.internal.measurement.zzkb.zza("com.google.android.gms.measurement")).zza().zzb();
        v0_4.zzd("measurement.gmscore_feature_tracking", 1);
        com.google.android.gms.internal.measurement.zzqi.zza = v0_4.zzd("measurement.gmscore_client_telemetry", 0);
        return;
    }

    public zzqi()
    {
        return;
    }

    public final boolean zza()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzqi.zza.zzd()).booleanValue();
    }
}
