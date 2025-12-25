package a1;
public final class p extends n7.i implements u7.p {
    public final synthetic int a;
    public synthetic Object b;
    public final synthetic Object c;

    public synthetic p(Object p1, l7.c p2, int p3)
    {
        this.a = p3;
        this.c = p1;
        super(2, p2);
        return;
    }

    public final l7.c create(Object p4, l7.c p5)
    {
        switch (this.a) {
            case 0:
                a1.p v0_4 = new a1.p(((a1.l1) this.c), p5, 0);
                v0_4.b = p4;
                return v0_4;
            case 1:
                a1.p v0_1 = new a1.p(((java.util.Set) this.c), p5, 1);
                v0_1.b = p4;
                return v0_1;
            case 2:
                a1.p v0_7 = new a1.p(((u7.l) this.c), p5, 2);
                v0_7.b = p4;
                return v0_7;
            default:
                a1.p v0_6 = new a1.p(((x1.e) this.c), p5, 3);
                v0_6.b = p4;
                return v0_6;
        }
    }

    public final Object invoke(Object p2, Object p3)
    {
        switch (this.a) {
            case 0:
                return ((a1.p) this.create(((a1.l1) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 1:
                return ((a1.p) this.create(((e1.b) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 2:
                h7.l v3_8 = h7.l.a;
                ((a1.p) this.create(((e1.b) p2), ((l7.c) p3))).invokeSuspend(v3_8);
                return v3_8;
            default:
                ((a1.p) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
                throw 0;
        }
    }

    public final Object invokeSuspend(Object p6)
    {
        int v1 = 1;
        boolean v3_0 = this.c;
        switch (this.a) {
            case 0:
                c4.b.e0(p6);
                java.util.Iterator v6_12 = ((a1.l1) this.b);
                if ((!(v6_12 instanceof a1.c)) || (v6_12.a > ((a1.l1) v3_0).a)) {
                    v1 = 0;
                }
                return Boolean.valueOf(v1);
            case 1:
                c4.b.e0(p6);
                java.util.Iterator v6_5 = ((e1.b) this.b).a().keySet();
                int v0_2 = new java.util.ArrayList(i7.j.X(v6_5, 10));
                java.util.Iterator v6_6 = v6_5.iterator();
                while (v6_6.hasNext()) {
                    v0_2.add(((e1.e) v6_6.next()).a);
                }
                boolean v3_1 = ((java.util.Set) v3_0);
                if (v3_1 != d1.j.a) {
                    if ((!v3_1) || (!v3_1.isEmpty())) {
                        java.util.Iterator v6_9 = v3_1.iterator();
                        while (v6_9.hasNext()) {
                            if (!v0_2.contains(((String) v6_9.next()))) {
                            }
                            return Boolean.valueOf(v1);
                        }
                    }
                    v1 = 0;
                }
                return Boolean.valueOf(v1);
            case 2:
                c4.b.e0(p6);
                ((u7.l) v3_0).invoke(((e1.b) this.b));
                return h7.l.a;
            default:
                c4.b.e0(p6);
                throw 0;
        }
    }
}
