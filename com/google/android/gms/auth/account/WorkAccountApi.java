package com.google.android.gms.auth.account;
public interface WorkAccountApi {

    public abstract com.google.android.gms.common.api.PendingResult addWorkAccount();

    public abstract com.google.android.gms.common.api.PendingResult removeWorkAccount();

    public abstract void setWorkAuthenticatorEnabled();

    public abstract com.google.android.gms.common.api.PendingResult setWorkAuthenticatorEnabledWithResult();
}
