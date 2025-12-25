package g2;
public final class p extends android.graphics.drawable.Drawable$ConstantState {
    public final android.graphics.drawable.Drawable$ConstantState a;

    public p(android.graphics.drawable.Drawable$ConstantState p1)
    {
        this.a = p1;
        return;
    }

    public final boolean canApplyTheme()
    {
        return this.a.canApplyTheme();
    }

    public int getChangingConfigurations()
    {
        return this.a.getChangingConfigurations();
    }

    public final android.graphics.drawable.Drawable newDrawable()
    {
        g2.q v0_1 = new g2.q();
        v0_1.a = ((android.graphics.drawable.VectorDrawable) this.a.newDrawable());
        return v0_1;
    }

    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p3)
    {
        g2.q v0_1 = new g2.q();
        v0_1.a = ((android.graphics.drawable.VectorDrawable) this.a.newDrawable(p3));
        return v0_1;
    }

    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p3, android.content.res.Resources$Theme p4)
    {
        g2.q v0_1 = new g2.q();
        v0_1.a = ((android.graphics.drawable.VectorDrawable) this.a.newDrawable(p3, p4));
        return v0_1;
    }
}
