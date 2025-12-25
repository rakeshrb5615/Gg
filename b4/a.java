package b4;
public final class a implements android.view.View$OnLayoutChangeListener {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic a(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onLayoutChange(android.view.View p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9)
    {
        switch (this.a) {
            case 0:
                android.graphics.Rect v2_3 = ((b4.b) this.b);
                int v3_1 = new int[2];
                p1.getLocationOnScreen(v3_1);
                v2_3.Y = v3_1[0];
                p1.getWindowVisibleDisplayFrame(v2_3.R);
                return;
            default:
                throw 0;
        }
    }
}
