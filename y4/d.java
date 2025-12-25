package y4;
public final class d extends y4.c {
    public static final android.os.Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public String d;
    public boolean e;

    static d()
    {
        y4.d.CREATOR = new y4.f0(2);
        return;
    }

    public d(String p1, String p2, String p3, String p4, boolean p5)
    {
        this.a = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        if ((android.text.TextUtils.isEmpty(p2)) && (android.text.TextUtils.isEmpty(p3))) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        } else {
            this.b = p2;
            this.c = p3;
            this.d = p4;
            this.e = p5;
            return;
        }
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 1, this.a, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.b, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 3, this.c, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 4, this.d, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 5, this.e);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final String x()
    {
        return "password";
    }
}
