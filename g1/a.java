package g1;
public final synthetic class a implements java.util.concurrent.ThreadFactory {
    public final synthetic String a;

    public synthetic a(String p1)
    {
        this.a = p1;
        return;
    }

    public final Thread newThread(Runnable p3)
    {
        Thread v0_1 = new Thread(p3, this.a);
        v0_1.setPriority(10);
        return v0_1;
    }
}
