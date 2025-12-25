package com.google.android.gms.internal.measurement;
public final class zzpk implements com.google.android.gms.internal.measurement.zzpj {
    public static final com.google.android.gms.internal.measurement.zzkm zza;
    public static final com.google.android.gms.internal.measurement.zzkm zzb;

    static zzpk()
    {
        com.google.android.gms.internal.measurement.zzkg v0_3 = new com.google.android.gms.internal.measurement.zzkg(com.google.android.gms.internal.measurement.zzkb.zza("com.google.android.gms.measurement")).zza().zzb();
        v0_3.zzd("measurement.set_default_event_parameters_with_backfill.client.dev", 0);
        v0_3.zzd("measurement.set_default_event_parameters_with_backfill.service", 1);
        v0_3.zzc("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0);
        com.google.android.gms.internal.measurement.zzpk.zza = v0_3.zzd("measurement.set_default_event_parameters.fix_app_update_logging", 1);
        com.google.android.gms.internal.measurement.zzpk.zzb = v0_3.zzd("measurement.set_default_event_parameters.fix_service_request_ordering", 0);
        v0_3.zzd("measurement.set_default_event_parameters.fix_subsequent_launches", 1);
        return;
    }

    public zzpk()
    {
        return;
    }

    public final boolean zza()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzpk.zza.zzd()).booleanValue();
    }

    public final boolean zzb()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzpk.zzb.zzd()).booleanValue();
    }
}
