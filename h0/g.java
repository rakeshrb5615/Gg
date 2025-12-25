package h0;
public final class g extends h0.f {

    public final android.graphics.Typeface m0(Object p4)
    {
        RuntimeException v0_2 = Integer.valueOf(-1);
        try {
            int v1_2 = reflect.Array.newInstance(this.c, 1);
            reflect.Array.set(v1_2, 0, p4);
            return ((android.graphics.Typeface) this.i.invoke(0, new Object[] {v1_2, "sans-serif", v0_2, v0_2})));
        } catch (reflect.InvocationTargetException v4_3) {
            throw new RuntimeException(v4_3);
        } catch (reflect.InvocationTargetException v4_3) {
        }
    }

    public final reflect.Method q0(Class p4)
    {
        reflect.Method v4_1 = android.graphics.Typeface.getDeclaredMethod("createFromFamiliesWithDefault", new Class[] {reflect.Array.newInstance(p4, 1).getClass(), String, Integer.TYPE, Integer.TYPE}));
        v4_1.setAccessible(1);
        return v4_1;
    }
}
