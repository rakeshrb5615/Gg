package n2;
public final class v extends c4.b {
    public float A;
    public float B;
    public float C;
    public final float[] D;
    public boolean E;
    public final boolean F;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final java.nio.FloatBuffer o;
    public final java.nio.ShortBuffer p;
    public final float[] q;
    public final float[] r;
    public final float[] s;
    public final n2.u[] t;
    public final float[] u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public v(android.content.Context p4, android.content.SharedPreferences p5)
    {
        int v1_1 = new float[16];
        this.q = v1_1;
        int v1_4 = new float[16];
        this.r = v1_4;
        int v0_7 = new float[16];
        this.s = v0_7;
        int v0_9 = new n2.u[7];
        this.t = v0_9;
        int v0_2 = new float[3234];
        this.u = v0_2;
        this.w = 1065353216;
        this.x = 1065353216;
        this.y = 1065353216;
        this.z = 1045220557;
        this.A = 1065353216;
        this.B = 1065353216;
        int v0_5 = new float[4];
        v0_5 = {1065353216, 1065353216, 1065353216, 1065353216};
        this.D = v0_5;
        this.F = 0;
        this.E = p5.getBoolean(p4.getString(2131952499), 1);
        java.nio.ShortBuffer v4_17 = c4.b.M(35633, q4.b.l("31CvLSW49ZsWqEJmlVijDM42A9RdPcuWKDIEoaK7tZz0jLm4jZFZjlcJV+H4Sdteb/vbx6SL61fD2BPiAFlHq67D+UldJ3znPl45hpHV3pzpuyp0ZOncV/ZEPTfkUcXX6cMDBrM0fbQJzF4oqdDwDCD+Z2jZ0mYgHjFtc3mVGwJDqa9ScaODZmyYN0IPyKYMC2sYsIzKOi402WdOu1jozTXkDF/nECfftnZwQgmTZlfkApogORPlp9joNOh5XVk4KerHC6JPSgIY87rNpAuLNDoU/zDd2UoDsfMRjAAaAY0oIbFNsCWETf5wfmDbeQ1RCQFfcpVG2mY3PIsbXm9fEdo3RZxH3OMx5I4MJ11gqu05VH3Los7i6CtVEtSrN1aN3BBYa9gcT5QeuK1qrZndhXOk4oG+SwcezXrJWYWmJAu+RXh3HA9L2UBxsnVbq8673jjONmZsFn152UtjOGtVYvs7JGX7mBZDt9OW2P8Vpx7jYivaiHJKx2dG6EXGjGt9iSu63ZgJUM7ZrfGzckE0mBWQwbSdmvbONJHWWcUDVyiDzj48XnRqZoYBBu/55/4lCynP5tp0tyJdHoF4riANv++fPn3GtFv+gKctwt4aMYM18c4XKAOGzR0+ftzyDR0wqU35ZbeIrdlSjpW7BxWGGT8oFsGnvzJUFnlDx+k/5Lvb//kVY6zvLyEHVcalytmybv1TO1tQPa8rNMkUp2M6hF5BOtb13gr43RxNYGIMnlDCPhcJodeEd7QaXgluG6AlZoGfb3SFSNe+ChLSXViyzrrOSb5aKl61gr+2jFzojAdwF9T2Kz08Zb15qVyEt7UTcB0z47gNS8zaXep7yVt3t/iIRffExugHlfvFGT7GQMfqC5ajeWgXghMkruY+fRgJwd4LhzN4FvK/yBw2B5kpxyPXbEvRjuarFj7DrEfZKSbD576+Kksyf6hGzVNmeVPJPSwPeEpA0Wvm6ZRHSYsgX8yu5LZzjtEYevmOA6+HmCCd+Nz1eRSK25h+m+ar/KHDod4jmpLWfIJ8yQwl9IysslMlVxgz+WpwuJx57IL0RQch3CFBmeSLt5dKdzDeO5z2M1wa9R/JHXqGBCOKT/zncBP56IN4R/RpsYALUWc/vgCF2nL9J41xEGWr8bdLAsle+UNQK0w4J3qo/RUgfhaE15K4gRnd19ENR/NvL3lOxOY8ffmw+Tl9onCumfarScY2JXUF90LsIENt9cpOr4T6pMhrftjDpGXh8FQetTje5YTyWQoFcEMuYflucjViCXxXOZ0AF0y0By/PibJHjptCJWnB/5MMmma6cs6+42REjWTHz+Ywv6K1Ubhir5aIU4TjEVBHOa1VSaHgpgcAK7UotwZRYooTZBB4PZSQOs1E6fA="));
        java.nio.ShortBuffer v5_10 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItKQP4Bwte+UpsY8uxv7BkzZbZjyW0Bd5gK5BH/9mIpyjo3dh5PmWDTKW/2nP6fUS1IYLTA+hsNCr1oFMYScS30DqZDBHGcQCCG87bgvsliJqNDPXcj4+dXcI5FSwvSqUsJhzuWRsxqnwYw+QxqzNrZ7RMFfQpEwNVtRHWrsIXdbzPB7f4OpbOLf7oJd0S/CK0g=="));
        short v2_2 = android.opengl.GLES20.glCreateProgram();
        this.c = v2_2;
        android.opengl.GLES20.glAttachShader(v2_2, v4_17);
        android.opengl.GLES20.glAttachShader(this.c, v5_10);
        android.opengl.GLES20.glLinkProgram(this.c);
        this.d = android.opengl.GLES20.glGetUniformLocation(this.c, "u_MVPMatrix");
        this.e = android.opengl.GLES20.glGetUniformLocation(this.c, "u_Time");
        this.f = android.opengl.GLES20.glGetUniformLocation(this.c, "u_WindDir");
        this.g = android.opengl.GLES20.glGetUniformLocation(this.c, "u_SwayAmplitude");
        this.h = android.opengl.GLES20.glGetUniformLocation(this.c, "u_Color");
        this.i = android.opengl.GLES20.glGetUniformLocation(this.c, "u_Alpha");
        this.j = android.opengl.GLES20.glGetUniformLocation(this.c, "u_Offset");
        this.k = android.opengl.GLES20.glGetAttribLocation(this.c, "a_Corner");
        this.l = android.opengl.GLES20.glGetAttribLocation(this.c, "a_Center");
        this.m = android.opengl.GLES20.glGetAttribLocation(this.c, "a_Params");
        this.n = android.opengl.GLES20.glGetAttribLocation(this.c, "a_Styling");
        java.nio.ShortBuffer v4_6 = java.nio.ByteBuffer.allocateDirect(12936);
        v4_6.order(java.nio.ByteOrder.nativeOrder());
        this.o = v4_6.asFloatBuffer();
        java.nio.ShortBuffer v4_9 = java.nio.ByteBuffer.allocateDirect(588);
        v4_9.order(java.nio.ByteOrder.nativeOrder());
        java.nio.ShortBuffer v4_10 = v4_9.asShortBuffer();
        this.p = v4_10;
        v4_10.position(0);
        java.nio.ShortBuffer v4_11 = 0;
        while (v4_11 < 294) {
            this.p.put(((short) v4_11));
            v4_11++;
        }
        this.p.position(0);
        this.F = 1;
        return;
    }

