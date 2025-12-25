package a2;
public final class h extends android.animation.AnimatorListenerAdapter {
    public final synthetic int a;
    public final synthetic a2.i b;
    public final synthetic android.view.ViewPropertyAnimator c;
    public final synthetic android.view.View d;
    public final synthetic a2.k e;

    public synthetic h(a2.k p1, a2.i p2, android.view.ViewPropertyAnimator p3, android.view.View p4, int p5)
    {
        this.a = p5;
        this.e = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public final void onAnimationEnd(android.animation.Animator p3)
    {
        switch (this.a) {
            case 0:
                this.c.setListener(0);
                java.util.ArrayList v0_7 = this.d;
                v0_7.setAlpha(1065353216);
                v0_7.setTranslationX(0);
                v0_7.setTranslationY(0);
                a2.k1 v3_1 = this.b;
                a2.k v1_0 = this.e;
                v1_0.c(v3_1.a);
                v1_0.r.remove(v3_1.a);
                v1_0.i();
                return;
            default:
                this.c.setListener(0);
                java.util.ArrayList v0_3 = this.d;
                v0_3.setAlpha(1065353216);
                v0_3.setTranslationX(0);
                v0_3.setTranslationY(0);
                a2.k1 v3_7 = this.b;
                a2.k v1_1 = this.e;
                v1_1.c(v3_7.b);
                v1_1.r.remove(v3_7.b);
                v1_1.i();
                return;
        }
    }

    public final void onAnimationStart(android.animation.Animator p1)
    {
        switch (this.a) {
            case 0:
                Class vtmp2 = this.e.getClass();
                return;
            default:
                Class vtmp1 = this.e.getClass();
                return;
        }
    }
}
