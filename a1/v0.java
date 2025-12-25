package a1;
public final class v0 extends n7.i implements u7.p {
    public final synthetic int a;
    public final synthetic a1.z0 b;

    public synthetic v0(a1.z0 p1, l7.c p2, int p3)
    {
        this.a = p3;
        this.b = p1;
        super(2, p2);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        switch (this.a) {
            case 0:
                return new a1.v0(this.b, p4, 0);
            default:
                return new a1.v0(this.b, p4, 1);
        }
    }

    public final Object invoke(Object p2, Object p3)
    {
        switch (this.a) {
            case 0:
                return ((a1.v0) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            default:
                return ((a1.v0) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
        }
    }

    public final Object invokeSuspend(Object p5)
    {
        androidx.datastore.core.NativeSharedCounter v1 = a1.g1.b;
        long v2_1 = this.b;
        switch (this.a) {
            case 0:
                c4.b.e0(p5);
                return new Integer(v1.nativeGetCounterValue(((a1.g1) v2_1.i.getValue()).a));
            default:
                c4.b.e0(p5);
                return new Integer(v1.nativeIncrementAndGetCounterValue(((a1.g1) v2_1.i.getValue()).a));
        }
    }
}
