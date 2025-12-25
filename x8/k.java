package x8;
public final class k implements x8.f0 {
    public final x8.a0 a;
    public final java.util.zip.Deflater b;
    public boolean c;

    public k(x8.a0 p1, java.util.zip.Deflater p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final x8.j0 b()
    {
        return this.a.a.b();
    }

    public final void c(boolean p9)
    {
        int v0_0 = this.a;
        String v1_0 = v0_0.b;
        do {
            boolean v3_0;
            long v2_2 = v1_0.J(1);
            boolean v3_2 = v2_2.a;
            long v4_4 = this.b;
            if (p9 == null) {
                int v5_1 = v2_2.c;
                v3_0 = v4_4.deflate(v3_2, v5_1, (8192 - v5_1));
            } else {
                int v5_0 = v2_2.c;
                v3_0 = v4_4.deflate(v3_2, v5_0, (8192 - v5_0), 2);
            }
            if (v3_0) {
            } else {
                v2_2.c = (v2_2.c + v3_0);
                v1_0.b = (v1_0.b + ((long) v3_0));
                v0_0.c();
            }
        } while(!v4_4.needsInput());
        if (v2_2.b == v2_2.c) {
            v1_0.a = v2_2.a();
            x8.d0.a(v2_2);
        }
        return;
    }

    public final void close()
    {
        int v0_0 = this.b;
        if (!this.c) {
            try {
                v0_0.finish();
                this.c(0);
                int v1_1 = 0;
                try {
                    v0_0.end();
                    try {
                        this.a.close();
                    } catch (int v0_2) {
                        if (v1_1 != 0) {
                        } else {
                            v1_1 = v0_2;
                        }
                    }
                    this.c = 1;
                    if (v1_1 != 0) {
                        throw v1_1;
                    }
                } catch (int v0_4) {
                    if (v1_1 != 0) {
                    } else {
                        v1_1 = v0_4;
                    }
                }
            } catch (int v1_1) {
            }
        }
        return;
    }

    public final void flush()
    {
        this.c(1);
        this.a.flush();
        return;
    }

    public final void k(x8.g p7, long p8)
    {
        x8.b.e(p7.b, 0, p8);
        while(true) {
            x8.c0 v1_5 = this.b;
            if (p8 <= 0) {
                break;
            }
            x8.c0 v0_1 = p7.a;
            kotlin.jvm.internal.j.b(v0_1);
            int v3_4 = ((int) Math.min(p8, ((long) (v0_1.c - v0_1.b))));
            v1_5.setInput(v0_1.a, v0_1.b, v3_4);
            this.c(0);
            long v4_3 = ((long) v3_4);
            p7.b = (p7.b - v4_3);
            x8.c0 v1_3 = (v0_1.b + v3_4);
            v0_1.b = v1_3;
            if (v1_3 == v0_1.c) {
                p7.a = v0_1.a();
                x8.d0.a(v0_1);
            }
            p8 -= v4_3;
        }
        v1_5.setInput(y8.b.b, 0, 0);
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("DeflaterSink(");
        v0_1.append(this.a);
        v0_1.append(41);
        return v0_1.toString();
    }
}
