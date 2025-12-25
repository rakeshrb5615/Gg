package a5;
public final class z implements a5.d {
    public final Object a;
    public final Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public z()
    {
        this.a = new int[] {2131231056, 2131231054, 2131230980});
        int v1_4 = new int[7];
        v1_4 = {2131231004, 2131231039, 2131231011, 2131231006, 2131231007, 2131231010, 2131231009};
        this.b = v1_4;
        int[] v0_1 = new int[7];
        v0_1 = {2131231053, 2131231055, 2131230997, 2131231049, 2131231050, 2131231051, 2131231052};
        this.c = v0_1;
        this.d = new int[] {2131231029, 2131230995, 2131231028});
        this.e = new int[] {2131231047, 2131231057});
        this.f = new int[] {2131230983, 2131230989, 2131230984, 2131230990});
        return;
    }

    public z(a5.c p12, a5.d p13)
    {
        java.util.HashSet v0_1 = new java.util.HashSet();
        java.util.HashSet v1_1 = new java.util.HashSet();
        java.util.HashSet v2_1 = new java.util.HashSet();
        java.util.HashSet v3_1 = new java.util.HashSet();
        java.util.HashSet v4_0 = new java.util.HashSet();
        java.util.Set v12_1 = p12.g;
        java.util.Iterator v5_1 = p12.c.iterator();
        while (v5_1.hasNext()) {
            int v9;
            a5.x v6_2 = ((a5.m) v5_1.next());
            int v7 = v6_2.c;
            int v8 = v6_2.b;
            if (v7 != 0) {
                v9 = 0;
            } else {
                v9 = 1;
            }
            a5.x v6_3 = v6_2.a;
            if (v9 == 0) {
                if (v7 != 2) {
                    if (v8 != 2) {
                        v1_1.add(v6_3);
                    } else {
                        v4_0.add(v6_3);
                    }
                } else {
                    v2_1.add(v6_3);
                }
            } else {
                if (v8 != 2) {
                    v0_1.add(v6_3);
                } else {
                    v3_1.add(v6_3);
                }
            }
        }
        if (!v12_1.isEmpty()) {
            v0_1.add(a5.x.a(x5.b));
        }
        this.a = java.util.Collections.unmodifiableSet(v0_1);
        this.b = java.util.Collections.unmodifiableSet(v1_1);
        this.c = java.util.Collections.unmodifiableSet(v2_1);
        this.d = java.util.Collections.unmodifiableSet(v3_1);
        this.e = java.util.Collections.unmodifiableSet(v4_0);
        this.f = p13;
        return;
    }

    public z(g5.t p1, m5.a p2, n5.a p3, i5.e p4, m5.c p5, g5.y p6, h5.f p7)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        return;
    }

    public z(q4.f p3, com.google.firebase.auth.FirebaseAuth p4)
    {
        z4.z v0_1 = new z4.z();
        this.a = new Object();
        this.b = new java.util.HashMap();
        this.d = p3;
        this.e = p4;
        this.f = v0_1;
        return;
    }

    public z(q4.f p3, h3.k p4, c6.b p5, c6.b p6, d6.d p7)
    {
        p3.a();
        com.google.android.gms.cloudmessaging.Rpc v0_1 = new com.google.android.gms.cloudmessaging.Rpc(p3.a);
        this.a = p3;
        this.b = p4;
        this.c = v0_1;
        this.d = p5;
        this.e = p6;
        this.f = p7;
        return;
    }

    public static j5.p0 i(j5.p0 p10, i5.e p11, m5.c p12, java.util.Map p13)
    {
        j5.o0 v1 = p10.a();
        java.util.Map v11_19 = ((i5.c) p11.b).b();
        if (v11_19 == null) {
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                android.util.Log.v("FirebaseCrashlytics", "No log data to include with this event.", 0);
            }
        } else {
            v1.e = new j5.c1(v11_19);
        }
        java.util.Map v11_18;
        java.util.Map v11_9 = ((i5.n) p12.e);
        if (!p13.isEmpty()) {
            java.util.Map v11_16 = new java.util.HashMap(java.util.Collections.unmodifiableMap(new java.util.HashMap(((i5.d) ((java.util.concurrent.atomic.AtomicMarkableReference) v11_9.b).getReference()).a)));
            String v13_3 = p13.entrySet().iterator();
            int v3_9 = 0;
            while (v13_3.hasNext()) {
                String v4_4 = ((java.util.Map$Entry) v13_3.next());
                String v5_3 = i5.d.a(1024, ((String) v4_4.getKey()));
                if ((v11_16.size() >= 64) && (!v11_16.containsKey(v5_3))) {
                    v3_9++;
                } else {
                    v11_16.put(v5_3, i5.d.a(1024, ((String) v4_4.getValue())));
                }
            }
            if (v3_9 > 0) {
                String v13_5 = new StringBuilder("Ignored ");
                v13_5.append(v3_9);
                v13_5.append(" keys when adding event specific keys. Maximum allowable: 1024");
                android.util.Log.w("FirebaseCrashlytics", v13_5.toString(), 0);
            }
            v11_18 = java.util.Collections.unmodifiableMap(v11_16);
        } else {
            v11_18 = java.util.Collections.unmodifiableMap(new java.util.HashMap(((i5.d) ((java.util.concurrent.atomic.AtomicMarkableReference) v11_9.b).getReference()).a));
        }
        String v4_8 = a5.z.q(v11_18);
        String v5_0 = a5.z.q(java.util.Collections.unmodifiableMap(new java.util.HashMap(((i5.d) ((java.util.concurrent.atomic.AtomicMarkableReference) ((i5.n) p12.f).b).getReference()).a)));
        if ((!v4_8.isEmpty()) || (!v5_0.isEmpty())) {
            j5.p0 v10_3 = ((j5.q0) p10.c);
            v1.c = new j5.q0(v10_3.a, v4_8, v5_0, v10_3.d, v10_3.e, v10_3.f, v10_3.g);
        }
        return v1.a();
    }

    public static j5.j2 j(j5.p0 p7, m5.c p8)
    {
        String v8_6 = ((h.f) p8.m).d();
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        int v1 = 0;
        while (v1 < v8_6.size()) {
            j5.e1 v2_1 = ((i5.m) v8_6.get(v1));
            v2_1.getClass();
            j5.d1 v3_1 = new j5.d1();
            j5.e1 v2_2 = ((i5.b) v2_1);
            long v4_0 = v2_2.e;
            if (v4_0 == 0) {
                throw new NullPointerException("Null variantId");
            } else {
                String v5 = v2_2.b;
                if (v5 == null) {
                    throw new NullPointerException("Null rolloutId");
                } else {
                    v3_1.a = new j5.f1(v5, v4_0);
                    long v4_1 = v2_2.c;
                    if (v4_1 == 0) {
                        throw new NullPointerException("Null parameterKey");
                    } else {
                        v3_1.b = v4_1;
                        long v4_2 = v2_2.d;
                        if (v4_2 == 0) {
                            throw new NullPointerException("Null parameterValue");
                        } else {
                            v3_1.c = v4_2;
                            v3_1.d = v2_2.f;
                            v3_1.e = ((byte) (v3_1.e | 1));
                            v0_1.add(v3_1.a());
                            v1++;
                        }
                    }
                }
            }
        }
        if (!v0_1.isEmpty()) {
            NullPointerException v7_1 = p7.a();
            v7_1.f = new j5.g1(v0_1);
            return v7_1.a();
        } else {
            return p7;
        }
    }

    public static boolean k(int[] p4, int p5)
    {
        int v2 = 0;
        while (v2 < p4.length) {
            if (p4[v2] != p5) {
                v2++;
            } else {
                return 1;
            }
        }
        return 0;
    }

    public static String l(java.io.InputStream p4)
    {
        Throwable v0_1 = new java.io.BufferedInputStream(p4);
        try {
            Throwable v4_4 = new java.io.ByteArrayOutputStream();
        } catch (Throwable v4_3) {
            try {
                v0_1.close();
            } catch (Throwable v0_2) {
                v4_3.addSuppressed(v0_2);
            }
            throw v4_3;
        }
        String v1_5 = new byte[8192];
        while(true) {
            int v2 = v0_1.read(v1_5);
            if (v2 == -1) {
                break;
            }
            v4_4.write(v1_5, 0, v2);
        }
        String v1_2 = v4_4.toString(java.nio.charset.StandardCharsets.UTF_8.name());
        v4_4.close();
        v0_1.close();
        return v1_2;
    }

    public static a5.z m(android.content.Context p8, g5.y p9, m5.c p10, g5.a p11, i5.e p12, m5.c p13, n0.a p14, o5.d p15, k2.c p16, g5.k p17, h5.f p18)
    {
        a5.z v0_3 = new g5.t(p8, p9, p11, p14, p15);
        m5.a v2_2 = new m5.a(p10, p15, p17);
        r2.r.b(p8);
        return new a5.z(v0_3, v2_2, new n5.a(new n5.c(r2.r.a().c(new p2.a(n5.a.c, n5.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new o2.c("json"), n5.a.e), p15.b(), p16)), p12, p13, p9, p18);
    }

    public static android.content.res.ColorStateList n(android.content.Context p6, int p7)
    {
        int v0_2 = n.t2.c(p6, 2130968848);
        return new android.content.res.ColorStateList(new int[][] {n.t2.b, n.t2.d, n.t2.c, n.t2.f}), new int[] {n.t2.b(p6, 2130968843), h0.a.e(v0_2, p7), h0.a.e(v0_2, p7), p7}));
    }

    public static android.graphics.drawable.LayerDrawable p(n.n2 p4, android.content.Context p5, int p6)
    {
        int v0_2;
        int v5_6;
        android.graphics.drawable.LayerDrawable v6_1 = p5.getResources().getDimensionPixelSize(p6);
        int v0_4 = p4.c(p5, 2131231043);
        android.graphics.drawable.BitmapDrawable v4_4 = p4.c(p5, 2131231044);
        if ((!(v0_4 instanceof android.graphics.drawable.BitmapDrawable)) || ((v0_4.getIntrinsicWidth() != v6_1) || (v0_4.getIntrinsicHeight() != v6_1))) {
            int v5_5 = android.graphics.Bitmap.createBitmap(v6_1, v6_1, android.graphics.Bitmap$Config.ARGB_8888);
            android.graphics.drawable.Drawable[] v2_1 = new android.graphics.Canvas(v5_5);
            v0_4.setBounds(0, 0, v6_1, v6_1);
            v0_4.draw(v2_1);
            v0_2 = new android.graphics.drawable.BitmapDrawable(v5_5);
            v5_6 = new android.graphics.drawable.BitmapDrawable(v5_5);
        } else {
            v0_2 = ((android.graphics.drawable.BitmapDrawable) v0_4);
            v5_6 = new android.graphics.drawable.BitmapDrawable(v0_2.getBitmap());
        }
        android.graphics.drawable.BitmapDrawable v4_2;
        v5_6.setTileModeX(android.graphics.Shader$TileMode.REPEAT);
        if ((!(v4_4 instanceof android.graphics.drawable.BitmapDrawable)) || ((v4_4.getIntrinsicWidth() != v6_1) || (v4_4.getIntrinsicHeight() != v6_1))) {
            android.graphics.drawable.Drawable[] v2_10 = android.graphics.Bitmap.createBitmap(v6_1, v6_1, android.graphics.Bitmap$Config.ARGB_8888);
            android.graphics.Canvas v3_1 = new android.graphics.Canvas(v2_10);
            v4_4.setBounds(0, 0, v6_1, v6_1);
            v4_4.draw(v3_1);
            v4_2 = new android.graphics.drawable.BitmapDrawable(v2_10);
        } else {
            v4_2 = ((android.graphics.drawable.BitmapDrawable) v4_4);
        }
        android.graphics.drawable.Drawable[] v2_12 = new android.graphics.drawable.Drawable[3];
        v2_12[0] = v0_2;
        v2_12[1] = v4_2;
        v2_12[2] = v5_6;
        android.graphics.drawable.LayerDrawable v6_3 = new android.graphics.drawable.LayerDrawable(v2_12);
        v6_3.setId(0, 16908288);
        v6_3.setId(1, 16908303);
        v6_3.setId(2, 16908301);
        return v6_3;
    }

    public static java.util.List q(java.util.Map p4)
    {
        String v0_1 = new java.util.ArrayList();
        v0_1.ensureCapacity(p4.size());
        NullPointerException v4_9 = p4.entrySet().iterator();
        while (v4_9.hasNext()) {
            String v1_3 = ((java.util.Map$Entry) v4_9.next());
            String v2_1 = ((String) v1_3.getKey());
            if (v2_1 == null) {
                throw new NullPointerException("Null key");
            } else {
                String v1_6 = ((String) v1_3.getValue());
                if (v1_6 == null) {
                    throw new NullPointerException("Null value");
                } else {
                    v0_1.add(new j5.f0(v2_1, v1_6));
                }
            }
        }
        java.util.Collections.sort(v0_1, new g5.i(1));
        return java.util.Collections.unmodifiableList(v0_1);
    }

    public static void u(android.graphics.drawable.Drawable p0, int p1, android.graphics.PorterDuff$Mode p2)
    {
        android.graphics.drawable.Drawable v0_1 = p0.mutate();
        if (p2 == null) {
            p2 = n.u.b;
        }
        v0_1.setColorFilter(n.u.c(p1, p2));
        return;
    }

    public Object a(Class p4)
    {
        if (!((java.util.Set) this.a).contains(a5.x.a(p4))) {
            StringBuilder v1_0 = new StringBuilder("Attempting to request an undeclared dependency ");
            v1_0.append(p4);
            v1_0.append(".");
            throw new a5.o(v1_0.toString());
        } else {
            x5.b v0_5 = ((a5.d) this.f).a(p4);
            if (p4.equals(x5.b)) {
                return new a5.y();
            } else {
                return v0_5;
            }
        }
    }

    public c6.b b(a5.x p4)
    {
        if (!((java.util.Set) this.b).contains(p4)) {
            StringBuilder v1_1 = new StringBuilder("Attempting to request an undeclared dependency Provider<");
            v1_1.append(p4);
            v1_1.append(">.");
            throw new a5.o(v1_1.toString());
        } else {
            return ((a5.d) this.f).b(p4);
        }
    }

    public java.util.Set c(a5.x p4)
    {
        if (!((java.util.Set) this.d).contains(p4)) {
            StringBuilder v1_1 = new StringBuilder("Attempting to request an undeclared dependency Set<");
            v1_1.append(p4);
            v1_1.append(">.");
            throw new a5.o(v1_1.toString());
        } else {
            return ((a5.d) this.f).c(p4);
        }
    }

    public c6.b d(a5.x p4)
    {
        if (!((java.util.Set) this.e).contains(p4)) {
            StringBuilder v1_1 = new StringBuilder("Attempting to request an undeclared dependency Provider<Set<");
            v1_1.append(p4);
            v1_1.append(">>.");
            throw new a5.o(v1_1.toString());
        } else {
            return ((a5.d) this.f).d(p4);
        }
    }

    public Object e(a5.x p4)
    {
        if (!((java.util.Set) this.a).contains(p4)) {
            StringBuilder v1_1 = new StringBuilder("Attempting to request an undeclared dependency ");
            v1_1.append(p4);
            v1_1.append(".");
            throw new a5.o(v1_1.toString());
        } else {
            return ((a5.d) this.f).e(p4);
        }
    }

    public c6.b f(Class p1)
    {
        return this.b(a5.x.a(p1));
    }

    public a5.v g(a5.x p4)
    {
        if (!((java.util.Set) this.c).contains(p4)) {
            StringBuilder v1_1 = new StringBuilder("Attempting to request an undeclared dependency Deferred<");
            v1_1.append(p4);
            v1_1.append(">.");
            throw new a5.o(v1_1.toString());
        } else {
            return ((a5.d) this.f).g(p4);
        }
    }

    public a5.v h(Class p1)
    {
        return this.g(a5.x.a(p1));
    }

    public com.google.android.gms.tasks.Task o(com.google.android.gms.tasks.Task p4)
    {
        return p4.continueWith(new x1.d(), new a5.a(this, 10));
    }

    public android.content.res.ColorStateList r(android.content.Context p9, int p10)
    {
        if (p10 != 2131231000) {
            if (p10 != 2131231046) {
                if (p10 != 2131231045) {
                    if (p10 != 2131230988) {
                        if (p10 != 2131230982) {
                            if (p10 != 2131230987) {
                                if ((p10 != 2131231041) && (p10 != 2131231042)) {
                                    if (!a5.z.k(((int[]) this.b), p10)) {
                                        if (!a5.z.k(((int[]) this.e), p10)) {
                                            if (!a5.z.k(((int[]) this.f), p10)) {
                                                if (p10 != 2131231038) {
                                                    return 0;
                                                } else {
                                                    return e0.c.getColorStateList(p9, 2131099670);
                                                }
                                            } else {
                                                return e0.c.getColorStateList(p9, 2131099667);
                                            }
                                        } else {
                                            return e0.c.getColorStateList(p9, 2131099668);
                                        }
                                    } else {
                                        return n.t2.d(p9, 2130968849);
                                    }
                                } else {
                                    return e0.c.getColorStateList(p9, 2131099671);
                                }
                            } else {
                                return a5.z.n(p9, n.t2.c(p9, 2130968841));
                            }
                        } else {
                            return a5.z.n(p9, 0);
                        }
                    } else {
                        return a5.z.n(p9, n.t2.c(p9, 2130968843));
                    }
                } else {
                    int v0_17 = new int[][3];
                    int v10_13 = new int[3];
                    int v3_0 = n.t2.d(p9, 2130968900);
                    if ((v3_0 == 0) || (!v3_0.isStateful())) {
                        v0_17[0] = n.t2.b;
                        v10_13[0] = n.t2.b(p9, 2130968900);
                        v0_17[1] = n.t2.e;
                        v10_13[1] = n.t2.c(p9, 2130968847);
                        v0_17[2] = n.t2.f;
                        v10_13[2] = n.t2.c(p9, 2130968900);
                    } else {
                        int v2_2 = n.t2.b;
                        v0_17[0] = v2_2;
                        v10_13[0] = v3_0.getColorForState(v2_2, 0);
                        v0_17[1] = n.t2.e;
                        v10_13[1] = n.t2.c(p9, 2130968847);
                        v0_17[2] = n.t2.f;
                        v10_13[2] = v3_0.getDefaultColor();
                    }
                    return new android.content.res.ColorStateList(v0_17, v10_13);
                }
            } else {
                return e0.c.getColorStateList(p9, 2131099672);
            }
        } else {
            return e0.c.getColorStateList(p9, 2131099669);
        }
    }

    public com.google.android.gms.tasks.Task s(String p17, java.util.concurrent.Executor p18)
    {
        int v3_1 = ((m5.a) this.b).b();
        java.util.ArrayList v4_1 = new java.util.ArrayList();
        int v5_1 = v3_1.size();
        Throwable v0_0 = 0;
        while (v0_0 < v5_1) {
            java.util.concurrent.Executor v8_4 = (v0_0 + 1);
            a5.t v7_3 = ((java.io.File) v3_1.get(v0_0));
            try {
                String v9_8 = m5.a.e(v7_3);
                m5.a.g.getClass();
                v4_1.add(new g5.b(k5.a.i(v9_8), v7_3.getName(), v7_3));
            } catch (Throwable v0_6) {
                String v9_11 = new StringBuilder("Could not load report file ");
                v9_11.append(v7_3);
                v9_11.append("; deleting");
                android.util.Log.w("FirebaseCrashlytics", v9_11.toString(), v0_6);
                v7_3.delete();
            }
            v0_0 = v8_4;
        }
        Throwable v0_2 = new java.util.ArrayList();
        int v3_0 = v4_1.size();
        int v5_0 = 0;
        while (v5_0 < v3_0) {
            a5.t v7_4 = v4_1.get(v5_0);
            v5_0++;
            a5.t v7_5 = ((g5.b) v7_4);
            if ((p17 == null) || (p17.equals(v7_5.b))) {
                java.util.concurrent.Executor v8_8 = ((n5.a) this.c);
                String v9_13 = v7_5.a;
                n0.l v11_5 = 1;
                if ((v9_13.f == null) || (v9_13.g == null)) {
                    String v9_17 = ((g5.y) this.f).b(1);
                    String v12_0 = v9_17.a;
                    int v10_7 = v7_5.a.a();
                    v10_7.e = v12_0;
                    String v9_18 = v9_17.b;
                    int v10_9 = v10_7.a().a();
                    v10_9.f = v9_18;
                    v7_5 = new g5.b(v10_9.a(), v7_5.b, v7_5.c);
                }
                if (p17 == null) {
                    v11_5 = 0;
                }
                java.util.concurrent.Executor v8_9 = v8_8.a;
                com.google.android.gms.tasks.TaskCompletionSource v15_1 = new com.google.android.gms.tasks.TaskCompletionSource();
                if (v11_5 == null) {
                    v8_9.b(v7_5, v15_1);
                } else {
                    ((java.util.concurrent.atomic.AtomicInteger) v8_9.i.b).getAndIncrement();
                    if (v8_9.f.size() >= v8_9.e) {
                        v8_9.a();
                        java.util.concurrent.atomic.AtomicInteger v6_5 = new StringBuilder("Dropping report due to queue being full: ");
                        v6_5.append(v7_5.b);
                        java.util.concurrent.atomic.AtomicInteger v6_6 = v6_5.toString();
                        if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                            android.util.Log.d("FirebaseCrashlytics", v6_6, 0);
                        }
                        ((java.util.concurrent.atomic.AtomicInteger) v8_9.i.c).getAndIncrement();
                        v15_1.trySetResult(v7_5);
                    } else {
                        java.util.concurrent.atomic.AtomicInteger v6_0 = d5.d.a;
                        String v9_1 = new StringBuilder("Enqueueing report: ");
                        v9_1.append(v7_5.b);
                        v6_0.b(v9_1.toString());
                        String v9_4 = new StringBuilder("Queue size: ");
                        v9_4.append(v8_9.f.size());
                        v6_0.b(v9_4.toString());
                        v8_9.g.execute(new n0.l(v8_9, v7_5, v15_1));
                        java.util.concurrent.Executor v8_1 = new StringBuilder("Closing task for report: ");
                        v8_1.append(v7_5.b);
                        v6_0.b(v8_1.toString());
                        v15_1.trySetResult(v7_5);
                    }
                }
                v0_2.add(v15_1.getTask().continueWith(p18, new a5.t(this)));
            }
        }
        return com.google.android.gms.tasks.Tasks.whenAll(v0_2);
    }

    public void t(String p7, String p8, android.os.Bundle p9)
    {
        p9.putString("scope", p8);
        p9.putString("sender", p7);
        p9.putString("subtype", p7);
        String v8_36 = ((q4.f) this.a);
        v8_36.a();
        p9.putString("gmp_app_id", v8_36.c.b);
        String v8_14 = ((h3.k) this.b);
        if (v8_14.a == 0) {
            String v0_7 = v8_14.c("com.google.android.gms");
            if (v0_7 != null) {
                v8_14.a = v0_7.versionCode;
            }
        }
        p9.putString("gmsv", Integer.toString(v8_14.a));
        p9.putString("osv", Integer.toString(android.os.Build$VERSION.SDK_INT));
        p9.putString("app_ver", ((h3.k) this.b).a());
        String v0_11 = ((h3.k) this.b);
        if (((String) v0_11.e) == null) {
            v0_11.f();
        }
        p9.putString("app_ver_name", ((String) v0_11.e));
        String v8_30 = ((q4.f) this.a);
        v8_30.a();
        try {
            String v8_34 = android.util.Base64.encodeToString(java.security.MessageDigest.getInstance("SHA-1").digest(v8_30.b.getBytes()), 11);
        } catch (java.security.NoSuchAlgorithmException) {
            v8_34 = "[HASH-ERROR]";
        }
        p9.putString("firebase-app-name-hash", v8_34);
        String v7_25 = ((d6.a) com.google.android.gms.tasks.Tasks.await(((d6.c) ((d6.d) this.f)).d())).a;
        if (android.text.TextUtils.isEmpty(v7_25)) {
            android.util.Log.w("FirebaseMessaging", "FIS auth token is empty");
            p9.putString("appid", ((String) com.google.android.gms.tasks.Tasks.await(((d6.c) ((d6.d) this.f)).c())));
            p9.putString("cliv", "fcm-25.0.1");
            String v7_5 = ((a6.g) ((c6.b) this.e).get());
            String v8_9 = ((l6.b) ((c6.b) this.d).get());
            if ((v7_5 != null) && (v8_9 != null)) {
                try {
                    a6.l v2_2 = ((a6.l) ((a6.d) v7_5).a.get());
                } catch (String v8_13) {
                    throw v8_13;
                }
                String v7_8;
                if (!v2_2.e(a6.l.b, System.currentTimeMillis())) {
                    v7_8 = 1;
                } else {
                    v2_2.a.a(new a6.j(0, v2_2, v2_2.b(System.currentTimeMillis())));
                    v7_8 = 3;
                }
                if (v7_8 != 1) {
                    p9.putString("Firebase-Client-Log-Type", Integer.toString(u.e.c(v7_8)));
                    p9.putString("Firebase-Client", v8_9.a());
                }
            }
            return;
        } else {
            p9.putString("Goog-Firebase-Installations-Auth", v7_25);
        }
    }

    public com.google.android.gms.tasks.Task v(String p1, String p2, android.os.Bundle p3)
    {
        try {
            this.t(p1, p2, p3);
            return ((com.google.android.gms.cloudmessaging.Rpc) this.c).send(p3);
        } catch (com.google.android.gms.tasks.Task v1_4) {
            return com.google.android.gms.tasks.Tasks.forException(v1_4);
        } catch (com.google.android.gms.tasks.Task v1_4) {
            return com.google.android.gms.tasks.Tasks.forException(v1_4);
        }
    }

    public com.google.android.gms.tasks.Task w(String p4, Boolean p5, com.google.android.recaptcha.RecaptchaAction p6)
    {
        com.google.android.gms.tasks.Task v1 = "*";
        if (com.google.android.gms.internal.firebase-auth-api.zzac.zzc(p4)) {
            p4 = "*";
        }
        com.google.android.gms.tasks.Task v0_3 = this.x(p4);
        if ((p5.booleanValue()) || (v0_3 == null)) {
            if (!com.google.android.gms.internal.firebase-auth-api.zzac.zzc(p4)) {
                v1 = p4;
            }
            com.google.android.gms.tasks.Task v4_2;
            if (p5.booleanValue()) {
                com.google.android.gms.tasks.Task v4_4 = ((com.google.firebase.auth.FirebaseAuth) this.e);
                v4_2 = v4_4.e.zza(v4_4.i, "RECAPTCHA_ENTERPRISE").continueWithTask(new n0.a(this, v1));
            } else {
                v4_2 = this.x(v1);
                if (v4_2 == null) {
                }
            }
            v0_3 = v4_2;
        }
        return v0_3.continueWithTask(new j6.o(this, p6));
    }

    public com.google.android.gms.tasks.Task x(String p3)
    {
        try {
            return ((com.google.android.gms.tasks.Task) ((java.util.HashMap) this.b).get(p3));
        } catch (Throwable v3_3) {
            throw v3_3;
        }
    }
}
