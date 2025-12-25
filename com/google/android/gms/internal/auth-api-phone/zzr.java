package com.google.android.gms.internal.auth-api-phone;
public final class zzr extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.phone.SmsCodeAutofillClient {
    private static final com.google.android.gms.common.api.Api$ClientKey zza;
    private static final com.google.android.gms.common.api.Api$AbstractClientBuilder zzb;
    private static final com.google.android.gms.common.api.Api zzc;

    static zzr()
    {
        com.google.android.gms.common.api.Api$ClientKey v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.internal.auth-api-phone.zzr.zza = v0_1;
        com.google.android.gms.internal.auth-api-phone.zzn v1_1 = new com.google.android.gms.internal.auth-api-phone.zzn();
        com.google.android.gms.internal.auth-api-phone.zzr.zzb = v1_1;
        com.google.android.gms.internal.auth-api-phone.zzr.zzc = new com.google.android.gms.common.api.Api("SmsCodeAutofill.API", v1_1, v0_1);
        return;
    }

    public zzr(android.app.Activity p4)
    {
        super(p4, com.google.android.gms.internal.auth-api-phone.zzr.zzc, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public zzr(android.content.Context p4)
    {
        super(p4, com.google.android.gms.internal.auth-api-phone.zzr.zzc, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public final com.google.android.gms.tasks.Task checkPermissionState()
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.auth-api-phone.zzac.zza})).run(new com.google.android.gms.internal.auth-api-phone.zzk(this)).setMethodKey(1564).build());
    }

    public final com.google.android.gms.tasks.Task hasOngoingSmsRequest(String p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.common.internal.Preconditions.checkArgument((p3.isEmpty() ^ 1), "The package name cannot be empty.");
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.auth-api-phone.zzac.zza})).run(new com.google.android.gms.internal.auth-api-phone.zzl(this, p3)).setMethodKey(1565).build());
    }

    public final com.google.android.gms.tasks.Task startSmsCodeRetriever()
    {
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.auth-api-phone.zzac.zza})).run(new com.google.android.gms.internal.auth-api-phone.zzm(this)).setMethodKey(1563).build());
    }
}
