package h0;
public class f extends c4.b {
    public static Class j = None;
    public static reflect.Constructor k = None;
    public static reflect.Method l = None;
    public static reflect.Method m = None;
    public static boolean n = False;
    public final Class c;
    public final reflect.Constructor d;
    public final reflect.Method e;
    public final reflect.Method f;
    public final reflect.Method g;
    public final reflect.Method h;
    public final reflect.Method i;

    public f()
    {
        try {
            Class v1_3 = Class.forName("android.graphics.FontFamily");
            Class v2_3 = v1_3.getConstructor(0);
            Class v3_2 = h0.f.p0(v1_3);
            Class v4_0 = v1_3.getMethod("addFontFromBuffer", new Class[] {java.nio.ByteBuffer, Integer.TYPE, android.graphics.fonts.FontVariationAxis[], Integer.TYPE, Integer.TYPE}));
            Class v5_3 = v1_3.getMethod("freeze", 0);
            Class v6_2 = v1_3.getMethod("abortCreation", 0);
            Class v1_1 = this.q0(v1_3);
            Class v0_2 = v1_3;
        } catch (Class v1_2) {
            android.util.Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(v1_2.getClass().getName()), v1_2);
            v1_1 = v0_2;
            v2_3 = v1_1;
            v3_2 = v2_3;
            v4_0 = v3_2;
            v5_3 = v4_0;
            v6_2 = v5_3;
        } catch (Class v1_2) {
        }
        this.c = v0_2;
        this.d = v2_3;
        this.e = v3_2;
        this.f = v4_0;
        this.g = v5_3;
        this.h = v6_2;
        this.i = v1_1;
        return;
    }

    public static boolean l0(Object p1, String p2, int p3, boolean p4)
    {
        h0.f.o0();
        try {
            return ((Boolean) h0.f.l.invoke(p1, new Object[] {p2, Integer.valueOf(p3), Boolean.valueOf(p4)}))).booleanValue();
        } catch (IllegalAccessException v1_3) {
            throw new RuntimeException(v1_3);
        }
    }

    public static void o0()
    {
        if (!h0.f.n) {
            h0.f.n = 1;
            try {
                reflect.Constructor v2_2 = Class.forName("android.graphics.FontFamily");
                String v3_1 = v2_2.getConstructor(0);
                reflect.Constructor v4_1 = v2_2.getMethod("addFontWeightStyle", new Class[] {String, Integer.TYPE, Boolean.TYPE}));
                reflect.Constructor v0_5 = android.graphics.Typeface.getMethod("createFromFamiliesWithDefault", new Class[] {reflect.Array.newInstance(v2_2, 1).getClass()}));
                reflect.Constructor v1_1 = v3_1;
            } catch (reflect.Constructor v0_6) {
                android.util.Log.e("TypefaceCompatApi21Impl", v0_6.getClass().getName(), v0_6);
                v0_5 = v1_1;
                v2_2 = v0_5;
                v4_1 = v2_2;
            } catch (reflect.Constructor v0_6) {
            }
            h0.f.k = v1_1;
            h0.f.j = v2_2;
            h0.f.l = v4_1;
            h0.f.m = v0_5;
            return;
        } else {
            return;
        }
    }

    public static reflect.Method p0(Class p8)
    {
        Class v5 = Integer.TYPE;
        return p8.getMethod("addFontFromAssetManager", new Class[] {android.content.res.AssetManager, android.graphics.fonts.FontVariationAxis[]}));
    }

    public final boolean k0(android.content.Context p11, Object p12, String p13, int p14, int p15, int p16, android.graphics.fonts.FontVariationAxis[] p17)
    {
        try {
            reflect.Method v1 = this.e;
            android.content.res.AssetManager v2 = p11.getAssets();
            Integer.valueOf(0);
            Boolean v5 = Boolean.FALSE;
            Integer.valueOf(p14);
            Integer.valueOf(p15);
            Integer.valueOf(p16);
            String v3 = p13;
            return ((Boolean) v1.invoke(p12, new Object[] {v2, p17}))).booleanValue();
        } catch (reflect.InvocationTargetException) {
            return 0;
        }
    }

    public android.graphics.Typeface m0(Object p5)
    {
        Object[] v0_2 = Integer.valueOf(-1);
        try {
            Object v2_1 = reflect.Array.newInstance(this.c, 1);
            reflect.Array.set(v2_1, 0, p5);
            return ((android.graphics.Typeface) this.i.invoke(0, new Object[] {v2_1, v0_2, v0_2})));
        } catch (reflect.InvocationTargetException) {
            return 0;
        }
    }

    public final boolean n0(Object p3)
    {
        try {
            return ((Boolean) this.g.invoke(p3, 0)).booleanValue();
        } catch (reflect.InvocationTargetException) {
            return 0;
        }
    }

    public reflect.Method q0(Class p4)
    {
        reflect.Method v4_1 = android.graphics.Typeface.getDeclaredMethod("createFromFamiliesWithDefault", new Class[] {reflect.Array.newInstance(p4, 1).getClass(), Integer.TYPE, Integer.TYPE}));
        v4_1.setAccessible(1);
        return v4_1;
    }

    public final android.graphics.Typeface r(android.content.Context p10, g0.f p11, android.content.res.Resources p12, int p13)
    {
        android.graphics.Typeface v13_0 = this.e;
        if (v13_0 == null) {
            android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (v13_0 == null) {
            h0.f.o0();
            try {
                android.graphics.Typeface v13_1 = 0;
                int v10_2 = h0.f.k.newInstance(0);
                RuntimeException v11_1 = p11.a;
                int v0_0 = v11_1.length;
                int v4_0 = 0;
            } catch (int v0_1) {
                throw new RuntimeException(v0_1);
            } catch (int v0_1) {
            } catch (int v0_1) {
            }
            while (v4_0 < v0_0) {
                boolean v5_0 = v11_1[v4_0];
                int v6_0 = j5.t1.F(p10);
                if (v6_0 != 0) {
                    try {
                        if ((j5.t1.h(v6_0, p12, v5_0.f)) && (h0.f.l0(v10_2, v6_0.getPath(), v5_0.b, v5_0.c))) {
                            v6_0.delete();
                            v4_0++;
                        } else {
                            v6_0.delete();
                        }
                    } catch (RuntimeException) {
                    } catch (int v0_4) {
                        int v10_7 = v0_4;
                        v6_0.delete();
                        throw v10_7;
                    }
                }
                return v13_1;
            }
            h0.f.o0();
            try {
                RuntimeException v11_5 = reflect.Array.newInstance(h0.f.j, 1);
                reflect.Array.set(v11_5, 0, v10_2);
                v13_1 = ((android.graphics.Typeface) h0.f.m.invoke(0, new Object[] {v11_5})));
            } catch (int v0_3) {
                throw new RuntimeException(v0_3);
            } catch (int v0_3) {
            }
            return v13_1;
        } else {
            try {
                int v3_1 = this.d.newInstance(0);
                try {
                    if (v3_1 != 0) {
                        RuntimeException v11_9 = p11.a;
                        int v0_5 = 0;
                        while (v0_5 < v11_9.length) {
                            h0.f v1_1 = v11_9[v0_5];
                            if (this.k0(p10, v3_1, v1_1.a, v1_1.e, v1_1.b, v1_1.c, android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(v1_1.d))) {
                                v0_5++;
                            } else {
                                this.h.invoke(v3_1, 0);
                            }
                        }
                        if (this.n0(v3_1)) {
                            return this.m0(v3_1);
                        }
                    }
                } catch (reflect.InvocationTargetException) {
                }
                return 0;
            } catch (reflect.InvocationTargetException) {
                v3_1 = 0;
            }
        }
    }

    public final android.graphics.Typeface s(android.content.Context p13, n0.i[] p14, int p15)
    {
        try {
            if (p14.length >= 1) {
                int v0_4 = this.e;
                if (v0_4 == 0) {
                    android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
                }
                if (v0_4 == 0) {
                    Throwable v14_1 = this.z(p14, p15);
                    android.graphics.Typeface v13_2 = p13.getContentResolver().openFileDescriptor(v14_1.a, "r", 0);
                    if (v13_2 != null) {
                        try {
                            Throwable v14_4 = new android.graphics.Typeface$Builder(v13_2.getFileDescriptor()).setWeight(v14_1.c).setItalic(v14_1.d).build();
                        } catch (Throwable v14_5) {
                            try {
                                v13_2.close();
                            } catch (android.graphics.Typeface v13_3) {
                                v14_5.addSuppressed(v13_3);
                            }
                            throw v14_5;
                        }
                        v13_2.close();
                        return v14_4;
                    } else {
                        if (v13_2 != null) {
                            v13_2.close();
                            return 0;
                        }
                    }
                } else {
                    int v0_6 = new java.util.HashMap();
                    int v3_0 = p14.length;
                    int v5_0 = 0;
                    while (v5_0 < v3_0) {
                        int v6_8 = p14[v5_0];
                        if (v6_8.e == 0) {
                            int v6_0 = v6_8.a;
                            if (!v0_6.containsKey(v6_0)) {
                                v0_6.put(v6_0, j5.t1.N(p13, v6_0));
                            }
                        }
                        v5_0++;
                    }
                    android.graphics.Typeface v13_4 = java.util.Collections.unmodifiableMap(v0_6);
                    try {
                        int v0_8 = this.d.newInstance(0);
                    } catch (reflect.InvocationTargetException) {
                        v0_8 = 0;
                    }
                    if (v0_8 != 0) {
                        int v3_1 = p14.length;
                        int v5_1 = 0;
                        int v6_1 = 0;
                        while(true) {
                            reflect.Method v7_2 = this.h;
                            if (v5_1 >= v3_1) {
                                if (v6_1 != 0) {
                                    if (this.n0(v0_8)) {
                                        android.graphics.Typeface v13_6 = this.m0(v0_8);
                                        if (v13_6 != null) {
                                            return android.graphics.Typeface.create(v13_6, p15);
                                        }
                                    }
                                } else {
                                    v7_2.invoke(v0_8, 0);
                                }
                            } else {
                                Integer v8_0 = p14[v5_1];
                                java.nio.ByteBuffer v9_2 = ((java.nio.ByteBuffer) v13_4.get(v8_0.a));
                                if (v9_2 != null) {
                                    try {
                                        int v6_7 = ((Boolean) this.f.invoke(v0_8, new Object[] {v9_2, Integer.valueOf(v8_0.b), 0, Integer.valueOf(v8_0.c), Integer.valueOf(v8_0.d)}))).booleanValue();
                                    } catch (reflect.InvocationTargetException) {
                                        v6_7 = 0;
                                    }
                                    if (v6_7 == 0) {
                                        break;
                                    }
                                    v6_1 = 1;
                                }
                                v5_1++;
                            }
                        }
                        v7_2.invoke(v0_8, 0);
                    }
                }
            }
        } catch (reflect.InvocationTargetException) {
        }
        return 0;
    }

    public final android.graphics.Typeface u(android.content.Context p10, android.content.res.Resources p11, int p12, String p13, int p14)
    {
        h0.f v0_0 = this.e;
        if (v0_0 == null) {
            android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (v0_0 == null) {
            return super.u(p10, p11, p12, p13, p14);
        } else {
            try {
                int v2_0 = this.d.newInstance(0);
                try {
                    if (v2_0 != 0) {
                        if (this.k0(p10, v2_0, p13, 0, -1, -1, 0)) {
                            if (this.n0(v2_0)) {
                                return this.m0(v2_0);
                            }
                        } else {
                            this.h.invoke(v2_0, 0);
                        }
                    }
                } catch (reflect.InvocationTargetException) {
                }
                return 0;
            } catch (reflect.InvocationTargetException) {
                v2_0 = 0;
            }
        }
    }
}
