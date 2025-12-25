package r0;
public final class a extends android.text.style.ClickableSpan {
    public final int a;
    public final r0.c b;
    public final int c;

    public a(int p1, r0.c p2, int p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final void onClick(android.view.View p3)
    {
        android.os.Bundle v3_1 = new android.os.Bundle();
        v3_1.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, v3_1);
        return;
    }
}
