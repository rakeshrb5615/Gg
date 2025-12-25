package com.google.android.gms.internal.auth-api;
public class zba implements android.os.IInterface {
    private final android.os.IBinder zba;
    private final String zbb;

    public zba(android.os.IBinder p1, String p2)
    {
        this.zba = p1;
        this.zbb = p2;
        return;
    }

    public final android.os.IBinder asBinder()
    {
        return this.zba;
    }

    public final android.os.Parcel zba()
    {
        android.os.Parcel v0 = android.os.Parcel.obtain();
        v0.writeInterfaceToken(this.zbb);
        return v0;
    }

    public final void zbb(int p4, android.os.Parcel p5)
    {
        android.os.Parcel v0 = android.os.Parcel.obtain();
        try {
            this.zba.transact(p4, p5, v0, 0);
            v0.readException();
            p5.recycle();
            v0.recycle();
            return;
        } catch (Throwable v4_1) {
            p5.recycle();
            v0.recycle();
            throw v4_1;
        }
    }
}
