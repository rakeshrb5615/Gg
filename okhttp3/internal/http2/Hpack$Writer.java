package okhttp3.internal.http2;
public final class Hpack$Writer {
    public final x8.g a;
    public int b;
    public boolean c;
    public int d;
    public okhttp3.internal.http2.Header[] e;
    public int f;
    public int g;
    public int h;

    public Hpack$Writer(x8.g p1)
    {
        this.a = p1;
        this.b = 2147483647;
        this.d = 4096;
        int v1_4 = new okhttp3.internal.http2.Header[8];
        this.e = v1_4;
        this.f = 7;
        return;
    }

    public final void a(int p5)
    {
        if (p5 > 0) {
            int v0_5 = (this.e.length - 1);
            int v1 = 0;
            while(true) {
                int v2_8 = this.f;
                if ((v0_5 < v2_8) || (p5 <= 0)) {
                    break;
                }
                int v2_2 = this.e[v0_5];
                kotlin.jvm.internal.j.b(v2_2);
                p5 -= v2_2.c;
                int v2_4 = this.h;
                int v3_3 = this.e[v0_5];
                kotlin.jvm.internal.j.b(v3_3);
                this.h = (v2_4 - v3_3.c);
                this.g = (this.g - 1);
                v1++;
                v0_5--;
            }
            int v2_9 = (v2_8 + 1);
            System.arraycopy(this.e, v2_9, this.e, (v2_9 + v1), this.g);
            int v0_3 = (this.f + 1);
            java.util.Arrays.fill(this.e, v0_3, (v0_3 + v1), 0);
            this.f = (this.f + v1);
        }
        return;
    }

    public final void b(okhttp3.internal.http2.Header p7)
    {
        int v0_0 = p7.c;
        int v1_0 = this.d;
        if (v0_0 <= v1_0) {
            this.a(((this.h + v0_0) - v1_0));
            okhttp3.internal.http2.Header[] v3_0 = this.e;
            if ((this.g + 1) > v3_0.length) {
                int v1_3 = new okhttp3.internal.http2.Header[(v3_0.length * 2)];
                System.arraycopy(v3_0, 0, v1_3, v3_0.length, v3_0.length);
                this.f = (this.e.length - 1);
                this.e = v1_3;
            }
            int v1_4 = this.f;
            this.f = (v1_4 - 1);
            this.e[v1_4] = p7;
            this.g = (this.g + 1);
            this.h = (this.h + v0_0);
            return;
        } else {
            int v7_5 = this.e;
            i7.h.d0(v7_5, 0, v7_5.length);
            this.f = (this.e.length - 1);
            this.g = 0;
            this.h = 0;
            return;
        }
    }

    public final void c(x8.j p12)
    {
        kotlin.jvm.internal.j.e(p12, "data");
        okhttp3.internal.http2.Huffman.a.getClass();
        int v1_4 = 0;
        int v3_2 = 0;
        x8.g v5_2 = 0;
        int v4_4 = 0;
        while (v4_4 < p12.d()) {
            v5_2 += ((long) okhttp3.internal.http2.Huffman.c[(p12.i(v4_4) & 255)]);
            v4_4++;
        }
        x8.g v5_1 = this.a;
        if (((int) ((v5_2 + ((long) 7)) >> 3)) >= p12.d()) {
            this.e(p12.d(), 127, 0);
            v5_1.K(p12);
            return;
        } else {
            int v0_7 = new x8.g();
            okhttp3.internal.http2.Huffman.a.getClass();
            int v4_3 = p12.d();
            int v7_1 = 0;
            while (v3_2 < v4_3) {
                int v8_1 = (p12.i(v3_2) & 255);
                int v8_2 = okhttp3.internal.http2.Huffman.c[v8_1];
                v1_4 = ((v1_4 << v8_2) | ((long) okhttp3.internal.http2.Huffman.b[v8_1]));
                v7_1 += v8_2;
                while (v7_1 >= 8) {
                    v7_1 -= 8;
                    v0_7.M(((int) (v1_4 >> v7_1)));
                }
                v3_2++;
            }
            if (v7_1 > 0) {
                v0_7.M(((int) ((v1_4 << (8 - v7_1)) | (255 >> v7_1))));
            }
            x8.j v12_3 = v0_7.e(v0_7.b);
            this.e(v12_3.d(), 127, 128);
            v5_1.K(v12_3);
            return;
        }
    }

