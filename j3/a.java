package j3;
public final synthetic class a implements android.view.View$OnLayoutChangeListener {
    public final synthetic com.google.android.material.carousel.CarouselLayoutManager a;

    public synthetic a(com.google.android.material.carousel.CarouselLayoutManager p1)
    {
        this.a = p1;
        return;
    }

    public final void onLayoutChange(android.view.View p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9)
    {
        if (((p4 - p2) == (p8 - p6)) && ((p5 - p3) == (p9 - p7))) {
            return;
        } else {
            p1.post(new androidx.lifecycle.g0(this.a, 9));
            return;
        }
    }
}
