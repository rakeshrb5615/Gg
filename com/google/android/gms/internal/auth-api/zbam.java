package com.google.android.gms.internal.auth-api;
public final class zbam extends com.google.android.gms.internal.auth-api.zba implements android.os.IInterface {

    public zbam(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.auth.api.identity.internal.ISignInService");
        return;
    }

    public final void zbc(com.google.android.gms.internal.auth-api.zbac p2, com.google.android.gms.auth.api.identity.BeginSignInRequest p3)
    {
        android.os.Parcel v0 = this.zba();
        com.google.android.gms.internal.auth-api.zbc.zbd(v0, p2);
        com.google.android.gms.internal.auth-api.zbc.zbc(v0, p3);
        this.zbb(1, v0);
        return;
    }

    public final void zbd(com.google.android.gms.internal.auth-api.zbaf p2, com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest p3, String p4)
    {
        android.os.Parcel v0 = this.zba();
        com.google.android.gms.internal.auth-api.zbc.zbd(v0, p2);
        com.google.android.gms.internal.auth-api.zbc.zbc(v0, p3);
        v0.writeString(p4);
        this.zbb(4, v0);
        return;
    }

    public final void zbe(com.google.android.gms.internal.auth-api.zbah p2, com.google.android.gms.auth.api.identity.GetSignInIntentRequest p3)
    {
        android.os.Parcel v0 = this.zba();
        com.google.android.gms.internal.auth-api.zbc.zbd(v0, p2);
        com.google.android.gms.internal.auth-api.zbc.zbc(v0, p3);
        this.zbb(3, v0);
        return;
    }

    public final void zbf(com.google.android.gms.common.api.internal.IStatusCallback p2, String p3)
    {
        android.os.Parcel v0 = this.zba();
        com.google.android.gms.internal.auth-api.zbc.zbd(v0, p2);
        v0.writeString(p3);
        this.zbb(2, v0);
        return;
    }
}
