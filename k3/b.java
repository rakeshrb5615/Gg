package k3;
public final class b extends android.view.View$BaseSavedState {
    public static final android.os.Parcelable$Creator CREATOR;
    public int a;

    static b()
    {
        k3.b.CREATOR = new a2.z(16);
        return;
    }

    public final String toString()
    {
        String v1_2;
        String v0_1 = new StringBuilder("MaterialCheckBox.SavedState{");
        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
        v0_1.append(" CheckedState=");
        String v1_1 = this.a;
        if (v1_1 == 1) {
            v1_2 = "checked";
        } else {
            if (v1_1 == 2) {
                v1_2 = "indeterminate";
            } else {
                v1_2 = "unchecked";
            }
        }
        return v1.a.n(v0_1, v1_2, "}");
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        super.writeToParcel(p1, p2);
        p1.writeValue(Integer.valueOf(this.a));
        return;
    }
}
