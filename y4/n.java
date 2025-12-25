package y4;
public final class n extends y4.c {
    public static final android.os.Parcelable$Creator CREATOR;
    public final String a;
    public final String b;

    static n()
    {
        y4.n.CREATOR = new a2.z(22);
        return;
    }

    public n(String p2, String p3)
    {
        if ((p2 == null) && (p3 == null)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        } else {
            if ((p2 != null) && (p2.length() == 0)) {
                throw new IllegalArgumentException("idToken cannot be empty");
            } else {
                if ((p3 != null) && (p3.length() == 0)) {
                    throw new IllegalArgumentException("accessToken cannot be empty");
                } else {
                    this.a = p2;
                    this.b = p3;
                    return;
                }
            }
        }
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 1, this.a, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.b, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final String x()
    {
        return "google.com";
    }
}
