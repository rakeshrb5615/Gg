package n2;
public final class p extends c4.b {
    public final float[] A;
    public final float[] B;
    public final float[] C;
    public final float[] D;
    public final float[][] E;
    public boolean F;
    public boolean G;
    public final boolean H;
    public float I;
    public final int[] J;
    public final int[] K;
    public final int[] L;
    public final float[][] M;
    public final float[][] N;
    public int O;
    public float P;
    public float Q;
    public final float R;
    public java.util.Random S;
    public final android.content.SharedPreferences T;
    public long U;
    public final n2.q V;
    public final float[] W;
    public final float[] X;
    public final float[] Y;
    public float Z;
    public boolean a0;
    public boolean b0;
    public final android.content.Context c;
    public boolean c0;
    public int d;
    public int e;
    public java.nio.FloatBuffer f;
    public java.nio.FloatBuffer g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public final float[] m;
    public final float[] n;
    public final float[] o;
    public final float[] p;
    public int q;
    public final float[] r;
    public final float[] s;
    public final boolean[] t;
    public final float[] u;
    public final float[] v;
    public final float[] w;
    public final float[] x;
    public final float[] y;
    public final float[] z;

    public p(android.content.Context p10, n2.q p11, android.content.SharedPreferences p12)
    {
        String v0_2 = new float[30000];
        this.m = v0_2;
        int v1_0 = new float[16];
        this.n = v1_0;
        float v2_23 = new float[2];
        this.r = v2_23;
        float v2_0 = new float[2];
        this.s = v2_0;
        float v2_1 = new boolean[2];
        this.t = v2_1;
        float v2_4 = new float[2];
        this.u = v2_4;
        float v2_7 = new float[2];
        this.v = v2_7;
        float v2_8 = new float[2];
        this.w = v2_8;
        float v2_9 = new float[2];
        this.x = v2_9;
        float v2_10 = new float[2];
        this.y = v2_10;
        float v2_11 = new float[2];
        this.z = v2_11;
        float v2_12 = new float[2];
        this.A = v2_12;
        float v2_13 = new float[2];
        this.B = v2_13;
        float v2_14 = new float[2];
        this.C = v2_14;
        float v2_15 = new float[2];
        this.D = v2_15;
        float v2_16 = new int[2];
        v2_16[1] = 4;
        v2_16[0] = 2;
        Class v6 = Float.TYPE;
        this.E = ((float[][]) reflect.Array.newInstance(v6, v2_16));
        this.H = 1;
        this.S = new java.util.Random();
        this.U = System.nanoTime();
        float v2_21 = new float[16];
        this.W = v2_21;
        float v2_22 = new float[16];
        this.X = v2_22;
        String v0_4 = new float[16];
        this.Y = v0_4;
        this.c = p10;
        this.V = p11;
        this.T = p12;
        java.nio.ByteOrder v11_6 = 0;
        while (v11_6 < 2) {
            this.r[v11_6] = ((this.S.nextFloat() * 1073741824) + 1056964608);
            v11_6++;
        }
        String v0_5 = new float[4];
        v0_5 = {1061158912, 1061158912, 1061158912, 1061158912};
        this.E[0] = v0_5;
        this.R = i2.m.d().e("stars");
        this.b0 = p12.getBoolean(p10.getString(2131952342), 1);
        this.c0 = p12.getBoolean(p10.getString(2131951784), 1);
        java.nio.ByteOrder v11_14 = new float[7500];
        this.o = v11_14;
        java.nio.ByteOrder v11_15 = new float[7500];
        this.p = v11_15;
        java.nio.ByteOrder v11_16 = new int[7500];
        this.L = v11_16;
        java.nio.ByteOrder v11_17 = new int[2];
        v11_17[1] = 2;
        v11_17[0] = 7500;
        this.M = ((float[][]) reflect.Array.newInstance(v6, v11_17));
        java.nio.ByteOrder v11_20 = new int[2];
        v11_20[1] = 2;
        v11_20[0] = 7500;
        this.N = ((float[][]) reflect.Array.newInstance(v6, v11_20));
        java.nio.ByteOrder v11_3 = new int[7500];
        this.J = v11_3;
        java.nio.FloatBuffer v10_1 = new int[7500];
        this.K = v10_1;
        c4.b.i(this.f);
        c4.b.i(this.g);
        this.f = java.nio.ByteBuffer.allocateDirect(120000).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.g = java.nio.ByteBuffer.allocateDirect(64).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        return;
    }

    public final void k0(long p10)
    {
        int v0_0 = this.V;
        this.P = v0_0.f0;
        this.Q = v0_0.g0;
        this.S = new java.util.Random(p10);
        float v10_4 = ((float) Math.hypot(((double) (((float) this.d) * 1077936128)), ((double) (((float) this.e) * 1077936128))));
        int v11_1 = this.M;
        if ((v11_1 != 0) && ((v11_1.length != 0) && (v11_1[0].length != 0))) {
            int v11_4 = this.J;
            if ((v11_4 != 0) && (v11_4.length != 0)) {
                int v11_6 = 0;
                while (v11_6 < this.M.length) {
                    this.o[v11_6] = ((float) (this.S.nextInt(2) + 2));
                    int[] v2_7 = (((float) Math.sqrt(((double) this.S.nextFloat()))) * v10_4);
                    double v5 = ((double) ((float) ((((double) this.S.nextFloat()) * 4611686018427387904) * 4614256656552045848)));
                    this.M[v11_6][0] = ((((float) Math.cos(v5)) * v2_7) + this.P);
                    this.M[v11_6][1] = ((v2_7 * ((float) Math.sin(v5))) + this.Q);
                    this.L[v11_6] = android.graphics.Color.rgb((230 - this.S.nextInt(80)), (230 - this.S.nextInt(80)), (230 - this.S.nextInt(80)));
                    this.J[v11_6] = (5 - this.S.nextInt(10));
                    v11_6++;
                }
            }
        }
        return;
    }
}
