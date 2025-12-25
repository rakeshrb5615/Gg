package r0;
public final class b {
    public static final r0.b e;
    public static final r0.b f;
    public static final r0.b g;
    public static final r0.b h;
    public static final r0.b i;
    public static final r0.b j;
    public static final r0.b k;
    public static final r0.b l;
    public static final r0.b m;
    public static final r0.b n;
    public static final r0.b o;
    public final Object a;
    public final int b;
    public final Class c;
    public final r0.l d;

    static b()
    {
        int v10_2;
        android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction v2 = 0;
        new r0.b(1, 0);
        new r0.b(2, 0);
        new r0.b(4, 0);
        new r0.b(8, 0);
        r0.b.e = new r0.b(16, 0);
        new r0.b(32, 0);
        new r0.b(64, 0);
        new r0.b(128, 0);
        new r0.b(256, r0.e);
        new r0.b(512, r0.e);
        new r0.b(1024, r0.f);
        new r0.b(2048, r0.f);
        r0.b.f = new r0.b(4096, 0);
        r0.b.g = new r0.b(8192, 0);
        new r0.b(16384, 0);
        new r0.b(32768, 0);
        new r0.b(65536, 0);
        new r0.b(131072, r0.j);
        r0.b.h = new r0.b(262144, 0);
        r0.b.i = new r0.b(524288, 0);
        r0.b.j = new r0.b(1048576, 0);
        new r0.b(2097152, r0.k);
        int v0_28 = android.os.Build$VERSION.SDK_INT;
        new r0.b(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, 0, 0, 0);
        r0.b.k = new r0.b(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, 0, 0, r0.h);
        r0.b.l = new r0.b(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_UP, 16908344, 0, 0, 0);
        new r0.b(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, 0, 0, 0);
        r0.b.m = new r0.b(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, 0, 0, 0);
        new r0.b(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, 0, 0, 0);
        if (v0_28 < 29) {
            v10_2 = 0;
        } else {
            v10_2 = android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_UP;
        }
        int v16_0;
        new r0.b(v10_2, 16908358, 0, 0, 0);
        if (v0_28 < 29) {
            v16_0 = 0;
        } else {
            v16_0 = android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_DOWN;
        }
        int v5_2;
        new r0.b(v16_0, 16908359, 0, 0, 0);
        if (v0_28 < 29) {
            v5_2 = 0;
        } else {
            v5_2 = android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_LEFT;
        }
        int v11_2;
        new r0.b(v5_2, 16908360, 0, 0, 0);
        if (v0_28 < 29) {
            v11_2 = 0;
        } else {
            v11_2 = android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_RIGHT;
        }
        int v10_5;
        new r0.b(v11_2, 16908361, 0, 0, 0);
        new r0.b(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, 0, 0, 0);
        r0.b.n = new r0.b(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SET_PROGRESS, 16908349, 0, 0, r0.i);
        new r0.b(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, 0, 0, r0.g);
        if (v0_28 < 28) {
            v10_5 = 0;
        } else {
            v10_5 = android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_TOOLTIP;
        }
        int v16_1;
        new r0.b(v10_5, 16908356, 0, 0, 0);
        if (v0_28 < 28) {
            v16_1 = 0;
        } else {
            v16_1 = android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_HIDE_TOOLTIP;
        }
        android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction v4_8;
        new r0.b(v16_1, 16908357, 0, 0, 0);
        if (v0_28 < 30) {
            v4_8 = 0;
        } else {
            v4_8 = android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_PRESS_AND_HOLD;
        }
        int v11_5;
        new r0.b(v4_8, 16908362, 0, 0, 0);
        if (v0_28 < 30) {
            v11_5 = 0;
        } else {
            v11_5 = android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_IME_ENTER;
        }
        android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction v4_9;
        new r0.b(v11_5, 16908372, 0, 0, 0);
        if (v0_28 < 32) {
            v4_9 = 0;
        } else {
            v4_9 = android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_DRAG_START;
        }
        int v10_7;
        new r0.b(v4_9, 16908373, 0, 0, 0);
        if (v0_28 < 32) {
            v10_7 = 0;
        } else {
            v10_7 = android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_DRAG_DROP;
        }
        android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction v4_10;
        new r0.b(v10_7, 16908374, 0, 0, 0);
        if (v0_28 < 32) {
            v4_10 = 0;
        } else {
            v4_10 = android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_DRAG_CANCEL;
        }
        int v10_8;
        new r0.b(v4_10, 16908375, 0, 0, 0);
        if (v0_28 < 33) {
            v10_8 = 0;
        } else {
            v10_8 = android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        }
        new r0.b(v10_8, 16908376, 0, 0, 0);
        if (v0_28 >= 34) {
            v2 = q0.a0.a();
        }
        r0.b.o = new r0.b(v2, 16908382, 0, 0, 0);
        return;
    }

    public b(int p7, Class p8)
    {
        this(0, p7, 0, 0, p8);
        return;
    }

    public b(int p7, String p8)
    {
        this(0, p7, p8, 0, 0);
        return;
    }

    public b(Object p1, int p2, CharSequence p3, r0.l p4, Class p5)
    {
        this.b = p2;
        this.d = p4;
        if (p1 != null) {
            this.a = p1;
        } else {
            this.a = new android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction(p2, p3);
        }
        this.c = p5;
        return;
    }

    public final int a()
    {
        return ((android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object p3)
    {
        if (p3 != 0) {
            if ((p3 instanceof r0.b)) {
                int v3_3 = ((r0.b) p3).a;
                Object v1_1 = this.a;
                if (v1_1 != null) {
                    if (!v1_1.equals(v3_3)) {
                        return 0;
                    }
                } else {
                    if (v3_3 != 0) {
                        return 0;
                    }
                }
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.hashCode();
        }
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("AccessibilityActionCompat: ");
        String v1_2 = r0.c.d(this.b);
        if (v1_2.equals("ACTION_UNKNOWN")) {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction v2_0 = this.a;
            if (((android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction) v2_0).getLabel() != null) {
                v1_2 = ((android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction) v2_0).getLabel().toString();
            }
        }
        v0_1.append(v1_2);
        return v0_1.toString();
    }
}
