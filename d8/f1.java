package d8;
public final class f1 extends java.util.concurrent.CancellationException {
    public final transient d8.e1 a;

    public f1(String p1, Throwable p2, d8.e1 p3)
    {
        super(p1);
        super.a = p3;
        if (p2 != null) {
            super.initCause(p2);
        }
        return;
    }

    public final boolean equals(Object p3)
    {
        if ((p3 != this) && ((!(p3 instanceof d8.f1)) || ((!kotlin.jvm.internal.j.a(((d8.f1) p3).getMessage(), this.getMessage())) || ((!kotlin.jvm.internal.j.a(((d8.f1) p3).a, this.a)) || (!kotlin.jvm.internal.j.a(((d8.f1) p3).getCause(), this.getCause())))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final Throwable fillInStackTrace()
    {
        StackTraceElement[] v0_1 = new StackTraceElement[0];
        this.setStackTrace(v0_1);
        return this;
    }

    public final int hashCode()
    {
        int v0_2;
        int v0_0 = this.getMessage();
        kotlin.jvm.internal.j.b(v0_0);
        int v1_0 = ((this.a.hashCode() + (v0_0.hashCode() * 31)) * 31);
        int v0_1 = this.getCause();
        if (v0_1 == 0) {
            v0_2 = 0;
        } else {
            v0_2 = v0_1.hashCode();
        }
        return (v1_0 + v0_2);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(super.toString());
        v0_1.append("; job=");
        v0_1.append(this.a);
        return v0_1.toString();
    }
}
