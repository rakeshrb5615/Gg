package x8;
public final class b0 implements x8.i {
    public final x8.h0 a;
    public final x8.g b;
    public boolean c;

    public b0(x8.h0 p2)
    {
        kotlin.jvm.internal.j.e(p2, "source");
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

    public final long c(byte p10, long p11, long p13)
    {
        if (this.c) {
            throw new IllegalStateException("closed");
        } else {
            if (0 > p13) {
                throw new IllegalArgumentException(v1.a.g(p13, "fromIndex=0 toIndex=").toString());
            } else {
                long v3 = 0;
                while (v3 < p13) {
                    x8.g v1 = this.b;
                    String v10_5 = v1.B(p10, v3, p13);
                    if (v10_5 == -1) {
                        String v10_6 = v1.b;
                        if ((v10_6 >= p13) || (this.a.t(v1, 8192) == -1)) {
                            break;
                        }
                        v3 = Math.max(v3, v10_6);
                    } else {
                        return v10_5;
                    }
                }
                return -1;
            }
        }
    }

    public final void close()
    {
        if (!this.c) {
            this.c = 1;
            this.a.close();
            this.b.s();
        }
        return;
    }

    public final x8.j e(long p2)
    {
        this.o(p2);
        return this.b.e(p2);
    }

    public final int f()
    {
        this.o(4);
        return x8.b.g(this.b.readInt());
    }

    public final String g()
    {
        return this.l(9223372036854775807);
    }

    public final boolean h()
    {
        if (this.c) {
            throw new IllegalStateException("closed");
        } else {
            int v0_7 = this.b;
            if ((!v0_7.h()) || (this.a.t(v0_7, 8192) != -1)) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final long i()
    {
        this.o(8);
        long v1_4 = this.b;
        if (v1_4.b < 8) {
            throw new java.io.EOFException();
        } else {
            long v1_6;
            long v2_0 = v1_4.a;
            kotlin.jvm.internal.j.b(v2_0);
            x8.c0 v3_7 = v2_0.b;
            long v6_19 = v2_0.c;
            if (((long) (v6_19 - v3_7)) >= 8) {
                long v7_3 = v2_0.a;
                long v12 = 255;
                x8.c0 v3_8 = (v3_7 + 8);
                long v4_10 = (((((((((((long) v7_3[(v3_7 + 1)]) & v12) << 48) | ((((long) v7_3[v3_7]) & 255) << 56)) | ((((long) v7_3[(v3_7 + 2)]) & 255) << 40)) | ((((long) v7_3[(v3_7 + 3)]) & v12) << 32)) | ((((long) v7_3[(v3_7 + 4)]) & 255) << 24)) | ((((long) v7_3[(v3_7 + 5)]) & 255) << 16)) | ((((long) v7_3[(v3_7 + 6)]) & 255) << 8)) | (((long) v7_3[(v3_7 + 7)]) & v12));
                v1_4.b = (v1_4.b - 8);
                if (v3_8 != v6_19) {
                    v2_0.b = v3_8;
                } else {
                    v1_4.a = v2_0.a();
                    x8.d0.a(v2_0);
                }
                v1_6 = v4_10;
            } else {
                v1_6 = (((((long) v1_4.readInt()) & 4294967295) << 32) | (4294967295 & ((long) v1_4.readInt())));
            }
            return (((v1_6 & 255) << 56) | ((((((((-72057594037927936 & v1_6) >> 56) | ((71776119061217280 & v1_6) >> 40)) | ((280375465082880 & v1_6) >> 24)) | ((1095216660480 & v1_6) >> 8)) | ((4278190080 & v1_6) << 8)) | ((16711680 & v1_6) << 24)) | ((65280 & v1_6) << 40)));
        }
    }

    public final boolean isOpen()
    {
        return (this.c ^ 1);
    }

    public final String l(long p19)
    {
        if (p19 < 0) {
            throw new IllegalArgumentException(v1.a.g(p19, "limit < 0: ").toString());
        } else {
            long v4;
            if (p19 != 9223372036854775807) {
                v4 = (p19 + 1);
            } else {
                v4 = 9223372036854775807;
            }
            String v1_2 = this.c(10, 0, v4);
            x8.g v12_1 = this.b;
            if (v1_2 == -1) {
                if ((v4 >= 9223372036854775807) || ((!this.request(v4)) || ((v12_1.A((v4 - 1)) != 13) || ((!this.request((v4 + 1))) || (v12_1.A(v4) != 10))))) {
                    x8.g v13_1 = new x8.g();
                    v12_1.z(v13_1, 0, Math.min(((long) 32), v12_1.b));
                    int v2_5 = new StringBuilder("\\n not found: limit=");
                    v2_5.append(Math.min(v12_1.b, p19));
                    v2_5.append(" content=");
                    v2_5.append(v13_1.e(v13_1.b).e());
                    v2_5.append(8230);
                    throw new java.io.EOFException(v2_5.toString());
                } else {
                    return y8.a.b(v12_1, v4);
                }
            } else {
                return y8.a.b(v12_1, v1_2);
            }
        }
    }

    public final int m(x8.x p7)
    {
        kotlin.jvm.internal.j.e(p7, "options");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        do {
            x8.g v1 = this.b;
            long v0_1 = y8.a.c(v1, p7, 1);
            if (v0_1 == -2) {
            } else {
                if (v0_1 == -1) {
                    break;
                }
                v1.skip(((long) p7.a[v0_1].d()));
                return v0_1;
            }
        } while(this.a.t(v1, 8192) != -1);
        return -1;
    }

    public final void o(long p1)
    {
        if (!this.request(p1)) {
            throw new java.io.EOFException();
        } else {
            return;
        }
    }

    public final long p(x8.g p11)
    {
        long v2 = 0;
        do {
            x8.g v7 = this.b;
            if (this.a.t(v7, 8192) == -1) {
                long v4_0 = v7.b;
                if (v4_0 > 0) {
                    v2 += v4_0;
                    p11.k(v7, v4_0);
                }
                return v2;
            } else {
                long v4_1 = v7.y();
            }
        } while(v4_1 <= 0);
        v2 += v4_1;
        p11.k(v7, v4_1);
    }

    public final int read(java.nio.ByteBuffer p6)
    {
        kotlin.jvm.internal.j.e(p6, "sink");
        x8.g v0_1 = this.b;
        if ((v0_1.b != 0) || (this.a.t(v0_1, 8192) != -1)) {
            return v0_1.read(p6);
        } else {
            return -1;
        }
    }

    public final byte readByte()
    {
        this.o(1);
        return this.b.readByte();
    }

    public final int readInt()
    {
        this.o(4);
        return this.b.readInt();
    }

    public final short readShort()
    {
        this.o(2);
        return this.b.readShort();
    }

    public final boolean request(long p5)
    {
        if (p5 < 0) {
            throw new IllegalArgumentException(v1.a.g(p5, "byteCount < 0: ").toString());
        } else {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            do {
                long v0_3 = this.b;
                if (v0_3.b >= p5) {
                    return 1;
                } else {
                }
            } while(this.a.t(v0_3, 8192) != -1);
            return 0;
        }
    }

    public final short s()
    {
        this.o(2);
        return this.b.E();
    }

    public final void skip(long p6)
    {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (p6 > 0) {
            x8.g v2_0 = this.b;
            if ((v2_0.b == 0) && (this.a.t(v2_0, 8192) == -1)) {
                throw new java.io.EOFException();
            } else {
                long v0_6 = Math.min(p6, v2_0.b);
                v2_0.skip(v0_6);
                p6 -= v0_6;
            }
        }
        return;
    }

    public final long t(x8.g p7, long p8)
    {
        kotlin.jvm.internal.j.e(p7, "sink");
        long v2 = p8 cmp 0;
        if (v2 < 0) {
            throw new IllegalArgumentException(v1.a.g(p8, "byteCount < 0: ").toString());
        } else {
            if (this.c) {
                throw new IllegalStateException("closed");
            } else {
                x8.g v3_1 = this.b;
                if (v3_1.b == 0) {
                    if (v2 != 0) {
                        if (this.a.t(v3_1, 8192) == -1) {
                            return -1;
                        }
                    } else {
                        return 0;
                    }
                }
                return v3_1.t(p7, Math.min(p8, v3_1.b));
            }
        }
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("buffer(");
        v0_1.append(this.a);
        v0_1.append(41);
        return v0_1.toString();
    }

    public final long u()
    {
        this.o(1);
        NumberFormatException v0_1 = 0;
        while(true) {
            String v1_1 = (v0_1 + 1);
            x8.g v3 = this.b;
            if (this.request(((long) v1_1))) {
                String v2_0 = v3.A(((long) v0_1));
                if (((v2_0 < 48) || (v2_0 > 57)) && (((v2_0 < 97) || (v2_0 > 102)) && ((v2_0 < 65) || (v2_0 > 70)))) {
                    break;
                }
                v0_1 = v1_1;
            }
            return v3.u();
        }
        if (v0_1 == null) {
            a.a.j(16);
            String v1_2 = Integer.toString(v2_0, 16);
            kotlin.jvm.internal.j.d(v1_2, "toString(...)");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(v1_2));
        }
        return v3.u();
    }

    public final String v(java.nio.charset.Charset p3)
    {
        kotlin.jvm.internal.j.e(p3, "charset");
        x8.g v1 = this.b;
        v1.L(this.a);
        return v1.v(p3);
    }

    public final java.io.InputStream w()
    {
        return new x8.f(this, 1);
    }

    public final String x(long p3)
    {
        this.o(p3);
        x8.g v0 = this.b;
        v0.getClass();
        return v0.F(p3, b8.a.a);
    }
}
