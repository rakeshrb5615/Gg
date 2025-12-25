package androidx.fragment.app;
public final class c implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final java.util.ArrayList a;
    public final java.util.ArrayList b;

    static c()
    {
        androidx.fragment.app.c.CREATOR = new a2.z(4);
        return;
    }

    public c(android.os.Parcel p2)
    {
        this.a = p2.createStringArrayList();
        this.b = p2.createTypedArrayList(androidx.fragment.app.b.CREATOR);
        return;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        p1.writeStringList(this.a);
        p1.writeTypedList(this.b);
        return;
    }
}
