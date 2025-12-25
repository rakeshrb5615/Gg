package androidx.loader.content;
public final class j extends android.os.Handler {

    public final void handleMessage(android.os.Message p4)
    {
        int v0_1 = ((androidx.loader.content.i) p4.obj);
        Throwable v4_2 = p4.what;
        if (v4_2 == 1) {
            Throwable v4_4 = v0_1.a;
            int v0_4 = v0_1.b[0];
            if (!v4_4.d.get()) {
                java.util.concurrent.CountDownLatch v1_1 = v4_4.f;
                try {
                    v4_4.n.dispatchOnLoadComplete(v4_4, v0_4);
                    v1_1.countDown();
                } catch (Throwable v4_1) {
                    v1_1.countDown();
                    throw v4_1;
                }
            } else {
                java.util.concurrent.CountDownLatch v1_2 = v4_4.f;
                try {
                    v4_4.n.dispatchOnCancelled(v4_4, v0_4);
                    v1_2.countDown();
                } catch (Throwable v4_3) {
                    v1_2.countDown();
                    throw v4_3;
                }
            }
            v4_4.c = 3;
            return;
        } else {
            if (v4_2 == 2) {
                return;
            } else {
                return;
            }
        }
    }
}
