package com.google.android.gms.internal.measurement;
public final class zzql implements com.google.android.gms.internal.measurement.zzqk {
    public static final com.google.android.gms.internal.measurement.zzkm zza;

    static zzql()
    {
        com.google.android.gms.internal.measurement.zzkg v0_3 = new com.google.android.gms.internal.measurement.zzkg(com.google.android.gms.internal.measurement.zzkb.zza("com.google.android.gms.measurement")).zza().zzb();
        v0_3.zzd("measurement.sdk.collection.enable_extend_user_property_size", 1);
        com.google.android.gms.internal.measurement.zzql.zza = v0_3.zzd("measurement.sdk.collection.last_deep_link_referrer_campaign2", 0);
        v0_3.zzc("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
        return;
    }

    public zzql()
    {
        return;
    }

    public final boolean zza()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzql.zza.zzd()).booleanValue();
    }
}
