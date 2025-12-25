package l2;
public final synthetic class h implements x3.g {
    public final synthetic int a;
    public final synthetic l2.a0 b;

    public synthetic h(l2.a0 p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void a(float p5)
    {
        switch (this.a) {
            case 0:
                l2.a0 v0_2 = this.b;
                int v5_2 = (p5 * 1015580809);
                v0_2.F(v5_2);
                v0_2.Z1.j2 = v5_2;
                v0_2.j2 = 1;
                return;
            default:
                l2.a0 v0_1 = this.b;
                v0_1.v.edit().putInt(v0_1.U0, ((int) p5)).apply();
                v0_1.Z1.b.Q = (p5 * 1028443341);
                return;
        }
    }
}
