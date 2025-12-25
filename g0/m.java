package g0;
public abstract class m {
    public static final ThreadLocal a;
    public static final java.util.WeakHashMap b;
    public static final Object c;

    static m()
    {
        g0.m.a = new ThreadLocal();
        g0.m.b = new java.util.WeakHashMap(0);
        g0.m.c = new Object();
        return;
    }

    public static android.graphics.Typeface a(android.content.Context p12, int p13, android.util.TypedValue p14, int p15, g0.b p16, boolean p17, boolean p18)
    {
        android.content.res.Resources v2 = p12.getResources();
        v2.getValue(p13, p14, 1);
        int v0_13 = p14.string;
        if (v0_13 == 0) {
            a5.i v15_2 = new StringBuilder("Resource \"");
            v15_2.append(v2.getResourceName(p13));
            v15_2.append("\" (");
            v15_2.append(Integer.toHexString(p13));
            v15_2.append(") is not a Font: ");
            v15_2.append(p14);
            throw new android.content.res.Resources$NotFoundException(v15_2.toString());
        } else {
            String v4 = v0_13.toString();
            String v10 = 0;
            if (v4.startsWith("res/")) {
                String v6_0 = h0.e.b;
                int v0_9 = ((android.graphics.Typeface) v6_0.get(h0.e.b(v2, p13, v4, p14.assetCookie, p15)));
                if (v0_9 == 0) {
                    if (!p18) {
                        if (!v4.toLowerCase().endsWith(".xml")) {
                            android.os.Handler v14_6 = p14.assetCookie;
                            String v12_6 = h0.e.a.u(p12, v2, p13, v4, p15);
                            if (v12_6 != null) {
                                v6_0.put(h0.e.b(v2, p13, v4, v14_6, p15), v12_6);
                            }
                            if (p16 != null) {
                                if (v12_6 == null) {
                                    p16.a(-3);
                                } else {
                                    new android.os.Handler(android.os.Looper.getMainLooper()).post(new a5.i(5, p16, v12_6));
                                }
                            }
                            v10 = v12_6;
                            if ((v10 == null) && ((p16 == null) && (!p18))) {
                                android.os.Handler v14_5 = new StringBuilder("Font resource ID #0x");
                                v14_5.append(Integer.toHexString(p13));
                                v14_5.append(" could not be retrieved.");
                                throw new android.content.res.Resources$NotFoundException(v14_5.toString());
                            } else {
                                return v10;
                            }
                        } else {
                            java.io.IOException v1_2 = g0.b.j(v2.getXml(p13), v2);
                            if (v1_2 != null) {
                                v10 = h0.e.a(p12, v1_2, v2, p13, v4, p14.assetCookie, p15, p16, p17);
                            } else {
                                android.util.Log.e("ResourcesCompat", "Failed to find font-family tag");
                                if (p16 == null) {
                                } else {
                                    p16.a(-3);
                                }
                            }
                        }
                        if (p16 != null) {
                            p16.a(-3);
                        }
                    }
                } else {
                    if (p16 != null) {
                        new android.os.Handler(android.os.Looper.getMainLooper()).post(new a5.i(5, p16, v0_9));
                    }
                    v10 = v0_9;
                }
            } else {
                if (p16 != null) {
                    p16.a(-3);
                }
            }
        }
    }
}
