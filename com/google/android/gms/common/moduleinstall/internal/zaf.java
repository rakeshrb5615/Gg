package com.google.android.gms.common.moduleinstall.internal;
public final class zaf extends com.google.android.gms.internal.base.zaa implements android.os.IInterface {

    public zaf(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return;
    }

    public final void zae(com.google.android.gms.common.moduleinstall.internal.zae p2, com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest p3)
    {
        android.os.Parcel v0 = this.zaa();
        com.google.android.gms.internal.base.zac.zad(v0, p2);
        com.google.android.gms.internal.base.zac.zac(v0, p3);
        this.zac(1, v0);
        return;
    }

    public final void zaf(com.google.android.gms.common.moduleinstall.internal.zae p2, com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest p3)
    {
        android.os.Parcel v0 = this.zaa();
        com.google.android.gms.internal.base.zac.zad(v0, p2);
        com.google.android.gms.internal.base.zac.zac(v0, p3);
        this.zac(3, v0);
        return;
    }

    public final void zag(com.google.android.gms.common.moduleinstall.internal.zae p2, com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest p3, com.google.android.gms.common.moduleinstall.internal.zah p4)
    {
        android.os.Parcel v0 = this.zaa();
        com.google.android.gms.internal.base.zac.zad(v0, p2);
        com.google.android.gms.internal.base.zac.zac(v0, p3);
        com.google.android.gms.internal.base.zac.zad(v0, p4);
        this.zac(2, v0);
        return;
    }

    public final void zah(com.google.android.gms.common.api.internal.IStatusCallback p2, com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest p3)
    {
        android.os.Parcel v0 = this.zaa();
        com.google.android.gms.internal.base.zac.zad(v0, p2);
        com.google.android.gms.internal.base.zac.zac(v0, p3);
        this.zac(4, v0);
        return;
    }

    public final void zai(com.google.android.gms.common.api.internal.IStatusCallback p2, com.google.android.gms.common.moduleinstall.internal.zah p3)
    {
        android.os.Parcel v0 = this.zaa();
        com.google.android.gms.internal.base.zac.zad(v0, p2);
        com.google.android.gms.internal.base.zac.zad(v0, p3);
        this.zac(6, v0);
        return;
    }
}
