package g2;
public final class e extends android.graphics.drawable.Drawable$ConstantState {
    public final android.graphics.drawable.Drawable$ConstantState a;

    public e(android.graphics.drawable.Drawable$ConstantState p1)
    {
        this.a = p1;
        return;
    }

    public final boolean canApplyTheme()
    {
        return this.a.canApplyTheme();
    }

    public final int getChangingConfigurations()
    {
        return this.a.getChangingConfigurations();
    }

    public final android.graphics.drawable.Drawable newDrawable()
    {
        g2.f v0_1 = new g2.f(0, 0);
        android.graphics.drawable.Drawable v1_2 = this.a.newDrawable();
        v0_1.a = v1_2;
        v1_2.setCallback(v0_1.f);
        return v0_1;
    }

    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p4)
    {
        g2.f v0_1 = new g2.f(0, 0);
        android.graphics.drawable.Drawable v4_1 = this.a.newDrawable(p4);
        v0_1.a = v4_1;
        v4_1.setCallback(v0_1.f);
        return v0_1;
    }

    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p4, android.content.res.Resources$Theme p5)
    {
        g2.f v0_1 = new g2.f(0, 0);
        android.graphics.drawable.Drawable v4_1 = this.a.newDrawable(p4, p5);
        v0_1.a = v4_1;
        v4_1.setCallback(v0_1.f);
        return v0_1;
    }
}
