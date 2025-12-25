package a1;
public final class n1 extends java.io.OutputStream {
    public final synthetic int a;
    public final Object b;

    public n1(java.io.FileOutputStream p2)
    {
        this.a = 0;
        this.b = p2;
        return;
    }

    public synthetic n1(x8.h p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    private final void c()
    {
        return;
    }

    private final void f()
    {
        return;
    }

    private final void i()
    {
        return;
    }

    public final void close()
    {
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 0:
            case 1:
                break;
            default:
                ((x8.a0) this.b).close();
        }
        return;
    }

    public final void flush()
    {
        switch (this.a) {
            case 0:
                ((java.io.FileOutputStream) this.b).flush();
                return;
            case 1:
                break;
            default:
                java.io.FileOutputStream v0_4 = ((x8.a0) this.b);
                if (v0_4.c) {
                } else {
                    v0_4.flush();
                }
        }
        return;
    }

    public String toString()
    {
        switch (this.a) {
            case 1:
                String v0_3 = new StringBuilder();
                v0_3.append(((x8.g) this.b));
                v0_3.append(".outputStream()");
                return v0_3.toString();
            case 2:
                String v0_7 = new StringBuilder();
                v0_7.append(((x8.a0) this.b));
                v0_7.append(".outputStream()");
                return v0_7.toString();
            default:
                return super.toString();
        }
    }

    public final void write(int p3)
    {
        switch (this.a) {
            case 0:
                ((java.io.FileOutputStream) this.b).write(p3);
                return;
            case 1:
                ((x8.g) this.b).M(p3);
                return;
            default:
                String v0_2 = ((x8.a0) this.b);
                if (v0_2.c) {
                    throw new java.io.IOException("closed");
                } else {
                    v0_2.b.M(((byte) p3));
                    v0_2.c();
                    return;
                }
        }
    }

    public void write(byte[] p2)
    {
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.j.e(p2, "b");
                ((java.io.FileOutputStream) this.b).write(p2);
                return;
            default:
                super.write(p2);
                return;
        }
    }

    public final void write(byte[] p3, int p4, int p5)
    {
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.j.e(p3, "bytes");
                ((java.io.FileOutputStream) this.b).write(p3, p4, p5);
                return;
            case 1:
                kotlin.jvm.internal.j.e(p3, "data");
                ((x8.g) this.b).write(p3, p4, p5);
                return;
            default:
                kotlin.jvm.internal.j.e(p3, "data");
                x8.g v0_5 = ((x8.a0) this.b);
                if (v0_5.c) {
                    throw new java.io.IOException("closed");
                } else {
                    v0_5.b.write(p3, p4, p5);
                    v0_5.c();
                    return;
                }
        }
    }
}
