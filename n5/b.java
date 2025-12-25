package n5;
public final synthetic class b implements o2.h {
    public final synthetic n5.c a;
    public final synthetic com.google.android.gms.tasks.TaskCompletionSource b;
    public final synthetic boolean c;
    public final synthetic g5.b d;

    public synthetic b(n5.c p1, com.google.android.gms.tasks.TaskCompletionSource p2, boolean p3, g5.b p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public final void a(Exception p9)
    {
        Thread v0_0 = this.b;
        if (p9 == null) {
            if (this.c) {
                int v1 = 1;
                Throwable v9_6 = new java.util.concurrent.CountDownLatch(1);
                new Thread(new a5.i(13, this.a, v9_6)).start();
                int v5_1 = 0;
                try {
                    long v2_2 = java.util.concurrent.TimeUnit.SECONDS.toNanos(2);
                    long v6_1 = (System.nanoTime() + v2_2);
                } catch (Throwable v9_2) {
                    v1 = v5_1;
                    if (v1 != 0) {
                        Thread.currentThread().interrupt();
                    }
                    throw v9_2;
                }
                while(true) {
                    v9_6.await(v2_2, java.util.concurrent.TimeUnit.NANOSECONDS);
                    if (v5_1 != 0) {
                        Thread.currentThread().interrupt();
                    }
                    try {
                        v2_2 = (v6_1 - System.nanoTime());
                        v5_1 = 1;
                    } catch (Throwable v9_2) {
                    }
                }
            }
            v0_0.trySetResult(this.d);
            return;
        } else {
            v0_0.trySetException(p9);
            return;
        }
    }
}
