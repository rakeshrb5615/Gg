package com.google.android.gms.common.internal.service;
public final class zai extends com.google.android.gms.internal.base.zaa implements android.os.IInterface {

    public zai(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.common.internal.service.IClientTelemetryService");
        return;
    }

    public final void zae(com.google.android.gms.common.internal.TelemetryData p2)
    {
        android.os.Parcel v0 = this.zaa();
        com.google.android.gms.internal.base.zac.zac(v0, p2);
        this.zad(1, v0);
        return;
    }
}
