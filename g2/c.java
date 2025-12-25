package g2;
public final class c implements android.graphics.drawable.Drawable$Callback {
    public final synthetic g2.f a;

    public c(g2.f p1)
    {
        this.a = p1;
        return;
    }

    public final void invalidateDrawable(android.graphics.drawable.Drawable p1)
    {
        this.a.invalidateSelf();
        return;
    }

    public final void scheduleDrawable(android.graphics.drawable.Drawable p1, Runnable p2, long p3)
    {
        this.a.scheduleSelf(p2, p3);
        return;
    }

    public final void unscheduleDrawable(android.graphics.drawable.Drawable p1, Runnable p2)
    {
        this.a.unscheduleSelf(p2);
        return;
    }
}
