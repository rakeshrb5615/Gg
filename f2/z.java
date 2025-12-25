package f2;
public abstract class z {
    public static final boolean a;

    static z()
    {
        int v0_1;
        if (android.os.Build$VERSION.SDK_INT < 28) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        f2.z.a = v0_1;
        return;
    }
}
