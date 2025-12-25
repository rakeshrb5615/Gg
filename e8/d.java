package e8;
public abstract class d {
    private static volatile android.view.Choreographer choreographer;

    static d()
    {
        try {
            e8.c v0_1 = new e8.c(e8.d.a(android.os.Looper.getMainLooper()), 0);
        } catch (e8.c v0_2) {
            v0_1 = c4.b.p(v0_2);
        }
        // Both branches of the condition point to the same code.
        // if (!(v0_1 instanceof h7.g)) {
            return;
        // }
    }

    public static final android.os.Handler a(android.os.Looper p5)
    {
        if (android.os.Build$VERSION.SDK_INT < 28) {
            try {
                android.os.Handler v5_3 = ((android.os.Handler) android.os.Handler.getDeclaredConstructor(new Class[] {android.os.Looper, android.os.Handler$Callback, Boolean.TYPE})).newInstance(new Object[] {p5, 0, Boolean.TRUE})));
                return v5_3;
            } catch (NoSuchMethodException) {
                return new android.os.Handler(v5_3);
            }
        } else {
            android.os.Handler v5_5 = android.os.Handler.getDeclaredMethod("createAsync", new Class[] {android.os.Looper})).invoke(0, new Object[] {p5}));
            kotlin.jvm.internal.j.c(v5_5, "null cannot be cast to non-null type android.os.Handler");
            return ((android.os.Handler) v5_5);
        }
    }
}
