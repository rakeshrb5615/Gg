package z4;
public final class d0 implements com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public z4.e a;
    public z4.c0 b;
    public y4.g0 c;

    static d0()
    {
        z4.d0.CREATOR = new z4.b(7);
        return;
    }

    public d0(z4.e p7)
    {
        z4.c0 v0_4 = ((z4.e) com.google.android.gms.common.internal.Preconditions.checkNotNull(p7));
        this.a = v0_4;
        z4.c0 v0_5 = v0_4.e;
        this.b = 0;
        boolean v1_1 = 0;
        while (v1_1 < v0_5.size()) {
            if (!android.text.TextUtils.isEmpty(((z4.c) v0_5.get(v1_1)).n)) {
                this.b = new z4.c0(((z4.c) v0_5.get(v1_1)).b, ((z4.c) v0_5.get(v1_1)).n, p7.p);
            }
            v1_1++;
        }
        if (this.b == null) {
            this.b = new z4.c0(p7.p);
        }
        this.c = p7.q;
        return;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 1, this.a, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 2, this.b, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 3, this.c, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
