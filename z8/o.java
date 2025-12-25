package z8;
public final class o extends z8.e {
    public final java.util.concurrent.Executor a;

    public o(java.util.concurrent.Executor p1)
    {
        this.a = p1;
        return;
    }

    public final z8.f a(reflect.Type p4, otation.Annotation[] p5)
    {
        java.util.concurrent.Executor v2 = 0;
        if (z8.z0.h(p4) == z8.d) {
            if (!(p4 instanceof reflect.ParameterizedType)) {
                throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
            } else {
                IllegalArgumentException v4_2 = z8.z0.g(0, ((reflect.ParameterizedType) p4));
                if (!z8.z0.l(p5, z8.u0)) {
                    v2 = this.a;
                }
                return new n0.a(16, v4_2, v2);
            }
        } else {
            return 0;
        }
    }
}
