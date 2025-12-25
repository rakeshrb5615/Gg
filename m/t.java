package m;
public final class t extends h.z implements android.view.MenuItem {
    public final j0.a c;
    public reflect.Method d;

    public t(android.content.Context p1, j0.a p2)
    {
        super(p1);
        if (p2 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        } else {
            super.c = p2;
            return;
        }
    }

    public final boolean collapseActionView()
    {
        return this.c.collapseActionView();
    }

    public final boolean expandActionView()
    {
        return this.c.expandActionView();
    }

    public final android.view.ActionProvider getActionProvider()
    {
        int v0_1 = this.c.a();
        if (v0_1 == 0) {
            return 0;
        } else {
            return v0_1.b;
        }
    }

    public final android.view.View getActionView()
    {
        android.view.View v0_1 = this.c.getActionView();
        if ((v0_1 instanceof m.q)) {
            v0_1 = ((android.view.View) ((m.q) v0_1).a);
        }
        return v0_1;
    }

    public final int getAlphabeticModifiers()
    {
        return this.c.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut()
    {
        return this.c.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription()
    {
        return this.c.getContentDescription();
    }

    public final int getGroupId()
    {
        return this.c.getGroupId();
    }

    public final android.graphics.drawable.Drawable getIcon()
    {
        return this.c.getIcon();
    }

    public final android.content.res.ColorStateList getIconTintList()
    {
        return this.c.getIconTintList();
    }

    public final android.graphics.PorterDuff$Mode getIconTintMode()
    {
        return this.c.getIconTintMode();
    }

    public final android.content.Intent getIntent()
    {
        return this.c.getIntent();
    }

    public final int getItemId()
    {
        return this.c.getItemId();
    }

    public final android.view.ContextMenu$ContextMenuInfo getMenuInfo()
    {
        return this.c.getMenuInfo();
    }

    public final int getNumericModifiers()
    {
        return this.c.getNumericModifiers();
    }

    public final char getNumericShortcut()
    {
        return this.c.getNumericShortcut();
    }

    public final int getOrder()
    {
        return this.c.getOrder();
    }

    public final android.view.SubMenu getSubMenu()
    {
        return this.c.getSubMenu();
    }

    public final CharSequence getTitle()
    {
        return this.c.getTitle();
    }

    public final CharSequence getTitleCondensed()
    {
        return this.c.getTitleCondensed();
    }

    public final CharSequence getTooltipText()
    {
        return this.c.getTooltipText();
    }

    public final boolean hasSubMenu()
    {
        return this.c.hasSubMenu();
    }

    public final boolean isActionViewExpanded()
    {
        return this.c.isActionViewExpanded();
    }

    public final boolean isCheckable()
    {
        return this.c.isCheckable();
    }

    public final boolean isChecked()
    {
        return this.c.isChecked();
    }

    public final boolean isEnabled()
    {
        return this.c.isEnabled();
    }

    public final boolean isVisible()
    {
        return this.c.isVisible();
    }

    public final android.view.MenuItem setActionProvider(android.view.ActionProvider p2)
    {
        int v0_1 = new m.p(this, p2);
        if (p2 == null) {
            v0_1 = 0;
        }
        this.c.b(v0_1);
        return this;
    }

    public final android.view.MenuItem setActionView(int p3)
    {
        j0.a v0 = this.c;
        v0.setActionView(p3);
        android.view.View v3_1 = v0.getActionView();
        if ((v3_1 instanceof android.view.CollapsibleActionView)) {
            v0.setActionView(new m.q(v3_1));
        }
        return this;
    }

    public final android.view.MenuItem setActionView(android.view.View p2)
    {
        if ((p2 instanceof android.view.CollapsibleActionView)) {
            p2 = new m.q(p2);
        }
        this.c.setActionView(p2);
        return this;
    }

    public final android.view.MenuItem setAlphabeticShortcut(char p2)
    {
        this.c.setAlphabeticShortcut(p2);
        return this;
    }

    public final android.view.MenuItem setAlphabeticShortcut(char p2, int p3)
    {
        this.c.setAlphabeticShortcut(p2, p3);
        return this;
    }

    public final android.view.MenuItem setCheckable(boolean p2)
    {
        this.c.setCheckable(p2);
        return this;
    }

    public final android.view.MenuItem setChecked(boolean p2)
    {
        this.c.setChecked(p2);
        return this;
    }

    public final android.view.MenuItem setContentDescription(CharSequence p2)
    {
        this.c.setContentDescription(p2);
        return this;
    }

    public final android.view.MenuItem setEnabled(boolean p2)
    {
        this.c.setEnabled(p2);
        return this;
    }

    public final android.view.MenuItem setIcon(int p2)
    {
        this.c.setIcon(p2);
        return this;
    }

    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable p2)
    {
        this.c.setIcon(p2);
        return this;
    }

    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList p2)
    {
        this.c.setIconTintList(p2);
        return this;
    }

    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff$Mode p2)
    {
        this.c.setIconTintMode(p2);
        return this;
    }

    public final android.view.MenuItem setIntent(android.content.Intent p2)
    {
        this.c.setIntent(p2);
        return this;
    }

    public final android.view.MenuItem setNumericShortcut(char p2)
    {
        this.c.setNumericShortcut(p2);
        return this;
    }

    public final android.view.MenuItem setNumericShortcut(char p2, int p3)
    {
        this.c.setNumericShortcut(p2, p3);
        return this;
    }

    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem$OnActionExpandListener p2)
    {
        int v0_0;
        if (p2 == null) {
            v0_0 = 0;
        } else {
            v0_0 = new m.r(this, p2);
        }
        this.c.setOnActionExpandListener(v0_0);
        return this;
    }

    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener p2)
    {
        int v0_0;
        if (p2 == null) {
            v0_0 = 0;
        } else {
            v0_0 = new m.s(this, p2);
        }
        this.c.setOnMenuItemClickListener(v0_0);
        return this;
    }

    public final android.view.MenuItem setShortcut(char p2, char p3)
    {
        this.c.setShortcut(p2, p3);
        return this;
    }

    public final android.view.MenuItem setShortcut(char p2, char p3, int p4, int p5)
    {
        this.c.setShortcut(p2, p3, p4, p5);
        return this;
    }

    public final void setShowAsAction(int p2)
    {
        this.c.setShowAsAction(p2);
        return;
    }

    public final android.view.MenuItem setShowAsActionFlags(int p2)
    {
        this.c.setShowAsActionFlags(p2);
        return this;
    }

    public final android.view.MenuItem setTitle(int p2)
    {
        this.c.setTitle(p2);
        return this;
    }

    public final android.view.MenuItem setTitle(CharSequence p2)
    {
        this.c.setTitle(p2);
        return this;
    }

    public final android.view.MenuItem setTitleCondensed(CharSequence p2)
    {
        this.c.setTitleCondensed(p2);
        return this;
    }

    public final android.view.MenuItem setTooltipText(CharSequence p2)
    {
        this.c.setTooltipText(p2);
        return this;
    }

    public final android.view.MenuItem setVisible(boolean p2)
    {
        return this.c.setVisible(p2);
    }
}
