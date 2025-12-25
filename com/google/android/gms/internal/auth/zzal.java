package com.google.android.gms.internal.auth;
public final class zzal implements com.google.android.gms.auth.account.WorkAccountApi {
    private static final com.google.android.gms.common.api.Status zza;

    static zzal()
    {
        com.google.android.gms.internal.auth.zzal.zza = new com.google.android.gms.common.api.Status(13);
        return;
    }

    public zzal()
    {
        return;
    }

    public static bridge synthetic com.google.android.gms.common.api.Status zza()
    {
        return com.google.android.gms.internal.auth.zzal.zza;
    }

    public final com.google.android.gms.common.api.PendingResult addWorkAccount(com.google.android.gms.common.api.GoogleApiClient p3, String p4)
    {
        return p3.execute(new com.google.android.gms.internal.auth.zzae(this, com.google.android.gms.auth.account.WorkAccount.API, p3, p4));
    }

    public final com.google.android.gms.common.api.PendingResult removeWorkAccount(com.google.android.gms.common.api.GoogleApiClient p3, android.accounts.Account p4)
    {
        return p3.execute(new com.google.android.gms.internal.auth.zzag(this, com.google.android.gms.auth.account.WorkAccount.API, p3, p4));
    }

    public final void setWorkAuthenticatorEnabled(com.google.android.gms.common.api.GoogleApiClient p1, boolean p2)
    {
        this.setWorkAuthenticatorEnabledWithResult(p1, p2);
        return;
    }

    public final com.google.android.gms.common.api.PendingResult setWorkAuthenticatorEnabledWithResult(com.google.android.gms.common.api.GoogleApiClient p3, boolean p4)
    {
        return p3.execute(new com.google.android.gms.internal.auth.zzac(this, com.google.android.gms.auth.account.WorkAccount.API, p3, p4));
    }
}
