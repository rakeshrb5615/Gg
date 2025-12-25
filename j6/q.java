package j6;
public final class q extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final android.os.Bundle a;
    public j6.j b;

    static q()
    {
        j6.q.CREATOR = new a2.z(15);
        return;
    }

    public q(android.os.Bundle p1)
    {
        this.a = p1;
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(p4, 2, this.a, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final j6.j x()
    {
        if (this.b == null) {
            j6.j v0_2 = this.a;
            if (j6.o.C(v0_2)) {
                this.b = new j6.j(new j6.o(v0_2));
            }
        }
        return this.b;
    }
}
