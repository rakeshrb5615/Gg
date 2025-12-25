package androidx.versionedparcelable;
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final h2.c a;

    static ParcelImpl()
    {
        androidx.versionedparcelable.ParcelImpl.CREATOR = new a2.z(13);
        return;
    }

    public ParcelImpl(android.os.Parcel p2)
    {
        this.a = new h2.b(p2).g();
        return;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        new h2.b(p1).i(this.a);
        return;
    }
}
