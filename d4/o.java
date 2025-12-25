package d4;
public final class o extends d4.m {
    public final synthetic int b;
    public final synthetic Object c;

    public synthetic o(Object p1, int p2)
    {
        this.b = p2;
        this.c = p1;
        return;
    }

    public final void a()
    {
        switch (this.b) {
            case 0:
                if (((d4.r) this.c).k.get() <= 0) {
                    d4.r v1_8 = ((d4.r) this.c);
                    if (v1_8.m != null) {
                        Object[] v4_0 = new Object[0];
                        v1_8.b.h("Unbind from service.", v4_0);
                        d4.r v1_11 = ((d4.r) this.c);
                        v1_11.a.unbindService(v1_11.l);
                        d4.r v1_14 = ((d4.r) this.c);
                        v1_14.g = 0;
                        v1_14.m = 0;
                        v1_14.l = 0;
                    }
                    ((d4.r) this.c).d();
                } else {
                    if (((d4.r) this.c).k.decrementAndGet() > 0) {
                        int v2_1 = new Object[0];
                        ((d4.r) this.c).b.h("Leaving the connection open for other ongoing calls.", v2_1);
                    } else {
                    }
                }
                return;
            default:
                Object v0_6 = ((d4.r) ((d4.q) this.c).b);
                Object[] v4_1 = new Object[0];
                v0_6.b.h("unlinkToDeath", v4_1);
                v0_6.m.asBinder().unlinkToDeath(v0_6.j, 0);
                v0_6.m = 0;
                v0_6.g = 0;
                return;
        }
    }
}
