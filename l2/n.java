package l2;
public final synthetic class n implements android.view.View$OnClickListener {
    public final synthetic int a;
    public final synthetic android.view.ViewGroup b;

    public synthetic n(android.view.ViewGroup p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onClick(android.view.View p3)
    {
        switch (this.a) {
            case 0:
                android.view.ViewGroup v3_1 = this.b;
                if (v3_1.getVisibility() == 0) {
                    i2.y.i(v3_1, 100);
                }
                return;
            default:
                android.view.ViewGroup v3_2 = this.b;
                if (v3_2.getVisibility() == 8) {
                    i2.y.i(v3_2, 200);
                }
                return;
        }
    }
}
