package i2;
public final class t0 extends a2.i0 {
    public int d;
    public final android.content.Context e;
    public java.util.ArrayList f;
    public java.util.ArrayList g;
    public final l2.f h;
    public final androidx.recyclerview.widget.RecyclerView i;

    public t0(java.util.ArrayList p2, l2.f p3, android.content.Context p4, androidx.recyclerview.widget.RecyclerView p5)
    {
        this.g = new java.util.ArrayList(p2);
        this.h = p3;
        this.e = p4;
        this.i = p5;
        this.f = new java.util.ArrayList(java.util.Collections.nCopies(p2.size(), Float.valueOf(1065353216)));
        return;
    }

    public final int a()
    {
        return 2147483647;
    }

    public final void c(a2.k1 p7, int p8)
    {
        int v0_0 = this.g;
        if ((v0_0 != 0) && (!v0_0.isEmpty())) {
            int v0_4 = (p8 % this.g.size());
            android.widget.ImageButton v1 = ((i2.s0) p7).u;
            i2.r0 v7_2 = ((i2.s0) p7).a;
            v1.setImageBitmap(((android.graphics.Bitmap) this.g.get(v0_4)));
            int v2_3 = this.e;
            int v5 = 1;
            if (v2_3.getResources().getConfiguration().orientation != 1) {
                v5 = 0;
            }
            if (this.d == 0) {
                if (v5 == 0) {
                    this.d = v2_3.getResources().getDisplayMetrics().heightPixels;
                } else {
                    this.d = v2_3.getResources().getDisplayMetrics().widthPixels;
                }
            }
            int v2_11 = ((android.view.ViewGroup$MarginLayoutParams) v7_2.getLayoutParams());
            v2_11.leftMargin = 0;
            v2_11.rightMargin = 0;
            v7_2.setLayoutParams(v2_11);
            i2.r0 v7_8 = ((Float) this.f.get((p8 % this.f.size()))).floatValue();
            v1.setScaleX(v7_8);
            v1.setScaleY(v7_8);
            v1.setOnClickListener(new i2.r0(this, v0_4));
        }
        return;
    }

    public final a2.k1 d(android.view.ViewGroup p4)
    {
        android.widget.ImageButton v4_3 = android.view.LayoutInflater.from(p4.getContext()).inflate(2131558464, p4, 0);
        i2.s0 v0_3 = new i2.s0(v4_3);
        v0_3.u = ((android.widget.ImageButton) v4_3.findViewById(2131362509));
        return v0_3;
    }

    public final void e(a2.k1 p2)
    {
        ((i2.s0) p2).u.setImageBitmap(0);
        return;
    }
}
