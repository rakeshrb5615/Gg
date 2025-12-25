package a2;
public final class m extends a2.w0 {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic m(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    private final void c(androidx.recyclerview.widget.RecyclerView p1, int p2)
    {
        return;
    }

    public void a(androidx.recyclerview.widget.RecyclerView p1, int p2)
    {
        return;
    }

    public final void b(androidx.recyclerview.widget.RecyclerView p11, int p12, int p13)
    {
        switch (this.a) {
            case 0:
                int v3_2;
                int v12_3 = ((a2.p) this.b);
                float v13_0 = p11.computeHorizontalScrollOffset();
                int v11_15 = p11.computeVerticalScrollOffset();
                float v0_7 = v12_3.a;
                androidx.recyclerview.widget.RecyclerView v1_1 = v12_3.s.computeVerticalScrollRange();
                int v2_5 = v12_3.r;
                if (((v1_1 - v2_5) <= 0) || (v2_5 < v0_7)) {
                    v3_2 = 0;
                } else {
                    v3_2 = 1;
                }
                float v0_1;
                v12_3.t = v3_2;
                int v3_4 = v12_3.s.computeHorizontalScrollRange();
                int v6_14 = v12_3.q;
                if (((v3_4 - v6_14) <= 0) || (v6_14 < v0_7)) {
                    v0_1 = 0;
                } else {
                    v0_1 = 1;
                }
                v12_3.u = v0_1;
                float v7_12 = v12_3.t;
                if ((v7_12 != 0) || (v0_1 != 0)) {
                    if (v7_12 != 0) {
                        float v4_2 = ((float) v2_5);
                        v12_3.l = ((int) ((((v4_2 / 1073741824) + ((float) v11_15)) * v4_2) / ((float) v1_1)));
                        v12_3.k = Math.min(v2_5, ((v2_5 * v2_5) / v1_1));
                    }
                    if (v12_3.u) {
                        float v13_1 = ((float) v6_14);
                        v12_3.o = ((int) ((((v13_1 / 1073741824) + ((float) v13_0)) * v13_1) / ((float) v3_4)));
                        v12_3.n = Math.min(v6_14, ((v6_14 * v6_14) / v3_4));
                    }
                    int v11_14 = v12_3.v;
                    if ((v11_14 == 0) || (v11_14 == 1)) {
                        v12_3.f(1);
                    }
                } else {
                    if (v12_3.v != 0) {
                        v12_3.f(0);
                    }
                }
                return;
            default:
                int v12_5 = ((l2.a0) this.b);
                if (v12_5.isAdded()) {
                    p11.post(new androidx.lifecycle.g0(this, 12));
                    v12_5.q = v12_5.i2.N0();
                    float v13_8 = v12_5.i2.O0();
                    float v0_11 = ((v12_5.q + v13_8) / 2);
                    v12_5.r = v0_11;
                    androidx.recyclerview.widget.RecyclerView v1_4 = v12_5.s.size();
                    v12_5.p = (((v0_11 % v1_4) + v1_4) % v1_4);
                    float v0_0 = v12_5.g2;
                    int v12_1 = v12_5.q;
                    androidx.recyclerview.widget.RecyclerView v1_0 = v0_0.i;
                    int v3_0 = 1;
                    if (v0_0.e.getResources().getConfiguration().orientation != 1) {
                        v3_0 = 0;
                    }
                    int v2_4;
                    if (v3_0 == 0) {
                        v2_4 = v1_0.getHeight();
                    } else {
                        v2_4 = v1_0.getWidth();
                    }
                    float v4_0 = (v2_4 / 2);
                    while (v12_1 <= v13_8) {
                        android.widget.ImageButton v5_0 = v1_0.H(v12_1);
                        if (v5_0 != null) {
                            float v7_0;
                            java.util.ArrayList v8_0;
                            android.widget.ImageButton v5_1 = v5_0.a;
                            if (v3_0 == 0) {
                                v7_0 = v5_1.getY();
                                v8_0 = v5_1.getHeight();
                            } else {
                                v7_0 = v5_1.getX();
                                v8_0 = v5_1.getWidth();
                            }
                            float v7_5;
                            int vtmp21 = Math.abs((((int) ((((float) v8_0) / 1073741824) + v7_0)) - v4_0));
                            if (v2_4 != 0) {
                                v7_5 = (((float) vtmp21) / ((float) v2_4));
                            } else {
                                v7_5 = 0;
                            }
                            float v7_10 = ((1067030938 * ((float) ((Math.cos(((double) (Math.min((v7_5 * 1073741824), 1065353216) * 1078530011))) + 4607182418800017408) / 4611686018427387904))) + 1050253722);
                            v0_0.f.set((v12_1 % v0_0.g.size()), Float.valueOf(v7_10));
                            android.widget.ImageButton v5_4 = ((android.widget.ImageButton) v5_1.findViewById(2131362509));
                            if (v5_4 != null) {
                                v5_4.setScaleX(v7_10);
                                v5_4.setScaleY(v7_10);
                            }
                        }
                        v12_1++;
                    }
                    p11.postInvalidateOnAnimation();
                }
                return;
        }
    }
}
