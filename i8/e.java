package i8;
public final class e extends java.lang.RuntimeException {
    public final transient l7.h a;

    public e(l7.h p1)
    {
        this.a = p1;
        return;
    }

    public final Throwable fillInStackTrace()
    {
        StackTraceElement[] v0_1 = new StackTraceElement[0];
        this.setStackTrace(v0_1);
        return this;
    }

    public final String getLocalizedMessage()
    {
        return this.a.toString();
    }
}
