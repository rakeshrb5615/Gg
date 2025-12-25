package b5;
public final enum class j extends java.lang.Enum implements java.util.concurrent.Executor {
    public static final enum b5.j a;
    public static final synthetic b5.j[] b;

    static j()
    {
        b5.j[] v0_1 = new b5.j("INSTANCE", 0);
        b5.j.a = v0_1;
        b5.j.b = new b5.j[] {v0_1});
        return;
    }

    public static b5.j valueOf(String p1)
    {
        return ((b5.j) Enum.valueOf(b5.j, p1));
    }

    public static b5.j[] values()
    {
        return ((b5.j[]) b5.j.b.clone());
    }

    public final void execute(Runnable p1)
    {
        p1.run();
        return;
    }
}
