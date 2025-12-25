package d4;
public final class q implements android.content.ServiceConnection {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic q(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onServiceConnected(android.content.ComponentName p4, android.os.IBinder p5)
    {
        switch (this.a) {
            case 0:
                i4.h v0_2 = ((d4.r) this.b);
                v0_2.b.h("ServiceConnectionImpl.onServiceConnected(%s)", new Object[] {p4}));
                v0_2.a().post(new d4.p(this, p5));
                return;
            case 1:
                i4.h v0_6 = ((i4.h) this.b);
                v0_6.b.g("ServiceConnectionImpl.onServiceConnected(%s)", new Object[] {p4}));
                v0_6.a().post(new h4.d(this, p5));
                return;
            default:
                i4.h v0_5 = ((k4.d) this.b);
                v0_5.b.b("ServiceConnectionImpl.onServiceConnected(%s)", new Object[] {p4}));
                v0_5.a().post(new k4.b(this, p5));
                return;
        }
    }

    public final void onServiceDisconnected(android.content.ComponentName p4)
    {
        switch (this.a) {
            case 0:
                android.os.Handler v0_3 = ((d4.r) this.b);
                v0_3.b.h("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[] {p4}));
                v0_3.a().post(new d4.o(this, 1));
                return;
            case 1:
                android.os.Handler v0_6 = ((i4.h) this.b);
                v0_6.b.g("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[] {p4}));
                v0_6.a().post(new i4.g(this, 1));
                return;
            default:
                android.os.Handler v0_8 = ((k4.d) this.b);
                v0_8.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[] {p4}));
                v0_8.a().post(new k4.c(this, 0));
                return;
        }
    }
}
