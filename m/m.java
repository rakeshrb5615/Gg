package m;
public class m implements android.view.Menu {
    public static final int[] y;
    public final android.content.Context a;
    public final android.content.res.Resources b;
    public boolean c;
    public final boolean d;
    public m.k e;
    public final java.util.ArrayList f;
    public final java.util.ArrayList g;
    public boolean h;
    public final java.util.ArrayList i;
    public final java.util.ArrayList j;
    public boolean k;
    public int l;
    public CharSequence m;
    public android.graphics.drawable.Drawable n;
    public android.view.View o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final java.util.ArrayList t;
    public final java.util.concurrent.CopyOnWriteArrayList u;
    public m.o v;
    public boolean w;
    public boolean x;

    static m()
    {
        int[] v0_1 = new int[6];
        v0_1 = {1, 4, 5, 3, 2, 0};
        m.m.y = v0_1;
        return;
    }

    public m(android.content.Context p6)
    {
        int v0 = 0;
        this.l = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new java.util.ArrayList();
        this.u = new java.util.concurrent.CopyOnWriteArrayList();
        this.w = 0;
        this.a = p6;
        int v1_2 = p6.getResources();
        this.b = v1_2;
        this.f = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
        this.h = 1;
        this.i = new java.util.ArrayList();
        this.j = new java.util.ArrayList();
        this.k = 1;
        if (v1_2.getConfiguration().keyboard != 1) {
            int v6_3;
            int v1_5 = android.view.ViewConfiguration.get(p6);
            if (android.os.Build$VERSION.SDK_INT < 28) {
                int v6_1 = p6.getResources();
                int v1_7 = v6_1.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if ((v1_7 == 0) || (!v6_1.getBoolean(v1_7))) {
                    v6_3 = 0;
                } else {
                    v6_3 = 1;
                }
            } else {
                v6_3 = e0.a.p(v1_5);
            }
            if (v6_3 != 0) {
                v0 = 1;
            }
        }
        this.d = v0;
        return;
    }

