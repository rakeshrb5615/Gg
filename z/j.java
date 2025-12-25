package z;
public final class j {
    public static final android.util.SparseIntArray p0;
    public int A;
    public float B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public float T;
    public float U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public boolean a;
    public int a0;
    public int b;
    public int b0;
    public int c;
    public int c0;
    public int d;
    public float d0;
    public int e;
    public float e0;
    public float f;
    public int f0;
    public boolean g;
    public int g0;
    public int h;
    public int h0;
    public int i;
    public int[] i0;
    public int j;
    public String j0;
    public int k;
    public String k0;
    public int l;
    public boolean l0;
    public int m;
    public boolean m0;
    public int n;
    public boolean n0;
    public int o;
    public int o0;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public float x;
    public String y;
    public int z;

    static j()
    {
        android.util.SparseIntArray v0_1 = new android.util.SparseIntArray();
        z.j.p0 = v0_1;
        v0_1.append(43, 24);
        v0_1.append(44, 25);
        v0_1.append(46, 28);
        v0_1.append(47, 29);
        v0_1.append(52, 35);
        v0_1.append(51, 34);
        v0_1.append(24, 4);
        v0_1.append(23, 3);
        v0_1.append(19, 1);
        v0_1.append(61, 6);
        v0_1.append(62, 7);
        v0_1.append(31, 17);
        v0_1.append(32, 18);
        v0_1.append(33, 19);
        v0_1.append(15, 90);
        v0_1.append(0, 26);
        v0_1.append(48, 31);
        v0_1.append(49, 32);
        v0_1.append(30, 10);
        v0_1.append(29, 9);
        v0_1.append(66, 13);
        v0_1.append(69, 16);
        v0_1.append(67, 14);
        v0_1.append(64, 11);
        v0_1.append(68, 15);
        v0_1.append(65, 12);
        v0_1.append(55, 38);
        v0_1.append(41, 37);
        v0_1.append(40, 39);
        v0_1.append(54, 40);
        v0_1.append(39, 20);
        v0_1.append(53, 36);
        v0_1.append(28, 5);
        v0_1.append(42, 91);
        v0_1.append(50, 91);
        v0_1.append(45, 91);
        v0_1.append(22, 91);
        v0_1.append(18, 91);
        v0_1.append(3, 23);
        v0_1.append(5, 27);
        v0_1.append(7, 30);
        v0_1.append(8, 8);
        v0_1.append(4, 33);
        v0_1.append(6, 2);
        v0_1.append(1, 22);
        v0_1.append(2, 21);
        v0_1.append(56, 41);
        v0_1.append(34, 42);
        v0_1.append(17, 87);
        v0_1.append(16, 88);
        v0_1.append(71, 76);
        v0_1.append(25, 61);
        v0_1.append(27, 62);
        v0_1.append(26, 63);
        v0_1.append(60, 69);
        v0_1.append(38, 70);
        v0_1.append(12, 71);
        v0_1.append(10, 72);
        v0_1.append(11, 73);
        v0_1.append(13, 74);
        v0_1.append(9, 75);
        v0_1.append(58, 84);
        v0_1.append(59, 86);
        v0_1.append(58, 83);
        v0_1.append(37, 85);
        v0_1.append(56, 87);
        v0_1.append(34, 88);
        v0_1.append(91, 89);
        v0_1.append(15, 90);
        return;
    }

