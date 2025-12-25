package q0;
public abstract class q0 {
    public static java.util.WeakHashMap a = None;
    public static reflect.Field b = None;
    public static boolean c = False;
    public static final int[] d;
    public static final q0.d0 e;
    public static final q0.f0 f;

    static q0()
    {
        q0.f0 v0_1 = new int[32];
        v0_1 = {2131361811, 2131361812, 2131361823, 2131361834, 2131361837, 2131361838, 2131361839, 2131361840, 2131361841, 2131361842, 2131361813, 2131361814, 2131361815, 2131361816, 2131361817, 2131361818, 2131361819, 2131361820, 2131361821, 2131361822, 2131361824, 2131361825, 2131361826, 2131361827, 2131361828, 2131361829, 2131361830, 2131361831, 2131361832, 2131361833, 2131361835, 2131361836};
        q0.q0.d = v0_1;
        q0.q0.e = new q0.d0();
        q0.q0.f = new q0.f0();
        return;
    }

    public static void a(android.view.ViewGroup p1, android.view.View p2)
    {
        p1.getOverlay().add(p2);
        android.view.View v2_2 = ((android.view.View) p2.getParent());
        kotlin.jvm.internal.j.e(v2_2, "<this>");
        v2_2.setTag(2131362595, p1);
        return;
    }

    public static q0.t0 b(android.view.View p2)
    {
        if (q0.q0.a == null) {
            q0.q0.a = new java.util.WeakHashMap();
        }
        q0.t0 v0_2 = ((q0.t0) q0.q0.a.get(p2));
        if (v0_2 == null) {
            v0_2 = new q0.t0(p2);
            q0.q0.a.put(p2, v0_2);
        }
        return v0_2;
    }

    public static void c(android.view.View p2, q0.s1 p3)
    {
        boolean v3_2 = p3.f();
        if (v3_2) {
            android.view.WindowInsets v0_1;
            if (android.os.Build$VERSION.SDK_INT < 30) {
                v0_1 = q0.g0.a(p2, v3_2);
            } else {
                v0_1 = q0.n0.a(p2, v3_2);
            }
            if (!v0_1.equals(v3_2)) {
                q0.s1.g(p2, v0_1);
            }
        }
        return;
    }

    public static boolean d(android.view.View p8, android.view.KeyEvent p9)
    {
        if (android.os.Build$VERSION.SDK_INT < 28) {
            ref.WeakReference v1_1 = ((q0.p0) p8.getTag(2131362487));
            if (v1_1 == null) {
                v1_1 = new q0.p0();
                v1_1.a = 0;
                v1_1.b = 0;
                v1_1.c = 0;
                p8.setTag(2131362487, v1_1);
            }
            if (p9.getAction() == 0) {
                android.util.SparseArray v0_2 = v1_1.a;
                if (v0_2 != null) {
                    v0_2.clear();
                }
                android.util.SparseArray v0_3 = q0.p0.d;
                if (!v0_3.isEmpty()) {
                    if (v1_1.a == null) {
                        v1_1.a = new java.util.WeakHashMap();
                    }
                    int v3_5 = (v0_3.size() - 1);
                    while (v3_5 >= 0) {
                        android.view.ViewParent v4_0 = q0.p0.d;
                        java.util.WeakHashMap v5_3 = ((android.view.View) ((ref.WeakReference) v4_0.get(v3_5)).get());
                        if (v5_3 != null) {
                            v1_1.a.put(v5_3, Boolean.TRUE);
                            android.view.ViewParent v4_2 = v5_3.getParent();
                            while ((v4_2 instanceof android.view.View)) {
                                v1_1.a.put(((android.view.View) v4_2), Boolean.TRUE);
                                v4_2 = v4_2.getParent();
                            }
                        } else {
                            v4_0.remove(v3_5);
                        }
                        v3_5--;
                    }
                }
            }
            Throwable v8_2 = v1_1.a(p8);
            if (p9.getAction() == 0) {
                int v9_1 = p9.getKeyCode();
                if ((v8_2 != null) && (!android.view.KeyEvent.isModifierKey(v9_1))) {
                    if (v1_1.b == null) {
                        v1_1.b = new android.util.SparseArray();
                    }
                    v1_1.b.put(v9_1, new ref.WeakReference(v8_2));
                }
            }
            if (v8_2 != null) {
                return 1;
            }
        }
        return 0;
    }

