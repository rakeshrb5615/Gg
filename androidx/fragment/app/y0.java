package androidx.fragment.app;
public final class y0 implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public String a;
    public int b;

    static y0()
    {
        androidx.fragment.app.y0.CREATOR = new a2.z(5);
        return;
    }

    public y0(String p1, int p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        p1.writeString(this.a);
        p1.writeInt(this.b);
        return;
    }
}
