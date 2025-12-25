package i2;
public final synthetic class d0 implements android.view.View$OnClickListener {
    public final synthetic int a;
    public final synthetic com.chilllive.chillwallpaperproject.MainActivity b;
    public final synthetic android.widget.ImageButton c;

    public synthetic d0(com.chilllive.chillwallpaperproject.MainActivity p1, android.widget.ImageButton p2, int p3)
    {
        this.a = p3;
        this.b = p1;
        this.c = p2;
        return;
    }

    public final void onClick(android.view.View p4)
    {
        android.widget.ImageButton v1 = this.c;
        com.chilllive.chillwallpaperproject.MainActivity v2 = this.b;
        switch (this.a) {
            case 0:
                Class vtmp2 = v2.getClass();
                i2.y.b(v1);
                c4.b.b0(v2, v2.b);
                return;
            case 1:
                Class vtmp3 = v2.getClass();
                i2.y.b(v1);
                c4.b.K(v2, p4.getContext());
                return;
            default:
                Class vtmp1 = v2.getClass();
                i2.y.b(v1);
                c4.b.F(v2.b);
                return;
        }
    }
}
