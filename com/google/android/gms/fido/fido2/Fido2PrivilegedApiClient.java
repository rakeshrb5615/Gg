package com.google.android.gms.fido.fido2;
public class Fido2PrivilegedApiClient extends com.google.android.gms.common.api.GoogleApi {
    private static final com.google.android.gms.common.api.Api$ClientKey zza;
    private static final com.google.android.gms.common.api.Api zzb;

    static Fido2PrivilegedApiClient()
    {
        com.google.android.gms.common.api.Api$ClientKey v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient.zza = v0_1;
        com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient.zzb = new com.google.android.gms.common.api.Api("Fido.FIDO2_PRIVILEGED_API", new com.google.android.gms.internal.fido.zzj(), v0_1);
        return;
    }

    public Fido2PrivilegedApiClient(android.app.Activity p4)
    {
        super(p4, com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient.zzb, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
        return;
    }

    public Fido2PrivilegedApiClient(android.content.Context p4)
    {
        super(p4, com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient.zzb, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
        return;
    }

    public com.google.android.gms.tasks.Task getCredentialList(String p3)
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.fido.fido2.zzk(this, p3)).setMethodKey(5430).build());
    }

    public com.google.android.gms.tasks.Task getRegisterIntent(com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions p3)
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(5414).run(new com.google.android.gms.fido.fido2.zzo(this, p3)).build());
    }

    public com.google.android.gms.tasks.Task getRegisterPendingIntent(com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions p3)
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.fido.fido2.zzl(this, p3)).setMethodKey(5412).build());
    }

    public com.google.android.gms.tasks.Task getSignIntent(com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions p3)
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(5415).run(new com.google.android.gms.fido.fido2.zzn(this, p3)).build());
    }

    public com.google.android.gms.tasks.Task getSignPendingIntent(com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions p3)
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.fido.fido2.zzm(this, p3)).setMethodKey(5413).build());
    }

    public com.google.android.gms.tasks.Task isUserVerifyingPlatformAuthenticatorAvailable()
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.fido.fido2.zzp(this)).setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.fido.zza.zzh})).setMethodKey(5416).build());
    }
}
