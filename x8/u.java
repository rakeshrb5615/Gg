package x8;
public final class u implements java.io.Closeable {
    public boolean a;
    public int b;
    public final java.util.concurrent.locks.ReentrantLock c;
    public final java.io.RandomAccessFile d;

    public u(java.io.RandomAccessFile p2)
    {
        this.c = new java.util.concurrent.locks.ReentrantLock();
        this.d = p2;
        return;
    }

    public final x8.l c(long p3)
    {
        x8.l v0_0 = this.c;
        v0_0.lock();
        try {
            if (this.a) {
                throw new IllegalStateException("closed");
            } else {
                this.b = (this.b + 1);
                v0_0.unlock();
                return new x8.l(this, p3);
            }
        } catch (String v3_2) {
            v0_0.unlock();
            throw v3_2;
        }
    }

    public final void close()
    {
        Throwable v0_0 = this.c;
        v0_0.lock();
        try {
            if (!this.a) {
                this.a = 1;
                if (this.b == 0) {
                    v0_0.unlock();
                    this.d.close();
                    return;
                } else {
                    v0_0.unlock();
                    return;
                }
            } else {
                v0_0.unlock();
                return;
            }
        } catch (int v1_3) {
            v0_0.unlock();
            throw v1_3;
        }
    }

    public final long size()
    {
        Throwable v0_0 = this.c;
        v0_0.lock();
        try {
            if (this.a) {
                throw new IllegalStateException("closed");
            } else {
                v0_0.unlock();
                return this.d.length();
            }
        } catch (String v1_2) {
            v0_0.unlock();
            throw v1_2;
        }
    }
}
