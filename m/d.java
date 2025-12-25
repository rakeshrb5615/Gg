package m;
public final class d implements android.view.ViewTreeObserver$OnGlobalLayoutListener {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic d(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onGlobalLayout()
    {
        switch (this.a) {
            case 0:
                int v0_7 = ((m.g) this.b);
                n.q0 v1_1 = v0_7.n;
                if ((v0_7.b()) && (v1_1.size() > 0)) {
                    int v2_7 = 0;
                    if (!((m.f) v1_1.get(0)).a.E) {
                        n.l2 v3_5 = v0_7.u;
                        if ((v3_5 != null) && (v3_5.isShown())) {
                            int v0_8 = v1_1.size();
                            while (v2_7 < v0_8) {
                                n.l2 v3_7 = v1_1.get(v2_7);
                                v2_7++;
                                ((m.f) v3_7).a.c();
                            }
                        } else {
                            v0_7.dismiss();
                        }
                    }
                }
                return;
            case 1:
                int v0_4 = ((m.d0) this.b);
                n.q0 v1_0 = v0_4.n;
                if ((v0_4.b()) && (!v1_0.E)) {
                    int v2_3 = v0_4.s;
                    if ((v2_3 != 0) && (v2_3.isShown())) {
                        v1_0.c();
                    } else {
                        v0_4.dismiss();
                    }
                }
                return;
            case 2:
                int v0_5 = ((n.r0) this.b);
                if (!v0_5.getInternalPopup().b()) {
                    v0_5.f.l(v0_5.getTextDirection(), v0_5.getTextAlignment());
                }
                int v0_1 = v0_5.getViewTreeObserver();
                if (v0_1 != 0) {
                    v0_1.removeOnGlobalLayoutListener(this);
                }
                return;
            default:
                int v0_10 = ((n.o0) this.b);
                n.q0 v1_4 = v0_10.M;
                v0_10.getClass();
                if ((!v1_4.isAttachedToWindow()) || (!v1_4.getGlobalVisibleRect(v0_10.K))) {
                    v0_10.dismiss();
                } else {
                    v0_10.s();
                    v0_10.c();
                }
                return;
        }
    }
}
