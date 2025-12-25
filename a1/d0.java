package a1;
public final class d0 extends kotlin.jvm.internal.k implements u7.l {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic d0(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        super(1);
        return;
    }

    public final Object invoke(Object p4)
    {
        switch (this.a) {
            case 0:
                java.util.Collection v0_4 = ((a1.g0) this.b);
                if (((Throwable) p4) != null) {
                    v0_4.h.l(new a1.r0(((Throwable) p4)));
                }
                if (v0_4.j.b != h7.k.a) {
                    ((a1.o0) v0_4.j.getValue()).close();
                }
                return h7.l.a;
            case 1:
                kotlin.jvm.internal.j.e(((java.io.File) p4), "it");
                return new a1.z0(((i8.c) this.b).a, ((java.io.File) p4));
            case 2:
                kotlin.jvm.internal.j.e(((java.util.Map$Entry) p4), "entry");
                return Boolean.valueOf(i7.i.Z(((java.util.Collection) this.b), q0.i0.e(((android.view.View) ((java.util.Map$Entry) p4).getValue()))));
            default:
                kotlin.jvm.internal.j.e(((android.content.Context) p4), "it");
                return new x1.c(((android.content.Context) this.b), 0);
        }
    }
}
