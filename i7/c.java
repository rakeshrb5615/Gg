package i7;
public final class c extends i7.d implements java.util.RandomAccess {
    public final i7.d a;
    public final int b;
    public final int c;

    public c(i7.d p1, int p2, int p3)
    {
        this.a = p1;
        this.b = p2;
        j5.t1.e(p2, p3, p1.b());
        this.c = (p3 - p2);
        return;
    }

    public final int b()
    {
        return this.c;
    }

    public final Object get(int p5)
    {
        int v0_0 = this.c;
        if ((p5 < null) || (p5 >= v0_0)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p5, v0_0, ", size: "));
        } else {
            return this.a.get((this.b + p5));
        }
    }

    public final java.util.List subList(int p3, int p4)
    {
        j5.t1.e(p3, p4, this.c);
        int v1_0 = this.b;
        return new i7.c(this.a, (p3 + v1_0), (v1_0 + p4));
    }
}
