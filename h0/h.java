package h0;
public final class h extends c4.b {

    public static android.graphics.fonts.Font k0(android.graphics.fonts.FontFamily p5, int p6)
    {
        int v1_3;
        if ((p6 & 1) == 0) {
            v1_3 = 400;
        } else {
            v1_3 = 700;
        }
        android.graphics.fonts.Font v6_1;
        int v3 = 1;
        if ((p6 & 2) == 0) {
            v6_1 = 0;
        } else {
            v6_1 = 1;
        }
        android.graphics.fonts.FontStyle v0_1 = new android.graphics.fonts.FontStyle(v1_3, v6_1);
        android.graphics.fonts.Font v6_2 = p5.getFont(0);
        int v1_2 = h0.h.m0(v0_1, v6_2.getStyle());
        while (v3 < p5.getSize()) {
            android.graphics.fonts.Font v2_1 = p5.getFont(v3);
            int v4_1 = h0.h.m0(v0_1, v2_1.getStyle());
            if (v4_1 < v1_2) {
                v6_2 = v2_1;
                v1_2 = v4_1;
            }
            v3++;
        }
        return v6_2;
    }

    public static android.graphics.fonts.FontFamily l0(n0.i[] p8, android.content.ContentResolver p9)
    {
        int v0 = p8.length;
        int v2 = 0;
        android.graphics.fonts.FontFamily$Builder v3 = 0;
        while (v2 < v0) {
            Throwable v4_0 = p8[v2];
            try {
                Throwable v5_1 = p9.openFileDescriptor(v4_0.a, "r", 0);
            } catch (Throwable v4_5) {
                android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", v4_5);
                v2++;
            }
            if (v5_1 != null) {
                Throwable v4_3 = new android.graphics.fonts.Font$Builder(v5_1).setWeight(v4_0.c).setSlant(v4_0.d).setTtcIndex(v4_0.b).build();
                if (v3 != null) {
                    v3.addFont(v4_3);
                } else {
                    v3 = new android.graphics.fonts.FontFamily$Builder(v4_3);
                }
            } else {
                if (v5_1 == null) {
                }
            }
            v5_1.close();
        }
        if (v3 != null) {
            return v3.build();
        } else {
            return 0;
        }
    }

    public static int m0(android.graphics.fonts.FontStyle p2, android.graphics.fonts.FontStyle p3)
    {
        int v2_1;
        int v0_4 = (Math.abs((p2.getWeight() - p3.getWeight())) / 100);
        if (p2.getSlant() != p3.getSlant()) {
            v2_1 = 2;
        } else {
            v2_1 = 0;
        }
        return (v0_4 + v2_1);
    }

    public final android.graphics.Typeface r(android.content.Context p7, g0.f p8, android.content.res.Resources p9, int p10)
    {
        p7 = 0;
        try {
            android.graphics.Typeface$CustomFallbackBuilder v8_1 = p8.a;
            int v0 = v8_1.length;
            int v1 = 0;
            android.graphics.fonts.FontFamily$Builder v2 = 0;
        } catch (java.io.IOException) {
            v1++;
        }
        if (v1 >= v0) {
            if (v2 != null) {
                android.graphics.Typeface$CustomFallbackBuilder v8_5 = v2.build();
                p9 = new android.graphics.Typeface$CustomFallbackBuilder(v8_5);
                p7 = p9.setStyle(h0.h.k0(v8_5, p10).getStyle()).build();
                return p7;
            } else {
                return p7;
            }
        } else {
            android.graphics.fonts.Font v3_0 = v8_1[v1];
            android.graphics.fonts.Font v3_3 = new android.graphics.fonts.Font$Builder(p9, v3_0.f).setWeight(v3_0.b).setSlant(v3_0.c).setTtcIndex(v3_0.e).setFontVariationSettings(v3_0.d).build();
            if (v2 != null) {
                v2.addFont(v3_3);
            } else {
                v2 = new android.graphics.fonts.FontFamily$Builder(v3_3);
            }
        }
    }

    public final android.graphics.Typeface s(android.content.Context p2, n0.i[] p3, int p4)
    {
        try {
            android.graphics.Typeface v2_6 = h0.h.l0(p3, p2.getContentResolver());
        } catch (android.graphics.Typeface v2_5) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", v2_5);
            return 0;
        }
        if (v2_6 != null) {
            return new android.graphics.Typeface$CustomFallbackBuilder(v2_6).setStyle(h0.h.k0(v2_6, p4).getStyle()).build();
        } else {
            return 0;
        }
    }

    public final android.graphics.Typeface t(android.content.Context p6, java.util.List p7, int p8)
    {
        android.graphics.Typeface v6_1 = p6.getContentResolver();
        android.graphics.fonts.FontFamily v0_3 = h0.h.l0(((n0.i[]) p7.get(0)), v6_1);
        if (v0_3 != null) {
            android.graphics.Typeface$CustomFallbackBuilder v2_1 = new android.graphics.Typeface$CustomFallbackBuilder(v0_3);
            int v3 = 1;
            while (v3 < p7.size()) {
                android.graphics.fonts.FontFamily v4_3 = h0.h.l0(((n0.i[]) p7.get(v3)), v6_1);
                if (v4_3 != null) {
                    v2_1.addCustomFallback(v4_3);
                }
                v3++;
            }
            return v2_1.setStyle(h0.h.k0(v0_3, p8).getStyle()).build();
        } else {
            return 0;
        }
    }

    public final android.graphics.Typeface u(android.content.Context p1, android.content.res.Resources p2, int p3, String p4, int p5)
    {
        try {
            int v1_7 = new android.graphics.fonts.Font$Builder(p2, p3).build();
            return new android.graphics.Typeface$CustomFallbackBuilder(new android.graphics.fonts.FontFamily$Builder(v1_7).build()).setStyle(v1_7.getStyle()).build();
        } catch (int v1_5) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", v1_5);
            return 0;
        }
    }

    public final n0.i z(n0.i[] p1, int p2)
    {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
