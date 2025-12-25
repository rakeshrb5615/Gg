package z4;
public final class c0 implements com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final boolean c;

    static c0()
    {
        z4.c0.CREATOR = new z4.b(6);
        return;
    }

    public c0(String p1, String p2, boolean p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.a = p1;
        this.b = p2;
        z4.m.d(p2);
        this.c = p3;
        return;
    }

    public c0(boolean p1)
    {
        this.c = p1;
        this.b = 0;
        this.a = 0;
        return;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 1, this.a, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.b, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 3, this.c);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
