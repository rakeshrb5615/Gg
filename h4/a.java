package h4;
public abstract class a implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;

    static a()
    {
        h4.a.CREATOR = new a2.z(14);
        return;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel p3, int p4)
    {
        p3.writeParcelable(((h4.b) this).a, 0);
        p3.writeInt(((h4.b) this).b);
        return;
    }
}
