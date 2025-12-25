package k4;
public abstract class l {
    public static final synthetic int a;

    static l()
    {
        k4.l.getClassLoader();
        return;
    }

    public static android.os.Parcelable a(android.os.Parcel p2)
    {
        if (p2.readInt() != 0) {
            return ((android.os.Parcelable) android.os.Bundle.CREATOR.createFromParcel(p2));
        } else {
            return 0;
        }
    }

    public static void b(android.os.Parcel p2)
    {
        String v2_1 = p2.dataAvail();
        if (v2_1 > null) {
            throw new android.os.BadParcelableException(g2.g.c(v2_1, "Parcel data not fully consumed, unread size: "));
        } else {
            return;
        }
    }
}
