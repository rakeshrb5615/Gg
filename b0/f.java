package b0;
public final class f extends x0.b {
    public static final android.os.Parcelable$Creator CREATOR;
    public android.util.SparseArray c;

    static f()
    {
        b0.f.CREATOR = new a2.c1(2);
        return;
    }

    public f(android.os.Parcel p6, ClassLoader p7)
    {
        super(p6, p7);
        int v0 = p6.readInt();
        int[] v1 = new int[v0];
        p6.readIntArray(v1);
        android.os.Parcelable[] v6_1 = p6.readParcelableArray(p7);
        super.c = new android.util.SparseArray(v0);
        int v7_1 = 0;
        while (v7_1 < v0) {
            super.c.append(v1[v7_1], v6_1[v7_1]);
            v7_1++;
        }
        return;
    }

    public final void writeToParcel(android.os.Parcel p6, int p7)
    {
        int v0_1;
        super.writeToParcel(p6, p7);
        int v0_0 = this.c;
        int v1 = 0;
        if (v0_0 == 0) {
            v0_1 = 0;
        } else {
            v0_1 = v0_0.size();
        }
        p6.writeInt(v0_1);
        int[] v2 = new int[v0_1];
        android.os.Parcelable[] v3 = new android.os.Parcelable[v0_1];
        while (v1 < v0_1) {
            v2[v1] = this.c.keyAt(v1);
            v3[v1] = ((android.os.Parcelable) this.c.valueAt(v1));
            v1++;
        }
        p6.writeIntArray(v2);
        p6.writeParcelableArray(v3, p7);
        return;
    }
}
