package z8;
public final class h implements z8.g {
    public final synthetic int a;
    public final z8.j b;

    public synthetic h(z8.j p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void b(z8.d p1, Throwable p2)
    {
        switch (this.a) {
            case 0:
                this.b.completeExceptionally(p2);
                return;
            default:
                this.b.completeExceptionally(p2);
                return;
        }
    }

    public final void d(z8.d p2, z8.q0 p3)
    {
        switch (this.a) {
            case 0:
                z8.j v0 = this.b;
                if (!p3.a.v) {
                    v0.completeExceptionally(new a5.o(p3));
                } else {
                    v0.complete(p3.b);
                }
                return;
            default:
                this.b.complete(p3);
                return;
        }
    }
}
