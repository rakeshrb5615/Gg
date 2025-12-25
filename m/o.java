package m;
public final class o implements j0.a {
    public m.p A;
    public android.view.MenuItem$OnActionExpandListener B;
    public boolean C;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public android.content.Intent g;
    public char h;
    public int i;
    public char j;
    public int k;
    public android.graphics.drawable.Drawable l;
    public int m;
    public final m.m n;
    public m.e0 o;
    public android.view.MenuItem$OnMenuItemClickListener p;
    public CharSequence q;
    public CharSequence r;
    public android.content.res.ColorStateList s;
    public android.graphics.PorterDuff$Mode t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public android.view.View z;

    public o(m.m p3, int p4, int p5, int p6, int p7, CharSequence p8, int p9)
    {
        this.i = 4096;
        this.k = 4096;
        this.m = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 16;
        this.C = 0;
        this.n = p3;
        this.a = p5;
        this.b = p4;
        this.c = p6;
        this.d = p7;
        this.e = p8;
        this.y = p9;
        return;
    }

    public static void c(int p0, int p1, String p2, StringBuilder p3)
    {
        if ((p0 & p1) == p1) {
            p3.append(p2);
        }
        return;
    }

    public final m.p a()
    {
        return this.A;
    }

    public final j0.a b(m.p p3)
    {
        this.z = 0;
        this.A = p3;
        this.n.p(1);
        m.p v3_2 = this.A;
        if (v3_2 != null) {
            v3_2.a = new j6.o(this, 3);
            v3_2.b.setVisibilityListener(v3_2);
        }
        return this;
    }

