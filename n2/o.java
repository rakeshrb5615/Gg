package n2;
public final class o extends c4.b {
    public int c;
    public final int d;
    public final int e;
    public java.nio.FloatBuffer f;
    public float g;
    public float[] h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public boolean l;

    public o(android.content.Context p10)
    {
        int v0_1 = new float[8];
        v0_1 = {-1082130432, 1065353216, -1082130432, -1082130432, 1065353216, 1065353216, 1065353216, -1082130432};
        int v2_0 = new float[16];
        this.i = v2_0;
        int v3_0 = new float[16];
        this.j = v3_0;
        int v4_2 = new float[16];
        this.k = v4_2;
        int v1_0 = 0;
        this.l = 0;
        int v5_1 = java.nio.ByteBuffer.allocateDirect(32);
        v5_1.order(java.nio.ByteOrder.nativeOrder());
        int v5_2 = v5_1.asFloatBuffer();
        this.f = v5_2;
        v5_2.put(v0_1);
        this.f.position(0);
        int v0_4 = c4.b.M(35633, q4.b.l("MfzI+f+y1B50XqZJ8b0DaNjidKlxynZC+adhP0iBm5Y+p7R63ZmdNrK31Ej4ADtCtAx0ZYCo7SQK3nk2o8HvYbkO391Bp3P9Ge8fLpmLAKfLgMrsts1BFRkZLDPeTEX95mwqGaqdOzC1DQeAFJgK59ZG0wbvrMWW0rnIONbpPGf0lBxgrX5X9peG14aBR8FnAXjAhDn81xrFUgBHTT90jqYJaMnMqeeOsWzWqLxxTzk="));
        int v5_6 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItKQP4Bwte+UpsY8uxv7BkzZ8tZBWdwoFclTnGUQUT3O/Zxps3GsUzmQiFBJNzuMJyFzv79LwEaTvEJi1jCdBlCng8ZGCd/tbGhvNH1CQrdlX"));
        int v6_3 = android.opengl.GLES20.glCreateProgram();
        android.opengl.GLES20.glAttachShader(v6_3, v0_4);
        android.opengl.GLES20.glAttachShader(v6_3, v5_6);
        android.opengl.GLES20.glLinkProgram(v6_3);
        this.c = v6_3;
        this.d = android.opengl.GLES20.glGetAttribLocation(v6_3, "a_Position");
        this.e = android.opengl.GLES20.glGetUniformLocation(this.c, "u_Color");
        c4.b.a0(v2_0, v3_0, v4_2, -1082130432, 1065353216, -1082130432, 1065353216);
        i2.m.d().e("dimmer");
        float v10_4 = (((float) j5.t1.z(p10).getInt(p10.getString(2131951815), 0)) * 1008981770);
        this.g = v10_4;
        int v0_13 = new float[4];
        v0_13[0] = 0;
        v0_13[1] = 0;
        v0_13[2] = 0;
        v0_13[3] = v10_4;
        this.h = v0_13;
        if (v10_4 != 0) {
            v1_0 = 1;
        }
        this.l = v1_0;
        if (v10_4 != v10_4) {
            this.g = Math.max(0, Math.min(1065353216, v10_4));
        }
        return;
    }

    public final void k0()
    {
        if (this.l) {
            android.opengl.GLES20.glUseProgram(this.c);
            android.opengl.GLES20.glEnable(3042);
            android.opengl.GLES20.glBlendFunc(770, 771);
            int v1_2 = this.d;
            android.opengl.GLES20.glEnableVertexAttribArray(v1_2);
            android.opengl.GLES20.glVertexAttribPointer(this.d, 2, 5126, 0, 0, this.f);
            int v2_1 = this.h;
            v2_1[3] = this.g;
            android.opengl.GLES20.glUniform4fv(this.e, 1, v2_1, 0);
            c4.b.g0(this.c, this.i, this.j, this.k, 0);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            android.opengl.GLES20.glDisableVertexAttribArray(v1_2);
            android.opengl.GLES20.glBindTexture(3553, 0);
            android.opengl.GLES20.glUseProgram(0);
            android.opengl.GLES20.glDisable(3042);
            return;
        } else {
            return;
        }
    }
}
