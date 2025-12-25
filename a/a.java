package a;
public abstract class a {
    public static r6.c1 a;

    public static boolean C(android.view.MotionEvent p0, int p1)
    {
        if ((p0.getSource() & p1) != p1) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final boolean D(char p1)
    {
        if ((!Character.isWhitespace(p1)) && (!Character.isSpaceChar(p1))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static h7.d E(u7.a p2)
    {
        h7.i v1_1 = new h7.i();
        v1_1.a = p2;
        v1_1.b = h7.k.a;
        return v1_1;
    }

    public static h7.j F(u7.a p1)
    {
        kotlin.jvm.internal.j.e(p1, "initializer");
        return new h7.j(p1);
    }

    public static java.util.List G(Object p1)
    {
        java.util.List v1_1 = java.util.Collections.singletonList(p1);
        kotlin.jvm.internal.j.d(v1_1, "singletonList(...)");
        return v1_1;
    }

    public static varargs java.util.List H(Object[] p1)
    {
        if (p1.length <= 0) {
            return i7.n.a;
        } else {
            return i7.h.V(p1);
        }
    }

    public static int I(int p4)
    {
        if (p4 <= null) {
            throw new IllegalArgumentException(v1.a.j("x (", p4, ") must be > 0"));
        } else {
            int v1_0 = 1;
            switch (o4.a.a[java.math.RoundingMode.UNNECESSARY.ordinal()]) {
                case 1:
                    int v2_0;
                    if (p4 <= null) {
                        v2_0 = 0;
                    } else {
                        v2_0 = 1;
                    }
                    if (((p4 - 1) & p4) != 0) {
                        v1_0 = 0;
                    }
                    if ((v2_0 & v1_0) == 0) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    } else {
                    }
                    break;
                case 2:
                case 3:
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return (32 - Integer.numberOfLeadingZeros((p4 - 1)));
                case 6:
                case 7:
                case 8:
                    String v0_3 = Integer.numberOfLeadingZeros(p4);
                    return ((31 - v0_3) + ((~ (~ ((-1257966797 >> v0_3) - p4))) >> 31));
                default:
                    throw new AssertionError();
            }
            return (31 - Integer.numberOfLeadingZeros(p4));
        }
    }

    public static void J(android.content.Intent p22)
    {
        if (a.a.T(p22)) {
            a.a.K(p22.getExtras(), "_nr");
        }
        if ((p22 != null) && (!"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(p22.getAction()))) {
            NumberFormatException v0_10 = a.a.q();
        } else {
            v0_10 = 0;
        }
        if (v0_10 != null) {
            r2.q v3_3 = ((o2.g) com.google.firebase.messaging.FirebaseMessaging.l.get());
            if (v3_3 != null) {
                NumberFormatException v0_2 = 0;
                if (p22 != null) {
                    long v5_10 = p22.getExtras();
                    if (v5_10 == 0) {
                        v5_10 = android.os.Bundle.EMPTY;
                    }
                    int v16;
                    String v6_23;
                    String v6_22 = v5_10.get("google.ttl");
                    if (!(v6_22 instanceof Integer)) {
                        if ((v6_22 instanceof String)) {
                            try {
                                v6_23 = Integer.parseInt(((String) v6_22));
                            } catch (NumberFormatException) {
                                k6.d v7_9 = new StringBuilder("Invalid TTL: ");
                                v7_9.append(v6_23);
                                android.util.Log.w("FirebaseMessaging", v7_9.toString());
                            }
                            v16 = v6_23;
                            String v6_27 = v5_10.getString("google.to");
                            if (android.text.TextUtils.isEmpty(v6_27)) {
                                try {
                                    String v6_28 = q4.f.d();
                                    try {
                                        com.google.android.gms.common.internal.Preconditions.checkArgument(1, "Null is not a valid value of FirebaseApp.");
                                    } catch (NumberFormatException v0_29) {
                                        throw new RuntimeException(v0_29);
                                    }
                                    v6_27 = ((String) com.google.android.gms.tasks.Tasks.await(((d6.c) v6_28.b(d6.d)).c()));
                                } catch (NumberFormatException v0_29) {
                                }
                            }
                            String v6_36;
                            String v11 = v6_27;
                            String v6_33 = q4.f.d();
                            v6_33.a();
                            String v13 = v6_33.a.getPackageName();
                            if (!j6.o.C(v5_10)) {
                                v6_36 = k6.b.b;
                            } else {
                                v6_36 = k6.b.c;
                            }
                            String v6_6;
                            String v12 = v6_36;
                            String v6_4 = v5_10.getString("google.delivered_priority");
                            if (v6_4 != null) {
                                if (!"high".equals(v6_4)) {
                                    if (!"normal".equals(v6_4)) {
                                        v6_6 = 0;
                                    } else {
                                        v6_6 = 2;
                                    }
                                } else {
                                    v6_6 = 1;
                                }
                            } else {
                                if (!"1".equals(v5_10.getString("google.priority_reduced"))) {
                                    v6_4 = v5_10.getString("google.priority");
                                }
                            }
                            String v6_7;
                            int v15;
                            if (v6_6 != 2) {
                                if (v6_6 != 1) {
                                    v15 = 0;
                                } else {
                                    v6_7 = 10;
                                    v15 = v6_7;
                                }
                            } else {
                                v6_7 = 5;
                            }
                            String v6_9 = v5_10.getString("google.message_id");
                            if (v6_9 == null) {
                                v6_9 = v5_10.getString("message_id");
                            }
                            String v10;
                            if (v6_9 == null) {
                                v10 = "";
                            } else {
                                v10 = v6_9;
                            }
                            String v6_12 = v5_10.getString("from");
                            if ((v6_12 != null) && (v6_12.startsWith("/topics/"))) {
                                v0_2 = v6_12;
                            }
                            String v17;
                            if (v0_2 == null) {
                                v17 = "";
                            } else {
                                v17 = v0_2;
                            }
                            String v14_2;
                            NumberFormatException v0_4 = v5_10.getString("collapse_key");
                            if (v0_4 == null) {
                                v14_2 = "";
                            } else {
                                v14_2 = v0_4;
                            }
                            String v18;
                            NumberFormatException v0_6 = v5_10.getString("google.c.a.m_l");
                            if (v0_6 == null) {
                                v18 = "";
                            } else {
                                v18 = v0_6;
                            }
                            String v19;
                            NumberFormatException v0_8 = v5_10.getString("google.c.a.c_l");
                            if (v0_8 == null) {
                                v19 = "";
                            } else {
                                v19 = v0_8;
                            }
                            long v5_0;
                            if (!v5_10.containsKey("google.c.sender.id")) {
                                v5_0 = q4.f.d();
                                String v6_14 = v5_0.c;
                                v5_0.a();
                                NumberFormatException v0_13 = v6_14.e;
                                if (v0_13 != null) {
                                    try {
                                        v5_0 = Long.parseLong(v0_13);
                                    } catch (NumberFormatException v0_14) {
                                        android.util.Log.w("FirebaseMessaging", "error parsing sender ID", v0_14);
                                    }
                                    long v8_0;
                                    if (v5_0 <= 0) {
                                        v8_0 = 0;
                                    } else {
                                        v8_0 = v5_0;
                                    }
                                    v0_2 = new k6.d(v8_0, v10, v11, v12, v13, v14_2, v15, v16, v17, v18, v19);
                                    if (v0_2 != null) {
                                        try {
                                            ((r2.p) v3_3).a("FCM_CLIENT_EVENT_LOGGING", new o2.c("proto"), new a5.t(23)).l(new o2.a(new k6.e(v0_2), o2.d.a, new o2.b(Integer.valueOf(p22.getIntExtra("google.product_id", 111881503)))), new r2.q(0));
                                        } catch (NumberFormatException v0_26) {
                                            android.util.Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", v0_26);
                                        }
                                    }
                                    return;
                                }
                                v5_0.a();
                                NumberFormatException v0_15 = v6_14.b;
                                if (v0_15.startsWith("1:")) {
                                    NumberFormatException v0_18 = v0_15.split(":");
                                    if (v0_18.length >= 2) {
                                        NumberFormatException v0_19 = v0_18[1];
                                        if (!v0_19.isEmpty()) {
                                            try {
                                                v5_0 = Long.parseLong(v0_19);
                                            } catch (NumberFormatException v0_20) {
                                                android.util.Log.w("FirebaseMessaging", "error parsing app ID", v0_20);
                                            }
                                        }
                                    }
                                } else {
                                    try {
                                        v5_0 = Long.parseLong(v0_15);
                                    } catch (NumberFormatException v0_21) {
                                        android.util.Log.w("FirebaseMessaging", "error parsing app ID", v0_21);
                                    }
                                }
                                v5_0 = 0;
                            } else {
                                try {
                                    v5_0 = Long.parseLong(v5_10.getString("google.c.sender.id"));
                                } catch (NumberFormatException v0_12) {
                                    android.util.Log.w("FirebaseMessaging", "error parsing project number", v0_12);
                                }
                            }
                        }
                        v16 = 0;
                    } else {
                        v6_23 = ((Integer) v6_22).intValue();
                    }
                }
            } else {
                android.util.Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
        }
        return;
    }

    public static void K(android.os.Bundle p5, String p6)
    {
        try {
            q4.f.d();
        } catch (IllegalStateException) {
            android.util.Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
            return;
        }
        if (p5 == null) {
            p5 = new android.os.Bundle();
        }
        android.os.Bundle v1_1 = new android.os.Bundle();
        Class v2_2 = p5.getString("google.c.a.c_id");
        if (v2_2 != null) {
            v1_1.putString("_nmid", v2_2);
        }
        Class v2_4 = p5.getString("google.c.a.c_l");
        if (v2_4 != null) {
            v1_1.putString("_nmn", v2_4);
        }
        Class v2_6 = p5.getString("google.c.a.m_l");
        if (!android.text.TextUtils.isEmpty(v2_6)) {
            v1_1.putString("label", v2_6);
        }
        Class v2_8 = p5.getString("google.c.a.m_c");
        if (!android.text.TextUtils.isEmpty(v2_8)) {
            v1_1.putString("message_channel", v2_8);
        }
        Class v2_10 = p5.getString("from");
        String v3_6 = 0;
        if ((v2_10 == null) || (!v2_10.startsWith("/topics/"))) {
            v2_10 = 0;
        }
        if (v2_10 != null) {
            v1_1.putString("_nt", v2_10);
        }
        Class v2_12 = p5.getString("google.c.a.ts");
        if (v2_12 != null) {
            try {
                v1_1.putInt("_nmt", Integer.parseInt(v2_12));
            } catch (Class v2_14) {
                android.util.Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", v2_14);
            }
        }
        if (p5.containsKey("google.c.a.udt")) {
            v3_6 = p5.getString("google.c.a.udt");
        }
        if (v3_6 != null) {
            try {
                v1_1.putInt("_ndt", Integer.parseInt(v3_6));
            } catch (Class v2_17) {
                android.util.Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", v2_17);
            }
        }
        String v5_10;
        if (!j6.o.C(p5)) {
            v5_10 = "data";
        } else {
            v5_10 = "display";
        }
        if (("_nr".equals(p6)) || ("_nf".equals(p6))) {
            v1_1.putString("_nmc", v5_10);
        }
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            String v5_14 = new StringBuilder("Logging to scion event=");
            v5_14.append(p6);
            v5_14.append(" scionPayload=");
            v5_14.append(v1_1);
            android.util.Log.d("FirebaseMessaging", v5_14.toString());
        }
        String v5_4 = ((u4.b) q4.f.d().b(u4.b));
        if (v5_4 == null) {
            android.util.Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        } else {
            ((u4.c) v5_4).a("fcm", p6, v1_1);
        }
        return;
    }

    public static final void L()
    {
        try {
            if (a.a.a == null) {
                r6.c1 v0_2 = ((r6.c1) ((r6.i) ((r6.r) q4.f.d().b(r6.r))).o.get());
                kotlin.jvm.internal.j.e(v0_2, "<set-?>");
                a.a.a = v0_2;
            }
        } catch (Exception) {
            return;
        }
        r6.c1 v0_3 = a.a.a;
        if (v0_3 == null) {
            kotlin.jvm.internal.j.i("sharedSessionRepository");
            throw 0;
        } else {
            if (!v0_3.i) {
                return;
            } else {
                if (v0_3 == null) {
                    kotlin.jvm.internal.j.i("sharedSessionRepository");
                    throw 0;
                } else {
                    v0_3.b();
                    return;
                }
            }
        }
    }

    public static void M(android.view.inputmethod.EditorInfo p0, android.view.inputmethod.InputConnection p1, android.widget.TextView p2)
    {
        if ((p1) && (p0.hintText == null)) {
            android.view.ViewParent v0_2 = p2.getParent();
            while ((v0_2 instanceof android.view.View)) {
                v0_2 = v0_2.getParent();
            }
        }
        return;
    }

    public static float N(android.widget.EdgeEffect p2, float p3, float p4)
    {
        if (android.os.Build$VERSION.SDK_INT < 31) {
            t0.b.a(p2, p3, p4);
            return p3;
        } else {
            return t0.c.c(p2, p3, p4);
        }
    }

    public static void S(androidx.fragment.app.j0 p2, android.view.ViewGroup p3, int p4)
    {
        if ((p2 != 0) && (p3 != null)) {
            android.graphics.drawable.GradientDrawable v0_2 = p3.getBackground();
            if ((v0_2 != null) && ((v0_2 instanceof android.graphics.drawable.LayerDrawable))) {
                android.graphics.drawable.GradientDrawable v0_0 = ((android.graphics.drawable.LayerDrawable) v0_2).getDrawable(0);
                if ((v0_0 instanceof android.graphics.drawable.GradientDrawable)) {
                    ((android.graphics.drawable.GradientDrawable) v0_0).setStroke(((int) ((p2.getResources().getDisplayMetrics().density * 1077936128) + 1056964608)), p4);
                    p3.invalidate();
                }
            }
        }
        return;
    }

    public static boolean T(android.content.Intent p3)
    {
        if ((p3) && (!"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(p3.getAction()))) {
            boolean v3_3 = p3.getExtras();
            if (v3_3) {
                return "1".equals(v3_3.getString("google.c.a.e"));
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public static int U(int p4)
    {
        return ((int) (((long) Integer.rotateLeft(((int) (((long) p4) * -862048943)), 15)) * 461845907));
    }

    public static void V()
    {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static f8.c a(int p1, f8.a p2, int p3)
    {
        if ((p3 & 2) != 0) {
            p2 = f8.a.a;
        }
        if (p1 == -2) {
            if (p2 != f8.a.a) {
                return new f8.n(1, p2);
            } else {
                f8.g.l.getClass();
                return new f8.c(f8.f.b);
            }
        } else {
            if (p1 == -1) {
                if (p2 != f8.a.a) {
                    throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                } else {
                    return new f8.n(1, f8.a.b);
                }
            } else {
                if (p1 == null) {
                    if (p2 != f8.a.a) {
                        return new f8.n(1, p2);
                    } else {
                        return new f8.c(0);
                    }
                } else {
                    if (p1 == 2147483647) {
                        return new f8.c(2147483647);
                    } else {
                        if (p2 != f8.a.a) {
                            return new f8.n(p1, p2);
                        } else {
                            return new f8.c(p1);
                        }
                    }
                }
            }
        }
    }

    public static final java.util.ArrayList b(java.util.ArrayList p7)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        int v1 = p7.size();
        int v2 = 0;
        while (v2 < v1) {
            String v3_2 = p7.get(v2);
            v2++;
            String v3_0 = ((k4.m) v3_2);
            android.os.Bundle v4_1 = new android.os.Bundle();
            v4_1.putInt("event_type", v3_0.a);
            v4_1.putLong("event_timestamp", v3_0.b);
            v0_1.add(v4_1);
        }
        return v0_1;
    }

    public static final Object c(java.util.List p6, a1.k p7, n7.c p8)
    {
        a1.e v0_2;
        if (!(p8 instanceof a1.e)) {
            v0_2 = new a1.e(p8);
        } else {
            v0_2 = ((a1.e) p8);
            h7.l v1_2 = ((a1.e) p8).d;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((a1.e) p8).d = (v1_2 - -2147483648);
            }
        }
        Throwable v6_2;
        Throwable v6_4;
        kotlin.jvm.internal.r v7_2;
        Object v8_1 = v0_2.c;
        h7.l v1_1 = m7.a.a;
        Throwable v2_0 = v0_2.d;
        try {
            if (v2_0 == null) {
                c4.b.e0(v8_1);
                Object v8_3 = new java.util.ArrayList();
                Throwable v2_2 = new a1.g(p6, v8_3, 0);
                v0_2.a = v8_3;
                v0_2.d = 1;
                if (p7.a(v2_2, v0_2) != v1_1) {
                    v6_2 = v8_3;
                    v7_2 = new kotlin.jvm.internal.r();
                    v6_4 = v6_2.iterator();
                    while (v6_4.hasNext()) {
                        Object v8_6 = ((u7.l) v6_4.next());
                        v0_2.a = v7_2;
                        v0_2.b = v6_4;
                        v0_2.d = 2;
                        if (v8_6.invoke(v0_2) == v1_1) {
                        }
                    }
                    Throwable v6_8 = ((Throwable) v7_2.a);
                    if (v6_8 != null) {
                        throw v6_8;
                    } else {
                        v1_1 = h7.l.a;
                    }
                }
            } else {
                if (v2_0 == 1) {
                    v6_2 = ((java.util.List) v0_2.a);
                    c4.b.e0(v8_1);
                } else {
                    if (v2_0 != 2) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        v6_4 = v0_2.b;
                        v7_2 = ((kotlin.jvm.internal.r) v0_2.a);
                        c4.b.e0(v8_1);
                    }
                }
            }
        } catch (Object v8_8) {
            Throwable v2_4 = v7_2.a;
            if (v2_4 != null) {
                q4.b.a(((Throwable) v2_4), v8_8);
            } else {
                v7_2.a = v8_8;
            }
        }
        return v1_1;
    }

    public static t.k d(d8.j0 p5)
    {
        t.i v1_1 = new t.i();
        v1_1.c = new t.l();
        t.k v2_3 = new t.k(v1_1);
        v1_1.b = v2_3;
        v1_1.a = v1.a;
        try {
            p5.invokeOnCompletion(new a1.b1(2, v1_1, p5));
            v1_1.a = "Deferred.asListenableFuture";
            return v2_3;
        } catch (Exception v5_1) {
            v2_3.b.k(v5_1);
            return v2_3;
        }
    }

    public static String e(int p0, int p1, String p2)
    {
        if (p0 >= null) {
            if (p1 < null) {
                throw new IllegalArgumentException(g2.g.c(p1, "negative size: "));
            } else {
                return c4.b.L("%s (%s) must not be greater than size (%s)", new Object[] {p2, Integer.valueOf(p0), Integer.valueOf(p1)}));
            }
        } else {
            return c4.b.L("%s (%s) must not be negative", new Object[] {p2, Integer.valueOf(p0)}));
        }
    }

    public static void f(int p2, int p3)
    {
        if ((p2 >= null) && (p2 < p3)) {
            return;
        } else {
            IllegalArgumentException v2_1;
            if (p2 < null) {
                v2_1 = c4.b.L("%s (%s) must not be negative", new Object[] {"index", Integer.valueOf(p2)}));
            } else {
                if (p3 < null) {
                    throw new IllegalArgumentException(g2.g.c(p3, "negative size: "));
                } else {
                    v2_1 = c4.b.L("%s (%s) must be less than size (%s)", new Object[] {"index", Integer.valueOf(p2), Integer.valueOf(p3)}));
                }
            }
            throw new IndexOutOfBoundsException(v2_1);
        }
    }

    public static void g(Object p0, String p1)
    {
        if (p0 == null) {
            throw new NullPointerException(p1);
        } else {
            return;
        }
    }

    public static void h(int p2, int p3)
    {
        if ((p2 < null) || (p2 > p3)) {
            throw new IndexOutOfBoundsException(a.a.e(p2, p3, "index"));
        } else {
            return;
        }
    }

    public static void i(int p1, int p2, int p3)
    {
        if ((p1 >= null) && ((p2 >= p1) && (p2 <= p3))) {
            return;
        } else {
            if ((p1 < null) || (p1 > p3)) {
                String v1_3 = a.a.e(p1, p3, "start index");
            } else {
                if ((p2 >= null) && (p2 <= p3)) {
                    v1_3 = c4.b.L("end index (%s) must not be less than start index (%s)", new Object[] {Integer.valueOf(p2), Integer.valueOf(p1)}));
                } else {
                    v1_3 = a.a.e(p2, p3, "end index");
                }
            }
            throw new IndexOutOfBoundsException(v1_3);
        }
    }

