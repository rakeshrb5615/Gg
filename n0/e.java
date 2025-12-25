package n0;
public final class e implements java.util.concurrent.Callable {
    public final synthetic int a;
    public final synthetic String b;
    public final synthetic android.content.Context c;
    public final synthetic int d;
    public final synthetic Object e;

    public synthetic e(String p1, android.content.Context p2, Object p3, int p4, int p5)
    {
        this.a = p5;
        this.b = p1;
        this.c = p2;
        this.e = p3;
        this.d = p4;
        return;
    }

    public final Object call()
    {
        switch (this.a) {
            case 0:
                n0.g v0_9 = new Object[] {((n0.d) this.e)});
                int v1_4 = new java.util.ArrayList(1);
                n0.g v0_1 = v0_9[0];
                java.util.Objects.requireNonNull(v0_1);
                v1_4.add(v0_1);
                return n0.h.b(this.b, this.c, java.util.Collections.unmodifiableList(v1_4), this.d);
            default:
                n0.g v0_6 = n0.h.b(this.b, this.c, ((java.util.List) this.e), this.d);
                return v0_6;
        }
    }
}
