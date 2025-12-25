package a5;
public final class r implements c6.b {
    public static final Object c;
    public volatile Object a;
    public volatile c6.b b;

    static r()
    {
        a5.r.c = new Object();
        return;
    }

    public r(c6.b p2)
    {
        this.a = a5.r.c;
        this.b = p2;
        return;
    }

    public final Object get()
    {
        Object v0_0 = this.a;
        int v1_0 = a5.r.c;
        if (v0_0 != v1_0) {
            return v0_0;
        } else {
            Object v0_2 = this.a;
            if (v0_2 == v1_0) {
                v0_2 = this.b.get();
                this.a = v0_2;
                this.b = 0;
            }
            return v0_2;
        }
    }
}
