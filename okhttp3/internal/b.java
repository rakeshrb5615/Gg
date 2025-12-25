package okhttp3.internal;
public final synthetic class b implements java.util.concurrent.ThreadFactory {
    public final synthetic String a;
    public final synthetic boolean b;

    public synthetic b(String p1, boolean p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final Thread newThread(Runnable p3)
    {
        Thread v0_1 = new Thread(p3, this.a);
        v0_1.setDaemon(this.b);
        return v0_1;
    }
}
