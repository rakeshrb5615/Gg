package l;
public final class c extends android.content.ContextWrapper {
    public static android.content.res.Configuration f;
    public int a;
    public android.content.res.Resources$Theme b;
    public android.view.LayoutInflater c;
    public android.content.res.Configuration d;
    public android.content.res.Resources e;

    public c(android.content.Context p1, int p2)
    {
        super(p1);
        super.a = p2;
        return;
    }

    public final void a(android.content.res.Configuration p2)
    {
        if (this.e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else {
            if (this.d != null) {
                throw new IllegalStateException("Override configuration has already been set");
            } else {
                this.d = new android.content.res.Configuration(p2);
                return;
            }
        }
    }

    public final void attachBaseContext(android.content.Context p1)
    {
        super.attachBaseContext(p1);
        return;
    }

    public final void b()
    {
        if (this.b == null) {
            this.b = this.getResources().newTheme();
            android.content.res.Resources$Theme v0_1 = this.getBaseContext().getTheme();
            if (v0_1 != null) {
                this.b.setTo(v0_1);
            }
        }
        this.b.applyStyle(this.a, 1);
        return;
    }

    public final android.content.res.AssetManager getAssets()
    {
        return this.getResources().getAssets();
    }

    public final android.content.res.Resources getResources()
    {
        if (this.e == null) {
            android.content.res.Resources v0_5 = this.d;
            if (v0_5 != null) {
                if (l.c.f == null) {
                    android.content.res.Configuration v1_3 = new android.content.res.Configuration();
                    v1_3.fontScale = 0;
                    l.c.f = v1_3;
                }
                if (!v0_5.equals(l.c.f)) {
                    this.e = this.createConfigurationContext(this.d).getResources();
                    return this.e;
                }
            }
            this.e = super.getResources();
        }
        return this.e;
    }

    public final Object getSystemService(String p2)
    {
        if (!"layout_inflater".equals(p2)) {
            return this.getBaseContext().getSystemService(p2);
        } else {
            if (this.c == null) {
                this.c = android.view.LayoutInflater.from(this.getBaseContext()).cloneInContext(this);
            }
            return this.c;
        }
    }

    public final android.content.res.Resources$Theme getTheme()
    {
        android.content.res.Resources$Theme v0_0 = this.b;
        if (v0_0 == null) {
            if (this.a == 0) {
                this.a = 2132017803;
            }
            this.b();
            return this.b;
        } else {
            return v0_0;
        }
    }

    public final void setTheme(int p2)
    {
        if (this.a != p2) {
            this.a = p2;
            this.b();
        }
        return;
    }
}
