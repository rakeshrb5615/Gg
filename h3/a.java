package h3;
public final class a implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic int b;
    public final synthetic android.view.View c;
    public final synthetic Object d;

    public a(android.widget.TextView p2, android.graphics.Typeface p3, int p4)
    {
        this.a = 1;
        this.c = p2;
        this.d = p3;
        this.b = p4;
        return;
    }

    public a(com.google.android.material.bottomsheet.BottomSheetBehavior p2, android.view.View p3, int p4)
    {
        this.a = 0;
        this.d = p2;
        this.c = p3;
        this.b = p4;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                ((com.google.android.material.bottomsheet.BottomSheetBehavior) this.d).K(this.c, this.b, 0);
                return;
            default:
                ((android.widget.TextView) this.c).setTypeface(((android.graphics.Typeface) this.d), this.b);
                return;
        }
    }
}
