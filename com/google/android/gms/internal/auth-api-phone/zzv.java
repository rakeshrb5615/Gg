package com.google.android.gms.internal.auth-api-phone;
public final class zzv extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.phone.SmsCodeBrowserClient {
    private static final com.google.android.gms.common.api.Api$ClientKey zza;
    private static final com.google.android.gms.common.api.Api$AbstractClientBuilder zzb;
    private static final com.google.android.gms.common.api.Api zzc;

    static zzv()
    {
        com.google.android.gms.common.api.Api$ClientKey v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.internal.auth-api-phone.zzv.zza = v0_1;
        com.google.android.gms.internal.auth-api-phone.zzt v1_1 = new com.google.android.gms.internal.auth-api-phone.zzt();
        com.google.android.gms.internal.auth-api-phone.zzv.zzb = v1_1;
        com.google.android.gms.internal.auth-api-phone.zzv.zzc = new com.google.android.gms.common.api.Api("SmsCodeBrowser.API", v1_1, v0_1);
        return;
    }

    public zzv(android.app.Activity p4)
    {
        super(p4, com.google.android.gms.internal.auth-api-phone.zzv.zzc, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public zzv(android.content.Context p4)
    {
        super(p4, com.google.android.gms.internal.auth-api-phone.zzv.zzc, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public final com.google.android.gms.tasks.Task startSmsCodeRetriever()
    {
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.auth-api-phone.zzac.zzb})).run(new com.google.android.gms.internal.auth-api-phone.zzs(this)).setMethodKey(1566).build());
    }
}