    public final void a(android.content.Context p9, android.util.AttributeSet p10)
    {
        android.content.res.TypedArray v9_1 = p9.obtainStyledAttributes(p10, z.r.e);
        int v10_1 = v9_1.getIndexCount();
        int v1 = 0;
        while (v1 < v10_1) {
            String v2_3 = v9_1.getIndex(v1);
            boolean v3_5 = z.j.p0;
            StringBuilder v4_0 = v3_5.get(v2_3);
            switch (v4_0) {
                case 1:
                    this.p = z.n.f(v9_1, v2_3, this.p);
                    break;
                case 2:
                    this.I = v9_1.getDimensionPixelSize(v2_3, this.I);
                    break;
                case 3:
                    this.o = z.n.f(v9_1, v2_3, this.o);
                    break;
                case 4:
                    this.n = z.n.f(v9_1, v2_3, this.n);
                    break;
                case 5:
                    this.y = v9_1.getString(v2_3);
                    break;
                case 6:
                    this.C = v9_1.getDimensionPixelOffset(v2_3, this.C);
                    break;
                case 7:
                    this.D = v9_1.getDimensionPixelOffset(v2_3, this.D);
                    break;
                case 8:
                    this.J = v9_1.getDimensionPixelSize(v2_3, this.J);
                    break;
                case 9:
                    this.v = z.n.f(v9_1, v2_3, this.v);
                    break;
                case 10:
                    this.u = z.n.f(v9_1, v2_3, this.u);
                    break;
                case 11:
                    this.P = v9_1.getDimensionPixelSize(v2_3, this.P);
                    break;
                case 12:
                    this.Q = v9_1.getDimensionPixelSize(v2_3, this.Q);
                    break;
                case 13:
                    this.M = v9_1.getDimensionPixelSize(v2_3, this.M);
                    break;
                case 14:
                    this.O = v9_1.getDimensionPixelSize(v2_3, this.O);
                    break;
                case 15:
                    this.R = v9_1.getDimensionPixelSize(v2_3, this.R);
                    break;
                case 16:
                    this.N = v9_1.getDimensionPixelSize(v2_3, this.N);
                    break;
                case 17:
                    this.d = v9_1.getDimensionPixelOffset(v2_3, this.d);
                    break;
                case 18:
                    this.e = v9_1.getDimensionPixelOffset(v2_3, this.e);
                    break;
                case 19:
                    this.f = v9_1.getFloat(v2_3, this.f);
                    break;
                case 20:
                    this.w = v9_1.getFloat(v2_3, this.w);
                    break;
                case 21:
                    this.c = v9_1.getLayoutDimension(v2_3, this.c);
                    break;
                case 22:
                    this.b = v9_1.getLayoutDimension(v2_3, this.b);
                    break;
                case 23:
                    this.F = v9_1.getDimensionPixelSize(v2_3, this.F);
                    break;
                case 24:
                    this.h = z.n.f(v9_1, v2_3, this.h);
                    break;
                case 25:
                    this.i = z.n.f(v9_1, v2_3, this.i);
                    break;
                case 26:
                    this.E = v9_1.getInt(v2_3, this.E);
                    break;
                case 27:
                    this.G = v9_1.getDimensionPixelSize(v2_3, this.G);
                    break;
                case 28:
                    this.j = z.n.f(v9_1, v2_3, this.j);
                    break;
                case 29:
                    this.k = z.n.f(v9_1, v2_3, this.k);
                    break;
                case 30:
                    this.K = v9_1.getDimensionPixelSize(v2_3, this.K);
                    break;
                case 31:
                    this.s = z.n.f(v9_1, v2_3, this.s);
                    break;
                case 32:
                    this.t = z.n.f(v9_1, v2_3, this.t);
                    break;
                case 33:
                    this.H = v9_1.getDimensionPixelSize(v2_3, this.H);
                    break;
                case 34:
                    this.m = z.n.f(v9_1, v2_3, this.m);
                    break;
                case 35:
                    this.l = z.n.f(v9_1, v2_3, this.l);
                    break;
                case 36:
                    this.x = v9_1.getFloat(v2_3, this.x);
                    break;
                case 37:
                    this.U = v9_1.getFloat(v2_3, this.U);
                    break;
                case 38:
                    this.T = v9_1.getFloat(v2_3, this.T);
                    break;
                case 39:
                    this.V = v9_1.getInt(v2_3, this.V);
                    break;
                case 40:
                    this.W = v9_1.getInt(v2_3, this.W);
                    break;
                case 41:
                    z.n.g(this, v9_1, v2_3, 0);
                    break;
                case 42:
                    z.n.g(this, v9_1, v2_3, 1);
                    break;
                default:
                    switch (v4_0) {
                        case 61:
                            this.z = z.n.f(v9_1, v2_3, this.z);
                            break;
                        case 62:
                            this.A = v9_1.getDimensionPixelSize(v2_3, this.A);
                            break;
                        case 63:
                            this.B = v9_1.getFloat(v2_3, this.B);
                            break;
                        default:
                            switch (v4_0) {
                                case 69:
                                    this.d0 = v9_1.getFloat(v2_3, 1065353216);
                                    break;
                                case 70:
                                    this.e0 = v9_1.getFloat(v2_3, 1065353216);
                                    break;
                                case 71:
                                    android.util.Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    this.f0 = v9_1.getInt(v2_3, this.f0);
                                    break;
                                case 73:
                                    this.g0 = v9_1.getDimensionPixelSize(v2_3, this.g0);
                                    break;
                                case 74:
                                    this.j0 = v9_1.getString(v2_3);
                                    break;
                                case 75:
                                    this.n0 = v9_1.getBoolean(v2_3, this.n0);
                                    break;
                                case 76:
                                    this.o0 = v9_1.getInt(v2_3, this.o0);
                                    break;
                                case 77:
                                    this.q = z.n.f(v9_1, v2_3, this.q);
                                    break;
                                case 78:
                                    this.r = z.n.f(v9_1, v2_3, this.r);
                                    break;
                                case 79:
                                    this.S = v9_1.getDimensionPixelSize(v2_3, this.S);
                                    break;
                                case 80:
                                    this.L = v9_1.getDimensionPixelSize(v2_3, this.L);
                                    break;
                                case 81:
                                    this.X = v9_1.getInt(v2_3, this.X);
                                    break;
                                case 82:
                                    this.Y = v9_1.getInt(v2_3, this.Y);
                                    break;
                                case 83:
                                    this.a0 = v9_1.getDimensionPixelSize(v2_3, this.a0);
                                    break;
                                case 84:
                                    this.Z = v9_1.getDimensionPixelSize(v2_3, this.Z);
                                    break;
                                case 85:
                                    this.c0 = v9_1.getDimensionPixelSize(v2_3, this.c0);
                                    break;
                                case 86:
                                    this.b0 = v9_1.getDimensionPixelSize(v2_3, this.b0);
                                    break;
                                case 87:
                                    this.l0 = v9_1.getBoolean(v2_3, this.l0);
                                    break;
                                case 88:
                                    this.m0 = v9_1.getBoolean(v2_3, this.m0);
                                    break;
                                case 89:
                                    this.k0 = v9_1.getString(v2_3);
                                    break;
                                case 90:
                                    this.g = v9_1.getBoolean(v2_3, this.g);
                                    break;
                                case 91:
                                    StringBuilder v4_2 = new StringBuilder("unused attribute 0x");
                                    v4_2.append(Integer.toHexString(v2_3));
                                    v4_2.append("   ");
                                    v4_2.append(v3_5.get(v2_3));
                                    android.util.Log.w("ConstraintSet", v4_2.toString());
                                    break;
                                default:
                                    StringBuilder v4_4 = new StringBuilder("Unknown attribute 0x");
                                    v4_4.append(Integer.toHexString(v2_3));
                                    v4_4.append("   ");
                                    v4_4.append(v3_5.get(v2_3));
                                    android.util.Log.w("ConstraintSet", v4_4.toString());
                            }
                    }
            }
            v1++;
        }
        v9_1.recycle();
        return;
    }
}
