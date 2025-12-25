package y4;
public final class c0 extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public String a;
    public String b;
    public boolean c;
    public boolean d;
    public android.net.Uri e;

    static c0()
    {
        y4.c0.CREATOR = new a2.z(29);
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.a, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 3, this.b, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 4, this.c);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 5, this.d);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