    public static android.view.View$AccessibilityDelegate e(android.view.View p3)
    {
        if (android.os.Build$VERSION.SDK_INT < 29) {
            if (!q0.q0.c) {
                if (q0.q0.b == null) {
                    try {
                        boolean v0_1 = android.view.View.getDeclaredField("mAccessibilityDelegate");
                        q0.q0.b = v0_1;
                        v0_1.setAccessible(1);
                    } catch (Throwable) {
                        q0.q0.c = 1;
                        return 0;
                    }
                    android.view.View$AccessibilityDelegate v3_1 = q0.q0.b.get(p3);
                    if ((v3_1 instanceof android.view.View$AccessibilityDelegate)) {
                        return ((android.view.View$AccessibilityDelegate) v3_1);
                    }
                    return 0;
                }
                try {
                } catch (Throwable) {
                    q0.q0.c = 1;
                }
            }
            return 0;
        } else {
            return q0.m0.a(p3);
        }
    }

    public static CharSequence f(android.view.View p2)
    {
        int v2_1;
        if (android.os.Build$VERSION.SDK_INT < 28) {
            v2_1 = p2.getTag(2131362478);
            if (!CharSequence.isInstance(v2_1)) {
                v2_1 = 0;
            }
        } else {
            v2_1 = q0.l0.a(p2);
        }
        return ((CharSequence) v2_1);
    }

    public static java.util.ArrayList g(android.view.View p2)
    {
        java.util.ArrayList v1_1 = ((java.util.ArrayList) p2.getTag(2131362475));
        if (v1_1 == null) {
            v1_1 = new java.util.ArrayList();
            p2.setTag(2131362475, v1_1);
        }
        return v1_1;
    }

    public static String[] h(n.w p2)
    {
        if (android.os.Build$VERSION.SDK_INT < 31) {
            return ((String[]) p2.getTag(2131362482));
        } else {
            return q0.o0.a(p2);
        }
    }

