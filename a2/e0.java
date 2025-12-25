package a2;
public abstract class e0 {
    public int a;
    public final Object b;
    public final Object c;

    public e0(a2.t0 p2)
    {
        this.a = -2147483648;
        this.c = new android.graphics.Rect();
        this.b = p2;
        return;
    }

    public e0(g1.h p2)
    {
        this.a = 0;
        this.c = new g1.d();
        this.b = p2;
        return;
    }

    public static a2.e0 a(a2.t0 p1, int p2)
    {
        if (p2 == null) {
            return new a2.d0(p1, 0);
        } else {
            if (p2 != 1) {
                throw new IllegalArgumentException("invalid orientation");
            } else {
                return new a2.d0(p1, 1);
            }
        }
    }

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract void o();
}
