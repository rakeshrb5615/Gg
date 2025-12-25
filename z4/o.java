package z4;
public final class o extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final java.util.List a;
    public final java.util.List b;

    static o()
    {
        z4.o.CREATOR = new z4.b(5);
        return;
    }

    public o(java.util.ArrayList p1, java.util.ArrayList p2)
    {
        if (p1 == null) {
            p1 = new java.util.ArrayList();
        }
        this.a = p1;
        if (p2 == null) {
            p2 = new java.util.ArrayList();
        }
        this.b = p2;
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p4, 1, this.a, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p4, 2, this.b, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
