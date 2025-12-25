package m7;
public final class b extends n7.g {
    public int a;
    public final synthetic u7.p b;
    public final synthetic l7.c c;

    public b(l7.c p1, l7.c p2, u7.p p3)
    {
        this.b = p3;
        this.c = p2;
        super(p1);
        return;
    }

    public final Object invokeSuspend(Object p4)
    {
        String v0_0 = this.a;
        if (v0_0 == null) {
            this.a = 1;
            c4.b.e0(p4);
            String v0_2 = this.b;
            kotlin.jvm.internal.j.c(v0_2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
            kotlin.jvm.internal.u.a(2, v0_2);
            return v0_2.invoke(this.c, this);
        } else {
            if (v0_0 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            } else {
                this.a = 2;
                c4.b.e0(p4);
                return p4;
            }
        }
    }
}
