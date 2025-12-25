package n2;
public final class g {
    public final n2.a a;
    public final n2.h b;

    public g(n2.a p1, n2.h p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final void a(int p10, int p11)
    {
        if ((p10 != 0) && (p11 != 0)) {
            float[] v0_1 = this.a;
            v0_1.z = p10;
            v0_1.A = p11;
            android.opengl.Matrix.orthoM(v0_1.m, 0, 0, ((float) p10), ((float) p11), 0, -1054867456, 1092616192);
            v0_1.k0();
            float[] v0_0 = v0_1.D;
            if (v0_0 != null) {
                v0_0.m = ((float) p10);
                if (((float) p11) <= ((float) p10)) {
                    v0_0.n = (((float) p10) / ((float) p11));
                } else {
                    v0_0.n = (((float) p11) / ((float) p10));
                }
                c4.b.a0(v0_0.j, v0_0.k, v0_0.l, 0, ((float) p10), ((float) p11), 0);
            }
        }
        this.b.q0(((float) p10), ((float) p11));
        return;
    }
}
