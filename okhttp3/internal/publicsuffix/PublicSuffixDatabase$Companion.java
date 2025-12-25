package okhttp3.internal.publicsuffix;
public final class PublicSuffixDatabase$Companion {

    private PublicSuffixDatabase$Companion()
    {
        return;
    }

    public synthetic PublicSuffixDatabase$Companion(int p1)
    {
        return;
    }

    public static final String a(okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion p18, x8.j p19, x8.j[] p20, int p21)
    {
        p18.getClass();
        int v2 = p19.d();
        int v4 = 0;
        while (v4 < v2) {
            int v5_0 = ((v4 + v2) / 2);
            while ((v5_0 > -1) && (p19.i(v5_0) != 10)) {
                v5_0--;
            }
            int v8_1 = (v5_0 + 1);
            int v10_0 = 1;
            while(true) {
                int v11 = (v8_1 + v10_0);
                if (p19.i(v11) == 10) {
                    break;
                }
                v10_0++;
            }
            int v6_1 = (v11 - v8_1);
            int v12_1 = p21;
            int v10_1 = 0;
            int v13 = 0;
            int v14 = 0;
            while(true) {
                int v15_3;
                int v10_2;
                if (v10_1 == 0) {
                    v15_3 = v10_1;
                    v10_2 = (p20[v12_1].i(v13) & 255);
                } else {
                    v10_2 = 46;
                    v15_3 = 0;
                }
                int v10_3 = (v10_2 - (p19.i((v8_1 + v14)) & 255));
                if (v10_3 != 0) {
                    break;
                }
                v14++;
                v13++;
                if (v14 == v6_1) {
                    break;
                }
                if (p20[v12_1].d() != v13) {
                    v10_1 = v15_3;
                } else {
                    if (v12_1 == (p20.length - 1)) {
                        break;
                    }
                    v12_1++;
                    v13 = -1;
                    v10_1 = 1;
                }
            }
            if (v10_3 >= 0) {
                if (v10_3 <= 0) {
                    int v3_7 = (v6_1 - v14);
                    int v7_3 = (p20[v12_1].d() - v13);
                    int v12_2 = (v12_1 + 1);
                    int v9_1 = p20.length;
                    while (v12_2 < v9_1) {
                        v7_3 += p20[v12_2].d();
                        v12_2++;
                    }
                    if (v7_3 >= v3_7) {
                        if (v7_3 <= v3_7) {
                            return p19.o(v8_1, (v6_1 + v8_1)).n(b8.a.a);
                        }
                    } else {
                        v2 = v5_0;
                    }
                }
                v4 = (v11 + 1);
            }
        }
        return 0;
    }
}
