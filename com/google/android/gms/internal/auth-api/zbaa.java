package com.google.android.gms.internal.auth-api;
public final class zbaa extends com.google.android.gms.internal.auth-api.zba implements android.os.IInterface {

    public zbaa(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        return;
    }

    public final void zbc(com.google.android.gms.internal.auth-api.zbz p2, com.google.android.gms.auth.api.identity.AuthorizationRequest p3)
    {
        android.os.Parcel v0 = this.zba();
        com.google.android.gms.internal.auth-api.zbc.zbd(v0, p2);
        com.google.android.gms.internal.auth-api.zbc.zbc(v0, p3);
        this.zbb(1, v0);
        return;
    }
}
