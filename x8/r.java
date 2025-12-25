package x8;
public final class r implements x8.h0 {
    public byte a;
    public final x8.b0 b;
    public final java.util.zip.Inflater c;
    public final x8.s d;
    public final java.util.zip.CRC32 e;

    public r(x8.i p3)
    {
        kotlin.jvm.internal.j.e(p3, "source");
        x8.b0 v0_2 = new x8.b0(p3);
        this.b = v0_2;
        java.util.zip.CRC32 v3_4 = new java.util.zip.Inflater(1);
        this.c = v3_4;
        this.d = new x8.s(v0_2, v3_4);
        this.e = new java.util.zip.CRC32();
        return;
    }

    public static void c(int p2, int p3, String p4)
    {
        if (p3 != p2) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append(p4);
            v1_1.append(": actual 0x");
            v1_1.append(b8.i.C0(8, x8.b.i(p3)));
            v1_1.append(" != expected 0x");
            v1_1.append(b8.i.C0(8, x8.b.i(p2)));
            throw new java.io.IOException(v1_1.toString());
        } else {
            return;
        }
    }

    public final x8.j0 b()
    {
        return this.b.a.b();
    }

    public final void close()
    {
        this.d.close();
        return;
    }

    public final void f(x8.g p5, long p6, long p8)
    {
        x8.c0 v5_1 = p5.a;
        kotlin.jvm.internal.j.b(v5_1);
        while(true) {
            long v0_0 = v5_1.c;
            int v1 = v5_1.b;
            if (p6 < ((long) (v0_0 - v1))) {
                break;
            }
            p6 -= ((long) (v0_0 - v1));
            v5_1 = v5_1.f;
            kotlin.jvm.internal.j.b(v5_1);
        }
        while (p8 > 0) {
            long v6_1 = ((int) (((long) v5_1.b) + p6));
            int v7_2 = ((int) Math.min(((long) (v5_1.c - v6_1)), p8));
            this.e.update(v5_1.a, v6_1, v7_2);
            p8 -= ((long) v7_2);
            v5_1 = v5_1.f;
            kotlin.jvm.internal.j.b(v5_1);
            p6 = 0;
        }
        return;
    }

    public final long t(x8.g p24, long p25)
    {
        x8.r v0_0 = this;
        kotlin.jvm.internal.j.e(p24, "sink");
        String v3_4 = p25 cmp 0;
        if (v3_4 < null) {
            throw new IllegalArgumentException(v1.a.g(p25, "byteCount < 0: ").toString());
        } else {
            if (v3_4 != null) {
                java.util.zip.CRC32 v9 = this.e;
                x8.b0 v11 = this.b;
                if (this.a == 0) {
                    int v20;
                    v11.o(10);
                    short v1_18 = v11.b;
                    byte v19 = v1_18.A(3);
                    if (((v19 >> 1) & 1) != 1) {
                        v20 = 0;
                    } else {
                        v20 = 1;
                    }
                    if (v20 != 0) {
                        this.f(v1_18, 0, 10);
                    }
                    x8.r.c(8075, v11.readShort(), "ID1ID2");
                    v11.skip(8);
                    if (((v19 >> 2) & 1) == 1) {
                        v11.o(2);
                        if (v20 != 0) {
                            this.f(v1_18, 0, 2);
                        }
                        long v4_4 = ((long) (v1_18.E() & 65535));
                        v11.o(v4_4);
                        if (v20 != 0) {
                            this.f(v1_18, 0, v4_4);
                        }
                        v11.skip(v4_4);
                    }
                    if (((v19 >> 3) & 1) == 1) {
                        long v12_3 = v11.c(0, 0, 9223372036854775807);
                        if (v12_3 == -1) {
                            throw new java.io.EOFException();
                        } else {
                            if (v20 != 0) {
                                this.f(v1_18, 0, (v12_3 + 1));
                            }
                            v11.skip((v12_3 + 1));
                        }
                    }
                    if (((v19 >> 4) & 1) != 1) {
                        v0_0 = this;
                    } else {
                        long v12_6 = v11.c(0, 0, 9223372036854775807);
                        if (v12_6 == -1) {
                            throw new java.io.EOFException();
                        } else {
                            if (v20 == 0) {
                                v0_0 = this;
                            } else {
                                v0_0 = this;
                                this.f(v1_18, 0, (v12_6 + 1));
                            }
                            v11.skip((v12_6 + 1));
                        }
                    }
                    if (v20 != 0) {
                        x8.r.c(v11.s(), ((short) ((int) v9.getValue())), "FHCRC");
                        v9.reset();
                    }
                    v0_0.a = 1;
                }
                if (v0_0.a == 1) {
                    short v2_5 = p24.b;
                    long v4_1 = v0_0.d.t(p24, p25);
                    if (v4_1 == -1) {
                        v0_0.a = 2;
                    } else {
                        v0_0.f(p24, v2_5, v4_1);
                        return v4_1;
                    }
                }
                if (v0_0.a == 2) {
                    x8.r.c(v11.f(), ((int) v9.getValue()), "CRC");
                    x8.r.c(v11.f(), ((int) v0_0.c.getBytesWritten()), "ISIZE");
                    v0_0.a = 3;
                    if (!v11.h()) {
                        throw new java.io.IOException("gzip finished without exhausting source");
                    }
                }
                return -1;
            } else {
                return 0;
            }
        }
    }
}
