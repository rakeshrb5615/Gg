package com.google.android.gms.internal.measurement;
public final class zzqr implements com.google.android.gms.internal.measurement.zzqq {
    public static final com.google.android.gms.internal.measurement.zzkm zza;
    public static final com.google.android.gms.internal.measurement.zzkm zzb;
    public static final com.google.android.gms.internal.measurement.zzkm zzc;
    public static final com.google.android.gms.internal.measurement.zzkm zzd;
    public static final com.google.android.gms.internal.measurement.zzkm zze;
    public static final com.google.android.gms.internal.measurement.zzkm zzf;
    public static final com.google.android.gms.internal.measurement.zzkm zzg;
    public static final com.google.android.gms.internal.measurement.zzkm zzh;

    static zzqr()
    {
        com.google.android.gms.internal.measurement.zzkg v0_3 = new com.google.android.gms.internal.measurement.zzkg(com.google.android.gms.internal.measurement.zzkb.zza("com.google.android.gms.measurement")).zza().zzb();
        v0_3.zzd("measurement.rb.attribution.ad_campaign_info", 1);
        v0_3.zzd("measurement.rb.attribution.service.bundle_on_backgrounded", 1);
        com.google.android.gms.internal.measurement.zzqr.zza = v0_3.zzd("measurement.rb.attribution.client2", 1);
        com.google.android.gms.internal.measurement.zzqr.zzb = v0_3.zzd("measurement.rb.attribution.followup1.service", 0);
        v0_3.zzd("measurement.rb.attribution.client.get_trigger_uris_async", 1);
        com.google.android.gms.internal.measurement.zzqr.zzc = v0_3.zzd("measurement.rb.attribution.service.trigger_uris_high_priority", 1);
        v0_3.zzd("measurement.rb.attribution.index_out_of_bounds_fix", 1);
        com.google.android.gms.internal.measurement.zzqr.zzd = v0_3.zzd("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", 1);
        com.google.android.gms.internal.measurement.zzqr.zze = v0_3.zzd("measurement.rb.attribution.retry_disposition", 0);
        com.google.android.gms.internal.measurement.zzqr.zzf = v0_3.zzd("measurement.rb.attribution.service", 1);
        com.google.android.gms.internal.measurement.zzqr.zzg = v0_3.zzd("measurement.rb.attribution.enable_trigger_redaction", 1);
        com.google.android.gms.internal.measurement.zzqr.zzh = v0_3.zzd("measurement.rb.attribution.uuid_generation", 1);
        v0_3.zzc("measurement.id.rb.attribution.retry_disposition", 0);
        v0_3.zzd("measurement.rb.attribution.improved_retry", 1);
        return;
    }

    public zzqr()
    {
        return;
    }

    public final boolean zza()
    {
        return 1;
    }

    public final boolean zzb()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzqr.zza.zzd()).booleanValue();
    }

    public final boolean zzc()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzqr.zzb.zzd()).booleanValue();
    }

    public final boolean zzd()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzqr.zzc.zzd()).booleanValue();
    }

    public final boolean zze()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzqr.zzd.zzd()).booleanValue();
    }

    public final boolean zzf()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzqr.zze.zzd()).booleanValue();
    }

    public final boolean zzg()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzqr.zzf.zzd()).booleanValue();
    }

    public final boolean zzh()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzqr.zzg.zzd()).booleanValue();
    }

    public final boolean zzi()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzqr.zzh.zzd()).booleanValue();
    }
}
