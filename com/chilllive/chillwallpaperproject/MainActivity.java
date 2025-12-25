package com.chilllive.chillwallpaperproject;
public class MainActivity extends h.i implements android.content.SharedPreferences$OnSharedPreferenceChangeListener, i2.n {
    public static final synthetic int u0;
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public i2.l R;
    public android.content.SharedPreferences S;
    public i2.v0 T;
    public android.hardware.SensorManager U;
    public android.hardware.Sensor V;
    public boolean W;
    public boolean X;
    public int[] Y;
    public int Z;
    public int a0;
    public android.content.Context b;
    public c4.e b0;
    public float c;
    public i2.f c0;
    public float d;
    public final i2.i0 d0;
    public android.view.ViewGroup e;
    public boolean e0;
    public android.widget.FrameLayout f;
    public android.widget.ImageView f0;
    public int g0;
    public int h0;
    public i2.e0 i0;
    public int j0;
    public int k0;
    public int l0;
    public n2.f m;
    public final i2.j0 m0;
    public android.opengl.GLSurfaceView n;
    public l2.a0 n0;
    public android.widget.LinearLayout o;
    public l2.d0 o0;
    public android.widget.LinearLayout p;
    public boolean p0;
    public android.widget.LinearLayout q;
    public android.view.ViewGroup q0;
    public final android.os.Handler r;
    public int r0;
    public final androidx.lifecycle.g0 s;
    public int s0;
    public String t;
    public i2.c0 t0;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    public MainActivity()
    {
        this.getSavedStateRegistry().c("androidx:appcompat", new b2.a(this));
        this.addOnContextAvailableListener(new h.h(this));
        this.r = new android.os.Handler();
        this.s = new androidx.lifecycle.g0(this, 6);
        new m2.a();
        this.X = 1;
        this.d0 = new i2.i0(this, 0);
        this.j0 = 2131886093;
        this.m0 = new i2.j0(this);
        return;
    }

    public static synthetic android.view.WindowInsets i(android.view.View p4, android.view.WindowInsets p5)
    {
        if (android.os.Build$VERSION.SDK_INT < 30) {
            p4.setPadding(p5.getSystemWindowInsetLeft(), p5.getSystemWindowInsetTop(), p5.getSystemWindowInsetRight(), p5.getSystemWindowInsetBottom());
            return p5;
        } else {
            int v5_1 = p5.getInsets(android.view.WindowInsets$Type.systemBars());
            p4.setPadding(v5_1.left, v5_1.top, v5_1.right, v5_1.bottom);
            return android.view.WindowInsets.CONSUMED;
        }
    }

    public final boolean dispatchTouchEvent(android.view.MotionEvent p2)
    {
        if (this.X) {
            this.T.r(p2);
            p2.getAction();
            return super.dispatchTouchEvent(p2);
        } else {
            return super.dispatchTouchEvent(p2);
        }
    }

    public void initializeBilling(android.view.View p3)
    {
        this.c0 = new i2.f(this, this.b, p3);
        return;
    }

    public final void j()
    {
        int v1_0 = 0;
        if (q4.b.l("TjDOnnINYlVAsmYolC+bV29g6SCDyb3iRtpbl3M2Y7XRggTkNcdhjKwxWbRcGKyB").equals(this.getApplicationContext().getPackageName())) {
            int[] v0_2 = new int[128];
            this.Y = v0_2;
            while(true) {
                int[] v0_3 = this.Y;
                if (v1_0 >= v0_3.length) {
                    break;
                }
                v0_3[v1_0] = ((int) (Math.sin(((double) v1_0)) * 4643176031446892544));
                v1_0++;
            }
            return;
        } else {
            this.T.b.p0(1065353216);
            this.T.b.l0(0);
            System.gc();
            return;
        }
    }

