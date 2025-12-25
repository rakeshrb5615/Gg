package v3;
public class i extends android.graphics.drawable.Drawable$ConstantState {
    public v3.p a;
    public v3.d0 b;
    public p3.a c;
    public android.content.res.ColorStateList d;
    public android.content.res.ColorStateList e;
    public android.content.res.ColorStateList f;
    public android.graphics.PorterDuff$Mode g;
    public android.graphics.Rect h;
    public final float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public int o;
    public int p;
    public int q;
    public final android.graphics.Paint$Style r;

    public i(v3.i p3)
    {
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = android.graphics.PorterDuff$Mode.SRC_IN;
        this.h = 0;
        this.i = 1065353216;
        this.j = 1065353216;
        this.l = 255;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = android.graphics.Paint$Style.FILL_AND_STROKE;
        this.a = p3.a;
        this.b = p3.b;
        this.c = p3.c;
        this.k = p3.k;
        this.d = p3.d;
        this.e = p3.e;
        this.g = p3.g;
        this.f = p3.f;
        this.l = p3.l;
        this.i = p3.i;
        this.q = p3.q;
        this.o = p3.o;
        this.j = p3.j;
        this.m = p3.m;
        this.n = p3.n;
        this.p = p3.p;
        this.r = p3.r;
        if (p3.h != null) {
            this.h = new android.graphics.Rect(p3.h);
        }
        return;
    }

    public i(v3.p p3)
    {
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = android.graphics.PorterDuff$Mode.SRC_IN;
        this.h = 0;
        this.i = 1065353216;
        this.j = 1065353216;
        this.l = 255;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = android.graphics.Paint$Style.FILL_AND_STROKE;
        this.a = p3;
        this.c = 0;
        return;
    }

    public final int getChangingConfigurations()
    {
        return 0;
    }

    public android.graphics.drawable.Drawable newDrawable()
    {
        v3.k v0_1 = new v3.k(this);
        v0_1.f = 1;
        v0_1.m = 1;
        return v0_1;
    }
}
