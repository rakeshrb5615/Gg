package com.google.android.gms.internal.measurement;
public final class zzrd implements com.google.android.gms.internal.measurement.zzrc {
    public static final com.google.android.gms.internal.measurement.zzkm zza;

    static zzrd()
    {
        com.google.android.gms.internal.measurement.zzkg v0_3 = new com.google.android.gms.internal.measurement.zzkg(com.google.android.gms.internal.measurement.zzkb.zza("com.google.android.gms.measurement")).zza().zzb();
        com.google.android.gms.internal.measurement.zzrd.zza = v0_3.zzd("measurement.session_stitching_token_enabled", 0);
        v0_3.zzd("measurement.link_sst_to_sid", 1);
        return;
    }

    public zzrd()
    {
        return;
    }

    public final boolean zza()
    {
        return 1;
    }

    public final boolean zzb()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzrd.zza.zzd()).booleanValue();
    }
}
