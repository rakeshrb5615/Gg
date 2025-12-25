package androidx.fragment.app;
public final class d0 implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final android.os.Bundle a;

    static d0()
    {
        androidx.fragment.app.d0.CREATOR = new a2.c1(1);
        return;
    }

    public d0(android.os.Parcel p1, ClassLoader p2)
    {
        android.os.Bundle v1_1 = p1.readBundle();
        this.a = v1_1;
        if ((p2 != null) && (v1_1 != null)) {
            v1_1.setClassLoader(p2);
        }
        return;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        p1.writeBundle(this.a);
        return;
    }
}
