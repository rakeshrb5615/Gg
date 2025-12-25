package t0;
public final class g extends android.view.View$BaseSavedState {
    public static final android.os.Parcelable$Creator CREATOR;
    public int a;

    static g()
    {
        t0.g.CREATOR = new a2.z(18);
        return;
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("HorizontalScrollView.SavedState{");
        v0_2.append(Integer.toHexString(System.identityHashCode(this)));
        v0_2.append(" scrollPosition=");
        v0_2.append(this.a);
        v0_2.append("}");
        return v0_2.toString();
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        super.writeToParcel(p1, p2);
        p1.writeInt(this.a);
        return;
    }
}
