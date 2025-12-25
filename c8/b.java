package c8;
public abstract class b {
    public static final synthetic int a;

    static b()
    {
        ThreadLocal[] v1 = new ThreadLocal[4];
        int v2 = 0;
        while (v2 < 4) {
            v1[v2] = new ThreadLocal();
            v2++;
        }
        return;
    }
}
