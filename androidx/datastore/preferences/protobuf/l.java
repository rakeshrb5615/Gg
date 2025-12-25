package androidx.datastore.preferences.protobuf;
public final class l extends c4.b {
    public static final java.util.logging.Logger h;
    public static final boolean i;
    public androidx.datastore.preferences.protobuf.e0 c;
    public final byte[] d;
    public final int e;
    public int f;
    public final a1.n1 g;

    static l()
    {
        androidx.datastore.preferences.protobuf.l.h = java.util.logging.Logger.getLogger(androidx.datastore.preferences.protobuf.l.getName());
        androidx.datastore.preferences.protobuf.l.i = androidx.datastore.preferences.protobuf.h1.e;
        return;
    }

    public l(a1.n1 p2, int p3)
    {
        if (p3 < null) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        } else {
            String v3_2 = Math.max(p3, 20);
            byte[] v0_1 = new byte[v3_2];
            this.d = v0_1;
            this.e = v3_2;
            this.g = p2;
            return;
        }
    }

    public static int p0(int p1, androidx.datastore.preferences.protobuf.g p2)
    {
        int v1_1 = androidx.datastore.preferences.protobuf.l.r0(p1);
        int v2_1 = p2.size();
        return ((androidx.datastore.preferences.protobuf.l.s0(v2_1) + v2_1) + v1_1);
    }

    public static int q0(String p1)
    {
        try {
            int v1_1 = androidx.datastore.preferences.protobuf.k1.a(p1);
        } catch (androidx.datastore.preferences.protobuf.j1) {
            v1_1 = v1_1.getBytes(androidx.datastore.preferences.protobuf.x.a).length;
        }
        return (androidx.datastore.preferences.protobuf.l.s0(v1_1) + v1_1);
    }

    public static int r0(int p0)
    {
        return androidx.datastore.preferences.protobuf.l.s0((p0 << 3));
    }

    public static int s0(int p0)
    {
        return ((352 - (Integer.numberOfLeadingZeros(p0) * 9)) >> 6);
    }

    public static int t0(long p0)
    {
        return ((640 - (Long.numberOfLeadingZeros(p0) * 9)) >> 6);
    }

    public final void A0(androidx.datastore.preferences.protobuf.g p3)
    {
        this.M0(p3.size());
        this.j0(p3.b, p3.e(), p3.size());
        return;
    }

    public final void B0(int p2, int p3)
    {
        this.v0(14);
        this.m0(p2, 5);
        this.k0(p3);
        return;
    }

    public final void C0(int p2)
    {
        this.v0(4);
        this.k0(p2);
        return;
    }

    public final void D0(int p2, long p3)
    {
        this.v0(18);
        this.m0(p2, 1);
        this.l0(p3);
        return;
    }

    public final void E0(long p2)
    {
        this.v0(8);
        this.l0(p2);
        return;
    }

    public final void F0(int p2, int p3)
    {
        this.v0(20);
        this.m0(p2, 0);
        if (p3 < 0) {
            this.o0(((long) p3));
            return;
        } else {
            this.n0(p3);
            return;
        }
    }

    public final void G0(int p3)
    {
        if (p3 < 0) {
            this.O0(((long) p3));
            return;
        } else {
            this.M0(p3);
            return;
        }
    }

    public final void H0(int p2, androidx.datastore.preferences.protobuf.a p3, androidx.datastore.preferences.protobuf.u0 p4)
    {
        this.K0(p2, 2);
        this.M0(p3.a(p4));
        p4.c(p3, this.c);
        return;
    }

    public final void I0(int p2, String p3)
    {
        this.K0(p2, 2);
        this.J0(p3);
        return;
    }

    public final void J0(String p7)
    {
        ArrayIndexOutOfBoundsException v0_3 = (p7.length() * 3);
        androidx.datastore.preferences.protobuf.k v1_3 = androidx.datastore.preferences.protobuf.l.s0(v0_3);
        int v2_2 = (v1_3 + v0_3);
        int v3_6 = this.e;
        if (v2_2 <= v3_6) {
            if (v2_2 > (v3_6 - this.f)) {
                this.u0();
            }
            ArrayIndexOutOfBoundsException v0_2 = androidx.datastore.preferences.protobuf.l.s0(p7.length());
            int v2_0 = this.f;
            byte[] v4 = this.d;
            if (v0_2 != v1_3) {
                ArrayIndexOutOfBoundsException v0_4 = androidx.datastore.preferences.protobuf.k1.a(p7);
                this.n0(v0_4);
                this.f = androidx.datastore.preferences.protobuf.k1.a.r(p7, v4, this.f, v0_4);
            } else {
                androidx.datastore.preferences.protobuf.k v1_1 = (v2_0 + v0_2);
                this.f = v1_1;
                androidx.datastore.preferences.protobuf.k v1_2 = androidx.datastore.preferences.protobuf.k1.a.r(p7, v4, v1_1, (v3_6 - v1_1));
                this.f = v2_0;
                this.n0(((v1_2 - v2_0) - v0_2));
                this.f = v1_2;
            }
            return;
        } else {
            androidx.datastore.preferences.protobuf.k v1_6 = new byte[v0_3];
            ArrayIndexOutOfBoundsException v0_8 = androidx.datastore.preferences.protobuf.k1.a.r(p7, v1_6, 0, v0_3);
            this.M0(v0_8);
            this.x0(v1_6, 0, v0_8);
            return;
        }
    }

    public final void K0(int p1, int p2)
    {
        this.M0(((p1 << 3) | p2));
        return;
    }

    public final void L0(int p2, int p3)
    {
        this.v0(20);
        this.m0(p2, 0);
        this.n0(p3);
        return;
    }

    public final void M0(int p2)
    {
        this.v0(5);
        this.n0(p2);
        return;
    }

    public final void N0(int p2, long p3)
    {
        this.v0(20);
        this.m0(p2, 0);
        this.o0(p3);
        return;
    }

    public final void O0(long p2)
    {
        this.v0(10);
        this.o0(p2);
        return;
    }

    public final void j0(byte[] p1, int p2, int p3)
    {
        this.x0(p1, p2, p3);
        return;
    }

    public final void k0(int p6)
    {
        int v0_0 = this.f;
        int v1_0 = (v0_0 + 1);
        this.f = v1_0;
        byte[] v3 = this.d;
        v3[v0_0] = ((byte) (p6 & 255));
        int v2_2 = (v0_0 + 2);
        this.f = v2_2;
        v3[v1_0] = ((byte) ((p6 >> 8) & 255));
        int v1_1 = (v0_0 + 3);
        this.f = v1_1;
        v3[v2_2] = ((byte) ((p6 >> 16) & 255));
        this.f = (v0_0 + 4);
        v3[v1_1] = ((byte) ((p6 >> 24) & 255));
        return;
    }

    public final void l0(long p10)
    {
        int v0_0 = this.f;
        int v1_0 = (v0_0 + 1);
        this.f = v1_0;
        byte[] v5 = this.d;
        v5[v0_0] = ((byte) ((int) (p10 & 255)));
        int v4_4 = (v0_0 + 2);
        this.f = v4_4;
        v5[v1_0] = ((byte) ((int) ((p10 >> 8) & 255)));
        int v1_1 = (v0_0 + 3);
        this.f = v1_1;
        v5[v4_4] = ((byte) ((int) ((p10 >> 16) & 255)));
        int v4_0 = (v0_0 + 4);
        this.f = v4_0;
        v5[v1_1] = ((byte) ((int) (255 & (p10 >> 24))));
        int v1_2 = (v0_0 + 5);
        this.f = v1_2;
        v5[v4_0] = ((byte) (((int) (p10 >> 32)) & 255));
        int v2_9 = (v0_0 + 6);
        this.f = v2_9;
        v5[v1_2] = ((byte) (((int) (p10 >> 40)) & 255));
        int v1_3 = (v0_0 + 7);
        this.f = v1_3;
        v5[v2_9] = ((byte) (((int) (p10 >> 48)) & 255));
        this.f = (v0_0 + 8);
        v5[v1_3] = ((byte) (((int) (p10 >> 56)) & 255));
        return;
    }

    public final void m0(int p1, int p2)
    {
        this.n0(((p1 << 3) | p2));
        return;
    }

    public final void n0(int p5)
    {
        byte[] v1 = this.d;
        if (!androidx.datastore.preferences.protobuf.l.i) {
            while ((p5 & -128) != 0) {
                int v0_9 = this.f;
                this.f = (v0_9 + 1);
                v1[v0_9] = ((byte) ((p5 | 128) & 255));
                p5 >>= 7;
            }
            int v0_1 = this.f;
            this.f = (v0_1 + 1);
            v1[v0_1] = ((byte) p5);
            return;
        }
        while ((p5 & -128) != 0) {
            int v0_3 = this.f;
            this.f = (v0_3 + 1);
            androidx.datastore.preferences.protobuf.h1.j(v1, ((long) v0_3), ((byte) ((p5 | 128) & 255)));
            p5 >>= 7;
        }
        int v0_8 = this.f;
        this.f = (v0_8 + 1);
        androidx.datastore.preferences.protobuf.h1.j(v1, ((long) v0_8), ((byte) p5));
        return;
    }

    public final void o0(long p10)
    {
        byte[] v6 = this.d;
        if (!androidx.datastore.preferences.protobuf.l.i) {
            while ((p10 & -128) != 0) {
                int v0_11 = this.f;
                this.f = (v0_11 + 1);
                v6[v0_11] = ((byte) ((((int) p10) | 128) & 255));
                p10 >>= 7;
            }
            int v0_1 = this.f;
            this.f = (v0_1 + 1);
            v6[v0_1] = ((byte) ((int) p10));
            return;
        }
        while ((p10 & -128) != 0) {
            int v0_3 = this.f;
            this.f = (v0_3 + 1);
            androidx.datastore.preferences.protobuf.h1.j(v6, ((long) v0_3), ((byte) ((((int) p10) | 128) & 255)));
            p10 >>= 7;
        }
        int v0_8 = this.f;
        this.f = (v0_8 + 1);
        androidx.datastore.preferences.protobuf.h1.j(v6, ((long) v0_8), ((byte) ((int) p10)));
        return;
    }

    public final void u0()
    {
        this.g.write(this.d, 0, this.f);
        this.f = 0;
        return;
    }

    public final void v0(int p3)
    {
        if ((this.e - this.f) < p3) {
            this.u0();
        }
        return;
    }

    public final void w0(byte p3)
    {
        if (this.f == this.e) {
            this.u0();
        }
        int v0_1 = this.f;
        this.f = (v0_1 + 1);
        this.d[v0_1] = p3;
        return;
    }

    public final void x0(byte[] p5, int p6, int p7)
    {
        a1.n1 v0_0 = this.f;
        int v1 = this.e;
        int v2 = (v1 - v0_0);
        byte[] v3 = this.d;
        if (v2 < p7) {
            System.arraycopy(p5, p6, v3, v0_0, v2);
            int v6_1 = (p6 + v2);
            int v7_1 = (p7 - v2);
            this.f = v1;
            this.u0();
            if (v7_1 > v1) {
                this.g.write(p5, v6_1, v7_1);
            } else {
                System.arraycopy(p5, v6_1, v3, 0, v7_1);
                this.f = v7_1;
            }
            return;
        } else {
            System.arraycopy(p5, p6, v3, v0_0, p7);
            this.f = (this.f + p7);
            return;
        }
    }

    public final void y0(int p2, boolean p3)
    {
        this.v0(11);
        this.m0(p2, 0);
        int v3_1 = this.f;
        this.f = (v3_1 + 1);
        this.d[v3_1] = ((byte) p3);
        return;
    }

    public final void z0(int p2, androidx.datastore.preferences.protobuf.g p3)
    {
        this.K0(p2, 2);
        this.A0(p3);
        return;
    }
}
