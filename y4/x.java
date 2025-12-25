package y4;
public final class x extends y4.c {
    public static final android.os.Parcelable$Creator CREATOR;
    public final String a;

    static x()
    {
        y4.x.CREATOR = new a2.z(26);
        return;
    }

    public x(String p1)
    {
        this.a = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 1, this.a, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final String x()
    {
        return "playgames.google.com";
    }
}
