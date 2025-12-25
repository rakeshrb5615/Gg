package n0;
public final class j extends java.lang.Thread {
    public final int a;

    public j(Runnable p2)
    {
        super(p2, "fonts-androidx");
        super.a = 10;
        return;
    }

    public final void run()
    {
        android.os.Process.setThreadPriority(this.a);
        super.run();
        return;
    }
}
