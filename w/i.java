package w;
public abstract class i extends w.d {
    public w.d[] q0;
    public int r0;

    public i()
    {
        int v0_1 = new w.d[4];
        this.q0 = v0_1;
        this.r0 = 0;
        return;
    }

    public final void R(int p6, java.util.ArrayList p7, x.n p8)
    {
        int v0 = 0;
        int v1_0 = 0;
        while (v1_0 < this.r0) {
            w.d v2_1 = this.q0[v1_0];
            java.util.ArrayList v3 = p8.a;
            if (!v3.contains(v2_1)) {
                v3.add(v2_1);
            }
            v1_0++;
        }
        while (v0 < this.r0) {
            x.h.b(this.q0[v0], p6, p7, p8);
            v0++;
        }
        return;
    }

    public void S()
    {
        return;
    }
}
