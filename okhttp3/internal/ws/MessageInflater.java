package okhttp3.internal.ws;
public final class MessageInflater implements java.io.Closeable {
    public x8.s a;

    public final void close()
    {
        int v0_0 = this.a;
        if (v0_0 != 0) {
            v0_0.close();
        }
        this.a = 0;
        return;
    }
}
