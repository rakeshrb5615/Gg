package com.google.android.gms.internal.base;
public class zaa implements android.os.IInterface {
    private final android.os.IBinder zaa;
    private final String zab;

    public zaa(android.os.IBinder p1, String p2)
    {
        this.zaa = p1;
        this.zab = p2;
        return;
    }

    public final android.os.IBinder asBinder()
    {
        return this.zaa;
    }

    public final android.os.Parcel zaa()
    {
        android.os.Parcel v0 = android.os.Parcel.obtain();
        v0.writeInterfaceToken(this.zab);
        return v0;
    }

    public final android.os.Parcel zab(int p4, android.os.Parcel p5)
    {
        Throwable v4_0 = android.os.Parcel.obtain();
        try {
            this.zaa.transact(2, p5, v4_0, 0);
            v4_0.readException();
            p5.recycle();
            return v4_0;
        } catch (RuntimeException v0_1) {
            v4_0.recycle();
            throw v0_1;
        } catch (Throwable v4_1) {
            p5.recycle();
            throw v4_1;
        }
    }

    public final void zac(int p4, android.os.Parcel p5)
    {
        android.os.Parcel v0 = android.os.Parcel.obtain();
        try {
            this.zaa.transact(p4, p5, v0, 0);
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

    public final void zad(int p3, android.os.Parcel p4)
    {
        try {
            this.zaa.transact(1, p4, 0, 1);
            p4.recycle();
            return;
        } catch (Throwable v3_1) {
            p4.recycle();
            throw v3_1;
        }
    }
}
