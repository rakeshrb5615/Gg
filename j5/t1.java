package j5;
public abstract class t1 {
    public static long a = 0;
    public static reflect.Method b = None;
    public static boolean c = True;
    public static reflect.Field d;
    public static boolean e;

    public static android.graphics.drawable.Drawable A(android.content.Context p1, int p2)
    {
        return n.n2.b().c(p1, p2);
    }

    public static android.graphics.drawable.Drawable B(android.content.Context p1, android.content.res.TypedArray p2, int p3)
    {
        if (p2.hasValue(p3)) {
            int v0_2 = p2.getResourceId(p3, 0);
            if (v0_2 != 0) {
                android.graphics.drawable.Drawable v1_2 = j5.t1.A(p1, v0_2);
                if (v1_2 != null) {
                    return v1_2;
                }
            }
        }
        return p2.getDrawable(p3);
    }

    public static float C(String[] p2, int p3)
    {
        String v2_3 = Float.parseFloat(p2[p3]);
        if ((v2_3 < 0) || (v2_3 > 1065353216)) {
            StringBuilder v0_1 = new StringBuilder("Motion easing control point value must be between 0 and 1; instead got: ");
            v0_1.append(v2_3);
            throw new IllegalArgumentException(v0_1.toString());
        } else {
            return v2_3;
        }
    }

