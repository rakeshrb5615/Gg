package h2;
public final class b extends h2.a {
    public final android.util.SparseIntArray d;
    public final android.os.Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public b(android.os.Parcel p9)
    {
        this(p9, p9.dataPosition(), p9.dataSize(), "", new r.e(0), new r.e(0), new r.e(0));
        return;
    }

    public b(android.os.Parcel p1, int p2, int p3, String p4, r.e p5, r.e p6, r.e p7)
    {
        super(p5, p6, p7);
        super.d = new android.util.SparseIntArray();
        super.i = -1;
        super.k = -1;
        super.e = p1;
        super.f = p2;
        super.g = p3;
        super.j = p2;
        super.h = p4;
        return;
    }

    public final h2.b a()
    {
        android.os.Parcel v1 = this.e;
        int v2 = v1.dataPosition();
        int v3 = this.j;
        if (v3 == this.f) {
            v3 = this.g;
        }
        return new h2.b(v1, v2, v3, v1.a.n(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    public final boolean e(int p3)
    {
        while (this.j < this.g) {
            int v0_5 = this.k;
            if (v0_5 != p3) {
                if (String.valueOf(v0_5).compareTo(String.valueOf(p3)) <= 0) {
                    int v1_2 = this.e;
                    v1_2.setDataPosition(this.j);
                    int v0_3 = v1_2.readInt();
                    this.k = v1_2.readInt();
                    this.j = (this.j + v0_3);
                } else {
                    return 0;
                }
            }
            return 1;
        }
        if (this.k != p3) {
            return 0;
        }
        return 1;
    }

    public final void h(int p6)
    {
        int v0_0 = this.i;
        android.util.SparseIntArray v1 = this.d;
        android.os.Parcel v2 = this.e;
        if (v0_0 >= 0) {
            int v0_3 = v1.get(v0_0);
            int v3 = v2.dataPosition();
            int v4 = (v3 - v0_3);
            v2.setDataPosition(v0_3);
            v2.writeInt(v4);
            v2.setDataPosition(v3);
        }
        this.i = p6;
        v1.put(p6, v2.dataPosition());
        v2.writeInt(0);
        v2.writeInt(p6);
        return;
    }
}
