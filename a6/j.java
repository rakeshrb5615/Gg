package a6;
public final synthetic class j implements u7.l {
    public final synthetic int a;
    public final synthetic Object b;
    public final synthetic Object c;

    public synthetic j(int p1, Object p2, Object p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final Object invoke(Object p4)
    {
        switch (this.a) {
            case 0:
                a6.l v0_4 = ((a6.l) this.b);
                String v1_3 = ((String) this.c);
                v0_4.getClass();
                ((e1.b) p4).d(a6.l.d, v1_3);
                v0_4.d(((e1.b) p4), v1_3);
                return 0;
            default:
                ((e8.c) this.b).c.removeCallbacks(((b5.l) this.c));
                return h7.l.a;
        }
    }
}
