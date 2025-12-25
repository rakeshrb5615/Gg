package com.google.android.gms.common.internal;
public final class zam extends com.google.android.gms.internal.base.zaa implements android.os.IInterface {

    public zam(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.common.internal.ISignInButtonCreator");
        return;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zae(com.google.android.gms.dynamic.IObjectWrapper p2, com.google.android.gms.common.internal.zax p3)
    {
        android.os.Parcel v0 = this.zaa();
        com.google.android.gms.internal.base.zac.zad(v0, p2);
        com.google.android.gms.internal.base.zac.zac(v0, p3);
        android.os.Parcel v2_2 = this.zab(2, v0);
        com.google.android.gms.dynamic.IObjectWrapper v3_1 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(v2_2.readStrongBinder());
        v2_2.recycle();
        return v3_1;
    }
}
