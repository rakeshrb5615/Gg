package d8;
public final class j implements d8.k {
    public final synthetic int a;
    public final Object b;

    public synthetic j(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void a(Throwable p2)
    {
        switch (this.a) {
            case 0:
                ((java.util.concurrent.ScheduledFuture) this.b).cancel(0);
                return;
            case 1:
                ((u7.l) this.b).invoke(p2);
                return;
            default:
                ((d8.p0) this.b).a();
                return;
        }
    }

    public final String toString()
    {
        switch (this.a) {
            case 0:
                String v0_4 = new StringBuilder("CancelFutureOnCancel[");
                v0_4.append(((java.util.concurrent.ScheduledFuture) this.b));
                v0_4.append(93);
                return v0_4.toString();
            case 1:
                String v0_8 = new StringBuilder("CancelHandler.UserSupplied[");
                v0_8.append(((u7.l) this.b).getClass().getSimpleName());
                v0_8.append(64);
                v0_8.append(d8.f0.j(this));
                v0_8.append(93);
                return v0_8.toString();
            default:
                String v0_7 = new StringBuilder("DisposeOnCancel[");
                v0_7.append(((d8.p0) this.b));
                v0_7.append(93);
                return v0_7.toString();
        }
    }
}
