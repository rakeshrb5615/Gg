package com.google.android.gms.internal.measurement;
public final class zzqf implements com.google.android.gms.internal.measurement.zzqe {
    public static final com.google.android.gms.internal.measurement.zzkm zza;

    static zzqf()
    {
        com.google.android.gms.internal.measurement.zzkm v0_4 = new com.google.android.gms.internal.measurement.zzkg(com.google.android.gms.internal.measurement.zzkb.zza("com.google.android.gms.measurement")).zza().zzb();
        v0_4.zzd("measurement.gbraid_campaign.gbraid.client", 1);
        com.google.android.gms.internal.measurement.zzqf.zza = v0_4.zzd("measurement.gbraid_campaign.stop_lgclid", 0);
        return;
    }

    public zzqf()
    {
        return;
    }

    public final boolean zza()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzqf.zza.zzd()).booleanValue();
    }
}
