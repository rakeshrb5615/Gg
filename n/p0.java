package n;
public final class p0 extends android.view.View$BaseSavedState {
    public static final android.os.Parcelable$Creator CREATOR;
    public boolean a;

    static p0()
    {
        n.p0.CREATOR = new a2.z(17);
        return;
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        super.writeToParcel(p1, p2);
        p1.writeByte(((byte) this.a));
        return;
    }
}
