package n;
public final class b extends android.graphics.drawable.Drawable {
    public final androidx.appcompat.widget.ActionBarContainer a;

    public b(androidx.appcompat.widget.ActionBarContainer p1)
    {
        this.a = p1;
        return;
    }

    public final void draw(android.graphics.Canvas p3)
    {
        boolean v0_0 = this.a;
        if (!v0_0.m) {
            android.graphics.drawable.Drawable v1_1 = v0_0.d;
            if (v1_1 != null) {
                v1_1.draw(p3);
            }
            android.graphics.drawable.Drawable v1_2 = v0_0.e;
            if ((v1_2 != null) && (v0_0.n)) {
                v1_2.draw(p3);
            }
        } else {
            boolean v0_1 = v0_0.f;
            if (v0_1) {
                v0_1.draw(p3);
                return;
            }
        }
        return;
    }

    public final int getOpacity()
    {
        return 0;
    }

    public final void getOutline(android.graphics.Outline p3)
    {
        android.graphics.drawable.Drawable v0_0 = this.a;
        if (!v0_0.m) {
            android.graphics.drawable.Drawable v0_1 = v0_0.d;
            if (v0_1 != null) {
                v0_1.getOutline(p3);
            }
        } else {
            if (v0_0.f != null) {
                v0_0.d.getOutline(p3);
                return;
            }
        }
        return;
    }

    public final void setAlpha(int p1)
    {
        return;
    }

    public final void setColorFilter(android.graphics.ColorFilter p1)
    {
        return;
    }
}
