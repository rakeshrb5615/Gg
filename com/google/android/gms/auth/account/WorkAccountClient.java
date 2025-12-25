package com.google.android.gms.auth.account;
public class WorkAccountClient extends com.google.android.gms.common.api.GoogleApi {
    private final com.google.android.gms.auth.account.WorkAccountApi zza;

    public WorkAccountClient(android.app.Activity p4)
    {
        super(p4, com.google.android.gms.auth.account.WorkAccount.API, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        super.zza = new com.google.android.gms.internal.auth.zzal();
        return;
    }

    public WorkAccountClient(android.content.Context p4)
    {
        super(p4, com.google.android.gms.auth.account.WorkAccount.API, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        super.zza = new com.google.android.gms.internal.auth.zzal();
        return;
    }

    public com.google.android.gms.tasks.Task addWorkAccount(String p3)
    {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(this.zza.addWorkAccount(this.asGoogleApiClient(), p3), new com.google.android.gms.auth.account.zzg(this));
    }

    public com.google.android.gms.tasks.Task removeWorkAccount(android.accounts.Account p3)
    {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(this.zza.removeWorkAccount(this.asGoogleApiClient(), p3));
    }

    public com.google.android.gms.tasks.Task setWorkAuthenticatorEnabled(boolean p3)
    {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(this.zza.setWorkAuthenticatorEnabledWithResult(this.asGoogleApiClient(), p3));
    }
}
