package androidx.lifecycle;
public final class y implements java.lang.Runnable {
    public final synthetic androidx.lifecycle.c0 a;

    public y(androidx.lifecycle.c0 p1)
    {
        this.a = p1;
        return;
    }

    public final void run()
    {
        Throwable v1_2 = this.a.f;
        this.a.f = androidx.lifecycle.c0.k;
        this.a.h(v1_2);
        return;
    }
}
