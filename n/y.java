package n;
public class y extends android.widget.ImageButton {
    public final n.p a;
    public final g0.d b;
    public boolean c;

    public y(android.content.Context p1, android.util.AttributeSet p2, int p3)
    {
        n.u2.a(p1);
        super(p1, p2, p3);
        super.c = 0;
        n.t2.a(super, super.getContext());
        g0.d v1_6 = new n.p(super);
        super.a = v1_6;
        v1_6.q(p2, p3);
        g0.d v1_2 = new g0.d(super);
        super.b = v1_2;
        v1_2.f(p2, p3);
        return;
    }

    public final void drawableStateChanged()
    {
        super.drawableStateChanged();
        g0.d v0_0 = this.a;
        if (v0_0 != null) {
            v0_0.a();
        }
        g0.d v0_1 = this.b;
        if (v0_1 != null) {
            v0_1.a();
        }
        return;
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.o();
        }
    }

    public android.graphics.PorterDuff$Mode getSupportBackgroundTintMode()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.p();
        }
    }

    public android.content.res.ColorStateList getSupportImageTintList()
    {
        android.content.res.ColorStateList v0 = 0;
        n.v2 v1_0 = this.b;
        if (v1_0 != null) {
            n.v2 v1_2 = ((n.v2) v1_0.d);
            if (v1_2 != null) {
                v0 = v1_2.a;
            }
        }
        return v0;
    }

    public android.graphics.PorterDuff$Mode getSupportImageTintMode()
    {
        android.graphics.PorterDuff$Mode v0 = 0;
        n.v2 v1_0 = this.b;
        if (v1_0 != null) {
            n.v2 v1_2 = ((n.v2) v1_0.d);
            if (v1_2 != null) {
                v0 = v1_2.b;
            }
        }
        return v0;
    }

    public final boolean hasOverlappingRendering()
    {
        if (((((android.widget.ImageView) this.b.c).getBackground() instanceof android.graphics.drawable.RippleDrawable)) || (!super.hasOverlappingRendering())) {
            return 0;
        } else {
            return 1;
        }
    }

    public void setBackgroundDrawable(android.graphics.drawable.Drawable p1)
    {
        super.setBackgroundDrawable(p1);
        n.p v1_1 = this.a;
        if (v1_1 != null) {
            v1_1.r();
        }
        return;
    }

    public void setBackgroundResource(int p2)
    {
        super.setBackgroundResource(p2);
        n.p v0 = this.a;
        if (v0 != null) {
            v0.s(p2);
        }
        return;
    }

    public void setImageBitmap(android.graphics.Bitmap p1)
    {
        super.setImageBitmap(p1);
        g0.d v1_1 = this.b;
        if (v1_1 != null) {
            v1_1.a();
        }
        return;
    }

    public void setImageDrawable(android.graphics.drawable.Drawable p3)
    {
        int v0_0 = this.b;
        if ((v0_0 != 0) && ((p3 != null) && (!this.c))) {
            v0_0.b = p3.getLevel();
        }
        super.setImageDrawable(p3);
        if (v0_0 != 0) {
            v0_0.a();
            if (!this.c) {
                android.graphics.drawable.Drawable v3_3 = ((android.widget.ImageView) v0_0.c);
                if (v3_3.getDrawable() != null) {
                    v3_3.getDrawable().setLevel(v0_0.b);
                }
            }
        }
        return;
    }

    public void setImageLevel(int p1)
    {
        super.setImageLevel(p1);
        this.c = 1;
        return;
    }

    public void setImageResource(int p4)
    {
        g0.d v0 = this.b;
        android.widget.ImageView v1_1 = ((android.widget.ImageView) v0.c);
        if (p4 == 0) {
            v1_1.setImageDrawable(0);
        } else {
            int v4_2 = j5.t1.A(v1_1.getContext(), p4);
            if (v4_2 != 0) {
                n.n1.a(v4_2);
            }
            v1_1.setImageDrawable(v4_2);
        }
        v0.a();
        return;
    }

    public void setImageURI(android.net.Uri p1)
    {
        super.setImageURI(p1);
        g0.d v1_1 = this.b;
        if (v1_1 != null) {
            v1_1.a();
        }
        return;
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList p2)
    {
        n.p v0 = this.a;
        if (v0 != null) {
            v0.u(p2);
        }
        return;
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode p2)
    {
        n.p v0 = this.a;
        if (v0 != null) {
            v0.v(p2);
        }
        return;
    }

    public void setSupportImageTintList(android.content.res.ColorStateList p3)
    {
        g0.d v0 = this.b;
        if (v0 != null) {
            if (((n.v2) v0.d) == null) {
                v0.d = new n.v2();
            }
            n.v2 v1_5 = ((n.v2) v0.d);
            v1_5.a = p3;
            v1_5.d = 1;
            v0.a();
        }
        return;
    }

    public void setSupportImageTintMode(android.graphics.PorterDuff$Mode p3)
    {
        g0.d v0 = this.b;
        if (v0 != null) {
            if (((n.v2) v0.d) == null) {
                v0.d = new n.v2();
            }
            n.v2 v1_5 = ((n.v2) v0.d);
            v1_5.b = p3;
            v1_5.c = 1;
            v0.a();
        }
        return;
    }
}
