package g2;
public abstract class m extends g2.l {
    public h0.d[] a;
    public String b;
    public int c;

    public m()
    {
        this.a = 0;
        this.c = 0;
        return;
    }

    public m(g2.m p2)
    {
        this.a = 0;
        this.c = 0;
        this.b = p2.b;
        this.a = a.a.p(p2.a);
        return;
    }

    public h0.d[] getPathData()
    {
        return this.a;
    }

    public String getPathName()
    {
        return this.b;
    }

    public void setPathData(h0.d[] p8)
    {
        h0.d[] v0_0 = this.a;
        int v1_0 = 0;
        if ((v0_0 != null) && ((p8 != null) && (v0_0.length == p8.length))) {
            int v2_0 = 0;
            while (v2_0 < v0_0.length) {
                int v3_0 = v0_0[v2_0];
                float[] v5_0 = p8[v2_0];
                if ((v3_0.a == v5_0.a) && (v3_0.b.length == v5_0.b.length)) {
                    v2_0++;
                }
            }
            v1_0 = 1;
        }
        if (v1_0 != 0) {
            h0.d[] v0_1 = this.a;
            int v2_1 = 0;
            while (v2_1 < p8.length) {
                v0_1[v2_1].a = p8[v2_1].a;
                int v3_5 = 0;
                while(true) {
                    int v4_6 = p8[v2_1].b;
                    if (v3_5 >= v4_6.length) {
                        break;
                    }
                    v0_1[v2_1].b[v3_5] = v4_6[v3_5];
                    v3_5++;
                }
                v2_1++;
            }
            return;
        } else {
            this.a = a.a.p(p8);
            return;
        }
    }
}
