package y8;
public final synthetic class k implements u7.p {
    public final synthetic int a;
    public final synthetic kotlin.jvm.internal.r b;
    public final synthetic x8.b0 c;
    public final synthetic kotlin.jvm.internal.r d;
    public final synthetic kotlin.jvm.internal.r e;

    public synthetic k(kotlin.jvm.internal.r p2, x8.b0 p3, kotlin.jvm.internal.r p4, kotlin.jvm.internal.r p5)
    {
        this.a = 1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public synthetic k(x8.b0 p2, kotlin.jvm.internal.r p3, kotlin.jvm.internal.r p4, kotlin.jvm.internal.r p5)
    {
        this.a = 0;
        this.c = p2;
        this.b = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public final Object invoke(Object p12, Object p13)
    {
        kotlin.jvm.internal.r v0_0 = this.a;
        Integer v12_8 = ((Integer) p12).intValue();
        switch (v0_0) {
            case 0:
                kotlin.jvm.internal.r v0_1 = ((Long) p13).longValue();
                if (v12_8 == 21589) {
                    Integer v12_2 = 1;
                    if (v0_1 < 1) {
                        throw new java.io.IOException("bad zip: extended timestamp extra too short");
                    } else {
                        int v5_1;
                        x8.b0 v2_1 = this.c;
                        int v4_0 = v2_1.readByte();
                        int v6 = 0;
                        if ((v4_0 & 1) != 1) {
                            v5_1 = 0;
                        } else {
                            v5_1 = 1;
                        }
                        int v8_1;
                        if ((v4_0 & 2) != 2) {
                            v8_1 = 0;
                        } else {
                            v8_1 = 1;
                        }
                        if ((v4_0 & 4) == 4) {
                            v6 = 1;
                        }
                        if (v5_1 != 0) {
                            v12_2 = 5;
                        }
                        if (v8_1 != 0) {
                            v12_2 += 4;
                        }
                        if (v6 != 0) {
                            v12_2 += 4;
                        }
                        if (v0_1 < v12_2) {
                            throw new java.io.IOException("bad zip: extended timestamp extra too short");
                        } else {
                            if (v5_1 != 0) {
                                this.b.a = Integer.valueOf(v2_1.f());
                            }
                            if (v8_1 != 0) {
                                this.d.a = Integer.valueOf(v2_1.f());
                            }
                            if (v6 != 0) {
                                this.e.a = Integer.valueOf(v2_1.f());
                            }
                        }
                    }
                }
                return h7.l.a;
            default:
                kotlin.jvm.internal.r v0_2 = ((Long) p13).longValue();
                if (v12_8 == 1) {
                    Integer v12_19 = this.b;
                    if (v12_19.a != null) {
                        throw new java.io.IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    } else {
                        if (v0_2 != 24) {
                            throw new java.io.IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                        } else {
                            kotlin.jvm.internal.r v13_12 = this.c;
                            v12_19.a = Long.valueOf(v13_12.i());
                            this.d.a = Long.valueOf(v13_12.i());
                            this.e.a = Long.valueOf(v13_12.i());
                        }
                    }
                }
                return h7.l.a;
        }
    }
}
