package i1;
public final class g extends a.a {
    public final i1.f b;

    public g(android.widget.TextView p2)
    {
        this.b = new i1.f(p2);
        return;
    }

    public final boolean B()
    {
        return this.b.d;
    }

    public final void O(boolean p2)
    {
        i1.f v0_1;
        if (g1.i.k == null) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (v0_1 != null) {
            this.b.O(p2);
            return;
        } else {
            return;
        }
    }

    public final void R(boolean p3)
    {
        int v1_1;
        i1.f v0 = this.b;
        if (g1.i.k == null) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        if (v1_1 != 0) {
            v0.R(p3);
            return;
        } else {
            v0.d = p3;
            return;
        }
    }

    public final android.text.method.TransformationMethod W(android.text.method.TransformationMethod p2)
    {
        i1.f v0_1;
        if (g1.i.k == null) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (v0_1 != null) {
            return this.b.W(p2);
        } else {
            return p2;
        }
    }

    public final android.text.InputFilter[] x(android.text.InputFilter[] p2)
    {
        i1.f v0_1;
        if (g1.i.k == null) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (v0_1 != null) {
            return this.b.x(p2);
        } else {
            return p2;
        }
    }
}