    public final m.o a(int p11, int p12, int p13, CharSequence p14)
    {
        int v0_4 = ((-65536 & p13) >> 16);
        if ((v0_4 < 0) || (v0_4 >= 6)) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        } else {
            int v7 = ((m.m.y[v0_4] << 16) | (65535 & p13));
            m.o v2_1 = new m.o(this, p11, p12, p13, v7, p14, this.l);
            java.util.ArrayList v11_1 = this.f;
            int v12_2 = (v11_1.size() - 1);
            while (v12_2 >= 0) {
                if (((m.o) v11_1.get(v12_2)).d > v7) {
                    v12_2--;
                } else {
                    int v12_3 = (v12_2 + 1);
                }
                v11_1.add(v12_3, v2_1);
                this.p(1);
                return v2_1;
            }
            v12_3 = 0;
            v11_1.add(v12_3, v2_1);
            this.p(1);
            return v2_1;
        }
    }

    public final android.view.MenuItem add(int p2)
    {
        return this.a(0, 0, 0, this.b.getString(p2));
    }

    public final android.view.MenuItem add(int p2, int p3, int p4, int p5)
    {
        return this.a(p2, p3, p4, this.b.getString(p5));
    }

    public final android.view.MenuItem add(int p1, int p2, int p3, CharSequence p4)
    {
        return this.a(p1, p2, p3, p4);
    }

    public final android.view.MenuItem add(CharSequence p2)
    {
        return this.a(0, 0, 0, p2);
    }

    public final int addIntentOptions(int p8, int p9, int p10, android.content.ComponentName p11, android.content.Intent[] p12, android.content.Intent p13, int p14, android.view.MenuItem[] p15)
    {
        int v2;
        android.content.pm.PackageManager v0_1 = this.a.getPackageManager();
        int v1 = 0;
        java.util.List v11_1 = v0_1.queryIntentActivityOptions(p11, p12, p13, 0);
        if (v11_1 == null) {
            v2 = 0;
        } else {
            v2 = v11_1.size();
        }
        if ((p14 & 1) == 0) {
            this.removeGroup(p8);
        }
        while (v1 < v2) {
            m.o v4_1;
            int v14_3 = ((android.content.pm.ResolveInfo) v11_1.get(v1));
            m.o v4_0 = v14_3.specificIndex;
            if (v4_0 >= null) {
                v4_1 = p12[v4_0];
            } else {
                v4_1 = p13;
            }
            android.content.Intent v3_1 = new android.content.Intent(v4_1);
            android.graphics.drawable.Drawable v5_0 = v14_3.activityInfo;
            v3_1.setComponent(new android.content.ComponentName(v5_0.applicationInfo.packageName, v5_0.name));
            m.o v4_5 = this.a(p8, p9, p10, v14_3.loadLabel(v0_1));
            v4_5.setIcon(v14_3.loadIcon(v0_1));
            v4_5.g = v3_1;
            if (p15 != null) {
                int v14_4 = v14_3.specificIndex;
                if (v14_4 >= 0) {
                    p15[v14_4] = v4_5;
                }
            }
            v1++;
        }
        return v2;
    }

    public final android.view.SubMenu addSubMenu(int p2)
    {
        return this.addSubMenu(0, 0, 0, this.b.getString(p2));
    }

    public final android.view.SubMenu addSubMenu(int p2, int p3, int p4, int p5)
    {
        return this.addSubMenu(p2, p3, p4, this.b.getString(p5));
    }

    public final android.view.SubMenu addSubMenu(int p1, int p2, int p3, CharSequence p4)
    {
        CharSequence v1_1 = this.a(p1, p2, p3, p4);
        m.e0 v2_2 = new m.e0(this.a, this, v1_1);
        v1_1.o = v2_2;
        v2_2.setHeaderTitle(v1_1.e);
        return v2_2;
    }

    public final android.view.SubMenu addSubMenu(CharSequence p2)
    {
        return this.addSubMenu(0, 0, 0, p2);
    }

    public final void b(m.y p3, android.content.Context p4)
    {
        this.u.add(new ref.WeakReference(p3));
        p3.g(p4, this);
        this.k = 1;
        return;
    }

    public final void c(boolean p5)
    {
        if (!this.s) {
            this.s = 1;
            java.util.concurrent.CopyOnWriteArrayList v0_2 = this.u;
            java.util.Iterator v1 = v0_2.iterator();
            while (v1.hasNext()) {
                ref.WeakReference v2_1 = ((ref.WeakReference) v1.next());
                m.y v3_1 = ((m.y) v2_1.get());
                if (v3_1 != null) {
                    v3_1.a(this, p5);
                } else {
                    v0_2.remove(v2_1);
                }
            }
            this.s = 0;
            return;
        } else {
            return;
        }
    }

    public final void clear()
    {
        int v0_0 = this.v;
        if (v0_0 != 0) {
            this.d(v0_0);
        }
        this.f.clear();
        this.p(1);
        return;
    }

    public final void clearHeader()
    {
        this.n = 0;
        this.m = 0;
        this.o = 0;
        this.p(0);
        return;
    }

    public final void close()
    {
        this.c(1);
        return;
    }

    public boolean d(m.o p6)
    {
        java.util.concurrent.CopyOnWriteArrayList v0 = this.u;
        boolean v2 = 0;
        if ((!v0.isEmpty()) && (this.v == p6)) {
            this.w();
            java.util.Iterator v1_2 = v0.iterator();
            while (v1_2.hasNext()) {
                ref.WeakReference v3_2 = ((ref.WeakReference) v1_2.next());
                m.y v4_1 = ((m.y) v3_2.get());
                if (v4_1 != null) {
                    v2 = v4_1.k(p6);
                    if (v2) {
                        break;
                    }
                } else {
                    v0.remove(v3_2);
                }
            }
            this.v();
            if (v2) {
                this.v = 0;
            }
        }
        return v2;
    }

    public boolean e(m.m p2, android.view.MenuItem p3)
    {
        m.k v0 = this.e;
        if ((v0 == null) || (!v0.b(p2, p3))) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean f(m.o p6)
    {
        java.util.concurrent.CopyOnWriteArrayList v0 = this.u;
        boolean v2 = 0;
        if (!v0.isEmpty()) {
            this.w();
            java.util.Iterator v1_1 = v0.iterator();
            while (v1_1.hasNext()) {
                ref.WeakReference v3_1 = ((ref.WeakReference) v1_1.next());
                m.y v4_1 = ((m.y) v3_1.get());
                if (v4_1 != null) {
                    v2 = v4_1.e(p6);
                    if (v2) {
                        break;
                    }
                } else {
                    v0.remove(v3_1);
                }
            }
            this.v();
            if (v2) {
                this.v = p6;
            }
            return v2;
        } else {
            return 0;
        }
    }

    public final android.view.MenuItem findItem(int p6)
    {
        java.util.ArrayList v0 = this.f;
        int v1 = v0.size();
        int v2 = 0;
        while (v2 < v1) {
            android.view.MenuItem v3_3 = ((m.o) v0.get(v2));
            if (v3_3.a != p6) {
                if (v3_3.hasSubMenu()) {
                    android.view.MenuItem v3_1 = v3_3.o.findItem(p6);
                    if (v3_1 != null) {
                        return v3_1;
                    }
                }
                v2++;
            } else {
                return v3_3;
            }
        }
        return 0;
    }

    public final m.o g(int p12, android.view.KeyEvent p13)
    {
        java.util.ArrayList v0 = this.t;
        v0.clear();
        this.h(v0, p12, p13);
        if (!v0.isEmpty()) {
            int v1_1 = p13.getMetaState();
            android.view.KeyCharacterMap$KeyData v3_0 = new android.view.KeyCharacterMap$KeyData();
            p13.getKeyData(v3_0);
            int v13_1 = v0.size();
            if (v13_1 != 1) {
                boolean v4_1 = this.n();
                int v6 = 0;
                while (v6 < v13_1) {
                    int v8_0;
                    m.o v7_1 = ((m.o) v0.get(v6));
                    if (!v4_1) {
                        v8_0 = v7_1.h;
                    } else {
                        v8_0 = v7_1.j;
                    }
                    int v9_0 = v3_0.meta;
                    if (((v8_0 != v9_0[0]) || ((v1_1 & 2) != 0)) && (((v8_0 != v9_0[2]) || ((v1_1 & 2) == 0)) && ((!v4_1) || ((v8_0 != 8) || (p12 != 67))))) {
                        v6++;
                    } else {
                        return v7_1;
                    }
                }
                return 0;
            } else {
                return ((m.o) v0.get(0));
            }
        } else {
            return 0;
        }
    }

    public final android.view.MenuItem getItem(int p2)
    {
        return ((android.view.MenuItem) this.f.get(p2));
    }

    public final void h(java.util.List p18, int p19, android.view.KeyEvent p20)
    {
        boolean v3 = this.n();
        int v4 = p20.getModifiers();
        android.view.KeyCharacterMap$KeyData v5_1 = new android.view.KeyCharacterMap$KeyData();
        if ((p20.getKeyData(v5_1)) || (p19 == 67)) {
            java.util.ArrayList v8 = this.f;
            int v9 = v8.size();
            int v11 = 0;
            while (v11 < v9) {
                m.o v12_1 = ((m.o) v8.get(v11));
                if (v12_1.hasSubMenu()) {
                    v12_1.o.h(p18, p19, p20);
                }
                char v13_2;
                if (!v3) {
                    v13_2 = v12_1.h;
                } else {
                    v13_2 = v12_1.j;
                }
                int v14_0;
                if (!v3) {
                    v14_0 = v12_1.i;
                } else {
                    v14_0 = v12_1.k;
                }
                if (((v4 & 69647) == (v14_0 & 69647)) && (v13_2 != 0)) {
                    int v10_1 = v5_1.meta;
                    if (((v13_2 == v10_1[0]) || ((v13_2 == v10_1[2]) || ((v3) && ((v13_2 == 8) && (p19 == 67))))) && (v12_1.isEnabled())) {
                        p18.add(v12_1);
                    }
                }
                v11++;
            }
        }
        return;
    }

    public final boolean hasVisibleItems()
    {
        if (!this.x) {
            int v0_2 = this.f;
            int v1 = v0_2.size();
            int v3 = 0;
            while (v3 < v1) {
                if (!((m.o) v0_2.get(v3)).isVisible()) {
                    v3++;
                }
            }
            return 0;
        }
        return 1;
    }

    public final void i()
    {
        java.util.ArrayList v0_0 = this.l();
        if (this.k) {
            java.util.ArrayList v1_2 = this.u;
            java.util.ArrayList v2_1 = v1_2.iterator();
            int v4_1 = 0;
            while (v2_1.hasNext()) {
                int v5_3 = ((ref.WeakReference) v2_1.next());
                m.o v6_3 = ((m.y) v5_3.get());
                if (v6_3 != null) {
                    v4_1 |= v6_3.h();
                } else {
                    v1_2.remove(v5_3);
                }
            }
            java.util.ArrayList v1_0 = this.i;
            java.util.ArrayList v2_0 = this.j;
            if (v4_1 == 0) {
                v1_0.clear();
                v2_0.clear();
                v2_0.addAll(this.l());
            } else {
                v1_0.clear();
                v2_0.clear();
                int v4_0 = v0_0.size();
                int v5_1 = 0;
                while (v5_1 < v4_0) {
                    m.o v6_1 = ((m.o) v0_0.get(v5_1));
                    if ((v6_1.x & 32) != 32) {
                        v2_0.add(v6_1);
                    } else {
                        v1_0.add(v6_1);
                    }
                    v5_1++;
                }
            }
            this.k = 0;
            return;
        } else {
            return;
        }
    }

    public final boolean isShortcutKey(int p1, android.view.KeyEvent p2)
    {
        if (this.g(p1, p2) == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public String j()
    {
        return "android:menu:actionviewstates";
    }

    public m.m k()
    {
        return this;
    }

    public final java.util.ArrayList l()
    {
        java.util.ArrayList v1 = this.g;
        if (this.h) {
            v1.clear();
            int v0_2 = this.f;
            int v2 = v0_2.size();
            int v4 = 0;
            while (v4 < v2) {
                m.o v5_1 = ((m.o) v0_2.get(v4));
                if (v5_1.isVisible()) {
                    v1.add(v5_1);
                }
                v4++;
            }
            this.h = 0;
            this.k = 1;
            return v1;
        } else {
            return v1;
        }
    }

    public boolean m()
    {
        return this.w;
    }

    public boolean n()
    {
        return this.c;
    }

    public boolean o()
    {
        return this.d;
    }

    public final void p(boolean p4)
    {
        if (this.p) {
            this.q = 1;
            if (p4 != null) {
                this.r = 1;
            }
        } else {
            if (p4 != null) {
                this.h = 1;
                this.k = 1;
            }
            java.util.concurrent.CopyOnWriteArrayList v4_1 = this.u;
            if (!v4_1.isEmpty()) {
                this.w();
                java.util.Iterator v0_2 = v4_1.iterator();
                while (v0_2.hasNext()) {
                    ref.WeakReference v1_3 = ((ref.WeakReference) v0_2.next());
                    m.y v2_1 = ((m.y) v1_3.get());
                    if (v2_1 != null) {
                        v2_1.d();
                    } else {
                        v4_1.remove(v1_3);
                    }
                }
                this.v();
                return;
            }
        }
        return;
    }

    public final boolean performIdentifierAction(int p2, int p3)
    {
        return this.q(this.findItem(p2), 0, p3);
    }

    public final boolean performShortcut(int p1, android.view.KeyEvent p2, int p3)
    {
        int v1_2;
        int v1_1 = this.g(p1, p2);
        if (v1_1 == 0) {
            v1_2 = 0;
        } else {
            v1_2 = this.q(v1_1, 0, p3);
        }
        if ((p3 & 2) != 0) {
            this.c(1);
        }
        return v1_2;
    }

    public final boolean q(android.view.MenuItem p7, m.y p8, int p9)
    {
        boolean v0 = 0;
        if ((((m.o) p7) != null) && (((m.o) p7).isEnabled())) {
            int v1_5;
            int v1_7 = ((m.o) p7).n;
            ref.WeakReference v2_6 = ((m.o) p7).p;
            if (((v2_6 == null) || (!v2_6.onMenuItemClick(((m.o) p7)))) && (!v1_7.e(v1_7, ((m.o) p7)))) {
                ref.WeakReference v2_2 = ((m.o) p7).g;
                if (v2_2 != null) {
                    try {
                        v1_7.a.startActivity(v2_2);
                    } catch (int v1_1) {
                        android.util.Log.e("MenuItemImpl", "Can\'t find activity to handle intent; ignoring", v1_1);
                    }
                    v1_5 = 1;
                    m.y v4_3;
                    ref.WeakReference v2_4 = ((m.o) p7).A;
                    if ((v2_4 == null) || (!v2_4.b.hasSubMenu())) {
                        v4_3 = 0;
                    } else {
                        v4_3 = 1;
                    }
                    if (!((m.o) p7).e()) {
                        if ((!((m.o) p7).hasSubMenu()) && (v4_3 == null)) {
                            if ((p9 & 1) == 0) {
                                this.c(1);
                            }
                        } else {
                            if ((p9 & 4) == 0) {
                                this.c(0);
                            }
                            if (!((m.o) p7).hasSubMenu()) {
                                java.util.concurrent.CopyOnWriteArrayList v9_4 = new m.e0(this.a, this, ((m.o) p7));
                                ((m.o) p7).o = v9_4;
                                v9_4.setHeaderTitle(((m.o) p7).e);
                            }
                            m.e0 v7_3 = ((m.o) p7).o;
                            if (v4_3 != null) {
                                v2_4.b.onPrepareSubMenu(v7_3);
                            }
                            java.util.concurrent.CopyOnWriteArrayList v9_6 = this.u;
                            if (!v9_6.isEmpty()) {
                                if (p8 != null) {
                                    v0 = p8.i(v7_3);
                                }
                                java.util.Iterator v8_1 = v9_6.iterator();
                                while (v8_1.hasNext()) {
                                    ref.WeakReference v2_9 = ((ref.WeakReference) v8_1.next());
                                    m.y v4_5 = ((m.y) v2_9.get());
                                    if (v4_5 != null) {
                                        if (!v0) {
                                            v0 = v4_5.i(v7_3);
                                        }
                                    } else {
                                        v9_6.remove(v2_9);
                                    }
                                }
                            }
                            v1_5 |= v0;
                            if (v1_5 == 0) {
                                this.c(1);
                            }
                        }
                    } else {
                        v1_5 |= ((m.o) p7).expandActionView();
                        if (v1_5 != 0) {
                            this.c(1);
                        }
                    }
                    return v1_5;
                }
                int v1_2 = ((m.o) p7).A;
                if ((v1_2 == 0) || (!v1_2.b.onPerformDefaultAction())) {
                    v1_5 = 0;
                }
            }
        } else {
            return 0;
        }
    }

    public final void r(m.y p5)
    {
        java.util.concurrent.CopyOnWriteArrayList v0 = this.u;
        java.util.Iterator v1 = v0.iterator();
        while (v1.hasNext()) {
            ref.WeakReference v2_2 = ((ref.WeakReference) v1.next());
            m.y v3_1 = ((m.y) v2_2.get());
            if ((v3_1 == null) || (v3_1 == p5)) {
                v0.remove(v2_2);
            }
        }
        return;
    }

    public final void removeGroup(int p6)
    {
        java.util.ArrayList v0 = this.f;
        int v1_2 = v0.size();
        int v2_4 = 0;
        int v3 = 0;
        while (v3 < v1_2) {
            if (((m.o) v0.get(v3)).b != p6) {
                v3++;
            }
            if (v3 >= 0) {
                int v1_1 = (v0.size() - v3);
                while(true) {
                    int v4_1 = (v2_4 + 1);
                    if ((v2_4 >= v1_1) || (((m.o) v0.get(v3)).b != p6)) {
                        break;
                    }
                    if ((v3 >= 0) && (v3 < v0.size())) {
                        v0.remove(v3);
                    }
                    v2_4 = v4_1;
                }
                this.p(1);
            }
            return;
        }
        v3 = -1;
    }

    public final void removeItem(int p5)
    {
        java.util.ArrayList v0 = this.f;
        int v1 = v0.size();
        int v2 = 0;
        while (v2 < v1) {
            if (((m.o) v0.get(v2)).a != p5) {
                v2++;
            }
            if ((v2 >= 0) && (v2 < v0.size())) {
                v0.remove(v2);
                this.p(1);
            }
            return;
        }
        v2 = -1;
    }

    public final void s(android.os.Bundle p8)
    {
        if (p8 != null) {
            String v0_2 = p8.getSparseParcelableArray(this.j());
            int v1_1 = this.f.size();
            int v2 = 0;
            while (v2 < v1_1) {
                m.e0 v3_0 = this.getItem(v2);
                boolean v4_0 = v3_0.getActionView();
                if ((v4_0) && (v4_0.getId() != -1)) {
                    v4_0.restoreHierarchyState(v0_2);
                }
                if (v3_0.hasSubMenu()) {
                    ((m.e0) v3_0.getSubMenu()).s(p8);
                }
                v2++;
            }
            android.view.MenuItem v8_1 = p8.getInt("android:menu:expandedactionview");
            if (v8_1 > null) {
                android.view.MenuItem v8_2 = this.findItem(v8_1);
                if (v8_2 != null) {
                    v8_2.expandActionView();
                }
            }
        }
        return;
    }

    public final void setGroupCheckable(int p8, boolean p9, boolean p10)
    {
        java.util.ArrayList v0 = this.f;
        int v1 = v0.size();
        int v3 = 0;
        while (v3 < v1) {
            m.o v4_1 = ((m.o) v0.get(v3));
            if (v4_1.b == p8) {
                int v6;
                if (!p10) {
                    v6 = 0;
                } else {
                    v6 = 4;
                }
                v4_1.x = ((v4_1.x & -5) | v6);
                v4_1.setCheckable(p9);
            }
            v3++;
        }
        return;
    }

    public void setGroupDividerEnabled(boolean p1)
    {
        this.w = p1;
        return;
    }

    public final void setGroupEnabled(int p6, boolean p7)
    {
        java.util.ArrayList v0 = this.f;
        int v1 = v0.size();
        int v2 = 0;
        while (v2 < v1) {
            m.o v3_1 = ((m.o) v0.get(v2));
            if (v3_1.b == p6) {
                v3_1.setEnabled(p7);
            }
            v2++;
        }
        return;
    }

    public final void setGroupVisible(int p11, boolean p12)
    {
        java.util.ArrayList v0 = this.f;
        int v1 = v0.size();
        int v3 = 0;
        int v4 = 0;
        while (v3 < v1) {
            m.o v6_1 = ((m.o) v0.get(v3));
            if (v6_1.b == p11) {
                int v9;
                int v7_1 = v6_1.x;
                if (!p12) {
                    v9 = 8;
                } else {
                    v9 = 0;
                }
                int v8_1 = ((v7_1 & -9) | v9);
                v6_1.x = v8_1;
                if (v7_1 != v8_1) {
                    v4 = 1;
                }
            }
            v3++;
        }
        if (v4 != 0) {
            this.p(1);
        }
        return;
    }

    public void setQwertyMode(boolean p1)
    {
        this.c = p1;
        this.p(0);
        return;
    }

    public final int size()
    {
        return this.f.size();
    }

    public final void t(android.os.Bundle p8)
    {
        String v0_1 = this.f.size();
        android.util.SparseArray v1_1 = 0;
        int v2 = 0;
        while (v2 < v0_1) {
            m.e0 v3_0 = this.getItem(v2);
            String v4_0 = v3_0.getActionView();
            if ((v4_0 != null) && (v4_0.getId() != -1)) {
                if (v1_1 == null) {
                    v1_1 = new android.util.SparseArray();
                }
                v4_0.saveHierarchyState(v1_1);
                if (v3_0.isActionViewExpanded()) {
                    p8.putInt("android:menu:expandedactionview", v3_0.getItemId());
                }
            }
            if (v3_0.hasSubMenu()) {
                ((m.e0) v3_0.getSubMenu()).t(p8);
            }
            v2++;
        }
        if (v1_1 != null) {
            p8.putSparseParcelableArray(this.j(), v1_1);
        }
        return;
    }

    public final void u(int p2, CharSequence p3, int p4, android.graphics.drawable.Drawable p5, android.view.View p6)
    {
        if (p6 == null) {
            if (p2 <= null) {
                if (p3 != null) {
                    this.m = p3;
                }
            } else {
                this.m = this.b.getText(p2);
            }
            if (p4 <= 0) {
                if (p5 != null) {
                    this.n = p5;
                }
            } else {
                this.n = e0.c.getDrawable(this.a, p4);
            }
            this.o = 0;
        } else {
            this.o = p6;
            this.m = 0;
            this.n = 0;
        }
        this.p(0);
        return;
    }

    public final void v()
    {
        this.p = 0;
        if (this.q) {
            this.q = 0;
            this.p(this.r);
        }
        return;
    }

    public final void w()
    {
        if (!this.p) {
            this.p = 1;
            this.q = 0;
            this.r = 0;
        }
        return;
    }
}
