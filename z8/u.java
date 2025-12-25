package z8;
public final class u implements u7.l {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic u(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final Object invoke(Object p2)
    {
        switch (this.a) {
            case 0:
                ((z8.d) this.b).cancel();
                return h7.l.a;
            case 1:
                ((z8.d) this.b).cancel();
                return h7.l.a;
            case 2:
                ((z8.d) this.b).cancel();
                return h7.l.a;
            default:
                h7.l v0_1 = h7.l.a;
                ((d8.n) this.b).resumeWith(v0_1);
                return v0_1;
        }
    }
}
