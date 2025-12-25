package i4;
public final class g extends i4.e {
    public final synthetic int b;
    public final synthetic Object c;

    public synthetic g(Object p1, int p2)
    {
        this.b = p2;
        this.c = p1;
        return;
    }

    public final void a()
    {
        switch (this.b) {
            case 0:
                if ((((i4.h) this.c).k.get() <= 0) || (((i4.h) this.c).k.decrementAndGet() <= 0)) {
                    i4.h v1_5 = ((i4.h) this.c);
                    if (v1_5.m != null) {
                        Object[] v4_0 = new Object[0];
                        v1_5.b.g("Unbind from service.", v4_0);
                        i4.h v1_8 = ((i4.h) this.c);
                        v1_8.a.unbindService(v1_8.l);
                        i4.h v1_11 = ((i4.h) this.c);
                        v1_11.g = 0;
                        v1_11.m = 0;
                        v1_11.l = 0;
                    }
                    ((i4.h) this.c).c();
                } else {
                    int v2_2 = new Object[0];
                    ((i4.h) this.c).b.g("Leaving the connection open for other ongoing calls.", v2_2);
                }
                return;
            default:
                Object v0_6 = ((i4.h) ((d4.q) this.c).b);
                Object[] v4_1 = new Object[0];
                v0_6.b.g("unlinkToDeath", v4_1);
                v0_6.m.asBinder().unlinkToDeath(v0_6.j, 0);
                v0_6.m = 0;
                v0_6.g = 0;
                return;
        }
    }
}
