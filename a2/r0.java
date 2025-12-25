package a2;
public final class r0 {
    public final synthetic int a;
    public final synthetic a2.t0 b;

    public synthetic r0(a2.t0 p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final int a(android.view.View p3)
    {
        int v1_0;
        int v3_3;
        switch (this.a) {
            case 0:
                a2.u0 v0_4 = ((a2.u0) p3.getLayoutParams());
                v1_0 = (p3.getRight() + ((a2.u0) p3.getLayoutParams()).b.right);
                v3_3 = v0_4.rightMargin;
                break;
            default:
                a2.u0 v0_2 = ((a2.u0) p3.getLayoutParams());
                v1_0 = (p3.getBottom() + ((a2.u0) p3.getLayoutParams()).b.bottom);
                v3_3 = v0_2.bottomMargin;
        }
        return (v1_0 + v3_3);
    }

    public final int b(android.view.View p3)
    {
        int v3_3;
        int v1_0;
        switch (this.a) {
            case 0:
                a2.u0 v0_4 = ((a2.u0) p3.getLayoutParams());
                v1_0 = (p3.getLeft() - ((a2.u0) p3.getLayoutParams()).b.left);
                v3_3 = v0_4.leftMargin;
                break;
            default:
                a2.u0 v0_2 = ((a2.u0) p3.getLayoutParams());
                v1_0 = (p3.getTop() - ((a2.u0) p3.getLayoutParams()).b.top);
                v3_3 = v0_2.topMargin;
        }
        return (v1_0 - v3_3);
    }

    public final int c()
    {
        int v0_2;
        int v1_1;
        switch (this.a) {
            case 0:
                int v0_1 = this.b;
                v1_1 = v0_1.n;
                v0_2 = v0_1.E();
                break;
            default:
                int v0_3 = this.b;
                v1_1 = v0_3.o;
                v0_2 = v0_3.C();
        }
        return (v1_1 - v0_2);
    }

    public final int d()
    {
        switch (this.a) {
            case 0:
                return this.b.D();
            default:
                return this.b.F();
        }
    }
}