    public final void k(String p7)
    {
        androidx.fragment.app.l v1_0 = this.getSupportFragmentManager();
        int v3_1 = v1_0.B(p7);
        if ((v3_1 != 0) && (!v3_1.isVisible())) {
            i2.v v2_4 = ((androidx.fragment.app.e0) v1_0.c.f().stream().filter(new i2.g0()).findFirst().orElse(0));
            i2.e v0_6 = new i2.e(v1_0, v2_4, v3_1, p7, 1);
            if ((v2_4 == null) || (v2_4.getView() == null)) {
                androidx.fragment.app.l v1_3 = this.findViewById(2131362494);
                v1_3.animate().alpha(0).setDuration(200).withEndAction(new i2.v(v1_3, 2)).start();
                v0_6.run();
            } else {
                v2_4.getView().animate().alpha(0).setDuration(200).withEndAction(new androidx.fragment.app.l(this, v0_6, v2_4, 3)).start();
                return;
            }
        }
        return;
    }

    public final void l()
    {
        l2.a0 v0_2;
        l2.a0 v0_1 = this.R.o();
        this.p0 = v0_1;
        if (v0_1 == null) {
            v0_2 = this.a0;
        } else {
            v0_2 = this.Z;
        }
        if (this.q0 != null) {
            this.R.r(this.f, v0_2);
            this.R.q(this, this.f);
            i2.l v2_4 = ((android.widget.Button) this.findViewById(2131361935));
            ((android.widget.TextView) this.findViewById(2131362492)).setTextColor(v0_2);
            v2_4.setTextColor(v0_2);
            this.findViewById(2131362171).setBackgroundColor(v0_2);
            android.view.ViewGroup v1_6 = i2.l.n(v0_2);
            i2.l v2_5 = this.getWindow();
            if (android.os.Build$VERSION.SDK_INT < 30) {
                android.view.ViewGroup v1_7;
                int v3_2 = v2_5.getDecorView().getSystemUiVisibility();
                if (v1_6 == null) {
                    v1_7 = (v3_2 & -8209);
                } else {
                    v1_7 = (v3_2 | 8208);
                }
                v2_5.getDecorView().setSystemUiVisibility(v1_7);
            } else {
                i2.l v2_7 = v2_5.getInsetsController();
                if (v2_7 != null) {
                    android.view.ViewGroup v1_8;
                    if (v1_6 == null) {
                        v1_8 = 0;
                    } else {
                        v1_8 = 24;
                    }
                    v2_7.setSystemBarsAppearance(v1_8, 24);
                }
            }
            i2.l v2_9;
            if (!this.e0) {
                v2_9 = this.g0;
            } else {
                v2_9 = this.h0;
            }
            this.f0.setColorFilter(v2_9);
            android.view.ViewGroup v1_10 = this.o0;
            if (v1_10 != null) {
                android.view.ViewGroup v1_11 = v1_10.d;
                if (v1_11 != null) {
                    this.R.r(v1_11, v0_2);
                    this.R.q(this, v1_11);
                    l2.a0 v0_4 = this.n0;
                    if (v0_4 != null) {
                        v0_4.r();
                    }
                }
            }
        }
        return;
    }

    public final void m()
    {
        android.widget.FrameLayout v0_0 = this.n;
        if (v0_0 == null) {
            this.m = this.T.b;
            android.widget.FrameLayout v0_24 = new android.opengl.GLSurfaceView(this.b);
            this.n = v0_24;
            v0_24.setEGLContextClientVersion(2);
            this.n.setRenderer(this.m);
            this.n.setRenderMode(0);
            this.f = new android.widget.FrameLayout(this);
            this.e = ((android.widget.RelativeLayout) this.getLayoutInflater().inflate(2131558428, this.f, 0));
            if (this.n.getParent() != null) {
                ((android.view.ViewGroup) this.n.getParent()).removeView(this.n);
            }
            this.f.addView(this.n, new android.widget.FrameLayout$LayoutParams(-1, -1));
            if (this.e.getParent() != null) {
                ((android.view.ViewGroup) this.e.getParent()).removeView(this.e);
            }
            this.f.addView(this.e, new android.widget.FrameLayout$LayoutParams(-1, -1));
            this.setContentView(this.f);
            return;
        } else {
            v0_0.onResume();
            return;
        }
    }

