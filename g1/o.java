package g1;
public final class o {
    public int a;
    public final g1.r b;
    public g1.r c;
    public g1.r d;
    public int e;
    public int f;

    public o(g1.r p2)
    {
        this.a = 1;
        this.b = p2;
        this.c = p2;
        return;
    }

    public final void a()
    {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
        return;
    }

    public final boolean b()
    {
        int v0_6 = this.c.b.b();
        int v1_3 = v0_6.b(6);
        if ((v1_3 == 0) || (((java.nio.ByteBuffer) v0_6.d).get((v1_3 + v0_6.a)) == 0)) {
            if (this.e != 65039) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }
}
