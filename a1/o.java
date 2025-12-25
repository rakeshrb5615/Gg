package a1;
public final class o extends n7.i implements u7.p {
    public final synthetic int a;
    public synthetic Object b;

    public synthetic o(int p1, l7.c p2, int p3)
    {
        this.a = p3;
        super(p1, p2);
        return;
    }

    public o(u6.h p2, l7.c p3)
    {
        this.a = 2;
        this.b = p2;
        super(2, p3);
        return;
    }

    public final l7.c create(Object p4, l7.c p5)
    {
        switch (this.a) {
            case 0:
                a1.o v0_1 = new a1.o(2, p5, 0);
                v0_1.b = p4;
                return v0_1;
            case 1:
                a1.o v0_5 = new a1.o(2, p5, 1);
                v0_5.b = p4;
                return v0_5;
            default:
                return new a1.o(((u6.h) this.b), p5);
        }
    }

    public final Object invoke(Object p2, Object p3)
    {
        switch (this.a) {
            case 0:
                return ((a1.o) this.create(((a1.l1) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 1:
                h7.l v3_6 = h7.l.a;
                ((a1.o) this.create(((String) p2), ((l7.c) p3))).invokeSuspend(v3_6);
                return v3_6;
            default:
                return ((a1.o) this.create(((u6.h) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
        }
    }

    public final Object invokeSuspend(Object p3)
    {
        switch (this.a) {
            case 0:
                c4.b.e0(p3);
                return Boolean.valueOf(((((a1.l1) this.b) instanceof a1.r0) ^ 1));
            case 1:
                c4.b.e0(p3);
                h7.l v3_11 = ((String) this.b);
                String v0_3 = new StringBuilder("Error failed to fetch the remote configs: ");
                v0_3.append(v3_11);
                android.util.Log.e("FirebaseSessions", v0_3.toString());
                return h7.l.a;
            default:
                c4.b.e0(p3);
                return ((u6.h) this.b);
        }
    }
}
