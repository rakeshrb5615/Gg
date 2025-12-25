package y6;
public final class u extends y6.v {

    public final Object a(Class p4)
    {
        StringBuilder v1_1 = new StringBuilder("Cannot allocate ");
        v1_1.append(p4);
        v1_1.append(". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        throw new UnsupportedOperationException(v1_1.toString());
    }
}
