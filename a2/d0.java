package a2;
public final class d0 extends a2.e0 {
    public final synthetic int d;

    public synthetic d0(a2.t0 p1, int p2)
    {
        this.d = p2;
        super(p1);
        return;
    }

    public final int b(android.view.View p3)
    {
        int v3_5;
        int v1_0;
        switch (this.d) {
            case 0:
                a2.u0 v0_4 = ((a2.u0) p3.getLayoutParams());
                ((a2.t0) this.b).getClass();
                v1_0 = (p3.getRight() + ((a2.u0) p3.getLayoutParams()).b.right);
                v3_5 = v0_4.rightMargin;
                break;
            default:
                a2.u0 v0_2 = ((a2.u0) p3.getLayoutParams());
                ((a2.t0) this.b).getClass();
                v1_0 = (p3.getBottom() + ((a2.u0) p3.getLayoutParams()).b.bottom);
                v3_5 = v0_2.bottomMargin;
        }
        return (v1_0 + v3_5);
    }

    public final int c(android.view.View p3)
    {
        int v0_1;
        int v3_1;
        switch (this.d) {
            case 0:
                int v0_5 = ((a2.u0) p3.getLayoutParams());
                ((a2.t0) this.b).getClass();
                v3_1 = (a2.t0.A(p3) + v0_5.leftMargin);
                v0_1 = v0_5.rightMargin;
                break;
            default:
                int v0_3 = ((a2.u0) p3.getLayoutParams());
                ((a2.t0) this.b).getClass();
                v3_1 = (a2.t0.z(p3) + v0_3.topMargin);
                v0_1 = v0_3.bottomMargin;
        }
        return (v3_1 + v0_1);
    }

    public final int d(android.view.View p3)
    {
        int v0_1;
        int v3_1;
        switch (this.d) {
            case 0:
                int v0_5 = ((a2.u0) p3.getLayoutParams());
                ((a2.t0) this.b).getClass();
                v3_1 = (a2.t0.z(p3) + v0_5.topMargin);
                v0_1 = v0_5.bottomMargin;
                break;
            default:
                int v0_3 = ((a2.u0) p3.getLayoutParams());
                ((a2.t0) this.b).getClass();
                v3_1 = (a2.t0.A(p3) + v0_3.leftMargin);
                v0_1 = v0_3.rightMargin;
        }
        return (v3_1 + v0_1);
    }

    public final int e(android.view.View p3)
    {
        int v3_5;
        int v1_0;
        switch (this.d) {
            case 0:
                a2.u0 v0_4 = ((a2.u0) p3.getLayoutParams());
                ((a2.t0) this.b).getClass();
                v1_0 = (p3.getLeft() - ((a2.u0) p3.getLayoutParams()).b.left);
                v3_5 = v0_4.leftMargin;
                break;
            default:
                a2.u0 v0_2 = ((a2.u0) p3.getLayoutParams());
                ((a2.t0) this.b).getClass();
                v1_0 = (p3.getTop() - ((a2.u0) p3.getLayoutParams()).b.top);
                v3_5 = v0_2.topMargin;
        }
        return (v1_0 - v3_5);
    }

    public final int f()
    {
        switch (this.d) {
            case 0:
                return ((a2.t0) this.b).n;
            default:
                return ((a2.t0) this.b).o;
        }
    }

    public final int g()
    {
        int v1_1;
        int v0_1;
        switch (this.d) {
            case 0:
                int v0_3 = ((a2.t0) this.b);
                v1_1 = v0_3.n;
                v0_1 = v0_3.E();
                break;
            default:
                int v0_5 = ((a2.t0) this.b);
                v1_1 = v0_5.o;
                v0_1 = v0_5.C();
        }
        return (v1_1 - v0_1);
    }

    public final int h()
    {
        switch (this.d) {
            case 0:
                return ((a2.t0) this.b).E();
            default:
                return ((a2.t0) this.b).C();
        }
    }

    public final int i()
    {
        switch (this.d) {
            case 0:
                return ((a2.t0) this.b).l;
            default:
                return ((a2.t0) this.b).m;
        }
    }

    public final int j()
    {
        switch (this.d) {
            case 0:
                return ((a2.t0) this.b).m;
            default:
                return ((a2.t0) this.b).l;
        }
    }

    public final int k()
    {
        switch (this.d) {
            case 0:
                return ((a2.t0) this.b).D();
            default:
                return ((a2.t0) this.b).F();
        }
    }

    public final int l()
    {
        int v0_3;
        int v1_1;
        switch (this.d) {
            case 0:
                int v0_5 = ((a2.t0) this.b);
                v1_1 = (v0_5.n - v0_5.D());
                v0_3 = v0_5.E();
                break;
            default:
                int v0_2 = ((a2.t0) this.b);
                v1_1 = (v0_2.o - v0_2.F());
                v0_3 = v0_2.C();
        }
        return (v1_1 - v0_3);
    }

    public final int m(android.view.View p3)
    {
        switch (this.d) {
            case 0:
                android.graphics.Rect v1_3 = ((android.graphics.Rect) this.c);
                ((a2.t0) this.b).J(p3, v1_3);
                return v1_3.right;
            default:
                android.graphics.Rect v1_1 = ((android.graphics.Rect) this.c);
                ((a2.t0) this.b).J(p3, v1_1);
                return v1_1.bottom;
        }
    }

    public final int n(android.view.View p3)
    {
        switch (this.d) {
            case 0:
                android.graphics.Rect v1_3 = ((android.graphics.Rect) this.c);
                ((a2.t0) this.b).J(p3, v1_3);
                return v1_3.left;
            default:
                android.graphics.Rect v1_1 = ((android.graphics.Rect) this.c);
                ((a2.t0) this.b).J(p3, v1_1);
                return v1_1.top;
        }
    }

    public final void o(int p2)
    {
        switch (this.d) {
            case 0:
                ((a2.t0) this.b).O(p2);
                return;
            default:
                ((a2.t0) this.b).P(p2);
                return;
        }
    }
}
