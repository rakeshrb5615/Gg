package z8;
public abstract class k0 {
    public static final m0.f a;
    public static final z8.a b;
    public static final z8.a c;

    static k0()
    {
        z8.c v0_5 = System.getProperty("java.vm.name");
        v0_5.getClass();
        if (v0_5.equals("RoboVM")) {
            z8.k0.a = 0;
            z8.k0.b = new z8.a(7);
            z8.k0.c = new z8.a(6);
            return;
        } else {
            if (v0_5.equals("Dalvik")) {
                z8.k0.a = new m0.f();
                z8.k0.b = new z8.l0(0);
                z8.k0.c = new z8.c(6);
                return;
            } else {
                z8.k0.a = 0;
                z8.k0.b = new z8.l0(1);
                z8.k0.c = new z8.c(6);
                return;
            }
        }
    }
}
