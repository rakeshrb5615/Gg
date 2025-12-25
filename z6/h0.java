package z6;
public class h0 extends w6.z {

    public h0()
    {
        return;
    }

    public final Object b(e7.a p4)
    {
        String v0_2 = new StringBuilder("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee ");
        v0_2.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
        throw new UnsupportedOperationException(v0_2.toString());
    }

    public final void c(e7.b p3, Object p4)
    {
        StringBuilder v0_1 = new StringBuilder("Attempted to serialize java.lang.Class: ");
        v0_1.append(((Class) p4).getName());
        v0_1.append(". Forgot to register a type adapter?\nSee ");
        v0_1.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
        throw new UnsupportedOperationException(v0_1.toString());
    }
}
