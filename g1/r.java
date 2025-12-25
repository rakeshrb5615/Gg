package g1;
public final class r {
    public final android.util.SparseArray a;
    public g1.u b;

    public r(int p2)
    {
        this.a = new android.util.SparseArray(p2);
        return;
    }

    public final void a(g1.u p5, int p6, int p7)
    {
        g1.r v0_2;
        g1.r v0_0 = p5.a(p6);
        android.util.SparseArray v1 = this.a;
        if (v1 != null) {
            v0_2 = ((g1.r) v1.get(v0_0));
        } else {
            v0_2 = 0;
        }
        if (v0_2 == null) {
            v0_2 = new g1.r(1);
            v1.put(p5.a(p6), v0_2);
        }
        if (p7 <= p6) {
            v0_2.b = p5;
            return;
        } else {
            v0_2.a(p5, (p6 + 1), p7);
            return;
        }
    }
}
