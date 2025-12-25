package i2;
public final class n0 extends android.service.wallpaper.WallpaperService$Engine {
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
    public boolean L;
    public boolean M;
    public boolean N;
    public final android.os.BatteryManager O;
    public final android.os.PowerManager P;
    public final java.util.concurrent.ConcurrentLinkedQueue Q;
    public long R;
    public long S;
    public final i2.i0 T;
    public final d4.k U;
    public android.opengl.EGLDisplay V;
    public android.opengl.EGLContext W;
    public android.opengl.EGLSurface X;
    public Thread Y;
    public volatile boolean Z;
    public android.content.Context a;
    public volatile boolean a0;
    public i2.v0 b;
    public long b0;
    public n2.f c;
    public long c0;
    public final android.os.Handler d;
    public final synthetic com.chilllive.chillwallpaperproject.MyWallpaperService d0;
    public final i2.m0 e;
    public final android.os.Handler f;
    public final i2.m0 g;
    public float h;
    public float i;
    public boolean j;
    public i2.q k;
    public j2.j l;
    public android.content.SharedPreferences m;
    public boolean n;
    public i2.o0 o;
    public final m2.a p;
    public android.hardware.SensorManager q;
    public android.hardware.Sensor r;
    public String s;
    public String t;
    public boolean u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    public n0(com.chilllive.chillwallpaperproject.MyWallpaperService p3)
    {
        this.d0 = p3;
        super(p3);
        super.d = new android.os.Handler();
        super.e = new i2.m0(super, 0);
        super.f = new android.os.Handler();
        super.g = new i2.m0(super, 1);
        super.j = 1;
        super.n = 1;
        super.p = new m2.a();
        super.M = 0;
        super.O = ((android.os.BatteryManager) p3.getSystemService("batterymanager"));
        super.P = ((android.os.PowerManager) p3.getSystemService("power"));
        super.Q = new java.util.concurrent.ConcurrentLinkedQueue();
        super.T = new i2.i0(super, 1);
        super.U = new d4.k(super, 2);
        super.V = android.opengl.EGL14.EGL_NO_DISPLAY;
        super.W = android.opengl.EGL14.EGL_NO_CONTEXT;
        super.X = android.opengl.EGL14.EGL_NO_SURFACE;
        super.Z = 0;
        super.a0 = 0;
        super.b0 = 0;
        super.c0 = 0;
        return;
    }

    public static void a(i2.n0 p3)
    {
        if (p3.N) {
            try {
                if (android.os.Build$VERSION.SDK_INT >= 27) {
                    boolean v0_6 = p3.getSurfaceHolder();
                    if ((v0_6) && ((v0_6.getSurface().isValid()) && (!p3.L))) {
                        p3.notifyColorsChanged();
                    }
                }
            } catch (Exception) {
            }
            p3.N = 0;
        }
        p3.f.postDelayed(p3.g, 2500);
        return;
    }

    public final void b()
    {
        int v0_0 = this.O;
        if (v0_0 != 0) {
            int v5_3;
            int v0_1 = v0_0.getIntProperty(4);
            boolean v1_2 = this.m.getBoolean(this.A, 0);
            boolean v2_1 = this.m.getBoolean(this.B, 0);
            int v4_2 = this.m.getInt(this.C, 15);
            int v5_2 = this.P.isPowerSaveMode();
            boolean vtmp6 = this.m.getBoolean(this.D, 0);
            if ((v5_2 == 0) || (!vtmp6)) {
                v5_3 = 0;
            } else {
                v5_3 = 1;
            }
            if ((!v1_2) && ((v5_3 == 0) && ((!v2_1) || (v0_1 > v4_2)))) {
                this.a0 = 0;
                return;
            } else {
                this.a0 = 1;
            }
        }
        return;
    }

