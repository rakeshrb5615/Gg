package z6;
public final class i extends w6.z {
    public static final z6.h d;
    public final java.util.HashMap a;
    public final java.util.HashMap b;
    public final java.util.HashMap c;

    static i()
    {
        z6.i.d = new z6.h();
        return;
    }

    public i(Class p12)
    {
        this.a = new java.util.HashMap();
        this.b = new java.util.HashMap();
        this.c = new java.util.HashMap();
        reflect.Field[] v12_1 = p12.getDeclaredFields();
        int v0_1 = v12_1.length;
        int v2_0 = 0;
        java.util.HashMap v3_0 = 0;
        while (v2_0 < v0_1) {
            Enum v4_3 = v12_1[v2_0];
            if (v4_3.isEnumConstant()) {
                String v5_2 = (v3_0 + 1);
                v12_1[v3_0] = v4_3;
                v3_0 = v5_2;
            }
            v2_0++;
        }
        reflect.Field[] v12_3 = ((reflect.Field[]) java.util.Arrays.copyOf(v12_1, v3_0));
        reflect.AccessibleObject.setAccessible(v12_3, 1);
        int v0_4 = v12_3.length;
        int v2_1 = 0;
        while (v2_1 < v0_4) {
            java.util.HashMap v3_1 = v12_3[v2_1];
            Enum v4_2 = ((Enum) v3_1.get(0));
            String v5_0 = v4_2.name();
            String v6 = v4_2.toString();
            java.util.HashMap v3_3 = ((x6.b) v3_1.getAnnotation(x6.b));
            if (v3_3 != null) {
                v5_0 = v3_3.value();
                java.util.HashMap v3_4 = v3_3.alternate();
                int v7_1 = v3_4.length;
                int v8 = 0;
                while (v8 < v7_1) {
                    this.a.put(v3_4[v8], v4_2);
                    v8++;
                }
            }
            this.a.put(v5_0, v4_2);
            this.b.put(v6, v4_2);
            this.c.put(v4_2, v5_0);
            v2_1++;
        }
        return;
    }

    public final Object b(e7.a p3)
    {
        if (p3.O() != 9) {
            Enum v3_4 = p3.M();
            java.util.HashMap v0_4 = ((Enum) this.a.get(v3_4));
            if (v0_4 != null) {
                return v0_4;
            } else {
                return ((Enum) this.b.get(v3_4));
            }
        } else {
            p3.K();
            return 0;
        }
    }

    public final void c(e7.b p2, Object p3)
    {
        String v3_3;
        if (((Enum) p3) != null) {
            v3_3 = ((String) this.c.get(((Enum) p3)));
        } else {
            v3_3 = 0;
        }
        p2.I(v3_3);
        return;
    }
}
