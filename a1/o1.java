package a1;
public final class o1 implements l7.g {
    public static final a1.o1 a;

    static o1()
    {
        a1.o1.a = new a1.o1();
        return;
    }

    public static final Object a(java.io.FileOutputStream p12, n7.c p13)
    {
        Object v0_3;
        if (!(p13 instanceof a1.u0)) {
            v0_3 = new a1.u0(p13);
        } else {
            v0_3 = ((a1.u0) p13);
            java.nio.channels.FileLock v1_1 = ((a1.u0) p13).d;
            if ((v1_1 & -2147483648) == 0) {
            } else {
                ((a1.u0) p13).d = (v1_1 - -2147483648);
            }
        }
        String v13_2;
        long v4;
        String v13_1 = v0_3.c;
        boolean v2_0 = v0_3.d;
        if (!v2_0) {
            c4.b.e0(v13_1);
            v4 = 10;
            v13_2 = v0_3;
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                v4 = v0_3.b;
                p12 = v0_3.a;
                c4.b.e0(v13_1);
                v13_2 = v0_3;
                v4 *= ((long) 2);
            }
        }
        java.nio.channels.FileLock v1_2;
        if (v4 > 60000) {
            v1_2 = p12.getChannel().lock(0, 9223372036854775807, 0);
            kotlin.jvm.internal.j.d(v1_2, "lockFileStream.getChanne\u2026LUE, /* shared= */ false)");
        } else {
            try {
                Object v0_5 = p12.getChannel().lock(0, 9223372036854775807, 0);
                kotlin.jvm.internal.j.d(v0_5, "lockFileStream.getChanne\u2026LUE, /* shared= */ false)");
                v1_2 = v0_5;
            } catch (Object v0_6) {
                boolean v2_3 = v0_6.getMessage();
                if (v2_3) {
                    if (b8.i.s0(v2_3, "Resource deadlock would occur") == 1) {
                        v13_2.a = p12;
                        v13_2.b = v4;
                        v13_2.d = 1;
                        if (d8.f0.f(v4, v13_2) == v1_2) {
                        }
                    }
                }
                throw v0_6;
            }
        }
        return v1_2;
    }
}
