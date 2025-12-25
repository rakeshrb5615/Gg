package x8;
public final class f extends java.io.InputStream {
    public final synthetic int a;
    public final synthetic x8.i b;

    public synthetic f(x8.i p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    private final void c()
    {
        return;
    }

    public final int available()
    {
        int v0_7;
        switch (this.a) {
            case 0:
                v0_7 = Math.min(((x8.g) this.b).b, ((long) 2147483647));
                break;
            default:
                int v0_1 = ((x8.b0) this.b);
                if (v0_1.c) {
                    throw new java.io.IOException("closed");
                } else {
                    v0_7 = Math.min(v0_1.b.b, ((long) 2147483647));
                }
        }
        return ((int) v0_7);
    }

    public final void close()
    {
        switch (this.a) {
            case 0:
                break;
            default:
                ((x8.b0) this.b).close();
        }
        return;
    }

    public final int read()
    {
        switch (this.a) {
            case 0:
                int v0_2;
                int v0_9 = ((x8.g) this.b);
                if (v0_9.b <= 0) {
                    v0_2 = -1;
                } else {
                    v0_2 = (v0_9.readByte() & 255);
                }
                return v0_2;
            default:
                int v0_4 = ((x8.b0) this.b);
                String v1_0 = v0_4.b;
                if (v0_4.c) {
                    throw new java.io.IOException("closed");
                } else {
                    if ((v1_0.b != 0) || (v0_4.a.t(v1_0, 8192) != -1)) {
                        int v0_12 = (v1_0.readByte() & 255);
                    } else {
                        v0_12 = -1;
                    }
                    return v0_12;
                }
        }
    }

    public final int read(byte[] p10, int p11, int p12)
    {
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.j.e(p10, "sink");
                return ((x8.g) this.b).read(p10, p11, p12);
            default:
                kotlin.jvm.internal.j.e(p10, "data");
                long v0_2 = ((x8.b0) this.b);
                x8.g v1 = v0_2.b;
                if (v0_2.c) {
                    throw new java.io.IOException("closed");
                } else {
                    int v10_3;
                    x8.b.e(((long) p10.length), ((long) p11), ((long) p12));
                    if ((v1.b != 0) || (v0_2.a.t(v1, 8192) != -1)) {
                        v10_3 = v1.read(p10, p11, p12);
                    } else {
                        v10_3 = -1;
                    }
                    return v10_3;
                }
        }
    }

    public final String toString()
    {
        switch (this.a) {
            case 0:
                String v0_6 = new StringBuilder();
                v0_6.append(((x8.g) this.b));
                v0_6.append(".inputStream()");
                return v0_6.toString();
            default:
                String v0_3 = new StringBuilder();
                v0_3.append(((x8.b0) this.b));
                v0_3.append(".inputStream()");
                return v0_3.toString();
        }
    }

    public long transferTo(java.io.OutputStream p15)
    {
        switch (this.a) {
            case 1:
                kotlin.jvm.internal.j.e(p15, "out");
                String v1_4 = ((x8.b0) this.b);
                x8.g v2 = v1_4.b;
                if (v1_4.c) {
                    throw new java.io.IOException("closed");
                } else {
                    long v3_0 = 0;
                    long v5 = 0;
                    while ((v2.b != v3_0) || (v1_4.a.t(v2, 8192) != -1)) {
                        long v8_1 = v2.b;
                        v5 += v8_1;
                        x8.b.e(v8_1, 0, v8_1);
                        x8.c0 v7_5 = v2.a;
                        while (v8_1 > v3_0) {
                            kotlin.jvm.internal.j.b(v7_5);
                            int v10_6 = ((int) Math.min(v8_1, ((long) (v7_5.c - v7_5.b))));
                            p15.write(v7_5.a, v7_5.b, v10_6);
                            int v11_3 = (v7_5.b + v10_6);
                            v7_5.b = v11_3;
                            long v3_1 = ((long) v10_6);
                            v2.b = (v2.b - v3_1);
                            v8_1 -= v3_1;
                            if (v11_3 == v7_5.c) {
                                long v3_3 = v7_5.a();
                                v2.a = v3_3;
                                x8.d0.a(v7_5);
                                v7_5 = v3_3;
                            }
                            v3_0 = 0;
                        }
                    }
                    return v5;
                }
            default:
                return super.transferTo(p15);
        }
    }
}
