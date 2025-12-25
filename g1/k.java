package g1;
public final class k extends q4.b {
    public final synthetic q4.b f;
    public final synthetic java.util.concurrent.ThreadPoolExecutor g;

    public k(q4.b p2, java.util.concurrent.ThreadPoolExecutor p3)
    {
        super(7);
        super.f = p2;
        super.g = p3;
        return;
    }

    public final void H(Throwable p3)
    {
        java.util.concurrent.ThreadPoolExecutor v0 = this.g;
        try {
            this.f.H(p3);
            v0.shutdown();
            return;
        } catch (Throwable v3_1) {
            v0.shutdown();
            throw v3_1;
        }
    }

    public final void K(j6.s p3)
    {
        java.util.concurrent.ThreadPoolExecutor v0 = this.g;
        try {
            this.f.K(p3);
            v0.shutdown();
            return;
        } catch (Throwable v3_1) {
            v0.shutdown();
            throw v3_1;
        }
    }
}
