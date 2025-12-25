package l3;
public final class c extends android.view.ViewOutlineProvider {
    public final synthetic com.google.android.material.chip.Chip a;

    public c(com.google.android.material.chip.Chip p1)
    {
        this.a = p1;
        return;
    }

    public final void getOutline(android.view.View p1, android.graphics.Outline p2)
    {
        int v1_1 = this.a.e;
        if (v1_1 == 0) {
            p2.setAlpha(0);
            return;
        } else {
            v1_1.getOutline(p2);
            return;
        }
    }
}