    public final void c()
    {
        android.opengl.EGLContext v0_0 = this.V;
        if ((v0_0 != null) && (v0_0 != android.opengl.EGL14.EGL_NO_DISPLAY)) {
            android.opengl.EGL14.eglMakeCurrent(v0_0, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_CONTEXT);
            android.opengl.EGLContext v0_6 = this.X;
            if ((v0_6 != null) && (v0_6 != android.opengl.EGL14.EGL_NO_SURFACE)) {
                android.opengl.EGL14.eglDestroySurface(this.V, v0_6);
                this.X = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            android.opengl.EGLContext v0_2 = this.W;
            if ((v0_2 != null) && (v0_2 != android.opengl.EGL14.EGL_NO_CONTEXT)) {
                android.opengl.EGL14.eglDestroyContext(this.V, v0_2);
                this.W = android.opengl.EGL14.EGL_NO_CONTEXT;
            }
            android.opengl.EGL14.eglReleaseThread();
            android.opengl.EGL14.eglTerminate(this.V);
            this.V = android.opengl.EGL14.EGL_NO_DISPLAY;
        }
        return;
    }

    public final void d()
    {
        RuntimeException v0_0 = this.getSurfaceHolder();
        if (v0_0.getSurface().isValid()) {
            android.opengl.EGLDisplay v2 = android.opengl.EGL14.eglGetDisplay(0);
            if (v2 == android.opengl.EGL14.EGL_NO_DISPLAY) {
                throw new RuntimeException("Unable to get EGL14 display");
            } else {
                android.opengl.EGLConfig v3_1 = new int[2];
                if (!android.opengl.EGL14.eglInitialize(v2, v3_1, 0, v3_1, 1)) {
                    throw new RuntimeException("Unable to initialize EGL14");
                } else {
                    android.opengl.EGLConfig v3_4 = new int[13];
                    v3_4 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12352, 4, 12344};
                    int[] v5_0 = new android.opengl.EGLConfig[1];
                    long v8_0 = new int[1];
                    if (!android.opengl.EGL14.eglChooseConfig(v2, v3_4, 0, v5_0, 0, 1, v8_0, 0)) {
                        throw new RuntimeException("eglChooseConfig failed");
                    } else {
                        android.opengl.EGLConfig v3_6 = v5_0[0];
                        android.opengl.EGLContext v4_3 = android.opengl.EGL14.eglCreateContext(v2, v3_6, android.opengl.EGL14.EGL_NO_CONTEXT, new int[] {12440, 2, 12344}), 0);
                        if ((v4_3 == null) || (v4_3 == android.opengl.EGL14.EGL_NO_CONTEXT)) {
                            throw new RuntimeException("Failed to create EGL context");
                        } else {
                            android.opengl.EGLSurface v6_3 = android.opengl.EGL14.EGL_NO_SURFACE;
                            int v7_1 = 0;
                            while (v7_1 < 3) {
                                try {
                                    v6_3 = android.opengl.EGL14.eglCreateWindowSurface(v2, v3_6, v0_0, new int[] {12344}), 0);
                                } catch (Throwable) {
                                }
                                if (v6_3 != null) {
                                    if (v6_3 != android.opengl.EGL14.EGL_NO_SURFACE) {
                                        break;
                                    }
                                }
                                long v8_3 = android.opengl.EGL14.eglGetError();
                                String v9_2 = new StringBuilder("Surface creation failed (try ");
                                v7_1++;
                                v9_2.append(v7_1);
                                v9_2.append("/3). EGL Error: ");
                                v9_2.append(v8_3);
                                android.util.Log.w("GLWallpaper", v9_2.toString());
                                Thread.sleep(50);
                            }
                            if ((v6_3 == null) || (v6_3 == android.opengl.EGL14.EGL_NO_SURFACE)) {
                                throw new RuntimeException("Failed to create EGL surface after 3 attempts");
                            } else {
                                if (!android.opengl.EGL14.eglMakeCurrent(v2, v6_3, v6_3, v4_3)) {
                                    throw new RuntimeException("eglMakeCurrent failed");
                                } else {
                                    android.opengl.EGL14.eglSwapInterval(v2, 1);
                                    this.V = v2;
                                    this.W = v4_3;
                                    this.X = v6_3;
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return;
        }
    }

    public final void e()
    {
        if (this.Y == null) {
            Thread v0_4 = this.b;
            if (v0_4 != null) {
                this.Z = 1;
                Thread v1_0 = new Thread(new a5.i(9, this, v0_4), "GLRenderThread");
                this.Y = v1_0;
                v1_0.setPriority(5);
                this.Y.start();
                return;
            }
        }
        return;
    }

    public final void f()
    {
        this.Z = 0;
        int v0_5 = this.Y;
        if (v0_5 != 0) {
            v0_5.interrupt();
            try {
                this.Y.join(2000);
            } catch (InterruptedException) {
                Thread.currentThread().interrupt();
            }
            if (this.Y.isAlive()) {
                android.util.Log.e("WallpaperEngine", "Thread stuck! Giving up to prevent ANR.");
            }
            this.Y = 0;
        }
        return;
    }

    public final android.app.WallpaperColors onComputeColors()
    {
        android.app.WallpaperColors v0_0 = this.b;
        if ((v0_0 == null) || (android.os.Build$VERSION.SDK_INT < 27)) {
            return 0;
        } else {
            return v0_0.m();
        }
    }

    public final void onCreate(android.view.SurfaceHolder p12)
    {
        android.content.Context v2_5;
        super.onCreate(p12);
        android.content.SharedPreferences v12_1 = this.d0;
        this.a = v12_1.getApplicationContext();
        this.L = this.isPreview();
        long v0_2 = ((android.view.WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        android.content.Context v2_1 = new android.graphics.Point();
        v0_2.getRealSize(v2_1);
        this.h = ((float) Math.min(v2_1.y, v2_1.x));
        long v0_22 = ((android.view.WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        long v1_41 = new android.graphics.Point();
        v0_22.getRealSize(v1_41);
        long v0_26 = ((float) Math.max(v1_41.y, v1_41.x));
        this.i = v0_26;
        long v1_43 = this.h;
        if (v0_26 <= v1_43) {
            v2_5 = 0;
        } else {
            v2_5 = 1;
        }
        this.n = v2_5;
        if (v2_5 == null) {
            this.h = Math.max(v1_43, v0_26);
            this.i = Math.min(v1_43, v0_26);
        } else {
            this.h = Math.min(v1_43, v0_26);
            this.i = Math.max(v1_43, v0_26);
        }
        i2.v0 v5_1 = new i2.v0(this.a, this.c, this.h, this.i, this.n);
        this.b = v5_1;
        this.c = v5_1.b;
        this.m = j5.t1.z(this.a);
        this.o = i2.o0.c(this.a);
        long v0_37 = this.a.getResources();
        this.v = v0_37.getString(2131952301);
        v0_37.getString(2131951967);
        this.y = v0_37.getString(2131951825);
        this.w = v0_37.getString(2131951954);
        this.x = v0_37.getString(2131951874);
        v0_37.getString(2131951934);
        v0_37.getString(2131951970);
        v0_37.getString(2131951621);
        this.z = v0_37.getString(2131951622);
        this.s = v0_37.getString(2131952493);
        this.t = v0_37.getString(2131951903);
        this.A = v0_37.getString(2131951696);
        this.B = v0_37.getString(2131951691);
        this.C = v0_37.getString(2131951692);
        this.D = v0_37.getString(2131952236);
        this.E = v0_37.getString(2131952326);
        this.F = v0_37.getString(2131951799);
        this.G = v0_37.getString(2131952269);
        this.H = v0_37.getString(2131952264);
        this.I = v0_37.getString(2131952275);
        this.J = v0_37.getString(2131951923);
        this.K = v0_37.getString(2131951925);
        v0_37.getString(2131952478);
        long v0_4 = new j2.j(this.a);
        this.l = v0_4;
        this.k = new i2.q(this.a, v0_4);
        long v0_7 = ((android.hardware.SensorManager) this.a.getSystemService("sensor"));
        this.q = v0_7;
        long v0_8 = v0_7.getDefaultSensor(4);
        this.r = v0_8;
        if (v0_8 != 0) {
            this.u = 1;
        } else {
            this.u = 0;
            this.m.edit().putBoolean(this.x, 0).apply();
        }
        v12_1.registerReceiver(this.U, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.M = 1;
        this.R = this.m.getLong(this.J, 0);
        return;
    }

    public final void onDestroy()
    {
        super.onDestroy();
        if (this.M) {
            this.d0.unregisterReceiver(this.U);
            this.M = 0;
        }
        i2.v0 v0_3 = this.b;
        if (v0_3 != null) {
            v0_3.g();
        }
        return;
    }

    public final void onSurfaceChanged(android.view.SurfaceHolder p8, int p9, int p10, int p11)
    {
        int[] v0_0 = this.T;
        super.onSurfaceChanged(p8, p9, p10, p11);
        if ((p10 > 0) && (p11 > null)) {
            int v1_0;
            this.h = ((float) p10);
            this.i = ((float) p11);
            int v8_1 = 0;
            if (p11 <= p10) {
                v1_0 = 0;
            } else {
                v1_0 = 1;
            }
            this.n = v1_0;
            this.f();
            int v1_1 = this.b;
            if (v1_1 != 0) {
                v1_1.g();
                this.b = 0;
            }
            int v1_4 = new i2.v0(this.a, this.c, ((float) p10), ((float) p11), this.n);
            this.b = v1_4;
            i2.l0 v2_1 = v1_4.b;
            this.c = v2_1;
            v2_1.A = 1;
            v1_4.g = this.n;
            v1_4.e = ((float) p10);
            v1_4.f = ((float) p11);
            v1_4.I1 = 1;
            v1_4.C();
            int v1_5 = this.c;
            i2.l0 v2_3 = this.b;
            i2.v0 v3_1 = v1_5.d;
            if (v3_1 != null) {
                v3_1.g();
            }
            v1_5.d = v2_3;
            this.e();
            this.Q.add(new i2.l0(this, p10, p11));
            if ((!this.m.getBoolean(this.x, 1)) || (!this.u)) {
                if (this.u) {
                    this.q.unregisterListener(v0_0);
                }
            } else {
                this.q.registerListener(v0_0, this.r, 2);
            }
            String v9_6 = this.n;
            if (v9_6 != null) {
                i2.v0 v11_3 = this.b;
                int[] v0_1 = v11_3.J0;
                if ((v0_1 != null) && (v0_1[0] != 0)) {
                    v8_1 = v11_3.S1[0];
                }
                if (v8_1 == p10) {
                    v11_3.o(((float) p10), ((float) p11), v9_6);
                }
            }
            this.b.c(this.v);
        }
        return;
    }

    public final void onSurfaceDestroyed(android.view.SurfaceHolder p2)
    {
        super.onSurfaceDestroyed(p2);
        this.f();
        this.b.g();
        this.c.l0(1);
        return;
    }

    public final void onTouchEvent(android.view.MotionEvent p3)
    {
        super.onTouchEvent(p3);
        if (p3.getPointerCount() >= 1) {
            this.b.r(p3);
            p3.getAction();
            return;
        } else {
            return;
        }
    }

    public final void onVisibilityChanged(boolean p19)
    {
        i2.n0 v0 = this;
        this.j = p19;
        if (!p19) {
            this.f();
            this.d.removeCallbacks(this.e);
            v0.f.removeCallbacks(v0.g);
            if (this.u) {
                this.q.unregisterListener(this.T);
            }
            return;
        } else {
            int v12_5;
            this.m.edit().putBoolean(this.G, 1).apply();
            i2.v0 v1_34 = this.m.getInt(this.E, 0);
            i2.m0 v2_22 = this.o;
            boolean v5_27 = this.b;
            boolean[] v6_22 = Integer.valueOf(4);
            int v8_4 = Integer.valueOf(2);
            int v10_3 = Integer.valueOf(8);
            int v11_0 = v2_22.b();
            i2.m0 v2_27 = v2_22.d();
            if (((v11_0 & 1) != 0) || (((v11_0 & 32) != 0) || (((v11_0 & 64) != 0) || (((v11_0 & 256) != 0) || ((v11_0 & 128) != 0))))) {
                v12_5 = 0;
            } else {
                v12_5 = 1;
            }
            int v9_12;
            if ((8 & v11_0) == 0) {
                v9_12 = 0;
            } else {
                v9_12 = 1;
            }
            if (v12_5 != 0) {
                long v14_3 = new java.util.HashMap();
                v14_3.put(v8_4, Integer.valueOf(1));
                v14_3.put(Integer.valueOf(3), v8_4);
                v14_3.put(v6_22, v6_22);
                v14_3.put(Integer.valueOf(5), v10_3);
                v14_3.put(v10_3, Integer.valueOf(16));
                if (v14_3.containsKey(Integer.valueOf(v1_34))) {
                    i2.v0 v1_53 = ((Integer) v14_3.get(Integer.valueOf(v1_34)));
                    if ((v1_53 != null) && ((v1_53.intValue() & v2_27) == 0)) {
                        i2.v0 v1_57 = v5_27.c.edit();
                        v1_57.putInt(v5_27.d, 0);
                        v1_57.apply();
                        v5_27.w();
                    }
                }
            }
            if (v9_12 != 0) {
                v5_27.g();
            }
            if (v12_5 != 0) {
                v5_27.c.edit().putBoolean(v5_27.a.getString(2131951838), 1).apply();
                v5_27.I1 = 1;
                v5_27.J1 = 1;
                v5_27.K1 = 1;
                v5_27.L1 = 1;
                v5_27.P1 = 1;
                v5_27.b.H = 1;
            } else {
                v5_27.getClass();
            }
            if ((this.j) && (!this.L)) {
                i2.v0 v1_12;
                i2.v0 v1_9 = this.o.b();
                if ((!c4.b.H(v1_9)) && ((!c4.b.I(v1_9)) && (!c4.b.J(v1_9)))) {
                    v1_12 = 0;
                } else {
                    v1_12 = 1;
                }
                boolean v5_3;
                i2.m0 v2_6 = this.m.getBoolean(this.w, 0);
                if ((!this.m.getBoolean(this.t, 0)) || (v1_12 == null)) {
                    v5_3 = 0;
                } else {
                    v5_3 = 1;
                }
                if (v1_12 == null) {
                    this.m.edit().putBoolean(this.t, 0).apply();
                }
                if (v2_6 != null) {
                    i2.v0 v1_17 = this.m.getString(this.s, this.y);
                    int v8_0 = 240;
                    int vtmp56 = v0.m.getInt(v0.z, 240);
                    if (v5_3) {
                        v8_0 = vtmp56;
                    }
                    this.p.getClass();
                    if (m2.a.f(v8_0, v1_17)) {
                        this.k.a(0);
                    }
                }
            }
            boolean v5_8;
            i2.v0 v1_21 = System.currentTimeMillis();
            if (((v1_21 - this.S) / 60000) < ((long) this.m.getInt(this.I, 10))) {
                v5_8 = 0;
            } else {
                v5_8 = 1;
            }
            i2.v0 v1_28;
            this.S = System.currentTimeMillis();
            this.m.edit().putLong(this.K, this.S).apply();
            this.m.edit().putBoolean(this.d0.getString(2131952274), v5_8).apply();
            k2.c.p().m(0, this.a, this.l, 0);
            this.b.n(0, 0);
            this.b.y();
            boolean v5_14 = this.b.h;
            boolean[] v6_14 = v5_14.h.getInt(v5_14.k, 50);
            v5_14.x = v6_14;
            v5_14.a.v1 = v6_14;
            this.b.c(this.v);
            this.b.c(this.d0.getString(2131952379));
            if (((v1_21 - this.R) / 60000) < ((long) this.m.getInt(this.H, 10))) {
                v1_28 = 0;
            } else {
                v1_28 = 1;
            }
            this.R = System.currentTimeMillis();
            this.m.edit().putLong(this.J, this.R).apply();
            if ((this.m.getInt(this.E, 0) == 7) && (v1_28 != null)) {
                this.b.k2 = 1;
            }
            if (this.m.getInt(this.F, 0) == 5) {
                this.b.l2 = 1;
            }
            boolean vtmp54 = this.m.getBoolean(this.x, 1);
            i2.m0 v2_19 = this.u;
            if ((v2_19 == null) || (!vtmp54)) {
                if (v2_19 != null) {
                    this.q.unregisterListener(this.T);
                }
            } else {
                this.q.registerListener(this.T, this.r, 2);
            }
            this.e();
            i2.v0 v1_39 = this.o.r;
            i2.m0 v2_24 = v1_39.getBoolean(i2.o0.L, 0);
            boolean v5_28 = v1_39.getBoolean(i2.o0.M, 0);
            i2.v0 v1_40 = v1_39.getBoolean(i2.o0.N, 0);
            boolean[] v6_20 = new boolean[3];
            v6_20[0] = v2_24;
            v6_20[1] = v5_28;
            v6_20[2] = v1_40;
            if (!v6_20[0]) {
                if (!v6_20[1]) {
                    if (v6_20[2]) {
                        this.b.g();
                    }
                } else {
                    this.b.g();
                }
            } else {
                this.b.g();
            }
            this.b();
            this.d.post(this.e);
            v0.f.post(v0.g);
            return;
        }
    }
}
