package w5;
public final class b extends java.io.OutputStream {
    public long a;

    public final void write(int p5)
    {
        this.a = (this.a + 1);
        return;
    }

    public final void write(byte[] p5)
    {
        this.a = (this.a + ((long) p5.length));
        return;
    }

    public final void write(byte[] p3, int p4, int p5)
    {
        if ((p4 >= 0) && ((p4 <= p3.length) && (p5 >= 0))) {
            int v4_1 = (p4 + p5);
            if ((v4_1 <= p3.length) && (v4_1 >= 0)) {
                this.a = (this.a + ((long) p5));
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
