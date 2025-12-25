package z6;
public final class n implements w6.a0 {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic n(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final w6.z a(w6.m p2, d7.a p3)
    {
        switch (this.a) {
            case 0:
                int v2_2;
                if (p3.a != Number) {
                    v2_2 = 0;
                } else {
                    v2_2 = ((z6.o) this.b);
                }
                return v2_2;
            case 1:
                int v3_5;
                if (p3.a != Object) {
                    v3_5 = 0;
                } else {
                    v3_5 = new z6.p(p2, ((w6.x) this.b));
                }
                return v3_5;
            default:
                int v2_5;
                int v2_4 = p3.a;
                if ((v2_4 != java.util.Calendar) && (v2_4 != java.util.GregorianCalendar)) {
                    v2_5 = 0;
                } else {
                    v2_5 = ((z6.o0) this.b);
                }
                return v2_5;
        }
    }

    public String toString()
    {
        switch (this.a) {
            case 2:
                String v0_4 = new StringBuilder("Factory[type=");
                v0_4.append(java.util.Calendar.getName());
                v0_4.append("+");
                v0_4.append(java.util.GregorianCalendar.getName());
                v0_4.append(",adapter=");
                v0_4.append(((z6.o0) this.b));
                v0_4.append("]");
                return v0_4.toString();
            default:
                return super.toString();
        }
    }
}
