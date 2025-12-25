package com.google.android.gms.internal.auth-api;
public final class zbad extends com.google.android.gms.internal.auth-api.zba implements android.os.IInterface {

    public zbad(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        return;
    }

    public final void zbc(com.google.android.gms.internal.auth-api.zbaj p2, com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest p3)
    {
        android.os.Parcel v0 = this.zba();
        com.google.android.gms.internal.auth-api.zbc.zbd(v0, p2);
        com.google.android.gms.internal.auth-api.zbc.zbc(v0, p3);
        this.zbb(1, v0);
        return;
    }

    public final void zbd(com.google.android.gms.internal.auth-api.zbal p2, com.google.android.gms.auth.api.identity.SavePasswordRequest p3)
    {
        android.os.Parcel v0 = this.zba();
        com.google.android.gms.internal.auth-api.zbc.zbd(v0, p2);
        com.google.android.gms.internal.auth-api.zbc.zbc(v0, p3);
        this.zbb(2, v0);
        return;
    }
}
