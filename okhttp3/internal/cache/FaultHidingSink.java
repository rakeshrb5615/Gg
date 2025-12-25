package okhttp3.internal.cache;
public class FaultHidingSink extends x8.n {
    public boolean b;

    public final void close()
    {
        try {
            super.close();
            return;
        } catch (java.io.IOException) {
            this.b = 1;
            throw 0;
        }
    }

    public final void flush()
    {
        if (!this.b) {
            try {
                super.flush();
                return;
            } catch (java.io.IOException) {
                this.b = 1;
                throw 0;
            }
        } else {
            return;
        }
    }

    public final void k(x8.g p2, long p3)
    {
        if (!this.b) {
            try {
                this.a.k(p2, p3);
                return;
            } catch (java.io.IOException) {
                this.b = 1;
                throw 0;
            }
        } else {
            p2.skip(p3);
            return;
        }
    }
}
