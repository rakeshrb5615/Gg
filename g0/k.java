package g0;
public final synthetic class k implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic int b;
    public final synthetic Object c;

    public synthetic k(Object p1, int p2, int p3)
    {
        this.a = p3;
        this.c = p1;
        this.b = p2;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                ((g0.b) this.c).h(this.b);
                return;
            case 1:
                ((android.view.View) this.c).setVisibility(this.b);
                return;
            case 2:
                androidx.recyclerview.widget.LinearLayoutManager v0_8 = ((android.widget.ScrollView) this.c);
                androidx.recyclerview.widget.RecyclerView v2_1 = this.b;
                if (v0_8.getHeight() > v2_1) {
                    int v1_9 = v0_8.getLayoutParams();
                    v1_9.height = v2_1;
                    v0_8.setLayoutParams(v1_9);
                }
                return;
            case 3:
                androidx.recyclerview.widget.LinearLayoutManager v0_4 = ((l2.a0) this.c);
                v0_4.g2.getClass();
                int v1_5 = this.b;
                if (v1_5 == 0) {
                    v1_5 = (v0_4.s.size() * 2000);
                }
                v0_4.h2.addOnLayoutChangeListener(new l2.u(v0_4, v1_5));
                return;
            case 4:
                androidx.recyclerview.widget.LinearLayoutManager v0_7 = ((l2.u) this.c).b;
                androidx.recyclerview.widget.RecyclerView v2_2 = this.b;
                int v1_16 = v0_7.i2.q(v2_2);
                if (v1_16 != 0) {
                    v0_7.i2.d1(v2_2, ((v0_7.h2.getWidth() / 2) - ((int) (((float) v1_16.getWidth()) * 1052938076))));
                }
                return;
            default:
                androidx.recyclerview.widget.LinearLayoutManager v0_14 = ((com.google.android.material.sidesheet.SideSheetBehavior) this.c);
                int v1_15 = ((android.view.View) v0_14.p.get());
                if (v1_15 != 0) {
                    v0_14.y(v1_15, this.b, 0);
                }
                return;
        }
    }
}
