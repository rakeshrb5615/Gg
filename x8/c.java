package x8;
public final class c extends java.lang.Thread {

    public final void run()
    {
        while(true) {
            java.util.concurrent.locks.ReentrantLock v0 = x8.d.j;
            v0.lock();
            int v1_2 = c5.c.l();
            if (v1_2 != x8.d.i) {
                v0.unlock();
                if (v1_2 == 0) {
                } else {
                    v1_2.k();
                }
            } else {
                x8.d.i = 0;
                v0.unlock();
                return;
            }
        }
    }
}
