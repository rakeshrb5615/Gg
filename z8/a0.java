package z8;
public final class a0 extends z8.z0 {
    public final synthetic int d;
    public final synthetic z8.z0 e;

    public synthetic a0(z8.z0 p1, int p2)
    {
        this.d = p2;
        this.e = p1;
        return;
    }

    public final void a(z8.n0 p5, Object p6)
    {
        switch (this.d) {
            case 0:
                if (((Iterable) p6) != null) {
                    java.util.Iterator v6_2 = ((Iterable) p6).iterator();
                    while (v6_2.hasNext()) {
                        this.e.a(p5, v6_2.next());
                    }
                }
                return;
            default:
                if (p6 != null) {
                    Object v0_2 = reflect.Array.getLength(p6);
                    z8.z0 v1_1 = 0;
                    while (v1_1 < v0_2) {
                        this.e.a(p5, reflect.Array.get(p6, v1_1));
                        v1_1++;
                    }
                }
                return;
        }
    }
}
