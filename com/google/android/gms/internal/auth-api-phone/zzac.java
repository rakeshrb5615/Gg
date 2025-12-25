package com.google.android.gms.internal.auth-api-phone;
public final class zzac {
    public static final com.google.android.gms.common.Feature zza;
    public static final com.google.android.gms.common.Feature zzb;
    public static final com.google.android.gms.common.Feature zzc;
    public static final com.google.android.gms.common.Feature zzd;
    public static final com.google.android.gms.common.Feature[] zze;

    static zzac()
    {
        com.google.android.gms.common.Feature[] v0_2 = new com.google.android.gms.common.Feature("sms_code_autofill", 2);
        com.google.android.gms.internal.auth-api-phone.zzac.zza = v0_2;
        com.google.android.gms.common.Feature v1_2 = new com.google.android.gms.common.Feature("sms_code_browser", 2);
        com.google.android.gms.internal.auth-api-phone.zzac.zzb = v1_2;
        com.google.android.gms.common.Feature v2_0 = new com.google.android.gms.common.Feature("sms_retrieve", 1);
        com.google.android.gms.internal.auth-api-phone.zzac.zzc = v2_0;
        com.google.android.gms.common.Feature v3_2 = new com.google.android.gms.common.Feature("user_consent", 3);
        com.google.android.gms.internal.auth-api-phone.zzac.zzd = v3_2;
        com.google.android.gms.internal.auth-api-phone.zzac.zze = new com.google.android.gms.common.Feature[] {v0_2, v1_2, v2_0, v3_2});
        return;
    }
}
