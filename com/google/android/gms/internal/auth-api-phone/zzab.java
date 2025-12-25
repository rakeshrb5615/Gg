package com.google.android.gms.internal.auth-api-phone;
public final class zzab extends com.google.android.gms.auth.api.phone.SmsRetrieverClient {

    public zzab(android.app.Activity p1)
    {
        super(p1);
        return;
    }

    public zzab(android.content.Context p1)
    {
        super(p1);
        return;
    }

    public final com.google.android.gms.tasks.Task startSmsRetriever()
    {
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.auth-api-phone.zzx(this)).setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.auth-api-phone.zzac.zzc})).setMethodKey(1567).build());
    }

    public final com.google.android.gms.tasks.Task startSmsUserConsent(String p3)
    {
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.auth-api-phone.zzy(this, p3)).setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.auth-api-phone.zzac.zzd})).setMethodKey(1568).build());
    }
}
