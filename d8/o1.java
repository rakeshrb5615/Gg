package d8;
public final synthetic class o1 extends kotlin.jvm.internal.i implements u7.q {
    public static final d8.o1 a;

    static o1()
    {
        d8.o1.a = new d8.o1(3, d8.r1, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        return;
    }

    public final Object b(Object p2, Object p3, Object p4)
    {
        if (p3 != null) {
            throw new ClassCastException();
        } else {
            Class vtmp1 = ((d8.r1) p2).getClass();
            do {
                d8.q0 v3_5 = d8.r1.a.get(((d8.r1) p2));
                if (!(v3_5 instanceof d8.b1)) {
                    throw 0;
                } else {
                }
            } while(((d8.r1) p2).J(v3_5) >= 0);
            d8.f0.m(((d8.r1) p2), 1, new d8.q0(((d8.r1) p2)));
            throw 0;
        }
    }
}
