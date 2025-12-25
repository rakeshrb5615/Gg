package z3;
public final class t extends android.widget.ArrayAdapter {
    public android.content.res.ColorStateList a;
    public android.content.res.ColorStateList b;
    public final synthetic z3.u c;

    public t(z3.u p1, android.content.Context p2, int p3, String[] p4)
    {
        this.c = p1;
        super(p2, p3, p4);
        super.a();
        return;
    }

    public final void a()
    {
        int v5_2;
        int[] v0_0 = this.c;
        int[][] v1_0 = v0_0.r;
        android.content.res.ColorStateList v2_0 = 0;
        if (v1_0 == null) {
            v5_2 = 0;
        } else {
            int v4_6 = new int[] {16842919});
            int v5_0 = new int[0];
            v5_2 = new android.content.res.ColorStateList(new int[][] {v4_6, v5_0}), new int[] {v1_0.getColorForState(v4_6, 0), 0}));
        }
        this.b = v5_2;
        if ((v0_0.q != 0) && (v0_0.r != null)) {
            int[][] v1_6 = new int[] {16843623, -16842919});
            android.content.res.ColorStateList v2_2 = new int[] {16842913, -16842919});
            int[] v3_1 = new int[0];
            v2_0 = new android.content.res.ColorStateList(new int[][] {v2_2, v1_6, v3_1}), new int[] {h0.a.e(v0_0.r.getColorForState(v2_2, 0), v0_0.q), h0.a.e(v0_0.r.getColorForState(v1_6, 0), v0_0.q), v0_0.q}));
        }
        this.a = v2_0;
        return;
    }

    public final android.view.View getView(int p4, android.view.View p5, android.view.ViewGroup p6)
    {
        android.view.View v4_1 = super.getView(p4, p5, p6);
        if ((v4_1 instanceof android.widget.TextView)) {
            android.widget.TextView v5_3 = ((android.widget.TextView) v4_1);
            android.graphics.drawable.RippleDrawable v6_6 = this.c;
            android.graphics.drawable.ColorDrawable v1_1 = 0;
            if ((v6_6.getText().toString().contentEquals(v5_3.getText())) && (v6_6.q != 0)) {
                android.graphics.drawable.ColorDrawable v0_4 = new android.graphics.drawable.ColorDrawable(v6_6.q);
                if (this.b == null) {
                    v1_1 = v0_4;
                } else {
                    v0_4.setTintList(this.a);
                    v1_1 = new android.graphics.drawable.RippleDrawable(this.b, v0_4, 0);
                }
            }
            v5_3.setBackground(v1_1);
        }
        return v4_1;
    }
}
