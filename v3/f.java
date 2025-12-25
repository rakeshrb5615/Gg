package v3;
public class f implements i5.c, l8.a, o5.e, p5.a, t1.a, a5.f, t2.b {
    public static volatile v3.f a;
    public static v3.f b;
    public static v3.f c;
    public static final synthetic v3.f d;

    public static synthetic f()
    {
        v3.f.d = new v3.f();
        return;
    }

    public f(android.view.View p3)
    {
        if (android.os.Build$VERSION.SDK_INT < 30) {
            new c5.c(p3);
            return;
        } else {
            new q0.z(p3);
            return;
        }
    }

    public static x8.j h(String p5)
    {
        if ((p5.length() % 2) != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(p5).toString());
        } else {
            IllegalArgumentException v0_3 = (p5.length() / 2);
            byte[] v1 = new byte[v0_3];
            int v2 = 0;
            while (v2 < v0_3) {
                byte v3_0 = (v2 * 2);
                v1[v2] = ((byte) (y8.b.a(p5.charAt((v3_0 + 1))) + (y8.b.a(p5.charAt(v3_0)) << 4)));
                v2++;
            }
            return new x8.j(v1);
        }
    }

    public static x8.j i(String p3)
    {
        kotlin.jvm.internal.j.e(p3, "<this>");
        byte[] v1_1 = p3.getBytes(b8.a.a);
        kotlin.jvm.internal.j.d(v1_1, "getBytes(...)");
        x8.j v0_2 = new x8.j(v1_1);
        v0_2.c = p3;
        return v0_2;
    }

    public static boolean m(i1.b p7, android.text.Editable p8, int p9, int p10, boolean p11)
    {
        if ((p8 != null) && ((p9 >= 0) && (p10 >= 0))) {
            int v1_0 = android.text.Selection.getSelectionStart(p8);
            int v2_2 = android.text.Selection.getSelectionEnd(p8);
            if ((v1_0 != -1) && ((v2_2 != -1) && (v1_0 == v2_2))) {
                int v10_1;
                if (p11 == 0) {
                    v1_0 = Math.max((v1_0 - p9), 0);
                    v10_1 = Math.min((v2_2 + p10), p8.length());
                } else {
                    int v9_2 = Math.max(p9, 0);
                    int v11_1 = p8.length();
                    if ((v1_0 >= 0) && ((v11_1 >= v1_0) && (v9_2 >= 0))) {
                        while(true) {
                            int v11_2 = 0;
                            if (v9_2 != 0) {
                                v1_0--;
                                if (v1_0 >= 0) {
                                    char v5_1 = p8.charAt(v1_0);
                                    if (v11_2 != 0) {
                                        break;
                                    }
                                    if (Character.isSurrogate(v5_1)) {
                                        if (!Character.isHighSurrogate(v5_1)) {
                                            v11_2 = 1;
                                            while (v9_2 != 0) {
                                            }
                                        } else {
                                            v1_0 = -1;
                                        }
                                    } else {
                                        v9_2--;
                                    }
                                } else {
                                    if (v11_2 == 0) {
                                        v1_0 = 0;
                                    }
                                }
                            }
                        }
                        if (Character.isHighSurrogate(v5_1)) {
                            v9_2--;
                        }
                    }
                    int v9_3 = Math.max(p10, 0);
                    v10_1 = p8.length();
                    if ((v2_2 >= 0) && ((v10_1 >= v2_2) && (v9_3 >= 0))) {
                        while(true) {
                            int v11_5 = 0;
                            if (v9_3 != 0) {
                                if (v2_2 < v10_1) {
                                    char v5_2 = p8.charAt(v2_2);
                                    if (v11_5 != 0) {
                                        break;
                                    }
                                    if (Character.isSurrogate(v5_2)) {
                                        if (!Character.isLowSurrogate(v5_2)) {
                                            v2_2++;
                                            v11_5 = 1;
                                            while (v9_3 != 0) {
                                            }
                                            v10_1 = v2_2;
                                        } else {
                                            v10_1 = -1;
                                        }
                                    } else {
                                        v9_3--;
                                        v2_2++;
                                    }
                                } else {
                                    if (v11_5 != 0) {
                                    }
                                }
                            }
                        }
                        if (Character.isLowSurrogate(v5_2)) {
                            v9_3--;
                            v2_2++;
                        }
                    }
                    if ((v1_0 == -1) || (v10_1 == -1)) {
                        return 0;
                    }
                }
                int v9_6 = ((g1.v[]) p8.getSpans(v1_0, v10_1, g1.v));
                if ((v9_6 != 0) && (v9_6.length > 0)) {
                    int v11_9 = v9_6.length;
                    int v2_0 = 0;
                    while (v2_0 < v11_9) {
                        int v3_0 = v9_6[v2_0];
                        char v5_0 = p8.getSpanStart(v3_0);
                        int v3_1 = p8.getSpanEnd(v3_0);
                        v1_0 = Math.min(v5_0, v1_0);
                        v10_1 = Math.max(v3_1, v10_1);
                        v2_0++;
                    }
                    int v9_7 = Math.max(v1_0, 0);
                    int v10_2 = Math.min(v10_1, p8.length());
                    p7.beginBatchEdit();
                    p8.delete(v9_7, v10_2);
                    p7.endBatchEdit();
                    return 1;
                }
            }
        }
        return 0;
    }

    public void a()
    {
        return;
    }

    public String b()
    {
        return 0;
    }

    public o5.c c(c5.c p17, org.json.JSONObject p18)
    {
        boolean v4_4;
        p18.optInt("settings_version", 0);
        long v1_4 = p18.optInt("cache_duration", 3600);
        double v11 = p18.optDouble("on_demand_upload_rate_per_minute", 4621819117588971520);
        double v13 = p18.optDouble("on_demand_backoff_base", 4608083138725491507);
        int v15 = p18.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (!p18.has("session")) {
            v4_4 = new o5.b(new org.json.JSONObject().optInt("max_custom_exception_events", 8));
        } else {
            v4_4 = new o5.b(p18.getJSONObject("session").optInt("max_custom_exception_events", 8));
        }
        long v0_1;
        o5.b v9 = v4_4;
        long v3_9 = p18.getJSONObject("features");
        o5.a v10_1 = new o5.a(v3_9.optBoolean("collect_reports", 1), v3_9.optBoolean("collect_anrs", 0), v3_9.optBoolean("collect_build_ids", 0));
        if (!p18.has("expires_at")) {
            v0_1 = ((((long) v1_4) * 1000) + System.currentTimeMillis());
        } else {
            v0_1 = p18.optLong("expires_at");
        }
        return new o5.c(v0_1, v9, v10_1, v11, v13, v15);
    }

    public CharSequence d(androidx.preference.Preference p3)
    {
        if (!android.text.TextUtils.isEmpty(0)) {
            return 0;
        } else {
            return ((androidx.preference.ListPreference) p3).a.getString(2131952196);
        }
    }

    public synthetic Object e(a5.z p1)
    {
        return com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar.zza(p1);
    }

    public StackTraceElement[] f(StackTraceElement[] p15)
    {
        StackTraceElement[] v0_1 = new java.util.HashMap();
        int v1_2 = new StackTraceElement[p15.length];
        int v4_1 = 0;
        int v5 = 0;
        int v6_0 = 1;
        while (v4_1 < p15.length) {
            int v8_5;
            StackTraceElement v7_0 = p15[v4_1];
            int v8_1 = ((Integer) v0_1.get(v7_0));
            if (v8_1 == 0) {
                v1_2[v5] = p15[v4_1];
                v5++;
                v6_0 = 1;
                v8_5 = v4_1;
            } else {
                int v9_0 = v8_1.intValue();
                int v10 = (v4_1 - v9_0);
                if ((v4_1 + v10) <= p15.length) {
                    int v11_1 = 0;
                    while (v11_1 < v10) {
                        if (p15[(v9_0 + v11_1)].equals(p15[(v4_1 + v11_1)])) {
                            v11_1++;
                        }
                    }
                    int v8_3 = (v4_1 - v8_1.intValue());
                    if (v6_0 < 10) {
                        System.arraycopy(p15, v4_1, v1_2, v5, v8_3);
                        v5 += v8_3;
                        v6_0++;
                    }
                    v8_5 = ((v8_3 - 1) + v4_1);
                }
            }
            v0_1.put(v7_0, Integer.valueOf(v4_1));
            v4_1 = (v8_5 + 1);
        }
        StackTraceElement[] v0_2 = new StackTraceElement[v5];
        System.arraycopy(v1_2, 0, v0_2, 0, v5);
        if (v5 >= p15.length) {
            return p15;
        } else {
            return v0_2;
        }
    }

    public void g(long p1, String p3)
    {
        return;
    }

    public Object get()
    {
        IllegalStateException v0_1 = new c5.c();
        String v1_1 = new java.util.HashMap();
        java.util.Set v7 = java.util.Collections.EMPTY_SET;
        if (v7 == null) {
            throw new NullPointerException("Null flags");
        } else {
            v1_1.put(o2.d.a, new x2.c(30000, 86400000, v7));
            if (v7 == null) {
                throw new NullPointerException("Null flags");
            } else {
                v1_1.put(o2.d.c, new x2.c(1000, 86400000, v7));
                if (v7 == null) {
                    throw new NullPointerException("Null flags");
                } else {
                    java.util.Set v14 = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(new x2.d[] {x2.d.b}))));
                    if (v14 == null) {
                        throw new NullPointerException("Null flags");
                    } else {
                        v1_1.put(o2.d.b, new x2.c(86400000, 86400000, v14));
                        if (v1_1.keySet().size() < o2.d.values().length) {
                            throw new IllegalStateException("Not all priorities have been configured");
                        } else {
                            new java.util.HashMap();
                            return new x2.b(v0_1, v1_1);
                        }
                    }
                }
            }
        }
    }

    public boolean j()
    {
        return (this instanceof v3.g);
    }

    public void k(float p1, float p2, float p3, v3.z p4)
    {
        p4.c(p1, 0);
        return;
    }

    public android.content.pm.Signature[] l(android.content.pm.PackageManager p2, String p3)
    {
        return p2.getPackageInfo(p3, 64).signatures;
    }

    public boolean n(CharSequence p1)
    {
        return (p1 instanceof o0.d);
    }
}
