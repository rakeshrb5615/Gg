package okhttp3.internal.http2;
public final class Hpack$Reader {
    public int a;
    public final java.util.ArrayList b;
    public final x8.b0 c;
    public okhttp3.internal.http2.Header[] d;
    public int e;
    public int f;
    public int g;

    public Hpack$Reader(okhttp3.internal.http2.Http2Reader$ContinuationSource p2)
    {
        this.a = 4096;
        this.b = new java.util.ArrayList();
        this.c = x8.b.c(p2);
        int v2_1 = new okhttp3.internal.http2.Header[8];
        this.d = v2_1;
        this.e = 7;
        return;
    }

    public final int a(int p5)
    {
        int v0 = 0;
        if (p5 > 0) {
            int v1_2 = (this.d.length - 1);
            while(true) {
                int v2_7 = this.e;
                if ((v1_2 < v2_7) || (p5 <= 0)) {
                    break;
                }
                int v2_3 = this.d[v1_2];
                kotlin.jvm.internal.j.b(v2_3);
                int v2_4 = v2_3.c;
                p5 -= v2_4;
                this.g = (this.g - v2_4);
                this.f = (this.f - 1);
                v0++;
                v1_2--;
            }
            System.arraycopy(this.d, (v2_7 + 1), this.d, ((v2_7 + 1) + v0), this.f);
            this.e = (this.e + v0);
        }
        return v0;
    }

    public final x8.j b(int p4)
    {
        if (p4 >= null) {
            java.io.IOException v0_0 = okhttp3.internal.http2.Hpack.a;
            v0_0.getClass();
            StringBuilder v1_5 = okhttp3.internal.http2.Hpack.b;
            if (p4 <= (v1_5.length - 1)) {
                v0_0.getClass();
                return v1_5[p4].a;
            }
        }
        okhttp3.internal.http2.Hpack.a.getClass();
        StringBuilder v1_2 = ((this.e + 1) + (p4 - okhttp3.internal.http2.Hpack.b.length));
        if (v1_2 >= null) {
            java.io.IOException v0_3 = this.d;
            if (v1_2 < v0_3.length) {
                x8.j v4_3 = v0_3[v1_2];
                kotlin.jvm.internal.j.b(v4_3);
                return v4_3.a;
            }
        }
        StringBuilder v1_4 = new StringBuilder("Header index too large ");
        v1_4.append((p4 + 1));
        throw new java.io.IOException(v1_4.toString());
    }

    public final void c(okhttp3.internal.http2.Header p7)
    {
        this.b.add(p7);
        int v0_1 = p7.c;
        int v1_6 = this.a;
        if (v0_1 <= v1_6) {
            this.a(((this.g + v0_1) - v1_6));
            okhttp3.internal.http2.Header[] v3_0 = this.d;
            if ((this.f + 1) > v3_0.length) {
                int v1_4 = new okhttp3.internal.http2.Header[(v3_0.length * 2)];
                System.arraycopy(v3_0, 0, v1_4, v3_0.length, v3_0.length);
                this.e = (this.d.length - 1);
                this.d = v1_4;
            }
            int v1_5 = this.e;
            this.e = (v1_5 - 1);
            this.d[v1_5] = p7;
            this.f = (this.f + 1);
            this.g = (this.g + v0_1);
            return;
        } else {
            int v7_5 = this.d;
            i7.h.d0(v7_5, 0, v7_5.length);
            this.e = (this.d.length - 1);
            this.f = 0;
            this.g = 0;
            return;
        }
    }

    public final x8.j d()
    {
        x8.g v1_0;
        int v0_0 = this.c;
        x8.g v1_2 = v0_0.readByte();
        int v4_1 = 0;
        if ((v1_2 & 128) != 128) {
            v1_0 = 0;
        } else {
            v1_0 = 1;
        }
        long v2_1 = ((long) this.e((v1_2 & 255), 127));
        if (v1_0 == null) {
            return v0_0.e(v2_1);
        } else {
            x8.g v1_3 = new x8.g();
            okhttp3.internal.http2.Huffman.a.getClass();
            kotlin.jvm.internal.j.e(v0_0, "source");
            okhttp3.internal.http2.Huffman$Node v5_2 = okhttp3.internal.http2.Huffman.d;
            okhttp3.internal.http2.Huffman$Node v9_0 = v5_2;
            long v7 = 0;
            int v6_1 = 0;
            while (v7 < v2_1) {
                v4_1 = ((v4_1 << 8) | (v0_0.readByte() & 255));
                v6_1 += 8;
                while (v6_1 >= 8) {
                    int v10_7 = ((v4_1 >> (v6_1 - 8)) & 255);
                    okhttp3.internal.http2.Huffman$Node v9_1 = v9_0.a;
                    kotlin.jvm.internal.j.b(v9_1);
                    v9_0 = v9_1[v10_7];
                    kotlin.jvm.internal.j.b(v9_0);
                    if (v9_0.a != null) {
                        v6_1 -= 8;
                    } else {
                        v1_3.M(v9_0.b);
                        v6_1 -= v9_0.c;
                        v9_0 = v5_2;
                    }
                }
                v7++;
            }
            while (v6_1 > 0) {
                int v0_4 = ((v4_1 << (8 - v6_1)) & 255);
                long v2_2 = v9_0.a;
                kotlin.jvm.internal.j.b(v2_2);
                int v0_5 = v2_2[v0_4];
                kotlin.jvm.internal.j.b(v0_5);
                long v2_4 = v0_5.c;
                if ((v0_5.a != null) || (v2_4 > v6_1)) {
                    break;
                }
                v1_3.M(v0_5.b);
                v6_1 -= v2_4;
                v9_0 = v5_2;
            }
            return v1_3.e(v1_3.b);
        }
    }

    public final int e(int p4, int p5)
    {
        int v4_1 = (p4 & p5);
        if (v4_1 >= p5) {
            int v4_3 = 0;
            while(true) {
                int v0_3 = this.c.readByte();
                if ((v0_3 & 128) == 0) {
                    break;
                }
                p5 += ((v0_3 & 127) << v4_3);
                v4_3 += 7;
            }
            return (p5 + ((v0_3 & 255) << v4_3));
        } else {
            return v4_1;
        }
    }
}
