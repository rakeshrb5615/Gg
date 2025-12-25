package l2;
public final synthetic class o implements android.view.View$OnClickListener {
    public final synthetic l2.a0 a;
    public final synthetic android.content.Context b;
    public final synthetic android.view.View c;
    public final synthetic android.widget.RadioButton d;
    public final synthetic android.app.Dialog e;
    public final synthetic android.widget.RadioButton f;

    public synthetic o(l2.a0 p1, android.content.Context p2, android.view.View p3, android.widget.RadioButton p4, android.app.Dialog p5, android.widget.RadioButton p6)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        return;
    }

    public final void onClick(android.view.View p23)
    {
        android.content.SharedPreferences$Editor v1_0 = this.a;
        v1_0.getClass();
        j2.j v3_10 = this.b;
        android.content.SharedPreferences$Editor v2_41 = ((android.view.inputmethod.InputMethodManager) v3_10.getSystemService("input_method"));
        if (v2_41 != null) {
            v2_41.hideSoftInputFromWindow(this.c.getWindowToken(), 0);
        }
        android.app.Dialog v5_2 = this.e;
        if (!this.d.isChecked()) {
            if (this.f.isChecked()) {
                android.content.SharedPreferences$Editor v2_39 = v1_0.R1.getText().toString().trim();
                int v7_6 = v1_0.S1.getText().toString();
                int v8_2 = v1_0.T1.getText().toString();
                try {
                    long v16;
                    double v11 = 4651998512748167168;
                } catch (NumberFormatException) {
                    android.widget.Toast.makeText(v3_10, 2131952469, 1).show();
                }
                if (v7_6.isEmpty()) {
                    v16 = 4651998512748167168;
                } else {
                    v16 = Double.parseDouble(v7_6);
                }
                if (!v8_2.isEmpty()) {
                    v11 = Double.parseDouble(v8_2);
                }
                int v7_16;
                double v18 = v11;
                if ((v16 < -4587338432941916160) || ((v16 > 4636033603912859648) || ((v18 < -4582834833314545664) || (v18 > 4640537203540230144)))) {
                    v7_16 = 0;
                } else {
                    v7_16 = 1;
                }
                int v8_3 = v2_39.isEmpty();
                if (v7_16 == 0) {
                    if (v8_3 != 0) {
                        android.widget.Toast.makeText(v3_10, 2131952469, 1).show();
                        v1_0.v.edit().putBoolean(v1_0.G1, 0).apply();
                        return;
                    } else {
                        v1_0.v.edit().putBoolean(v1_0.G1, 1).apply();
                        j2.j v3_14 = v1_0.u1;
                        k2.c v6_0 = new k2.c(v1_0, v2_39, 28, 0);
                        if (!v3_14.a(0)) {
                            v3_14.b(v2_39, v6_0);
                        }
                        v5_2.dismiss();
                        return;
                    }
                } else {
                    v1_0.v.edit().putBoolean(v1_0.G1, 0).apply();
                    v1_0.v.edit().putBoolean(v1_0.G1, 0).apply();
                    v1_0.u1.c(v16, v18, 0, new i2.m(v1_0, 0));
                    v5_2.dismiss();
                    return;
                }
            }
            return;
        } else {
            if (v1_0.M2) {
                v1_0.v.edit().putBoolean(v1_0.I0, 0).apply();
            } else {
                if (!v1_0.L2) {
                    v1_0.u();
                    v1_0.k();
                    android.widget.Toast.makeText(v1_0.a, 2131952456, 0).show();
                } else {
                    v1_0.h1 = v1_0.v.getFloat(v1_0.x1, 1086324736);
                    v1_0.i1 = v1_0.v.getFloat(v1_0.y1, 1099956224);
                    v1_0.v.edit().putFloat(v1_0.z1, v1_0.h1).apply();
                    v1_0.v.edit().putFloat(v1_0.A1, v1_0.i1).apply();
                    if (e0.c.checkSelfPermission(v1_0.Y1, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                        v1_0.N2.a("android.permission.ACCESS_COARSE_LOCATION");
                    } else {
                        v1_0.v1.a(1);
                    }
                }
            }
            v1_0.v.edit().putBoolean(v1_0.G1, 0).apply();
            v5_2.dismiss();
            return;
        }
    }
}
