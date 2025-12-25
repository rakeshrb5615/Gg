package k4;
public abstract class a implements android.os.IInterface {
    public final android.os.IBinder a;
    public final String b;

    public a(android.os.IBinder p1, String p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final android.os.IBinder asBinder()
    {
        return this.a;
    }

    public final void d(int p4, android.os.Parcel p5)
    {
        try {
            this.a.transact(p4, p5, 0, 1);
            p5.recycle();
            return;
        } catch (Throwable v4_1) {
            p5.recycle();
            throw v4_1;
        }
    }
}
