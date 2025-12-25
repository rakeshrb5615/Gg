package e1;
public final class a extends kotlin.jvm.internal.k implements u7.l {
    public static final e1.a a;

    static a()
    {
        e1.a.a = new e1.a(1);
        return;
    }

    public final Object invoke(Object p8)
    {
        String v0_1;
        kotlin.jvm.internal.j.e(((java.util.Map$Entry) p8), "entry");
        String v0_4 = ((java.util.Map$Entry) p8).getValue();
        if (!(v0_4 instanceof byte[])) {
            v0_1 = String.valueOf(((java.util.Map$Entry) p8).getValue());
        } else {
            String v0_2 = ((byte[]) v0_4);
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("[");
            String v2_1 = v0_2.length;
            int v3 = 0;
            int v4 = 0;
            while (v3 < v2_1) {
                String v5_0 = v0_2[v3];
                v4++;
                if (v4 > 1) {
                    v1_1.append(", ");
                }
                v1_1.append(String.valueOf(v5_0));
                v3++;
            }
            v1_1.append("]");
            v0_1 = v1_1.toString();
        }
        return v1.a.o(new StringBuilder("  "), ((e1.e) ((java.util.Map$Entry) p8).getKey()).a, " = ", v0_1);
    }
}
