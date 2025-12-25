package i2;
public class h extends h3.j implements android.view.View$OnClickListener {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public float J;
    public float K;
    public int L;
    public int M;
    public int N;
    public android.content.SharedPreferences O;
    public android.content.Context a;
    public i2.l b;
    public android.widget.TextView c;
    public android.widget.LinearLayout d;
    public android.widget.LinearLayout e;
    public android.widget.LinearLayout f;
    public android.widget.LinearLayout m;
    public android.widget.ScrollView n;
    public android.widget.TextView o;
    public android.widget.TextView p;
    public android.widget.TextView q;
    public android.widget.TextView r;
    public android.widget.TextView s;
    public android.widget.TextView t;
    public android.widget.TextView u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    public h()
    {
        this.J = 1086324736;
        this.K = 1099956224;
        return;
    }

    public final int getTheme()
    {
        return 2132017788;
    }

    public final void onClick(android.view.View p6)
    {
        if (p6 != this.d) {
            if (p6 != this.e) {
                if (p6 != this.f) {
                    if (p6 == this.m) {
                        c4.b.b0(this.getActivity(), this.a);
                    }
                    return;
                } else {
                    c4.b.F(this.a);
                    return;
                }
            } else {
                c4.b.K(this.requireActivity(), p6.getContext());
                return;
            }
        } else {
            android.content.Context v6_4 = this.getString(2131951821);
            androidx.fragment.app.j0 v0_5 = this.getString(2131952377);
            int v1_1 = this.getString(2131951824);
            android.content.Intent v2_1 = new android.content.Intent("android.intent.action.SENDTO", android.net.Uri.parse("mailto:"));
            v2_1.putExtra("android.intent.extra.EMAIL", new String[] {v6_4}));
            v2_1.putExtra("android.intent.extra.SUBJECT", v0_5);
            v2_1.putExtra("android.intent.extra.TEXT", v1_1);
            android.content.Context v6_9 = android.content.Intent.createChooser(v2_1, "Say Hello! \u1f44b");
            if (v2_1.resolveActivity(this.requireActivity().getPackageManager()) == null) {
                android.widget.Toast.makeText(this.getContext(), "No email app installed.", 0).show();
                return;
            } else {
                this.startActivity(v6_9);
                return;
            }
        }
    }

    public final android.view.View onCreateView(android.view.LayoutInflater p2, android.view.ViewGroup p3, android.os.Bundle p4)
    {
        return p2.inflate(this.requireArguments().getInt("arg_layout"), p3, 0);
    }

    public final void onStart()
    {
        super.onStart();
        android.view.Window v0_2 = this.getDialog();
        if (v0_2 != null) {
            android.view.Window v0_3 = v0_2.findViewById(2131362011);
            if (v0_3 != null) {
                v0_3.post(new a5.i(8, this, v0_3));
            }
        }
        android.view.Window v0_0 = this.getDialog();
        if (v0_0 != null) {
            android.view.Window v0_1 = v0_0.getWindow();
            if ((v0_1 != null) && (this.getArguments() != null)) {
                q0.t1 v2_4;
                this.N = v0_1.getNavigationBarColor();
                int v1_4 = this.getArguments().getInt("arg_background_color");
                v0_1.setNavigationBarColor(v1_4);
                int v3_1 = new v3.f(v0_1.getDecorView());
                q0.t1 v2_2 = android.os.Build$VERSION.SDK_INT;
                if (v2_2 < 35) {
                    if (v2_2 < 30) {
                        v2_4 = new q0.t1(v0_1, v3_1);
                    } else {
                        v2_4 = new q0.u1(v0_1, v3_1);
                    }
                } else {
                    v2_4 = new q0.w1(v0_1, v3_1);
                }
                int v1_7 = (i2.l.n(v1_4) ^ 1);
                v2_4.P(v1_7);
                v0_1.setStatusBarColor(0);
                v2_4.Q(v1_7);
            }
        }
        return;
    }

    public final void onStop()
    {
        super.onStop();
        int v0_0 = this.getDialog();
        if (v0_0 != 0) {
            int v0_4 = v0_0.getWindow();
            if (v0_4 != 0) {
                q0.t1 v1_3;
                v0_4.setNavigationBarColor(this.N);
                v3.f v2_1 = new v3.f(v0_4.getDecorView());
                q0.t1 v1_1 = android.os.Build$VERSION.SDK_INT;
                if (v1_1 < 35) {
                    if (v1_1 < 30) {
                        v1_3 = new q0.t1(v0_4, v2_1);
                    } else {
                        v1_3 = new q0.u1(v0_4, v2_1);
                    }
                } else {
                    v1_3 = new q0.w1(v0_4, v2_1);
                }
                v1_3.P((i2.l.n(this.N) ^ 1));
            }
        }
        return;
    }

    public final void onViewCreated(android.view.View p17, android.os.Bundle p18)
    {
        i2.h v1 = this;
        super.onViewCreated(p17, p18);
        i2.l v0_84 = this.requireContext().getApplicationContext();
        this.a = v0_84;
        this.O = j5.t1.z(v0_84);
        this.v = this.getString(2131952397);
        this.w = this.getString(2131952398);
        this.x = this.getString(2131952190);
        this.y = this.getString(2131952192);
        this.B = this.getString(2131952111);
        this.z = this.getResources().getString(2131952369);
        this.A = this.getResources().getString(2131952375);
        this.C = this.getString(2131952113);
        this.D = this.getResources().getString(2131951963);
        this.E = this.getResources().getString(2131951932);
        this.G = this.getResources().getString(2131952493);
        this.F = this.getResources().getString(2131951928);
        this.getResources().getString(2131951931);
        this.getString(2131951796);
        this.getResources().getString(2131951809);
        this.H = this.getString(2131952366);
        this.I = this.getString(2131952372);
        this.b = i2.l.l(this.requireContext());
        android.widget.LinearLayout v3_1 = ((android.widget.LinearLayout) p17.findViewById(this.requireArguments().getInt("arg_layout2")));
        this.c = ((android.widget.TextView) p17.findViewById(2131362520));
        int v5_1 = ((android.widget.TextView) p17.findViewById(2131361988));
        this.L = e0.c.getColor(this.a, 2131099794);
        this.M = e0.c.getColor(this.a, 2131100822);
        String v7_0 = 2;
        if (this.getArguments() != null) {
            i2.l v0_13 = this.getArguments().getInt("arg_file_res_id");
            this.c.setText(this.getString(v1.getArguments().getInt("arg_title_res_id")));
            if (v0_13 != null) {
                i2.l v0_18 = new java.util.Scanner(this.getResources().openRawResource(v0_13)).useDelimiter("\\A").next();
                android.widget.TextView v9_8 = new android.text.SpannableStringBuilder();
                i2.l v0_19 = v0_18.split("\\r?\\n");
                String v10_3 = v0_19.length;
                String v11_0 = 0;
                while (v11_0 < v10_3) {
                    String v12_0 = v0_19[v11_0];
                    int v13 = v9_8.length();
                    v9_8.append(v12_0);
                    int v14_0 = v9_8.length();
                    if (!v12_0.startsWith("##")) {
                        if (v12_0.startsWith("#")) {
                            android.widget.TextView v6_4 = (v13 + 1);
                            if ((v12_0.length() > 1) && (v12_0.charAt(1) == 32)) {
                                v6_4 = (v13 + 2);
                            }
                            v9_8.delete(v13, v6_4);
                            v9_8.setSpan(new android.text.style.RelativeSizeSpan(1067450368), v13, (v14_0 - (v6_4 - v13)), 33);
                        }
                    } else {
                        int v15_3 = (v13 + 2);
                        if ((v12_0.length() > v7_0) && (v12_0.charAt(v7_0) == 32)) {
                            v15_3 = (v13 + 3);
                        }
                        v9_8.delete(v13, v15_3);
                        v9_8.setSpan(new android.text.style.RelativeSizeSpan(1069547520), v13, (v14_0 - (v15_3 - v13)), 33);
                    }
                    v9_8.append("\n");
                    v11_0++;
                    v7_0 = 2;
                }
                v5_1.setText(v9_8);
            }
        }
        if (this.requireArguments().getInt("arg_layout3") != 1) {
            if (this.requireArguments().getInt("arg_layout3") != 2) {
                if (this.requireArguments().getInt("arg_layout3") != 3) {
                    if (this.requireArguments().getInt("arg_layout3") == 4) {
                        i2.g v4_10;
                        this.d = ((android.widget.LinearLayout) p17.findViewById(2131361984));
                        this.e = ((android.widget.LinearLayout) p17.findViewById(2131362338));
                        this.f = ((android.widget.LinearLayout) p17.findViewById(2131362306));
                        this.m = ((android.widget.LinearLayout) p17.findViewById(2131362402));
                        this.d.setOnClickListener(this);
                        v1.e.setOnClickListener(this);
                        v1.f.setOnClickListener(this);
                        v1.m.setOnClickListener(this);
                        i2.l v0_54 = ((android.view.ViewGroup) p17.findViewById(2131361919));
                        v0_54.setVisibility(0);
                        p17.findViewById(2131361988).setVisibility(8);
                        if (!this.b.o()) {
                            v4_10 = this.M;
                        } else {
                            v4_10 = this.L;
                        }
                        v0_54.post(new c.l(this, v0_54, v4_10));
                    }
                } else {
                    i2.l v0_58 = ((android.view.ViewGroup) p17.findViewById(2131362535));
                    v0_58.setVisibility(0);
                    p17.findViewById(2131361988).setVisibility(8);
                    v0_58.post(new i2.g(this, v0_58, 1));
                }
            } else {
                i2.g v4_22;
                i2.l v0_61 = ((android.view.ViewGroup) p17.findViewById(2131362532));
                v0_61.setVisibility(0);
                p17.findViewById(2131361988).setVisibility(8);
                i2.g v4_20 = this.O.getFloat(this.v, 1093664768);
                int v5_8 = v1.O.getFloat(v1.w, 1102577664);
                android.widget.TextView v6_16 = this.B;
                if (v4_20 >= 0) {
                    android.widget.TextView v6_17 = u.e.b(v6_16);
                    v6_17.append(m2.a.b(v4_20));
                    v4_22 = v6_17.toString();
                } else {
                    i2.g v4_23 = u.e.b(v6_16);
                    v4_23.append(this.x);
                    v4_22 = v4_23.toString();
                }
                int v5_10;
                android.widget.TextView v6_19 = this.C;
                if (v5_8 >= 0) {
                    android.widget.TextView v6_20 = u.e.b(v6_19);
                    v6_20.append(m2.a.b(v5_8));
                    v5_10 = v6_20.toString();
                } else {
                    int v5_11 = u.e.b(v6_19);
                    v5_11.append(this.y);
                    v5_10 = v5_11.toString();
                }
                this.J = this.O.getFloat(this.H, 1086324736);
                this.K = this.O.getFloat(this.I, 1099956224);
                android.widget.TextView v6_27 = new StringBuilder();
                v6_27.append(this.z);
                v6_27.append(m2.a.b(this.J));
                android.widget.TextView v6_28 = v6_27.toString();
                String v7_13 = new StringBuilder();
                v7_13.append(this.A);
                v7_13.append(m2.a.b(this.K));
                String v7_14 = v7_13.toString();
                String v8_11 = u.e.b(v1.a.n(new StringBuilder(), this.D, " "));
                android.widget.TextView v9_10 = this.O;
                try {
                    String v11_2 = v9_10.getString("lastLocation", this.F);
                } catch (ClassCastException) {
                    v9_10.edit().remove("lastLocation").apply();
                }
                v8_11.append(v11_2);
                String v8_12 = v8_11.toString();
                android.widget.TextView v9_13 = this.O;
                String v10_6 = this.G;
                try {
                    String v11_4 = v9_13.getString(v10_6, this.E);
                } catch (ClassCastException) {
                    v9_13.edit().remove(v10_6).apply();
                }
                android.widget.TextView v9_16 = this.O;
                try {
                    String v12_3 = v9_16.getString("lastProviderUpdate", this.E);
                } catch (ClassCastException) {
                    v9_16.edit().remove("lastProviderUpdate").apply();
                }
                this.p = ((android.widget.TextView) v0_61.findViewById(2131362467));
                this.o = ((android.widget.TextView) v0_61.findViewById(2131362465));
                this.q = ((android.widget.TextView) v0_61.findViewById(2131362218));
                this.r = ((android.widget.TextView) v0_61.findViewById(2131362219));
                this.s = ((android.widget.TextView) v0_61.findViewById(2131362166));
                this.t = ((android.widget.TextView) v0_61.findViewById(2131362142));
                this.u = ((android.widget.TextView) v0_61.findViewById(2131362141));
                this.o.setText(v6_28);
                this.p.setText(v7_14);
                this.q.setText(v4_22);
                this.r.setText(v5_10);
                this.s.setText(v8_12);
                this.t.setText(v11_4);
                this.u.setText(v12_3);
                v0_61.post(new i2.g(this, v0_61, 0));
            }
        } else {
            i2.l v0_76;
            i2.l v0_72 = ((android.widget.ScrollView) p17.findViewById(2131362400));
            this.n = v0_72;
            v0_72.setVisibility(0);
            p17.findViewById(2131361988).setVisibility(8);
            if (!this.b.o()) {
                v0_76 = this.M;
            } else {
                v0_76 = this.L;
            }
            this.b.r(this.n, v0_76);
        }
        i2.l v0_80;
        i2.l v0_78 = this.b.o();
        android.view.View vtmp81 = p17.findViewById(2131361961);
        if (v0_78 == null) {
            v0_80 = this.M;
        } else {
            v0_80 = this.L;
        }
        vtmp81.setBackgroundColor(v0_80);
        this.b.q(this.requireActivity(), v3_1);
        return;
    }
}
