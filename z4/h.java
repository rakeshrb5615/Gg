package z4;
public final class h extends y4.q {
    public static final android.os.Parcelable$Creator CREATOR;
    public String a;
    public String b;
    public java.util.ArrayList c;
    public java.util.ArrayList d;
    public z4.e e;

    static h()
    {
        z4.h.CREATOR = new z4.b(4);
        return;
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 1, this.a, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 2, this.b, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p5, 3, this.c, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p5, 4, this.d, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 5, this.e, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
