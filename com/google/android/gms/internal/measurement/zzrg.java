package com.google.android.gms.internal.measurement;
public final class zzrg implements com.google.android.gms.internal.measurement.zzrf {
    public static final com.google.android.gms.internal.measurement.zzkm zza;

    static zzrg()
    {
        com.google.android.gms.internal.measurement.zzkg v0_3 = new com.google.android.gms.internal.measurement.zzkg(com.google.android.gms.internal.measurement.zzkb.zza("com.google.android.gms.measurement")).zza().zzb();
        com.google.android.gms.internal.measurement.zzrg.zza = v0_3.zzd("measurement.client.sessions.enable_fix_background_engagement", 0);
        v0_3.zzd("measurement.client.sessions.enable_pause_engagement_in_background", 1);
        v0_3.zzc("measurement.id.client.sessions.enable_fix_background_engagement", 0);
        return;
    }

    public zzrg()
    {
        return;
    }

    public final boolean zza()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzrg.zza.zzd()).booleanValue();
    }
}
