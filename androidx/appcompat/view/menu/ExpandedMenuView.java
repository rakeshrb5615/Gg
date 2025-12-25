package androidx.appcompat.view.menu;
public final class ExpandedMenuView extends android.widget.ListView implements m.l, m.a0, android.widget.AdapterView$OnItemClickListener {
    public static final int[] b;
    public m.m a;

    static ExpandedMenuView()
    {
        androidx.appcompat.view.menu.ExpandedMenuView.b = new int[] {16842964, 16843049});
        return;
    }

    public ExpandedMenuView(android.content.Context p3, android.util.AttributeSet p4)
    {
        super(p3, p4);
        super.setOnItemClickListener(super);
        b8.g v3_1 = b8.g.p(p3, p4, androidx.appcompat.view.menu.ExpandedMenuView.b, 16842868);
        android.graphics.drawable.Drawable v4_4 = ((android.content.res.TypedArray) v3_1.c);
        if (v4_4.hasValue(0)) {
            super.setBackgroundDrawable(v3_1.i(0));
        }
        if (v4_4.hasValue(1)) {
            super.setDivider(v3_1.i(1));
        }
        v3_1.r();
        return;
    }

    public final void b(m.m p1)
    {
        this.a = p1;
        return;
    }

    public final boolean c(m.o p4)
    {
        return this.a.q(p4, 0, 0);
    }

    public int getWindowAnimations()
    {
        return 0;
    }

    public final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        this.setChildrenDrawingCacheEnabled(0);
        return;
    }

    public final void onItemClick(android.widget.AdapterView p1, android.view.View p2, int p3, long p4)
    {
        this.c(((m.o) this.getAdapter().getItem(p3)));
        return;
    }
}
