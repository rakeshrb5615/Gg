package l6;
public final class c implements g8.c, z8.m, q0.t, d4.c, e5.b, f5.a, e5.a, r0.l, com.google.android.gms.tasks.SuccessContinuation, com.android.billingclient.api.BillingClientStateListener, i3.b {
    public static volatile l6.c c;
    public final synthetic int a;
    public Object b;

    public c(int p2)
    {
        this.a = p2;
        switch (p2) {
            case 1:
                this.b = new java.util.concurrent.atomic.AtomicInteger(0);
                return;
            case 2:
            default:
                this.b = new java.util.HashSet();
                return;
            case 3:
                this.b = new g8.y(a1.m1.b);
                return;
        }
    }

    public synthetic c(int p1, boolean p2)
    {
        this.a = p1;
        return;
    }

    public c(android.widget.EditText p2)
    {
        this.a = 25;
        this.b = new k2.c(p2);
        return;
    }

    public c(android.widget.TextView p2)
    {
        this.a = 26;
        this.b = new i1.g(p2);
        return;
    }

    public c(g5.l p1, String p2)
    {
        this.a = 19;
        this.b = p1;
        return;
    }

    public synthetic c(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public c(u7.p p2)
    {
        this.a = 21;
        this.b = ((n7.i) p2);
        return;
    }

    public c(w6.m p1, w6.z p2)
    {
        this.a = 5;
        this.b = p2;
        return;
    }

    public c(boolean p2)
    {
        this.a = 12;
        this.b = new java.util.concurrent.atomic.AtomicBoolean(p2);
        return;
    }

    public static String k(android.os.Bundle p5, String p6)
    {
        org.json.JSONObject v0_1 = new org.json.JSONObject();
        org.json.JSONObject v1_1 = new org.json.JSONObject();
        java.util.Iterator v2_1 = p5.keySet().iterator();
        while (v2_1.hasNext()) {
            String v3_1 = ((String) v2_1.next());
            v1_1.put(v3_1, p5.get(v3_1));
        }
        v0_1.put("name", p6);
        v0_1.put("parameters", v1_1);
        return v0_1.toString();
    }

    public boolean a(android.view.View p5)
    {
        y3.e v0_1 = ((com.google.android.material.behavior.SwipeDismissBehavior) this.b);
        java.util.WeakHashMap v2 = 0;
        if (!v0_1.v(p5)) {
            return 0;
        } else {
            if (p5.getLayoutDirection() == 1) {
                v2 = 1;
            }
            int v1_1;
            int v1_0 = v0_1.e;
            if (((v1_0 != 0) || (v2 == null)) && ((v1_0 != 1) || (v2 != null))) {
                v1_1 = p5.getWidth();
            } else {
                v1_1 = (- p5.getWidth());
            }
            p5.offsetLeftAndRight(v1_1);
            p5.setAlpha(0);
            y3.e v0_2 = v0_1.b;
            if (v0_2 != null) {
                v0_2.a(p5);
            }
            return 1;
        }
    }

    public void b(g5.q p3)
    {
        this.b = p3;
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
            android.util.Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", 0);
        }
        return;
    }

    public void d(android.os.Bundle p10, String p11)
    {
        g5.q v1_1 = ((g5.q) this.b);
        if (v1_1 != null) {
            try {
                StringBuilder v2_1 = new StringBuilder("$A$:");
                v2_1.append(l6.c.k(p10, p11));
                g5.s v4 = v1_1.a;
                v4.o.a.a(new g5.r(v4, (System.currentTimeMillis() - v4.d), v2_1.toString(), 0));
                return;
            } catch (org.json.JSONException) {
                android.util.Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", 0);
            }
        }
        return;
    }

    public Object e(Object p4)
    {
        w6.p v0_0 = ((okhttp3.ResponseBody) p4).a;
        if (v0_0 == null) {
            v0_0 = new okhttp3.ResponseBody$BomAwareReader(((okhttp3.ResponseBody) p4).i(), okhttp3.internal.Internal.a(((okhttp3.ResponseBody) p4).f()));
            ((okhttp3.ResponseBody) p4).a = v0_0;
        }
        String v1_1 = new e7.a(v0_0);
        v1_1.u = 2;
        try {
            w6.p v0_4 = ((w6.z) this.b).b(v1_1);
        } catch (w6.p v0_7) {
            ((okhttp3.ResponseBody) p4).close();
            throw v0_7;
        }
        if (v1_1.O() != 10) {
            throw new w6.p("JSON document was not fully consumed.");
        } else {
            ((okhttp3.ResponseBody) p4).close();
            return v0_4;
        }
    }

