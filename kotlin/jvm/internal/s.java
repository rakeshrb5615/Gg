package kotlin.jvm.internal;
public abstract class s {
    public static final kotlin.jvm.internal.t a;

    static s()
    {
        try {
            kotlin.jvm.internal.t v0_0 = ((kotlin.jvm.internal.t) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance());
        } catch (IllegalAccessException) {
        }
        if (v0_0 == null) {
            v0_0 = new kotlin.jvm.internal.t();
        }
        kotlin.jvm.internal.s.a = v0_0;
        return;
    }

    public static kotlin.jvm.internal.e a(Class p1)
    {
        kotlin.jvm.internal.s.a.getClass();
        return new kotlin.jvm.internal.e(p1);
    }
}
