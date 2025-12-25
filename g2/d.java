package g2;
public final class d extends android.graphics.drawable.Drawable$ConstantState {
    public g2.q a;
    public android.animation.AnimatorSet b;
    public java.util.ArrayList c;
    public r.e d;

    public final int getChangingConfigurations()
    {
        return 0;
    }

    public final android.graphics.drawable.Drawable newDrawable()
    {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p2)
    {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
