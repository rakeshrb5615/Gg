package y4;
public final class g0 extends y4.r {
    public static final android.os.Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final com.google.android.gms.internal.firebase-auth-api.zzajb d;
    public final String e;
    public final String f;
    public final String m;

    static g0()
    {
        y4.g0.CREATOR = new y4.f0(1);
        return;
    }

    public g0(String p1, String p2, String p3, com.google.android.gms.internal.firebase-auth-api.zzajb p4, String p5, String p6, String p7)
    {
        this.a = com.google.android.gms.internal.firebase-auth-api.zzac.zzb(p1);
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.m = p7;
        return;
    }

    public static y4.g0 z(com.google.android.gms.internal.firebase-auth-api.zzajb p9)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p9, "Must specify a non-null webSignInCredential");
        return new y4.g0(0, 0, 0, p9, 0, 0, 0);
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 1, this.a, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 2, this.b, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 3, this.c, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 4, this.d, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 5, this.e, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 6, this.f, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 7, this.m, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }

    public final String x()
    {
        return this.a;
    }

    public final y4.c y()
    {
        return new y4.g0(this.a, this.b, this.c, this.d, this.e, this.f, this.m);
    }
}
