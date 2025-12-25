package v3;
public final class c0 {
    public int a;
    public v3.p b;
    public int[][] c;
    public v3.p[] d;
    public v3.b0 e;
    public v3.b0 f;
    public v3.b0 g;
    public v3.b0 h;

    public c0(v3.p p2)
    {
        this.b();
        this.a(android.util.StateSet.WILD_CARD, p2);
        return;
    }

    public final void a(int[] p6, v3.p p7)
    {
        int[][] v0_0 = this.a;
        if ((v0_0 == null) || (p6.length == 0)) {
            this.b = p7;
        }
        int v1_4 = this.c;
        if (v0_0 >= v1_4.length) {
            v3.p[] v2_2 = (v0_0 + 10);
            int[][] v3 = new int[][v2_2];
            System.arraycopy(v1_4, 0, v3, 0, v0_0);
            this.c = v3;
            int v1_0 = new v3.p[v2_2];
            System.arraycopy(this.d, 0, v1_0, 0, v0_0);
            this.d = v1_0;
        }
        int v1_1 = this.a;
        this.c[v1_1] = p6;
        this.d[v1_1] = p7;
        this.a = (v1_1 + 1);
        return;
    }

    public final void b()
    {
        this.b = new v3.p();
        int[][] v1 = new int[][10];
        this.c = v1;
        v3.p[] v0_3 = new v3.p[10];
        this.d = v0_3;
        return;
    }
}