    public static void j(int p5)
    {
        if ((2 > p5) || (p5 >= 37)) {
            String v5_2 = v1.a.p("radix ", p5, " was not in valid range ");
            v5_2.append(new y7.e(2, 36, 1));
            throw new IllegalArgumentException(v5_2.toString());
        } else {
            return;
        }
    }

    public static int k(android.content.Context p6, String p7)
    {
        int v0_0 = android.os.Process.myPid();
        int v1 = android.os.Process.myUid();
        int v2_2 = p6.getPackageName();
        if (p6.checkPermission(p7, v0_0, v1) != -1) {
            String v7_1 = android.app.AppOpsManager.permissionToOp(p7);
            if (v7_1 != null) {
                if (v2_2 == 0) {
                    int v2_1 = p6.getPackageManager().getPackagesForUid(v1);
                    if ((v2_1 != 0) && (v2_1.length > 0)) {
                        v2_2 = v2_1[0];
                    } else {
                        return -1;
                    }
                }
                int v2_3;
                android.app.AppOpsManager v3_0 = android.os.Process.myUid();
                int v4_1 = p6.getPackageName();
                if ((v3_0 != v1) || (!java.util.Objects.equals(v4_1, v2_2))) {
                    v2_3 = ((android.app.AppOpsManager) p6.getSystemService(android.app.AppOpsManager)).noteProxyOpNoThrow(v7_1, v2_2);
                } else {
                    if (android.os.Build$VERSION.SDK_INT < 29) {
                        v2_3 = ((android.app.AppOpsManager) p6.getSystemService(android.app.AppOpsManager)).noteProxyOpNoThrow(v7_1, v2_2);
                    } else {
                        android.app.AppOpsManager v3_4 = ((android.app.AppOpsManager) p6.getSystemService(android.app.AppOpsManager));
                        int v4_3 = android.os.Binder.getCallingUid();
                        int v5_1 = 1;
                        if (v3_4 != null) {
                            v2_3 = v3_4.checkOpNoThrow(v7_1, v4_3, v2_2);
                        } else {
                            v2_3 = 1;
                        }
                        if (v2_3 == 0) {
                            String v6_5 = d0.e.a(p6);
                            if (v3_4 != null) {
                                v5_1 = v3_4.checkOpNoThrow(v7_1, v1, v6_5);
                            }
                            v2_3 = v5_1;
                        }
                    }
                }
                if (v2_3 != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static float[] l(float[] p2, int p3)
    {
        if (p3 < null) {
            throw new IllegalArgumentException();
        } else {
            int v0_1 = p2.length;
            if (v0_1 < 0) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                float[] v3_1 = new float[p3];
                System.arraycopy(p2, 0, v3_1, 0, Math.min(p3, v0_1));
                return v3_1;
            }
        }
    }

    public static h0.d[] m(String p17)
    {
        RuntimeException v1_3 = new java.util.ArrayList();
        int v2_2 = 0;
        char v5_1 = 0;
        int v4_0 = 1;
        while (v4_0 < p17.length()) {
            while (v4_0 < p17.length()) {
                float[] v6_1 = p17.charAt(v4_0);
                if (((((v6_1 - 90) * (v6_1 - 65)) <= 0) || (((v6_1 - 122) * (v6_1 - 97)) <= 0)) && ((v6_1 != 101) && (v6_1 != 69))) {
                    break;
                }
                v4_0++;
            }
            char v5_3 = p17.substring(v5_1, v4_0).trim();
            if (!v5_3.isEmpty()) {
                if ((v5_3.charAt(v2_2) != 122) && (v5_3.charAt(v2_2) != 90)) {
                    float[] v6_6 = new float[v5_3.length()];
                    int v9_4 = v5_3.length();
                    int v11 = v2_2;
                    int v10_0 = 1;
                    while (v10_0 < v9_4) {
                        int v13 = v2_2;
                        int v14 = v13;
                        int v15 = v14;
                        int v16 = v15;
                        int v12 = v10_0;
                        while (v12 < v5_3.length()) {
                            float v3_6 = v5_3.charAt(v12);
                            if (v3_6 == 32) {
                                v13 = 0;
                                v15 = 1;
                            } else {
                                if ((v3_6 == 69) || (v3_6 == 101)) {
                                    v13 = 1;
                                } else {
                                    switch (v3_6) {
                                        case 45:
                                            if ((v12 == v10_0) || (v13 != 0)) {
                                                v13 = 0;
                                            } else {
                                                v13 = 0;
                                                v15 = 1;
                                                v16 = 1;
                                            }
                                            break;
                                        case 46:
                                            if (v14 != 0) {
                                            } else {
                                                v13 = 0;
                                                v14 = 1;
                                            }
                                            break;
                                        default:
                                    }
                                }
                            }
                            if (v15 == 0) {
                                v12++;
                            } else {
                                break;
                            }
                        }
                        if (v10_0 < v12) {
                            int v2_1 = (v11 + 1);
                            v6_6[v11] = Float.parseFloat(v5_3.substring(v10_0, v12));
                            v11 = v2_1;
                        }
                        if (v16 == 0) {
                            v10_0 = (v12 + 1);
                        } else {
                            v10_0 = v12;
                        }
                        v2_2 = 0;
                    }
                    float v3_3 = a.a.l(v6_6, v11);
                    v2_2 = 0;
                } else {
                    v3_3 = new float[v2_2];
                }
                v1_3.add(new h0.d(v5_3.charAt(v2_2), v3_3));
            }
            v5_1 = v4_0;
            v4_0++;
            v2_2 = 0;
        }
        if (((v4_0 - v5_1) != 1) || (v5_1 >= p17.length())) {
            int v2_9 = 0;
        } else {
            v2_9 = 0;
            float v3_4 = new float[0];
            v1_3.add(new h0.d(p17.charAt(v5_1), v3_4));
        }
        NumberFormatException v0_3 = new h0.d[v2_9];
        return ((h0.d[]) v1_3.toArray(v0_3));
    }

    public static android.view.View n(android.app.Activity p4, android.app.Dialog p5, android.content.Context p6, int p7)
    {
        android.view.View v7_1 = android.view.LayoutInflater.from(p6).inflate(p7, 0);
        p5.setContentView(v7_1);
        if (p5.getWindow() != null) {
            android.view.ViewGroup v1_3;
            int v0_1 = i2.l.l(p6);
            p5.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            if (!v0_1.o()) {
                v1_3 = 2131099685;
            } else {
                v1_3 = 2131099684;
            }
            android.graphics.drawable.GradientDrawable v2_3 = new android.graphics.drawable.GradientDrawable();
            v2_3.setColor(e0.c.getColor(p6, v1_3));
            v0_1.q(p4, ((android.view.ViewGroup) p5.findViewById(2131362023)));
            v2_3.setCornerRadius(android.util.TypedValue.applyDimension(1, 1105199104, p6.getResources().getDisplayMetrics()));
            v7_1.setBackground(v2_3);
        }
        p5.show();
        return v7_1;
    }

    public static h0.d[] p(h0.d[] p4)
    {
        h0.d[] v0_1 = new h0.d[p4.length];
        int v1 = 0;
        while (v1 < p4.length) {
            v0_1[v1] = new h0.d(p4[v1]);
            v1++;
        }
        return v0_1;
    }

    public static boolean q()
    {
        try {
            q4.f.d();
            android.os.Bundle v2_4 = q4.f.d();
            v2_4.a();
            android.os.Bundle v2_5 = v2_4.a;
            boolean v3_4 = v2_5.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (IllegalStateException) {
            android.util.Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return 0;
        }
        if (!v3_4.contains("export_to_big_query")) {
            try {
                boolean v3_0 = v2_5.getPackageManager();
            } catch (android.content.pm.PackageManager$NameNotFoundException) {
                return 0;
            }
            if (!v3_0) {
                return 0;
            } else {
                android.os.Bundle v2_2 = v3_0.getApplicationInfo(v2_5.getPackageName(), 128);
                if (v2_2 == null) {
                    return 0;
                } else {
                    boolean v3_1 = v2_2.metaData;
                    if ((!v3_1) || (!v3_1.containsKey("delivery_metrics_exported_to_big_query_enabled"))) {
                        return 0;
                    } else {
                        return v2_2.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", 0);
                    }
                }
            }
        } else {
            return v3_4.getBoolean("export_to_big_query", 0);
        }
    }

    public static final boolean s(char p2, char p3, boolean p4)
    {
        if (p2 != p3) {
            if (p4) {
                char v2_2 = Character.toUpperCase(p2);
                char v3_2 = Character.toUpperCase(p3);
                if ((v2_2 != v3_2) && (Character.toLowerCase(v2_2) != Character.toLowerCase(v3_2))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public static int t(android.view.View p8, int p9)
    {
        int v0_6 = p8.getTag(2131361998);
        if (!(v0_6 instanceof Integer)) {
            int v5_1;
            if (!(p8 instanceof android.widget.TextView)) {
                if (!(p8 instanceof android.widget.ImageView)) {
                    v5_1 = p8.getBackground();
                } else {
                    v5_1 = ((android.widget.ImageView) p8).getDrawable();
                }
            } else {
                int v0_5 = ((android.widget.TextView) p8).getCompoundDrawablesRelative();
                int v4_5 = 0;
                while (v4_5 < v0_5.length) {
                    v5_1 = v0_5[v4_5];
                    if (v5_1 == 0) {
                        v4_5++;
                    }
                    if (v5_1 == 0) {
                        int v8_8 = ((android.widget.TextView) p8).getCompoundDrawables();
                        int v3_8 = 0;
                        while (v3_8 < v8_8.length) {
                            int v4_6 = v8_8[v3_8];
                            if (v4_6 == 0) {
                                v3_8++;
                            } else {
                                v5_1 = v4_6;
                                break;
                            }
                        }
                    }
                }
                v5_1 = 0;
            }
            try {
                if (v5_1 != 0) {
                    int v8_10;
                    if (v5_1.getConstantState() == null) {
                        v8_10 = v5_1.mutate();
                    } else {
                        v8_10 = v5_1.getConstantState().newDrawable().mutate();
                    }
                    int v0_12 = ((android.content.res.ColorStateList) android.graphics.drawable.Drawable.getMethod("getTintList", 0).invoke(v8_10, 0));
                    if (v0_12 == 0) {
                        if (!(v8_10 instanceof android.graphics.drawable.ColorDrawable)) {
                            if ((v8_10 instanceof android.graphics.drawable.BitmapDrawable)) {
                                int v0_17 = ((android.graphics.drawable.BitmapDrawable) v8_10).getBitmap();
                                if (v0_17 != 0) {
                                    if (!v0_17.isRecycled()) {
                                        int v0_18 = v0_17.getPixel(Math.max(0, (v0_17.getWidth() / 2)), Math.max(0, (v0_17.getHeight() / 2)));
                                        if ((v0_18 >> 24) != 0) {
                                            p9 = v0_18;
                                        }
                                    }
                                }
                            }
                            int v0_19 = v8_10.getColorFilter();
                            int v1_7 = 1;
                            if (v0_19 == 0) {
                                int v0_3 = android.graphics.Bitmap.createBitmap(Math.max(v1_7, Math.min(Math.max(1, v8_10.getIntrinsicWidth()), 64)), Math.max(v1_7, Math.min(Math.max(1, v8_10.getIntrinsicHeight()), 64)), android.graphics.Bitmap$Config.ARGB_8888);
                                int v3_4 = new android.graphics.Canvas(v0_3);
                                v8_10.setBounds(0, 0, v0_3.getWidth(), v0_3.getHeight());
                                v8_10.draw(v3_4);
                                int v8_2 = (v0_3.getWidth() / 2);
                                int v3_6 = (v0_3.getHeight() / 2);
                                int v4_4 = Math.max(0, (v3_6 - 2));
                            } else {
                                int v3_14 = v0_19.getClass().getDeclaredField("mColor");
                                v3_14.setAccessible(1);
                                p9 = v3_14.getInt(v0_19);
                            }
                        } else {
                            p9 = ((android.graphics.drawable.ColorDrawable) v8_10).getColor();
                        }
                    } else {
                        return v0_12.getDefaultColor();
                    }
                }
            } catch (Exception) {
            }
            return p9;
        } else {
            return ((Integer) v0_6).intValue();
        }
    }

    public static float u(android.widget.EdgeEffect p2)
    {
        if (android.os.Build$VERSION.SDK_INT < 31) {
            return 0;
        } else {
            return t0.c.b(p2);
        }
    }

    public static Object v(p4.b p2)
    {
        if (!p2.isDone()) {
            throw new IllegalStateException(c4.b.L("Future was expected to be done: %s", new Object[] {p2})));
        } else {
            Thread v0_1 = 0;
            try {
                while(true) {
                    p2 = p2.get();
                    v0_1 = 1;
                }
            } catch (InterruptedException) {
            } catch (Throwable v2_1) {
                if (v0_1 != null) {
                    Thread.currentThread().interrupt();
                }
                throw v2_1;
            }
            if (v0_1 != null) {
                Thread.currentThread().interrupt();
            }
            return p2;
        }
    }

    public static java.util.Set w()
    {
        try {
            java.util.Set v0_6 = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", 0).invoke(0, 0);
        } catch (Throwable) {
            return java.util.Collections.EMPTY_SET;
        }
        if (v0_6 != null) {
            java.util.Set v0_1 = ((java.util.Set) v0_6);
            java.util.Iterator v1_0 = v0_1.iterator();
            while (v1_0.hasNext()) {
                if (!(v1_0.next() instanceof int[])) {
                    v0_1 = java.util.Collections.EMPTY_SET;
                    break;
                }
            }
            return v0_1;
        } else {
            return java.util.Collections.EMPTY_SET;
        }
    }

    public static int y(java.util.List p1)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        return (p1.size() - 1);
    }

    public static Object z(android.os.Bundle p2, String p3)
    {
        if (android.os.Build$VERSION.SDK_INT < 34) {
            int v2_2 = p2.getParcelable(p3);
            if (!e.a.isInstance(v2_2)) {
                return 0;
            } else {
                return v2_2;
            }
        } else {
            return m0.b.a(p2, p3);
        }
    }

    public abstract boolean A();

    public abstract boolean B();

    public abstract void O();

    public abstract void P();

    public abstract void Q();

    public abstract void R();

    public abstract android.text.method.TransformationMethod W();

    public abstract String o();

    public abstract int r();

    public abstract android.text.InputFilter[] x();
}
