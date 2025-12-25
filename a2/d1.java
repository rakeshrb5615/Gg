package a2;
public final class d1 extends x0.b {
    public static final android.os.Parcelable$Creator CREATOR;
    public android.os.Parcelable c;

    static d1()
    {
        a2.d1.CREATOR = new a2.c1(0);
        return;
    }

    public d1(android.os.Parcel p1, ClassLoader p2)
    {
        super(p1, p2);
        if (p2 == null) {
            p2 = a2.t0.getClassLoader();
        }
        super.c = p1.readParcelable(p2);
        return;
    }

    public final void writeToParcel(android.os.Parcel p2, int p3)
    {
        super.writeToParcel(p2, p3);
        p2.writeParcelable(this.c, 0);
        return;
    }
}
