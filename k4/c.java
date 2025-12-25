package k4;
public final class c extends k4.a0 {
    public final synthetic int m;
    public final synthetic Object n;

    public synthetic c(Object p1, int p2)
    {
        this.m = p2;
        this.n = p1;
        return;
    }

    public final void b()
    {
        switch (this.m) {
            case 0:
                k4.d v0_6 = ((k4.d) ((d4.q) this.n).b);
                Object[] v4_1 = new Object[0];
                v0_6.b.b("unlinkToDeath", v4_1);
                v0_6.n.asBinder().unlinkToDeath(v0_6.k, 0);
                v0_6.n = 0;
                v0_6.g = 0;
                return;
            default:
                if ((((k4.d) this.n).l.get() <= 0) || (((k4.d) this.n).l.decrementAndGet() <= 0)) {
                    k4.d v1_12 = ((k4.d) this.n);
                    if (v1_12.n != null) {
                        Object[] v4_0 = new Object[0];
                        v1_12.b.b("Unbind from service.", v4_0);
                        k4.d v1_15 = ((k4.d) this.n);
                        v1_15.a.unbindService(v1_15.m);
                        k4.d v1_18 = ((k4.d) this.n);
                        v1_18.g = 0;
                        v1_18.n = 0;
                        v1_18.m = 0;
                    }
                    ((k4.d) this.n).e();
                } else {
                    int v2_3 = new Object[0];
                    ((k4.d) this.n).b.b("Leaving the connection open for other ongoing calls.", v2_3);
                }
                return;
        }
    }
}
