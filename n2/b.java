package n2;
public final class b extends c4.b {
    public static final float[] w;
    public java.nio.FloatBuffer c;
    public final android.content.Context d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public float l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    static b()
    {
        float[] v0_1 = new float[16];
        v0_1 = {-1082130432, -1082130432, 0, 0, 1065353216, -1082130432, 1065353216, 0, -1082130432, 1065353216, 0, 1065353216, 1065353216, 1065353216, 1065353216, 1065353216};
        n2.b.w = v0_1;
        return;
    }

    public b(android.content.Context p2)
    {
        this.l = 0;
        this.d = p2;
        return;
    }

    public final void k0()
    {
        if (!m2.a.e(this.d)) {
            android.opengl.GLES20.glClearColor(0, 0, 0, 0);
        } else {
            android.opengl.GLES20.glClearColor(1065353216, 1065353216, 1065353216, 0);
        }
        android.opengl.GLES20.glClear(16640);
        return;
    }

    public final void l0(float p6)
    {
        int v0_0 = this.p;
        if (v0_0 == 0) {
            v0_0 = this.o;
        }
        if (v0_0 != 0) {
            if (p6 > 0) {
                if (p6 == 0) {
                    android.opengl.GLES20.glBindFramebuffer(36160, 0);
                    android.opengl.GLES20.glViewport(0, 0, this.j, this.k);
                    this.k0();
                    this.l = 0;
                    int v6_2 = this.p;
                    if (v6_2 != 0) {
                        this.m0(v6_2, 0);
                        return;
                    }
                } else {
                    android.opengl.GLES20.glBindFramebuffer(36160, this.q);
                    android.opengl.GLES20.glViewport(0, 0, this.u, this.v);
                    this.k0();
                    this.l = 0;
                    this.m0(this.p, 0);
                    android.opengl.GLES20.glBindFramebuffer(36160, this.s);
                    android.opengl.GLES20.glViewport(0, 0, this.u, this.v);
                    this.k0();
                    this.l = p6;
                    this.m0(this.r, 1);
                    android.opengl.GLES20.glBindFramebuffer(36160, 0);
                    android.opengl.GLES20.glViewport(0, 0, this.j, this.k);
                    this.k0();
                    this.l = p6;
                    this.m0(this.t, 0);
                    return;
                }
            } else {
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                android.opengl.GLES20.glViewport(0, 0, this.j, this.k);
                this.k0();
                android.opengl.GLES20.glDisable(2929);
                this.l = 0;
                this.m0(v0_0, 0);
                return;
            }
        }
        return;
    }

    public final void m0(int p10, boolean p11)
    {
        int v0_5;
        android.opengl.GLES20.glUseProgram(this.e);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f);
        android.opengl.GLES20.glEnableVertexAttribArray(this.g);
        this.c.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f, 2, 5126, 0, 16, this.c);
        this.c.position(2);
        android.opengl.GLES20.glVertexAttribPointer(this.g, 2, 5126, 0, 16, this.c);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, p10);
        android.opengl.GLES20.glUniform1i(this.h, 0);
        int v10_2 = 0;
        if (p11 == 0) {
            v0_5 = 0;
        } else {
            v0_5 = (this.l / ((float) this.j));
        }
        if (p11 == 0) {
            v10_2 = (this.l / ((float) this.k));
        }
        android.opengl.GLES20.glUniform2f(this.i, v0_5, v10_2);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f);
        android.opengl.GLES20.glDisableVertexAttribArray(this.g);
        return;
    }
}
