package l2;
public final synthetic class g implements x3.g {
    public final synthetic int a;
    public final synthetic l2.a0 b;
    public final synthetic Object c;

    public synthetic g(l2.a0 p1, Object p2, int p3)
    {
        this.a = p3;
        this.b = p1;
        this.c = p2;
        return;
    }

    public final void a(float p5)
    {
        switch (this.a) {
            case 0:
                i2.v0 v1_3 = this.b;
                v1_3.v.edit().putInt(((String) this.c), v1_3.J2[Math.round(p5)]).apply();
                return;
            default:
                n2.s v0_2 = ((n2.f) this.c);
                i2.v0 v1_1 = this.b;
                v1_1.v.edit().putInt(v1_1.b1, ((int) p5)).apply();
                if ((v1_1.Y1 != null) && ((v1_1.Z1 != null) && (v0_2 != null))) {
                    n2.s v0_5 = v0_2.p;
                    if (v0_5 != null) {
                        v0_5.U = ((int) p5);
                    }
                }
                return;
        }
    }
}
