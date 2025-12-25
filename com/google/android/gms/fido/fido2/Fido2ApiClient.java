package com.google.android.gms.fido.fido2;
public class Fido2ApiClient extends com.google.android.gms.common.api.GoogleApi {
    private static final com.google.android.gms.common.api.Api$ClientKey zza;
    private static final com.google.android.gms.common.api.Api zzb;

    static Fido2ApiClient()
    {
        com.google.android.gms.common.api.Api$ClientKey v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.fido.fido2.Fido2ApiClient.zza = v0_1;
        com.google.android.gms.fido.fido2.Fido2ApiClient.zzb = new com.google.android.gms.common.api.Api("Fido.FIDO2_API", new com.google.android.gms.internal.fido.zzo(), v0_1);
        return;
    }

    public Fido2ApiClient(android.app.Activity p4)
    {
        super(p4, com.google.android.gms.fido.fido2.Fido2ApiClient.zzb, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
        return;
    }

    public Fido2ApiClient(android.content.Context p4)
    {
        super(p4, com.google.android.gms.fido.fido2.Fido2ApiClient.zzb, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
        return;
    }

    public com.google.android.gms.tasks.Task getRegisterIntent(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions p3)
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(5409).run(new com.google.android.gms.fido.fido2.zzd(this, p3)).build());
    }

    public com.google.android.gms.tasks.Task getRegisterPendingIntent(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions p3)
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.fido.fido2.zzc(this, p3)).setMethodKey(5407).build());
    }

    public com.google.android.gms.tasks.Task getSignIntent(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions p3)
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(5410).run(new com.google.android.gms.fido.fido2.zza(this, p3)).build());
    }

    public com.google.android.gms.tasks.Task getSignPendingIntent(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions p3)
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.fido.fido2.zze(this, p3)).setMethodKey(5408).build());
    }

    public com.google.android.gms.tasks.Task isUserVerifyingPlatformAuthenticatorAvailable()
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.fido.fido2.zzb(this)).setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.fido.zza.zzh})).setMethodKey(5411).build());
    }
}
