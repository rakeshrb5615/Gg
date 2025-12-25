package z;
public abstract class t extends z.c {
    public boolean n;
    public boolean o;

    public final void e(androidx.constraintlayout.widget.ConstraintLayout p1)
    {
        this.d(p1);
        return;
    }

    public void g(android.util.AttributeSet p6)
    {
        super.g(p6);
        if (p6 != null) {
            android.content.res.TypedArray v6_1 = this.getContext().obtainStyledAttributes(p6, z.r.b);
            int v0_1 = v6_1.getIndexCount();
            int v1_0 = 0;
            while (v1_0 < v0_1) {
                int v2 = v6_1.getIndex(v1_0);
                if (v2 != 6) {
                    if (v2 == 22) {
                        this.o = 1;
                    }
                } else {
                    this.n = 1;
                }
                v1_0++;
            }
            v6_1.recycle();
        }
        return;
    }

    public abstract void j();

    public final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if ((this.n) || (this.o)) {
            androidx.constraintlayout.widget.ConstraintLayout v0_2 = this.getParent();
            if ((v0_2 instanceof androidx.constraintlayout.widget.ConstraintLayout)) {
                androidx.constraintlayout.widget.ConstraintLayout v0_3 = ((androidx.constraintlayout.widget.ConstraintLayout) v0_2);
                int v1_0 = this.getVisibility();
                float v2 = this.getElevation();
                int v3 = 0;
                while (v3 < this.b) {
                    android.view.View v4_4 = ((android.view.View) v0_3.a.get(this.a[v3]));
                    if (v4_4 != null) {
                        if (this.n) {
                            v4_4.setVisibility(v1_0);
                        }
                        if ((this.o) && (v2 > 0)) {
                            v4_4.setTranslationZ((v4_4.getTranslationZ() + v2));
                        }
                    }
                    v3++;
                }
            }
        }
        return;
    }

    public void setElevation(float p2)
    {
        super.setElevation(p2);
        androidx.constraintlayout.widget.ConstraintLayout v2_1 = this.getParent();
        if ((v2_1 != null) && ((v2_1 instanceof androidx.constraintlayout.widget.ConstraintLayout))) {
            this.d(((androidx.constraintlayout.widget.ConstraintLayout) v2_1));
        }
        return;
    }

    public void setVisibility(int p2)
    {
        super.setVisibility(p2);
        androidx.constraintlayout.widget.ConstraintLayout v2_1 = this.getParent();
        if ((v2_1 != null) && ((v2_1 instanceof androidx.constraintlayout.widget.ConstraintLayout))) {
            this.d(((androidx.constraintlayout.widget.ConstraintLayout) v2_1));
        }
        return;
    }
}
