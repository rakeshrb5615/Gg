package androidx.appcompat.widget;
public final class ViewStubCompat extends android.view.View {
    public int a;
    public int b;
    public ref.WeakReference c;
    public android.view.LayoutInflater d;

    public ViewStubCompat(android.content.Context p4, android.util.AttributeSet p5)
    {
        super(p4, p5, 0);
        super.a = 0;
        int v4_2 = p4.obtainStyledAttributes(p5, g.a.A, 0, 0);
        super.b = v4_2.getResourceId(2, -1);
        super.a = v4_2.getResourceId(1, 0);
        super.setId(v4_2.getResourceId(0, -1));
        v4_2.recycle();
        super.setVisibility(8);
        super.setWillNotDraw(1);
        return;
    }

    public final android.view.View a()
    {
        ref.WeakReference v0_0 = this.getParent();
        if (!(v0_0 instanceof android.view.ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else {
            if (this.a == 0) {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            } else {
                ref.WeakReference v0_3 = ((android.view.ViewGroup) v0_0);
                android.view.View v1_1 = this.d;
                if (v1_1 == null) {
                    v1_1 = android.view.LayoutInflater.from(this.getContext());
                }
                android.view.View v1_4 = v1_1.inflate(this.a, v0_3, 0);
                int v2_1 = this.b;
                if (v2_1 != -1) {
                    v1_4.setId(v2_1);
                }
                int v2_2 = v0_3.indexOfChild(this);
                v0_3.removeViewInLayout(this);
                android.view.ViewGroup$LayoutParams v3_2 = this.getLayoutParams();
                if (v3_2 == null) {
                    v0_3.addView(v1_4, v2_2);
                } else {
                    v0_3.addView(v1_4, v2_2, v3_2);
                }
                this.c = new ref.WeakReference(v1_4);
                return v1_4;
            }
        }
    }

    public final void dispatchDraw(android.graphics.Canvas p1)
    {
        return;
    }

    public final void draw(android.graphics.Canvas p1)
    {
        return;
    }

    public int getInflatedId()
    {
        return this.b;
    }

    public android.view.LayoutInflater getLayoutInflater()
    {
        return this.d;
    }

    public int getLayoutResource()
    {
        return this.a;
    }

    public final void onMeasure(int p1, int p2)
    {
        this.setMeasuredDimension(0, 0);
        return;
    }

    public void setInflatedId(int p1)
    {
        this.b = p1;
        return;
    }

    public void setLayoutInflater(android.view.LayoutInflater p1)
    {
        this.d = p1;
        return;
    }

    public void setLayoutResource(int p1)
    {
        this.a = p1;
        return;
    }

    public void setOnInflateListener(n.i3 p1)
    {
        return;
    }

    public void setVisibility(int p2)
    {
        int v0_0 = this.c;
        if (v0_0 == 0) {
            super.setVisibility(p2);
            if ((p2 != null) && (p2 != 4)) {
                return;
            } else {
                this.a();
                return;
            }
        } else {
            int v0_2 = ((android.view.View) v0_0.get());
            if (v0_2 == 0) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            } else {
                v0_2.setVisibility(p2);
                return;
            }
        }
    }
}
