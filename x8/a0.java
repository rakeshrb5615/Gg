package x8;
public final class a0 implements x8.h {
    public final x8.f0 a;
    public final x8.g b;
    public boolean c;

    public a0(x8.f0 p2)
    {
        kotlin.jvm.internal.j.e(p2, "sink");
        this.a = p2;
        this.b = new x8.g();
        return;
    }

    public final x8.g a()
    {
        return this.b;
    }

    public final x8.j0 b()
    {
        return this.a.b();
    }

    public final x8.h c()
    {
        if (this.c) {
            throw new IllegalStateException("closed");
        } else {
            IllegalStateException v0_3 = this.b;
            String v1_1 = v0_3.y();
            if (v1_1 > 0) {
                this.a.k(v0_3, v1_1);
            }
            return this;
        }
    }

    public final void close()
    {
        int v0_0 = this.a;
        if (!this.c) {
            try {
                int v1_2 = this.b;
                long v2 = v1_2.b;
            } catch (int v1_1) {
                try {
                    v0_0.close();
                } catch (int v0_1) {
                    if (v1_1 != 0) {
                    } else {
                        v1_1 = v0_1;
                    }
                }
                this.c = 1;
                if (v1_1 != 0) {
                    throw v1_1;
                }
            }
            if (v2 > 0) {
                v0_0.k(v1_2, v2);
            }
            v1_1 = 0;
        }
        return;
    }

    public final x8.h d(long p2)
    {
        if (this.c) {
            throw new IllegalStateException("closed");
        } else {
            this.b.O(p2);
            this.c();
            return this;
        }
    }

    public final void flush()
    {
        if (this.c) {
            throw new IllegalStateException("closed");
        } else {
            IllegalStateException v0_3 = this.b;
            String v1_1 = v0_3.b;
            x8.f0 v4 = this.a;
            if (v1_1 > 0) {
                v4.k(v0_3, v1_1);
            }
            v4.flush();
            return;
        }
    }

    public final boolean isOpen()
    {
        return (this.c ^ 1);
    }

    public final x8.h j(x8.j p2)
    {
        kotlin.jvm.internal.j.e(p2, "byteString");
        if (this.c) {
            throw new IllegalStateException("closed");
        } else {
            this.b.K(p2);
            this.c();
            return this;
        }
    }

    public final void k(x8.g p2, long p3)
    {
        kotlin.jvm.internal.j.e(p2, "source");
        if (this.c) {
            throw new IllegalStateException("closed");
        } else {
            this.b.k(p2, p3);
            this.c();
            return;
        }
    }

    public final x8.h n(int p3, byte[] p4)
    {
        if (this.c) {
            throw new IllegalStateException("closed");
        } else {
            this.b.write(p4, 0, p3);
            this.c();
            return this;
        }
    }

    public final x8.h q(String p2)
    {
        kotlin.jvm.internal.j.e(p2, "string");
        if (this.c) {
            throw new IllegalStateException("closed");
        } else {
            this.b.S(p2);
            this.c();
            return this;
        }
    }

    public final java.io.OutputStream r()
    {
        return new a1.n1(this, 2);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("buffer(");
        v0_1.append(this.a);
        v0_1.append(41);
        return v0_1.toString();
    }

    public final int write(java.nio.ByteBuffer p2)
    {
        kotlin.jvm.internal.j.e(p2, "source");
        if (this.c) {
            throw new IllegalStateException("closed");
        } else {
            IllegalStateException v2_1 = this.b.write(p2);
            this.c();
            return v2_1;
        }
    }

    public final x8.h write(byte[] p4)
    {
        kotlin.jvm.internal.j.e(p4, "source");
        if (this.c) {
            throw new IllegalStateException("closed");
        } else {
            this.b.write(p4, 0, p4.length);
            this.c();
            return this;
        }
    }

    public final x8.h writeByte(int p2)
    {
        if (this.c) {
            throw new IllegalStateException("closed");
        } else {
            this.b.M(p2);
            this.c();
            return this;
        }
    }

    public final x8.h writeInt(int p2)
    {
        if (this.c) {
            throw new IllegalStateException("closed");
        } else {
            this.b.P(p2);
            this.c();
            return this;
        }
    }

    public final x8.h writeShort(int p2)
    {
        if (this.c) {
            throw new IllegalStateException("closed");
        } else {
            this.b.Q(p2);
            this.c();
            return this;
        }
    }
}
