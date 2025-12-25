package l2;
public final synthetic class d implements android.view.View$OnClickListener {
    public final synthetic int a;
    public final synthetic l2.a0 b;

    public synthetic d(l2.a0 p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onClick(android.view.View p13)
    {
        switch (this.a) {
            case 0:
                String v1_5;
                boolean v13_5 = this.b;
                i2.y.b(v13_5.y);
                if (!v13_5.V1) {
                    v1_5 = 200;
                } else {
                    v1_5 = 400;
                }
                i2.y.h(v13_5.c, v1_5, 8);
                i2.y.h(v13_5.o, v1_5, 4);
                i2.y.h(v13_5.z, v1_5, 4);
                i2.y.h(v13_5.B, v1_5, 4);
                i2.y.h(v13_5.A, v1_5, 4);
                i2.y.h(v13_5.C, v1_5, 4);
                i2.y.h(v13_5.f, v1_5, 4);
                String v0_19 = (v13_5.V1 ^ 1);
                v13_5.V1 = v0_19;
                v13_5.y.setSelected(v0_19);
                String v0_20 = v13_5.b;
                if (v0_20 != null) {
                    ((com.chilllive.chillwallpaperproject.MainActivity) v0_20).X = v13_5.V1;
                }
                return;
            case 1:
                boolean v13_33 = this.b;
                i2.y.b(v13_33.E);
                String v0_39 = v13_33.v.getBoolean(v13_33.K0, 0);
                String v1_18 = (v0_39 ^ 1);
                v13_33.v.edit().putBoolean(v13_33.K0, v1_18).apply();
                v13_33.E.setSelected(v1_18);
                if (v0_39 != null) {
                    v13_33.v.edit().putBoolean(v13_33.C1, 0).apply();
                } else {
                    v13_33.v.edit().putBoolean(v13_33.G0, 0).apply();
                    i2.y.a(v13_33.H, 0, ((float) i2.k0.a.nextInt(1440)), 1000);
                }
                return;
            case 2:
                String v0_32 = this.b;
                v0_32.getClass();
                i2.y.b(p13);
                String v1_12 = 1;
                p13.setSelected(1);
                int v2_6 = v0_32.q2;
                if (p13 != v2_6) {
                    v2_6.setSelected(0);
                } else {
                    v0_32.r2.setSelected(0);
                }
                if (p13 != v0_32.q2) {
                    v1_12 = 0;
                }
                if ((v1_12 == null) && ((!v0_32.k1) || (!v0_32.j1))) {
                    v0_32.I();
                }
                v0_32.v.edit().putInt(v0_32.z0, 100).apply();
                v0_32.v.edit().putInt(v0_32.z0, 0).apply();
                v0_32.v.edit().putBoolean(v0_32.getString(2131951838), v1_12).apply();
                v0_32.Z1.P1 = v1_12;
                v0_32.v.edit().putString(v0_32.A0, String.valueOf(i2.k0.a.nextInt(900000))).apply();
                return;
            case 3:
                boolean v13_6 = this.b;
                i2.y.b(v13_6.F);
                i2.y.a(v13_6.H, 0, ((float) Math.round((v13_6.h1 / 1015580809))), 1000);
                return;
            case 4:
                boolean v13_8 = this.b;
                i2.y.b(v13_8.G);
                i2.y.a(v13_8.H, 0, ((float) Math.round((v13_8.i1 / 1015580809))), 1000);
                return;
            default:
                boolean v13_9;
                String v0_22 = this.b;
                i2.y.b(v0_22.A2);
                String v1_8 = v0_22.a;
                int v2_4 = v0_22.t1;
                String v0_24 = v0_22.getString(2131952242);
                int v3_5 = android.view.LayoutInflater.from(v1_8).inflate(2131558553, 0);
                int v4_3 = new android.widget.PopupWindow(v3_5, -2, -2, 1);
                v4_3.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
                v4_3.setOutsideTouchable(1);
                int v8_0 = new int[2];
                p13.getLocationOnScreen(v8_0);
                v4_3.setAnimationStyle(2132018017);
                v4_3.showAtLocation(p13, 0, (((p13.getWidth() / 2) + v8_0[0]) - (v3_5.getMeasuredWidth() / 2)), (p13.getHeight() + v8_0[1]));
                v4_3.showAtLocation(p13, 0, (((p13.getWidth() / 2) + v8_0[int v7]) - (v3_5.getMeasuredWidth() / 2)), (p13.getHeight() + v8_0[1]));
                if (v2_4 == 0) {
                    v13_9 = 2131099685;
                } else {
                    v13_9 = 2131099684;
                }
                int v4_5 = new android.graphics.drawable.GradientDrawable();
                v4_5.setColor(e0.c.getColor(v1_8, v13_9));
                v4_5.setCornerRadius(android.util.TypedValue.applyDimension(1, 1105199104, v1_8.getResources().getDisplayMetrics()));
                v3_5.setBackground(v4_5);
                boolean v13_17 = ((android.widget.TextView) v3_5.findViewById(2131362537));
                v13_17.setText(v0_24);
                String v0_29 = e0.c.getColor(v1_8, 2131100821);
                int vtmp27 = e0.c.getColor(v1_8, 2131100822);
                if (v2_4 == 0) {
                    v0_29 = vtmp27;
                }
                v13_17.setTextColor(v0_29);
                return;
        }
    }
}
