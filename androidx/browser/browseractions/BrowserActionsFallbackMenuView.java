package androidx.browser.browseractions;
public class BrowserActionsFallbackMenuView extends android.widget.LinearLayout {
    public final int a;
    public final int b;

    public BrowserActionsFallbackMenuView(android.content.Context p1, android.util.AttributeSet p2)
    {
        super(p1, p2);
        super.a = super.getResources().getDimensionPixelOffset(2131165268);
        super.b = super.getResources().getDimensionPixelOffset(2131165267);
        return;
    }

    public final void onMeasure(int p2, int p3)
    {
        super.onMeasure(android.view.View$MeasureSpec.makeMeasureSpec(Math.min((this.getResources().getDisplayMetrics().widthPixels - (this.a * 2)), this.b), 1073741824), p3);
        return;
    }
}
