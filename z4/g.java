package z4;
public final class g extends y4.q {
    public static final android.os.Parcelable$Creator CREATOR;
    public final java.util.List a;
    public final z4.h b;
    public final String c;
    public final y4.g0 d;
    public final z4.e e;
    public final java.util.List f;

    static g()
    {
        z4.g.CREATOR = new z4.b(3);
        return;
    }

    public g(java.util.ArrayList p1, z4.h p2, String p3, y4.g0 p4, z4.e p5, java.util.ArrayList p6)
    {
        this.a = ((java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.b = ((z4.h) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        this.c = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3);
        this.d = p4;
        this.e = p5;
        this.f = ((java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(p6));
        return;
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p5, 1, this.a, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 2, this.b, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 3, this.c, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 4, this.d, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 5, this.e, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p5, 6, this.f, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
