package w6;
public final class y extends w6.z {
    public final synthetic w6.z a;

    public y(w6.z p1)
    {
        this.a = p1;
        return;
    }

    public final Object b(e7.a p3)
    {
        if (p3.O() != 9) {
            return this.a.b(p3);
        } else {
            p3.K();
            return 0;
        }
    }

    public final void c(e7.b p2, Object p3)
    {
        if (p3 != null) {
            this.a.c(p2, p3);
            return;
        } else {
            p2.B();
            return;
        }
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("NullSafeTypeAdapter[");
        v0_1.append(this.a);
        v0_1.append("]");
        return v0_1.toString();
    }
}
