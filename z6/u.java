package z6;
public final class u extends z6.r {
    public static final java.util.HashMap e;
    public final reflect.Constructor b;
    public final Object[] c;
    public final java.util.HashMap d;

    static u()
    {
        java.util.HashMap v0_1 = new java.util.HashMap();
        v0_1.put(Byte.TYPE, Byte.valueOf(0));
        v0_1.put(Short.TYPE, Short.valueOf(0));
        v0_1.put(Integer.TYPE, Integer.valueOf(0));
        v0_1.put(Long.TYPE, Long.valueOf(0));
        v0_1.put(Float.TYPE, Float.valueOf(0));
        v0_1.put(Double.TYPE, Double.valueOf(0));
        v0_1.put(Character.TYPE, Character.valueOf(0));
        v0_1.put(Boolean.TYPE, Boolean.FALSE);
        z6.u.e = v0_1;
        return;
    }

    public u(Class p5, z6.t p6)
    {
        super(p6);
        super.d = new java.util.HashMap();
        int v6_4 = b7.c.a;
        Object[] v0_5 = v6_4.t(p5);
        super.b = v0_5;
        b7.c.f(v0_5);
        Class[] v5_1 = v6_4.w(p5);
        int v6_2 = 0;
        Object[] v0_0 = 0;
        while (v0_0 < v5_1.length) {
            super.d.put(v5_1[v0_0], Integer.valueOf(v0_0));
            v0_0++;
        }
        Class[] v5_3 = super.b.getParameterTypes();
        Object[] v0_2 = new Object[v5_3.length];
        super.c = v0_2;
        while (v6_2 < v5_3.length) {
            super.c[v6_2] = z6.u.e.get(v5_3[v6_2]);
            v6_2++;
        }
        return;
    }

    public final Object d()
    {
        return ((Object[]) this.c.clone());
    }

    public final Object e(Object p7)
    {
        reflect.Constructor v2 = this.b;
        try {
            String v7_7 = v2.newInstance(((Object[]) p7));
            return v7_7;
        } catch (String v7_6) {
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", v7_6);
        } catch (reflect.InvocationTargetException v3_0) {
            StringBuilder v5_2 = new StringBuilder("Failed to invoke constructor \'");
            v5_2.append(b7.c.b(v2));
            v5_2.append("\' with args ");
            v5_2.append(java.util.Arrays.toString(v7_7));
            throw new RuntimeException(v5_2.toString(), v3_0);
        } catch (reflect.InvocationTargetException v3_0) {
        } catch (reflect.InvocationTargetException v3_1) {
            StringBuilder v5_0 = new StringBuilder("Failed to invoke constructor \'");
            v5_0.append(b7.c.b(v2));
            v5_0.append("\' with args ");
            v5_0.append(java.util.Arrays.toString(v7_7));
            throw new RuntimeException(v5_0.toString(), v3_1.getCause());
        }
    }

    public final void f(Object p4, e7.a p5, z6.q p6)
    {
        int v0_0 = p6.c;
        String v1_4 = ((Integer) this.d.get(v0_0));
        if (v1_4 == null) {
            String v5_1 = new StringBuilder("Could not find the index in the constructor \'");
            v5_1.append(b7.c.b(this.b));
            v5_1.append("\' for field with name \'");
            v5_1.append(v0_0);
            v5_1.append("\', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
            throw new IllegalStateException(v5_1.toString());
        } else {
            String v1_1 = v1_4.intValue();
            Object v2_1 = p6.f.b(p5);
            if ((v2_1 == null) && (p6.g)) {
                StringBuilder v6_7 = v1.a.q("null is not allowed as value for record component \'", v0_0, "\' of primitive type; at path ");
                v6_7.append(p5.A(0));
                throw new a5.o(v6_7.toString());
            } else {
                ((Object[]) p4)[v1_1] = v2_1;
                return;
            }
        }
    }
}
