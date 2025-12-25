package y6;
public abstract class v {
    public static final y6.v a;

    static v()
    {
        Class[] v5_6 = Class.forName("sun.misc.Unsafe");
        Object[] v6_0 = v5_6.getDeclaredField("theUnsafe");
        v6_0.setAccessible(1);
        y6.u v7_2 = new y6.r(v5_6.getMethod("allocateInstance", new Class[] {Class})), v6_0.get(0));
        y6.v.a = v7_2;
        return;
    }

    public abstract Object a();
}
