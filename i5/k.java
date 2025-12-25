package i5;
public final class k implements java.io.Closeable {
    public static final java.util.logging.Logger m;
    public final java.io.RandomAccessFile a;
    public int b;
    public int c;
    public i5.h d;
    public i5.h e;
    public final byte[] f;

    static k()
    {
        i5.k.m = java.util.logging.Logger.getLogger(i5.k.getName());
        return;
    }

    public k(java.io.File p14)
    {
        StringBuilder v1_0 = new byte[16];
        this.f = v1_0;
        if (!p14.exists()) {
            java.io.RandomAccessFile v8_1 = new StringBuilder();
            v8_1.append(p14.getPath());
            v8_1.append(".tmp");
            long v2_1 = new java.io.File(v8_1.toString());
            java.io.RandomAccessFile v8_4 = new java.io.RandomAccessFile(v2_1, "rwd");
            try {
                v8_4.setLength(4096);
                v8_4.seek(0);
                String v0_1 = new byte[16];
                int v10 = 0;
                int v11 = 0;
            } catch (java.io.IOException v14_12) {
                v8_4.close();
                throw v14_12;
            }
            while (v10 < 4) {
                i5.k.F(v0_1, v11, new int[] {4096, 0, 0, 0})[v10]);
                v11 += 4;
                v10++;
            }
            v8_4.write(v0_1);
            v8_4.close();
            if (!v2_1.renameTo(p14)) {
                throw new java.io.IOException("Rename failed!");
            }
        }
        String v0_5 = new java.io.RandomAccessFile(p14, "rwd");
        this.a = v0_5;
        v0_5.seek(0);
        v0_5.readFully(v1_0);
        java.io.IOException v14_3 = i5.k.y(0, v1_0);
        this.b = v14_3;
        if (((long) v14_3) > v0_5.length()) {
            StringBuilder v1_2 = new StringBuilder("File is truncated. Expected length: ");
            v1_2.append(this.b);
            v1_2.append(", Actual length: ");
            v1_2.append(v0_5.length());
            throw new java.io.IOException(v1_2.toString());
        } else {
            this.c = i5.k.y(4, v1_0);
            java.io.IOException v14_9 = i5.k.y(8, v1_0);
            String v0_8 = i5.k.y(12, v1_0);
            this.d = this.x(v14_9);
            this.e = this.x(v0_8);
            return;
        }
    }

    public static void F(byte[] p2, int p3, int p4)
    {
        p2[p3] = ((byte) (p4 >> 24));
        p2[(p3 + 1)] = ((byte) (p4 >> 16));
        p2[(p3 + 2)] = ((byte) (p4 >> 8));
        p2[(p3 + 3)] = ((byte) p4);
        return;
    }

    public static int y(int p2, byte[] p3)
    {
        return (((((p3[p2] & 255) << 24) + ((p3[(p2 + 1)] & 255) << 16)) + ((p3[(p2 + 2)] & 255) << 8)) + (p3[(p2 + 3)] & 255));
    }

    public final void A(int p6, byte[] p7, int p8, int p9)
    {
        int v6_1 = this.D(p6);
        int v1_0 = this.b;
        java.io.RandomAccessFile v2 = this.a;
        if ((v6_1 + p9) > v1_0) {
            int v1_1 = (v1_0 - v6_1);
            v2.seek(((long) v6_1));
            v2.readFully(p7, p8, v1_1);
            v2.seek(16);
            v2.readFully(p7, (p8 + v1_1), (p9 - v1_1));
            return;
        } else {
            v2.seek(((long) v6_1));
            v2.readFully(p7, p8, p9);
            return;
        }
    }

    public final void B(byte[] p7, int p8, int p9)
    {
        int v8_1 = this.D(p8);
        int v1_0 = this.b;
        java.io.RandomAccessFile v3 = this.a;
        if ((v8_1 + p9) > v1_0) {
            int v1_1 = (v1_0 - v8_1);
            v3.seek(((long) v8_1));
            v3.write(p7, 0, v1_1);
            v3.seek(16);
            v3.write(p7, v1_1, (p9 - v1_1));
            return;
        } else {
            v3.seek(((long) v8_1));
            v3.write(p7, 0, p9);
            return;
        }
    }

    public final int C()
    {
        if (this.c != 0) {
            int v0_3 = this.e;
            int v2_7 = v0_3.a;
            int v3_1 = this.d.a;
            if (v2_7 < v3_1) {
                return ((((v2_7 + 4) + v0_3.b) + this.b) - v3_1);
            } else {
                return ((((v2_7 - v3_1) + 4) + v0_3.b) + 16);
            }
        } else {
            return 16;
        }
    }

    public final int D(int p2)
    {
        int v0 = this.b;
        if (p2 >= v0) {
            return ((p2 + 16) - v0);
        } else {
            return p2;
        }
    }

    public final void E(int p3, int p4, int p5, int p6)
    {
        int v4_1 = 0;
        java.io.RandomAccessFile v5_1 = 0;
        while(true) {
            byte[] v6_1 = this.f;
            if (v4_1 >= 4) {
                break;
            }
            i5.k.F(v6_1, v5_1, new int[] {p3, p4, p5, p6})[v4_1]);
            v5_1 += 4;
            v4_1++;
        }
        java.io.RandomAccessFile v5_2 = this.a;
        v5_2.seek(0);
        v5_2.write(v6_1);
        return;
    }

    public final void c(byte[] p8)
    {
        int v0_0 = p8.length;
        try {
            if ((v0_0 < 0) || (v0_0 > p8.length)) {
                throw new IndexOutOfBoundsException();
            } else {
                int v3_2;
                this.f(v0_0);
                boolean v1_1 = this.s();
                if (!v1_1) {
                    int v3_0 = this.e;
                    v3_2 = this.D(((v3_0.a + 4) + v3_0.b));
                } else {
                    v3_2 = 16;
                }
                int v8_2;
                i5.h v4_4 = new i5.h(v3_2, v0_0);
                i5.k.F(this.f, 0, v0_0);
                this.B(this.f, v3_2, 4);
                this.B(p8, (v3_2 + 4), v0_0);
                if (!v1_1) {
                    v8_2 = this.d.a;
                } else {
                    v8_2 = v3_2;
                }
                this.E(this.b, (this.c + 1), v8_2, v3_2);
                this.e = v4_4;
                this.c = (this.c + 1);
                if (v1_1) {
                    this.d = v4_4;
                }
                return;
            }
        } catch (int v8_6) {
            throw v8_6;
        }
    }

    public final declared_synchronized void close()
    {
        this.a.close();
        return;
    }

    public final void f(int p10)
    {
        i5.h v10_1 = (p10 + 4);
        int v0_6 = (this.b - this.C());
        if (v0_6 < v10_1) {
            int v1_1 = this.b;
            do {
                v0_6 += v1_1;
                v1_1 <<= 1;
            } while(v0_6 < v10_1);
            i5.h v10_2 = this.a;
            v10_2.setLength(((long) v1_1));
            v10_2.getChannel().force(1);
            int v0_2 = this.e;
            int v0_4 = this.D(((v0_2.a + 4) + v0_2.b));
            if (v0_4 < this.d.a) {
                java.nio.channels.FileChannel v3_1 = v10_2.getChannel();
                v3_1.position(((long) this.b));
                long v6 = ((long) (v0_4 - 4));
                if (v3_1.transferTo(16, v6, v3_1) != v6) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            i5.h v10_8 = this.e.a;
            int v0_9 = this.d.a;
            if (v10_8 >= v0_9) {
                this.E(v1_1, this.c, v0_9, v10_8);
            } else {
                int v2_9 = ((this.b + v10_8) - 16);
                this.E(v1_1, this.c, v0_9, v2_9);
                this.e = new i5.h(v2_9, this.e.b);
            }
            this.b = v1_1;
            return;
        } else {
            return;
        }
    }

    public final declared_synchronized void i(i5.j p5)
    {
        int v0_1 = this.d.a;
        int v1 = 0;
        while (v1 < this.c) {
            int v0_3 = this.x(v0_1);
            p5.b(new i5.i(this, v0_3), v0_3.b);
            v0_1 = this.D(((v0_3.a + 4) + v0_3.b));
            v1++;
        }
        return;
    }

    public final declared_synchronized boolean s()
    {
        int v0_2;
        if (this.c != 0) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        return v0_2;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(i5.k.getSimpleName());
        v0_1.append("[fileLength=");
        v0_1.append(this.b);
        v0_1.append(", size=");
        v0_1.append(this.c);
        v0_1.append(", first=");
        v0_1.append(this.d);
        v0_1.append(", last=");
        v0_1.append(this.e);
        v0_1.append(", element lengths=[");
        try {
            this.i(new i2.m(v0_1));
        } catch (String v1_10) {
            i5.k.m.log(java.util.logging.Level.WARNING, "read error", v1_10);
        }
        v0_1.append("]]");
        return v0_1.toString();
    }

    public final i5.h x(int p4)
    {
        if (p4 != null) {
            java.io.RandomAccessFile v2 = this.a;
            v2.seek(((long) p4));
            return new i5.h(p4, v2.readInt());
        } else {
            return i5.h.c;
        }
    }

    public final declared_synchronized void z()
    {
        try {
            if (this.s()) {
                throw new java.util.NoSuchElementException();
            } else {
                if (this.c != 1) {
                    Throwable v0_1 = this.d;
                    Throwable v0_3 = this.D(((v0_1.a + 4) + v0_1.b));
                    this.A(v0_3, this.f, 0, 4);
                    java.nio.channels.FileChannel v1_0 = i5.k.y(0, this.f);
                    this.E(this.b, (this.c - 1), v0_3, this.e.a);
                    this.c = (this.c - 1);
                    this.d = new i5.h(v0_3, v1_0);
                } else {
                    this.E(4096, 0, 0, 0);
                    this.c = 0;
                    java.nio.channels.FileChannel v1_1 = i5.h.c;
                    this.d = v1_1;
                    this.e = v1_1;
                    if (this.b > 4096) {
                        java.nio.channels.FileChannel v1_3 = this.a;
                        v1_3.setLength(((long) 4096));
                        v1_3.getChannel().force(1);
                    }
                    this.b = 4096;
                }
                return;
            }
        } catch (Throwable v0_8) {
            throw v0_8;
        }
    }
}
