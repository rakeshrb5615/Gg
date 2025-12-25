package z;
public final class e extends android.view.ViewGroup$MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;
    public int a;
    public boolean a0;
    public int b;
    public boolean b0;
    public float c;
    public boolean c0;
    public boolean d;
    public boolean d0;
    public int e;
    public boolean e0;
    public int f;
    public int f0;
    public int g;
    public int g0;
    public int h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public int j0;
    public int k;
    public int k0;
    public int l;
    public float l0;
    public int m;
    public int m0;
    public int n;
    public int n0;
    public int o;
    public float o0;
    public int p;
    public w.d p0;
    public int q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public final void a()
    {
        this.d0 = 0;
        this.a0 = 1;
        this.b0 = 1;
        int v2_2 = this.width;
        if ((v2_2 == -2) && (this.W)) {
            this.a0 = 0;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int v4_1 = this.height;
        if ((v4_1 == -2) && (this.X)) {
            this.b0 = 0;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if ((v2_2 == 0) || (v2_2 == -1)) {
            this.a0 = 0;
            if ((v2_2 == 0) && (this.L == 1)) {
                this.width = -2;
                this.W = 1;
            }
        }
        if ((v4_1 == 0) || (v4_1 == -1)) {
            this.b0 = 0;
            if ((v4_1 == 0) && (this.M == 1)) {
                this.height = -2;
                this.X = 1;
            }
        }
        if ((this.c == -1082130432) && ((this.a == -1) && (this.b == -1))) {
            return;
        } else {
            this.d0 = 1;
            this.a0 = 1;
            this.b0 = 1;
            if (!(this.p0 instanceof w.h)) {
                this.p0 = new w.h();
            }
            ((w.h) this.p0).S(this.V);
            return;
        }
    }

    public final void resolveLayoutDirection(int p11)
    {
        int v11_23;
        int v0 = this.leftMargin;
        int v1 = this.rightMargin;
        super.resolveLayoutDirection(p11);
        int v2_0 = 0;
        if (1 != this.getLayoutDirection()) {
            v11_23 = 0;
        } else {
            v11_23 = 1;
        }
        this.h0 = -1;
        this.i0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.j0 = this.w;
        this.k0 = this.y;
        float v5_2 = this.E;
        this.l0 = v5_2;
        int v6 = this.a;
        this.m0 = v6;
        int v7 = this.b;
        this.n0 = v7;
        float v8 = this.c;
        this.o0 = v8;
        if (v11_23 == 0) {
            int v11_9 = this.s;
            if (v11_9 != -1) {
                this.g0 = v11_9;
            }
            int v11_10 = this.t;
            if (v11_10 != -1) {
                this.f0 = v11_10;
            }
            int v11_11 = this.u;
            if (v11_11 != -1) {
                this.h0 = v11_11;
            }
            int v11_12 = this.v;
            if (v11_12 != -1) {
                this.i0 = v11_12;
            }
            int v11_14 = this.A;
            if (v11_14 != -2147483648) {
                this.j0 = v11_14;
            }
            int v11_15 = this.B;
            if (v11_15 != -2147483648) {
                this.k0 = v11_15;
            }
        } else {
            int v11_16 = this.s;
            if (v11_16 == -1) {
                int v11_17 = this.t;
                if (v11_17 != -1) {
                    this.i0 = v11_17;
                    v2_0 = 1;
                }
            } else {
                this.h0 = v11_16;
            }
            int v11_18 = this.u;
            if (v11_18 != -1) {
                this.g0 = v11_18;
                v2_0 = 1;
            }
            int v11_19 = this.v;
            if (v11_19 != -1) {
                this.f0 = v11_19;
                v2_0 = 1;
            }
            int v11_20 = this.A;
            if (v11_20 != -2147483648) {
                this.k0 = v11_20;
            }
            int v11_21 = this.B;
            if (v11_21 != -2147483648) {
                this.j0 = v11_21;
            }
            if (v2_0 != 0) {
                this.l0 = (1065353216 - v5_2);
            }
            if ((this.d0) && ((this.V == 1) && (this.d))) {
                if (v8 == -1082130432) {
                    if (v6 == -1) {
                        if (v7 != -1) {
                            this.m0 = v7;
                            this.n0 = -1;
                            this.o0 = -1082130432;
                        }
                    } else {
                        this.n0 = v6;
                        this.m0 = -1;
                        this.o0 = -1082130432;
                    }
                } else {
                    this.o0 = (1065353216 - v8);
                    this.m0 = -1;
                    this.n0 = -1;
                }
            }
        }
        if ((this.u == -1) && ((this.v == -1) && ((this.t == -1) && (this.s == -1)))) {
            int v11_1 = this.g;
            if (v11_1 == -1) {
                int v11_2 = this.h;
                if (v11_2 != -1) {
                    this.i0 = v11_2;
                    if ((this.rightMargin <= 0) && (v1 > 0)) {
                        this.rightMargin = v1;
                    }
                }
            } else {
                this.h0 = v11_1;
                if ((this.rightMargin <= 0) && (v1 > 0)) {
                    this.rightMargin = v1;
                }
            }
            int v11_5 = this.e;
            if (v11_5 == -1) {
                int v11_6 = this.f;
                if (v11_6 != -1) {
                    this.g0 = v11_6;
                    if ((this.leftMargin <= 0) && (v0 > 0)) {
                        this.leftMargin = v0;
                    }
                }
            } else {
                this.f0 = v11_5;
                if ((this.leftMargin <= 0) && (v0 > 0)) {
                    this.leftMargin = v0;
                    return;
                }
            }
        }
        return;
    }
}
