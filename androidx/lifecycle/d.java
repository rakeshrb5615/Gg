package androidx.lifecycle;
public final class d {
    public static final androidx.lifecycle.d c;
    public final java.util.HashMap a;
    public final java.util.HashMap b;

    static d()
    {
        androidx.lifecycle.d.c = new androidx.lifecycle.d();
        return;
    }

    public d()
    {
        this.a = new java.util.HashMap();
        this.b = new java.util.HashMap();
        return;
    }

    public static void b(java.util.HashMap p3, androidx.lifecycle.c p4, androidx.lifecycle.n p5, Class p6)
    {
        androidx.lifecycle.n v0_1 = ((androidx.lifecycle.n) p3.get(p4));
        if ((v0_1 != null) && (p5 != v0_1)) {
            String v3_7 = p4.b;
            StringBuilder v1_1 = new StringBuilder("Method ");
            v1_1.append(v3_7.getName());
            v1_1.append(" in ");
            v1_1.append(p6.getName());
            v1_1.append(" already declared with different @OnLifecycleEvent value: previous value ");
            v1_1.append(v0_1);
            v1_1.append(", new value ");
            v1_1.append(p5);
            throw new IllegalArgumentException(v1_1.toString());
        } else {
            if (v0_1 == null) {
                p3.put(p4, p5);
            }
            return;
        }
    }

    public final androidx.lifecycle.b a(Class p13, reflect.Method[] p14)
    {
        java.util.HashMap v0_0 = p13.getSuperclass();
        Boolean v1_1 = new java.util.HashMap();
        java.util.HashMap v3 = this.a;
        if (v0_0 != null) {
            int v4_0 = ((androidx.lifecycle.b) v3.get(v0_0));
            if (v4_0 == 0) {
                v4_0 = this.a(v0_0, 0);
            }
            v1_1.putAll(v4_0.b);
        }
        java.util.HashMap v0_2 = p13.getInterfaces();
        int v4_1 = v0_2.length;
        IllegalArgumentException v6_0 = 0;
        while (v6_0 < v4_1) {
            androidx.lifecycle.n v7_7 = v0_2[v6_0];
            int v8_0 = ((androidx.lifecycle.b) v3.get(v7_7));
            if (v8_0 == 0) {
                v8_0 = this.a(v7_7, 0);
            }
            androidx.lifecycle.n v7_2 = v8_0.b.entrySet().iterator();
            while (v7_2.hasNext()) {
                int v8_3 = ((java.util.Map$Entry) v7_2.next());
                androidx.lifecycle.d.b(v1_1, ((androidx.lifecycle.c) v8_3.getKey()), ((androidx.lifecycle.n) v8_3.getValue()), p13);
            }
            v6_0++;
        }
        if (p14 == null) {
            try {
                p14 = p13.getDeclaredMethods();
            } catch (IllegalArgumentException v13_1) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", v13_1);
            }
        }
        java.util.HashMap v0_4 = p14.length;
        int v2_0 = 0;
        int v4_2 = 0;
        while (v2_0 < v0_4) {
            IllegalArgumentException v6_1 = p14[v2_0];
            androidx.lifecycle.n v7_5 = ((androidx.lifecycle.f0) v6_1.getAnnotation(androidx.lifecycle.f0));
            if (v7_5 != null) {
                int v8_7;
                int v4_3 = v6_1.getParameterTypes();
                if (v4_3.length <= 0) {
                    v8_7 = 0;
                } else {
                    if (!androidx.lifecycle.u.isAssignableFrom(v4_3[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    } else {
                        v8_7 = 1;
                    }
                }
                androidx.lifecycle.n v7_6 = v7_5.value();
                if (v4_3.length > 1) {
                    if (!androidx.lifecycle.n.isAssignableFrom(v4_3[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else {
                        if (v7_6 != androidx.lifecycle.n.ON_ANY) {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        } else {
                            v8_7 = 2;
                        }
                    }
                }
                if (v4_3.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                } else {
                    androidx.lifecycle.d.b(v1_1, new androidx.lifecycle.c(v6_1, v8_7), v7_6, p13);
                    v4_2 = 1;
                }
            }
            v2_0++;
        }
        String v14_4 = new androidx.lifecycle.b(v1_1);
        v3.put(p13, v14_4);
        this.b.put(p13, Boolean.valueOf(v4_2));
        return v14_4;
    }
}