    public final void n(int p5, int p6, int p7)
    {
        int v0_2;
        if (!this.R.o()) {
            v0_2 = this.s0;
        } else {
            v0_2 = this.r0;
        }
        i2.h v1_1 = new i2.h();
        android.os.Bundle v2_1 = new android.os.Bundle();
        v2_1.putInt("arg_title_res_id", p5);
        v2_1.putInt("arg_file_res_id", p6);
        v2_1.putInt("arg_background_color", v0_2);
        v2_1.putInt("arg_layout", 2131558455);
        v2_1.putInt("arg_layout2", 2131361920);
        v2_1.putInt("arg_layout3", p7);
        v1_1.setArguments(v2_1);
        v1_1.show(this.getSupportFragmentManager(), "ChangelogBottomSheetTag");
        return;
    }

    public void onClickLanguages(android.view.View p10)
    {
        android.app.Dialog v0_2 = new android.app.Dialog(new android.view.ContextThemeWrapper(this, 2132017452));
        v0_2.setContentView(a.a.n(this, v0_2, this, 2131558450));
        android.view.View v10_10 = ((com.google.android.material.radiobutton.MaterialRadioButton) v0_2.findViewById(2131361937));
        i2.b0 v1_6 = ((com.google.android.material.radiobutton.MaterialRadioButton) v0_2.findViewById(2131361938));
        int v2_3 = ((com.google.android.material.radiobutton.MaterialRadioButton) v0_2.findViewById(2131361936));
        com.google.android.material.radiobutton.MaterialRadioButton v3_2 = ((com.google.android.material.radiobutton.MaterialRadioButton) v0_2.findViewById(2131361939));
        if (v0_2.getWindow() != null) {
            int[] v4_3;
            if (!this.p0) {
                v4_3 = this.a0;
            } else {
                v4_3 = this.Z;
            }
            int v5_1;
            if (!i2.l.n(v4_3)) {
                v5_1 = 1053609165;
            } else {
                v5_1 = 1061997773;
            }
            android.content.res.ColorStateList v6_3 = new android.content.res.ColorStateList(new int[][] {new int[] {16842912}), new int[] {-16842912})}), new int[] {i2.l.d(v4_3, this.S.getInt(this.Q, -1), ((double) v5_1)), v4_3}));
            v10_10.setButtonTintList(v6_3);
            v1_6.setButtonTintList(v6_3);
            v2_3.setButtonTintList(v6_3);
            v3_2.setButtonTintList(v6_3);
        }
        v0_2.findViewById(2131362138).setOnClickListener(new i2.h0(v0_2, 0));
        int[] v4_7 = j5.t1.y();
        int v5_6 = v4_7.toLowerCase(java.util.Locale.ROOT);
        if (!v5_6.startsWith("fr")) {
            if (!v5_6.startsWith("ja")) {
                if ((!v5_6.contains("zh")) && (!v5_6.contains("tw"))) {
                    v10_10.setChecked(1);
                } else {
                    v3_2.setChecked(1);
                }
            } else {
                v2_3.setChecked(1);
            }
        } else {
            v1_6.setChecked(1);
        }
        int v5_9 = new java.util.concurrent.atomic.AtomicReference(v4_7);
        v10_10.setOnClickListener(new i2.a0(v5_9, 3));
        v1_6.setOnClickListener(new i2.a0(v5_9, 0));
        v2_3.setOnClickListener(new i2.a0(v5_9, 1));
        v3_2.setOnClickListener(new i2.a0(v5_9, 2));
        v0_2.findViewById(2131362139).setOnClickListener(new i2.b0(0, v0_2, v5_9));
        v0_2.show();
        return;
    }

    public void onClickSettingsButton(android.view.View p1)
    {
        this.X = 0;
        this.n0.f();
        this.n0.r();
        this.k(this.L);
        return;
    }

    public void onClickStoreButton(android.view.View p1)
    {
        this.X = 0;
        String v1_1 = this.o0;
        v1_1.f();
        v1_1.g();
        this.k(this.M);
        return;
    }

    public final void onCreate(android.os.Bundle p12)
    {
        int v2_33;
        super.onCreate(p12);
        j5.t1.R(this.getWindow(), 0);
        this.setContentView(2131558428);
        l2.d0 v12_89 = this.getApplicationContext();
        this.b = v12_89;
        l2.d0 v12_13 = ((android.view.WindowManager) v12_89.getSystemService("window")).getDefaultDisplay();
        androidx.fragment.app.a v1_2 = new android.graphics.Point();
        v12_13.getRealSize(v1_2);
        this.c = ((float) Math.min(v1_2.y, v1_2.x));
        l2.d0 v12_51 = ((android.view.WindowManager) this.b.getSystemService("window")).getDefaultDisplay();
        androidx.fragment.app.a v1_6 = new android.graphics.Point();
        v12_51.getRealSize(v1_6);
        l2.d0 v12_55 = ((float) Math.max(v1_6.y, v1_6.x));
        this.d = v12_55;
        androidx.fragment.app.a v1_8 = this.c;
        if (this.getResources().getConfiguration().orientation != 1) {
            v2_33 = 0;
        } else {
            v2_33 = 1;
        }
        this.W = v2_33;
        if (v2_33 == 0) {
            this.c = Math.max(v1_8, v12_55);
            this.d = Math.min(v1_8, v12_55);
        } else {
            this.c = Math.min(v1_8, v12_55);
            this.d = Math.max(v1_8, v12_55);
        }
        this.T = new i2.v0(this.b, this.m, this.c, this.d, this.W);
        this.registerForActivityResult(new androidx.fragment.app.x0(4), new a5.t(19));
        if (c4.b.a == null) {
            String v4_106 = this.getApplicationContext();
            if (v4_106 == null) {
                v4_106 = this;
            } else {
            }
            c4.b.a = new c4.g(new c4.f(v4_106, 0));
        }
        l2.d0 v12_5;
        l2.d0 v12_92 = ((c4.e) c4.b.a.a.zza());
        this.b0 = v12_92;
        int v2_0 = v12_92.a;
        l2.d0 v12_2 = v12_92.c.getPackageName();
        android.content.SharedPreferences$Editor v5_0 = v2_0.a;
        if (v5_0 != null) {
            c4.l.e.h("requestUpdateInfo(%s)", new Object[] {v12_2}));
            int v6_2 = new com.google.android.gms.tasks.TaskCompletionSource();
            v5_0.a().post(new c4.h(v5_0, v6_2, v6_2, new c4.h(v2_0, v6_2, v12_2, v6_2), 2));
            v12_5 = v6_2.getTask();
        } else {
            l2.d0 v12_6 = c4.l.e;
            v12_6.getClass();
            if (android.util.Log.isLoggable("PlayCore", 6)) {
                android.util.Log.e("PlayCore", d4.l.j(v12_6.b, "onError(%d)", new Object[] {Integer.valueOf(-9)})));
            }
            v12_5 = com.google.android.gms.tasks.Tasks.forException(new e4.a(-9));
        }
        v12_5.addOnSuccessListener(new a5.a(this, 8));
        l2.d0 v12_14 = new i2.e0(this);
        this.i0 = v12_14;
        try {
            String v4_6 = this.b0.b;
        } catch (String v0_2) {
            throw v0_2;
        }
        int v7_3 = new Object[0];
        v4_6.a.h("registerListener", v7_3);
        v4_6.d.add(v12_14);
        v4_6.a();
        this.t = this.getString(2131952057);
        this.u = this.getString(2131952246);
        this.v = this.getString(2131952391);
        this.w = this.getString(2131952262);
        this.x = this.b.getString(2131952214);
        this.y = this.getString(2131952361);
        this.z = this.getString(2131952103);
        this.A = this.getString(2131951695);
        this.B = this.b.getString(2131951749);
        this.C = this.b.getString(2131952244);
        this.K = this.getString(2131951815);
        this.getString(2131951939);
        this.E = this.getString(2131952326);
        this.F = this.getString(2131951799);
        this.G = this.getString(2131952322);
        this.H = this.getString(2131951912);
        this.I = this.getString(2131952478);
        this.J = this.getString(2131952417);
        this.D = this.getString(2131952500);
        this.L = this.getString(2131952332);
        this.M = this.getString(2131952352);
        this.N = this.getString(2131952397);
        this.O = this.getString(2131951785);
        this.P = this.getString(2131951803);
        this.Q = this.getString(2131952433);
        this.e = ((android.view.ViewGroup) this.findViewById(2131362114));
        this.findViewById(2131362494);
        this.q0 = ((android.view.ViewGroup) this.findViewById(2131362495));
        this.Z = e0.c.getColor(this.b, 2131099794);
        this.a0 = e0.c.getColor(this.b, 2131100822);
        this.r0 = e0.c.getColor(this.b, 2131099684);
        this.s0 = e0.c.getColor(this.b, 2131099685);
        this.R = i2.l.l(this.b);
        this.m();
        String v4_24 = j5.t1.y();
        if (!v4_24.equals("fr")) {
            if ((!v4_24.equals("ja")) && (!v4_24.equals("ja-jp"))) {
                if ((!v4_24.equals("zh")) && (!v4_24.equals("zh-hant-tw"))) {
                    this.k0 = 2131886089;
                    this.j0 = 2131886085;
                    this.l0 = 2131886093;
                } else {
                    this.k0 = 2131886092;
                    this.j0 = 2131886088;
                    this.l0 = 2131886096;
                }
            } else {
                this.k0 = 2131886091;
                this.j0 = 2131886087;
                this.l0 = 2131886095;
            }
        } else {
            this.k0 = 2131886090;
            this.j0 = 2131886086;
            this.l0 = 2131886094;
        }
        ((android.widget.LinearLayout) this.findViewById(2131362148)).setOnClickListener(new i2.z(this, 1));
        ((android.widget.LinearLayout) this.findViewById(2131362360)).setOnClickListener(new i2.z(this, 2));
        this.p = ((android.widget.LinearLayout) this.findViewById(2131362098));
        this.q = ((android.widget.LinearLayout) this.findViewById(2131362140));
        ((android.widget.LinearLayout) this.findViewById(2131361959)).setOnClickListener(new i2.z(this, 3));
        this.findViewById(2131362453);
        this.findViewById(2131362399);
        this.o = ((android.widget.LinearLayout) this.findViewById(2131361982));
        this.f0 = ((android.widget.ImageView) this.findViewById(2131362589));
        this.g0 = this.getColor(2131100823);
        this.h0 = this.getColor(2131100824);
        String v4_69 = ((android.widget.ImageButton) this.findViewById(2131362175));
        v4_69.setOnClickListener(new i2.d0(this, v4_69, 0));
        String v4_72 = ((android.widget.ImageButton) this.findViewById(2131362174));
        v4_72.setOnClickListener(new i2.d0(this, v4_72, 1));
        String v4_75 = ((android.widget.ImageButton) this.findViewById(2131362173));
        v4_75.setOnClickListener(new i2.d0(this, v4_75, 2));
        String v4_77 = j5.t1.z(this.b);
        this.S = v4_77;
        v4_77.registerOnSharedPreferenceChangeListener(this.t0);
        this.t0 = new i2.c0();
        String v4_82 = Integer.parseInt(this.getResources().getString(2131952321));
        this.onSharedPreferenceChanged(this.S, "");
        android.content.SharedPreferences$Editor v5_33 = this.S.edit();
        v5_33.putString(this.getResources().getString(2131952322), Integer.toString(v4_82));
        v5_33.apply();
        l2.d0 v12_57 = this.getWindow();
        v12_57.setFormat(1);
        j5.t1.R(v12_57, 0);
        v12_57.addFlags(-2147483648);
        v12_57.clearFlags(67108864);
        String v4_87 = e0.c.getColor(this.getBaseContext(), 2131100813);
        android.content.SharedPreferences$Editor v5_35 = android.os.Build$VERSION.SDK_INT;
        if (v5_35 <= 34) {
            v12_57.setStatusBarColor(v4_87);
            v12_57.setNavigationBarColor(v4_87);
        }
        if (v5_35 < 30) {
            v12_57.getDecorView().setSystemUiVisibility(1792);
        } else {
            v12_57.setDecorFitsSystemWindows(0);
        }
        l2.d0 v12_59 = this.findViewById(2131362114);
        if (v12_59 != null) {
            v12_59.setOnApplyWindowInsetsListener(new i2.f0());
        }
        this.Y = 0;
        l2.d0 v12_62 = new android.util.TypedValue();
        if (this.getTheme().resolveAttribute(16843499, v12_62, 1)) {
            this.S.edit().putInt(this.getString(2131951656), android.util.TypedValue.complexToDimensionPixelSize(v12_62.data, this.getResources().getDisplayMetrics())).apply();
        }
        q4.f.h(this.getApplicationContext());
        this.getOnBackPressedDispatcher().a(new androidx.fragment.app.t0(this), this);
        this.o.setOnClickListener(new i2.z(this, 0));
        this.p.setOnClickListener(new i2.z(this, 4));
        this.q.setOnClickListener(new i2.z(this, 6));
        l2.d0 v12_74 = ((android.hardware.SensorManager) this.b.getSystemService("sensor"));
        this.U = v12_74;
        this.V = v12_74.getDefaultSensor(4);
        this.getApplication().registerActivityLifecycleCallbacks(new m3.d(new m3.f()));
        this.l();
        l2.d0 v12_77 = this.getSupportFragmentManager();
        if (v12_77.B(this.L) == null) {
            String v0_13 = new l2.a0();
            androidx.fragment.app.a v1_12 = new androidx.fragment.app.a(v12_77);
            v1_12.c(2131362114, v0_13, this.L, 1);
            v1_12.h(v0_13);
            v1_12.f();
        }
        if (v12_77.B(this.M) == null) {
            String v0_17 = new l2.d0();
            androidx.fragment.app.a v1_14 = new androidx.fragment.app.a(v12_77);
            v1_14.c(2131362114, v0_17, this.M, 1);
            v1_14.h(v0_17);
            v1_14.f();
        }
        this.n0 = ((l2.a0) this.getSupportFragmentManager().B(this.L));
        this.o0 = ((l2.d0) this.getSupportFragmentManager().B(this.M));
        return;
    }

    public final void onDestroy()
    {
        super.onDestroy();
        this.S.unregisterOnSharedPreferenceChangeListener(this.t0);
        this.r.removeCallbacks(this.s);
        this.R = 0;
        android.view.ViewGroup v1_11 = this.T;
        if (v1_11 != null) {
            v1_11.g();
            this.T = 0;
        }
        this.m.l0(1);
        android.view.ViewGroup v1_1 = this.n;
        if (v1_1 != null) {
            v1_1.onPause();
            if (this.n.getParent() != null) {
                ((android.view.ViewGroup) this.n.getParent()).removeView(this.n);
            }
            this.n = 0;
        }
        this.U.unregisterListener(this.d0);
        this.b0.a(this.i0);
        return;
    }

    public final void onPause()
    {
        super.onPause();
        android.view.Choreographer.getInstance().removeFrameCallback(this.m0);
        this.n.onPause();
        this.r.removeCallbacks(this.s);
        this.S.unregisterOnSharedPreferenceChangeListener(this.t0);
        return;
    }

    public final void onResume()
    {
        super.onResume();
        this.U.registerListener(this.d0, this.V, 2);
        int v2_0 = 0;
        if (this.S.getBoolean(this.getString(2131951952), 0)) {
            this.S.edit().putInt(this.t, ((int) (m2.a.a() / 1015580809))).apply();
        }
        int v8;
        android.view.Choreographer.getInstance().postFrameCallback(this.m0);
        this.c0.a();
        if (this.getResources().getConfiguration().orientation != 1) {
            v8 = 0;
        } else {
            v8 = 1;
        }
        this.W = v8;
        if (this.T == null) {
            this.T = new i2.v0(this.b, this.m, this.c, this.d, v8);
        }
        this.m();
        this.S.registerOnSharedPreferenceChangeListener(this);
        this.r.post(this.s);
        android.widget.Button v0_13 = this.m;
        if (v0_13.q != null) {
            v0_13.p0((((float) this.S.getInt(this.K, 0)) * 1008981770));
        }
        android.widget.Button v0_17;
        android.widget.Button v0_16 = this.getSupportFragmentManager().d;
        if (v0_16 == null) {
            v0_17 = 0;
        } else {
            v0_17 = v0_16.size();
        }
        if (v0_17 > null) {
            android.widget.Button v0_19 = this.findViewById(2131362494);
            v0_19.animate().alpha(0).setDuration(((long) this.getResources().getInteger(17694720))).withEndAction(new i2.v(v0_19, 3));
        }
        boolean v1_1;
        android.widget.Button v0_22 = ((android.widget.Button) this.findViewById(2131361935));
        boolean v1_0 = this.b;
        android.content.ComponentName v3_1 = android.app.WallpaperManager.getInstance(v1_0).getWallpaperInfo();
        if (v3_1 != null) {
            v1_1 = new android.content.ComponentName(v1_0, com.chilllive.chillwallpaperproject.MyWallpaperService).equals(v3_1.getComponent());
        } else {
            v1_1 = 0;
        }
        if (v1_1) {
            v2_0 = 8;
        }
        v0_22.setVisibility(v2_0);
        this.l();
        return;
    }

    public final void onSharedPreferenceChanged(android.content.SharedPreferences p4, String p5)
    {
        if ((this.T != null) && (p5)) {
            this.n.queueEvent(new androidx.fragment.app.l(this, p5, p4, 2));
            boolean v4_4 = this.p0;
            boolean v5_1 = this.R.o();
            this.p0 = v5_1;
            if (v5_1 != v4_4) {
                this.l();
            }
            boolean v4_1 = this.n0;
            // Both branches of the condition point to the same code.
            // if ((v4_1) && (!v4_1.isAdded())) {
            // }
        }
        return;
    }

    public final void onStop()
    {
        super.onStop();
        this.n.onPause();
        this.U.unregisterListener(this.d0);
        this.b0.a(this.i0);
        return;
    }

    public void onclickContact(android.view.View p3)
    {
        this.n(2131951782, 0, 4);
        return;
    }

    public void onclickHelp(android.view.View p3)
    {
        this.n(2131951882, this.j0, 0);
        return;
    }

    public void onclickHelpSettings(android.view.View p3)
    {
        i2.y.b(p3);
        this.n(2131952395, 0, 1);
        return;
    }

    public void onclickInfoSettings(android.view.View p3)
    {
        i2.y.b(p3);
        this.n(2131951961, 0, 2);
        return;
    }

    public void setWallpaper(android.view.View p4)
    {
        android.widget.Toast v4_5 = new android.content.Intent("android.service.wallpaper.CHANGE_LIVE_WALLPAPER");
        v4_5.putExtra("android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT", new android.content.ComponentName(this, com.chilllive.chillwallpaperproject.MyWallpaperService));
        this.startActivity(v4_5);
        return;
    }
}
