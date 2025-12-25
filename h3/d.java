package h3;
public final class d extends x0.b {
    public static final android.os.Parcelable$Creator CREATOR;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean m;

    static d()
    {
        h3.d.CREATOR = new a2.c1(3);
        return;
    }

    public d(android.os.Parcel p3, ClassLoader p4)
    {
        int v4_1;
        super(p3, p4);
        super.c = p3.readInt();
        super.d = p3.readInt();
        int v0 = 0;
        if (p3.readInt() != 1) {
            v4_1 = 0;
        } else {
            v4_1 = 1;
        }
        int v4_3;
        super.e = v4_1;
        if (p3.readInt() != 1) {
            v4_3 = 0;
        } else {
            v4_3 = 1;
        }
        super.f = v4_3;
        if (p3.readInt() == 1) {
            v0 = 1;
        }
        super.m = v0;
        return;
    }

    public d(com.google.android.material.bottomsheet.BottomSheetBehavior p2)
    {
        super(android.view.AbsSavedState.EMPTY_STATE);
        super.c = p2.N;
        super.d = p2.e;
        super.e = p2.b;
        super.f = p2.I;
        super.m = p2.J;
        return;
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        super.writeToParcel(p1, p2);
        p1.writeInt(this.c);
        p1.writeInt(this.d);
        p1.writeInt(this.e);
        p1.writeInt(this.f);
        p1.writeInt(this.m);
        return;
    }
}
