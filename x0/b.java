package x0;
public abstract class b implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public static final x0.a b;
    public final android.os.Parcelable a;

    static b()
    {
        x0.b.b = new x0.a();
        x0.b.CREATOR = new a2.c1(8);
        return;
    }

    public b()
    {
        this.a = 0;
        return;
    }

    public b(android.os.Parcel p1, ClassLoader p2)
    {
        x0.a v1_1 = p1.readParcelable(p2);
        if (v1_1 == null) {
            v1_1 = x0.b.b;
        }
        this.a = v1_1;
        return;
    }

    public b(android.os.Parcelable p2)
    {
        if (p2 == 0) {
            throw new IllegalArgumentException("superState must not be null");
        } else {
            if (p2 == x0.b.b) {
                p2 = 0;
            }
            this.a = p2;
            return;
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public void writeToParcel(android.os.Parcel p2, int p3)
    {
        p2.writeParcelable(this.a, p3);
        return;
    }
}
