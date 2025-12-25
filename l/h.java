package l;
public final class h extends android.view.MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final android.content.Context c;
    public Object d;

    static h()
    {
        Class[] v0_1 = new Class[] {android.content.Context});
        l.h.e = v0_1;
        l.h.f = v0_1;
        return;
    }

    public h(android.content.Context p1)
    {
        super(p1);
        super.c = p1;
        Object[] v1_1 = new Object[] {p1});
        super.a = v1_1;
        super.b = v1_1;
        return;
    }

    public static Object a(Object p1)
    {
        if (!(p1 instanceof android.app.Activity)) {
            if ((p1 instanceof android.content.ContextWrapper)) {
                p1 = l.h.a(((android.content.ContextWrapper) p1).getBaseContext());
            }
            return p1;
        } else {
            return p1;
        }
    }

    public final void b(org.xmlpull.v1.XmlPullParser p17, android.util.AttributeSet p18, android.view.Menu p19)
    {
        String v2_4 = new l.g(this, p19);
        android.view.MenuItem v3_0 = p17.getEventType();
        do {
            int v5_31 = 2;
            if (v3_0 != 2) {
                v3_0 = p17.next();
            } else {
                android.view.MenuItem v3_1 = p17.getName();
                if (!v3_1.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(v3_1));
                } else {
                    v3_0 = p17.next();
                    break;
                }
            }
        } while(v3_0 != 1);
        int v9 = 0;
        int v10 = 0;
        android.view.SubMenu v11 = 0;
        while (v9 == 0) {
            if (v3_0 == 1) {
                throw new RuntimeException("Unexpected end of document");
            } else {
                android.content.res.ColorStateList v8_23;
                if (v3_0 == v5_31) {
                    if (v10 == 0) {
                        android.view.MenuItem v3_16 = p17.getName();
                        android.view.Menu v15_2 = this.c;
                        if (!v3_16.equals("group")) {
                            if (!v3_16.equals("item")) {
                                if (!v3_16.equals("menu")) {
                                    v8_23 = p17;
                                    v11 = v3_16;
                                    v10 = 1;
                                } else {
                                    v2_4.h = 1;
                                    android.view.MenuItem v3_18 = v2_4.a.addSubMenu(v2_4.b, v2_4.i, v2_4.j, v2_4.k);
                                    v2_4.b(v3_18.getItem());
                                    v8_23 = p17;
                                    this.b(p17, p18, v3_18);
                                }
                            } else {
                                android.content.res.ColorStateList v8_4;
                                android.view.MenuItem v3_20 = v15_2.obtainStyledAttributes(p18, g.a.q);
                                v2_4.i = v3_20.getResourceId(2, 0);
                                v2_4.j = ((v3_20.getInt(5, v2_4.c) & -65536) | (v3_20.getInt(6, v2_4.d) & 65535));
                                v2_4.k = v3_20.getText(7);
                                v2_4.l = v3_20.getText(8);
                                v2_4.m = v3_20.getResourceId(0, 0);
                                android.content.res.ColorStateList v8_3 = v3_20.getString(9);
                                if (v8_3 != null) {
                                    v8_4 = v8_3.charAt(0);
                                } else {
                                    v8_4 = 0;
                                }
                                android.content.res.ColorStateList v8_9;
                                v2_4.n = v8_4;
                                v2_4.o = v3_20.getInt(16, 4096);
                                android.content.res.ColorStateList v8_8 = v3_20.getString(10);
                                if (v8_8 != null) {
                                    v8_9 = v8_8.charAt(0);
                                } else {
                                    v8_9 = 0;
                                }
                                v2_4.p = v8_9;
                                v2_4.q = v3_20.getInt(20, 4096);
                                if (!v3_20.hasValue(11)) {
                                    v2_4.r = v2_4.e;
                                } else {
                                    v2_4.r = v3_20.getBoolean(11, 0);
                                }
                                boolean v12_2;
                                v2_4.s = v3_20.getBoolean(3, 0);
                                v2_4.t = v3_20.getBoolean(4, v2_4.f);
                                v2_4.u = v3_20.getBoolean(1, v2_4.g);
                                v2_4.v = v3_20.getInt(21, -1);
                                v2_4.y = v3_20.getString(12);
                                v2_4.w = v3_20.getResourceId(13, 0);
                                v2_4.x = v3_20.getString(15);
                                int v5_12 = v3_20.getString(14);
                                if (v5_12 == 0) {
                                    v12_2 = 0;
                                } else {
                                    v12_2 = 1;
                                }
                                if ((!v12_2) || ((v2_4.w != 0) || (v2_4.x != null))) {
                                    if (v12_2) {
                                        android.util.Log.w("SupportMenuInflater", "Ignoring attribute \'actionProviderClass\'. Action view already specified.");
                                    }
                                    v2_4.z = 0;
                                } else {
                                    v2_4.z = ((m.p) v2_4.a(v5_12, l.h.f, this.b));
                                }
                                v2_4.A = v3_20.getText(17);
                                v2_4.B = v3_20.getText(22);
                                if (!v3_20.hasValue(19)) {
                                    v2_4.D = 0;
                                } else {
                                    v2_4.D = n.n1.c(v3_20.getInt(19, -1), v2_4.D);
                                }
                                if (!v3_20.hasValue(18)) {
                                    v2_4.C = 0;
                                } else {
                                    android.content.res.ColorStateList v8_22;
                                    if (!v3_20.hasValue(18)) {
                                        v8_22 = v3_20.getColorStateList(18);
                                    } else {
                                        android.content.res.ColorStateList v8_21 = v3_20.getResourceId(18, 0);
                                        if (v8_21 == null) {
                                        } else {
                                            v8_22 = e0.c.getColorStateList(v15_2, v8_21);
                                            if (v8_22 == null) {
                                            }
                                        }
                                    }
                                    v2_4.C = v8_22;
                                }
                                v3_20.recycle();
                                v2_4.h = 0;
                                v8_23 = p17;
                            }
                        } else {
                            android.view.MenuItem v3_3 = v15_2.obtainStyledAttributes(p18, g.a.p);
                            v2_4.b = v3_3.getResourceId(1, 0);
                            v2_4.c = v3_3.getInt(3, 0);
                            v2_4.d = v3_3.getInt(4, 0);
                            v2_4.e = v3_3.getInt(5, 0);
                            v2_4.f = v3_3.getBoolean(2, 1);
                            v2_4.g = v3_3.getBoolean(0, 1);
                            v3_3.recycle();
                            v8_23 = p17;
                        }
                    }
                } else {
                    if (v3_0 == 3) {
                        android.view.MenuItem v3_4 = p17.getName();
                        if ((v10 == 0) || (!v3_4.equals(v11))) {
                            if (!v3_4.equals("group")) {
                                if (!v3_4.equals("item")) {
                                    if (!v3_4.equals("menu")) {
                                    } else {
                                        v8_23 = p17;
                                        v9 = 1;
                                    }
                                } else {
                                    if (v2_4.h) {
                                    } else {
                                        android.view.MenuItem v3_7 = v2_4.z;
                                        if ((v3_7 == null) || (!v3_7.b.hasSubMenu())) {
                                            v2_4.h = 1;
                                            v2_4.b(v2_4.a.add(v2_4.b, v2_4.i, v2_4.j, v2_4.k));
                                        } else {
                                            v2_4.h = 1;
                                            v2_4.b(v2_4.a.addSubMenu(v2_4.b, v2_4.i, v2_4.j, v2_4.k).getItem());
                                        }
                                    }
                                }
                            } else {
                                v2_4.b = 0;
                                v2_4.c = 0;
                                v2_4.d = 0;
                                v2_4.e = 0;
                                v2_4.f = 1;
                                v2_4.g = 1;
                            }
                        } else {
                            v8_23 = p17;
                            v10 = 0;
                            v11 = 0;
                        }
                    }
                }
                v3_0 = v8_23.next();
                v5_31 = 2;
            }
        }
        return;
    }

    public final void inflate(int p6, android.view.Menu p7)
    {
        if ((p7 instanceof m.m)) {
            int v2 = 0;
            android.content.res.XmlResourceParser v1_1 = this.c.getResources().getLayout(p6);
            Throwable v6_1 = android.util.Xml.asAttributeSet(v1_1);
            if (((p7 instanceof m.m)) && (!((m.m) p7).p)) {
                ((m.m) p7).w();
                v2 = 1;
            }
            this.b(v1_1, v6_1, p7);
            if (v2 != 0) {
                ((m.m) p7).v();
            }
            v1_1.close();
            return;
        } else {
            super.inflate(p6, p7);
            return;
        }
    }
}
