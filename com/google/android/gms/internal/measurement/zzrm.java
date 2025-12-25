package com.google.android.gms.internal.measurement;
public final class zzrm implements com.google.android.gms.internal.measurement.zzrl {
    public static final com.google.android.gms.internal.measurement.zzkm zza;

    static zzrm()
    {
        com.google.android.gms.internal.measurement.zzkg v0_3 = new com.google.android.gms.internal.measurement.zzkg(com.google.android.gms.internal.measurement.zzkb.zza("com.google.android.gms.measurement")).zza().zzb();
        com.google.android.gms.internal.measurement.zzrm.zza = v0_3.zzd("measurement.tcf.consent_fix", 1);
        v0_3.zzd("measurement.tcf.client", 1);
        v0_3.zzd("measurement.tcf.empty_pref_fix", 1);
        return;
    }

    public zzrm()
    {
        return;
    }

    public final boolean zza()
    {
        return ((Boolean) com.google.android.gms.internal.measurement.zzrm.zza.zzd()).booleanValue();
    }
}
