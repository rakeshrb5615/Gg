package c4;
public abstract class b implements q0.u0 {
    public static c4.g a = None;
    public static boolean b = True;

    public b()
    {
        new java.util.concurrent.ConcurrentHashMap();
        return;
    }

    public static float[] A()
    {
        float[] v0_1 = new float[12];
        v0_1 = {-1090519040, -1090519040, 0, 1056964608, -1090519040, 0, -1090519040, 1056964608, 0, 1056964608, 1056964608, 0};
        return v0_1;
    }

    public static final Object B(e1.b p1, e1.e p2, java.io.Serializable p3)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        kotlin.jvm.internal.j.e(p2, "key");
        byte[] v1_1 = p1.a.get(p2);
        if ((v1_1 instanceof byte[])) {
            byte[] v1_3 = ((byte[]) v1_1);
            v1_1 = java.util.Arrays.copyOf(v1_3, v1_3.length);
            kotlin.jvm.internal.j.d(v1_1, "copyOf(this, size)");
        }
        if (v1_1 != null) {
            return v1_1;
        } else {
            return p3;
        }
    }

    public static android.content.SharedPreferences C(android.content.Context p2)
    {
        String v0_0 = p2.getApplicationContext();
        if (v0_0 != null) {
            p2 = v0_0;
        }
        return p2.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final int D(int p1, int p2, int p3)
    {
        if (p3 <= 0) {
            if (p3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else {
                if (p1 > p2) {
                    int v3_1 = (- p3);
                    int v1_1 = (p1 % v3_1);
                    if (v1_1 < 0) {
                        v1_1 += v3_1;
                    }
                    int v0_0 = (p2 % v3_1);
                    if (v0_0 < 0) {
                        v0_0 += v3_1;
                    }
                    int v1_3 = ((v1_1 - v0_0) % v3_1);
                    if (v1_3 < 0) {
                        v1_3 += v3_1;
                    }
                    return (v1_3 + p2);
                }
            }
        } else {
            if (p1 < p2) {
                int v0_1 = (p2 % p3);
                if (v0_1 < 0) {
                    v0_1 += p3;
                }
                int v1_6 = (p1 % p3);
                if (v1_6 < 0) {
                    v1_6 += p3;
                }
                int v0_3 = ((v0_1 - v1_6) % p3);
                if (v0_3 < 0) {
                    v0_3 += p3;
                }
                return (p2 - v0_3);
            }
        }
        return p2;
    }

    public static o0.c E(n.b1 p8)
    {
        int v0_0 = android.os.Build$VERSION.SDK_INT;
        if (v0_0 < 28) {
            android.text.TextPaint v2_1 = new android.text.TextPaint(p8.getPaint());
            android.text.TextDirectionHeuristic v3_0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
            int v4 = p8.getBreakStrategy();
            int v5 = p8.getHyphenationFrequency();
            if (!(p8.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod)) {
                int v6_2 = 1;
                int v7 = 0;
                if ((v0_0 < 28) || ((p8.getInputType() & 15) != 3)) {
                    if (p8.getLayoutDirection() != 1) {
                        v6_2 = 0;
                    }
                    switch (p8.getTextDirection()) {
                        case 2:
                            v3_0 = android.text.TextDirectionHeuristics.ANYRTL_LTR;
                            break;
                        case 3:
                            v3_0 = android.text.TextDirectionHeuristics.LTR;
                            break;
                        case 4:
                            v3_0 = android.text.TextDirectionHeuristics.RTL;
                            break;
                        case 5:
                            v3_0 = android.text.TextDirectionHeuristics.LOCALE;
                        case 6:
                            break;
                        case 7:
                            v3_0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        default:
                            if (v6_2 != 0) {
                                v3_0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            }
                    }
                } else {
                    int v8_7 = Character.getDirectionality(e0.a.c(android.icu.text.DecimalFormatSymbols.getInstance(p8.getTextLocale()))[v7].codePointAt(v7));
                    if ((v8_7 != 1) && (v8_7 != 2)) {
                        v3_0 = android.text.TextDirectionHeuristics.LTR;
                    } else {
                        v3_0 = android.text.TextDirectionHeuristics.RTL;
                    }
                }
            } else {
                v3_0 = android.text.TextDirectionHeuristics.LTR;
            }
            return new o0.c(v2_1, v3_0, v4, v5);
        } else {
            return new o0.c(e0.a.l(p8));
        }
    }

    public static void F(android.content.Context p5)
    {
        android.content.Intent v2_2 = p5.getPackageName();
        try {
            String v4_4 = new StringBuilder("market://details?id=");
            v4_4.append(v2_2);
            String v4_1 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(v4_4.toString()));
            v4_1.setPackage("com.android.vending");
            v4_1.addFlags(268435456);
            p5.startActivity(v4_1);
            return;
        } catch (android.content.ActivityNotFoundException) {
            android.net.Uri v1_4 = new StringBuilder("https://play.google.com/store/apps/details?id=");
            v1_4.append(v2_2);
            android.content.Intent v2_1 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(v1_4.toString()));
            v2_1.addFlags(268435456);
            p5.startActivity(v2_1);
            return;
        }
    }

    public static boolean G(int p1)
    {
        if (((p1 & 32) == 0) && (((p1 & 64) == 0) && (((p1 & 128) == 0) && (((p1 & 256) == 0) && (((p1 & 512) == 0) && ((p1 & 4096) == 0)))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean H(int p1)
    {
        if (((p1 & 4) == 0) && (((p1 & 1) == 0) && (!c4.b.G(p1)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean I(int p2)
    {
        if (((p2 & 2) == 0) && ((p2 & 1) == 0)) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean J(int p1)
    {
        if (((p1 & 16) == 0) && (((p1 & 1024) == 0) && (((p1 & 2048) == 0) && (((p1 & 128) == 0) && (((p1 & 256) == 0) && (((p1 & 512) == 0) && ((p1 & 4096) == 0))))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void K(android.app.Activity p9, android.content.Context p10)
    {
        com.google.android.gms.tasks.Task v0_0 = p9.getApplicationContext();
        if (v0_0 == null) {
            v0_0 = p9;
        }
        com.google.android.gms.tasks.Task v0_3;
        k2.c v1_1 = new k2.c(new h4.f(v0_0));
        com.google.android.gms.tasks.Task v0_10 = ((h4.f) v1_1.b);
        String v3_0 = h4.f.c;
        v3_0.g("requestInAppReview (%s)", new Object[] {v0_10.b}));
        h5.a v2_2 = v0_10.a;
        if (v2_2 != null) {
            String v3_2 = new com.google.android.gms.tasks.TaskCompletionSource();
            v2_2.a().post(new i4.f(v2_2, v3_2, v3_2, new h4.d(v0_10, v3_2, v3_2)));
            v0_3 = v3_2.getTask();
        } else {
            com.google.android.gms.tasks.Task v0_5 = new Object[0];
            if (android.util.Log.isLoggable("PlayCore", 6)) {
                android.util.Log.e("PlayCore", d4.l.i(v3_0.b, "Play Store app is either not installed or not the official version", v0_5));
            }
            String v6_5;
            String v3_4 = java.util.Locale.getDefault();
            Object[] v5_0 = Integer.valueOf(-1);
            String v6_0 = j4.a.a;
            String v7_0 = Integer.valueOf(-1);
            if (v6_0.containsKey(v7_0)) {
                String v6_2 = ((String) v6_0.get(v7_0));
                String v7_2 = ((String) j4.a.b.get(v7_0));
                StringBuilder v8_3 = new StringBuilder();
                v8_3.append(v6_2);
                v8_3.append(" (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#");
                v8_3.append(v7_2);
                v8_3.append(")");
                v6_5 = v8_3.toString();
            } else {
                v6_5 = "";
            }
            v0_3 = com.google.android.gms.tasks.Tasks.forException(new e4.a(new com.google.android.gms.common.api.Status(-1, String.format(v3_4, "Review Error(%d): %s", new Object[] {v5_0, v6_5})))));
        }
        v0_3.addOnCompleteListener(new h5.a(v1_1, p9, p10, 1));
        return;
    }

    public static varargs String L(String p9, Object[] p10)
    {
        int v0_0 = 0;
        int v1_0 = 0;
        while (v1_0 < p10.length) {
            int v2_4;
            int v2_3 = p10[v1_0];
            if (v2_3 != 0) {
                try {
                    v2_4 = v2_3.toString();
                } catch (int v3_4) {
                    int v4_2 = new StringBuilder();
                    v4_2.append(v2_4.getClass().getName());
                    v4_2.append(64);
                    v4_2.append(Integer.toHexString(System.identityHashCode(v2_4)));
                    int v2_8 = v4_2.toString();
                    int v4_4 = java.util.logging.Logger.getLogger("com.google.common.base.Strings");
                    String v6_1 = new StringBuilder("Exception during lenientFormat for ");
                    v6_1.append(v2_8);
                    v4_4.log(java.util.logging.Level.WARNING, v6_1.toString(), v3_4);
                    int v2_9 = v1.a.q("<", v2_8, " threw ");
                    v2_9.append(v3_4.getClass().getName());
                    v2_9.append(">");
                    v2_4 = v2_9.toString();
                }
            } else {
                v2_4 = "null";
            }
            p10[v1_0] = v2_4;
            v1_0++;
        }
        int v1_1 = new StringBuilder(((p10.length * 16) + p9.length()));
        int v2_0 = 0;
        while (v0_0 < p10.length) {
            int v3_2 = p9.indexOf("%s", v2_0);
            if (v3_2 == -1) {
                break;
            }
            v1_1.append(p9, v2_0, v3_2);
            int v2_2 = (v0_0 + 1);
            v1_1.append(p10[v0_0]);
            v2_0 = (v3_2 + 2);
            v0_0 = v2_2;
        }
        v1_1.append(p9, v2_0, p9.length());
        if (v0_0 < p10.length) {
            v1_1.append(" [");
            int v9_3 = (v0_0 + 1);
            v1_1.append(p10[v0_0]);
            while (v9_3 < p10.length) {
                v1_1.append(", ");
                int v0_6 = (v9_3 + 1);
                v1_1.append(p10[v9_3]);
                v9_3 = v0_6;
            }
            v1_1.append(93);
        }
        return v1_1.toString();
    }

    public static int M(int p2, String p3)
    {
        int v2_1 = android.opengl.GLES20.glCreateShader(p2);
        android.opengl.GLES20.glShaderSource(v2_1, p3);
        android.opengl.GLES20.glCompileShader(v2_1);
        int v3_2 = new int[1];
        android.opengl.GLES20.glGetShaderiv(v2_1, 35713, v3_2, 0);
        if (v3_2[0] != 0) {
            return v2_1;
        } else {
            android.opengl.GLES20.glDeleteShader(v2_1);
            return 0;
        }
    }

    public static int N(android.graphics.Bitmap p6)
    {
        if ((p6 != 0) && (!p6.isRecycled())) {
            int[] v2 = new int[1];
            android.opengl.GLES20.glGenTextures(1, v2, 0);
            int v3_4 = v2[0];
            if (v3_4 != 0) {
                try {
                    android.opengl.GLES20.glBindTexture(3553, v3_4);
                    android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
                    android.opengl.GLES20.glTexParameteri(3553, 10240, 9729);
                    android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
                    android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
                    android.opengl.GLUtils.texImage2D(3553, 0, p6, 0);
                    p6.recycle();
                    int v6_1 = v2[0];
                    return v6_1;
                } catch (Throwable v0_1) {
                    v6_1.recycle();
                    throw v0_1;
                }
            }
        }
        return 0;
    }

    public static int O(android.content.Context p4, int p5)
    {
        try {
            int v4_1 = j5.t1.A(p4, p5);
        } catch (Exception) {
            return 0;
        }
        if (v4_1 != 0) {
            android.graphics.Bitmap v5_1 = v4_1.getIntrinsicWidth();
            android.graphics.Canvas v1_0 = v4_1.getIntrinsicHeight();
            if ((v5_1 <= null) || (v1_0 <= null)) {
                v5_1 = 64;
                v1_0 = 64;
            }
            android.graphics.Bitmap v5_2 = android.graphics.Bitmap.createBitmap(v5_1, v1_0, android.graphics.Bitmap$Config.ARGB_8888);
            android.graphics.Canvas v1_2 = new android.graphics.Canvas(v5_2);
            v4_1.setBounds(0, 0, v1_2.getWidth(), v1_2.getHeight());
            v4_1.draw(v1_2);
            return c4.b.N(v5_2);
        } else {
            return 0;
        }
    }

    public static void P(android.content.SharedPreferences p1, String p2, float p3)
    {
        try {
            p1.edit().putFloat(p2, p3).apply();
            return;
        } catch (ClassCastException) {
            p1.edit().remove(p2).apply();
            p1.edit().putFloat(p2, p3).apply();
            return;
        }
    }

    public static void Q(android.content.SharedPreferences p1, String p2, int p3)
    {
        try {
            p1.edit().putInt(p2, p3).apply();
            return;
        } catch (ClassCastException) {
            p1.edit().remove(p2).apply();
            p1.edit().putInt(p2, p3).apply();
            return;
        }
    }

    public static h1.b R(java.nio.MappedByteBuffer p13)
    {
        short v13_1 = p13.duplicate();
        v13_1.order(java.nio.ByteOrder.BIG_ENDIAN);
        v13_1.position((v13_1.position() + 4));
        h1.b v0_0 = (v13_1.getShort() & 65535);
        if (v0_0 > 100) {
            throw new java.io.IOException("Cannot read metadata.");
        } else {
            v13_1.position((v13_1.position() + 6));
            int v1_4 = 0;
            int v3_0 = 0;
            while (v3_0 < v0_0) {
                int v8 = v13_1.getInt();
                v13_1.position((v13_1.position() + 4));
                long v9_0 = (((long) v13_1.getInt()) & 4294967295);
                v13_1.position((v13_1.position() + 4));
                if (1835365473 != v8) {
                    v3_0++;
                }
                if (v9_0 != -1) {
                    v13_1.position((v13_1.position() + ((int) (v9_0 - ((long) v13_1.position())))));
                    v13_1.position((v13_1.position() + 12));
                    long v6_4 = (((long) v13_1.getInt()) & 4294967295);
                    while (((long) v1_4) < v6_4) {
                        h1.b v0_11 = v13_1.getInt();
                        long v11_5 = (((long) v13_1.getInt()) & 4294967295);
                        v13_1.getInt();
                        if ((1164798569 != v0_11) && (1701669481 != v0_11)) {
                            v1_4++;
                        } else {
                            v13_1.position(((int) (v11_5 + v9_0)));
                            h1.b v0_14 = new h1.b();
                            v13_1.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                            int v2_3 = (v13_1.position() + v13_1.getInt(v13_1.position()));
                            v0_14.d = v13_1;
                            v0_14.a = v2_3;
                            int v2_0 = (v2_3 - v13_1.getInt(v2_3));
                            v0_14.b = v2_0;
                            v0_14.c = ((java.nio.ByteBuffer) v0_14.d).getShort(v2_0);
                            return v0_14;
                        }
                    }
                }
                throw new java.io.IOException("Cannot read metadata.");
            }
            v9_0 = -1;
        }
    }

    public static final byte[] S(java.io.InputStream p3)
    {
        kotlin.jvm.internal.j.e(p3, "<this>");
        String v0_3 = new java.io.ByteArrayOutputStream(Math.max(8192, p3.available()));
        c4.b.o(p3, v0_3);
        byte[] v3_1 = v0_3.toByteArray();
        kotlin.jvm.internal.j.d(v3_1, "toByteArray(...)");
        return v3_1;
    }

    public static android.util.TypedValue T(android.content.Context p2, int p3)
    {
        android.util.TypedValue v0_1 = new android.util.TypedValue();
        if (!p2.getTheme().resolveAttribute(p3, v0_1, 1)) {
            return 0;
        } else {
            return v0_1;
        }
    }

    public static boolean U(android.content.Context p1, int p2, boolean p3)
    {
        int v1_1 = c4.b.T(p1, p2);
        if ((v1_1 == 0) || (v1_1.type != 18)) {
            return p3;
        } else {
            if (v1_1.data == 0) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static int V(android.content.Context p3)
    {
        int v3_2;
        int v0_2 = c4.b.T(p3, 2130969509);
        if ((v0_2 != 0) && (v0_2.type == 5)) {
            v3_2 = v0_2.getDimension(p3.getResources().getDisplayMetrics());
        } else {
            v3_2 = p3.getResources().getDimension(2131166140);
        }
        return ((int) v3_2);
    }

    public static android.util.TypedValue W(android.content.Context p1, int p2, String p3)
    {
        IllegalArgumentException v0_0 = c4.b.T(p1, p2);
        if (v0_0 == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[] {p3, p1.getResources().getResourceName(p2)})));
        } else {
            return v0_0;
        }
    }

    public static void X(int p3, android.widget.TextView p4)
    {
        p0.e.c(p3);
        if (android.os.Build$VERSION.SDK_INT < 28) {
            int v0_1;
            int v0_4 = p4.getPaint().getFontMetricsInt();
            if (!p4.getIncludeFontPadding()) {
                v0_1 = v0_4.ascent;
            } else {
                v0_1 = v0_4.top;
            }
            if (p3 > Math.abs(v0_1)) {
                p4.setPadding(p4.getPaddingLeft(), (p3 + v0_1), p4.getPaddingRight(), p4.getPaddingBottom());
            }
            return;
        } else {
            e0.a.o(p3, p4);
            return;
        }
    }

    public static void Y(int p3, android.widget.TextView p4)
    {
        int v0_3;
        p0.e.c(p3);
        int v0_2 = p4.getPaint().getFontMetricsInt();
        if (!p4.getIncludeFontPadding()) {
            v0_3 = v0_2.descent;
        } else {
            v0_3 = v0_2.bottom;
        }
        if (p3 > Math.abs(v0_3)) {
            p4.setPadding(p4.getPaddingLeft(), p4.getPaddingTop(), p4.getPaddingRight(), (p3 - v0_3));
        }
        return;
    }

    public static void Z(int p2, android.widget.TextView p3)
    {
        p0.e.c(p2);
        int v0_1 = p3.getPaint().getFontMetricsInt(0);
        if (p2 != v0_1) {
            p3.setLineSpacing(((float) (p2 - v0_1)), 1065353216);
        }
        return;
    }

    public static void a0(float[] p9, float[] p10, float[] p11, float p12, float p13, float p14, float p15)
    {
        android.opengl.Matrix.setIdentityM(p9, 0);
        android.opengl.Matrix.orthoM(p10, 0, p12, p13, p14, p15, -1054867456, 1092616192);
        android.opengl.Matrix.multiplyMM(p11, 0, p10, 0, p9, 0);
        return;
    }

    public static void b0(android.app.Activity p4, android.content.Context p5)
    {
        try {
            android.content.Intent v1_2 = p5.getPackageName();
            String v2_4 = new StringBuilder("https://play.google.com/store/apps/details?id=");
            v2_4.append(v1_2);
            int v0_5 = v2_4.toString();
            android.content.Intent v1_4 = new StringBuilder();
            v1_4.append(p4.getString(2131952341));
            v1_4.append(v0_5);
            int v0_1 = v1_4.toString();
            android.content.Intent v1_1 = new android.content.Intent("android.intent.action.SEND");
            v1_1.setType("text/plain");
            v1_1.putExtra("android.intent.extra.SUBJECT", p4.getString(2131952341));
            v1_1.putExtra("android.intent.extra.TEXT", v0_1);
            p4.startActivity(android.content.Intent.createChooser(v1_1, "Share app via"));
            return;
        } catch (Exception) {
            android.widget.Toast.makeText(p5, "Unable to share at this time.", 0).show();
            return;
        }
    }

    public static final e1.e c0(String p1)
    {
        kotlin.jvm.internal.j.e(p1, "name");
        return new e1.e(p1);
    }

    public static void d(StringBuilder p0, Object p1, u7.l p2)
    {
        if (!p2) {
            boolean v2_1;
            if (p1 != null) {
                v2_1 = (p1 instanceof CharSequence);
            } else {
                v2_1 = 1;
            }
            if (!v2_1) {
                if (!(p1 instanceof Character)) {
                    p0.append(p1.toString());
                    return;
                } else {
                    p0.append(((Character) p1).charValue());
                    return;
                }
            } else {
                p0.append(((CharSequence) p1));
                return;
            }
        } else {
            p0.append(((CharSequence) p2.invoke(p1)));
            return;
        }
    }

    public static void d0(android.view.ViewGroup p2, boolean p3)
    {
        if (android.os.Build$VERSION.SDK_INT < 29) {
            if (c4.b.b) {
                try {
                    f2.b0.m(p2, p3);
                    return;
                } catch (NoSuchMethodError) {
                    c4.b.b = 0;
                }
            }
            return;
        } else {
            f2.b0.m(p2, p3);
            return;
        }
    }

    public static final Object e(f8.q p4, a1.k0 p5, n7.c p6)
    {
        z8.u v0_2;
        if (!(p6 instanceof f8.o)) {
            v0_2 = new f8.o(p6);
        } else {
            v0_2 = ((f8.o) p6);
            m7.a v1_2 = ((f8.o) p6).c;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((f8.o) p6).c = (v1_2 - -2147483648);
            }
        }
        d8.n v6_1 = v0_2.b;
        m7.a v1_1 = m7.a.a;
        int v2_0 = v0_2.c;
        try {
            if (v2_0 == 0) {
                c4.b.e0(v6_1);
                if (v0_2.getContext().get(d8.b0.b) != p4) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                } else {
                    v0_2.a = p5;
                    v0_2.c = 1;
                    d8.n v6_5 = new d8.n(1, q4.b.C(v0_2));
                    v6_5.r();
                    ((f8.p) p4).R(new z8.u(v6_5, 3));
                    if (v6_5.q() == v1_1) {
                        return v1_1;
                    }
                }
            } else {
                if (v2_0 != 1) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    p5 = v0_2.a;
                    c4.b.e0(v6_1);
                }
            }
        } catch (h7.l v4_7) {
            p5.invoke();
            throw v4_7;
        }
        p5.invoke();
        return h7.l.a;
    }

    public static final void e0(Object p1)
    {
        if ((p1 instanceof h7.g)) {
            throw ((h7.g) p1).a;
        } else {
            return;
        }
    }

    public static final varargs android.os.Bundle f(h7.f[] p9)
    {
        IllegalArgumentException v0_3 = new android.os.Bundle(p9.length);
        StringBuilder v1_3 = p9.length;
        String v2_1 = 0;
        while (v2_1 < v1_3) {
            android.util.SizeF v3_31 = p9[v2_1];
            String v4_1 = ((String) v3_31.a);
            android.util.SizeF v3_0 = v3_31.b;
            if (v3_0 != null) {
                if (!(v3_0 instanceof Boolean)) {
                    if (!(v3_0 instanceof Byte)) {
                        if (!(v3_0 instanceof Character)) {
                            if (!(v3_0 instanceof Double)) {
                                if (!(v3_0 instanceof Float)) {
                                    if (!(v3_0 instanceof Integer)) {
                                        if (!(v3_0 instanceof Long)) {
                                            if (!(v3_0 instanceof Short)) {
                                                if (!(v3_0 instanceof android.os.Bundle)) {
                                                    if (!(v3_0 instanceof CharSequence)) {
                                                        if (!(v3_0 instanceof android.os.Parcelable)) {
                                                            if (!(v3_0 instanceof boolean[])) {
                                                                if (!(v3_0 instanceof byte[])) {
                                                                    if (!(v3_0 instanceof char[])) {
                                                                        if (!(v3_0 instanceof double[])) {
                                                                            if (!(v3_0 instanceof float[])) {
                                                                                if (!(v3_0 instanceof int[])) {
                                                                                    if (!(v3_0 instanceof long[])) {
                                                                                        if (!(v3_0 instanceof short[])) {
                                                                                            if (!(v3_0 instanceof Object[])) {
                                                                                                if (!(v3_0 instanceof java.io.Serializable)) {
                                                                                                    if (!(v3_0 instanceof android.os.IBinder)) {
                                                                                                        if (!(v3_0 instanceof android.util.Size)) {
                                                                                                            if (!(v3_0 instanceof android.util.SizeF)) {
                                                                                                                String v9_4 = v3_0.getClass().getCanonicalName();
                                                                                                                StringBuilder v1_5 = new StringBuilder("Illegal value type ");
                                                                                                                v1_5.append(v9_4);
                                                                                                                v1_5.append(" for key \"");
                                                                                                                v1_5.append(v4_1);
                                                                                                                v1_5.append(34);
                                                                                                                throw new IllegalArgumentException(v1_5.toString());
                                                                                                            } else {
                                                                                                                v0_3.putSizeF(v4_1, ((android.util.SizeF) v3_0));
                                                                                                            }
                                                                                                        } else {
                                                                                                            v0_3.putSize(v4_1, ((android.util.Size) v3_0));
                                                                                                        }
                                                                                                    } else {
                                                                                                        v0_3.putBinder(v4_1, ((android.os.IBinder) v3_0));
                                                                                                    }
                                                                                                } else {
                                                                                                    v0_3.putSerializable(v4_1, ((java.io.Serializable) v3_0));
                                                                                                }
                                                                                            } else {
                                                                                                boolean v5_27 = v3_0.getClass().getComponentType();
                                                                                                kotlin.jvm.internal.j.b(v5_27);
                                                                                                if (!android.os.Parcelable.isAssignableFrom(v5_27)) {
                                                                                                    if (!String.isAssignableFrom(v5_27)) {
                                                                                                        if (!CharSequence.isAssignableFrom(v5_27)) {
                                                                                                            if (!java.io.Serializable.isAssignableFrom(v5_27)) {
                                                                                                                String v9_1 = v5_27.getCanonicalName();
                                                                                                                StringBuilder v1_2 = new StringBuilder("Illegal value array type ");
                                                                                                                v1_2.append(v9_1);
                                                                                                                v1_2.append(" for key \"");
                                                                                                                v1_2.append(v4_1);
                                                                                                                v1_2.append(34);
                                                                                                                throw new IllegalArgumentException(v1_2.toString());
                                                                                                            } else {
                                                                                                                v0_3.putSerializable(v4_1, ((java.io.Serializable) v3_0));
                                                                                                            }
                                                                                                        } else {
                                                                                                            v0_3.putCharSequenceArray(v4_1, ((CharSequence[]) v3_0));
                                                                                                        }
                                                                                                    } else {
                                                                                                        v0_3.putStringArray(v4_1, ((String[]) v3_0));
                                                                                                    }
                                                                                                } else {
                                                                                                    v0_3.putParcelableArray(v4_1, ((android.os.Parcelable[]) v3_0));
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            v0_3.putShortArray(v4_1, ((short[]) v3_0));
                                                                                        }
                                                                                    } else {
                                                                                        v0_3.putLongArray(v4_1, ((long[]) v3_0));
                                                                                    }
                                                                                } else {
                                                                                    v0_3.putIntArray(v4_1, ((int[]) v3_0));
                                                                                }
                                                                            } else {
                                                                                v0_3.putFloatArray(v4_1, ((float[]) v3_0));
                                                                            }
                                                                        } else {
                                                                            v0_3.putDoubleArray(v4_1, ((double[]) v3_0));
                                                                        }
                                                                    } else {
                                                                        v0_3.putCharArray(v4_1, ((char[]) v3_0));
                                                                    }
                                                                } else {
                                                                    v0_3.putByteArray(v4_1, ((byte[]) v3_0));
                                                                }
                                                            } else {
                                                                v0_3.putBooleanArray(v4_1, ((boolean[]) v3_0));
                                                            }
                                                        } else {
                                                            v0_3.putParcelable(v4_1, ((android.os.Parcelable) v3_0));
                                                        }
                                                    } else {
                                                        v0_3.putCharSequence(v4_1, ((CharSequence) v3_0));
                                                    }
                                                } else {
                                                    v0_3.putBundle(v4_1, ((android.os.Bundle) v3_0));
                                                }
                                            } else {
                                                v0_3.putShort(v4_1, ((Number) v3_0).shortValue());
                                            }
                                        } else {
                                            v0_3.putLong(v4_1, ((Number) v3_0).longValue());
                                        }
                                    } else {
                                        v0_3.putInt(v4_1, ((Number) v3_0).intValue());
                                    }
                                } else {
                                    v0_3.putFloat(v4_1, ((Number) v3_0).floatValue());
                                }
                            } else {
                                v0_3.putDouble(v4_1, ((Number) v3_0).doubleValue());
                            }
                        } else {
                            v0_3.putChar(v4_1, ((Character) v3_0).charValue());
                        }
                    } else {
                        v0_3.putByte(v4_1, ((Number) v3_0).byteValue());
                    }
                } else {
                    v0_3.putBoolean(v4_1, ((Boolean) v3_0).booleanValue());
                }
            } else {
                v0_3.putString(v4_1, 0);
            }
            v2_1++;
        }
        return v0_3;
    }

    public static int f0(android.content.Context p1, int p2)
    {
        android.content.res.TypedArray v1_1 = p1.obtainStyledAttributes(16973825, new int[] {p2}));
        int v2_3 = v1_1.getResourceId(0, -1);
        v1_1.recycle();
        return v2_3;
    }

    public static float g(float p1, float p2, float p3)
    {
        if (p1 >= p2) {
            if (p1 <= p3) {
                return p1;
            } else {
                return p3;
            }
        } else {
            return p2;
        }
    }

    public static void g0(int p7, float[] p8, float[] p9, float[] p10, float p11)
    {
        android.opengl.Matrix.setIdentityM(p8, 0);
        android.opengl.Matrix.multiplyMM(p10, 0, p9, 0, p8, 0);
        android.opengl.GLES20.glUniformMatrix4fv(android.opengl.GLES20.glGetUniformLocation(p7, "u_MVPMatrix"), 1, 0, p10, 0);
        android.opengl.GLES20.glUniform1f(android.opengl.GLES20.glGetUniformLocation(p7, "uZ"), p11);
        return;
    }

    public static int h(int p0, int p1, int p2)
    {
        if (p0 >= p1) {
            if (p0 <= p2) {
                return p0;
            } else {
                return p2;
            }
        } else {
            return p1;
        }
    }

    public static android.view.ActionMode$Callback h0(android.view.ActionMode$Callback p1)
    {
        if ((p1 instanceof t0.h)) {
            p1 = ((t0.h) p1).a;
        }
        return p1;
    }

    public static void i(java.nio.FloatBuffer p0)
    {
        if (p0 != null) {
            p0.clear();
        }
        return;
    }

    public static android.view.ActionMode$Callback i0(android.view.ActionMode$Callback p2, android.widget.TextView p3)
    {
        if ((android.os.Build$VERSION.SDK_INT <= 27) && ((!(p2 instanceof t0.h)) && (p2 != null))) {
            return new t0.h(p2, p3);
        } else {
            return p2;
        }
    }

    public static void j(int p0)
    {
        if (p0 != 0) {
            android.opengl.GLES20.glDeleteProgram(p0);
        }
        return;
    }

    public static void k(int p2)
    {
        if (p2 != null) {
            android.opengl.GLES20.glDeleteTextures(1, new int[] {p2}), 0);
        }
        return;
    }

    public static int l(a2.g1 p0, a2.e0 p1, android.view.View p2, android.view.View p3, a2.t0 p4, boolean p5)
    {
        if ((p4.v() != 0) && ((p0.b() != 0) && ((p2 != 0) && (p3 != null)))) {
            if (p5) {
                return Math.min(p1.l(), (p1.b(p3) - p1.e(p2)));
            } else {
                return (Math.abs((a2.t0.G(p2) - a2.t0.G(p3))) + 1);
            }
        } else {
            return 0;
        }
    }

    public static int m(a2.g1 p3, a2.e0 p4, android.view.View p5, android.view.View p6, a2.t0 p7, boolean p8, boolean p9)
    {
        if ((p7.v() != 0) && ((p3.b() != 0) && ((p5 != null) && (p6 != 0)))) {
            int v3_1;
            float v7_3 = Math.min(a2.t0.G(p5), a2.t0.G(p6));
            int v1_2 = Math.max(a2.t0.G(p5), a2.t0.G(p6));
            if (!p9) {
                v3_1 = Math.max(0, v7_3);
            } else {
                v3_1 = Math.max(0, ((p3.b() - v1_2) - 1));
            }
            if (p8 != 0) {
                return Math.round(((((float) v3_1) * (((float) Math.abs((p4.b(p6) - p4.e(p5)))) / ((float) (Math.abs((a2.t0.G(p5) - a2.t0.G(p6))) + 1)))) + ((float) (p4.k() - p4.e(p5)))));
            } else {
                return v3_1;
            }
        } else {
            return 0;
        }
    }

    public static int n(a2.g1 p0, a2.e0 p1, android.view.View p2, android.view.View p3, a2.t0 p4, boolean p5)
    {
        if ((p4.v() != 0) && ((p0.b() != 0) && ((p2 != 0) && (p3 != null)))) {
            if (p5) {
                return ((int) ((((float) (p1.b(p3) - p1.e(p2))) / ((float) (Math.abs((a2.t0.G(p2) - a2.t0.G(p3))) + 1))) * ((float) p0.b())));
            } else {
                return p0.b();
            }
        } else {
            return 0;
        }
    }

    public static void o(java.io.InputStream p3, java.io.ByteArrayOutputStream p4)
    {
        kotlin.jvm.internal.j.e(p3, "<this>");
        byte[] v0_2 = new byte[8192];
        int v1 = p3.read(v0_2);
        while (v1 >= 0) {
            p4.write(v0_2, 0, v1);
            v1 = p3.read(v0_2);
        }
        return;
    }

    public static final h7.g p(Throwable p1)
    {
        kotlin.jvm.internal.j.e(p1, "exception");
        return new h7.g(p1);
    }

    public static java.nio.FloatBuffer q(float[] p2)
    {
        java.nio.FloatBuffer v0_2 = java.nio.ByteBuffer.allocateDirect((p2.length * 4));
        v0_2.order(java.nio.ByteOrder.nativeOrder());
        java.nio.FloatBuffer v0_3 = v0_2.asFloatBuffer();
        v0_3.put(p2);
        v0_3.position(0);
        return v0_3;
    }

    public static void v(String p1, String p2, Object p3)
    {
        String v1_1 = "TRuntime.".concat(p1);
        if (android.util.Log.isLoggable(v1_1, 3)) {
            android.util.Log.d(v1_1, String.format(p2, new Object[] {p3})));
        }
        return;
    }

    public static void w(Exception p1, String p2, String p3)
    {
        String v2_1 = "TRuntime.".concat(p2);
        if (android.util.Log.isLoggable(v2_1, 6)) {
            android.util.Log.e(v2_1, p3, p1);
        }
        return;
    }

    public static final o7.b x(Enum[] p1)
    {
        kotlin.jvm.internal.j.e(p1, "entries");
        return new o7.b(p1);
    }

    public static int y(int p1, int p2)
    {
        if (p2 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        } else {
            int v1_3 = ((p1 + (p1 >> 1)) + 1);
            if (v1_3 < p2) {
                v1_3 = (Integer.highestOneBit((p2 - 1)) << 1);
            }
            if (v1_3 < 0) {
                v1_3 = 2147483647;
            }
            return v1_3;
        }
    }

    public void b()
    {
        return;
    }

    public void c()
    {
        return;
    }

    public abstract void j0();

    public abstract android.graphics.Typeface r();

    public abstract android.graphics.Typeface s();

    public android.graphics.Typeface t(android.content.Context p1, java.util.List p2, int p3)
    {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public android.graphics.Typeface u(android.content.Context p1, android.content.res.Resources p2, int p3, String p4, int p5)
    {
        java.io.File v1_1 = j5.t1.F(p1);
        if (v1_1 != null) {
            try {
                if (j5.t1.h(v1_1, p2, p3)) {
                    android.graphics.Typeface v2_1 = android.graphics.Typeface.createFromFile(v1_1.getPath());
                    v1_1.delete();
                    return v2_1;
                } else {
                    v1_1.delete();
                    return 0;
                }
            } catch (RuntimeException) {
                v1_1.delete();
                return 0;
            } catch (android.graphics.Typeface v2_2) {
                v1_1.delete();
                throw v2_2;
            }
        } else {
            return 0;
        }
    }

    public n0.i z(n0.i[] p11, int p12)
    {
        int v0_1;
        if ((p12 & 1) != 0) {
            v0_1 = 700;
        } else {
            v0_1 = 400;
        }
        int v12_2;
        if ((p12 & 2) == 0) {
            v12_2 = 0;
        } else {
            v12_2 = 1;
        }
        int v3 = p11.length;
        n0.i v4 = 0;
        int v5 = 2147483647;
        int v6 = 0;
        while (v6 < v3) {
            int v9_1;
            n0.i v7 = p11[v6];
            int v8_2 = Math.abs((v7.c - v0_1));
            if (v7.d != v12_2) {
                v9_1 = 1;
            } else {
                v9_1 = 0;
            }
            int v8_4 = ((v8_2 * 2) + v9_1);
            if ((v4 == null) || (v5 > v8_4)) {
                v4 = v7;
                v5 = v8_4;
            }
            v6++;
        }
        return v4;
    }
}
