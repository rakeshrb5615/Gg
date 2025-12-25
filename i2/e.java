package i2;
public final synthetic class e implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic Object b;
    public final synthetic Object c;
    public final synthetic Object d;
    public final synthetic Object e;

    public synthetic e(Object p1, Object p2, Object p3, Object p4, int p5)
    {
        this.a = p5;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        return;
    }

    public final void run()
    {
        i2.c v3_54 = 0;
        int v6_7 = this.e;
        android.widget.Button v7_11 = this.d;
        String v8_8 = this.c;
        String v9_11 = this.b;
        switch (this.a) {
            case 0:
                String v9_0 = ((i2.f) v9_11);
                String v8_0 = ((java.util.HashMap) v8_8);
                int v6_0 = ((java.util.HashMap) v6_7);
                android.widget.Button v0_3 = v9_0.a;
                if (v8_0.containsKey(v9_0.d)) {
                    android.widget.Button v7_2 = ((String) ((java.util.HashMap) v7_11).get(v9_0.d));
                    if ((((Long) v8_0.get(v9_0.d)) != null) && (v7_2 != null)) {
                        i2.c v3_5 = java.util.Currency.getInstance(v7_2);
                        android.widget.Button v7_4 = java.text.NumberFormat.getCurrencyInstance();
                        v7_4.setCurrency(v3_5);
                        v7_4.setMinimumFractionDigits(v3_5.getDefaultFractionDigits());
                        v7_4.setMaximumFractionDigits(v3_5.getDefaultFractionDigits());
                        i2.c v3_9 = ((String) v6_0.get(v9_0.d));
                        android.widget.Button v7_6 = new StringBuilder();
                        v7_6.append(v0_3.getString(2131952200));
                        v7_6.append(v3_9);
                        v9_0.K.setText(v7_6.toString());
                    }
                }
                if (v6_0.containsKey(v9_0.o)) {
                    i2.c v3_15 = ((String) v6_0.get(v9_0.o));
                    android.widget.Button v11_1 = new StringBuilder();
                    v11_1.append(v0_3.getString(2131951857));
                    v11_1.append(" - ");
                    v11_1.append(v3_15);
                    v9_0.L.setText(v11_1.toString());
                }
                if (v6_0.containsKey(v9_0.x)) {
                    i2.c v3_21 = ((String) v6_0.get(v9_0.x));
                    android.widget.Button v11_4 = new StringBuilder();
                    v11_4.append(v0_3.getString(2131951857));
                    v11_4.append(" - ");
                    v11_4.append(v3_21);
                    v9_0.C.setText(v11_4.toString());
                }
                if (v6_0.containsKey(v9_0.e)) {
                    i2.c v3_27 = ((String) v6_0.get(v9_0.e));
                    android.widget.Button v11_7 = new StringBuilder();
                    v11_7.append(v0_3.getString(2131952200));
                    v11_7.append(v3_27);
                    v9_0.O.setText(v11_7.toString());
                }
                if (v6_0.containsKey(v9_0.v)) {
                    i2.c v3_33 = ((String) v6_0.get(v9_0.v));
                    android.widget.Button v11_10 = new StringBuilder();
                    v11_10.append(v0_3.getString(2131951857));
                    v11_10.append(" - ");
                    v11_10.append(v3_33);
                    v9_0.N.setText(v11_10.toString());
                }
                if (v6_0.containsKey(v9_0.f)) {
                    i2.c v3_38 = new StringBuilder();
                    v3_38.append(v0_3.getString(2131952199));
                    v3_38.append(((String) v6_0.get(v9_0.f)));
                    v9_0.G.setText(v3_38.toString());
                }
                if (v6_0.containsKey(v9_0.m)) {
                    i2.c v3_43 = new StringBuilder();
                    v3_43.append(v0_3.getString(2131952200));
                    v3_43.append(((String) v6_0.get(v9_0.m)));
                    v9_0.H.setText(v3_43.toString());
                }
                if (v6_0.containsKey(v9_0.y)) {
                    i2.c v3_48 = new StringBuilder();
                    v3_48.append(v0_3.getString(2131951857));
                    v3_48.append(" - ");
                    v3_48.append(((String) v6_0.get(v9_0.y)));
                    v9_0.I.setText(v3_48.toString());
                }
                if (v6_0.containsKey(v9_0.q)) {
                    v9_0.M.setText(((CharSequence) v6_0.get(v9_0.q)));
                }
                android.widget.Button v0_15 = v9_0.D;
                if (v0_15 != null) {
                    v0_15.setOnClickListener(new i2.c(v9_0, 7));
                }
                android.widget.Button v0_17 = v9_0.A;
                if (v0_17 != null) {
                    v0_17.setOnClickListener(new i2.c(v9_0, 8));
                }
                android.widget.Button v0_18 = v9_0.E;
                if (v0_18 != null) {
                    v0_18.setOnClickListener(new i2.c(v9_0, 9));
                }
                android.widget.Button v0_20 = v9_0.B;
                if (v0_20 != null) {
                    v0_20.setOnClickListener(new i2.c(v9_0, 0));
                }
                android.widget.Button v0_21 = v9_0.C;
                if (v0_21 != null) {
                    v0_21.setOnClickListener(new i2.c(v9_0, 1));
                }
                android.widget.Button v0_22 = v9_0.G;
                if (v0_22 != null) {
                    v0_22.setOnClickListener(new i2.c(v9_0, 2));
                }
                android.widget.Button v0_23 = v9_0.H;
                if (v0_23 != null) {
                    v0_23.setOnClickListener(new i2.c(v9_0, 3));
                }
                android.widget.Button v0_24 = v9_0.I;
                if (v0_24 != null) {
                    v0_24.setOnClickListener(new i2.c(v9_0, 4));
                }
                android.widget.Button v0_25 = v9_0.F;
                if (v0_25 != null) {
                    v0_25.setOnClickListener(new i2.c(v9_0, 5));
                }
                android.widget.Button v0_26 = v9_0.J;
                if (v0_26 != null) {
                    v0_26.setOnClickListener(new i2.c(v9_0, 6));
                }
                return;
            case 1:
                String v8_9 = ((androidx.fragment.app.e0) v8_8);
                android.widget.Button v7_12 = ((androidx.fragment.app.e0) v7_11);
                int v6_8 = ((String) v6_7);
                android.widget.Button v0_34 = new androidx.fragment.app.a(((androidx.fragment.app.b1) v9_11));
                v0_34.b = 2130771996;
                v0_34.c = 2130771997;
                v0_34.d = 2130771996;
                v0_34.e = 2130771997;
                if (v8_9 != null) {
                    v0_34.h(v8_9);
                }
                v0_34.i(v7_12);
                if (!v0_34.h) {
                    throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                } else {
                    v0_34.g = 1;
                    v0_34.i = v6_8;
                    v0_34.e(0);
                    return;
                }
            case 2:
                String v9_2 = ((m5.c) v9_11);
                String v8_6 = ((String) v8_8);
                android.widget.Button v7_9 = ((java.util.Map) v7_11);
                int v6_2 = ((java.util.List) v6_7);
                android.widget.Button v0_19 = ((i5.g) v9_2.c);
                i2.c v1_7 = ((java.util.concurrent.atomic.AtomicMarkableReference) v9_2.n);
                if (((String) v1_7.getReference()) != null) {
                    i2.c v1_18 = ((String) v1_7.getReference());
                    String v4_2 = v0_19.a.b(v8_6, "user-data");
                    try {
                        String v9_6 = new i5.f();
                        v9_6.put("userId", v1_18);
                        i2.c v1_19 = v9_6.toString();
                        String v9_8 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(v4_2), i5.g.b));
                        try {
                            v9_8.write(v1_19);
                            v9_8.flush();
                            g5.g.b(v9_8, "Failed to close user metadata file.");
                        } catch (i2.c v1_20) {
                            v3_54 = v9_8;
                            android.util.Log.w("FirebaseCrashlytics", "Error serializing user metadata.", v1_20);
                            g5.g.b(v3_54, "Failed to close user metadata file.");
                        } catch (android.widget.Button v0_32) {
                            v3_54 = v9_8;
                            g5.g.b(v3_54, "Failed to close user metadata file.");
                            throw v0_32;
                        }
                    } catch (i2.c v1_20) {
                    } catch (android.widget.Button v0_32) {
                    }
                }
                if (!v7_9.isEmpty()) {
                    v0_19.h(v8_6, v7_9, 0);
                }
                if (!v6_2.isEmpty()) {
                    v0_19.i(v8_6, v6_2);
                }
                return;
            case 3:
                String v9_1 = ((l2.a0) v9_11);
                android.widget.Button v7_3 = ((androidx.fragment.app.e0) v7_11);
                int v6_1 = ((androidx.fragment.app.e0) v6_7);
                android.widget.Button v0_5 = new androidx.fragment.app.a(((androidx.fragment.app.b1) v8_8));
                if (v7_3 != null) {
                    v0_5.h(v7_3);
                }
                v0_5.i(v6_1);
                v0_5.e(0);
                v9_1.f2.post(new l2.e(v9_1, 2));
                return;
            default:
                String v9_3 = ((w2.a) v9_11);
                String v8_7 = ((r2.j) v8_8);
                android.widget.Button v0_27 = v8_7.a;
                android.widget.Button v7_10 = ((o2.h) v7_11);
                int v6_6 = ((r2.i) v6_7);
                v9_3.getClass();
                i2.c v1_16 = w2.a.f;
                h5.a v5_1 = v9_3.c.a(v0_27);
                if (v5_1 != null) {
                    ((y2.h) v9_3.e).y(new h5.a(v9_3, v8_7, ((p2.c) v5_1).a(v6_6), 6));
                    v7_10.a(0);
                    return;
                } else {
                    i2.c v3_65 = new StringBuilder("Transport backend \'");
                    v3_65.append(v0_27);
                    v3_65.append("\' is not registered");
                    android.widget.Button v0_30 = v3_65.toString();
                    v1_16.warning(v0_30);
                    v7_10.a(new IllegalArgumentException(v0_30));
                    return;
                }
        }
    }
}
