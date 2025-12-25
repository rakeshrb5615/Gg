package e;
public final synthetic class d implements androidx.lifecycle.s {
    public final synthetic e.i a;
    public final synthetic String b;
    public final synthetic e.b c;
    public final synthetic f.a d;

    public synthetic d(e.i p1, String p2, e.b p3, f.a p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public final void c(androidx.lifecycle.u p6, androidx.lifecycle.n p7)
    {
        Object v6_0 = this.a;
        androidx.lifecycle.n v0_0 = v6_0.e;
        String v2 = this.b;
        if (androidx.lifecycle.n.ON_START != p7) {
            if (androidx.lifecycle.n.ON_STOP != p7) {
                if (androidx.lifecycle.n.ON_DESTROY == p7) {
                    v6_0.f(v2);
                }
            } else {
                v0_0.remove(v2);
                return;
            }
        } else {
            int v7_1 = v6_0.g;
            Object v6_1 = v6_0.f;
            f.a v3 = this.d;
            e.b v4 = this.c;
            v0_0.put(v2, new e.f(v3, v4));
            if (v6_1.containsKey(v2)) {
                androidx.lifecycle.n v0_2 = v6_1.get(v2);
                v6_1.remove(v2);
                v4.onActivityResult(v0_2);
            }
            Object v6_3 = ((e.a) a.a.z(v7_1, v2));
            if (v6_3 != null) {
                v7_1.remove(v2);
                v4.onActivityResult(v3.c(v6_3.a, v6_3.b));
                return;
            }
        }
        return;
    }
}
