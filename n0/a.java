package n0;
public final class a implements com.google.android.gms.tasks.SuccessContinuation, p5.a, q0.t, t2.b, com.google.android.gms.tasks.OnCompleteListener, com.google.android.gms.tasks.Continuation, z8.f, z8.g, okhttp3.Callback {
    public final synthetic int a;
    public Object b;
    public Object c;

    public synthetic a(int p1)
    {
        this.a = p1;
        return;
    }

    public synthetic a(int p1, Object p2, Object p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public a(a5.z p2, String p3)
    {
        this.a = 15;
        this.b = p3;
        java.util.Objects.requireNonNull(p2);
        this.c = p2;
        return;
    }

    public a(android.content.Context p2)
    {
        this.a = 8;
        this.c = 0;
        this.b = p2;
        return;
    }

    public a(c6.b p2)
    {
        this.a = 2;
        this.c = java.util.Collections.synchronizedMap(new java.util.HashMap());
        this.b = p2;
        return;
    }

    public synthetic a(Object p1, Object p2, int p3, boolean p4)
    {
        this.a = p3;
        this.c = p1;
        this.b = p2;
        return;
    }

    public a(q4.f p11, d6.d p12, n6.i p13, n6.d p14, android.content.Context p15, n6.n p16, java.util.concurrent.ScheduledExecutorService p17)
    {
        this.a = 1;
        java.util.LinkedHashSet v7_1 = new java.util.LinkedHashSet();
        this.b = v7_1;
        this.c = new n6.l(p11, p12, p13, p14, p15, v7_1, p16, p17);
        return;
    }

    public a(u.d p2)
    {
        this.a = 10;
        this.c = p2;
        return;
    }

    public a(p5.a[] p2)
    {
        this.a = 5;
        this.b = p2;
        this.c = new c5.c();
        return;
    }

    public Object a(z8.z p3)
    {
        java.util.concurrent.Executor v0_1 = ((java.util.concurrent.Executor) this.c);
        if (v0_1 != null) {
            return new z8.n(v0_1, p3);
        } else {
            return p3;
        }
    }

    public void b(z8.d p4, Throwable p5)
    {
        ((z8.n) this.c).a.execute(new androidx.fragment.app.l(this, ((z8.g) this.b), p5, 7));
        return;
    }

    public reflect.Type c()
    {
        return ((reflect.Type) this.b);
    }

    public void d(z8.d p4, z8.q0 p5)
    {
        ((z8.n) this.c).a.execute(new androidx.fragment.app.l(this, ((z8.g) this.b), p5, 6));
        return;
    }

    public com.google.android.datatransport.cct.CctBackendFactory e(String p14)
    {
        if (((java.util.Map) this.c) == null) {
            java.util.HashMap v2_16 = ((android.content.Context) this.b);
            try {
                java.util.HashMap v2_4;
                java.util.HashMap v5_0 = v2_16.getPackageManager();
            } catch (android.content.pm.PackageManager$NameNotFoundException) {
                android.util.Log.w("BackendRegistry", "Application info not found.");
                v2_4 = 0;
                java.util.HashMap v2_10;
                if (v2_4 != null) {
                    java.util.HashMap v5_4 = new java.util.HashMap();
                    java.util.Iterator v6_3 = v2_4.keySet().iterator();
                    while (v6_3.hasNext()) {
                        String v7_3 = ((String) v6_3.next());
                        String[] v8_0 = v2_4.get(v7_3);
                        if (((v8_0 instanceof String)) && (v7_3.startsWith("backend:"))) {
                            String[] v8_2 = ((String) v8_0).split(",", -1);
                            int v9_4 = v8_2.length;
                            int v10_1 = 0;
                            while (v10_1 < v9_4) {
                                String v11_1 = v8_2[v10_1].trim();
                                if (!v11_1.isEmpty()) {
                                    v5_4.put(v11_1, v7_3.substring(8));
                                }
                                v10_1++;
                            }
                        }
                    }
                    v2_10 = v5_4;
                } else {
                    android.util.Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                    v2_10 = java.util.Collections.EMPTY_MAP;
                }
                this.c = v2_10;
            }
            if (v5_0 != null) {
                java.util.HashMap v2_3 = v5_0.getServiceInfo(new android.content.ComponentName(v2_16, com.google.android.datatransport.runtime.backends.TransportBackendDiscovery), 128);
                if (v2_3 != null) {
                    v2_4 = v2_3.metaData;
                } else {
                    android.util.Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                }
            } else {
                android.util.Log.w("BackendRegistry", "Context has no PackageManager.");
            }
        }
        String v14_6 = ((String) ((java.util.Map) this.c).get(p14));
        if (v14_6 != null) {
            try {
                return ((com.google.android.datatransport.cct.CctBackendFactory) Class.forName(v14_6).asSubclass(com.google.android.datatransport.cct.CctBackendFactory).getDeclaredConstructor(int v3).newInstance(0));
            } catch (reflect.InvocationTargetException v0_1) {
                StringBuilder v1_2 = new StringBuilder("Class ");
                v1_2.append(v14_6);
                v1_2.append(" is not found.");
                android.util.Log.w("BackendRegistry", v1_2.toString(), v0_1);
                return 0;
            } catch (java.util.HashMap v2_0) {
                java.util.HashMap v5_2 = new StringBuilder("Could not instantiate ");
                v5_2.append(v14_6);
                v5_2.append(".");
                android.util.Log.w("BackendRegistry", v5_2.toString(), v2_0);
                return 0;
            } catch (java.util.HashMap v2_21) {
                java.util.HashMap v5_7 = new StringBuilder("Could not instantiate ");
                v5_7.append(v14_6);
                v5_7.append(".");
                android.util.Log.w("BackendRegistry", v5_7.toString(), v2_21);
                return 0;
            } catch (reflect.InvocationTargetException v0_3) {
                android.util.Log.w("BackendRegistry", "Could not instantiate ".concat(v14_6), v0_3);
                return 0;
            } catch (reflect.InvocationTargetException v0_2) {
                android.util.Log.w("BackendRegistry", "Could not instantiate ".concat(v14_6), v0_2);
                return 0;
            }
        } else {
            return 0;
        }
    }

    public StackTraceElement[] f(StackTraceElement[] p7)
    {
        if (p7.length > 1024) {
            int v2 = 0;
            StackTraceElement[] v3 = p7;
            while ((v2 < 1) && (v3.length > 1024)) {
                v3 = ((p5.a[]) this.b)[v2].f(p7);
                v2++;
            }
            if (v3.length <= 1024) {
                return v3;
            } else {
                return ((c5.c) this.c).f(v3);
            }
        } else {
            return p7;
        }
    }

    public q6.d g(n6.f p14)
    {
        String v1_0 = p14.g;
        long v2 = p14.f;
        NullPointerException v14_2 = new java.util.HashSet();
        int v5 = 0;
        while (v5 < v1_0.length()) {
            q6.c v6_0 = v1_0.getJSONObject(v5);
            String v7_1 = v6_0.getString("rolloutId");
            String v8_1 = v6_0.getJSONArray("affectedParameterKeys");
            if (v8_1.length() > 1) {
                android.util.Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", new Object[] {v7_1, v8_1})));
            }
            String v9_6;
            String v8_2 = v8_1.optString(0, "");
            String v9_4 = ((n6.d) this.b).c();
            String v11_2 = 0;
            try {
                if (v9_4 != null) {
                    v9_6 = v9_4.b.getString(v8_2);
                } else {
                    v9_6 = 0;
                }
                if (v9_6 == null) {
                    String v9_9 = ((n6.d) this.c).c();
                    try {
                        if (v9_9 != null) {
                            v11_2 = v9_9.b.getString(v8_2);
                        }
                        if (v11_2 == null) {
                            v9_6 = "";
                        } else {
                            v9_6 = v11_2;
                        }
                    } catch (org.json.JSONException) {
                    }
                }
                String v11_4 = new q6.b();
                if (v7_1 == null) {
                    throw new NullPointerException("Null rolloutId");
                } else {
                    v11_4.a = v7_1;
                    q6.c v6_1 = v6_0.getString("variantId");
                    if (v6_1 == null) {
                        throw new NullPointerException("Null variantId");
                    } else {
                        v11_4.b = v6_1;
                        if (v8_2 == null) {
                            throw new NullPointerException("Null parameterKey");
                        } else {
                            v11_4.c = v8_2;
                            v11_4.d = v9_6;
                            v11_4.e = v2;
                            v11_4.f = ((byte) (v11_4.f | 1));
                            v14_2.add(v11_4.a());
                            v5++;
                        }
                    }
                }
            } catch (org.json.JSONException) {
            }
        }
        return new q6.d(v14_2);
    }

    public Object get()
    {
        switch (this.a) {
            case 9:
                return new s2.d(((android.content.Context) ((k4.i) this.b).b), ((b8.g) ((j6.o) this.c).get()));
            default:
                return new y2.h(new c5.c(), new a6.e(), y2.a.f, ((y2.j) ((g7.a) this.b).get()), ((g7.a) this.c));
        }
    }

    public void h(okhttp3.Call p2, java.io.IOException p3)
    {
        try {
            ((z8.g) this.b).b(((z8.z) this.c), p3);
            return;
        } catch (Throwable v2_2) {
            z8.z0.r(v2_2);
            v2_2.printStackTrace();
            return;
        }
    }

    public q0.s1 i(android.view.View p20, q0.s1 p21)
    {
        int v10_2;
        int v3_1 = ((i2.m) this.b);
        int v4_4 = ((q3.m) this.c);
        android.view.ViewGroup$MarginLayoutParams v5_0 = v4_4.a;
        int v6_2 = v4_4.b;
        int v4_5 = v4_4.c;
        h0.b v7_0 = p21.a;
        int v8_1 = v7_0.f(519);
        h0.b v7_1 = v7_0.f(32);
        com.google.android.material.bottomsheet.BottomSheetBehavior v9_2 = ((com.google.android.material.bottomsheet.BottomSheetBehavior) v3_1.b);
        int v11 = v8_1.c;
        int v12 = v8_1.a;
        v9_2.w = v8_1.b;
        if (p20.getLayoutDirection() != 1) {
            v10_2 = 0;
        } else {
            v10_2 = 1;
        }
        int v15_0 = p20.getPaddingBottom();
        int v16 = p20.getPaddingLeft();
        int v17 = p20.getPaddingRight();
        boolean v13 = v9_2.o;
        if (v13) {
            int v15_1 = p21.a();
            v9_2.v = v15_1;
            v15_0 = (v15_1 + v4_5);
        }
        if (v9_2.p) {
            int v4_1;
            if (v10_2 == 0) {
                v4_1 = v5_0;
            } else {
                v4_1 = v6_2;
            }
            v16 = (v4_1 + v12);
        }
        int v4_2 = v16;
        if (v9_2.q) {
            if (v10_2 == 0) {
                v5_0 = v6_2;
            }
            v17 = (v5_0 + v11);
        }
        int v18;
        android.view.ViewGroup$MarginLayoutParams v5_1 = v17;
        int v6_1 = ((android.view.ViewGroup$MarginLayoutParams) p20.getLayoutParams());
        if ((!v9_2.s) || (v6_1.leftMargin == v12)) {
            v18 = 0;
        } else {
            v6_1.leftMargin = v12;
            v18 = 1;
        }
        if ((v9_2.t) && (v6_1.rightMargin != v11)) {
            v6_1.rightMargin = v11;
            v18 = 1;
        }
        int v14_2;
        if (!v9_2.u) {
            v14_2 = v18;
        } else {
            int v8_2 = v8_1.b;
            if (v6_1.topMargin == v8_2) {
            } else {
                v6_1.topMargin = v8_2;
                v14_2 = 1;
            }
        }
        if (v14_2 != 0) {
            p20.setLayoutParams(v6_1);
        }
        p20.setPadding(v4_2, p20.getPaddingTop(), v5_1, v15_0);
        boolean v1_1 = v3_1.a;
        if (v1_1) {
            v9_2.m = v7_1.d;
        }
        if ((!v13) && (!v1_1)) {
            return p21;
        } else {
            v9_2.O();
            return p21;
        }
    }

    public void j(okhttp3.Call p2, okhttp3.Response p3)
    {
        Throwable v2_1 = ((z8.g) this.b);
        z8.z v0_1 = ((z8.z) this.c);
        try {
            try {
                v2_1.d(v0_1, v0_1.d(p3));
                return;
            } catch (Throwable v2_2) {
                z8.z0.r(v2_2);
                v2_2.printStackTrace();
                return;
            }
        } catch (Throwable v3_2) {
            z8.z0.r(v3_2);
            try {
                v2_1.b(v0_1, v3_2);
            } catch (Throwable v2_3) {
                z8.z0.r(v2_3);
                v2_3.printStackTrace();
            }
            return;
        }
        v2_1.d(v0_1, v0_1.d(p3));
        return;
    }

    public void k(n0.g p5)
    {
        m0.f v0_1 = ((m0.f) this.c);
        l6.c v1_1 = ((l6.c) this.b);
        b5.l v2_2 = p5.b;
        if (v2_2 != null) {
            v0_1.execute(new com.google.android.material.datepicker.g(v1_1, v2_2, 2));
            return;
        } else {
            v0_1.execute(new b5.l(7, v1_1, p5.a));
            return;
        }
    }

    public void l(android.content.Context p12, android.content.res.XmlResourceParser p13)
    {
        z.n v0_1 = new z.n();
        int v1_6 = p13.getAttributeCount();
        String v3_1 = 0;
        while (v3_1 < v1_6) {
            int v4_2 = p13.getAttributeName(v3_1);
            String v5_0 = p13.getAttributeValue(v3_1);
            if ((v4_2 == 0) || ((v5_0 == null) || (!"id".equals(v4_2)))) {
                v3_1++;
            } else {
                int v1_2;
                if (!v5_0.contains("/")) {
                    v1_2 = -1;
                } else {
                    v1_2 = p12.getResources().getIdentifier(v5_0.substring((v5_0.indexOf(47) + 1)), "id", p12.getPackageName());
                }
                if (v1_2 == -1) {
                    if (v5_0.length() <= 1) {
                        android.util.Log.e("ConstraintLayoutStates", "error in parsing id");
                    } else {
                        v1_2 = Integer.parseInt(v5_0.substring(1));
                    }
                }
                java.util.HashMap v6_22 = p13.getEventType();
                int v8_0 = 0;
                while (v6_22 != 1) {
                    if (v6_22 == null) {
                        p13.getName();
                    } else {
                        if (v6_22 == 2) {
                            java.util.HashMap v6_23 = p13.getName();
                            switch (v6_23.hashCode()) {
                                case -2025855158:
                                    if (v6_23.equals("Layout")) {
                                        if (v8_0 == 0) {
                                            StringBuilder v2_7 = new StringBuilder();
                                            v2_7.append("XML parser error must be within a Constraint ");
                                            v2_7.append(p13.getLineNumber());
                                            throw new RuntimeException(v2_7.toString());
                                        } else {
                                            v8_0.d.a(p12, android.util.Xml.asAttributeSet(p13));
                                        }
                                    }
                                    break;
                                case -1984451626:
                                    if (v6_23.equals("Motion")) {
                                        if (v8_0 == 0) {
                                            StringBuilder v2_5 = new StringBuilder();
                                            v2_5.append("XML parser error must be within a Constraint ");
                                            v2_5.append(p13.getLineNumber());
                                            throw new RuntimeException(v2_5.toString());
                                        } else {
                                            v8_0.c.a(p12, android.util.Xml.asAttributeSet(p13));
                                        }
                                    }
                                    break;
                                case -1962203927:
                                    if (v6_23.equals("ConstraintOverride")) {
                                        v8_0 = z.n.d(p12, android.util.Xml.asAttributeSet(p13), 1);
                                    }
                                    break;
                                case -1269513683:
                                    if (v6_23.equals("PropertySet")) {
                                        if (v8_0 == 0) {
                                            StringBuilder v2_3 = new StringBuilder();
                                            v2_3.append("XML parser error must be within a Constraint ");
                                            v2_3.append(p13.getLineNumber());
                                            throw new RuntimeException(v2_3.toString());
                                        } else {
                                            v8_0.b.a(p12, android.util.Xml.asAttributeSet(p13));
                                        }
                                    }
                                    break;
                                case -1238332596:
                                    if (v6_23.equals("Transform")) {
                                        if (v8_0 == 0) {
                                            StringBuilder v2_1 = new StringBuilder();
                                            v2_1.append("XML parser error must be within a Constraint ");
                                            v2_1.append(p13.getLineNumber());
                                            throw new RuntimeException(v2_1.toString());
                                        } else {
                                            v8_0.e.a(p12, android.util.Xml.asAttributeSet(p13));
                                        }
                                    }
                                    break;
                                case -71750448:
                                    if (v6_23.equals("Guideline")) {
                                        v8_0 = z.n.d(p12, android.util.Xml.asAttributeSet(p13), 0);
                                        v8_0.d.a = 1;
                                    }
                                    break;
                                case 366511058:
                                    if (v6_23.equals("CustomMethod")) {
                                    }
                                    break;
                                case 1331510167:
                                    if (v6_23.equals("Barrier")) {
                                        v8_0 = z.n.d(p12, android.util.Xml.asAttributeSet(p13), 0);
                                        v8_0.d.h0 = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (v6_23.equals("CustomAttribute")) {
                                    }
                                    break;
                                case 1803088381:
                                    if (v6_23.equals("Constraint")) {
                                        v8_0 = z.n.d(p12, android.util.Xml.asAttributeSet(p13), 0);
                                    }
                                    break;
                                default:
                            }
                            if (v8_0 == 0) {
                                StringBuilder v2_10 = new StringBuilder();
                                v2_10.append("XML parser error must be within a Constraint ");
                                v2_10.append(p13.getLineNumber());
                                throw new RuntimeException(v2_10.toString());
                            } else {
                                z.b.a(p12, p13, v8_0.f);
                            }
                        } else {
                            if (v6_22 == 3) {
                                java.util.HashMap v6_16 = p13.getName().toLowerCase(java.util.Locale.ROOT);
                                switch (v6_16.hashCode()) {
                                    case -2075718416:
                                        if (v6_16.equals("guideline")) {
                                        }
                                        break;
                                    case -190376483:
                                        if (v6_16.equals("constraint")) {
                                        }
                                        break;
                                    case 426575017:
                                        if (v6_16.equals("constraintoverride")) {
                                        }
                                        break;
                                    case 2146106725:
                                        if (v6_16.equals("constraintset")) {
                                            break;
                                        }
                                        break;
                                    default:
                                }
                                v0_1.c.put(Integer.valueOf(v8_0.a), v8_0);
                                v8_0 = 0;
                            } else {
                            }
                        }
                    }
                    v6_22 = p13.next();
                }
                ((android.util.SparseArray) this.c).put(v1_2, v0_1);
                return;
            }
        }
        return;
    }

    public void onComplete(com.google.android.gms.tasks.Task p17)
    {
        switch (this.a) {
            case 13:
                com.google.firebase.auth.internal.GenericIdpActivity v1_2 = ((com.google.firebase.auth.internal.GenericIdpActivity) this.b);
                android.content.Intent v12_1 = ((String) this.c);
                if (v1_2.getPackageManager().resolveActivity(new android.content.Intent("android.intent.action.VIEW"), 0) == null) {
                    android.util.Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                    com.google.android.gms.internal.firebase-auth-api.zzaer.zzb(v1_2, v12_1);
                } else {
                    android.content.Intent v2_5 = v1_2.getPackageManager().queryIntentServices(new android.content.Intent("android.support.customtabs.action.CustomTabsService"), 0);
                    if ((v2_5 == null) || (v2_5.isEmpty())) {
                        android.content.Intent v2_8 = new android.content.Intent("android.intent.action.VIEW", ((android.net.Uri) p17.getResult()));
                        v2_8.putExtra("com.android.browser.application_id", v12_1);
                        android.util.Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                        v2_8.addFlags(1073741824);
                        v2_8.addFlags(268435456);
                        v1_2.startActivity(v2_8);
                    } else {
                        android.content.Intent v2_10 = new android.content.Intent("android.intent.action.VIEW");
                        if (!v2_10.hasExtra("android.support.customtabs.extra.SESSION")) {
                            android.net.Uri v3_14 = new android.os.Bundle();
                            v3_14.putBinder("android.support.customtabs.extra.SESSION", 0);
                            v2_10.putExtras(v3_14);
                        }
                        v2_10.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", 1);
                        v2_10.putExtras(new android.os.Bundle());
                        v2_10.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                        android.util.Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
                        v2_10.setData(((android.net.Uri) p17.getResult()));
                        e0.c.startActivity(v1_2, v2_10, 0);
                    }
                }
                return;
            default:
                com.google.firebase.auth.internal.GenericIdpActivity v1_4 = ((com.google.firebase.auth.internal.RecaptchaActivity) this.b);
                android.content.Intent v14_6 = ((String) this.c);
                if (v1_4.getPackageManager().resolveActivity(new android.content.Intent("android.intent.action.VIEW"), 0) == null) {
                    android.util.Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                    com.google.android.gms.internal.firebase-auth-api.zzaer.zzb(v1_4, v14_6);
                } else {
                    android.content.Intent v2_12 = v1_4.getPackageManager().queryIntentServices(new android.content.Intent("android.support.customtabs.action.CustomTabsService"), 0);
                    if ((v2_12 == null) || (v2_12.isEmpty())) {
                        android.content.Intent v2_0 = new android.content.Intent("android.intent.action.VIEW", ((android.net.Uri) p17.getResult()));
                        v2_0.putExtra("com.android.browser.application_id", v14_6);
                        v2_0.addFlags(1073741824);
                        v2_0.addFlags(268435456);
                        v1_4.startActivity(v2_0);
                    } else {
                        android.content.Intent v2_2 = new android.content.Intent("android.intent.action.VIEW");
                        if (!v2_2.hasExtra("android.support.customtabs.extra.SESSION")) {
                            android.net.Uri v3_3 = new android.os.Bundle();
                            v3_3.putBinder("android.support.customtabs.extra.SESSION", 0);
                            v2_2.putExtras(v3_3);
                        }
                        v2_2.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", 1);
                        v2_2.putExtras(new android.os.Bundle());
                        v2_2.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                        v2_2.addFlags(1073741824);
                        v2_2.addFlags(268435456);
                        v2_2.setData(((android.net.Uri) p17.getResult()));
                        e0.c.startActivity(v1_4, v2_2, 0);
                    }
                }
                return;
        }
    }

    public com.google.android.gms.tasks.Task then(Object p10)
    {
        com.google.android.gms.tasks.TaskCompletionSource v10_2 = ((o5.d) this.c);
        java.util.concurrent.atomic.AtomicReference v0_2 = ((org.json.JSONObject) ((h5.f) this.b).c.a.submit(new g5.p(this, 3)).get());
        int v1_0 = 0;
        if (v0_2 != null) {
            o5.c v2_2 = ((j6.o) v10_2.c).E(v0_2);
            android.content.SharedPreferences$Editor v3_1 = ((j6.o) v10_2.e);
            String v4_0 = v2_2.c;
            v3_1.getClass();
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                android.util.Log.v("FirebaseCrashlytics", "Writing settings to cache file...", 0);
            }
            try {
                v0_2.put("expires_at", v4_0);
                String v4_2 = new java.io.FileWriter(((java.io.File) v3_1.b));
                try {
                    v4_2.write(v0_2.toString());
                    v4_2.flush();
                } catch (android.content.SharedPreferences$Editor v3_4) {
                    android.util.Log.e("FirebaseCrashlytics", "Failed to cache settings", v3_4);
                }
                g5.g.b(v4_2, "Failed to close settings writer.");
                o5.d.d(v0_2, "Loaded settings: ");
                java.util.concurrent.atomic.AtomicReference v0_8 = ((o5.f) v10_2.b).f;
                android.content.SharedPreferences$Editor v3_10 = ((android.content.Context) v10_2.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                v3_10.putString("existing_instance_identifier", v0_8);
                v3_10.apply();
                ((java.util.concurrent.atomic.AtomicReference) v10_2.h).set(v2_2);
                ((com.google.android.gms.tasks.TaskCompletionSource) ((java.util.concurrent.atomic.AtomicReference) v10_2.i).get()).trySetResult(v2_2);
            } catch (android.content.SharedPreferences$Editor v3_4) {
                v4_2 = 0;
            } catch (com.google.android.gms.tasks.TaskCompletionSource v10_3) {
                g5.g.b(v1_0, "Failed to close settings writer.");
                throw v10_3;
            } catch (com.google.android.gms.tasks.TaskCompletionSource v10_3) {
                v1_0 = v4_2;
            }
        }
        return com.google.android.gms.tasks.Tasks.forResult(0);
    }

    public Object then(com.google.android.gms.tasks.Task p6)
    {
        if (p6.isSuccessful()) {
            Throwable v6_2 = ((com.google.android.gms.internal.firebase-auth-api.zzahs) p6.getResult());
            com.google.android.gms.tasks.Task v0_12 = v6_2.zza();
            if (!com.google.android.gms.internal.firebase-auth-api.zzac.zzc(v0_12)) {
                a5.z v1_4;
                a5.z v1_2 = com.google.android.gms.internal.firebase-auth-api.zzt.zza(47).zza(v0_12);
                if (v1_2.size() == 4) {
                    v1_4 = ((String) v1_2.get(3));
                } else {
                    v1_4 = 0;
                }
                if (!android.text.TextUtils.isEmpty(v1_4)) {
                    if (android.util.Log.isLoggable("RecaptchaHandler", 4)) {
                        String v2_4 = ((String) this.b);
                        Object v3_2 = new StringBuilder("Successfully obtained site key for tenant ");
                        v3_2.append(v2_4);
                        android.util.Log.i("RecaptchaHandler", v3_2.toString());
                    }
                    com.google.android.gms.tasks.Task v0_5 = ((a5.z) this.c);
                    String v2_7 = ((z4.z) v0_5.f);
                    com.google.android.gms.tasks.Task v0_7 = ((q4.f) v0_5.d);
                    v0_7.a();
                    com.google.android.gms.tasks.Task v0_9 = ((android.app.Application) v0_7.a);
                    v2_7.getClass();
                    com.google.android.gms.tasks.Task v0_10 = com.google.android.recaptcha.Recaptcha.fetchTaskClient(v0_9, v1_4);
                    a5.z v1_6 = ((a5.z) this.c);
                    String v2_9 = ((String) this.b);
                    try {
                        v1_6.c = v6_2;
                        ((java.util.HashMap) v1_6.b).put(v2_9, v0_10);
                        return v0_10;
                    } catch (Throwable v6_5) {
                        throw v6_5;
                    }
                } else {
                    return com.google.android.gms.tasks.Tasks.forException(new Exception(g2.g.l("Invalid siteKey format ", v0_12)));
                }
            } else {
                return com.google.android.gms.tasks.Tasks.forException(new z4.q(g2.g.l("No Recaptcha Enterprise siteKey configured for tenant/project ", ((String) this.b))));
            }
        } else {
            return com.google.android.gms.tasks.Tasks.forException(new z4.q(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(((Exception) com.google.android.gms.common.internal.Preconditions.checkNotNull(p6.getException())).getMessage()))));
        }
    }

    public String toString()
    {
        switch (this.a) {
            case 6:
                int v0_7 = new StringBuilder("Bounds{lower=");
                v0_7.append(((h0.b) this.b));
                v0_7.append(" upper=");
                v0_7.append(((h0.b) this.c));
                v0_7.append("}");
                return v0_7.toString();
            case 10:
                String v1_4 = "[ ";
                if (((u.f) this.b) != null) {
                    int v0_5 = 0;
                    while (v0_5 < 9) {
                        String v1_3 = u.e.b(v1_4);
                        v1_3.append(((u.f) this.b).n[v0_5]);
                        v1_3.append(" ");
                        v1_4 = v1_3.toString();
                        v0_5++;
                    }
                }
                int v0_1 = new StringBuilder();
                v0_1.append(v1_4);
                v0_1.append("] ");
                v0_1.append(((u.f) this.b));
                return v0_1.toString();
            default:
                return super.toString();
        }
    }
}