    public static void i(android.view.View p5, int p6)
    {
        String v0_6 = ((android.view.accessibility.AccessibilityManager) p5.getContext().getSystemService("accessibility"));
        if (v0_6.isEnabled()) {
            if ((q0.q0.f(p5) == null) || ((!p5.isShown()) || (p5.getWindowVisibility() != 0))) {
                CharSequence v1_3 = 0;
            } else {
                v1_3 = 1;
            }
            int v4 = 32;
            if ((p5.getAccessibilityLiveRegion() == 0) && (v1_3 == null)) {
                if (p6 != 32) {
                    if (p5.getParent() != null) {
                        try {
                            p5.getParent().notifySubtreeAccessibilityStateChanged(p5, p5, p6);
                            return;
                        } catch (AbstractMethodError v6_1) {
                            android.util.Log.e("ViewCompat", p5.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), v6_1);
                        }
                    }
                } else {
                    CharSequence v1_5 = android.view.accessibility.AccessibilityEvent.obtain();
                    p5.onInitializeAccessibilityEvent(v1_5);
                    v1_5.setEventType(32);
                    v1_5.setContentChangeTypes(p6);
                    v1_5.setSource(p5);
                    p5.onPopulateAccessibilityEvent(v1_5);
                    v1_5.getText().add(q0.q0.f(p5));
                    v0_6.sendAccessibilityEvent(v1_5);
                    return;
                }
            } else {
                String v0_7 = android.view.accessibility.AccessibilityEvent.obtain();
                if (v1_3 == null) {
                    v4 = 2048;
                }
                v0_7.setEventType(v4);
                v0_7.setContentChangeTypes(p6);
                if (v1_3 != null) {
                    v0_7.getText().add(q0.q0.f(p5));
                    if (p5.getImportantForAccessibility() == 0) {
                        p5.setImportantForAccessibility(1);
                    }
                }
                p5.sendAccessibilityEventUnchecked(v0_7);
                return;
            }
        }
        return;
    }

    public static q0.g j(android.view.View p3, q0.g p4)
    {
        if (android.util.Log.isLoggable("ViewCompat", 3)) {
            boolean v0_10 = new StringBuilder("performReceiveContent: ");
            v0_10.append(p4);
            v0_10.append(", view=");
            v0_10.append(p3.getClass().getSimpleName());
            v0_10.append("[");
            v0_10.append(p3.getId());
            v0_10.append("]");
            android.util.Log.d("ViewCompat", v0_10.toString());
        }
        if (android.os.Build$VERSION.SDK_INT < 31) {
            q0.u v1_2 = q0.q0.e;
            if (((t0.i) p3.getTag(2131362481)) == null) {
                if ((p3 instanceof q0.u)) {
                    v1_2 = ((q0.u) p3);
                }
                return v1_2.a(p4);
            } else {
                q0.g v4_1 = t0.i.a(p3, p4);
                if (v4_1 != null) {
                    if ((p3 instanceof q0.u)) {
                        v1_2 = ((q0.u) p3);
                    }
                    return v1_2.a(v4_1);
                } else {
                    return 0;
                }
            }
        } else {
            return q0.o0.b(p3, p4);
        }
    }

    public static void k(android.view.View p2, int p3)
    {
        java.util.ArrayList v2_1 = q0.q0.g(p2);
        int v0 = 0;
        while (v0 < v2_1.size()) {
            if (((r0.b) v2_1.get(v0)).a() != p3) {
                v0++;
            } else {
                v2_1.remove(v0);
                return;
            }
        }
        return;
    }

    public static void l(android.view.View p6, r0.b p7, r0.l p8)
    {
        int v7_1;
        r0.b v0_1 = new r0.b(0, p7.b, 0, p8, p7.c);
        int v7_7 = q0.q0.e(p6);
        if (v7_7 != 0) {
            if (!(v7_7 instanceof q0.a)) {
                v7_1 = new q0.b(v7_7);
            } else {
                v7_1 = ((q0.a) v7_7).a;
            }
        } else {
            v7_1 = 0;
        }
        if (v7_1 == 0) {
            v7_1 = new q0.b();
        }
        q0.q0.n(p6, v7_1);
        q0.q0.k(p6, v0_1.a());
        q0.q0.g(p6).add(v0_1);
        q0.q0.i(p6, 0);
        return;
    }

    public static void m(android.view.View p9, android.content.Context p10, int[] p11, android.util.AttributeSet p12, android.content.res.TypedArray p13, int p14)
    {
        if (android.os.Build$VERSION.SDK_INT >= 29) {
            q0.m0.b(p9, p10, p11, p12, p13, p14, 0);
        }
        return;
    }

    public static void n(android.view.View p1, q0.b p2)
    {
        if ((p2 == null) && ((q0.q0.e(p1) instanceof q0.a))) {
            p2 = new q0.b();
        }
        if (p1.getImportantForAccessibility() == 0) {
            p1.setImportantForAccessibility(1);
        }
        q0.a v2_1;
        if (p2 != null) {
            v2_1 = p2.b;
        } else {
            v2_1 = 0;
        }
        p1.setAccessibilityDelegate(v2_1);
        return;
    }

    public static void o(android.view.View p6, CharSequence p7)
    {
        new q0.e0(2131362478, CharSequence, 8, 28, 1).g(p6, p7);
        q0.f0 v0_2 = q0.q0.f;
        if (!p7) {
            v0_2.a.remove(p6);
            p6.removeOnAttachStateChangeListener(v0_2);
            p6.getViewTreeObserver().removeOnGlobalLayoutListener(v0_2);
            return;
        } else {
            if ((!p6.isShown()) || (p6.getWindowVisibility() != 0)) {
                Boolean v1_2 = 0;
            } else {
                v1_2 = 1;
            }
            v0_2.a.put(p6, Boolean.valueOf(v1_2));
            p6.addOnAttachStateChangeListener(v0_2);
            if (p6.isAttachedToWindow()) {
                p6.getViewTreeObserver().addOnGlobalLayoutListener(v0_2);
            }
            return;
        }
    }
}
