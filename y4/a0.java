package y4;
public final class a0 extends y4.c {
    public static final android.os.Parcelable$Creator CREATOR;
    public final String a;
    public final String b;

    static a0()
    {
        y4.a0.CREATOR = new a2.z(28);
        return;
    }

    public a0(String p1, String p2)
    {
        this.a = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        this.b = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        return;
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
        return "twitter.com";
    }
}
