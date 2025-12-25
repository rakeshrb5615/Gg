package j6;
public final class d extends java.io.FilterInputStream {
    public long a;
    public long b;

    public d(java.io.InputStream p3)
    {
        super(p3);
        super.b = -1;
        super.a = 1048577;
        return;
    }

    public final int available()
    {
        return ((int) Math.min(((long) this.in.available()), this.a));
    }

    public final declared_synchronized void mark(int p3)
    {
        this.in.mark(p3);
        this.b = this.a;
        return;
    }

    public final int read()
    {
        if (this.a != 0) {
            int v0_3 = this.in.read();
            if (v0_3 != -1) {
                this.a = (this.a - 1);
            }
            return v0_3;
        } else {
            return -1;
        }
    }

    public final int read(byte[] p7, int p8, int p9)
    {
        long v0_0 = this.a;
        if (v0_0 != 0) {
            int v7_1 = this.in.read(p7, p8, ((int) Math.min(((long) p9), v0_0)));
            if (v7_1 != -1) {
                this.a = (this.a - ((long) v7_1));
            }
            return v7_1;
        } else {
            return -1;
        }
    }

    public final declared_synchronized void reset()
    {
        try {
            if (!this.in.markSupported()) {
                throw new java.io.IOException("Mark not supported");
            } else {
                if (this.b == -1) {
                    throw new java.io.IOException("Mark not set");
                } else {
                    this.in.reset();
                    this.a = this.b;
                    return;
                }
            }
        } catch (java.io.IOException v0_4) {
            throw v0_4;
        }
    }

    public final long skip(long p3)
    {
        long v3_2 = this.in.skip(Math.min(p3, this.a));
        this.a = (this.a - v3_2);
        return v3_2;
    }
}
