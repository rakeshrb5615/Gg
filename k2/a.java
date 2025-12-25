package k2;
public final synthetic class a implements com.google.android.gms.tasks.OnCompleteListener {
    public final synthetic k2.c a;
    public final synthetic boolean b;
    public final synthetic com.chilllive.chillwallpaperproject.MainActivity c;
    public final synthetic android.content.Context d;
    public final synthetic android.content.SharedPreferences e;

    public synthetic a(k2.c p1, boolean p2, com.chilllive.chillwallpaperproject.MainActivity p3, android.content.Context p4, android.content.SharedPreferences p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public final void onComplete(com.google.android.gms.tasks.Task p13)
    {
        if (p13.isSuccessful()) {
            if (this.b) {
                android.widget.ScrollView v0_7 = ((m6.j) q4.f.d().b(m6.j)).a();
                g0.k v2_5 = this.d;
                int v3_2 = this.e;
                int v1_9 = v3_2.getBoolean(v2_5.getString(2131951777), 0);
                android.app.Dialog v5_1 = q4.b.l("9+/TXGl6Q0c1lCfQWC6WPg==");
                k2.b v6_3 = v0_7.f;
                String v7_0 = n6.j.f;
                boolean v8_0 = n6.j.e;
                n6.d v9 = v6_3.c;
                boolean v10_0 = n6.j.b(v9, v5_1);
                if (!v10_0) {
                    k2.b v6_5 = n6.j.b(v6_3.d, v5_1);
                    if (v6_5 != null) {
                        if (!v8_0.matcher(v6_5).matches()) {
                            if (v7_0.matcher(v6_5).matches()) {
                                android.widget.ScrollView v0_10 = ((j2.j) this.a.c);
                                if (v0_10 != null) {
                                    v0_10.d = ((m6.j) q4.f.d().b(m6.j)).a().a(q4.b.l("EsHRYyAys99gO4XPhP1w8g=="));
                                }
                                return;
                            }
                        } else {
                            if (v1_9 == 0) {
                                android.widget.ScrollView v0_16 = v0_7.a("message");
                                android.app.Dialog v5_4 = new android.app.Dialog(new android.view.ContextThemeWrapper(v2_5, 2132017452));
                                int v1_14 = a.a.n(this.c, v5_4, v2_5, 2131558452);
                                if (v5_4.getWindow() != null) {
                                    k2.b v6_10 = ((android.widget.TextView) v1_14.findViewById(2131362025));
                                    v6_10.setText(v2_5.getString(2131951780));
                                    v6_10.setSingleLine(0);
                                    k2.b v6_13 = ((android.widget.TextView) v1_14.findViewById(2131362021));
                                    v6_13.setSingleLine(0);
                                    v6_13.setText(v0_16);
                                    android.widget.ScrollView v0_21 = ((android.widget.Button) v1_14.findViewById(2131362017));
                                    v0_21.setText(v2_5.getString(2131951778));
                                    v0_21.setOnClickListener(new k2.b(v3_2, v2_5, v5_4, 0));
                                    ((android.widget.Button) v1_14.findViewById(2131362022)).setOnClickListener(new i2.h0(v5_4, 1));
                                    android.widget.ScrollView v0_6 = ((android.widget.ScrollView) v1_14.findViewById(2131362024));
                                    v0_6.post(new g0.k(v0_6, ((int) android.util.TypedValue.applyDimension(1, 1128792064, v0_6.getResources().getDisplayMetrics())), 2));
                                }
                            }
                        }
                    }
                    n6.j.c(v5_1, "Boolean");
                } else {
                    if (!v8_0.matcher(v10_0).matches()) {
                        if (!v7_0.matcher(v10_0).matches()) {
                        } else {
                            v6_3.a(v5_1, v9.c());
                        }
                    } else {
                        v6_3.a(v5_1, v9.c());
                    }
                }
            }
        }
        return;
    }
}
