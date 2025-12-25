package a2;
public final class f0 extends a2.b0 {
    public final synthetic int q;
    public final synthetic a2.c0 r;

    public synthetic f0(a2.c0 p1, android.content.Context p2, int p3)
    {
        this.q = p3;
        this.r = p1;
        super(p2);
        return;
    }

    public final float d(android.util.DisplayMetrics p2)
    {
        float v2_1;
        switch (this.q) {
            case 0:
                v2_1 = p2.densityDpi;
                break;
            default:
                v2_1 = p2.densityDpi;
        }
        return (1120403456 / ((float) v2_1));
    }

    public int e(int p2)
    {
        switch (this.q) {
            case 0:
                return Math.min(100, super.e(p2));
            default:
                return super.e(p2);
        }
    }

    public final void h(android.view.View p7, a2.e1 p8)
    {
        switch (this.q) {
            case 0:
                int v0_1 = this.r;
                android.view.animation.DecelerateInterpolator v7_6 = v0_1.b(v0_1.a.getLayoutManager(), p7);
                int v0_6 = v7_6[0];
                android.view.animation.DecelerateInterpolator v7_1 = v7_6[1];
                int v2_6 = ((int) Math.ceil((((double) this.e(Math.max(Math.abs(v0_6), Math.abs(v7_1)))) / 4599717252057688074)));
                if (v2_6 > 0) {
                    p8.a = v0_6;
                    p8.b = v7_1;
                    p8.c = v2_6;
                    p8.e = this.j;
                    p8.f = 1;
                }
                return;
            default:
                int v0_2 = this.r;
                int v1_2 = v0_2.a;
                if (v1_2 != 0) {
                    android.view.animation.DecelerateInterpolator v7_3 = v0_2.b(v1_2.getLayoutManager(), p7);
                    int v0_4 = v7_3[0];
                    android.view.animation.DecelerateInterpolator v7_4 = v7_3[1];
                    int v2_13 = ((int) Math.ceil((((double) this.e(Math.max(Math.abs(v0_4), Math.abs(v7_4)))) / 4599717252057688074)));
                    if (v2_13 > 0) {
                        p8.a = v0_4;
                        p8.b = v7_4;
                        p8.c = v2_13;
                        p8.e = this.j;
                        p8.f = 1;
                    }
                }
                return;
        }
    }
}
