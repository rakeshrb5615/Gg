package m;
public class b0 extends h.z implements android.view.Menu {
    public final m.m c;

    public b0(android.content.Context p1, m.m p2)
    {
        super(p1);
        if (p2 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        } else {
            super.c = p2;
            return;
        }
    }

    public final android.view.MenuItem add(int p2)
    {
        return this.f(this.c.add(p2));
    }

    public final android.view.MenuItem add(int p2, int p3, int p4, int p5)
    {
        return this.f(this.c.add(p2, p3, p4, p5));
    }

    public final android.view.MenuItem add(int p2, int p3, int p4, CharSequence p5)
    {
        return this.f(this.c.a(p2, p3, p4, p5));
    }

    public final android.view.MenuItem add(CharSequence p3)
    {
        return this.f(this.c.a(0, 0, 0, p3));
    }

    public final int addIntentOptions(int p12, int p13, int p14, android.content.ComponentName p15, android.content.Intent[] p16, android.content.Intent p17, int p18, android.view.MenuItem[] p19)
    {
        int v1_0;
        if (p19 == null) {
            v1_0 = 0;
        } else {
            v1_0 = new android.view.MenuItem[p19.length];
        }
        int v10 = v1_0;
        int v12_1 = this.c.addIntentOptions(p12, p13, p14, p15, p16, p17, p18, v10);
        if (v10 != 0) {
            int v13_1 = v10.length;
            int v14_1 = 0;
            while (v14_1 < v13_1) {
                p19[v14_1] = this.f(v10[v14_1]);
                v14_1++;
            }
        }
        return v12_1;
    }

    public final android.view.SubMenu addSubMenu(int p2)
    {
        return this.c.addSubMenu(p2);
    }

    public final android.view.SubMenu addSubMenu(int p2, int p3, int p4, int p5)
    {
        return this.c.addSubMenu(p2, p3, p4, p5);
    }

    public final android.view.SubMenu addSubMenu(int p2, int p3, int p4, CharSequence p5)
    {
        return this.c.addSubMenu(p2, p3, p4, p5);
    }

    public final android.view.SubMenu addSubMenu(CharSequence p3)
    {
        return this.c.addSubMenu(0, 0, 0, p3);
    }

    public final void clear()
    {
        m.m v0_1 = ((r.j) this.b);
        if (v0_1 != null) {
            v0_1.clear();
        }
        this.c.clear();
        return;
    }

    public final void close()
    {
        this.c.close();
        return;
    }

    public final android.view.MenuItem findItem(int p2)
    {
        return this.f(this.c.findItem(p2));
    }

    public final android.view.MenuItem getItem(int p2)
    {
        return this.f(this.c.getItem(p2));
    }

    public final boolean hasVisibleItems()
    {
        return this.c.hasVisibleItems();
    }

    public final boolean isShortcutKey(int p2, android.view.KeyEvent p3)
    {
        return this.c.isShortcutKey(p2, p3);
    }

    public final boolean performIdentifierAction(int p2, int p3)
    {
        return this.c.performIdentifierAction(p2, p3);
    }

    public final boolean performShortcut(int p2, android.view.KeyEvent p3, int p4)
    {
        return this.c.performShortcut(p2, p3, p4);
    }

    public final void removeGroup(int p4)
    {
        if (((r.j) this.b) != null) {
            int v0_2 = 0;
            while(true) {
                r.j v1_5 = ((r.j) this.b);
                if (v0_2 >= v1_5.c) {
                    break;
                }
                if (((j0.a) v1_5.g(v0_2)).getGroupId() == p4) {
                    ((r.j) this.b).h(v0_2);
                    v0_2--;
                }
                v0_2++;
            }
        }
        this.c.removeGroup(p4);
        return;
    }

    public final void removeItem(int p4)
    {
        if (((r.j) this.b) != null) {
            int v0_2 = 0;
            while(true) {
                r.j v1_5 = ((r.j) this.b);
                if (v0_2 < v1_5.c) {
                    if (((j0.a) v1_5.g(v0_2)).getItemId() == p4) {
                        break;
                    }
                    v0_2++;
                }
            }
            ((r.j) this.b).h(v0_2);
        }
        this.c.removeItem(p4);
        return;
    }

    public final void setGroupCheckable(int p2, boolean p3, boolean p4)
    {
        this.c.setGroupCheckable(p2, p3, p4);
        return;
    }

    public final void setGroupEnabled(int p2, boolean p3)
    {
        this.c.setGroupEnabled(p2, p3);
        return;
    }

    public final void setGroupVisible(int p2, boolean p3)
    {
        this.c.setGroupVisible(p2, p3);
        return;
    }

    public final void setQwertyMode(boolean p2)
    {
        this.c.setQwertyMode(p2);
        return;
    }

    public final int size()
    {
        return this.c.size();
    }
}
