package y4;
public final class s extends y4.c implements java.lang.Cloneable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public boolean d;
    public final String e;

    static s()
    {
        y4.s.CREATOR = new a2.z(24);
        return;
    }

    public s(String p3, String p4, String p5, String p6, boolean p7)
    {
        int v0_1;
        if (((android.text.TextUtils.isEmpty(p3)) || (android.text.TextUtils.isEmpty(p4))) && ((android.text.TextUtils.isEmpty(p5)) || (android.text.TextUtils.isEmpty(p6)))) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_1, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.a = p3;
        this.b = p4;
        this.c = p5;
        this.d = p7;
        this.e = p6;
        return;
    }

    public final Object clone()
    {
        return new y4.s(this.a, this.b, this.c, this.e, this.d);
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 1, this.a, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.b, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 4, this.c, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 5, this.d);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 6, this.e, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final String x()
    {
        return "phone";
    }
}