    public static final o8.a D(o8.a p1)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        if (!p1.d().g()) {
            return new s8.j(p1);
        } else {
            return p1;
        }
    }

    public static final android.os.Bundle E(android.os.Bundle p2, String p3)
    {
        IllegalArgumentException v2_1 = p2.getBundle(p3);
        if (v2_1 == null) {
            throw new IllegalArgumentException(v1.a.l("No valid saved state was found for the key \'", p3, "\'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        } else {
            return v2_1;
        }
    }

    public static java.io.File F(android.content.Context p5)
    {
        java.io.File v5_1 = p5.getCacheDir();
        if (v5_1 != null) {
            String v1_2 = new StringBuilder(".font");
            v1_2.append(android.os.Process.myPid());
            v1_2.append("-");
            v1_2.append(android.os.Process.myTid());
            v1_2.append("-");
            String v1_0 = v1_2.toString();
            int v2_1 = 0;
            while (v2_1 < 100) {
                boolean v4_1 = new StringBuilder();
                v4_1.append(v1_0);
                v4_1.append(v2_1);
                java.io.File v3_3 = new java.io.File(v5_1, v4_1.toString());
                try {
                    if (!v3_3.createNewFile()) {
                        v2_1++;
                    } else {
                        return v3_3;
                    }
                } catch (java.io.IOException) {
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    public static boolean H(int p21)
    {
        int v20;
        if (p21 == 0) {
            v20 = 0;
        } else {
            double v1_2 = h0.a.a;
            double[] v2_1 = ((double[]) v1_2.get());
            if (v2_1 == null) {
                v2_1 = new double[3];
                v1_2.set(v2_1);
            }
            double v1_0 = android.graphics.Color.red(p21);
            int v4 = android.graphics.Color.green(p21);
            int v5_0 = android.graphics.Color.blue(p21);
            if (v2_1.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            } else {
                long v6_5;
                long v6_2 = (((double) v1_0) / 4643176031446892544);
                if (v6_2 >= 4585990280393462802) {
                    v6_5 = Math.pow(((v6_2 + 4588087156379966505) / 4607430116779522785), 4612586738352862003);
                } else {
                    v6_5 = (v6_2 / 4623462931452961751);
                }
                int v3_4;
                int v3_1 = (((double) v4) / 4643176031446892544);
                if (v3_1 >= 4585990280393462802) {
                    v3_4 = Math.pow(((v3_1 + 4588087156379966505) / 4607430116779522785), 4612586738352862003);
                } else {
                    v3_4 = (v3_1 / 4623462931452961751);
                }
                double v0_6;
                v20 = 0;
                double v0_3 = (((double) v5_0) / 4643176031446892544);
                if (v0_3 >= 4585990280393462802) {
                    v0_6 = Math.pow(((v0_3 + 4588087156379966505) / 4607430116779522785), 4612586738352862003);
                } else {
                    v0_6 = (v0_3 / 4623462931452961751);
                }
                v2_1[0] = (((4595671218152458420 * v0_6) + ((4600113568824896677 * v3_4) + (4601100757863216290 * v6_5))) * 4636737291354636288);
                double v8_12 = (((4589866978952703325 * v0_6) + ((4604617168452267173 * v3_4) + (4596827742536767164 * v6_5))) * 4636737291354636288);
                v2_1[1] = v8_12;
                v2_1[2] = (((v0_6 * 4606736562436907729) + ((v3_4 * 4593253685872485938) + (v6_5 * 4581220067668151973))) * 4636737291354636288);
                if ((v8_12 / 4636737291354636288) > 4602678819172646912) {
                    return 1;
                }
            }
        }
        return v20;
    }

    public static boolean I()
    {
        if (android.os.Build$VERSION.SDK_INT < 29) {
            try {
                if (j5.t1.b == null) {
                    j5.t1.a = android.os.Trace.getField("TRACE_TAG_APP").getLong(0);
                    j5.t1.b = android.os.Trace.getMethod("isTagEnabled", new Class[] {Long.TYPE}));
                }
            } catch (RuntimeException v0_2) {
                if (!(v0_2 instanceof reflect.InvocationTargetException)) {
                    android.util.Log.v("Trace", "Unable to call isTagEnabled via reflection", v0_2);
                    return 0;
                } else {
                    RuntimeException v0_4 = v0_2.getCause();
                    if (!(v0_4 instanceof RuntimeException)) {
                        throw new RuntimeException(v0_4);
                    } else {
                        throw ((RuntimeException) v0_4);
                    }
                }
            }
            return ((Boolean) j5.t1.b.invoke(0, new Object[] {Long.valueOf(j5.t1.a)}))).booleanValue();
        } else {
            return e2.a.a();
        }
    }

    public static boolean J(android.content.Context p1)
    {
        if (p1.getResources().getConfiguration().fontScale < 1067869798) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean K(String p1, String p2)
    {
        if ((!p1.startsWith(p2.concat("("))) || (!p1.endsWith(")"))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int L(int p1, int p2, float p3)
    {
        return h0.a.e(h0.a.h(p2, Math.round((((float) android.graphics.Color.alpha(p2)) * p3))), p1);
    }

    public static int M(android.content.Context p4, int p5)
    {
        int v4_1 = e0.c.getDrawable(p4, p5);
        if (v4_1 != 0) {
            int[] v0_1 = v4_1.getIntrinsicWidth();
            int v1_1 = v4_1.getIntrinsicHeight();
            android.graphics.Bitmap v2_0 = android.graphics.Bitmap.createBitmap(v0_1, v1_1, android.graphics.Bitmap$Config.ARGB_8888);
            int v3_1 = new android.graphics.Canvas(v2_0);
            v4_1.setBounds(0, 0, v0_1, v1_1);
            v4_1.draw(v3_1);
            int[] v0_0 = new int[1];
            android.opengl.GLES20.glGenTextures(1, v0_0, 0);
            android.opengl.GLES20.glBindTexture(3553, v0_0[0]);
            android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(3553, 10240, 9729);
            android.opengl.GLUtils.texImage2D(3553, 0, v2_0, 0);
            v2_0.recycle();
            return v0_0[0];
        } else {
            return 0;
        }
    }

    public static java.nio.MappedByteBuffer N(android.content.Context p8, android.net.Uri p9)
    {
        try {
            Throwable v8_3 = p8.getContentResolver().openFileDescriptor(p9, "r", 0);
        } catch (java.io.IOException) {
            return 0;
        }
        if (v8_3 != null) {
            try {
                Throwable v9_1 = new java.io.FileInputStream(v8_3.getFileDescriptor());
                try {
                    Throwable v2_0 = v9_1.getChannel();
                    Throwable v0_0 = v2_0.map(java.nio.channels.FileChannel$MapMode.READ_ONLY, 0, v2_0.size());
                } catch (Throwable v0_1) {
                    Throwable v2_1 = v0_1;
                    try {
                        v9_1.close();
                    } catch (Throwable v0_2) {
                        v2_1.addSuppressed(v0_2);
                    }
                    throw v2_1;
                }
                v9_1.close();
                v8_3.close();
                return v0_0;
            } catch (Throwable v0_3) {
                Throwable v9_3 = v0_3;
                try {
                    v8_3.close();
                } catch (Throwable v0_5) {
                    v9_3.addSuppressed(v0_5);
                }
                throw v9_3;
            }
        } else {
            if (v8_3 == null) {
                return 0;
            } else {
                v8_3.close();
                return 0;
            }
        }
    }

    public static final void O(Object[] p1, int p2, int p3)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        while (p2 < p3) {
            p1[p2] = 0;
            p2++;
        }
        return;
    }

    public static int P(android.content.Context p1, int p2, int p3)
    {
        int v1_1 = c4.b.T(p1, p2);
        if ((v1_1 == 0) || (v1_1.type != 16)) {
            return p3;
        } else {
            return v1_1.data;
        }
    }

    public static android.animation.TimeInterpolator Q(android.content.Context p5, int p6, android.animation.TimeInterpolator p7)
    {
        String v0_1 = new android.util.TypedValue();
        if (p5.getTheme().resolveAttribute(p6, v0_1, 1)) {
            if (v0_1.type != 3) {
                throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            } else {
                RuntimeException v6_3 = String.valueOf(v0_1.string);
                if ((!j5.t1.K(v6_3, "cubic-bezier")) && (!j5.t1.K(v6_3, "path"))) {
                    return android.view.animation.AnimationUtils.loadInterpolator(p5, v0_1.resourceId);
                } else {
                    if (!j5.t1.K(v6_3, "cubic-bezier")) {
                        if (!j5.t1.K(v6_3, "path")) {
                            throw new IllegalArgumentException("Invalid motion easing type: ".concat(v6_3));
                        } else {
                            String v5_10 = v6_3.substring(5, (v6_3.length() - 1));
                            RuntimeException v7_4 = new android.graphics.Path();
                            try {
                                h0.d.b(a.a.m(v5_10), v7_4);
                                return new android.view.animation.PathInterpolator(v7_4);
                            } catch (RuntimeException v6_8) {
                                throw new RuntimeException("Error in parsing ".concat(v5_10), v6_8);
                            }
                        }
                    } else {
                        String v5_15 = v6_3.substring(13, (v6_3.length() - 1)).split(",");
                        if (v5_15.length != 4) {
                            RuntimeException v7_8 = new StringBuilder("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                            v7_8.append(v5_15.length);
                            throw new IllegalArgumentException(v7_8.toString());
                        } else {
                            return new android.view.animation.PathInterpolator(j5.t1.C(v5_15, 0), j5.t1.C(v5_15, 1), j5.t1.C(v5_15, 2), j5.t1.C(v5_15, 3));
                        }
                    }
                }
            }
        } else {
            return p7;
        }
    }

    public static void R(android.view.Window p2, boolean p3)
    {
        int v0_0 = android.os.Build$VERSION.SDK_INT;
        if (v0_0 < 35) {
            if (v0_0 < 30) {
                int v3_1;
                android.view.View v2_1 = p2.getDecorView();
                int v0_1 = v2_1.getSystemUiVisibility();
                if (p3 == 0) {
                    v3_1 = (v0_1 | 1792);
                } else {
                    v3_1 = (v0_1 & -1793);
                }
                v2_1.setSystemUiVisibility(v3_1);
                return;
            } else {
                e0.b.g(p2, p3);
                return;
            }
        } else {
            e0.b.h(p2, p3);
            return;
        }
    }

    public static final long U(int p2, c8.c p3)
    {
        kotlin.jvm.internal.j.e(p3, "unit");
        if (p3.compareTo(c8.c.d) > 0) {
            return j5.t1.V(((long) p2), p3);
        } else {
            return j5.t1.p(q4.b.h(((long) p2), p3, c8.c.b));
        }
    }

    public static final long V(long p5, c8.c p7)
    {
        kotlin.jvm.internal.j.e(p7, "unit");
        long v0_4 = c8.c.b;
        String v1_2 = q4.b.h(4611686018426999999, v0_4, p7);
        if (((- v1_2) > p5) || (p5 > v1_2)) {
            long v0_1 = c8.c.c;
            kotlin.jvm.internal.j.e(v0_1, "targetUnit");
            long v5_1 = v0_1.a.convert(p5, p7.a);
            long v0_3 = -4611686018427387903;
            if (v5_1 >= -4611686018427387903) {
                v0_3 = 4611686018427387903;
                if (v5_1 > 4611686018427387903) {
                    v5_1 = v0_3;
                }
            }
            return j5.t1.o(v5_1);
        } else {
            return j5.t1.p(q4.b.h(p5, p7, v0_4));
        }
    }

    public static final String a(Object[] p3, int p4, int p5, i7.e p6)
    {
        StringBuilder v0_1 = new StringBuilder(((p5 * 3) + 2));
        v0_1.append("[");
        int v1_2 = 0;
        while (v1_2 < p5) {
            if (v1_2 > 0) {
                v0_1.append(", ");
            }
            String v2_2 = p3[(p4 + v1_2)];
            if (v2_2 != p6) {
                v0_1.append(v2_2);
            } else {
                v0_1.append("(this Collection)");
            }
            v1_2++;
        }
        v0_1.append("]");
        String v3_1 = v0_1.toString();
        kotlin.jvm.internal.j.d(v3_1, "toString(...)");
        return v3_1;
    }

    public static final Object b(com.google.android.gms.tasks.Task p2, r6.v p3)
    {
        if (!p2.isComplete()) {
            StringBuilder v0_4 = new d8.n(1, q4.b.C(p3));
            v0_4.r();
            p2.addOnCompleteListener(n8.a.a, new n8.b(v0_4, 0));
            return v0_4.q();
        } else {
            java.util.concurrent.CancellationException v3_2 = p2.getException();
            if (v3_2 != null) {
                throw v3_2;
            } else {
                if (p2.isCanceled()) {
                    StringBuilder v0_2 = new StringBuilder("Task ");
                    v0_2.append(p2);
                    v0_2.append(" was cancelled normally.");
                    throw new java.util.concurrent.CancellationException(v0_2.toString());
                } else {
                    return p2.getResult();
                }
            }
        }
    }

    public static void c(String p2)
    {
        if (p2.length() > 127) {
            p2 = p2.substring(0, 127);
        }
        android.os.Trace.beginSection(p2);
        return;
    }

    public static void d(int p2, Object[] p3)
    {
        int v0 = 0;
        while (v0 < p2) {
            if (p3[v0] == null) {
                throw new NullPointerException(g2.g.c(v0, "at index "));
            } else {
                v0++;
            }
        }
        return;
    }

    public static void e(int p3, int p4, int p5)
    {
        if ((p3 < null) || (p4 > p5)) {
            StringBuilder v2_1 = new StringBuilder("fromIndex: ");
            v2_1.append(p3);
            v2_1.append(", toIndex: ");
            v2_1.append(p4);
            v2_1.append(", size: ");
            v2_1.append(p5);
            throw new IndexOutOfBoundsException(v2_1.toString());
        } else {
            if (p3 > p4) {
                throw new IllegalArgumentException(v1.a.i("fromIndex: ", p3, p4, " > toIndex: "));
            } else {
                return;
            }
        }
    }

    public static final void f(java.io.Closeable p0, Throwable p1)
    {
        if (p0 != null) {
            if (p1 != null) {
                try {
                    p0.close();
                    return;
                } catch (Throwable v0_1) {
                    q4.b.a(p1, v0_1);
                }
            } else {
                p0.close();
                return;
            }
        }
        return;
    }

    public static void g(java.io.Closeable p0)
    {
        try {
            if (p0 != null) {
                p0.close();
            }
        } catch (java.io.IOException) {
        }
        return;
    }

    public static boolean h(java.io.File p0, android.content.res.Resources p1, int p2)
    {
        try {
            int v1_1 = p1.openRawResource(p2);
            try {
                Throwable v0_2 = j5.t1.i(p0, v1_1);
                j5.t1.g(v1_1);
                return v0_2;
            } catch (Throwable v0_1) {
                j5.t1.g(v1_1);
                throw v0_1;
            }
        } catch (Throwable v0_1) {
            v1_1 = 0;
        }
        v0_2 = j5.t1.i(p0, v1_1);
        j5.t1.g(v1_1);
        return v0_2;
    }

    public static boolean i(java.io.File p5, java.io.InputStream p6)
    {
        android.os.StrictMode$ThreadPolicy v0 = android.os.StrictMode.allowThreadDiskWrites();
        int v2_1 = 0;
        try {
            StringBuilder v3_3 = new java.io.FileOutputStream(p5, 0);
            try {
                int v5_7 = new byte[1024];
            } catch (int v5_2) {
                v2_1 = v3_3;
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("Error copying resource contents to temp file: ");
                v3_1.append(v5_2.getMessage());
                android.util.Log.e("TypefaceCompatUtil", v3_1.toString());
                j5.t1.g(v2_1);
                android.os.StrictMode.setThreadPolicy(v0);
                return 0;
            } catch (int v5_1) {
                v2_1 = v3_3;
                j5.t1.g(v2_1);
                android.os.StrictMode.setThreadPolicy(v0);
                throw v5_1;
            }
            while(true) {
                int v2_0 = p6.read(v5_7);
                if (v2_0 == -1) {
                    break;
                }
                v3_3.write(v5_7, 0, v2_0);
            }
            j5.t1.g(v3_3);
            android.os.StrictMode.setThreadPolicy(v0);
            return 1;
        } catch (int v5_2) {
            v3_1 = new StringBuilder();
            v3_1.append("Error copying resource contents to temp file: ");
            v3_1.append(v5_2.getMessage());
            android.util.Log.e("TypefaceCompatUtil", v3_1.toString());
            j5.t1.g(v2_1);
            android.os.StrictMode.setThreadPolicy(v0);
            return 0;
        } catch (int v5_1) {
        }
    }

    public static a5.c j(String p2, String p3)
    {
        l6.a v0_1 = new l6.a(p2, p3);
        a5.c v2_3 = a5.c.b(l6.a);
        v2_3.e = 1;
        v2_3.f = new a5.a(v0_1, 0);
        return v2_3.b();
    }

    public static g1.q k(android.content.Context p8)
    {
        java.util.List v0_3;
        if (android.os.Build$VERSION.SDK_INT < 28) {
            v0_3 = new v3.f();
        } else {
            v0_3 = new g1.c();
        }
        n0.d v1_6 = p8.getPackageManager();
        p0.e.d(v1_6, "Package manager required to locate emoji font provider");
        String v3_1 = 0;
        String v2_3 = v1_6.queryIntentContentProviders(new android.content.Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        do {
            String v4_1;
            g1.q v5_0 = 0;
            if (!v2_3.hasNext()) {
                v4_1 = 0;
                break;
            } else {
                v4_1 = ((android.content.pm.ResolveInfo) v2_3.next()).providerInfo;
                if (v4_1 != null) {
                    int v6_0 = v4_1.applicationInfo;
                }
            }
        } while((v6_0 == 0) || ((v6_0.flags & 1) != 1));
        n0.d v1_4;
        if (v4_1 != null) {
            try {
                String v2_4 = v4_1.authority;
                String v4_4 = v4_1.packageName;
                java.util.List v0_2 = v0_3.l(v1_6, v4_4);
                n0.d v1_2 = new java.util.ArrayList();
                int v6_3 = v0_2.length;
            } catch (java.util.List v0_6) {
                android.util.Log.wtf("emoji2.text.DefaultEmojiConfig", v0_6);
                v1_4 = 0;
            }
            while (v3_1 < v6_3) {
                v1_2.add(v0_2[v3_1].toByteArray());
                v3_1++;
            }
            v1_4 = new n0.d(v2_4, v4_4, "emojicompat-emoji-font", java.util.Collections.singletonList(v1_2));
        }
        if (v1_4 != null) {
            v5_0 = new g1.q(new g1.p(p8, v1_4));
        }
        return v5_0;
    }

    public static androidx.lifecycle.v0 l(Class p4)
    {
        try {
            RuntimeException v2_4 = p4.getDeclaredConstructor(0);
        } catch (IllegalAccessException v1_7) {
            StringBuilder v3_1 = new StringBuilder("Cannot create an instance of ");
            v3_1.append(p4);
            throw new RuntimeException(v3_1.toString(), v1_7);
        }
        if (!reflect.Modifier.isPublic(v2_4.getModifiers())) {
            RuntimeException v2_3 = new StringBuilder("Cannot create an instance of ");
            v2_3.append(p4);
            throw new RuntimeException(v2_3.toString());
        } else {
            try {
                IllegalAccessException v1_3 = v2_4.newInstance(0);
                kotlin.jvm.internal.j.b(v1_3);
                return ((androidx.lifecycle.v0) v1_3);
            } catch (IllegalAccessException v1_6) {
                StringBuilder v3_5 = new StringBuilder("Cannot create an instance of ");
                v3_5.append(p4);
                throw new RuntimeException(v3_5.toString(), v1_6);
            } catch (IllegalAccessException v1_5) {
                StringBuilder v3_3 = new StringBuilder("Cannot create an instance of ");
                v3_3.append(p4);
                throw new RuntimeException(v3_3.toString(), v1_5);
            }
        }
    }

    public static android.graphics.Bitmap m(android.content.Context p0, int p1)
    {
        if (p1 != 0) {
            return android.graphics.BitmapFactory.decodeResource(p0.getResources(), p1);
        } else {
            return 0;
        }
    }

    public static void n(java.util.ArrayList p12)
    {
        a5.n v0_8 = new java.util.HashMap(p12.size());
        a5.c v1_10 = p12.size();
        boolean v2_1 = 0;
        a5.k v3_6 = 0;
        while (v3_6 < v1_10) {
            a5.k v5_4 = p12.get(v3_6);
            v3_6++;
            a5.k v5_5 = ((a5.c) v5_4);
            boolean v6_4 = new a5.k(v5_5);
            java.util.Iterator v7_9 = v5_5.b.iterator();
            while (v7_9.hasNext()) {
                int v10_2;
                java.util.HashSet v8_9 = ((a5.x) v7_9.next());
                if (v5_5.e != 0) {
                    v10_2 = 0;
                } else {
                    v10_2 = 1;
                }
                java.util.HashSet v9_3 = new a5.l(v8_9, (v10_2 ^ 1));
                if (!v0_8.containsKey(v9_3)) {
                    v0_8.put(v9_3, new java.util.HashSet());
                }
                java.util.HashSet v9_5 = ((java.util.Set) v0_8.get(v9_3));
                if ((!v9_5.isEmpty()) && (v10_2 != 0)) {
                    a5.n v0_2 = new StringBuilder("Multiple components provide ");
                    v0_2.append(v8_9);
                    v0_2.append(".");
                    throw new IllegalArgumentException(v0_2.toString());
                } else {
                    v9_5.add(v6_4);
                }
            }
        }
        a5.c v1_1 = v0_8.values().iterator();
        while (v1_1.hasNext()) {
            a5.k v3_4 = ((java.util.Set) v1_1.next()).iterator();
            while (v3_4.hasNext()) {
                a5.k v5_3 = ((a5.k) v3_4.next());
                boolean v6_2 = v5_3.a.c.iterator();
                while (v6_2.hasNext()) {
                    java.util.Iterator v7_2 = ((a5.m) v6_2.next());
                    if (v7_2.c == 0) {
                        java.util.Iterator v7_4;
                        if (v7_2.b != 2) {
                            v7_4 = 0;
                        } else {
                            v7_4 = 1;
                        }
                        java.util.Iterator v7_6 = ((java.util.Set) v0_8.get(new a5.l(v7_2.a, v7_4)));
                        if (v7_6 != null) {
                            java.util.Iterator v7_7 = v7_6.iterator();
                            while (v7_7.hasNext()) {
                                java.util.HashSet v8_5 = ((a5.k) v7_7.next());
                                v5_3.b.add(v8_5);
                                v8_5.c.add(v5_3);
                            }
                        }
                    }
                }
            }
        }
        a5.c v1_3 = new java.util.HashSet();
        a5.n v0_5 = v0_8.values().iterator();
        while (v0_5.hasNext()) {
            v1_3.addAll(((java.util.Set) v0_5.next()));
        }
        a5.n v0_7 = new java.util.HashSet();
        a5.k v3_8 = v1_3.iterator();
        while (v3_8.hasNext()) {
            java.util.Iterator v4_5 = ((a5.k) v3_8.next());
            if (v4_5.c.isEmpty()) {
                v0_7.add(v4_5);
            }
        }
        while (!v0_7.isEmpty()) {
            a5.k v3_12 = ((a5.k) v0_7.iterator().next());
            v0_7.remove(v3_12);
            v2_1++;
            java.util.Iterator v4_3 = v3_12.b.iterator();
            while (v4_3.hasNext()) {
                a5.k v5_8 = ((a5.k) v4_3.next());
                v5_8.c.remove(v3_12);
                if (v5_8.c.isEmpty()) {
                    v0_7.add(v5_8);
                }
            }
        }
        if (v2_1 != p12.size()) {
            String v12_5 = new java.util.ArrayList();
            a5.n v0_9 = v1_3.iterator();
            while (v0_9.hasNext()) {
                a5.c v1_12 = ((a5.k) v0_9.next());
                if ((!v1_12.c.isEmpty()) && (!v1_12.b.isEmpty())) {
                    v12_5.add(v1_12.a);
                }
            }
            a5.c v1_9 = new StringBuilder("Dependency cycle detected: ");
            v1_9.append(java.util.Arrays.toString(v12_5.toArray()));
            throw new a5.n(v1_9.toString());
        } else {
            return;
        }
    }

    public static final long o(long p2)
    {
        int v0 = c8.b.a;
        return ((p2 << 1) + 1);
    }

    public static final long p(long p1)
    {
        int v0 = c8.b.a;
        return (p1 << 1);
    }

    public static String q(androidx.datastore.preferences.protobuf.g p5)
    {
        StringBuilder v0_1 = new StringBuilder(p5.size());
        int v1_1 = 0;
        while (v1_1 < p5.size()) {
            char v2_0 = p5.a(v1_1);
            if (v2_0 == 34) {
                v0_1.append("\\\"");
            } else {
                if (v2_0 == 39) {
                    v0_1.append("\\\'");
                } else {
                    if (v2_0 == 92) {
                        v0_1.append("\\\\");
                    } else {
                        switch (v2_0) {
                            case 7:
                                v0_1.append("\\a");
                                break;
                            case 8:
                                v0_1.append("\\b");
                                break;
                            case 9:
                                v0_1.append("\\t");
                                break;
                            case 10:
                                v0_1.append("\\n");
                                break;
                            case 11:
                                v0_1.append("\\v");
                                break;
                            case 12:
                                v0_1.append("\\f");
                                break;
                            case 13:
                                v0_1.append("\\r");
                                break;
                            default:
                                if (v2_0 < 32) {
                                    v0_1.append(92);
                                    v0_1.append(((char) (((v2_0 >> 6) & 3) + 48)));
                                    v0_1.append(((char) (((v2_0 >> 3) & 7) + 48)));
                                    v0_1.append(((char) ((v2_0 & 7) + 48)));
                                } else {
                                    if (v2_0 > 126) {
                                    } else {
                                        v0_1.append(((char) v2_0));
                                    }
                                }
                        }
                    }
                }
            }
            v1_1++;
        }
        return v0_1.toString();
    }

    public static a5.c r(String p3, l4.h p4)
    {
        a5.b v0_1 = a5.c.b(l6.a);
        v0_1.e = 1;
        v0_1.a(a5.m.c(android.content.Context));
        v0_1.f = new a5.u(4, p3, p4);
        return v0_1.b();
    }

    public static final z7.c s(q8.d p1)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        if (!(p1 instanceof s8.o)) {
            return 0;
        } else {
            return j5.t1.s(((s8.o) p1).a);
        }
    }

    public static int t(android.content.Context p1, int p2, int p3)
    {
        int v1_1;
        android.util.TypedValue v2_1 = c4.b.T(p1, p2);
        if (v2_1 == null) {
            v1_1 = 0;
        } else {
            int v1_3;
            int v0 = v2_1.resourceId;
            if (v0 == 0) {
                v1_3 = v2_1.data;
            } else {
                v1_3 = e0.c.getColor(p1, v0);
            }
            v1_1 = Integer.valueOf(v1_3);
        }
        if (v1_1 == 0) {
            return p3;
        } else {
            return v1_1.intValue();
        }
    }

    public static int u(android.view.View p2, int p3)
    {
        android.content.Context v0 = p2.getContext();
        int v2_5 = c4.b.W(p2.getContext(), p3, p2.getClass().getCanonicalName());
        int v3_1 = v2_5.resourceId;
        if (v3_1 == 0) {
            return v2_5.data;
        } else {
            return e0.c.getColor(v0, v3_1);
        }
    }

    public static android.content.res.ColorStateList v(android.content.Context p1, android.content.res.TypedArray p2, int p3)
    {
        if (p2.hasValue(p3)) {
            int v0_2 = p2.getResourceId(p3, 0);
            if (v0_2 != 0) {
                android.content.res.ColorStateList v1_2 = e0.c.getColorStateList(p1, v0_2);
                if (v1_2 != null) {
                    return v1_2;
                }
            }
        }
        return p2.getColorStateList(p3);
    }

    public static android.content.res.ColorStateList w(android.content.Context p2, b8.g p3, int p4)
    {
        int v0_1 = ((android.content.res.TypedArray) p3.c);
        if (v0_1.hasValue(p4)) {
            int v0_2 = v0_1.getResourceId(p4, 0);
            if (v0_2 != 0) {
                android.content.res.ColorStateList v2_1 = e0.c.getColorStateList(p2, v0_2);
                if (v2_1 != null) {
                    return v2_1;
                }
            }
        }
        return p3.h(p4);
    }

    public static String y()
    {
        java.util.Locale v1_2;
        if (android.os.Build$VERSION.SDK_INT < 33) {
            v1_2 = h.p.c;
            if (v1_2 == null) {
                v1_2 = m0.h.b;
            }
        } else {
            String v0_9 = h.p.c();
            if (v0_9 == null) {
            } else {
                v1_2 = new m0.h(new m0.i(h.m.a(v0_9)));
            }
        }
        String v0_4;
        if (v1_2.b()) {
            v0_4 = java.util.Locale.getDefault().toLanguageTag();
        } else {
            String v0_7 = v1_2.a.a.get(0);
            java.util.Objects.requireNonNull(v0_7);
            v0_4 = v0_7.toLanguageTag();
        }
        return v0_4.toLowerCase(java.util.Locale.ROOT);
    }

    public static android.content.SharedPreferences z(android.content.Context p2)
    {
        String v0_1 = new StringBuilder();
        v0_1.append(p2.getPackageName());
        v0_1.append("_preferences");
        return p2.getSharedPreferences(v0_1.toString(), 0);
    }

    public float G(android.view.View p2)
    {
        if (j5.t1.c) {
            try {
                p2 = f2.b0.e(p2);
                return p2;
            } catch (NoSuchMethodError) {
                j5.t1.c = 0;
            }
        }
        return p2.getAlpha();
    }

    public void S(android.view.View p2, float p3)
    {
        if (j5.t1.c) {
            try {
                f2.b0.k(p2, p3);
                return;
            } catch (NoSuchMethodError) {
                j5.t1.c = 0;
            }
        }
        p2.setAlpha(p3);
        return;
    }

    public void T(android.view.View p4, int p5)
    {
        if (!j5.t1.e) {
            try {
                String v1_2 = android.view.View.getDeclaredField("mViewFlags");
                j5.t1.d = v1_2;
                v1_2.setAccessible(1);
            } catch (NoSuchFieldException) {
                android.util.Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            j5.t1.e = 1;
        }
        int v0_1 = j5.t1.d;
        try {
            if (v0_1 != 0) {
                j5.t1.d.setInt(p4, (p5 | (v0_1.getInt(p4) & -13)));
            }
        } catch (IllegalAccessException) {
        }
        return;
    }

    public abstract void x();
}
