package d8;
public abstract class z1 {
    public static final ThreadLocal a;

    static z1()
    {
        d8.z1.a = new ThreadLocal();
        return;
    }

    public static d8.x0 a()
    {
        ThreadLocal v0 = d8.z1.a;
        d8.i v1_1 = ((d8.x0) v0.get());
        if (v1_1 == null) {
            v1_1 = new d8.i(Thread.currentThread());
            v0.set(v1_1);
        }
        return v1_1;
    }
}
