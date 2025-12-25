package x8;
public final class s implements x8.h0 {
    public final x8.b0 a;
    public final java.util.zip.Inflater b;
    public int c;
    public boolean d;

    public s(x8.b0 p1, java.util.zip.Inflater p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final x8.j0 b()
    {
        return this.a.a.b();
    }

    public final void close()
    {
        if (!this.d) {
            this.b.end();
            this.d = 1;
            this.a.close();
            return;
        } else {
            return;
        }
    }

    public final long t(x8.g p11, long p12)
    {
        kotlin.jvm.internal.j.e(p11, "sink");
        do {
            x8.c0 v2_2 = p12 cmp 0;
            if (v2_2 < null) {
                throw new IllegalArgumentException(v1.a.g(p12, "byteCount < 0: ").toString());
            } else {
                if (this.d) {
                    throw new IllegalStateException("closed");
                } else {
                    long v8_1;
                    x8.b0 v3_1 = this.a;
                    java.util.zip.Inflater v4 = this.b;
                    if (v2_2 != null) {
                        x8.c0 v2_1 = p11.J(1);
                        x8.c0 v5_4 = ((int) Math.min(p12, ((long) (8192 - v2_1.c))));
                        if (v4.needsInput()) {
                            if (!v3_1.h()) {
                                int v6_3 = v3_1.b.a;
                                kotlin.jvm.internal.j.b(v6_3);
                                long v8_0 = v6_3.b;
                                int v7_1 = (v6_3.c - v8_0);
                                this.c = v7_1;
                                v4.setInput(v6_3.a, v8_0, v7_1);
                            } else {
                            }
                        } else {
                        }
                        x8.c0 v5_5 = v4.inflate(v2_1.a, v2_1.c, v5_4);
                        int v6_6 = this.c;
                        if (v6_6 != 0) {
                            int v6_7 = (v6_6 - v4.getRemaining());
                            this.c = (this.c - v6_7);
                            v3_1.skip(((long) v6_7));
                        } else {
                        }
                        if (v5_5 <= null) {
                            if (v2_1.b != v2_1.c) {
                                v8_1 = 0;
                            } else {
                                p11.a = v2_1.a();
                                x8.d0.a(v2_1);
                            }
                        } else {
                            v2_1.c = (v2_1.c + v5_5);
                            v8_1 = ((long) v5_5);
                            p11.b = (p11.b + v8_1);
                        }
                    }
                    if (v8_1 <= 0) {
                        if ((!v4.finished()) && (!v4.needsDictionary())) {
                        } else {
                            return -1;
                        }
                    } else {
                        return v8_1;
                    }
                }
            }
        } while(v3_1.h());
        throw new java.io.EOFException("source exhausted prematurely");
    }
}
