package com.google.android.gms.internal.measurement;
public final class zzpw implements com.google.android.gms.internal.measurement.zzpv {
    public static final com.google.android.gms.internal.measurement.zzkm zza;
    public static final com.google.android.gms.internal.measurement.zzkm zzb;
    public static final com.google.android.gms.internal.measurement.zzkm zzc;

    static zzpw()
    {
        com.google.android.gms.internal.measurement.zzkm v0_4 = new com.google.android.gms.internal.measurement.zzkg(com.google.android.gms.internal.measurement.zzkb.zza("com.google.android.gms.measurement")).zza().zzb();
        v0_4.zzd("measurement.service.audience.fix_skip_audience_with_failed_filters", 1);
        com.google.android.gms.internal.measurement.zzpw.zza = v0_4.zzd("measurement.audience.refresh_event_count_filters_timestamp", 0);
        com.google.android.gms.internal.measurement.zzpw.zzb = v0_4.zzd("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", 0);
        com.google.android.gms.internal.measurement.zzpw.zzc = v0_4.zzd("measurement.audience.use_bundle_timestamp_for_event_count_filters", 0);
        return;
    }

    public zzpw()
    {
        return;
    }

    public final boolean zza()
    {
        return 1;
    }

    public final boolean zzb()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzpw.zza.zzd()).booleanValue();
    }

    public final boolean zzc()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzpw.zzb.zzd()).booleanValue();
    }

    public final boolean zzd()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzpw.zzc.zzd()).booleanValue();
    }
}
