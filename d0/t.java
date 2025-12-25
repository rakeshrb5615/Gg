package d0;
public final class t {
    public final String a;
    public final android.app.Notification b;

    public t(String p1, android.app.Notification p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final void a(b.c p6)
    {
        int v0_0 = this.a;
        android.app.Notification v1 = this.b;
        ((b.a) p6).getClass();
        android.os.Parcel v2 = android.os.Parcel.obtain();
        try {
            v2.writeInterfaceToken(b.c.g);
            v2.writeString(v0_0);
            v2.writeInt(123);
            v2.writeString(0);
            v2.writeInt(1);
            v1.writeToParcel(v2, 0);
            ((b.a) p6).a.transact(1, v2, 0, 1);
            v2.recycle();
            return;
        } catch (Throwable v6_3) {
            v2.recycle();
            throw v6_3;
        }
    }

    public final String toString()
    {
        return v1.a.n(new StringBuilder("NotifyTask[packageName:"), this.a, ", id:123, tag:null]");
    }
}
