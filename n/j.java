package n;
public final class j extends n.z implements n.l {
    public final synthetic n.k d;

    public j(n.k p2, android.content.Context p3)
    {
        this.d = p2;
        super(p3, 0, 2130968610);
        super.setClickable(1);
        super.setFocusable(1);
        super.setVisibility(0);
        super.setEnabled(1);
        n.g3.a(super, super.getContentDescription());
        super.setOnTouchListener(new m.b(super, super));
        return;
    }

    public final boolean b()
    {
        return 0;
    }

    public final boolean c()
    {
        return 0;
    }

    public final boolean performClick()
    {
        if (!super.performClick()) {
            this.playSoundEffect(0);
            this.d.l();
            return 1;
        } else {
            return 1;
        }
    }

    public final boolean setFrame(int p5, int p6, int p7, int p8)
    {
        boolean v5_1 = super.setFrame(p5, p6, p7, p8);
        int v6_3 = this.getDrawable();
        android.graphics.drawable.Drawable v7_1 = this.getBackground();
        if ((v6_3 != 0) && (v7_1 != null)) {
            int v6_5 = this.getWidth();
            int v8_1 = this.getHeight();
            int v0_1 = (Math.max(v6_5, v8_1) / 2);
            int v6_2 = ((v6_5 + (this.getPaddingLeft() - this.getPaddingRight())) / 2);
            int v8_3 = ((v8_1 + (this.getPaddingTop() - this.getPaddingBottom())) / 2);
            v7_1.setHotspotBounds((v6_2 - v0_1), (v8_3 - v0_1), (v6_2 + v0_1), (v8_3 + v0_1));
        }
        return v5_1;
    }
}
