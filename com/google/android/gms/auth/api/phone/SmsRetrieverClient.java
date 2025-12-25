package com.google.android.gms.auth.api.phone;
public abstract class SmsRetrieverClient extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.phone.SmsRetrieverApi {
    private static final com.google.android.gms.common.api.Api$ClientKey zza;
    private static final com.google.android.gms.common.api.Api$AbstractClientBuilder zzb;
    private static final com.google.android.gms.common.api.Api zzc;

    static SmsRetrieverClient()
    {
        com.google.android.gms.common.api.Api$ClientKey v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.auth.api.phone.SmsRetrieverClient.zza = v0_1;
        com.google.android.gms.auth.api.phone.zza v1_1 = new com.google.android.gms.auth.api.phone.zza();
        com.google.android.gms.auth.api.phone.SmsRetrieverClient.zzb = v1_1;
        com.google.android.gms.auth.api.phone.SmsRetrieverClient.zzc = new com.google.android.gms.common.api.Api("SmsRetriever.API", v1_1, v0_1);
        return;
    }

    public SmsRetrieverClient(android.app.Activity p4)
    {
        super(p4, com.google.android.gms.auth.api.phone.SmsRetrieverClient.zzc, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public SmsRetrieverClient(android.content.Context p4)
    {
        super(p4, com.google.android.gms.auth.api.phone.SmsRetrieverClient.zzc, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public abstract com.google.android.gms.tasks.Task startSmsRetriever();

    public abstract com.google.android.gms.tasks.Task startSmsUserConsent();
}
