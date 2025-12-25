package z6;
public class a implements w6.a0 {

    public a()
    {
        return;
    }

    public final w6.z a(w6.m p3, d7.a p4)
    {
        Class v4_1 = p4.b;
        w6.z v0_0 = (v4_1 instanceof reflect.GenericArrayType);
        if ((v0_0 != null) || (((v4_1 instanceof Class)) && (((Class) v4_1).isArray()))) {
            Class v4_3;
            if (v0_0 == null) {
                v4_3 = ((Class) v4_1).getComponentType();
            } else {
                v4_3 = ((reflect.GenericArrayType) v4_1).getGenericComponentType();
            }
            return new z6.b(p3, p3.b(new d7.a(v4_3)), y6.i.g(v4_3));
        } else {
            return 0;
        }
    }
}
