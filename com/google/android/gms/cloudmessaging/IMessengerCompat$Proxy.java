package com.google.android.gms.cloudmessaging;
public class IMessengerCompat$Proxy implements com.google.android.gms.cloudmessaging.IMessengerCompat {
    private final android.os.IBinder zza;

    public IMessengerCompat$Proxy(android.os.IBinder p1)
    {
        this.zza = p1;
        return;
    }

    public android.os.IBinder asBinder()
    {
        return this.zza;
    }

    public void send(android.os.Message p4)
    {
        android.os.Parcel v0 = android.os.Parcel.obtain();
        v0.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        v0.writeInt(1);
        p4.writeToParcel(v0, 0);
        try {
            this.zza.transact(1, v0, 0, 1);
            v0.recycle();
            return;
        } catch (Throwable v4_1) {
            v0.recycle();
            throw v4_1;
        }
    }
}
