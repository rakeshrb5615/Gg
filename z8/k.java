package z8;
public final class k extends z8.e {

    public final z8.f a(reflect.Type p3, otation.Annotation[] p4)
    {
        if (z8.z0.h(p3) == java.util.concurrent.CompletableFuture) {
            if (!(p3 instanceof reflect.ParameterizedType)) {
                throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            } else {
                IllegalStateException v3_2 = z8.z0.g(0, ((reflect.ParameterizedType) p3));
                if (z8.z0.h(v3_2) == z8.q0) {
                    if (!(v3_2 instanceof reflect.ParameterizedType)) {
                        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                    } else {
                        return new z8.i(1, z8.z0.g(0, ((reflect.ParameterizedType) v3_2)));
                    }
                } else {
                    return new z8.i(0, v3_2);
                }
            }
        } else {
            return 0;
        }
    }
}
