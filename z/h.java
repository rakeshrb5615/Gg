package z;
public final class h {
    public int[] a;
    public int[] b;
    public int c;
    public int[] d;
    public float[] e;
    public int f;
    public int[] g;
    public String[] h;
    public int i;
    public int[] j;
    public boolean[] k;
    public int l;

    public final void a(int p4, float p5)
    {
        int v1_0 = this.d;
        if (this.f >= v1_0.length) {
            this.d = java.util.Arrays.copyOf(v1_0, (v1_0.length * 2));
            int v0_7 = this.e;
            this.e = java.util.Arrays.copyOf(v0_7, (v0_7.length * 2));
        }
        int v1_3 = this.f;
        this.d[v1_3] = p4;
        float[] v4_1 = this.e;
        this.f = (v1_3 + 1);
        v4_1[v1_3] = p5;
        return;
    }

    public final void b(int p4, int p5)
    {
        int v1_0 = this.a;
        if (this.c >= v1_0.length) {
            this.a = java.util.Arrays.copyOf(v1_0, (v1_0.length * 2));
            int v0_7 = this.b;
            this.b = java.util.Arrays.copyOf(v0_7, (v0_7.length * 2));
        }
        int v1_3 = this.c;
        this.a[v1_3] = p4;
        int[] v4_1 = this.b;
        this.c = (v1_3 + 1);
        v4_1[v1_3] = p5;
        return;
    }

    public final void c(int p4, String p5)
    {
        int v1_0 = this.g;
        if (this.i >= v1_0.length) {
            this.g = java.util.Arrays.copyOf(v1_0, (v1_0.length * 2));
            int v0_8 = this.h;
            this.h = ((String[]) java.util.Arrays.copyOf(v0_8, (v0_8.length * 2)));
        }
        int v1_3 = this.i;
        this.g[v1_3] = p4;
        String[] v4_1 = this.h;
        this.i = (v1_3 + 1);
        v4_1[v1_3] = p5;
        return;
    }

    public final void d(int p4, boolean p5)
    {
        int v1_0 = this.j;
        if (this.l >= v1_0.length) {
            this.j = java.util.Arrays.copyOf(v1_0, (v1_0.length * 2));
            int v0_7 = this.k;
            this.k = java.util.Arrays.copyOf(v0_7, (v0_7.length * 2));
        }
        int v1_3 = this.l;
        this.j[v1_3] = p4;
        boolean[] v4_1 = this.k;
        this.l = (v1_3 + 1);
        v4_1[v1_3] = p5;
        return;
    }
}
