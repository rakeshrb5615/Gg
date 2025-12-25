package s8;
public final synthetic class l implements u7.a {
    public final synthetic int a;
    public final synthetic s8.m b;

    public synthetic l(s8.m p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final Object invoke()
    {
        switch (this.a) {
            case 0:
                return this.b.b.a();
            default:
                Integer v0_5 = this.b;
                int v1_1 = ((q8.d[]) v0_5.j.getValue());
                kotlin.jvm.internal.j.e(v1_1, "typeParams");
                int v2_4 = ((v0_5.b().hashCode() * 31) + java.util.Arrays.hashCode(v1_1));
                int v1_3 = v0_5.d();
                int v4_0 = 1;
                while(true) {
                    int v6_0;
                    int v5 = 0;
                    if (v1_3 <= 0) {
                        v6_0 = 0;
                    } else {
                        v6_0 = 1;
                    }
                    if (v6_0 == 0) {
                        break;
                    }
                    int v7_3 = (v1_3 - 1);
                    int v4_1 = (v4_0 * 31);
                    int v1_9 = v0_5.i((v0_5.d() - v1_3)).b();
                    if (v1_9 != 0) {
                        v5 = v1_9.hashCode();
                    }
                    v4_0 = (v4_1 + v5);
                    v1_3 = v7_3;
                }
                int v1_4 = v0_5.d();
                int v6_1 = 1;
                while(true) {
                    int v7_0;
                    if (v1_4 <= 0) {
                        v7_0 = 0;
                    } else {
                        v7_0 = 1;
                    }
                    if (v7_0 == 0) {
                        break;
                    }
                    int v1_7;
                    int v8 = (v1_4 - 1);
                    int v6_2 = (v6_1 * 31);
                    int v1_6 = v0_5.i((v0_5.d() - v1_4)).c();
                    if (v1_6 == 0) {
                        v1_7 = 0;
                    } else {
                        v1_7 = v1_6.hashCode();
                    }
                    v6_1 = (v6_2 + v1_7);
                    v1_4 = v8;
                }
                return Integer.valueOf(((((v2_4 * 31) + v4_0) * 31) + v6_1));
        }
    }
}
