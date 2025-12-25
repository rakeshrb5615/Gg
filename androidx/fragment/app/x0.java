package androidx.fragment.app;
public final class x0 extends f.a {
    public final synthetic int a;

    public synthetic x0(int p1)
    {
        this.a = p1;
        return;
    }

    public final android.content.Intent a(android.content.Context p5, Object p6)
    {
        switch (this.a) {
            case 0:
                e.k v6_7 = ((e.k) p6);
                String v5_9 = new android.content.Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                android.content.IntentSender v0_5 = ((e.k) p6).b;
                if (v0_5 != null) {
                    e.k v2_0 = v0_5.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (v2_0 != null) {
                        v5_9.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", v2_0);
                        v0_5.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                        if (v0_5.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", 0)) {
                            android.content.IntentSender v0_7 = ((e.k) p6).a;
                            kotlin.jvm.internal.j.e(v0_7, "intentSender");
                            v6_7 = new e.k(v0_7, 0, ((e.k) p6).c, ((e.k) p6).d);
                        }
                    }
                }
                v5_9.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", v6_7);
                if (androidx.fragment.app.b1.H(2)) {
                    e.k v6_13 = new StringBuilder("CreateIntent created the following intent: ");
                    v6_13.append(v5_9);
                    android.util.Log.v("FragmentManager", v6_13.toString());
                }
                return v5_9;
            case 1:
                kotlin.jvm.internal.j.e(((String[]) p6), "input");
                String v5_6 = new android.content.Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", ((String[]) p6));
                kotlin.jvm.internal.j.d(v5_6, "putExtra(...)");
                return v5_6;
            case 2:
                kotlin.jvm.internal.j.e(((String) p6), "input");
                String v5_2 = new android.content.Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[] {((String) p6)}));
                kotlin.jvm.internal.j.d(v5_2, "putExtra(...)");
                return v5_2;
            case 3:
                kotlin.jvm.internal.j.e(((android.content.Intent) p6), "input");
                return ((android.content.Intent) p6);
            default:
                kotlin.jvm.internal.j.e(((e.k) p6), "input");
                String v5_14 = new android.content.Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", ((e.k) p6));
                kotlin.jvm.internal.j.d(v5_14, "putExtra(...)");
                return v5_14;
        }
    }

    public l6.c b(android.content.Context p5, Object p6)
    {
        switch (this.a) {
            case 1:
                l6.c v5_6;
                kotlin.jvm.internal.j.e(((String[]) p6), "input");
                if (((String[]) p6).length != 0) {
                    int v1 = 0;
                    Boolean v2_0 = 0;
                    while (v2_0 < ((String[]) p6).length) {
                        if (e0.c.checkSelfPermission(p5, ((String[]) p6)[v2_0]) != 0) {
                            v5_6 = 0;
                        } else {
                            v2_0++;
                        }
                    }
                    l6.c v5_3 = i7.r.l0(((String[]) p6).length);
                    if (v5_3 < 16) {
                        v5_3 = 16;
                    }
                    java.util.LinkedHashMap v0_8 = new java.util.LinkedHashMap(v5_3);
                    l6.c v5_4 = ((String[]) p6).length;
                    while (v1 < v5_4) {
                        v0_8.put(((String[]) p6)[v1], Boolean.TRUE);
                        v1++;
                    }
                    v5_6 = new l6.c(v0_8, 15);
                } else {
                    v5_6 = new l6.c(i7.o.a, 15);
                }
                return v5_6;
            case 2:
                l6.c v5_1;
                kotlin.jvm.internal.j.e(((String) p6), "input");
                if (e0.c.checkSelfPermission(p5, ((String) p6)) != 0) {
                    v5_1 = 0;
                } else {
                    v5_1 = new l6.c(Boolean.TRUE, 15);
                }
                return v5_1;
            default:
                return super.b(p5, p6);
        }
    }

    public final Object c(int p6, android.content.Intent p7)
    {
        switch (this.a) {
            case 0:
                return new e.a(p6, p7);
            case 1:
                if ((p6 == -1) && (p7 != 0)) {
                    Object v6_4 = p7.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int v7_2 = p7.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if ((v7_2 != 0) && (v6_4 != null)) {
                        Object v0_7 = new java.util.ArrayList(v7_2.length);
                        int v1_2 = v7_2.length;
                        h7.f v3_0 = 0;
                        while (v3_0 < v1_2) {
                            Boolean v4_1;
                            if (v7_2[v3_0] != 0) {
                                v4_1 = 0;
                            } else {
                                v4_1 = 1;
                            }
                            v0_7.add(Boolean.valueOf(v4_1));
                            v3_0++;
                        }
                        Object v6_5 = i7.h.e0(v6_4);
                        int v7_3 = v6_5.iterator();
                        int v1_3 = v0_7.iterator();
                        java.util.ArrayList v2_3 = new java.util.ArrayList(Math.min(i7.j.X(v6_5, 10), i7.j.X(v0_7, 10)));
                        while ((v7_3.hasNext()) && (v1_3.hasNext())) {
                            v2_3.add(new h7.f(v7_3.next(), v1_3.next()));
                        }
                        Object v6_10 = i7.r.q0(v2_3);
                    } else {
                        v6_10 = i7.o.a;
                    }
                }
                return v6_10;
            case 2:
                if ((p7 != 0) && (p6 == -1)) {
                    Object v6_1 = p7.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    int v7_1 = 0;
                    if (v6_1 != null) {
                        int v1_0 = 0;
                        while (v1_0 < v6_1.length) {
                            if (v6_1[v1_0] != null) {
                                v1_0++;
                            } else {
                                v7_1 = 1;
                                break;
                            }
                        }
                    }
                    Object v6_2 = Boolean.valueOf(v7_1);
                } else {
                    v6_2 = Boolean.FALSE;
                }
                return v6_2;
            case 3:
                return new e.a(p6, p7);
            default:
                return new e.a(p6, p7);
        }
    }
}
