package z6;
public final class o extends w6.z {
    public static final z6.n b;
    public final w6.x a;

    static o()
    {
        z6.o.b = new z6.n(new z6.o(w6.x.b), 0);
        return;
    }

    public o(w6.x p1)
    {
        this.a = p1;
        return;
    }

    public final Object b(e7.a p5)
    {
        int v0_0 = p5.O();
        w6.p v1_2 = u.e.c(v0_0);
        if ((v1_2 == 5) || (v1_2 == 6)) {
            return this.a.a(p5);
        } else {
            if (v1_2 != 8) {
                StringBuilder v2_2 = new StringBuilder("Expecting number, got: ");
                v2_2.append(v1.a.z(v0_0));
                v2_2.append("; at path ");
                v2_2.append(p5.A(0));
                throw new w6.p(v2_2.toString());
            } else {
                p5.K();
                return 0;
            }
        }
    }

    public final void c(e7.b p1, Object p2)
    {
        p1.H(((Number) p2));
        return;
    }
}
