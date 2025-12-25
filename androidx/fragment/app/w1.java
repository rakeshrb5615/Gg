package androidx.fragment.app;
public final class w1 extends java.io.Writer {
    public final synthetic int a;
    public final StringBuilder b;
    public final CharSequence c;

    public w1()
    {
        this.a = 0;
        this.b = new StringBuilder(128);
        this.c = "FragmentManager";
        return;
    }

    public w1(StringBuilder p2)
    {
        this.a = 1;
        this.c = new y6.q();
        this.b = p2;
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

    public java.io.Writer append(CharSequence p2)
    {
        switch (this.a) {
            case 1:
                this.b.append(p2);
                return this;
            default:
                return super.append(p2);
        }
    }

    public java.io.Writer append(CharSequence p2, int p3, int p4)
    {
        switch (this.a) {
            case 1:
                this.b.append(p2, p3, p4);
                return this;
            default:
                return super.append(p2, p3, p4);
        }
    }

    public Appendable append(CharSequence p2)
    {
        switch (this.a) {
            case 1:
                this.b.append(p2);
                return this;
            default:
                return super.append(p2);
        }
    }

    public Appendable append(CharSequence p2, int p3, int p4)
    {
        switch (this.a) {
            case 1:
                this.b.append(p2, p3, p4);
                return this;
            default:
                return super.append(p2, p3, p4);
        }
    }

    public final void close()
    {
        switch (this.a) {
            case 0:
                this.i();
                return;
            default:
                return;
        }
    }

    public final void flush()
    {
        switch (this.a) {
            case 0:
                this.i();
                return;
            default:
                return;
        }
    }

    public void i()
    {
        StringBuilder v0 = this.b;
        if (v0.length() > 0) {
            android.util.Log.d(((String) this.c), v0.toString());
            v0.delete(0, v0.length());
        }
        return;
    }

    public void write(int p2)
    {
        switch (this.a) {
            case 1:
                this.b.append(((char) p2));
                return;
            default:
                super.write(p2);
                return;
        }
    }

    public void write(String p2, int p3, int p4)
    {
        switch (this.a) {
            case 1:
                java.util.Objects.requireNonNull(p2);
                this.b.append(p2, p3, (p4 + p3));
                return;
            default:
                super.write(p2, p3, p4);
                return;
        }
    }

    public final void write(char[] p4, int p5, int p6)
    {
        switch (this.a) {
            case 0:
                int v0_1 = 0;
                while (v0_1 < p6) {
                    StringBuilder v1_1 = p4[(p5 + v0_1)];
                    if (v1_1 != 10) {
                        this.b.append(v1_1);
                    } else {
                        this.i();
                    }
                    v0_1++;
                }
                return;
            default:
                int v0_3 = ((y6.q) this.c);
                v0_3.a = p4;
                v0_3.b = 0;
                this.b.append(v0_3, p5, (p6 + p5));
                return;
        }
    }
}
