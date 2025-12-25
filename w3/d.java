package w3;
public final class d extends x0.b {
    public static final android.os.Parcelable$Creator CREATOR;
    public final int c;

    static d()
    {
        w3.d.CREATOR = new a2.c1(7);
        return;
    }

    public d(android.os.Parcel p1, ClassLoader p2)
    {
        super(p1, p2);
        super.c = p1.readInt();
        return;
    }

    public d(com.google.android.material.sidesheet.SideSheetBehavior p2)
    {
        super(android.view.AbsSavedState.EMPTY_STATE);
        super.c = p2.h;
        return;
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        super.writeToParcel(p1, p2);
        p1.writeInt(this.c);
        return;
    }
}
