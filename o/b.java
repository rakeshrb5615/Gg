package o;
public final class b extends q4.b {
    public final Object f;
    public volatile android.os.Handler g;

    public b()
    {
        super(20);
        super.f = new Object();
        java.util.concurrent.Executors.newFixedThreadPool(4, new androidx.loader.content.f(1));
        return;
    }

    public static android.os.Handler V(android.os.Looper p4)
    {
        if (android.os.Build$VERSION.SDK_INT < 28) {
            try {
                return ((android.os.Handler) android.os.Handler.getDeclaredConstructor(new Class[] {android.os.Looper, android.os.Handler$Callback, Boolean.TYPE})).newInstance(new Object[] {p4, 0, Boolean.TRUE})));
            } catch (NoSuchMethodException) {
                return new android.os.Handler(p4);
            } catch (reflect.InvocationTargetException) {
                return new android.os.Handler(p4);
            }
        } else {
            return e0.a.a(p4);
        }
    }
}
