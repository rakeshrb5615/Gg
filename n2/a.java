package n2;
public final class a extends c4.b {
    public int A;
    public float[] B;
    public float[] C;
    public n2.w D;
    public final int[] E;
    public int c;
    public int[] d;
    public boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public java.nio.FloatBuffer k;
    public java.nio.FloatBuffer l;
    public final float[] m;
    public final float[] n;
    public final float[] o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float[] t;
    public float[] u;
    public float[] v;
    public float[] w;
    public float[] x;
    public n2.h y;
    public int z;

    public a()
    {
        this.e = 0;
        float[] v2 = new float[16];
        this.m = v2;
        float[] v3 = new float[16];
        this.n = v3;
        float[] v4 = new float[16];
        this.o = v4;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        String v5_1 = new float[16];
        this.B = v5_1;
        int v1_0 = new float[16];
        this.C = v1_0;
        int v1_2 = new int[4];
        this.E = v1_2;
        int v1_5 = c4.b.M(35633, q4.b.l("JLiQtee+D2pQw9xnrv4TzlSsPoDmeLlpCixMGkO34mHfRXV7I1kGANMRZV6uN/WVcnAb+mNFWbMytdgco+Gby8VrynjnDoVBYf7SeXb2DPFfYa7BE9997OAk+Z+UQs1mOR0BNxhPTU5rObCtruKHAXHHOQwD/BdSAnMeLx2rmOJRZ+wrDYGZmk9xXvNIGbhB"));
        String v5_5 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItLlE5c2kAoa/Qje3c+IQAfAxZAl9cD+rooMA9nz2ihxgTJe7YtxNH+D4BBXiyYiQCGVlx5nPtYs0CtnuijxqFY4uV4EShcreZ4c+xanjqvn+kDL3y9LqDJBTUXoYkJQ0+V0cci3GlliYxSry6hwpoSpJcKpW1rdVKs4zjv2ZRwStyoDlLZR05yWzQK+8fbSllhwoVzkgu494r0hXycquFT/wvAKyyzzPTB/1Nurt6XFyfWGjVC/CLS5l175lC1FcMkNM3FK0O22Lj2eSjmYEmtVggnQwZkkijXOou6xLsFRIl1r2x1swAZI6+pTyBTd+k+KA9JV0/oNHafCXyjO9Ui4="));
        int v6_1 = android.opengl.GLES20.glCreateProgram();
        this.c = v6_1;
        android.opengl.GLES20.glAttachShader(v6_1, v1_5);
        android.opengl.GLES20.glAttachShader(this.c, v5_5);
        android.opengl.GLES20.glLinkProgram(this.c);
        this.f = android.opengl.GLES20.glGetUniformLocation(this.c, "uMVP");
        this.g = android.opengl.GLES20.glGetAttribLocation(this.c, "aPos");
        this.h = android.opengl.GLES20.glGetAttribLocation(this.c, "aTex");
        this.i = android.opengl.GLES20.glGetUniformLocation(this.c, "uTexture");
        this.j = android.opengl.GLES20.glGetUniformLocation(this.c, "uAlpha");
        android.opengl.Matrix.setIdentityM(v2, 0);
        android.opengl.Matrix.setIdentityM(v3, 0);
        android.opengl.Matrix.setIdentityM(v4, 0);
        this.D = new n2.w();
        return;
    }

    public final void k0()
    {
        float[] v0_0 = this.n;
        android.opengl.Matrix.setIdentityM(v0_0, 0);
        android.opengl.Matrix.translateM(v0_0, 0, ((this.p / 1073741824) + this.r), ((this.q / 1073741824) + this.s), 0);
        android.opengl.Matrix.rotateM(v0_0, 0, 0, 0, 0, 1065353216);
        android.opengl.Matrix.translateM(v0_0, 0, ((- this.p) / 1073741824), ((- this.q) / 1073741824), 0);
        android.opengl.Matrix.scaleM(v0_0, 0, 1065353216, 1065353216, 1065353216);
        android.opengl.Matrix.multiplyMM(this.o, 0, this.m, 0, v0_0, 0);
        return;
    }

