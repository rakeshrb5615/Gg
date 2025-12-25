package g5;
public final enum class f extends java.lang.Enum {
    public static final enum g5.f a;
    public static final java.util.HashMap b;
    public static final synthetic g5.f[] c;

    static f()
    {
        g5.f v0_1 = new g5.f("X86_32", 0);
        new g5.f("X86_64", 1);
        new g5.f("ARM_UNKNOWN", 2);
        new g5.f("PPC", 3);
        new g5.f("PPC64", 4);
        g5.f v5_3 = new g5.f("ARMV6", 5);
        g5.f v6_2 = new g5.f("ARMV7", 6);
        g5.f.a = new g5.f("UNKNOWN", 7);
        new g5.f("ARMV7S", 8);
        g5.f v9_3 = new g5.f("ARM64", 9);
        g5.f.c = new g5.f[] {v0_1, v9_3});
        java.util.HashMap v1_4 = new java.util.HashMap(4);
        g5.f.b = v1_4;
        v1_4.put("armeabi-v7a", v6_2);
        v1_4.put("armeabi", v5_3);
        v1_4.put("arm64-v8a", v9_3);
        v1_4.put("x86", v0_1);
        return;
    }

    public static g5.f valueOf(String p1)
    {
        return ((g5.f) Enum.valueOf(g5.f, p1));
    }

    public static g5.f[] values()
    {
        return ((g5.f[]) g5.f.c.clone());
    }
}
