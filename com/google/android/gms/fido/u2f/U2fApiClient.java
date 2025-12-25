package com.google.android.gms.fido.u2f;
public class U2fApiClient extends com.google.android.gms.common.api.GoogleApi {
    private static final com.google.android.gms.common.api.Api$ClientKey zza;
    private static final com.google.android.gms.common.api.Api zzb;

    static U2fApiClient()
    {
        com.google.android.gms.common.api.Api$ClientKey v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.fido.u2f.U2fApiClient.zza = v0_1;
        com.google.android.gms.fido.u2f.U2fApiClient.zzb = new com.google.android.gms.common.api.Api("Fido.U2F_API", new com.google.android.gms.internal.fido.zzx(), v0_1);
        return;
    }

    public U2fApiClient(android.app.Activity p4)
    {
        super(p4, com.google.android.gms.fido.u2f.U2fApiClient.zzb, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
        return;
    }

    public U2fApiClient(android.content.Context p4)
    {
        super(p4, com.google.android.gms.fido.u2f.U2fApiClient.zzb, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
        return;
    }

    public com.google.android.gms.tasks.Task getRegisterIntent(com.google.android.gms.fido.u2f.api.common.RegisterRequestParams p3)
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(5424).run(new com.google.android.gms.fido.u2f.zzb(this, p3)).build());
    }

    public com.google.android.gms.tasks.Task getSignIntent(com.google.android.gms.fido.u2f.api.common.SignRequestParams p3)
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(5425).run(new com.google.android.gms.fido.u2f.zza(this, p3)).build());
    }
}
