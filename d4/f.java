package d4;
public final class f implements d4.h, android.os.IInterface {
    public final android.os.IBinder a;

    public f(android.os.IBinder p1)
    {
        this.a = p1;
        return;
    }

    public final android.os.IBinder asBinder()
    {
        return this.a;
    }

    public final void b(String p3, android.os.Bundle p4, c4.j p5)
    {
        android.os.Parcel v0 = android.os.Parcel.obtain();
        v0.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        v0.writeString(p3);
        v0.writeInt(1);
        p4.writeToParcel(v0, 0);
        v0.writeStrongBinder(p5);
        try {
            this.a.transact(3, v0, 0, 1);
            v0.recycle();
            return;
        } catch (Throwable v3_1) {
            v0.recycle();
            throw v3_1;
        }
    }

    public final void c(String p3, android.os.Bundle p4, c4.k p5)
    {
        android.os.Parcel v0 = android.os.Parcel.obtain();
        v0.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        v0.writeString(p3);
        v0.writeInt(1);
        p4.writeToParcel(v0, 0);
        v0.writeStrongBinder(p5);
        try {
            this.a.transact(2, v0, 0, 1);
            v0.recycle();
            return;
        } catch (Throwable v3_1) {
            v0.recycle();
            throw v3_1;
        }
    }
}
