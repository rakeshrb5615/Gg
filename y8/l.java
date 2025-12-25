package y8;
public final synthetic class l implements u7.p {
    public final synthetic kotlin.jvm.internal.o a;
    public final synthetic long b;
    public final synthetic kotlin.jvm.internal.q c;
    public final synthetic x8.b0 d;
    public final synthetic kotlin.jvm.internal.q e;
    public final synthetic kotlin.jvm.internal.q f;
    public final synthetic kotlin.jvm.internal.r m;
    public final synthetic kotlin.jvm.internal.r n;
    public final synthetic kotlin.jvm.internal.r o;

    public synthetic l(kotlin.jvm.internal.o p1, long p2, kotlin.jvm.internal.q p4, x8.b0 p5, kotlin.jvm.internal.q p6, kotlin.jvm.internal.q p7, kotlin.jvm.internal.r p8, kotlin.jvm.internal.r p9, kotlin.jvm.internal.r p10)
    {
        this.a = p1;
        this.b = p2;
        this.c = p4;
        this.d = p5;
        this.e = p6;
        this.f = p7;
        this.m = p8;
        this.n = p9;
        this.o = p10;
        return;
    }

    public final Object invoke(Object p7, Object p8)
    {
        kotlin.jvm.internal.q v7_5 = ((Integer) p7).intValue();
        long v0_6 = ((Long) p8).longValue();
        String v8_5 = this.d;
        if (v7_5 == 1) {
            kotlin.jvm.internal.q v7_16 = this.a;
            if (v7_16.a) {
                throw new java.io.IOException("bad zip: zip64 extra repeated");
            } else {
                v7_16.a = 1;
                if (v0_6 < this.b) {
                    throw new java.io.IOException("bad zip: zip64 extra too short");
                } else {
                    kotlin.jvm.internal.q v7_8 = this.c;
                    long v0_0 = v7_8.a;
                    if (v0_0 == 4294967295) {
                        v0_0 = v8_5.i();
                    }
                    long v0_3;
                    v7_8.a = v0_0;
                    kotlin.jvm.internal.q v7_9 = this.e;
                    long v4_1 = 0;
                    if (v7_9.a != 4294967295) {
                        v0_3 = 0;
                    } else {
                        v0_3 = v8_5.i();
                    }
                    v7_9.a = v0_3;
                    kotlin.jvm.internal.q v7_10 = this.f;
                    if (v7_10.a == 4294967295) {
                        v4_1 = v8_5.i();
                    }
                    v7_10.a = v4_1;
                }
            }
        } else {
            if (v7_5 == 10) {
                if (v0_6 < 4) {
                    throw new java.io.IOException("bad zip: NTFS extra too short");
                } else {
                    v8_5.skip(4);
                    y8.b.e(v8_5, ((int) (v0_6 - 4)), new y8.k(this.m, v8_5, this.n, this.o));
                }
            }
        }
        return h7.l.a;
    }
}
