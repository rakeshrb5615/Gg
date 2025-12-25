package okhttp3.internal.publicsuffix;
public abstract class BasePublicSuffixList implements okhttp3.internal.publicsuffix.PublicSuffixList {
    public final java.util.concurrent.atomic.AtomicBoolean b;
    public final java.util.concurrent.CountDownLatch c;
    public x8.j d;
    public x8.j e;
    public java.io.IOException f;

    public BasePublicSuffixList()
    {
        this.b = new java.util.concurrent.atomic.AtomicBoolean(0);
        this.c = new java.util.concurrent.CountDownLatch(1);
        return;
    }

    public final x8.j a()
    {
        int v0_0 = this.d;
        if (v0_0 == 0) {
            kotlin.jvm.internal.j.i("bytes");
            throw 0;
        } else {
            return v0_0;
        }
    }

    public abstract x8.h0 b();

    public final void c()
    {
        try {
            java.util.concurrent.CountDownLatch v0_4 = x8.b.c(this.b());
            try {
                Throwable v1_4 = v0_4.e(((long) v0_4.readInt()));
                Throwable v2_2 = v0_4.e(((long) v0_4.readInt()));
            } catch (Throwable v1_0) {
                try {
                    throw v1_0;
                } catch (Throwable v2_3) {
                    j5.t1.f(v0_4, v1_0);
                    throw v2_3;
                }
            }
            v0_4.close();
            try {
                kotlin.jvm.internal.j.b(v1_4);
                this.d = v1_4;
                kotlin.jvm.internal.j.b(v2_2);
                this.e = v2_2;
            } catch (java.util.concurrent.CountDownLatch v0_1) {
                throw v0_1;
            }
            this.c.countDown();
            return;
        } catch (java.util.concurrent.CountDownLatch v0_3) {
            this.c.countDown();
            throw v0_3;
        }
    }
}
