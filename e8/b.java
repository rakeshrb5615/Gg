package e8;
public final class b extends l7.a implements l7.f {
    private volatile Object _preHandler;

    public b()
    {
        super(d8.b0.a);
        super._preHandler = super;
        return;
    }

    public final void i(Throwable p4)
    {
        if (android.os.Build$VERSION.SDK_INT < 28) {
            Thread v0_1;
            Thread v0_3 = this._preHandler;
            Thread$UncaughtExceptionHandler v1_2 = 0;
            if (v0_3 == this) {
                try {
                    v0_1 = Thread.getDeclaredMethod("getUncaughtExceptionPreHandler", 0);
                } catch (Throwable) {
                    v0_1 = 0;
                    this._preHandler = v0_1;
                }
                if ((!reflect.Modifier.isPublic(v0_1.getModifiers())) || (!reflect.Modifier.isStatic(v0_1.getModifiers()))) {
                }
            } else {
                v0_1 = ((reflect.Method) v0_3);
            }
            Thread v0_2;
            if (v0_1 == null) {
                v0_2 = 0;
            } else {
                v0_2 = v0_1.invoke(0, 0);
            }
            if ((v0_2 instanceof Thread$UncaughtExceptionHandler)) {
                v1_2 = ((Thread$UncaughtExceptionHandler) v0_2);
            }
            if (v1_2 != null) {
                v1_2.uncaughtException(Thread.currentThread(), p4);
            }
        }
        return;
    }
}
