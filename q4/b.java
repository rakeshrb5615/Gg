package q4;
public abstract class b implements t0.f {
    public static boolean b = False;
    public static reflect.Method c = None;
    public static boolean d = False;
    public static reflect.Field e;
    public final synthetic int a;

    public synthetic b(int p1)
    {
        this.a = p1;
        return;
    }

    public static int B(int p3)
    {
        if (p3 == 1) {
            return 0;
        } else {
            if (p3 == 2) {
                return 1;
            } else {
                if (p3 == 4) {
                    return 2;
                } else {
                    if (p3 == 8) {
                        return 3;
                    } else {
                        if (p3 == 16) {
                            return 4;
                        } else {
                            if (p3 == 32) {
                                return 5;
                            } else {
                                if (p3 == 64) {
                                    return 6;
                                } else {
                                    if (p3 == 128) {
                                        return 7;
                                    } else {
                                        if (p3 == 256) {
                                            return 8;
                                        } else {
                                            if (p3 != 512) {
                                                throw new IllegalArgumentException(g2.g.c(p3, "type needs to be >= FIRST and <= LAST, type="));
                                            } else {
                                                return 9;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static l7.c C(l7.c p1)
    {
        l7.c v0_2;
        kotlin.jvm.internal.j.e(p1, "<this>");
        if (!(p1 instanceof n7.c)) {
            v0_2 = 0;
        } else {
            v0_2 = ((n7.c) p1);
        }
        if (v0_2 != null) {
            l7.c v0_4 = v0_2.intercepted();
            if (v0_4 != null) {
                return v0_4;
            }
        }
        return p1;
    }

    public static boolean D(byte p1)
    {
        if (p1 <= -65) {
            return 0;
        } else {
            return 1;
        }
    }

    public static String F(String p3, String p4)
    {
        StringBuilder v0_3 = (p3.length() - p4.length());
        if ((v0_3 < null) || (v0_3 > 1)) {
            throw new IllegalArgumentException("Invalid input received");
        } else {
            StringBuilder v0_2 = new StringBuilder((p4.length() + p3.length()));
            int v1_1 = 0;
            while (v1_1 < p3.length()) {
                v0_2.append(p3.charAt(v1_1));
                if (p4.length() > v1_1) {
                    v0_2.append(p4.charAt(v1_1));
                }
                v1_1++;
            }
            return v0_2.toString();
        }
    }

    public static l7.h G(l7.f p1, l7.g p2)
    {
        kotlin.jvm.internal.j.e(p2, "key");
        if (kotlin.jvm.internal.j.a(p1.getKey(), p2)) {
            p1 = l7.i.a;
        }
        return p1;
    }

    public static l7.h L(l7.f p2, l7.h p3)
    {
        kotlin.jvm.internal.j.e(p3, "context");
        if (p3 != l7.i.a) {
            return ((l7.h) p3.fold(p2, new d8.x(8)));
        } else {
            return p2;
        }
    }

    public static void O(android.view.View p2, v3.k p3)
    {
        float v0_1 = p3.b.c;
        if ((v0_1 != 0) && (v0_1.a)) {
            v3.i v2_2 = p2.getParent();
            float v0_2 = 0;
            while ((v2_2 instanceof android.view.View)) {
                v0_2 += ((android.view.View) v2_2).getElevation();
                v2_2 = v2_2.getParent();
            }
            v3.i v2_1 = p3.b;
            if (v2_1.m != v0_2) {
                v2_1.m = v0_2;
                p3.v();
            }
        }
        return;
    }

    public static void P(android.view.inputmethod.EditorInfo p2, CharSequence p3, int p4, int p5)
    {
        if (p2.extras == null) {
            p2.extras = new android.os.Bundle();
        }
        String v0_4;
        if (p3 == null) {
            v0_4 = 0;
        } else {
            v0_4 = new android.text.SpannableStringBuilder(p3);
        }
        p2.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", v0_4);
        p2.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", p4);
        p2.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", p5);
        return;
    }

    public static void Q(android.graphics.drawable.Drawable p0, int p1)
    {
        p0.setTint(p1);
        return;
    }

    public static final Object S(i8.q p1, i8.q p2, u7.p p3)
    {
        try {
            kotlin.jvm.internal.u.a(2, p3);
            boolean v2_3 = p3.invoke(p2, p1);
        } catch (boolean v2_4) {
            v2_3 = new d8.w(0, v2_4);
        }
        Object v3_1 = m7.a.a;
        if (v2_3 != v3_1) {
            Throwable v1_1 = p1.B(v2_3);
            if (v1_1 != d8.f0.e) {
                if ((v1_1 instanceof d8.w)) {
                    throw ((d8.w) v1_1).a;
                } else {
                    v3_1 = d8.f0.v(v1_1);
                }
            }
        }
        return v3_1;
    }

    public static byte[] T(j6.d p10)
    {
        String v0_1 = new java.util.ArrayDeque(20);
        int v2_1 = Math.min(8192, Math.max(128, (Integer.highestOneBit(0) * 2)));
        int v4_1 = 0;
        while (v4_1 < 2147483639) {
            int v6_2 = Math.min(v2_1, (2147483639 - v4_1));
            long v7_0 = new byte[v6_2];
            v0_1.add(v7_0);
            int v8 = 0;
            while (v8 < v6_2) {
                int v9_1 = p10.read(v7_0, v8, (v6_2 - v8));
                if (v9_1 != -1) {
                    v8 += v9_1;
                    v4_1 += v9_1;
                } else {
                    return q4.b.g(v0_1, v4_1);
                }
            }
            int v2_2;
            if (v2_1 >= 4096) {
                v2_2 = 2;
            } else {
                v2_2 = 4;
            }
            long v5_2 = (((long) v2_1) * ((long) v2_2));
            if (v5_2 <= 2147483647) {
                if (v5_2 >= -2147483648) {
                    v2_1 = ((int) v5_2);
                } else {
                    v2_1 = -2147483648;
                }
            } else {
                v2_1 = 2147483647;
            }
        }
        if (p10.read() != -1) {
            throw new OutOfMemoryError("input is too large to fit in a byte array");
        } else {
            return q4.b.g(v0_1, 2147483639);
        }
    }

    public static Object U(u7.p p2, Object p3, l7.c p4)
    {
        m7.e v0_1;
        kotlin.jvm.internal.j.e(p2, "<this>");
        m7.e v0_2 = p4.getContext();
        if (v0_2 != l7.i.a) {
            v0_1 = new m7.e(p4, v0_2);
        } else {
            v0_1 = new m7.d(p4);
        }
        kotlin.jvm.internal.u.a(2, p2);
        return p2.invoke(p3, v0_1);
    }

    public static void a(Throwable p2, Throwable p3)
    {
        kotlin.jvm.internal.j.e(p2, "<this>");
        kotlin.jvm.internal.j.e(p3, "exception");
        if (p2 != p3) {
            reflect.Method v0_3 = q7.a.a;
            if ((v0_3 != null) && (v0_3.intValue() < 19)) {
                reflect.Method v0_1 = p7.a.a;
                if (v0_1 != null) {
                    v0_1.invoke(p2, new Object[] {p3}));
                    return;
                }
            } else {
                p2.addSuppressed(p3);
            }
        }
        return;
    }

    public static void e(Object p2, Object p3)
    {
        if (p2 == null) {
            StringBuilder v0_3 = new StringBuilder("null key in entry: null=");
            v0_3.append(p3);
            throw new NullPointerException(v0_3.toString());
        } else {
            if (p3 == null) {
                StringBuilder v0_1 = new StringBuilder("null value in entry: ");
                v0_1.append(p2);
                v0_1.append("=null");
                throw new NullPointerException(v0_1.toString());
            } else {
                return;
            }
        }
    }

    public static void f(Object p0, String p1)
    {
        if (p0 == null) {
            throw new NullPointerException(p1);
        } else {
            return;
        }
    }

    public static byte[] g(java.util.ArrayDeque p6, int p7)
    {
        if (!p6.isEmpty()) {
            byte[] v0_3 = ((byte[]) p6.remove());
            if (v0_3.length != p7) {
                int v2_0 = (p7 - v0_3.length);
                byte[] v0_1 = java.util.Arrays.copyOf(v0_3, p7);
                while (v2_0 > 0) {
                    byte[] v3_1 = ((byte[]) p6.remove());
                    int v4_1 = Math.min(v2_0, v3_1.length);
                    System.arraycopy(v3_1, 0, v0_1, (p7 - v2_0), v4_1);
                    v2_0 -= v4_1;
                }
                return v0_1;
            } else {
                return v0_3;
            }
        } else {
            byte[] v6_1 = new byte[0];
            return v6_1;
        }
    }

    public static final long h(long p1, c8.c p3, c8.c p4)
    {
        kotlin.jvm.internal.j.e(p3, "sourceUnit");
        kotlin.jvm.internal.j.e(p4, "targetUnit");
        return p4.a.convert(p1, p3.a);
    }

    public static final void i(int p3, int p4)
    {
        if (p3 > p4) {
            StringBuilder v1_1 = new StringBuilder("toIndex (");
            v1_1.append(p3);
            v1_1.append(") is greater than size (");
            v1_1.append(p4);
            v1_1.append(").");
            throw new IndexOutOfBoundsException(v1_1.toString());
        } else {
            return;
        }
    }

    public static j5.t1 j(int p1)
    {
        if (p1 == null) {
            return new v3.n();
        } else {
            if (p1 == 1) {
                return new v3.e();
            } else {
                return new v3.n();
            }
        }
    }

    public static l7.c k(l7.c p2, l7.c p3, u7.p p4)
    {
        kotlin.jvm.internal.j.e(p4, "<this>");
        if (!(p4 instanceof n7.a)) {
            m7.b v0_4 = p3.getContext();
            if (v0_4 != l7.i.a) {
                return new m7.c(p3, v0_4, p4, p2);
            } else {
                return new m7.b(p3, p2, p4);
            }
        } else {
            return ((n7.a) p4).create(p2, p3);
        }
    }

    public static String l(String p4)
    {
        try {
            RuntimeException v0_2 = q4.b.m("KEY");
            String v1_5 = q4.b.m("IV");
            javax.crypto.spec.SecretKeySpec v2_1 = new javax.crypto.spec.SecretKeySpec(v0_2, "AES");
            RuntimeException v0_1 = new javax.crypto.spec.IvParameterSpec(v1_5);
            String v1_1 = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
            v1_1.init(2, v2_1, v0_1);
            return new String(v1_1.doFinal(android.util.Base64.decode(p4, 2)), java.nio.charset.StandardCharsets.UTF_8);
        } catch (Exception v4_3) {
            throw new RuntimeException("Decryption failed", v4_3);
        }
    }

    public static byte[] m(String p6)
    {
        try {
            int v1_2 = new StringBuilder();
            v1_2.append(p6);
            v1_2.append("43f!gR2q9~pLm#Ae->");
            v1_2.append(p6.hashCode());
            Exception v6_2 = java.security.MessageDigest.getInstance("SHA-256").digest(v1_2.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8));
            byte v0_4 = "43f!gR2q9~pLm#Ae".toCharArray();
            int v2 = 0;
            byte[] v3_0 = 0;
            byte v4_0 = 0;
        } catch (Exception v6_3) {
            throw new RuntimeException("Key derivation failed", v6_3);
        }
        while (v3_0 < v0_4.length) {
            v4_0 ^= (v0_4[v3_0] * 31);
            v3_0++;
        }
        byte[] v3_1 = new byte[16];
        while (v2 < 16) {
            v3_1[v2] = ((byte) (v6_2[v2] ^ ((byte) (v4_0 & 255))));
            v2++;
        }
        return v3_1;
    }

    public static boolean n(android.view.View p3, android.view.KeyEvent p4)
    {
        if (android.os.Build$VERSION.SDK_INT < 28) {
            int v1_1 = ((q0.p0) p3.getTag(2131362487));
            ref.WeakReference v2_1 = 0;
            if (v1_1 == 0) {
                v1_1 = new q0.p0();
                v1_1.a = 0;
                v1_1.b = 0;
                v1_1.c = 0;
                p3.setTag(2131362487, v1_1);
            }
            ClassCastException v3_1 = v1_1.c;
            if ((v3_1 == null) || (v3_1.get() != p4)) {
                v1_1.c = new ref.WeakReference(p4);
                if (v1_1.b == null) {
                    v1_1.b = new android.util.SparseArray();
                }
                ClassCastException v3_8 = v1_1.b;
                if (p4.getAction() == 1) {
                    int v0_3 = v3_8.indexOfKey(p4.getKeyCode());
                    if (v0_3 >= 0) {
                        v2_1 = ((ref.WeakReference) v3_8.valueAt(v0_3));
                        v3_8.removeAt(v0_3);
                    }
                }
                if (v2_1 == null) {
                    v2_1 = ((ref.WeakReference) v3_8.get(p4.getKeyCode()));
                }
                if (v2_1 != null) {
                    ClassCastException v3_11 = ((android.view.View) v2_1.get());
                    if ((v3_11 != null) && (v3_11.isAttachedToWindow())) {
                        ClassCastException v3_13 = ((java.util.ArrayList) v3_11.getTag(2131362488));
                        if (v3_13 != null) {
                            int v4_5 = (v3_13.size() - 1);
                            if (v4_5 >= 0) {
                                v3_13.get(v4_5).getClass();
                                throw new ClassCastException();
                            }
                        }
                    }
                    return 1;
                }
            }
        }
        return 0;
    }

    public static boolean o(q0.k p6, android.view.View p7, android.view.Window$Callback p8, android.view.KeyEvent p9)
    {
        boolean v0 = 0;
        if (p6 != null) {
            if (android.os.Build$VERSION.SDK_INT < 28) {
                android.view.KeyEvent$DispatcherState v2_0 = 0;
                boolean v3 = 1;
                if (!(p8 instanceof android.app.Activity)) {
                    if (!(p8 instanceof android.app.Dialog)) {
                        if (((p7) && (q0.q0.d(p7, p9))) || (p6.superDispatchKeyEvent(p9))) {
                            return 1;
                        }
                    } else {
                        if (!q4.b.d) {
                            try {
                                android.view.View v6_5 = android.app.Dialog.getDeclaredField("mOnKeyListener");
                                q4.b.e = v6_5;
                                v6_5.setAccessible(1);
                            } catch (NoSuchFieldException) {
                            }
                            q4.b.d = 1;
                        }
                        android.view.View v6_8;
                        android.view.View v6_6 = q4.b.e;
                        try {
                            if (v6_6 == null) {
                                v6_8 = 0;
                            } else {
                                v6_8 = ((android.content.DialogInterface$OnKeyListener) v6_6.get(((android.app.Dialog) p8)));
                            }
                        } catch (IllegalAccessException) {
                        }
                        if ((v6_8 == null) || (!v6_8.onKey(((android.app.Dialog) p8), p9.getKeyCode(), p9))) {
                            android.view.View v6_10 = ((android.app.Dialog) p8).getWindow();
                            if (!v6_10.superDispatchKeyEvent(p9)) {
                                android.view.View v6_11 = v6_10.getDecorView();
                                if (!q0.q0.d(v6_11, p9)) {
                                    if (v6_11 != null) {
                                        v2_0 = v6_11.getKeyDispatcherState();
                                    }
                                    v3 = p9.dispatch(((android.app.Dialog) p8), v2_0, ((android.app.Dialog) p8));
                                }
                            }
                        }
                        return v3;
                    }
                } else {
                    ((android.app.Activity) p8).onUserInteraction();
                    android.view.View v6_12 = ((android.app.Activity) p8).getWindow();
                    if (!v6_12.hasFeature(8)) {
                        if (!v6_12.superDispatchKeyEvent(p9)) {
                            android.view.View v6_13 = v6_12.getDecorView();
                            if (!q0.q0.d(v6_13, p9)) {
                                if (v6_13 != null) {
                                    v2_0 = v6_13.getKeyDispatcherState();
                                }
                                v3 = p9.dispatch(((android.app.Activity) p8), v2_0, ((android.app.Activity) p8));
                            }
                        }
                    } else {
                        boolean v7_9 = ((android.app.Activity) p8).getActionBar();
                        if ((p9.getKeyCode() != 82) || (!v7_9)) {
                        } else {
                            if (!q4.b.b) {
                                try {
                                    q4.b.c = v7_9.getClass().getMethod("onMenuKeyEvent", new Class[] {android.view.KeyEvent}));
                                } catch (NoSuchMethodException) {
                                }
                                q4.b.b = 1;
                            }
                            reflect.Method v1_6 = q4.b.c;
                            try {
                                if (v1_6 != null) {
                                    boolean v7_10 = v1_6.invoke(v7_9, new Object[] {p9}));
                                    if (v7_10) {
                                        v0 = ((Boolean) v7_10).booleanValue();
                                    } else {
                                    }
                                }
                            } catch (reflect.InvocationTargetException) {
                            }
                            if (!v0) {
                            }
                        }
                    }
                    return v3;
                }
            } else {
                return p6.superDispatchKeyEvent(p9);
            }
        }
        return 0;
    }

    public static boolean p(Object p0, Object p1)
    {
        if ((p0 != p1) && ((p0 == 0) || (!p0.equals(p1)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static java.time.ZonedDateTime q(java.time.LocalDate p2, float p3, java.time.ZoneId p4)
    {
        if ((!Float.isNaN(p3)) && ((p3 >= 0) && (p3 < 1103101952))) {
            return p2.atTime(((int) p3), ((int) ((p3 - ((float) ((int) p3))) * 1114636288))).atZone(p4);
        } else {
            return 0;
        }
    }

    public static l7.f r(l7.f p1, l7.g p2)
    {
        kotlin.jvm.internal.j.e(p2, "key");
        if (!kotlin.jvm.internal.j.a(p1.getKey(), p2)) {
            return 0;
        } else {
            return p1;
        }
    }

    public static final Class u(kotlin.jvm.internal.e p1)
    {
        Class v1_1 = p1.a();
        kotlin.jvm.internal.j.c(v1_1, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return v1_1;
    }

    public static final Class v(z7.c p2)
    {
        kotlin.jvm.internal.j.e(p2, "<this>");
        Class v2_6 = ((kotlin.jvm.internal.d) p2).a();
        if (v2_6.isPrimitive()) {
            boolean v0_11 = v2_6.getName();
            switch (v0_11.hashCode()) {
                case -1325958191:
                    if (v0_11.equals("double")) {
                        return Double;
                    }
                case 104431:
                    if (v0_11.equals("int")) {
                        return Integer;
                    }
                case 3039496:
                    if (v0_11.equals("byte")) {
                        return Byte;
                    }
                case 3052374:
                    if (v0_11.equals("char")) {
                        return Character;
                    }
                case 3327612:
                    if (v0_11.equals("long")) {
                        return Long;
                    }
                case 3625364:
                    if (v0_11.equals("void")) {
                        return Void;
                    }
                case 64711720:
                    if (v0_11.equals("boolean")) {
                        return Boolean;
                    }
                case 97526364:
                    if (v0_11.equals("float")) {
                        return Float;
                    }
                case 109413500:
                    if (v0_11.equals("short")) {
                        return Short;
                    }
                default:
            }
        }
        return v2_6;
    }

    public abstract android.view.ViewPropertyAnimator A();

    public abstract boolean E();

    public abstract void H();

    public abstract void I();

    public abstract void J();

    public abstract void K();

    public abstract void M();

    public abstract void N();

    public abstract void R();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public int hashCode()
    {
        switch (this.a) {
            case 24:
                return this.toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public abstract reflect.Method s();

    public abstract reflect.Constructor t();

    public String toString()
    {
        switch (this.a) {
            case 24:
                String v0_4 = kotlin.jvm.internal.s.a(this.getClass()).b();
                kotlin.jvm.internal.j.b(v0_4);
                return v0_4;
            default:
                return super.toString();
        }
    }

    public abstract String[] w();

    public abstract int x();

    public abstract float y();

    public abstract int z();
}
