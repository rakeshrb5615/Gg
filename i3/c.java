package i3;
public final class c extends x0.b {
    public static final android.os.Parcelable$Creator CREATOR;
    public boolean c;

    static c()
    {
        i3.c.CREATOR = new a2.c1(4);
        return;
    }

    public c(android.os.Parcel p1, ClassLoader p2)
    {
        super(p1, p2);
        if (p2 == 0) {
            i3.c.getClassLoader();
        }
        int v2_2 = 1;
        if (p1.readInt() != 1) {
            v2_2 = 0;
        }
        super.c = v2_2;
        return;
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        super.writeToParcel(p1, p2);
        p1.writeInt(this.c);
        return;
    }
}
