package androidx.lifecycle;
public abstract synthetic class f {
    public static final synthetic int[] a;

    static f()
    {
        int[] v0_2 = new int[androidx.lifecycle.n.values().length];
        androidx.lifecycle.n.ON_CREATE.ordinal()[int v1_12] = 1;
        androidx.lifecycle.n.ON_START.ordinal()[int v1_0] = 2;
        androidx.lifecycle.n.ON_RESUME.ordinal()[int v1_2] = 3;
        androidx.lifecycle.n.ON_PAUSE.ordinal()[int v1_4] = 4;
        androidx.lifecycle.n.ON_STOP.ordinal()[int v1_6] = 5;
        androidx.lifecycle.n.ON_DESTROY.ordinal()[int v1_8] = 6;
        try {
            androidx.lifecycle.n.ON_ANY.ordinal()[int v1_10] = 7;
        } catch (NoSuchFieldError) {
        }
        androidx.lifecycle.f.a = v0_2;
        return;
    }
}
