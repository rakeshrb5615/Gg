package x3;
public final class d extends android.view.View$BaseSavedState {
    public static final android.os.Parcelable$Creator CREATOR;
    public float a;
    public float b;
    public java.util.ArrayList c;
    public float d;
    public boolean e;

    static d()
    {
        x3.d.CREATOR = new a2.z(19);
        return;
    }

    public final void writeToParcel(android.os.Parcel p3, int p4)
    {
        super.writeToParcel(p3, p4);
        p3.writeFloat(this.a);
        p3.writeFloat(this.b);
        p3.writeList(this.c);
        p3.writeFloat(this.d);
        boolean[] v0_1 = new boolean[1];
        v0_1[0] = this.e;
        p3.writeBooleanArray(v0_1);
        return;
    }
}
