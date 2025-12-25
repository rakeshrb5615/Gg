package androidx.lifecycle;
public final class b {
    public final java.util.HashMap a;
    public final java.util.HashMap b;

    public b(java.util.HashMap p5)
    {
        this.b = p5;
        this.a = new java.util.HashMap();
        java.util.Iterator v5_2 = p5.entrySet().iterator();
        while (v5_2.hasNext()) {
            androidx.lifecycle.c v0_2 = ((java.util.Map$Entry) v5_2.next());
            androidx.lifecycle.n v1_1 = ((androidx.lifecycle.n) v0_2.getValue());
            java.util.ArrayList v2_2 = ((java.util.List) this.a.get(v1_1));
            if (v2_2 == null) {
                v2_2 = new java.util.ArrayList();
                this.a.put(v1_1, v2_2);
            }
            v2_2.add(((androidx.lifecycle.c) v0_2.getKey()));
        }
        return;
    }

    public static void a(java.util.List p5, androidx.lifecycle.u p6, androidx.lifecycle.n p7, androidx.lifecycle.t p8)
    {
        if (p5 != null) {
            int v0_1 = (p5.size() - 1);
            while (v0_1 >= 0) {
                Object[] v2_5 = ((androidx.lifecycle.c) p5.get(v0_1));
                reflect.Method v3 = v2_5.b;
                try {
                    Object[] v2_0 = v2_5.a;
                } catch (IllegalAccessException v5_2) {
                    throw new RuntimeException("Failed to call observer method", v5_2.getCause());
                } catch (IllegalAccessException v5_1) {
                    throw new RuntimeException(v5_1);
                }
                if (v2_0 == null) {
                    v3.invoke(p8, 0);
                } else {
                    if (v2_0 == 1) {
                        v3.invoke(p8, new Object[] {p6}));
                    } else {
                        if (v2_0 == 2) {
                            v3.invoke(p8, new Object[] {p6, p7}));
                        } else {
                        }
                    }
                }
                v0_1--;
            }
        }
        return;
    }
}