    public final void d(java.util.ArrayList p14)
    {
        if (this.c) {
            int v0_4 = this.b;
            if (v0_4 < this.d) {
                this.e(v0_4, 31, 32);
            }
            this.c = 0;
            this.b = 2147483647;
            this.e(this.d, 31, 32);
        }
        int v0_3 = p14.size();
        int v2_0 = 0;
        while (v2_0 < v0_3) {
            int v8_0;
            int v6_5;
            int v3_3 = ((okhttp3.internal.http2.Header) p14.get(v2_0));
            int v4_4 = v3_3.a.q();
            x8.j v5 = v3_3.b;
            okhttp3.internal.http2.Hpack.a.getClass();
            int v6_4 = ((Integer) okhttp3.internal.http2.Hpack.c.get(v4_4));
            if (v6_4 == 0) {
                v6_5 = -1;
                v8_0 = -1;
            } else {
                int v6_6 = v6_4.intValue();
                v8_0 = (v6_6 + 1);
                if ((2 <= v8_0) && (v8_0 < 8)) {
                    int v9_4 = okhttp3.internal.http2.Hpack.b;
                    if (!kotlin.jvm.internal.j.a(v9_4[v6_6].b, v5)) {
                        if (kotlin.jvm.internal.j.a(v9_4[v8_0].b, v5)) {
                            int v12 = v8_0;
                            v8_0 = (v6_6 + 2);
                            v6_5 = v12;
                            if (v8_0 == -1) {
                                int v9_9 = (this.f + 1);
                                int v10_4 = this.e.length;
                                while (v9_9 < v10_4) {
                                    int v11_1 = this.e[v9_9];
                                    kotlin.jvm.internal.j.b(v11_1);
                                    if (kotlin.jvm.internal.j.a(v11_1.a, v4_4)) {
                                        int v11_5 = this.e[v9_9];
                                        kotlin.jvm.internal.j.b(v11_5);
                                        if (!kotlin.jvm.internal.j.a(v11_5.b, v5)) {
                                            if (v6_5 == -1) {
                                                int v6_9 = (v9_9 - this.f);
                                                okhttp3.internal.http2.Hpack.a.getClass();
                                                v6_5 = (v6_9 + okhttp3.internal.http2.Hpack.b.length);
                                            }
                                        } else {
                                            int v9_10 = (v9_9 - this.f);
                                            okhttp3.internal.http2.Hpack.a.getClass();
                                            v8_0 = (okhttp3.internal.http2.Hpack.b.length + v9_10);
                                            break;
                                        }
                                    }
                                    v9_9++;
                                }
                            }
                            if (v8_0 == -1) {
                                if (v6_5 != -1) {
                                    x8.j v7_0 = okhttp3.internal.http2.Header.d;
                                    v4_4.getClass();
                                    kotlin.jvm.internal.j.e(v7_0, "prefix");
                                    if ((!v4_4.l(0, v7_0, v7_0.d())) || (kotlin.jvm.internal.j.a(okhttp3.internal.http2.Header.i, v4_4))) {
                                        this.e(v6_5, 63, 64);
                                        this.c(v5);
                                        this.b(v3_3);
                                    } else {
                                        this.e(v6_5, 15, 0);
                                        this.c(v5);
                                    }
                                } else {
                                    this.a.M(64);
                                    this.c(v4_4);
                                    this.c(v5);
                                    this.b(v3_3);
                                }
                            } else {
                                this.e(v8_0, 127, 128);
                            }
                            v2_0++;
                        }
                    } else {
                        v6_5 = v8_0;
                    }
                }
                v6_5 = v8_0;
                v8_0 = -1;
            }
        }
        return;
    }

    public final void e(int p2, int p3, int p4)
    {
        x8.g v0 = this.a;
        if (p2 >= p3) {
            v0.M((p4 | p3));
            int v2_1 = (p2 - p3);
            while (v2_1 >= 128) {
                v0.M((128 | (v2_1 & 127)));
                v2_1 >>= 7;
            }
            v0.M(v2_1);
            return;
        } else {
            v0.M((p2 | p4));
            return;
        }
    }
}
