package a2;
public final class c {
    public long a;
    public a2.c b;

    public c()
    {
        this.a = 0;
        return;
    }

    public final void a(int p5)
    {
        if (p5 < 64) {
            this.a = (this.a & (~ (1 << p5)));
            return;
        } else {
            a2.c v1 = this.b;
            if (v1 != null) {
                v1.a((p5 - 64));
            }
            return;
        }
    }

    public final int b(int p7)
    {
        int v0_0 = this.b;
        if (v0_0 != 0) {
            if (p7 >= 64) {
                return (Long.bitCount(this.a) + v0_0.b((p7 - 64)));
            } else {
                return Long.bitCount((this.a & ((1 << p7) - 1)));
            }
        } else {
            if (p7 < 64) {
                return Long.bitCount((this.a & ((1 << p7) - 1)));
            } else {
                return Long.bitCount(this.a);
            }
        }
    }

    public final void c()
    {
        if (this.b == null) {
            this.b = new a2.c();
        }
        return;
    }

    public final boolean d(int p5)
    {
        if (p5 < 64) {
            if ((this.a & (1 << p5)) == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            this.c();
            return this.b.d((p5 - 64));
        }
    }

    public final void e(int p10, boolean p11)
    {
        if (p10 < 64) {
            int v2_0;
            long v0_4 = this.a;
            if ((-9223372036854775808 & v0_4) == 0) {
                v2_0 = 0;
            } else {
                v2_0 = 1;
            }
            long v7_1 = ((1 << p10) - 1);
            this.a = (((v0_4 & (~ v7_1)) << 1) | (v0_4 & v7_1));
            if (!p11) {
                this.a(p10);
            } else {
                this.h(p10);
            }
            if ((v2_0 == 0) && (this.b == null)) {
                return;
            } else {
                this.c();
                this.b.e(0, v2_0);
                return;
            }
        } else {
            this.c();
            this.b.e((p10 - 64), p11);
            return;
        }
    }

    public final boolean f(int p11)
    {
        if (p11 < 64) {
            int v11_1;
            long v2_4 = (1 << p11);
            long v4_1 = this.a;
            if ((v4_1 & v2_4) == 0) {
                v11_1 = 0;
            } else {
                v11_1 = 1;
            }
            long v4_0 = (v4_1 & (~ v2_4));
            this.a = v4_0;
            long v2_0 = (v2_4 - 1);
            this.a = ((v4_0 & v2_0) | Long.rotateRight(((~ v2_0) & v4_0), 1));
            a2.c v0_4 = this.b;
            if (v0_4 != null) {
                if (v0_4.d(0)) {
                    this.h(63);
                }
                this.b.f(0);
            }
            return v11_1;
        } else {
            this.c();
            return this.b.f((p11 - 64));
        }
    }

    public final void g()
    {
        this.a = 0;
        a2.c v0_1 = this.b;
        if (v0_1 != null) {
            v0_1.g();
        }
        return;
    }

    public final void h(int p5)
    {
        if (p5 < 64) {
            this.a = (this.a | (1 << p5));
            return;
        } else {
            this.c();
            this.b.h((p5 - 64));
            return;
        }
    }

    public final String toString()
    {
        if (this.b != null) {
            String v0_5 = new StringBuilder();
            v0_5.append(this.b.toString());
            v0_5.append("xx");
            v0_5.append(Long.toBinaryString(this.a));
            return v0_5.toString();
        } else {
            return Long.toBinaryString(this.a);
        }
    }
}
