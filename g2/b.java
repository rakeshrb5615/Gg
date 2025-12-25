package g2;
public final class b extends android.graphics.drawable.Animatable2$AnimationCallback {
    public final synthetic k3.a a;

    public b(k3.a p1)
    {
        this.a = p1;
        return;
    }

    public final void onAnimationEnd(android.graphics.drawable.Drawable p2)
    {
        android.content.res.ColorStateList v0_2 = this.a.b.u;
        if (v0_2 != null) {
            p2.setTintList(v0_2);
        }
        return;
    }

    public final void onAnimationStart(android.graphics.drawable.Drawable p4)
    {
        int v0_1 = this.a.b;
        android.content.res.ColorStateList v1 = v0_1.u;
        if (v1 != null) {
            p4.setTint(v1.getColorForState(v0_1.y, v1.getDefaultColor()));
        }
        return;
    }
}
