package m;
public final class a implements j0.a {
    public CharSequence a;
    public CharSequence b;
    public android.content.Intent c;
    public char d;
    public int e;
    public char f;
    public int g;
    public android.graphics.drawable.Drawable h;
    public android.content.Context i;
    public CharSequence j;
    public CharSequence k;
    public android.content.res.ColorStateList l;
    public android.graphics.PorterDuff$Mode m;
    public boolean n;
    public boolean o;
    public int p;

    public final m.p a()
    {
        return 0;
    }

    public final j0.a b(m.p p1)
    {
        throw new UnsupportedOperationException();
    }

    public final void c()
    {
        android.graphics.drawable.Drawable v0_0 = this.h;
        if ((v0_0 != null) && ((this.n) || (this.o))) {
            this.h = v0_0;
            android.graphics.drawable.Drawable v0_3 = v0_0.mutate();
            this.h = v0_3;
            if (this.n) {
                v0_3.setTintList(this.l);
            }
            if (this.o) {
                this.h.setTintMode(this.m);
            }
        }
        return;
    }

    public final boolean collapseActionView()
    {
        return 0;
    }

    public final boolean expandActionView()
    {
        return 0;
    }

    public final android.view.ActionProvider getActionProvider()
    {
        throw new UnsupportedOperationException();
    }

    public final android.view.View getActionView()
    {
        return 0;
    }

    public final int getAlphabeticModifiers()
    {
        return this.g;
    }

    public final char getAlphabeticShortcut()
    {
        return this.f;
    }

    public final CharSequence getContentDescription()
    {
        return this.j;
    }

    public final int getGroupId()
    {
        return 0;
    }

    public final android.graphics.drawable.Drawable getIcon()
    {
        return this.h;
    }

    public final android.content.res.ColorStateList getIconTintList()
    {
        return this.l;
    }

    public final android.graphics.PorterDuff$Mode getIconTintMode()
    {
        return this.m;
    }

    public final android.content.Intent getIntent()
    {
        return this.c;
    }

    public final int getItemId()
    {
        return 16908332;
    }

    public final android.view.ContextMenu$ContextMenuInfo getMenuInfo()
    {
        return 0;
    }

    public final int getNumericModifiers()
    {
        return this.e;
    }

    public final char getNumericShortcut()
    {
        return this.d;
    }

    public final int getOrder()
    {
        return 0;
    }

    public final android.view.SubMenu getSubMenu()
    {
        return 0;
    }

    public final CharSequence getTitle()
    {
        return this.a;
    }

    public final CharSequence getTitleCondensed()
    {
        CharSequence v0_0 = this.b;
        if (v0_0 == null) {
            return this.a;
        } else {
            return v0_0;
        }
    }

    public final CharSequence getTooltipText()
    {
        return this.k;
    }

    public final boolean hasSubMenu()
    {
        return 0;
    }

    public final boolean isActionViewExpanded()
    {
        return 0;
    }

    public final boolean isCheckable()
    {
        if ((this.p & 1) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isChecked()
    {
        if ((this.p & 2) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isEnabled()
    {
        if ((this.p & 16) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isVisible()
    {
        if ((this.p & 8) != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final android.view.MenuItem setActionProvider(android.view.ActionProvider p1)
    {
        throw new UnsupportedOperationException();
    }

    public final android.view.MenuItem setActionView(int p1)
    {
        throw new UnsupportedOperationException();
    }

    public final android.view.MenuItem setActionView(android.view.View p1)
    {
        throw new UnsupportedOperationException();
    }

    public final android.view.MenuItem setAlphabeticShortcut(char p1)
    {
        this.f = Character.toLowerCase(p1);
        return this;
    }

    public final android.view.MenuItem setAlphabeticShortcut(char p1, int p2)
    {
        this.f = Character.toLowerCase(p1);
        this.g = android.view.KeyEvent.normalizeMetaState(p2);
        return this;
    }

    public final android.view.MenuItem setCheckable(boolean p2)
    {
        this.p = (p2 | (this.p & -2));
        return this;
    }

    public final android.view.MenuItem setChecked(boolean p2)
    {
        int v2_1;
        if (p2 == 0) {
            v2_1 = 0;
        } else {
            v2_1 = 2;
        }
        this.p = (v2_1 | (this.p & -3));
        return this;
    }

    public final android.view.MenuItem setContentDescription(CharSequence p1)
    {
        this.j = p1;
        return this;
    }

    public final j0.a setContentDescription(CharSequence p1)
    {
        this.j = p1;
        return this;
    }

    public final android.view.MenuItem setEnabled(boolean p2)
    {
        int v2_1;
        if (p2 == 0) {
            v2_1 = 0;
        } else {
            v2_1 = 16;
        }
        this.p = (v2_1 | (this.p & -17));
        return this;
    }

    public final android.view.MenuItem setIcon(int p2)
    {
        this.h = e0.c.getDrawable(this.i, p2);
        this.c();
        return this;
    }

    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable p1)
    {
        this.h = p1;
        this.c();
        return this;
    }

    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList p1)
    {
        this.l = p1;
        this.n = 1;
        this.c();
        return this;
    }

    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff$Mode p1)
    {
        this.m = p1;
        this.o = 1;
        this.c();
        return this;
    }

    public final android.view.MenuItem setIntent(android.content.Intent p1)
    {
        this.c = p1;
        return this;
    }

    public final android.view.MenuItem setNumericShortcut(char p1)
    {
        this.d = p1;
        return this;
    }

    public final android.view.MenuItem setNumericShortcut(char p1, int p2)
    {
        this.d = p1;
        this.e = android.view.KeyEvent.normalizeMetaState(p2);
        return this;
    }

    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem$OnActionExpandListener p1)
    {
        throw new UnsupportedOperationException();
    }

    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener p1)
    {
        return this;
    }

    public final android.view.MenuItem setShortcut(char p1, char p2)
    {
        this.d = p1;
        this.f = Character.toLowerCase(p2);
        return this;
    }

    public final android.view.MenuItem setShortcut(char p1, char p2, int p3, int p4)
    {
        this.d = p1;
        this.e = android.view.KeyEvent.normalizeMetaState(p3);
        this.f = Character.toLowerCase(p2);
        this.g = android.view.KeyEvent.normalizeMetaState(p4);
        return this;
    }

    public final void setShowAsAction(int p1)
    {
        return;
    }

    public final android.view.MenuItem setShowAsActionFlags(int p1)
    {
        return this;
    }

    public final android.view.MenuItem setTitle(int p2)
    {
        this.a = this.i.getResources().getString(p2);
        return this;
    }

    public final android.view.MenuItem setTitle(CharSequence p1)
    {
        this.a = p1;
        return this;
    }

    public final android.view.MenuItem setTitleCondensed(CharSequence p1)
    {
        this.b = p1;
        return this;
    }

    public final android.view.MenuItem setTooltipText(CharSequence p1)
    {
        this.k = p1;
        return this;
    }

    public final j0.a setTooltipText(CharSequence p1)
    {
        this.k = p1;
        return this;
    }

    public final android.view.MenuItem setVisible(boolean p3)
    {
        int v1 = 8;
        if (p3 != 0) {
            v1 = 0;
        }
        this.p = ((this.p & 8) | v1);
        return this;
    }
}
