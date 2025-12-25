package a2;
public final class q1 implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public int a;
    public int b;
    public int[] c;
    public boolean d;

    static q1()
    {
        a2.q1.CREATOR = new a2.z(1);
        return;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("FullSpanItem{mPosition=");
        v0_1.append(this.a);
        v0_1.append(", mGapDir=");
        v0_1.append(this.b);
        v0_1.append(", mHasUnwantedGapAfter=");
        v0_1.append(this.d);
        v0_1.append(", mGapPerSpan=");
        v0_1.append(java.util.Arrays.toString(this.c));
        v0_1.append(125);
        return v0_1.toString();
    }

    public final void writeToParcel(android.os.Parcel p2, int p3)
    {
        p2.writeInt(this.a);
        p2.writeInt(this.b);
        p2.writeInt(this.d);
        int[] v3_6 = this.c;
        if ((v3_6 == null) || (v3_6.length <= 0)) {
            p2.writeInt(0);
            return;
        } else {
            p2.writeInt(v3_6.length);
            p2.writeIntArray(this.c);
            return;
        }
    }
}
