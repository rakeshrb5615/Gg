package n;
public final class t0 extends g0.b {
    public final synthetic int h;
    public final synthetic int i;
    public final synthetic ref.WeakReference j;
    public final synthetic n.x0 k;

    public t0(n.x0 p1, int p2, int p3, ref.WeakReference p4)
    {
        this.k = p1;
        this.h = p2;
        this.i = p3;
        this.j = p4;
        return;
    }

    public final void h(int p1)
    {
        return;
    }

    public final void i(android.graphics.Typeface p4)
    {
        if (android.os.Build$VERSION.SDK_INT >= 28) {
            android.widget.TextView v1_5 = this.h;
            if (v1_5 != -1) {
                int v0_1;
                if ((this.i & 2) == 0) {
                    v0_1 = 0;
                } else {
                    v0_1 = 1;
                }
                p4 = n.w0.a(p4, v1_5, v0_1);
            }
        }
        int v0_2 = this.k;
        if (v0_2.m) {
            v0_2.l = p4;
            android.widget.TextView v1_4 = ((android.widget.TextView) this.j.get());
            if (v1_4 != null) {
                if (!v1_4.isAttachedToWindow()) {
                    v1_4.setTypeface(p4, v0_2.j);
                } else {
                    v1_4.post(new h3.a(v1_4, p4, v0_2.j));
                    return;
                }
            }
        }
        return;
    }
}
