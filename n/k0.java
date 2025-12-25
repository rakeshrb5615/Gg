package n;
public final class k0 implements n.q0, android.content.DialogInterface$OnClickListener {
    public h.g a;
    public n.l0 b;
    public CharSequence c;
    public final synthetic n.r0 d;

    public k0(n.r0 p1)
    {
        this.d = p1;
        return;
    }

    public final int a()
    {
        return 0;
    }

    public final boolean b()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.isShowing();
        }
    }

    public final void dismiss()
    {
        int v0_0 = this.a;
        if (v0_0 != 0) {
            v0_0.dismiss();
            this.a = 0;
        }
        return;
    }

    public final android.graphics.drawable.Drawable e()
    {
        return 0;
    }

    public final void g(CharSequence p1)
    {
        this.c = p1;
        return;
    }

    public final void h(android.graphics.drawable.Drawable p2)
    {
        android.util.Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        return;
    }

    public final void i(int p2)
    {
        android.util.Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        return;
    }

    public final void j(int p2)
    {
        android.util.Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        return;
    }

    public final void k(int p2)
    {
        android.util.Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        return;
    }

    public final void l(int p5, int p6)
    {
        if (this.b != null) {
            int v1_2 = this.d;
            androidx.appcompat.app.AlertController$RecycleListView v0_5 = new h.f(v1_2.getPopupContext());
            h.b v2_2 = ((h.b) v0_5.c);
            n.l0 v3_1 = this.c;
            if (v3_1 != null) {
                v2_2.d = v3_1;
            }
            n.l0 v3_0 = this.b;
            int v1_0 = v1_2.getSelectedItemPosition();
            v2_2.g = v3_0;
            v2_2.h = this;
            v2_2.j = v1_0;
            v2_2.i = 1;
            androidx.appcompat.app.AlertController$RecycleListView v0_2 = v0_5.b();
            this.a = v0_2;
            androidx.appcompat.app.AlertController$RecycleListView v0_4 = v0_2.m.e;
            v0_4.setTextDirection(p5);
            v0_4.setTextAlignment(p6);
            this.a.show();
            return;
        } else {
            return;
        }
    }

    public final int m()
    {
        return 0;
    }

    public final CharSequence o()
    {
        return this.c;
    }

    public final void onClick(android.content.DialogInterface p4, int p5)
    {
        p4 = this.d;
        p4.setSelection(p5);
        if (p4.getOnItemClickListener() != null) {
            p4.performItemClick(0, p5, this.b.getItemId(p5));
        }
        this.dismiss();
        return;
    }

    public final void p(android.widget.ListAdapter p1)
    {
        this.b = ((n.l0) p1);
        return;
    }
}
