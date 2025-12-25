package l2;
public final synthetic class p implements android.view.View$OnClickListener {
    public final synthetic l2.a0 a;
    public final synthetic android.widget.ImageButton[] b;
    public final synthetic android.widget.ImageButton c;
    public final synthetic int d;
    public final synthetic android.widget.TextView e;

    public synthetic p(l2.a0 p1, android.widget.ImageButton[] p2, android.widget.ImageButton p3, int p4, android.widget.TextView p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public final void onClick(android.view.View p8)
    {
        l2.a0 v0 = this.a;
        v0.getClass();
        android.widget.ImageButton[] v2 = this.b;
        if ((p8 instanceof android.widget.ImageButton)) {
            android.widget.TextView v1_2 = v2.length;
            int v4 = 0;
            while (v4 < v1_2) {
                int v6;
                android.widget.ImageButton v5 = v2[v4];
                if (v5 != p8) {
                    v6 = 0;
                } else {
                    v6 = 1;
                }
                v5.setSelected(v6);
                v4++;
            }
        }
        i2.y.b(this.c);
        int v8_1 = this.d;
        v0.y(v8_1, this.e);
        v0.m(v2, v8_1);
        return;
    }
}
