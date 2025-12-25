package androidx.appcompat.app;
public class AlertController$RecycleListView extends android.widget.ListView {
    public final int a;
    public final int b;

    public AlertController$RecycleListView(android.content.Context p2, android.util.AttributeSet p3)
    {
        super(p2, p3);
        int v2_2 = p2.obtainStyledAttributes(p3, g.a.t);
        super.b = v2_2.getDimensionPixelOffset(0, -1);
        super.a = v2_2.getDimensionPixelOffset(1, -1);
        return;
    }
}
