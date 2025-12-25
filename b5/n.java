package b5;
public final enum class n extends java.lang.Enum implements java.util.concurrent.Executor {
    public static final enum b5.n a;
    public static final android.os.Handler b;
    public static final synthetic b5.n[] c;

    static n()
    {
        android.os.Handler v0_2 = new b5.n("INSTANCE", 0);
        b5.n.a = v0_2;
        b5.n.c = new b5.n[] {v0_2});
        b5.n.b = new android.os.Handler(android.os.Looper.getMainLooper());
        return;
    }

    public static b5.n valueOf(String p1)
    {
        return ((b5.n) Enum.valueOf(b5.n, p1));
    }

    public static b5.n[] values()
    {
        return ((b5.n[]) b5.n.c.clone());
    }

    public final void execute(Runnable p2)
    {
        b5.n.b.post(p2);
        return;
    }
}
