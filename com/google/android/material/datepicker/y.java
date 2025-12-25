package com.google.android.material.datepicker;
public final class y extends a2.b0 {
    public final synthetic int q;

    public synthetic y(android.content.Context p2)
    {
        this.q = 0;
        super(p2);
        return;
    }

    public y(com.google.android.material.carousel.CarouselLayoutManager p1, android.content.Context p2)
    {
        this.q = 1;
        super(p2);
        return;
    }

    public int b(android.view.View p2, int p3)
    {
        switch (this.q) {
            case 1:
                return 0;
            default:
                return super.b(p2, p3);
        }
    }

    public int c(android.view.View p2, int p3)
    {
        switch (this.q) {
            case 1:
                return 0;
            default:
                return super.c(p2, p3);
        }
    }

    public float d(android.util.DisplayMetrics p2)
    {
        switch (this.q) {
            case 0:
                return (1120403456 / ((float) p2.densityDpi));
            default:
                return super.d(p2);
        }
    }

    public android.graphics.PointF f(int p2)
    {
        switch (this.q) {
            case 1:
                return 0;
            default:
                return super.f(p2);
        }
    }
}