    public final void l0(android.graphics.Bitmap[] p8)
    {
        if (p8.length != 0) {
            this.e = 1;
            java.nio.FloatBuffer v1_7 = this.d;
            if (v1_7 != null) {
                android.opengl.GLES20.glDeleteTextures(v1_7.length, v1_7, 0);
            }
            java.nio.FloatBuffer v1_0 = new int[p8.length];
            this.d = v1_0;
            android.opengl.GLES20.glGenTextures(p8.length, v1_0, 0);
            this.p = ((float) p8[0].getWidth());
            java.nio.FloatBuffer v1_6 = ((float) p8[0].getHeight());
            this.q = v1_6;
            if (p8.length == 1) {
                int v3_2 = new float[1];
                this.t = v3_2;
                int v4_0 = new float[1];
                this.u = v4_0;
                float[] v5_0 = new float[1];
                this.v = v5_0;
                float[] v5_1 = new float[1];
                this.w = v5_1;
                int v0_2 = new float[1];
                this.x = v0_2;
                v3_2[0] = 0;
                v4_0[0] = 0;
                v5_1[0] = this.p;
                v0_2[0] = v1_6;
            }
            int v0_3 = 0;
            while (v0_3 < p8.length) {
                java.nio.FloatBuffer v1_10 = p8[v0_3];
                if ((v1_10 != null) && (!v1_10.isRecycled())) {
                    android.opengl.GLES20.glBindTexture(3553, this.d[v0_3]);
                    android.opengl.GLES20.glTexParameteri(3553, 10241, 9728);
                    android.opengl.GLES20.glTexParameteri(3553, 10240, 9728);
                    android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
                    android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
                    android.opengl.GLUtils.texImage2D(3553, 0, p8[v0_3], 0);
                }
                v0_3++;
            }
            java.nio.FloatBuffer v8_2 = new float[8];
            v8_2 = {0, 0, 0, 1065353216, 1065353216, 0, 1065353216, 1065353216};
            int v0_7 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
            this.l = v0_7;
            v0_7.put(v8_2).position(0);
            this.k0();
            return;
        } else {
            return;
        }
    }

    public final void m0(int p18, int p19, int[][] p20, int[][][] p21, int[][][][] p22, int[][][] p23, int[][][][] p24, int[][][] p25, int[] p26, int[][] p27, float[][] p28)
    {
        if (p18 == 0) {
            java.util.ArrayList v1_0 = this.D;
            if (v1_0 != null) {
                v1_0.h.clear();
                v1_0.i.clear();
            }
        }
        int v3 = 0;
        while (v3 < p19) {
            float v5_1 = p28[p18][v3];
            float v4_3 = ((float) (this.A - p26[p27[p18][v3]]));
            int v7 = 2;
            while (v7 < p20[p18][v3]) {
                float v11 = (v4_3 + ((float) p23[p18][v3][v7]));
                n2.w v9_0 = this.E;
                i2.l.g(v9_0, p25[p18][v3][v7]);
                int v8_17 = 0;
                while (v8_17 < p21[p18][v3][v7]) {
                    n2.w v9_7 = p22[p18][v3][v7][v8_17];
                    if (v9_7 != -1) {
                        n2.w v9_13 = this.D;
                        if (v9_13 != null) {
                            v9_13.k0((v5_1 + ((float) v9_7)), v11, ((float) p24[p18][v3][v7][v8_17]), 1065353216, (((float) v9_0[1]) / 1132396544), (((float) v9_0[2]) / 1132396544), (((float) v9_0[3]) / 1132396544));
                        }
                    }
                    v8_17++;
                }
                v7++;
            }
            v3++;
        }
        return;
    }

    public final void n0(int p17, int p18, int[][] p19, int[][][] p20, int[][][] p21, int[][][][] p22)
    {
        if ((this.D != null) && ((p19 != null) && ((p20 != null) && (p21 != null)))) {
            int v3 = 0;
            int v4_1 = 0;
            while (v3 < p18) {
                int v6 = 2;
                while (v6 < p19[p17][v3]) {
                    int v8_0 = this.E;
                    i2.l.g(v8_0, p21[p17][v3][v6]);
                    int v11 = v4_1;
                    int v4_0 = 0;
                    while (v4_0 < p20[p17][v3][v6]) {
                        if (p22[p17][v3][v6][v4_0] != -1) {
                            this.D.l0(v11, (((float) v8_0[1]) / 1132396544), (((float) v8_0[2]) / 1132396544), (((float) v8_0[3]) / 1132396544), 1065353216);
                            v11++;
                        }
                        v4_0++;
                    }
                    v6++;
                    v4_1 = v11;
                }
                v3++;
            }
        }
        return;
    }
}
