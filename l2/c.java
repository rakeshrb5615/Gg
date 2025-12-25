package l2;
public final synthetic class c implements android.view.View$OnClickListener {
    public final synthetic l2.a0 a;
    public final synthetic android.widget.ImageButton[] b;
    public final synthetic int c;
    public final synthetic android.widget.TextView d;

    public synthetic c(l2.a0 p1, android.widget.ImageButton[] p2, int p3, android.widget.TextView p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public final void onClick(android.view.View p10)
    {
        String v5_1;
        l2.a0 v0 = this.a;
        v0.getClass();
        String v2_2 = this.b;
        if (!(p10 instanceof android.widget.ImageView)) {
            v5_1 = 0;
        } else {
            String v1_2 = 0;
            v5_1 = 0;
            while (v1_2 < v2_2.length) {
                int v6_2;
                String v5_0 = v2_2[v1_2];
                if (v5_0 != p10) {
                    v6_2 = 0;
                } else {
                    v6_2 = 1;
                }
                v5_0.setSelected(v6_2);
                if ((v1_2 != (v2_2.length - 1)) || (v5_0 != p10)) {
                    v5_1 = 0;
                } else {
                    v5_1 = 1;
                }
                v1_2++;
            }
        }
        if (p10.isEnabled()) {
            i2.y.b(p10);
            boolean vtmp3 = v0.v.getBoolean(v0.I0, 0);
            String v1_5 = v2_2.length;
            int v6_1 = 0;
            while (v6_1 < v1_5) {
                v2_2[v6_1].setEnabled(vtmp3);
                v6_1++;
            }
            String v1_6 = this.c;
            v0.C(this.d, v0.P[v1_6]);
            if (v5_1 == null) {
                v0.v.edit().putString(v0.k0, v0.Z0).apply();
            } else {
                v0.v.edit().putString(v0.k0, "100000").apply();
                v0.v.edit().putString(v0.k0, "random").apply();
                l2.f0 v10_20 = i2.k0.a;
                String v2_7 = v10_20.nextInt(100);
                int v6_8 = v10_20.nextInt(30);
                l2.f0 v10_22 = (v10_20.nextInt(130) - 65);
                c4.b.Q(v0.v, v0.B0, v2_7);
                c4.b.Q(v0.v, v0.x0, v6_8);
                c4.b.Q(v0.v, v0.y0, v10_22);
                com.google.android.material.slider.Slider[] v7_6 = v0.D2.e;
                v0.z(v7_6[0], v0.B0, v2_7);
                v0.z(v7_6[1], v0.y0, v6_8);
                v0.z(v7_6[2], v0.x0, v10_22);
            }
            v0.v.edit().putBoolean(v0.getString(2131952274), v5_1).apply();
            v0.v.edit().putString(v0.m0, v0.P[v1_6]).apply();
            v0.v.edit().putString(v0.k0, v0.O[v1_6]).apply();
            v0.B2.f();
            v0.D2.f();
            return;
        } else {
            return;
        }
    }
}
