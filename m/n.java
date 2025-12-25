package m;
public final class n implements android.content.DialogInterface$OnKeyListener, android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnDismissListener, m.x {
    public m.e0 a;
    public h.g b;
    public m.i c;

    public final void a(m.m p1, boolean p2)
    {
        if ((p2 != null) || (p1 == this.a)) {
            h.g v1_1 = this.b;
            if (v1_1 != null) {
                v1_1.dismiss();
            }
        }
        return;
    }

    public final boolean h(m.m p1)
    {
        return 0;
    }

    public final void onClick(android.content.DialogInterface p3, int p4)
    {
        p3 = this.a;
        int v0_0 = this.c;
        if (v0_0.f == null) {
            v0_0.f = new m.h(v0_0);
        }
        p3.q(v0_0.f.b(p4), 0, 0);
        return;
    }

    public final void onDismiss(android.content.DialogInterface p3)
    {
        this.c.a(this.a, 1);
        return;
    }

    public final boolean onKey(android.content.DialogInterface p4, int p5, android.view.KeyEvent p6)
    {
        m.e0 v0 = this.a;
        if ((p5 == 82) || (p5 == 4)) {
            if ((p6.getAction() != 0) || (p6.getRepeatCount() != 0)) {
                if ((p6.getAction() == 1) && (!p6.isCanceled())) {
                    boolean v1_5 = this.b.getWindow();
                    if (v1_5) {
                        boolean v1_6 = v1_5.getDecorView();
                        if (v1_6) {
                            boolean v1_7 = v1_6.getKeyDispatcherState();
                            if ((v1_7) && (v1_7.isTracking(p6))) {
                                v0.c(1);
                                p4.dismiss();
                                return 1;
                            }
                        }
                    }
                }
            } else {
                android.view.KeyEvent$DispatcherState v4_2 = this.b.getWindow();
                if (v4_2 != null) {
                    android.view.KeyEvent$DispatcherState v4_3 = v4_2.getDecorView();
                    if (v4_3 != null) {
                        android.view.KeyEvent$DispatcherState v4_4 = v4_3.getKeyDispatcherState();
                        if (v4_4 != null) {
                            v4_4.startTracking(p6, this);
                            return 1;
                        }
                    }
                }
            }
        }
        return v0.performShortcut(p5, p6, 0);
    }
}
