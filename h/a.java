package h;
public final class a implements android.widget.AdapterView$OnItemClickListener {
    public final synthetic h.e a;
    public final synthetic h.b b;

    public a(h.b p1, h.e p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public final void onItemClick(android.widget.AdapterView p1, android.view.View p2, int p3, long p4)
    {
        h.g v1_0 = this.b;
        p4 = this.a;
        v1_0.h.onClick(p4.b, p3);
        if (!v1_0.i) {
            p4.b.dismiss();
        }
        return;
    }
}
