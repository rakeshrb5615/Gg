package u;
public final class f implements java.lang.Comparable {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public float e;
    public boolean f;
    public final float[] m;
    public final float[] n;
    public u.b[] o;
    public int p;
    public int q;
    public int r;

    public f(int p4)
    {
        this.b = -1;
        this.c = -1;
        this.d = 0;
        this.f = 0;
        float[] v2 = new float[9];
        this.m = v2;
        u.b[] v1_0 = new float[9];
        this.n = v1_0;
        u.b[] v1_2 = new u.b[16];
        this.o = v1_2;
        this.p = 0;
        this.q = 0;
        this.r = p4;
        return;
    }

    public final void a(u.b p4)
    {
        u.b[] v0_0 = 0;
        while(true) {
            int v1_0 = this.p;
            if (v0_0 >= v1_0) {
                break;
            }
            if (this.o[v0_0] != p4) {
                v0_0++;
            } else {
                return;
            }
        }
        u.b[] v0_3 = this.o;
        if (v1_0 >= v0_3.length) {
            this.o = ((u.b[]) java.util.Arrays.copyOf(v0_3, (v0_3.length * 2)));
        }
        int v1_1 = this.p;
        this.o[v1_1] = p4;
        this.p = (v1_1 + 1);
        return;
    }

    public final void b(u.b p5)
    {
        int v0 = this.p;
        int v1 = 0;
        while (v1 < v0) {
            if (this.o[v1] != p5) {
                v1++;
            }
            while (v1 < (v0 - 1)) {
                int v5_3 = this.o;
                int v2_0 = (v1 + 1);
                v5_3[v1] = v5_3[v2_0];
                v1 = v2_0;
            }
            this.p = (this.p - 1);
            return;
        }
        return;
    }

    public final void c()
    {
        this.r = 5;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        this.e = 0;
        this.f = 0;
        int v2 = this.p;
        int v3 = 0;
        while (v3 < v2) {
            this.o[v3] = 0;
            v3++;
        }
        this.p = 0;
        this.q = 0;
        this.a = 0;
        java.util.Arrays.fill(this.n, 0);
        return;
    }

    public final int compareTo(Object p2)
    {
        return (this.b - ((u.f) p2).b);
    }

    public final void d(u.c p4, float p5)
    {
        this.e = p5;
        this.f = 1;
        int v5_2 = this.p;
        this.c = -1;
        int v1 = 0;
        while (v1 < v5_2) {
            this.o[v1].h(p4, this, 0);
            v1++;
        }
        this.p = 0;
        return;
    }

    public final void e(u.c p5, u.b p6)
    {
        int v0 = this.p;
        int v2 = 0;
        while (v2 < v0) {
            this.o[v2].i(p5, p6, 0);
            v2++;
        }
        this.p = 0;
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("");
        v0_1.append(this.b);
        return v0_1.toString();
    }
}
