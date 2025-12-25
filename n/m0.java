package n;
public final class m0 implements android.widget.AdapterView$OnItemClickListener {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic m0(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onItemClick(android.widget.AdapterView p11, android.view.View p12, int p13, long p14)
    {
        switch (this.a) {
            case 0:
                n.t1 v11_4 = ((n.o0) this.b);
                long v14_1 = v11_4.M;
                v14_1.setSelection(p13);
                if (v14_1.getOnItemClickListener() != null) {
                    v14_1.performItemClick(p12, p13, v11_4.J.getItemId(p13));
                }
                v11_4.dismiss();
                return;
            default:
                CharSequence v2_1;
                n.t1 v11_2 = ((z3.u) this.b);
                long v0_1 = v11_2.e;
                if (p13 >= 0) {
                    v2_1 = v11_2.getAdapter().getItem(p13);
                } else {
                    if (v0_1.F.isShowing()) {
                        v2_1 = v0_1.c.getSelectedItem();
                    } else {
                        v2_1 = 0;
                    }
                }
                v11_2.setText(z3.u.a(v11_2, v2_1), 0);
                android.widget.AdapterView$OnItemClickListener v4 = v11_2.getOnItemClickListener();
                if (v4 != null) {
                    if ((p12 == null) || (p13 < 0)) {
                        if (v0_1.F.isShowing()) {
                            p12 = v0_1.c.getSelectedView();
                        } else {
                            p12 = 0;
                        }
                        n.t1 v11_12;
                        if (v0_1.F.isShowing()) {
                            v11_12 = v0_1.c.getSelectedItemPosition();
                        } else {
                            v11_12 = -1;
                        }
                        p13 = v11_12;
                        if (v0_1.F.isShowing()) {
                            p14 = v0_1.c.getSelectedItemId();
                        } else {
                            p14 = -9223372036854775808;
                        }
                    }
                    v4.onItemClick(v0_1.c, p12, p13, p14);
                }
                v0_1.dismiss();
                return;
        }
    }
}
