package a1;
public final class q0 extends a1.i0 {

    public final Object b(Object p7, n7.c p8)
    {
        String v0_2;
        if (!(p8 instanceof a1.p0)) {
            v0_2 = new a1.p0(this, p8);
        } else {
            v0_2 = ((a1.p0) p8);
            m7.a v1_2 = ((a1.p0) p8).e;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((a1.p0) p8).e = (v1_2 - -2147483648);
            }
        }
        String v7_4;
        String v0_3;
        Throwable v8_1 = v0_2.c;
        m7.a v1_1 = m7.a.a;
        a1.f1 v2_0 = v0_2.e;
        h7.l v3_0 = h7.l.a;
        try {
            if (v2_0 == null) {
                c4.b.e0(v8_1);
                if (this.c.get()) {
                    throw new IllegalStateException("This scope has already been closed.");
                } else {
                    Throwable v8_6 = new java.io.FileOutputStream(this.a);
                    try {
                        a1.f1 v2_2 = this.b;
                        a1.n1 v5_1 = new a1.n1(v8_6);
                        v0_2.a = v8_6;
                        v0_2.b = v8_6;
                        v0_2.e = 1;
                        v2_2.a(p7, v5_1);
                    } catch (String v7_3) {
                        v0_3 = v8_6;
                    }
                    if (v3_0 != v1_1) {
                        v7_4 = v8_6;
                        v0_3 = v7_4;
                        v7_4.getFD().sync();
                        j5.t1.f(v0_3, 0);
                        return v3_0;
                    } else {
                        return v1_1;
                    }
                }
            } else {
                if (v2_0 != 1) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    v7_4 = v0_2.b;
                    v0_3 = v0_2.a;
                    c4.b.e0(v8_1);
                    v7_4.getFD().sync();
                    j5.t1.f(v0_3, 0);
                    return v3_0;
                }
            }
            try {
                throw v7_3;
            } catch (Throwable v8_8) {
                j5.t1.f(v0_3, v7_3);
                throw v8_8;
            }
        } catch (String v7_3) {
        }
    }
}
