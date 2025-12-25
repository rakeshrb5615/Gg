package z8;
public final class j extends java.util.concurrent.CompletableFuture {
    public final z8.z a;

    public j(z8.z p1)
    {
        this.a = p1;
        return;
    }

    public final boolean cancel(boolean p2)
    {
        if (p2) {
            this.a.cancel();
        }
        return super.cancel(p2);
    }
}
