package com.google.android.gms.common.internal;
final class zzaa implements com.google.android.gms.common.internal.IGmsServiceBroker {
    private final android.os.IBinder zza;

    public zzaa(android.os.IBinder p1)
    {
        this.zza = p1;
        return;
    }

    public final android.os.IBinder asBinder()
    {
        return this.zza;
    }

    public final void getService(com.google.android.gms.common.internal.IGmsCallbacks p4, com.google.android.gms.common.internal.GetServiceRequest p5)
    {
        android.os.Parcel v0 = android.os.Parcel.obtain();
        android.os.Parcel v1 = android.os.Parcel.obtain();
        int v4_3;
        v0.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (p4 == 0) {
            v4_3 = 0;
        } else {
            v4_3 = p4.asBinder();
        }
        v0.writeStrongBinder(v4_3);
        if (p5 == null) {
            v0.writeInt(0);
        } else {
            v0.writeInt(1);
            com.google.android.gms.common.internal.zzm.zza(p5, v0, 0);
        }
        this.zza.transact(46, v0, v1, 0);
        v1.readException();
        v1.recycle();
        v0.recycle();
        return;
    }
}
