package n2;
public final class w extends c4.b {
    public static final float[] s;
    public int c;
    public final int d;
    public final int e;
    public final int f;
    public java.nio.FloatBuffer g;
    public java.util.ArrayList h;
    public java.util.ArrayList i;
    public final float[] j;
    public final float[] k;
    public final float[] l;
    public float m;
    public float n;
    public float o;
    public float p;
    public final java.util.ArrayDeque q;
    public final java.util.ArrayDeque r;

    static w()
    {
        float[] v0_1 = new float[12];
        v0_1 = {0, 1065353216, 0, 0, 0, 0, 1065353216, 1065353216, 0, 1065353216, 0, 0};
        n2.w.s = v0_1;
        return;
    }

    public w()
    {
        String v1_0 = new float[16];
        this.j = v1_0;
        String v1_6 = new float[16];
        this.k = v1_6;
        int v0_17 = new float[16];
        this.l = v0_17;
        this.q = new java.util.ArrayDeque();
        this.r = new java.util.ArrayDeque();
        this.h = new java.util.ArrayList();
        this.i = new java.util.ArrayList();
        int v0_8 = java.nio.ByteBuffer.allocateDirect(48);
        v0_8.order(java.nio.ByteOrder.nativeOrder());
        int v0_9 = v0_8.asFloatBuffer();
        this.g = v0_9;
        v0_9.put(n2.w.s);
        this.g.position(0);
        int v0_12 = c4.b.M(35633, q4.b.l("MfzI+f+y1B50XqZJ8b0DaNjidKlxynZC+adhP0iBm5Yu9O8IWDMFv+dYecxLccWlpOAN5ms7o3Tqm9a+svyMBVVK6ORGSnA/rvEL6Nfpo7Ayw8wwpbVuGTgbKipo6pr05sxhLaiTzlIP0WDjqbYmbKxxn7EiJCYf/QYjvgT/xB9o52dbkEZKT2h4FJiSX/s2i+yloWbat2kZ9yFDOWxQAg=="));
        String v1_8 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItKQP4Bwte+UpsY8uxv7BkzZ8tZBWdwoFclTnGUQUT3O/y0kFNRpZCYrnvUHRvPntPsIA36Kx6iwAGjNDXpJsktc8Lpy+TDcFIkvY/sHgm0SU"));
        int v2_2 = android.opengl.GLES20.glCreateProgram();
        android.opengl.GLES20.glAttachShader(v2_2, v0_12);
        android.opengl.GLES20.glAttachShader(v2_2, v1_8);
        android.opengl.GLES20.glLinkProgram(v2_2);
        this.c = v2_2;
        this.d = android.opengl.GLES20.glGetAttribLocation(v2_2, "a_Position");
        this.e = android.opengl.GLES20.glGetUniformLocation(this.c, "u_Color");
        this.f = android.opengl.GLES20.glGetUniformLocation(this.c, "u_MVPMatrix");
        return;
    }

    public final void k0(float p4, float p5, float p6, float p7, float p8, float p9, float p10)
    {
        float[] v0_2 = ((float[]) this.q.pollFirst());
        if (v0_2 == null) {
            v0_2 = new float[4];
        }
        v0_2[0] = p4;
        v0_2[1] = p5;
        v0_2[2] = p6;
        v0_2[3] = p7;
        this.h.add(v0_2);
        float[] v7_4 = ((float[]) this.r.pollFirst());
        if (v7_4 == null) {
            v7_4 = new float[4];
        }
        v7_4[0] = p8;
        v7_4[1] = p9;
        v7_4[2] = p10;
        v7_4[3] = 1065353216;
        this.i.add(v7_4);
        return;
    }

    public final void l0(int p2, float p3, float p4, float p5, float p6)
    {
        if ((p2 >= null) && (p2 < this.i.size())) {
            float[] v2_2 = ((float[]) this.i.get(p2));
            v2_2[0] = p3;
            v2_2[1] = p4;
            v2_2[2] = p5;
            v2_2[3] = p6;
        }
        return;
    }
}
