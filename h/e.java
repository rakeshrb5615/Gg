package h;
public final class e {
    public final android.content.Context a;
    public final h.g b;
    public final android.view.Window c;
    public CharSequence d;
    public androidx.appcompat.app.AlertController$RecycleListView e;
    public android.widget.Button f;
    public android.widget.Button g;
    public android.widget.Button h;
    public androidx.core.widget.NestedScrollView i;
    public android.graphics.drawable.Drawable j;
    public android.widget.ImageView k;
    public android.widget.TextView l;
    public android.widget.TextView m;
    public android.view.View n;
    public android.widget.ListAdapter o;
    public int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    public final h.c v;
    public final com.google.android.material.datepicker.m w;

    public e(android.content.Context p4, h.g p5, android.view.Window p6)
    {
        this.p = -1;
        this.w = new com.google.android.material.datepicker.m(this, 1);
        this.a = p4;
        this.b = p5;
        this.c = p6;
        boolean v6_2 = new h.c();
        v6_2.b = new ref.WeakReference(p5);
        this.v = v6_2;
        h.p v4_1 = p4.obtainStyledAttributes(0, g.a.e, 2130968623, 0);
        this.q = v4_1.getResourceId(0, 0);
        v4_1.getResourceId(2, 0);
        this.r = v4_1.getResourceId(4, 0);
        v4_1.getResourceId(5, 0);
        this.s = v4_1.getResourceId(7, 0);
        this.t = v4_1.getResourceId(3, 0);
        this.u = v4_1.getBoolean(6, 1);
        v4_1.getDimensionPixelSize(1, 0);
        v4_1.recycle();
        p5.c().k(1);
        return;
    }

    public static android.view.ViewGroup a(android.view.View p2, android.view.View p3)
    {
        if (p2 != null) {
            if (p3) {
                android.view.ViewGroup v0_0 = p3.getParent();
                if ((v0_0 instanceof android.view.ViewGroup)) {
                    ((android.view.ViewGroup) v0_0).removeView(p3);
                }
            }
            if ((p2 instanceof android.view.ViewStub)) {
                p2 = ((android.view.ViewStub) p2).inflate();
            }
            return ((android.view.ViewGroup) p2);
        } else {
            if ((p3 instanceof android.view.ViewStub)) {
                p3 = ((android.view.ViewStub) p3).inflate();
            }
            return ((android.view.ViewGroup) p3);
        }
    }
}
