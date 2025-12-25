package q3;
public final class a extends x0.b {
    public static final android.os.Parcelable$Creator CREATOR;
    public boolean c;

    static a()
    {
        q3.a.CREATOR = new a2.c1(6);
        return;
    }

    public a(android.os.Parcel p1, ClassLoader p2)
    {
        super(p1, p2);
        int v2_1 = 1;
        if (p1.readInt() != 1) {
            v2_1 = 0;
        }
        super.c = v2_1;
        return;
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        super.writeToParcel(p1, p2);
        p1.writeInt(this.c);
        return;
    }
}
