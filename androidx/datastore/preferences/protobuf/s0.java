package androidx.datastore.preferences.protobuf;
public final class s0 extends androidx.datastore.preferences.protobuf.b implements java.util.RandomAccess {
    public static final androidx.datastore.preferences.protobuf.s0 d;
    public Object[] b;
    public int c;

    static s0()
    {
        Object[] v2 = new Object[0];
        androidx.datastore.preferences.protobuf.s0.d = new androidx.datastore.preferences.protobuf.s0(v2, 0, 0);
        return;
    }

    public s0(Object[] p1, int p2, boolean p3)
    {
        this.a = p3;
        this.b = p1;
        this.c = p2;
        return;
    }

    public final void add(int p5, Object p6)
    {
        this.a();
        if (p5 >= 0) {
            Object[] v0_2 = this.c;
            if (p5 <= v0_2) {
                Object[] v1_0 = this.b;
                if (v0_2 >= v1_0.length) {
                    Object[] v0_4 = new Object[(((v0_2 * 3) / 2) + 1)];
                    System.arraycopy(v1_0, 0, v0_4, 0, p5);
                    System.arraycopy(this.b, p5, v0_4, (p5 + 1), (this.c - p5));
                    this.b = v0_4;
                } else {
                    System.arraycopy(v1_0, p5, v1_0, (p5 + 1), (v0_2 - p5));
                }
                this.b[p5] = p6;
                this.c = (this.c + 1);
                this.modCount = (this.modCount + 1);
                return;
            }
        }
        int v5_6 = v1.a.p("Index:", p5, ", Size:");
        v5_6.append(this.c);
        throw new IndexOutOfBoundsException(v5_6.toString());
    }

    public final boolean add(Object p5)
    {
        this.a();
        Object[] v0_0 = this.c;
        int v1_1 = this.b;
        if (v0_0 == v1_1.length) {
            this.b = java.util.Arrays.copyOf(v1_1, (((v0_0 * 3) / 2) + 1));
        }
        Object[] v0_2 = this.b;
        int v1_0 = this.c;
        this.c = (v1_0 + 1);
        v0_2[v1_0] = p5;
        this.modCount = (this.modCount + 1);
        return 1;
    }

    public final void b(int p4)
    {
        if ((p4 < null) || (p4 >= this.c)) {
            String v4_2 = v1.a.p("Index:", p4, ", Size:");
            v4_2.append(this.c);
            throw new IndexOutOfBoundsException(v4_2.toString());
        } else {
            return;
        }
    }

    public final androidx.datastore.preferences.protobuf.s0 c(int p4)
    {
        if (p4 < this.c) {
            throw new IllegalArgumentException();
        } else {
            return new androidx.datastore.preferences.protobuf.s0(java.util.Arrays.copyOf(this.b, p4), this.c, 1);
        }
    }

    public final Object get(int p2)
    {
        this.b(p2);
        return this.b[p2];
    }

    public final Object remove(int p5)
    {
        this.a();
        this.b(p5);
        Object[] v0 = this.b;
        Object v1 = v0[p5];
        int v2_0 = this.c;
        if (p5 < (v2_0 - 1)) {
            System.arraycopy(v0, (p5 + 1), v0, p5, ((v2_0 - p5) - 1));
        }
        this.c = (this.c - 1);
        this.modCount = (this.modCount + 1);
        return v1;
    }

    public final Object set(int p3, Object p4)
    {
        this.a();
        this.b(p3);
        Object[] v0 = this.b;
        Object v1 = v0[p3];
        v0[p3] = p4;
        this.modCount = (this.modCount + 1);
        return v1;
    }

    public final int size()
    {
        return this.c;
    }
}
