package a2;
public final class a0 implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public int a;
    public int b;
    public boolean c;

    static a0()
    {
        a2.a0.CREATOR = new a2.z(0);
        return;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        p1.writeInt(this.a);
        p1.writeInt(this.b);
        p1.writeInt(this.c);
        return;
    }
}