    public Object f(g8.d p7, n7.c p8)
    {
        switch (this.a) {
            case 2:
                h7.l v7_1 = ((k2.c) this.b).f(new a1.s(p7, 0), p8);
                if (v7_1 != m7.a.a) {
                    v7_1 = h7.l.a;
                }
                return v7_1;
            default:
                g8.a v0_3;
                if (!(p8 instanceof g8.a)) {
                    v0_3 = new g8.a(this, p8);
                } else {
                    v0_3 = ((g8.a) p8);
                    h7.l v1_0 = ((g8.a) p8).d;
                    if ((v1_0 & -2147483648) == 0) {
                    } else {
                        ((g8.a) p8).d = (v1_0 - -2147483648);
                    }
                }
                h7.l v7_6;
                h7.l v8_1 = v0_3.b;
                h7.l v1_2 = m7.a.a;
                l7.h v2_1 = v0_3.d;
                h7.l v3_1 = h7.l.a;
                if (v2_1 == null) {
                    c4.b.e0(v8_1);
                    h7.l v8_3 = new h8.g(p7, v0_3.getContext());
                    try {
                        v0_3.a = v8_3;
                        v0_3.d = 1;
                        h7.l v7_4 = ((n7.i) this.b).invoke(v8_3, v0_3);
                    } catch (h7.l v7_5) {
                        h7.l v8_4 = v7_5;
                        v7_6 = v8_3;
                        v7_6.releaseIntercepted();
                        throw v8_4;
                    }
                    if (v7_4 != v1_2) {
                        v7_4 = v3_1;
                    }
                    if (v7_4 != v1_2) {
                        v7_6 = v8_3;
                        v7_6.releaseIntercepted();
                        v1_2 = v3_1;
                    }
                } else {
                    if (v2_1 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        v7_6 = v0_3.a;
                        try {
                            c4.b.e0(v8_1);
                        } catch (h7.l v8_4) {
                        }
                    }
                }
                return v1_2;
        }
    }

    public void g(android.os.Bundle p4)
    {
        ((u4.c) ((u4.b) this.b)).a("clx", "_ae", p4);
        return;
    }

    public a1.l1 h()
    {
        return ((a1.l1) ((g8.y) this.b).b());
    }

    public q0.s1 i(android.view.View p6, q0.s1 p7)
    {
        switch (this.a) {
            case 6:
                h3.h v6_1 = p7.a;
                java.util.ArrayList v0_1 = ((androidx.coordinatorlayout.widget.CoordinatorLayout) this.b);
                if (!java.util.Objects.equals(v0_1.t, p7)) {
                    int v1_1;
                    v0_1.t = p7;
                    int v2 = 0;
                    boolean v3_0 = 1;
                    if (p7.d() <= 0) {
                        v1_1 = 0;
                    } else {
                        v1_1 = 1;
                    }
                    v0_1.u = v1_1;
                    if ((v1_1 != 0) || (v0_1.getBackground() != null)) {
                        v3_0 = 0;
                    }
                    v0_1.setWillNotDraw(v3_0);
                    if (!v6_1.m()) {
                        int v1_4 = v0_1.getChildCount();
                        while (v2 < v1_4) {
                            boolean v3_1 = v0_1.getChildAt(v2);
                            if ((v3_1.getFitsSystemWindows()) && ((((b0.d) v3_1.getLayoutParams()).a != null) && (v6_1.m()))) {
                                break;
                            }
                            v2++;
                        }
                    }
                    v0_1.requestLayout();
                }
                return p7;
            default:
                h3.h v6_3 = ((h3.i) this.b);
                java.util.ArrayList v0_2 = v6_3.t;
                if (v0_2 != null) {
                    v6_3.m.Y.remove(v0_2);
                }
                java.util.ArrayList v0_4 = new h3.h(v6_3.p, p7);
                v6_3.t = v0_4;
                v0_4.e(v6_3.getWindow());
                h3.h v6_4 = v6_3.t;
                java.util.ArrayList v0_6 = v6_3.m.Y;
                if (!v0_6.contains(v6_4)) {
                    v0_6.add(v6_4);
                }
                return p7;
        }
    }

