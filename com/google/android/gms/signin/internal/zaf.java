package com.google.android.gms.signin.internal;
public final class zaf extends com.google.android.gms.internal.base.zaa implements android.os.IInterface {

    public zaf(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.signin.internal.ISignInService");
        return;
    }

    public final void zae(int p2)
    {
        android.os.Parcel v0 = this.zaa();
        v0.writeInt(p2);
        this.zac(7, v0);
        return;
    }

    public final void zaf(com.google.android.gms.common.internal.IAccountAccessor p2, int p3, boolean p4)
    {
        android.os.Parcel v0 = this.zaa();
        com.google.android.gms.internal.base.zac.zad(v0, p2);
        v0.writeInt(p3);
        v0.writeInt(p4);
        this.zac(9, v0);
        return;
    }

    public final void zag(com.google.android.gms.signin.internal.zai p2, com.google.android.gms.signin.internal.zae p3)
    {
        android.os.Parcel v0 = this.zaa();
        com.google.android.gms.internal.base.zac.zac(v0, p2);
        com.google.android.gms.internal.base.zac.zad(v0, p3);
        this.zac(12, v0);
        return;
    }
}
