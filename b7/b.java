package b7;
public final class b extends q4.b {
    public final reflect.Method f;
    public final reflect.Method g;
    public final reflect.Method h;
    public final reflect.Method i;

    public b()
    {
        super(3);
        super.f = Class.getMethod("isRecord", 0);
        super.g = Class.getMethod("getRecordComponents", 0);
        reflect.Method v0_3 = Class.forName("java.lang.reflect.RecordComponent");
        super.h = v0_3.getMethod("getName", 0);
        super.i = v0_3.getMethod("getType", 0);
        return;
    }

    public final boolean E(Class p3)
    {
        try {
            return ((Boolean) this.f.invoke(p3, 0)).booleanValue();
        } catch (ReflectiveOperationException v3_4) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", v3_4);
        }
    }

    public final reflect.Method s(Class p2, reflect.Field p3)
    {
        try {
            return p2.getMethod(p3.getName(), 0);
        } catch (ReflectiveOperationException v2_2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", v2_2);
        }
    }

    public final reflect.Constructor t(Class p7)
    {
        RuntimeException v0_4 = ((Object[]) this.g.invoke(p7, 0));
        Class[] v2_1 = new Class[v0_4.length];
        int v3 = 0;
        while (v3 < v0_4.length) {
            v2_1[v3] = ((Class) this.i.invoke(v0_4[v3], 0));
            v3++;
        }
        return p7.getDeclaredConstructor(v2_1);
    }

    public final String[] w(Class p6)
    {
        try {
            ReflectiveOperationException v6_3 = ((Object[]) this.g.invoke(p6, 0));
            RuntimeException v0_4 = new String[v6_3.length];
            int v2 = 0;
        } catch (ReflectiveOperationException v6_1) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", v6_1);
        }
        while (v2 < v6_3.length) {
            v0_4[v2] = ((String) this.h.invoke(v6_3[v2], 0));
            v2++;
        }
        return v0_4;
    }
}
