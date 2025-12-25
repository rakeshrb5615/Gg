package x8;
public class j0 {
    public static final x8.i0 d;
    public boolean a;
    public long b;
    public long c;

    static j0()
    {
        x8.j0.d = new x8.i0();
        return;
    }

    public x8.j0 a()
    {
        this.a = 0;
        return this;
    }

    public x8.j0 b()
    {
        this.c = 0;
        return this;
    }

    public long c()
    {
        if (!this.a) {
            throw new IllegalStateException("No deadline");
        } else {
            return this.b;
        }
    }

    public x8.j0 d(long p2)
    {
        this.a = 1;
        this.b = p2;
        return this;
    }

    public boolean e()
    {
        return this.a;
    }

    public void f()
    {
        if (Thread.currentThread().isInterrupted()) {
            throw new java.io.InterruptedIOException("interrupted");
        } else {
            if ((this.a) && ((this.b - System.nanoTime()) <= 0)) {
                throw new java.io.InterruptedIOException("deadline reached");
            } else {
                return;
            }
        }
    }

    public x8.j0 g(long p3, java.util.concurrent.TimeUnit p5)
    {
        kotlin.jvm.internal.j.e(p5, "unit");
        if (p3 < 0) {
            throw new IllegalArgumentException(v1.a.g(p3, "timeout < 0: ").toString());
        } else {
            this.c = p5.toNanos(p3);
            return this;
        }
    }
}
