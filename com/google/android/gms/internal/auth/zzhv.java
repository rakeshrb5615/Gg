package com.google.android.gms.internal.auth;
public final class zzhv implements com.google.android.gms.internal.auth.zzht {
    public static final com.google.android.gms.internal.auth.zzdc zza;
    public static final com.google.android.gms.internal.auth.zzdc zzb;
    public static final com.google.android.gms.internal.auth.zzdc zzc;
    public static final com.google.android.gms.internal.auth.zzdc zzd;
    public static final com.google.android.gms.internal.auth.zzdc zze;
    public static final com.google.android.gms.internal.auth.zzdc zzf;
    public static final com.google.android.gms.internal.auth.zzdc zzg;
    public static final com.google.android.gms.internal.auth.zzdc zzh;
    public static final com.google.android.gms.internal.auth.zzdc zzi;
    public static final com.google.android.gms.internal.auth.zzdc zzj;
    public static final com.google.android.gms.internal.auth.zzdc zzk;
    public static final com.google.android.gms.internal.auth.zzdc zzl;
    public static final com.google.android.gms.internal.auth.zzdc zzm;
    public static final com.google.android.gms.internal.auth.zzdc zzn;

    static zzhv()
    {
        Exception v0_5 = new com.google.android.gms.internal.auth.zzcz(com.google.android.gms.internal.auth.zzcr.zza("com.google.android.gms.auth_account")).zzb().zza();
        com.google.android.gms.internal.auth.zzhv.zza = v0_5.zzc("getTokenRefactor__account_data_service_sample_percentage", 0);
        com.google.android.gms.internal.auth.zzhv.zzb = v0_5.zze("getTokenRefactor__account_data_service_tokenAPI_usable", 1);
        com.google.android.gms.internal.auth.zzhv.zzc = v0_5.zzd("getTokenRefactor__account_manager_timeout_seconds", 20);
        com.google.android.gms.internal.auth.zzhv.zzd = v0_5.zzd("getTokenRefactor__android_id_shift", 0);
        com.google.android.gms.internal.auth.zzhv.zze = v0_5.zze("getTokenRefactor__authenticator_logic_improved", 0);
        try {
            com.google.android.gms.internal.auth.zzhv.zzf = v0_5.zzf("getTokenRefactor__blocked_packages", com.google.android.gms.internal.auth.zzhr.zzk(android.util.Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)), com.google.android.gms.internal.auth.zzhu.zza);
            com.google.android.gms.internal.auth.zzhv.zzg = v0_5.zze("getTokenRefactor__chimera_get_token_evolved", 1);
            com.google.android.gms.internal.auth.zzhv.zzh = v0_5.zzd("getTokenRefactor__clear_token_timeout_seconds", 20);
            com.google.android.gms.internal.auth.zzhv.zzi = v0_5.zzd("getTokenRefactor__default_task_timeout_seconds", 20);
            com.google.android.gms.internal.auth.zzhv.zzj = v0_5.zze("getTokenRefactor__gaul_accounts_api_evolved", 0);
            com.google.android.gms.internal.auth.zzhv.zzk = v0_5.zze("getTokenRefactor__gaul_token_api_evolved", 0);
            com.google.android.gms.internal.auth.zzhv.zzl = v0_5.zzd("getTokenRefactor__get_token_timeout_seconds", 120);
            com.google.android.gms.internal.auth.zzhv.zzm = v0_5.zze("getTokenRefactor__gms_account_authenticator_evolved", 1);
            com.google.android.gms.internal.auth.zzhv.zzn = v0_5.zzc("getTokenRefactor__gms_account_authenticator_sample_percentage", 0);
            return;
        } catch (Exception v0_4) {
            throw new AssertionError(v0_4);
        }
    }

    public zzhv()
    {
        return;
    }

    public final com.google.android.gms.internal.auth.zzhr zza()
    {
        return ((com.google.android.gms.internal.auth.zzhr) com.google.android.gms.internal.auth.zzhv.zzf.zzb());
    }

    public final boolean zzb()
    {
        return ((Boolean) com.google.android.gms.internal.auth.zzhv.zzj.zzb()).booleanValue();
    }

    public final boolean zzc()
    {
        return ((Boolean) com.google.android.gms.internal.auth.zzhv.zzk.zzb()).booleanValue();
    }
}
