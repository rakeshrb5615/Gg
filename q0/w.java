package q0;
public final class w implements q0.x {
    public final android.view.ScrollFeedbackProvider a;

    public w(androidx.core.widget.NestedScrollView p1)
    {
        this.a = android.view.ScrollFeedbackProvider.createProvider(p1);
        return;
    }

    public final void onScrollLimit(int p2, int p3, int p4, boolean p5)
    {
        this.a.onScrollLimit(p2, p3, p4, p5);
        return;
    }

    public final void onScrollProgress(int p2, int p3, int p4, int p5)
    {
        this.a.onScrollProgress(p2, p3, p4, p5);
        return;
    }
}
