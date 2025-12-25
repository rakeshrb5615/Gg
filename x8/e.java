package x8;
public final class e implements java.io.Closeable {
    public x8.g a;

    public final void close()
    {
        if (this.a == null) {
            throw new IllegalStateException("not attached to a buffer");
        } else {
            this.a = 0;
            return;
        }
    }
}
