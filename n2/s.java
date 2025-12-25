package n2;
public final class s extends c4.b {
    public final android.content.SharedPreferences A;
    public final int[][] B;
    public final float[][] C;
    public final float[][] D;
    public final float[][] E;
    public final int[][] F;
    public final int[] G;
    public final float[][] H;
    public float[] I;
    public float[] J;
    public float K;
    public float[][] L;
    public float[][] M;
    public final float[] N;
    public android.graphics.drawable.Drawable[] O;
    public int P;
    public float Q;
    public float R;
    public final long S;
    public float T;
    public int U;
    public final String V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public int b0;
    public final android.content.Context c;
    public int c0;
    public float d;
    public int d0;
    public float e;
    public int e0;
    public float[] f;
    public int f0;
    public float[] g;
    public boolean g0;
    public float h;
    public float h0;
    public float i;
    public final float[] i0;
    public float j;
    public final int[] j0;
    public float k;
    public boolean k0;
    public java.nio.FloatBuffer[] l;
    public final java.util.ArrayList l0;
    public java.nio.FloatBuffer m;
    public final android.graphics.drawable.Drawable m0;
    public int n;
    public int[] o;
    public int[] p;
    public final String q;
    public float[][][] r;
    public float[][] s;
    public float[][] t;
    public final float[] u;
    public final float[] v;
    public final float[] w;
    public float[] x;
    public final String y;
    public final int z;

    public s(android.content.Context p4)
    {
        int[] v1_4 = new float[16];
        this.u = v1_4;
        int[] v1_6 = new float[16];
        this.v = v1_6;
        int v0_13 = new float[16];
        this.w = v0_13;
        int[] v1_14 = new float[4];
        v1_14 = {1065353216, 1065353216, 1065353216, 0};
        this.N = v1_14;
        this.S = System.nanoTime();
        this.h0 = 1065353216;
        int[] v1_3 = new float[2];
        this.i0 = v1_3;
        int v0_1 = new int[4];
        this.j0 = v0_1;
        this.l0 = new java.util.ArrayList();
        this.c = p4;
        this.y = p4.getString(2131952500);
        this.A = j5.t1.z(p4);
        if (this.z == 0) {
            this.z = 5;
        }
        int v0_9 = this.z;
        int[] v1_5 = new int[][v0_9];
        this.B = v1_5;
        int[] v1_7 = new float[][v0_9];
        this.C = v1_7;
        int[] v1_8 = new float[][v0_9];
        this.D = v1_8;
        int[] v1_9 = new float[][v0_9];
        this.E = v1_9;
        int[] v1_10 = new float[][v0_9];
        this.s = v1_10;
        int[] v1_11 = new int[][v0_9];
        this.F = v1_11;
        int[] v1_12 = new float[][v0_9];
        this.t = v1_12;
        int[] v1_13 = new int[v0_9];
        this.G = v1_13;
        int v0_10 = new float[][v0_9];
        this.H = v0_10;
        this.V = p4.getString(2131952431);
        this.q = p4.getString(2131951939);
        this.m0 = j5.t1.A(p4, 2131231509);
        return;
    }

    public final void k0(float p19, float p20, int p21, int p22)
    {
        int v5_5;
        int v1_4 = this.B[p21][p22];
        int v5_1 = this.s[p21][p22];
        float[] v2_2 = this.r[p21][p22][2];
        int v4_4 = this.t[p21][p22];
        int v4_6 = (((float) Math.abs(Math.sin(Math.toRadians(((double) v5_1))))) * 0);
        int v8_2 = ((1065353216 - v4_6) * (this.f[v1_4] * v4_4));
        int v4_8 = ((v4_6 + 1065353216) * (this.g[v1_4] * v4_4));
        int v3_3 = this.i0;
        v3_3[0] = v8_2;
        v3_3[1] = v4_8;
        int v13_1 = this.u;
        android.opengl.Matrix.setIdentityM(v13_1, 0);
        android.opengl.Matrix.translateM(v13_1, 0, p19, p20, v2_2);
        android.opengl.Matrix.scaleM(v13_1, 0, v8_2, v4_8, 1065353216);
        android.opengl.Matrix.translateM(v13_1, 0, 0, -1090519040, 0);
        android.opengl.Matrix.rotateM(this.u, 0, v5_1, 0, 0, 1065353216);
        android.opengl.Matrix.translateM(v13_1, 0, 0, 1056964608, 0);
        android.opengl.Matrix.multiplyMM(this.w, 0, this.v, 0, this.u, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.b0, 1, 0, this.w, 0);
        float[] v2_8 = this.P;
        if (v2_8 != 3) {
            v5_5 = this.o[v1_4];
        } else {
            if (v1_4 != 5) {
                if (v1_4 != 6) {
                } else {
                    v5_5 = this.p[1];
                }
            } else {
                v5_5 = this.p[0];
            }
        }
        float[] v2_11;
        int v6_9 = this.B[p21][p22];
        if ((v6_9 != 5) || (v2_8 == 3)) {
            if (v6_9 != 2) {
                if (v6_9 != 3) {
                    v2_11 = this.N;
                } else {
                    v2_11 = this.M[p21];
                }
            } else {
                v2_11 = this.M[p21];
            }
        } else {
            v2_11 = this.L[p21];
        }
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, v5_5);
        android.opengl.GLES20.glUniform1i(this.Y, 0);
        android.opengl.GLES20.glUniform4fv(this.e0, 1, v2_11, 0);
        android.opengl.GLES20.glUniform1f(this.f0, this.h0);
        java.nio.FloatBuffer v9_1 = this.l[v1_4];
        int v1_1 = this.m;
        v9_1.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.W, 3, 5126, 0, 12, v9_1);
        v1_1.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.X, 2, 5126, 0, 8, v1_1);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        return;
    }

    public final void l0(boolean p5)
    {
        android.graphics.drawable.Drawable v2 = this.m0;
        java.util.ArrayList v3 = this.l0;
        if (((java.util.Calendar.getInstance().get(2) + 1) != 12) || (p5 == null)) {
            v3.remove(v2);
        } else {
            v3.add(v2);
        }
        android.graphics.drawable.Drawable[] v5_2 = new android.graphics.drawable.Drawable[0];
        this.O = ((android.graphics.drawable.Drawable[]) v3.toArray(v5_2));
        return;
    }
}