    public final void k0(float p21)
    {
        n2.v v0 = this;
        if ((this.F) && (this.E)) {
            int v2 = 0;
            android.opengl.GLES20.glBindBuffer(34962, 0);
            android.opengl.GLES20.glBindBuffer(34963, 0);
            android.opengl.GLES20.glUseProgram(this.c);
            int v1_15 = Math.min(p21, 1023879938);
            int v3_3 = (this.w * 1073741824);
            int v5_8 = (this.x * 1073741824);
            n2.u[] v4_1 = this.t;
            java.nio.ShortBuffer v6_12 = v4_1.length;
            int v7_3 = 0;
            while (v7_3 < v6_12) {
                float[] v9_0 = v4_1[v7_3];
                int v12_2 = v9_0.f;
                float[] v13_1 = (this.A + 1056964608);
                float[] v11_4 = ((((this.y * v12_2) * v1_15) * v13_1) + v9_0.a);
                v9_0.a = v11_4;
                float v10_9 = ((((this.z * v12_2) * v1_15) * v13_1) + v9_0.b);
                v9_0.b = v10_9;
                float[] v11_5 = (v11_4 + this.C);
                if ((v11_5 > v3_3) || ((v11_5 < (- v3_3)) || ((v10_9 > v5_8) || (v10_9 < (- v5_8))))) {
                    this.m0(v9_0, 0);
                }
                v7_3++;
            }
            float[] v13_2 = this.q;
            android.opengl.Matrix.setIdentityM(v13_2, 0);
            float[] v9_1 = this.s;
            float[] v11_6 = this.r;
            android.opengl.Matrix.multiplyMM(v9_1, 0, v11_6, 0, v13_2, 0);
            this.o.position(0);
            int v1_18 = v4_1.length;
            int v3_1 = 0;
            int v5_6 = 0;
            while (v3_1 < v1_18) {
                java.nio.ShortBuffer v6_11 = v4_1[v3_1];
                int v7_2 = 0;
                while (v7_2 <= 20) {
                    float v10_3 = ((((float) v7_2) / 1101004800) - 1056964608);
                    int v12_1 = (v5_6 + 1);
                    this.l0(v5_6, v10_3, -1090519040, v6_11);
                    v5_6 += 2;
                    this.l0(v12_1, v10_3, 1056964608, v6_11);
                    v7_2++;
                }
                v3_1++;
            }
            this.o.put(this.u, 0, 3234);
            this.o.position(0);
            this.p.position(0);
            this.o.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.k, 2, 5126, 0, 44, this.o);
            android.opengl.GLES20.glEnableVertexAttribArray(this.k);
            this.o.position(2);
            android.opengl.GLES20.glVertexAttribPointer(this.l, 3, 5126, 0, 44, this.o);
            android.opengl.GLES20.glEnableVertexAttribArray(this.l);
            this.o.position(5);
            android.opengl.GLES20.glVertexAttribPointer(this.m, 4, 5126, 0, 44, this.o);
            android.opengl.GLES20.glEnableVertexAttribArray(this.m);
            this.o.position(9);
            android.opengl.GLES20.glVertexAttribPointer(this.n, 2, 5126, 0, 44, this.o);
            android.opengl.GLES20.glEnableVertexAttribArray(this.n);
            android.opengl.GLES20.glUniform1f(this.e, (((float) (android.os.SystemClock.uptimeMillis() % 100000)) / 1148846080));
            android.opengl.GLES20.glUniformMatrix4fv(this.d, 1, 0, v9_1, 0);
            android.opengl.GLES20.glUniform2f(this.f, this.y, this.z);
            android.opengl.GLES20.glUniform1f(this.g, ((this.A * 1045220557) + 1061997773));
            android.opengl.GLES20.glUniform4fv(this.h, 1, this.D, 0);
            android.opengl.GLES20.glUniform1f(v0.i, v0.B);
            android.opengl.GLES20.glUniform1f(v0.j, v0.C);
            android.opengl.GLES20.glEnable(3042);
            android.opengl.GLES20.glBlendFunc(770, 1);
            while (v2 < 7) {
                c4.b.g0(this.c, v13_2, v11_6, v9_1, v4_1[v2].c);
                this.p.position((v2 * 42));
                android.opengl.GLES20.glDrawElements(5, 42, 5123, this.p);
                v2++;
            }
            android.opengl.GLES20.glDisable(3042);
            android.opengl.GLES20.glDisableVertexAttribArray(this.k);
            android.opengl.GLES20.glDisableVertexAttribArray(this.l);
            android.opengl.GLES20.glDisableVertexAttribArray(this.m);
            android.opengl.GLES20.glDisableVertexAttribArray(this.n);
        }
        return;
    }

    public final void l0(int p2, float p3, float p4, n2.u p5)
    {
        int v2_1 = (p2 * 11);
        float[] v0 = this.u;
        v0[v2_1] = p3;
        v0[(v2_1 + 1)] = p4;
        v0[(v2_1 + 2)] = p5.a;
        v0[(v2_1 + 3)] = p5.b;
        v0[(v2_1 + 4)] = p5.c;
        v0[(v2_1 + 5)] = p5.d;
        v0[(v2_1 + 6)] = p5.e;
        v0[(v2_1 + 7)] = p5.f;
        v0[(v2_1 + 8)] = p5.g;
        v0[(v2_1 + 9)] = p5.h;
        v0[(v2_1 + 10)] = p5.i;
        return;
    }

    public final void m0(n2.u p8, boolean p9)
    {
        float v0_0 = i2.k0.a;
        float v1_6 = ((v0_0.nextFloat() * 1091567616) + -1082130432);
        p8.c = v1_6;
        float v1_0 = ((v1_6 + 1065353216) / 1091567616);
        p8.f = (((1061997772 * v1_0) + 1058642330) * 1067869798);
        p8.d = (((v0_0.nextFloat() * 1073741824) + 1065353216) * p8.f);
        p8.e = (v0_0.nextFloat() * 1092616192);
        p8.g = (((1053609165 * v1_0) + 1058642330) * ((v0_0.nextFloat() * 1073741824) + 1065353216));
        p8.i = (((v0_0.nextFloat() * 1024416809) + 1000593162) * v1_0);
        p8.h = ((((v0_0.nextFloat() * 1017370378) + 1008981770) * v1_0) + 1002740646);
        float v1_7 = ((this.w / 1073741824) + 1077936128);
        if (p9 == 0) {
            if (this.y <= 0) {
                p8.a = (v1_7 - this.C);
            } else {
                p8.a = ((- v1_7) - this.C);
            }
        } else {
            p8.a = (((v0_0.nextFloat() * 1073741824) - 1065353216) * this.w);
        }
        p8.b = (((v0_0.nextFloat() * 1073741824) - 1065353216) * this.x);
        return;
    }
}
