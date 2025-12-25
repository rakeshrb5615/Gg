package z6;
public final class d implements w6.a0 {
    public final synthetic int a;
    public final y6.c b;

    public synthetic d(y6.c p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final w6.z a(w6.m p10, d7.a p11)
    {
        y6.c v1 = this.b;
        w6.z v2_0 = Object;
        z6.m v3_3 = 0;
        switch (this.a) {
            case 0:
                z6.m v5_2 = p11.a;
                if (java.util.Collection.isAssignableFrom(v5_2)) {
                    reflect.Type[] v0_1 = y6.i.h(p11.b, v5_2, java.util.Collection);
                    if ((v0_1 instanceof reflect.ParameterizedType)) {
                        v2_0 = ((reflect.ParameterizedType) v0_1).getActualTypeArguments()[0];
                    }
                    v3_3 = new z6.c(new z6.m(p10, p10.b(new d7.a(v2_0)), v2_0), v1.b(p11, 0));
                }
                return v3_3;
            default:
                z6.m v5_0 = p11.a;
                if (java.util.Map.isAssignableFrom(v5_0)) {
                    reflect.Type[] v0_9;
                    if (!java.util.Properties.isAssignableFrom(v5_0)) {
                        reflect.Type[] v0_8 = y6.i.h(p11.b, v5_0, java.util.Map);
                        if (!(v0_8 instanceof reflect.ParameterizedType)) {
                            v0_9 = new reflect.Type[2];
                            v0_9[0] = Object;
                            v0_9[1] = Object;
                        } else {
                            v0_9 = ((reflect.ParameterizedType) v0_8).getActualTypeArguments();
                        }
                    } else {
                        v0_9 = new reflect.Type[2];
                        v0_9[0] = String;
                        v0_9[1] = String;
                    }
                    z6.m v3_11;
                    w6.z v2_2 = v0_9[0];
                    reflect.Type[] v0_11 = v0_9[1];
                    if ((v2_2 != Boolean.TYPE) && (v2_2 != Boolean)) {
                        v3_11 = p10.b(new d7.a(v2_2));
                    } else {
                        v3_11 = z6.a1.c;
                    }
                    v3_3 = new z6.m(this, new z6.m(p10, v3_11, v2_2), new z6.m(p10, p10.b(new d7.a(v0_11)), v0_11), v1.b(p11, 0));
                }
                return v3_3;
        }
    }
}
