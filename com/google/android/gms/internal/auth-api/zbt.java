package com.google.android.gms.internal.auth-api;
public final class zbt extends com.google.android.gms.internal.auth-api.zba implements android.os.IInterface {

    public zbt(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return;
    }

    public final void zbc(com.google.android.gms.internal.auth-api.zbs p2, com.google.android.gms.internal.auth-api.zbp p3)
    {
        android.os.Parcel v0 = this.zba();
        com.google.android.gms.internal.auth-api.zbc.zbd(v0, p2);
        com.google.android.gms.internal.auth-api.zbc.zbc(v0, p3);
        this.zbb(3, v0);
        return;
    }

    public final void zbd(com.google.android.gms.internal.auth-api.zbs p2, com.google.android.gms.auth.api.credentials.CredentialRequest p3)
    {
        android.os.Parcel v0 = this.zba();
        com.google.android.gms.internal.auth-api.zbc.zbd(v0, p2);
        com.google.android.gms.internal.auth-api.zbc.zbc(v0, p3);
        this.zbb(1, v0);
        return;
    }

    public final void zbe(com.google.android.gms.internal.auth-api.zbs p2, com.google.android.gms.internal.auth-api.zbu p3)
    {
        android.os.Parcel v0 = this.zba();
        com.google.android.gms.internal.auth-api.zbc.zbd(v0, p2);
        com.google.android.gms.internal.auth-api.zbc.zbc(v0, p3);
        this.zbb(2, v0);
        return;
    }

    public final void zbf(com.google.android.gms.internal.auth-api.zbs p2)
    {
        android.os.Parcel v0 = this.zba();
        com.google.android.gms.internal.auth-api.zbc.zbd(v0, p2);
        this.zbb(4, v0);
        return;
    }
}
