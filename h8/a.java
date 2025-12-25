package h8;
public final class a extends java.util.concurrent.CancellationException {
    public final transient Object a;

    public a(g8.d p2)
    {
        super("Flow was aborted, no more elements needed");
        super.a = p2;
        return;
    }

    public final Throwable fillInStackTrace()
    {
        StackTraceElement[] v0_1 = new StackTraceElement[0];
        this.setStackTrace(v0_1);
        return this;
    }
}
