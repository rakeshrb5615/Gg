package androidx.fragment.app;
public final class b implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final int[] a;
    public final java.util.ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int m;
    public final int n;
    public final CharSequence o;
    public final int p;
    public final CharSequence q;
    public final java.util.ArrayList r;
    public final java.util.ArrayList s;
    public final boolean t;

    static b()
    {
        androidx.fragment.app.b.CREATOR = new a2.z(3);
        return;
    }

    public b(android.os.Parcel p3)
    {
        int v3_2;
        this.a = p3.createIntArray();
        this.b = p3.createStringArrayList();
        this.c = p3.createIntArray();
        this.d = p3.createIntArray();
        this.e = p3.readInt();
        this.f = p3.readString();
        this.m = p3.readInt();
        this.n = p3.readInt();
        java.util.ArrayList v0_6 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR;
        this.o = ((CharSequence) v0_6.createFromParcel(p3));
        this.p = p3.readInt();
        this.q = ((CharSequence) v0_6.createFromParcel(p3));
        this.r = p3.createStringArrayList();
        this.s = p3.createStringArrayList();
        if (p3.readInt() == 0) {
            v3_2 = 0;
        } else {
            v3_2 = 1;
        }
        this.t = v3_2;
        return;
    }

    public b(androidx.fragment.app.a p9)
    {
        java.util.ArrayList v0_6 = p9.a.size();
        int v1_6 = new int[(v0_6 * 6)];
        this.a = v1_6;
        if (!p9.g) {
            throw new IllegalStateException("Not on back stack");
        } else {
            this.b = new java.util.ArrayList(v0_6);
            int v1_2 = new int[v0_6];
            this.c = v1_2;
            int v1_3 = new int[v0_6];
            this.d = v1_3;
            int v1_4 = 0;
            int v2 = 0;
            while (v1_4 < v0_6) {
                int v6_2;
                int v3_2 = ((androidx.fragment.app.l1) p9.a.get(v1_4));
                int v5_0 = (v2 + 1);
                this.a[v2] = v3_2.a;
                int v6_1 = v3_2.b;
                if (v6_1 == 0) {
                    v6_2 = 0;
                } else {
                    v6_2 = v6_1.mWho;
                }
                this.b.add(v6_2);
                int[] v4_2 = this.a;
                int v6_3 = (v2 + 2);
                v4_2[v5_0] = v3_2.c;
                int v5_1 = (v2 + 3);
                v4_2[v6_3] = v3_2.d;
                int v6_4 = (v2 + 4);
                v4_2[v5_1] = v3_2.e;
                int v5_2 = (v2 + 5);
                v4_2[v6_4] = v3_2.f;
                v2 += 6;
                v4_2[v5_2] = v3_2.g;
                this.c[v1_4] = v3_2.h.ordinal();
                this.d[v1_4] = v3_2.i.ordinal();
                v1_4++;
            }
            this.e = p9.f;
            this.f = p9.i;
            this.m = p9.s;
            this.n = p9.j;
            this.o = p9.k;
            this.p = p9.l;
            this.q = p9.m;
            this.r = p9.n;
            this.s = p9.o;
            this.t = p9.p;
            return;
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel p2, int p3)
    {
        p2.writeIntArray(this.a);
        p2.writeStringList(this.b);
        p2.writeIntArray(this.c);
        p2.writeIntArray(this.d);
        p2.writeInt(this.e);
        p2.writeString(this.f);
        p2.writeInt(this.m);
        p2.writeInt(this.n);
        android.text.TextUtils.writeToParcel(this.o, p2, 0);
        p2.writeInt(this.p);
        android.text.TextUtils.writeToParcel(this.q, p2, 0);
        p2.writeStringList(this.r);
        p2.writeStringList(this.s);
        p2.writeInt(this.t);
        return;
    }
}
