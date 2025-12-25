package k2;
public final synthetic class b implements android.view.View$OnClickListener {
    public final synthetic int a;
    public final synthetic Object b;
    public final synthetic Object c;
    public final synthetic Object d;

    public synthetic b(Object p1, Object p2, Object p3, int p4)
    {
        this.a = p4;
        this.c = p1;
        this.b = p2;
        this.d = p3;
        return;
    }

    public synthetic b(l2.a0 p1, android.view.KeyEvent$Callback p2, Object p3, int p4)
    {
        this.a = p4;
        this.c = p1;
        this.d = p2;
        this.b = p3;
        return;
    }

    public final void onClick(android.view.View p21)
    {
        switch (this.a) {
            case 0:
                android.graphics.drawable.InsetDrawable v3_7 = ((android.app.Dialog) this.d);
                ((android.content.SharedPreferences) this.c).edit().putBoolean(((android.content.Context) this.b).getString(2131951777), 1).apply();
                v3_7.dismiss();
                return;
            case 1:
                android.graphics.drawable.InsetDrawable v3_19 = ((l2.a0) this.c);
                int v1_22 = ((com.google.android.material.materialswitch.MaterialSwitch) this.d);
                android.graphics.drawable.ColorDrawable v4_16 = ((android.content.Context) this.b);
                v3_19.t(v1_22);
                if (!v3_19.M2) {
                    android.widget.RadioButton v6_2;
                    int v5_4 = new android.view.ContextThemeWrapper(v4_16, 2132017452);
                    android.app.Dialog v7_1 = new android.app.Dialog(v5_4);
                    int v5_5 = android.view.LayoutInflater.from(v5_4);
                    android.widget.RadioButton v6_14 = v7_1.getWindow();
                    java.util.Objects.requireNonNull(v6_14);
                    int v5_6 = v5_5.inflate(2131558451, ((android.view.ViewGroup) v6_14.getDecorView()), 0);
                    v7_1.setContentView(v5_6);
                    android.widget.RadioButton v6_0 = v7_1.getWindow();
                    java.util.Objects.requireNonNull(v6_0);
                    v6_0.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
                    if (!v3_19.t1) {
                        v6_2 = 2131099685;
                    } else {
                        v6_2 = 2131099684;
                    }
                    android.widget.RadioButton v8_3 = new android.graphics.drawable.GradientDrawable();
                    v8_3.setColor(e0.c.getColor(v4_16, v6_2));
                    v8_3.setCornerRadius(android.util.TypedValue.applyDimension(1, 1105199104, v4_16.getResources().getDisplayMetrics()));
                    v5_6.setBackground(v8_3);
                    android.widget.RadioButton v6_9 = ((android.widget.RadioButton) v5_6.findViewById(2131361932));
                    android.widget.RadioButton v8_6 = ((android.widget.RadioButton) v5_6.findViewById(2131361933));
                    com.google.android.material.button.MaterialButton v11_3 = ((com.google.android.material.button.MaterialButton) v5_6.findViewById(2131362168));
                    com.google.android.material.button.MaterialButton v12_2 = ((com.google.android.material.button.MaterialButton) v5_6.findViewById(2131362167));
                    android.view.ViewGroup v13_2 = ((android.view.ViewGroup) v5_6.findViewById(2131362179));
                    v3_19.O1 = ((com.google.android.material.textfield.TextInputLayout) v5_6.findViewById(2131362145));
                    v3_19.P1 = ((com.google.android.material.textfield.TextInputLayout) v5_6.findViewById(2131362146));
                    v3_19.Q1 = ((com.google.android.material.textfield.TextInputLayout) v5_6.findViewById(2131362147));
                    v3_19.R1 = ((android.widget.EditText) v5_6.findViewById(2131362123));
                    v3_19.S1 = ((android.widget.EditText) v5_6.findViewById(2131362124));
                    v3_19.T1 = ((android.widget.EditText) v5_6.findViewById(2131362125));
                    v3_19.U1 = ((android.widget.ImageView) v5_6.findViewById(2131362020));
                    try {
                        android.view.Window v2_2 = v3_19.v.getString(v3_19.getString(2131951920), "");
                    } catch (ClassCastException) {
                        v3_19.v.edit().remove("lastLocation").apply();
                    }
                    if (!v2_2.isEmpty()) {
                        v3_19.R1.setText(v2_2);
                    }
                    long v16;
                    android.view.Window v2_4 = v3_19.v.getString(v3_19.E1, 0);
                    com.google.android.material.textfield.TextInputLayout v10_2 = v3_19.v.getString(v3_19.F1, 0);
                    if (v2_4 == null) {
                        v16 = 4651998512748167168;
                    } else {
                        v16 = Double.parseDouble(v2_4);
                    }
                    long v18;
                    if (v10_2 == null) {
                        v18 = 4651998512748167168;
                    } else {
                        v18 = Double.parseDouble(v10_2);
                    }
                    if (v16 != 4651998512748167168) {
                        v3_19.S1.setText(String.valueOf(v16));
                    }
                    if (v18 != 4651998512748167168) {
                        v3_19.T1.setText(String.valueOf(v18));
                    }
                    android.view.Window v2_16;
                    android.view.Window v2_9 = v3_19.R1;
                    v2_9.addTextChangedListener(new l2.x(v3_19, v2_9));
                    android.view.Window v2_10 = v3_19.S1;
                    v2_10.addTextChangedListener(new l2.x(v3_19, v2_10));
                    android.view.Window v2_11 = v3_19.T1;
                    v2_11.addTextChangedListener(new l2.x(v3_19, v2_11));
                    v3_19.l(v3_19.R1);
                    v3_19.l(v3_19.S1);
                    v3_19.l(v3_19.T1);
                    if (!v3_19.t1) {
                        v2_16 = v3_19.T;
                    } else {
                        v2_16 = v3_19.S;
                    }
                    v3_19.x.c(v3_19.Y1, ((android.view.ViewGroup) v5_6), 0);
                    com.google.android.material.textfield.TextInputLayout v10_12 = v3_19.U1;
                    android.content.res.ColorStateList v14_31 = v10_12.getDrawable();
                    if (v14_31 == null) {
                        android.content.res.ColorStateList v14_32 = v14_31.mutate();
                        v14_32.setTint(v2_16);
                        v10_12.setImageDrawable(v14_32);
                    }
                    com.google.android.material.textfield.TextInputLayout v10_14;
                    if (!i2.l.n(v2_16)) {
                        v10_14 = 1053609165;
                    } else {
                        v10_14 = 1061997773;
                    }
                    int v9_2 = i2.l.d(v2_16, v3_19.v.getInt(v3_19.a1, -1), ((double) v10_14));
                    com.google.android.material.textfield.TextInputLayout v10_16 = new android.content.res.ColorStateList(new int[][] {new int[] {16842912}), new int[] {-16842912})}), new int[] {v9_2, v2_16}));
                    v11_3.setTextColor(v9_2);
                    v12_2.setTextColor(v9_2);
                    v6_9.setButtonTintList(v10_16);
                    v8_6.setButtonTintList(v10_16);
                    com.google.android.material.textfield.TextInputLayout v10_17 = v3_19.O1;
                    v10_17.setBoxStrokeColor(v9_2);
                    v10_17.setDefaultHintTextColor(android.content.res.ColorStateList.valueOf(v2_16));
                    com.google.android.material.textfield.TextInputLayout v10_18 = v3_19.P1;
                    v10_18.setBoxStrokeColor(v9_2);
                    v10_18.setDefaultHintTextColor(android.content.res.ColorStateList.valueOf(v2_16));
                    com.google.android.material.textfield.TextInputLayout v10_19 = v3_19.Q1;
                    v10_19.setBoxStrokeColor(v9_2);
                    v10_19.setDefaultHintTextColor(android.content.res.ColorStateList.valueOf(v2_16));
                    v7_1.setOnCancelListener(new l2.m(v3_19, v1_22));
                    v6_9.setOnClickListener(new l2.n(v13_2, 0));
                    v12_2.setOnClickListener(new k2.b(v3_19, v7_1, v1_22, 3));
                    v8_6.setOnClickListener(new l2.n(v13_2, 1));
                    v11_3.setOnClickListener(new l2.o(v3_19, v4_16, v5_6, v6_9, v7_1, v8_6));
                    v7_1.show();
                    int v1_9 = ((int) android.util.TypedValue.applyDimension(1, 1103101952, v4_16.getResources().getDisplayMetrics()));
                    android.view.Window v2_31 = v7_1.getWindow();
                    if (v2_31 != null) {
                        v2_31.setBackgroundDrawable(new android.graphics.drawable.InsetDrawable(new android.graphics.drawable.ColorDrawable(0), v1_9));
                    }
                }
                return;
            case 2:
                int v1_2 = ((l2.a0) this.c);
                android.view.Window v2_1 = ((android.view.View) this.b);
                android.graphics.drawable.InsetDrawable v3_1 = ((java.util.concurrent.atomic.AtomicBoolean) this.d);
                v1_2.getClass();
                i2.y.b(v2_1);
                v2_1.setSelected((v2_1.isSelected() ^ 1));
                v3_1.set(v1_2.v.getBoolean(v1_2.G0, 0));
                android.view.Window v2_27 = v3_1.get();
                v1_2.v.edit().putBoolean(v1_2.G0, (v2_27 ^ 1)).apply();
                if (v2_27 == null) {
                    v1_2.v.edit().putBoolean(v1_2.K0, 0).apply();
                    v1_2.E.setSelected(0);
                    i2.y.a(v1_2.H, 0, ((float) ((int) (m2.a.a() / 1015580809))), 1000);
                    v1_2.G2 = 0;
                }
                v1_2.A();
                v1_2.J(v2_27);
                v1_2.s();
                v1_2.B2.f();
                v1_2.w();
                return;
            case 3:
                int v1_19 = ((l2.a0) this.c);
                android.view.Window v2_38 = ((android.app.Dialog) this.d);
                android.graphics.drawable.InsetDrawable v3_20 = ((com.google.android.material.materialswitch.MaterialSwitch) this.b);
                v1_19.getClass();
                v2_38.dismiss();
                v1_19.t(v3_20);
                return;
            default:
                ((l2.a0) this.c).v.edit().putBoolean(((String) this.b), ((android.widget.CheckBox) this.d).isChecked()).apply();
                return;
        }
    }
}
