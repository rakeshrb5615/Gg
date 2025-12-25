package com.google.android.gms.internal.measurement;
public final class zzpt implements com.google.android.gms.internal.measurement.zzps {
    public static final com.google.android.gms.internal.measurement.zzkm zza;
    public static final com.google.android.gms.internal.measurement.zzkm zzb;

    static zzpt()
    {
        com.google.android.gms.internal.measurement.zzkm v0_4 = new com.google.android.gms.internal.measurement.zzkg(com.google.android.gms.internal.measurement.zzkb.zza("com.google.android.gms.measurement")).zza().zzb();
        v0_4.zzd("measurement.collection.event_safelist", 1);
        com.google.android.gms.internal.measurement.zzpt.zza = v0_4.zzd("measurement.service.store_null_safelist", 1);
        com.google.android.gms.internal.measurement.zzpt.zzb = v0_4.zzd("measurement.service.store_safelist", 1);
        return;
    }

    public zzpt()
    {
        return;
    }

    public final boolean zza()
    {
        return 1;
    }

    public final boolean zzb()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzpt.zza.zzd()).booleanValue();
    }

    public final boolean zzc()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzpt.zzb.zzd()).booleanValue();
    }
}
