package f3;
public final class c extends q4.b {
    public final synthetic int f;

    public synthetic c(int p1)
    {
        this.f = p1;
        super(6);
        return;
    }

    public final android.view.ViewPropertyAnimator A(android.view.View p2, int p3)
    {
        switch (this.f) {
            case 0:
                return p2.animate().translationY(((float) p3));
            case 1:
                return p2.animate().translationX(((float) (- p3)));
            default:
                return p2.animate().translationX(((float) p3));
        }
    }

    public final int x(android.view.View p2, android.view.ViewGroup$MarginLayoutParams p3)
    {
        int v3_1;
        int v2_2;
        switch (this.f) {
            case 0:
                v2_2 = p2.getMeasuredHeight();
                v3_1 = p3.bottomMargin;
                break;
            case 1:
                v2_2 = p2.getMeasuredWidth();
                v3_1 = p3.leftMargin;
                break;
            default:
                v2_2 = p2.getMeasuredWidth();
                v3_1 = p3.rightMargin;
        }
        return (v2_2 + v3_1);
    }

    public final int z()
    {
        switch (this.f) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }
}
