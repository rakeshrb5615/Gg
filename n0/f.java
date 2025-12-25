package n0;
public final class f implements p0.a {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic f(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void accept(Object p5)
    {
        switch (this.a) {
            case 0:
                Throwable v5_2 = ((n0.g) p5);
                if (((n0.g) p5) == null) {
                    v5_2 = new n0.g(-3);
                }
                ((n0.a) this.b).k(v5_2);
                return;
            default:
                p0.a v1_0 = n0.h.d;
                java.util.ArrayList v2_3 = ((java.util.ArrayList) v1_0.get(((String) this.b)));
                if (v2_3 != null) {
                    v1_0.remove(((String) this.b));
                    int v0_1 = 0;
                    while (v0_1 < v2_3.size()) {
                        ((p0.a) v2_3.get(v0_1)).accept(((n0.g) p5));
                        v0_1++;
                    }
                } else {
                }
                return;
        }
    }
}
