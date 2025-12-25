package c;
public final class m extends e.i {
    public final synthetic c.n h;

    public m(c.n p1)
    {
        this.h = p1;
        return;
    }

    public final void b(int p10, f.a p11, Object p12)
    {
        kotlin.jvm.internal.j.e(p11, "contract");
        int v1_1 = this.h;
        int v0_7 = p11.b(v1_1, p12);
        if (v0_7 == 0) {
            android.os.Handler v11_9 = p11.a(v1_1, p12);
            if (v11_9.getExtras() != null) {
                int v12_4 = v11_9.getExtras();
                kotlin.jvm.internal.j.b(v12_4);
                if (v12_4.getClassLoader() == null) {
                    v11_9.setExtrasClassLoader(v1_1.getClassLoader());
                }
            }
            int v0_4;
            if (!v11_9.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                v0_4 = 0;
            } else {
                v0_4 = v11_9.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                v11_9.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            int v8 = v0_4;
            if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(v11_9.getAction())) {
                if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(v11_9.getAction())) {
                    v1_1.startActivityForResult(v11_9, p10, v8);
                    return;
                } else {
                    android.os.Handler v11_6 = ((e.k) v11_9.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"));
                    try {
                        kotlin.jvm.internal.j.b(v11_6);
                        Integer v3_7 = p10;
                        try {
                            v1_1.startIntentSenderForResult(v11_6.a, p10, v11_6.b, v11_6.c, v11_6.d, 0, v8);
                            return;
                        } catch (int v0_8) {
                            new android.os.Handler(android.os.Looper.getMainLooper()).post(new c.l(this, v3_7, 1, v0_8));
                            return;
                        }
                    } catch (int v0_8) {
                        v3_7 = p10;
                        new android.os.Handler(android.os.Looper.getMainLooper()).post(new c.l(this, v3_7, 1, v0_8));
                        return;
                    }
                    v1_1.startIntentSenderForResult(v11_6.a, p10, v11_6.b, v11_6.c, v11_6.d, 0, v8);
                    return;
                }
            } else {
                android.os.Handler v11_10 = v11_9.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int v12_1 = 0;
                if (v11_10 == null) {
                    v11_10 = new String[0];
                }
                int v0_11 = new java.util.HashSet();
                int v2_1 = 0;
                while (v2_1 < v11_10.length) {
                    if (android.text.TextUtils.isEmpty(v11_10[v2_1])) {
                        throw new IllegalArgumentException(v1.a.n(new StringBuilder("Permission request for permissions "), java.util.Arrays.toString(v11_10), " must not contain null or empty values"));
                    } else {
                        if ((android.os.Build$VERSION.SDK_INT < 33) && (android.text.TextUtils.equals(v11_10[v2_1], "android.permission.POST_NOTIFICATIONS"))) {
                            v0_11.add(Integer.valueOf(v2_1));
                        }
                        v2_1++;
                    }
                }
                Integer v3_9;
                int v2_3 = v0_11.size();
                if (v2_3 <= 0) {
                    v3_9 = v11_10;
                } else {
                    v3_9 = new String[(v11_10.length - v2_3)];
                }
                if (v2_3 > 0) {
                    if (v2_3 != v11_10.length) {
                        int v2_0 = 0;
                        while (v12_1 < v11_10.length) {
                            if (!v0_11.contains(Integer.valueOf(v12_1))) {
                                int v4_2 = (v2_0 + 1);
                                v3_9[v2_0] = v11_10[v12_1];
                                v2_0 = v4_2;
                            }
                            v12_1++;
                        }
                    } else {
                        return;
                    }
                }
                if ((v1_1 instanceof d0.a)) {
                    ((d0.a) v1_1).validateRequestPermissionsRequestCode(p10);
                }
                v1_1.requestPermissions(v11_10, p10);
                return;
            }
        } else {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new c.l(this, p10, 0, v0_7));
            return;
        }
    }
}