    public void j(o5.d p10, Thread p11, Throwable p12)
    {
        g5.n v2_1 = ((g5.n) this.b);
        try {
            g5.l v1_6 = new StringBuilder("Handling uncaught exception \"");
            v1_6.append(p12);
            v1_6.append("\" from thread ");
            v1_6.append(p11.getName());
            Exception v0_2 = v1_6.toString();
        } catch (Exception v0_8) {
            throw v0_8;
        }
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
            android.util.Log.d("FirebaseCrashlytics", v0_2, 0);
        }
        a.a.L();
        Exception v0_4 = v2_1.e.a;
        String v11_2 = v0_4.c.continueWithTask(v0_4.a, new a5.a(new g5.l(v2_1, System.currentTimeMillis(), p12, p11, p10), 6));
        v0_4.c = v11_2;
        try {
            g5.z.a(v11_2);
        } catch (Exception v0_7) {
            android.util.Log.e("FirebaseCrashlytics", "Error handling uncaught exception", v0_7);
        }
        return;
    }

    public void l(a1.l1 p6)
    {
        kotlin.jvm.internal.j.e(p6, "newState");
        g8.y v0_2 = ((g8.y) this.b);
        do {
            d4.l v3_1;
            boolean v1_0 = v0_2.b();
            d4.l v2_0 = ((a1.l1) v1_0);
            if (!(v2_0 instanceof a1.d1)) {
                v3_1 = kotlin.jvm.internal.j.a(v2_0, a1.m1.b);
            } else {
                v3_1 = 1;
            }
            if (v3_1 == null) {
                if (!(v2_0 instanceof a1.c)) {
                    if (!(v2_0 instanceof a1.r0)) {
                        throw new a5.o();
                    }
                } else {
                    if (p6.a > v2_0.a) {
                        v2_0 = p6;
                    }
                }
            }
            d4.l v3_5 = h8.f.a;
            if (!v1_0) {
                v1_0 = v3_5;
            }
            if (v2_0 == null) {
                v2_0 = v3_5;
            }
        } while(!v0_2.e(v1_0, v2_0));
        return;
    }

    public void onBillingServiceDisconnected()
    {
        ((i2.f) this.b).a();
        return;
    }

    public void onBillingSetupFinished(com.android.billingclient.api.BillingResult p9)
    {
        if (p9.getResponseCode() == 0) {
            i2.f v9_3 = ((i2.f) this.b);
            com.android.billingclient.api.BillingClient v0 = v9_3.c;
            if (v0.isReady()) {
                v9_3.T.clear();
                com.android.billingclient.api.QueryProductDetailsParams v1_1 = new java.util.ArrayList();
                i2.d v2_1 = new java.util.ArrayList();
                java.util.concurrent.atomic.AtomicInteger v3_1 = new java.util.ArrayList(v9_3.R);
                v3_1.addAll(v9_3.S);
                v3_1.add(v9_3.z);
                int v4_3 = v3_1.size();
                int v5_0 = 0;
                while (v5_0 < v4_3) {
                    com.android.billingclient.api.QueryProductDetailsParams$Product v6_0 = v3_1.get(v5_0);
                    v5_0++;
                    com.android.billingclient.api.QueryProductDetailsParams$Product v6_1 = ((String) v6_0);
                    if (!v9_3.S.contains(v6_1)) {
                        v1_1.add(com.android.billingclient.api.QueryProductDetailsParams$Product.newBuilder().setProductId(v6_1).setProductType("inapp").build());
                    } else {
                        v2_1.add(com.android.billingclient.api.QueryProductDetailsParams$Product.newBuilder().setProductId(v6_1).setProductType("subs").build());
                    }
                }
                java.util.concurrent.atomic.AtomicInteger v3_3 = new java.util.concurrent.atomic.AtomicInteger(2);
                if (v1_1.isEmpty()) {
                    v3_3.decrementAndGet();
                } else {
                    v0.queryProductDetailsAsync(com.android.billingclient.api.QueryProductDetailsParams.newBuilder().setProductList(v1_1).build(), new i2.d(v9_3, v3_3, 0));
                }
                if (v2_1.isEmpty()) {
                    v3_3.decrementAndGet();
                } else {
                    v0.queryProductDetailsAsync(com.android.billingclient.api.QueryProductDetailsParams.newBuilder().setProductList(v2_1).build(), new i2.d(v9_3, v3_3, 1));
                    return;
                }
            }
        }
        return;
    }

    public com.google.android.gms.tasks.Task then(Object p4)
    {
        switch (this.a) {
            case 19:
                com.google.android.gms.tasks.Task v4_2;
                com.google.android.gms.tasks.Task v0_12 = ((g5.l) this.b).e;
                if (((o5.c) p4) != null) {
                    v4_2 = com.google.android.gms.tasks.Tasks.whenAll(new com.google.android.gms.tasks.Task[] {g5.n.a(v0_12), v0_12.m.s(0, v0_12.e.a)}));
                } else {
                    android.util.Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", 0);
                    v4_2 = com.google.android.gms.tasks.Tasks.forResult(0);
                }
                return v4_2;
            default:
                com.google.android.gms.tasks.Task v4_10;
                com.google.android.gms.tasks.Task v0_6 = ((k2.c) this.b);
                if (((o5.c) p4) != null) {
                    com.google.android.gms.tasks.Task v0_9 = ((g5.n) v0_6.c);
                    g5.n.a(((g5.n) v0_6.c));
                    v0_9.m.s(0, v0_9.e.a);
                    v0_9.q.trySetResult(0);
                    v4_10 = com.google.android.gms.tasks.Tasks.forResult(0);
                } else {
                    android.util.Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", 0);
                    v4_10 = com.google.android.gms.tasks.Tasks.forResult(0);
                }
                return v4_10;
        }
    }

    public Object zza()
    {
        return ((c4.f) this.b).a;
    }
}
