package y4;
public final class a extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean m;
    public final String n;
    public int o;
    public final String p;
    public final String q;

    static a()
    {
        y4.a.CREATOR = new a2.z(20);
        return;
    }

    public a(String p1, String p2, String p3, String p4, boolean p5, String p6, boolean p7, String p8, int p9, String p10, String p11)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.m = p7;
        this.n = p8;
        this.o = p9;
        this.p = p10;
        this.q = p11;
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 1, this.a, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.b, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 3, this.c, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 4, this.d, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 5, this.e);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 6, this.f, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 7, this.m);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 8, this.n, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 9, this.o);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 10, this.p, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 11, this.q, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
