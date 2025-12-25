package g2;
public final class j extends g2.m {
    public g0.d d;
    public float e;
    public g0.d f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public android.graphics.Paint$Cap l;
    public android.graphics.Paint$Join m;
    public float n;

    public final boolean a()
    {
        if ((!this.f.e()) && (!this.d.e())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean b(int[] p7)
    {
        int v0_1;
        int v0_0 = this.f;
        int v2 = 1;
        if (!v0_0.e()) {
            v0_1 = 0;
        } else {
            g0.d v1_4 = ((android.content.res.ColorStateList) v0_0.d);
            g0.d v1_0 = v1_4.getColorForState(p7, v1_4.getDefaultColor());
            if (v1_0 == v0_0.b) {
            } else {
                v0_0.b = v1_0;
                v0_1 = 1;
            }
        }
        g0.d v1_1 = this.d;
        if (!v1_1.e()) {
            v2 = 0;
        } else {
            int v4_3 = ((android.content.res.ColorStateList) v1_1.d);
            int v7_1 = v4_3.getColorForState(p7, v4_3.getDefaultColor());
            if (v7_1 == v1_1.b) {
            } else {
                v1_1.b = v7_1;
            }
        }
        return (v0_1 | v2);
    }

    public float getFillAlpha()
    {
        return this.h;
    }

    public int getFillColor()
    {
        return this.f.b;
    }

    public float getStrokeAlpha()
    {
        return this.g;
    }

    public int getStrokeColor()
    {
        return this.d.b;
    }

    public float getStrokeWidth()
    {
        return this.e;
    }

    public float getTrimPathEnd()
    {
        return this.j;
    }

    public float getTrimPathOffset()
    {
        return this.k;
    }

    public float getTrimPathStart()
    {
        return this.i;
    }

    public void setFillAlpha(float p1)
    {
        this.h = p1;
        return;
    }

    public void setFillColor(int p2)
    {
        this.f.b = p2;
        return;
    }

    public void setStrokeAlpha(float p1)
    {
        this.g = p1;
        return;
    }

    public void setStrokeColor(int p2)
    {
        this.d.b = p2;
        return;
    }

    public void setStrokeWidth(float p1)
    {
        this.e = p1;
        return;
    }

    public void setTrimPathEnd(float p1)
    {
        this.j = p1;
        return;
    }

    public void setTrimPathOffset(float p1)
    {
        this.k = p1;
        return;
    }

    public void setTrimPathStart(float p1)
    {
        this.i = p1;
        return;
    }
}
