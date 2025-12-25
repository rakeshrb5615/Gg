package androidx.fragment.app;
public final class d1 implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public java.util.ArrayList a;
    public java.util.ArrayList b;
    public androidx.fragment.app.b[] c;
    public int d;
    public String e;
    public java.util.ArrayList f;
    public java.util.ArrayList m;
    public java.util.ArrayList n;

    static d1()
    {
        androidx.fragment.app.d1.CREATOR = new a2.z(6);
        return;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel p2, int p3)
    {
        p2.writeStringList(this.a);
        p2.writeStringList(this.b);
        p2.writeTypedArray(this.c, p3);
        p2.writeInt(this.d);
        p2.writeString(this.e);
        p2.writeStringList(this.f);
        p2.writeTypedList(this.m);
        p2.writeTypedList(this.n);
        return;
    }
}
