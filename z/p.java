package z;
public final class p extends android.view.View {
    public boolean a;

    public p(android.content.Context p1)
    {
        super(p1);
        super.a = 1;
        super.setVisibility(8);
        return;
    }

    public final void draw(android.graphics.Canvas p1)
    {
        return;
    }

    public final void onMeasure(int p1, int p2)
    {
        this.setMeasuredDimension(0, 0);
        return;
    }

    public void setFilterRedundantCalls(boolean p1)
    {
        this.a = p1;
        return;
    }

    public void setGuidelineBegin(int p3)
    {
        z.e v0_1 = ((z.e) this.getLayoutParams());
        if ((!this.a) || (v0_1.a != p3)) {
            v0_1.a = p3;
            this.setLayoutParams(v0_1);
            return;
        } else {
            return;
        }
    }

    public void setGuidelineEnd(int p3)
    {
        z.e v0_1 = ((z.e) this.getLayoutParams());
        if ((!this.a) || (v0_1.b != p3)) {
            v0_1.b = p3;
            this.setLayoutParams(v0_1);
            return;
        } else {
            return;
        }
    }

    public void setGuidelinePercent(float p3)
    {
        z.e v0_1 = ((z.e) this.getLayoutParams());
        if ((!this.a) || (v0_1.c != p3)) {
            v0_1.c = p3;
            this.setLayoutParams(v0_1);
            return;
        } else {
            return;
        }
    }

    public void setVisibility(int p1)
    {
        return;
    }
}