    public final boolean collapseActionView()
    {
        if ((this.y & 8) != 0) {
            if (this.z != null) {
                boolean v0_6 = this.B;
                if ((v0_6) && (!v0_6.onMenuItemActionCollapse(this))) {
                    return 0;
                } else {
                    return this.n.d(this);
                }
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final android.graphics.drawable.Drawable d(android.graphics.drawable.Drawable p2)
    {
        if ((p2 != null) && ((this.w) && ((this.u) || (this.v)))) {
            p2 = p2.mutate();
            if (this.u) {
                p2.setTintList(this.s);
            }
            if (this.v) {
                p2.setTintMode(this.t);
            }
            this.w = 0;
        }
        return p2;
    }

    public final boolean e()
    {
        if ((this.y & 8) != 0) {
            if (this.z == null) {
                int v0_6 = this.A;
                if (v0_6 != 0) {
                    this.z = v0_6.b.onCreateActionView(this);
                }
            }
            if (this.z != null) {
                return 1;
            }
        }
        return 0;
    }

    public final boolean expandActionView()
    {
        if (this.e()) {
            boolean v0_3 = this.B;
            if ((!v0_3) || (v0_3.onMenuItemActionExpand(this))) {
                return this.n.f(this);
            }
        }
        return 0;
    }

    public final void f(boolean p1)
    {
        if (p1 == 0) {
            this.x = (this.x & -33);
            return;
        } else {
            this.x = (this.x | 32);
            return;
        }
    }

    public final android.view.ActionProvider getActionProvider()
    {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final android.view.View getActionView()
    {
        int v0_0 = this.z;
        if (v0_0 == 0) {
            int v0_1 = this.A;
            if (v0_1 == 0) {
                return 0;
            } else {
                int v0_4 = v0_1.b.onCreateActionView(this);
                this.z = v0_4;
                return v0_4;
            }
        } else {
            return v0_0;
        }
    }

    public final int getAlphabeticModifiers()
    {
        return this.k;
    }

    public final char getAlphabeticShortcut()
    {
        return this.j;
    }

    public final CharSequence getContentDescription()
    {
        return this.q;
    }

    public final int getGroupId()
    {
        return this.b;
    }

    public final android.graphics.drawable.Drawable getIcon()
    {
        int v0_0 = this.l;
        if (v0_0 == 0) {
            int v0_3 = this.m;
            if (v0_3 == 0) {
                return 0;
            } else {
                int v0_5 = j5.t1.A(this.n.a, v0_3);
                this.m = 0;
                this.l = v0_5;
                return this.d(v0_5);
            }
        } else {
            return this.d(v0_0);
        }
    }

    public final android.content.res.ColorStateList getIconTintList()
    {
        return this.s;
    }

    public final android.graphics.PorterDuff$Mode getIconTintMode()
    {
        return this.t;
    }

    public final android.content.Intent getIntent()
    {
        return this.g;
    }

    public final int getItemId()
    {
        return this.a;
    }

    public final android.view.ContextMenu$ContextMenuInfo getMenuInfo()
    {
        return 0;
    }

    public final int getNumericModifiers()
    {
        return this.i;
    }

    public final char getNumericShortcut()
    {
        return this.h;
    }

    public final int getOrder()
    {
        return this.c;
    }

    public final android.view.SubMenu getSubMenu()
    {
        return this.o;
    }

    public final CharSequence getTitle()
    {
        return this.e;
    }

    public final CharSequence getTitleCondensed()
    {
        CharSequence v0_0 = this.f;
        if (v0_0 == null) {
            return this.e;
        } else {
            return v0_0;
        }
    }

    public final CharSequence getTooltipText()
    {
        return this.r;
    }

    public final boolean hasSubMenu()
    {
        if (this.o == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isActionViewExpanded()
    {
        return this.C;
    }

    public final boolean isCheckable()
    {
        if ((this.x & 1) != 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isChecked()
    {
        if ((this.x & 2) != 2) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isEnabled()
    {
        if ((this.x & 16) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isVisible()
    {
        boolean v0_0 = this.A;
        if ((!v0_0) || (!v0_0.b.overridesItemVisibility())) {
            if ((this.x & 8) != 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if (((this.x & 8) != 0) || (!this.A.b.isVisible())) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final android.view.MenuItem setActionProvider(android.view.ActionProvider p2)
    {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final android.view.MenuItem setActionView(int p5)
    {
        m.m v0 = this.n;
        int v1_0 = v0.a;
        int v5_2 = android.view.LayoutInflater.from(v1_0).inflate(p5, new android.widget.LinearLayout(v1_0), 0);
        this.z = v5_2;
        this.A = 0;
        if ((v5_2 != 0) && (v5_2.getId() == -1)) {
            int v1_3 = this.a;
            if (v1_3 > 0) {
                v5_2.setId(v1_3);
            }
        }
        v0.k = 1;
        v0.p(1);
        return this;
    }

    public final android.view.MenuItem setActionView(android.view.View p3)
    {
        this.z = p3;
        this.A = 0;
        if ((p3 != null) && (p3.getId() == -1)) {
            int v0_3 = this.a;
            if (v0_3 > 0) {
                p3.setId(v0_3);
            }
        }
        m.m v3_1 = this.n;
        v3_1.k = 1;
        v3_1.p(1);
        return this;
    }

    public final android.view.MenuItem setAlphabeticShortcut(char p2)
    {
        if (this.j != p2) {
            this.j = Character.toLowerCase(p2);
            this.n.p(0);
            return this;
        } else {
            return this;
        }
    }

    public final android.view.MenuItem setAlphabeticShortcut(char p2, int p3)
    {
        if ((this.j != p2) || (this.k != p3)) {
            this.j = Character.toLowerCase(p2);
            this.k = android.view.KeyEvent.normalizeMetaState(p3);
            this.n.p(0);
            return this;
        } else {
            return this;
        }
    }

    public final android.view.MenuItem setCheckable(boolean p3)
    {
        int v0_0 = this.x;
        m.m v3_1 = (p3 | (v0_0 & -2));
        this.x = v3_1;
        if (v0_0 != v3_1) {
            this.n.p(0);
        }
        return this;
    }

    public final android.view.MenuItem setChecked(boolean p10)
    {
        int v0_0 = this.x;
        int v2 = 2;
        m.m v3 = this.n;
        if ((v0_0 & 4) == 0) {
            if (p10 == 0) {
                v2 = 0;
            }
            int v10_2 = ((v0_0 & -3) | v2);
            this.x = v10_2;
            if (v0_0 != v10_2) {
                v3.p(0);
            }
            return this;
        } else {
            int v10_1 = v3.f;
            int v0_1 = v10_1.size();
            v3.w();
            int v1_1 = 0;
            while (v1_1 < v0_1) {
                m.m v5_1 = ((m.o) v10_1.get(v1_1));
                if ((v5_1.b == this.b) && (((v5_1.x & 4) != 0) && (v5_1.isCheckable()))) {
                    int v6_4;
                    if (v5_1 != this) {
                        v6_4 = 0;
                    } else {
                        v6_4 = 1;
                    }
                    int v6_5;
                    int v7_1 = v5_1.x;
                    if (v6_4 == 0) {
                        v6_5 = 0;
                    } else {
                        v6_5 = 2;
                    }
                    int v6_6 = (v6_5 | (v7_1 & -3));
                    v5_1.x = v6_6;
                    if (v7_1 != v6_6) {
                        v5_1.n.p(0);
                    }
                }
                v1_1++;
            }
            v3.v();
            return this;
        }
    }

    public final bridge synthetic android.view.MenuItem setContentDescription(CharSequence p1)
    {
        this.setContentDescription(p1);
        return this;
    }

    public final j0.a setContentDescription(CharSequence p2)
    {
        this.q = p2;
        this.n.p(0);
        return this;
    }

    public final android.view.MenuItem setEnabled(boolean p2)
    {
        if (p2 == null) {
            this.x = (this.x & -17);
        } else {
            this.x = (this.x | 16);
        }
        this.n.p(0);
        return this;
    }

    public final android.view.MenuItem setIcon(int p2)
    {
        this.l = 0;
        this.m = p2;
        this.w = 1;
        this.n.p(0);
        return this;
    }

    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable p2)
    {
        this.m = 0;
        this.l = p2;
        this.w = 1;
        this.n.p(0);
        return this;
    }

    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList p2)
    {
        this.s = p2;
        this.u = 1;
        this.w = 1;
        this.n.p(0);
        return this;
    }

    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff$Mode p2)
    {
        this.t = p2;
        this.v = 1;
        this.w = 1;
        this.n.p(0);
        return this;
    }

    public final android.view.MenuItem setIntent(android.content.Intent p1)
    {
        this.g = p1;
        return this;
    }

    public final android.view.MenuItem setNumericShortcut(char p2)
    {
        if (this.h != p2) {
            this.h = p2;
            this.n.p(0);
            return this;
        } else {
            return this;
        }
    }

    public final android.view.MenuItem setNumericShortcut(char p2, int p3)
    {
        if ((this.h != p2) || (this.i != p3)) {
            this.h = p2;
            this.i = android.view.KeyEvent.normalizeMetaState(p3);
            this.n.p(0);
            return this;
        } else {
            return this;
        }
    }

    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem$OnActionExpandListener p1)
    {
        this.B = p1;
        return this;
    }

    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener p1)
    {
        this.p = p1;
        return this;
    }

    public final android.view.MenuItem setShortcut(char p1, char p2)
    {
        this.h = p1;
        this.j = Character.toLowerCase(p2);
        this.n.p(0);
        return this;
    }

    public final android.view.MenuItem setShortcut(char p1, char p2, int p3, int p4)
    {
        this.h = p1;
        this.i = android.view.KeyEvent.normalizeMetaState(p3);
        this.j = Character.toLowerCase(p2);
        this.k = android.view.KeyEvent.normalizeMetaState(p4);
        this.n.p(0);
        return this;
    }

    public final void setShowAsAction(int p4)
    {
        String v0_0 = (p4 & 3);
        if ((v0_0 != null) && ((v0_0 != 1) && (v0_0 != 2))) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        } else {
            this.y = p4;
            IllegalArgumentException v4_1 = this.n;
            v4_1.k = 1;
            v4_1.p(1);
            return;
        }
    }

    public final android.view.MenuItem setShowAsActionFlags(int p1)
    {
        this.setShowAsAction(p1);
        return this;
    }

    public final android.view.MenuItem setTitle(int p2)
    {
        this.setTitle(this.n.a.getString(p2));
        return this;
    }

    public final android.view.MenuItem setTitle(CharSequence p3)
    {
        this.e = p3;
        this.n.p(0);
        m.e0 v0_1 = this.o;
        if (v0_1 != null) {
            v0_1.setHeaderTitle(p3);
        }
        return this;
    }

    public final android.view.MenuItem setTitleCondensed(CharSequence p2)
    {
        this.f = p2;
        this.n.p(0);
        return this;
    }

    public final bridge synthetic android.view.MenuItem setTooltipText(CharSequence p1)
    {
        this.setTooltipText(p1);
        return this;
    }

    public final j0.a setTooltipText(CharSequence p2)
    {
        this.r = p2;
        this.n.p(0);
        return this;
    }

    public final android.view.MenuItem setVisible(boolean p3)
    {
        m.m v3_1;
        int v0_0 = this.x;
        if (p3 == null) {
            v3_1 = 8;
        } else {
            v3_1 = 0;
        }
        m.m v3_2 = (v3_1 | (v0_0 & -9));
        this.x = v3_2;
        if (v0_0 != v3_2) {
            m.m v3_3 = this.n;
            v3_3.h = 1;
            v3_3.p(1);
        }
        return this;
    }

    public final String toString()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.toString();
        }
    }
}
