package n;
public final class d3 extends x0.b {
    public static final android.os.Parcelable$Creator CREATOR;
    public int c;
    public boolean d;

    static d3()
    {
        n.d3.CREATOR = new a2.c1(5);
        return;
    }

    public d3(android.os.Parcel p1, ClassLoader p2)
    {
        int v1_2;
        super(p1, p2);
        super.c = p1.readInt();
        if (p1.readInt() == 0) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        super.d = v1_2;
        return;
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        super.writeToParcel(p1, p2);
        p1.writeInt(this.c);
        p1.writeInt(this.d);
        return;
    }
}
