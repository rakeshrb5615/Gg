package n;
public final class c2 implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic n.g2 b;

    public synthetic c2(n.g2 p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                n.t1 v0_2 = this.b.c;
                if (v0_2 != null) {
                    v0_2.setListSelectionHidden(1);
                    v0_2.requestLayout();
                }
                return;
            default:
                n.t1 v0_3 = this.b;
                n.b0 v1_0 = v0_3.c;
                if ((v1_0 != null) && ((v1_0.isAttachedToWindow()) && ((v0_3.c.getCount() > v0_3.c.getChildCount()) && (v0_3.c.getChildCount() <= v0_3.s)))) {
                    v0_3.F.setInputMethodMode(2);
                    v0_3.c();
                }
                return;
        }
    }
}
