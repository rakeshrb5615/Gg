package w6;
public final class j extends w6.z {
    public final synthetic int a;

    public synthetic j(int p1)
    {
        this.a = p1;
        return;
    }

    public final Object b(e7.a p3)
    {
        switch (this.a) {
            case 0:
                Float v3_2;
                if (p3.O() != 9) {
                    v3_2 = Double.valueOf(p3.F());
                } else {
                    p3.K();
                    v3_2 = 0;
                }
                return v3_2;
            case 1:
                Float v3_1;
                if (p3.O() != 9) {
                    v3_1 = Float.valueOf(((float) p3.F()));
                } else {
                    p3.K();
                    v3_1 = 0;
                }
                return v3_1;
            default:
                p3.U();
                return 0;
        }
    }

    public final void c(e7.b p4, Object p5)
    {
        switch (this.a) {
            case 0:
                if (((Number) p5) != null) {
                    float v0_1 = ((Number) p5).doubleValue();
                    w6.m.a(v0_1);
                    p4.F(v0_1);
                } else {
                    p4.B();
                }
                return;
            case 1:
                Float v5_1 = ((Number) p5);
                if (((Number) p5) != null) {
                    float v0_2 = ((Number) p5).floatValue();
                    w6.m.a(((double) v0_2));
                    if (!(((Number) p5) instanceof Float)) {
                        v5_1 = Float.valueOf(v0_2);
                    }
                    p4.H(v5_1);
                } else {
                    p4.B();
                }
                return;
            default:
                p4.B();
                return;
        }
    }

    public String toString()
    {
        switch (this.a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
