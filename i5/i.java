package i5;
public final class i extends java.io.InputStream {
    public int a;
    public int b;
    public final synthetic i5.k c;

    public i(i5.k p2, i5.h p3)
    {
        this.c = p2;
        this.a = p2.D((p3.a + 4));
        this.b = p3.b;
        return;
    }

    public final int read()
    {
        if (this.b != 0) {
            int v0_5 = this.c;
            v0_5.a.seek(((long) this.a));
            int v1_2 = v0_5.a.read();
            this.a = v0_5.D((this.a + 1));
            this.b = (this.b - 1);
            return v1_2;
        } else {
            return -1;
        }
    }

    public final int read(byte[] p3, int p4, int p5)
    {
        if (p3 == 0) {
            throw new NullPointerException("buffer");
        } else {
            if (((p4 | p5) < 0) || (p5 > (p3.length - p4))) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                int v0_0 = this.b;
                if (v0_0 <= 0) {
                    return -1;
                } else {
                    if (p5 > v0_0) {
                        p5 = v0_0;
                    }
                    i5.k v1 = this.c;
                    v1.A(this.a, p3, p4, p5);
                    this.a = v1.D((this.a + p5));
                    this.b = (this.b - p5);
                    return p5;
                }
            }
        }
    }
}
