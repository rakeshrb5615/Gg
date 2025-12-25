package z3;
public final class a0 extends x0.b {
    public static final android.os.Parcelable$Creator CREATOR;
    public CharSequence c;
    public boolean d;

    static a0()
    {
        z3.a0.CREATOR = new a2.c1(9);
        return;
    }

    public a0(android.os.Parcel p1, ClassLoader p2)
    {
        super(p1, p2);
        super.c = ((CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p1));
        int v2_2 = 1;
        if (p1.readInt() != 1) {
            v2_2 = 0;
        }
        super.d = v2_2;
        return;
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("TextInputLayout.SavedState{");
        v0_2.append(Integer.toHexString(System.identityHashCode(this)));
        v0_2.append(" error=");
        v0_2.append(this.c);
        v0_2.append("}");
        return v0_2.toString();
    }

    public final void writeToParcel(android.os.Parcel p2, int p3)
    {
        super.writeToParcel(p2, p3);
        android.text.TextUtils.writeToParcel(this.c, p2, p3);
        p2.writeInt(this.d);
        return;
    }
}
