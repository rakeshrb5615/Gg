package b5;
public final synthetic class f implements java.util.concurrent.Callable {
    public final synthetic b5.g a;
    public final synthetic java.util.concurrent.Callable b;
    public final synthetic l6.c c;

    public synthetic f(b5.g p1, java.util.concurrent.Callable p2, l6.c p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final Object call()
    {
        return this.a.a.submit(new a5.i(3, this.b, this.c));
    }
}
