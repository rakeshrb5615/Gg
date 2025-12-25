package n;
public final class x {
    public final android.widget.TextView a;
    public final l6.c b;

    public x(android.widget.TextView p2)
    {
        this.a = p2;
        this.b = new l6.c(p2);
        return;
    }

    public final android.text.InputFilter[] a(android.text.InputFilter[] p2)
    {
        return ((a.a) this.b.b).x(p2);
    }

    public final void b(android.util.AttributeSet p4, int p5)
    {
        android.content.res.TypedArray v4_1 = this.a.getContext().obtainStyledAttributes(p4, g.a.i, p5, 0);
        try {
            boolean v1_0 = 1;
        } catch (Throwable v5_1) {
            v4_1.recycle();
            throw v5_1;
        }
        if (v4_1.hasValue(14)) {
            v1_0 = v4_1.getBoolean(14, 1);
        }
        v4_1.recycle();
        this.d(v1_0);
        return;
    }

    public final void c(boolean p2)
    {
        ((a.a) this.b.b).O(p2);
        return;
    }

    public final void d(boolean p2)
    {
        ((a.a) this.b.b).R(p2);
        return;
    }
}
