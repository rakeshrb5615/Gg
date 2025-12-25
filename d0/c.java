package d0;
public abstract class c {
    public static final Class a;
    public static final reflect.Field b;
    public static final reflect.Field c;
    public static final reflect.Method d;
    public static final reflect.Method e;
    public static final reflect.Method f;
    public static final android.os.Handler g;

    static c()
    {
        d0.c.g = new android.os.Handler(android.os.Looper.getMainLooper());
        reflect.Method v1_2 = 0;
        try {
            int v2_0 = Class.forName("android.app.ActivityThread");
        } catch (Throwable) {
            v2_0 = 0;
        }
        d0.c.a = v2_0;
        try {
            String v3_1 = android.app.Activity.getDeclaredField("mMainThread");
            v3_1.setAccessible(1);
        } catch (Throwable) {
            v3_1 = 0;
        }
        d0.c.b = v3_1;
        try {
            reflect.Method v0_1 = android.app.Activity.getDeclaredField("mToken");
            v0_1.setAccessible(1);
        } catch (Throwable) {
            v0_1 = 0;
        }
        reflect.Method v0_3;
        d0.c.c = v0_1;
        reflect.Method v0_2 = d0.c.a;
        String v3_3 = Boolean.TYPE;
        try {
            if (v0_2 != null) {
                v0_3 = v0_2.getDeclaredMethod("performStopActivity", new Class[] {android.os.IBinder, v3_3, String}));
                v0_3.setAccessible(1);
            } else {
                v0_3 = 0;
            }
        } catch (Throwable) {
        }
        reflect.Method v0_5;
        d0.c.d = v0_3;
        reflect.Method v0_4 = d0.c.a;
        try {
            if (v0_4 != null) {
                v0_5 = v0_4.getDeclaredMethod("performStopActivity", new Class[] {android.os.IBinder, v3_3}));
                v0_5.setAccessible(1);
            } else {
                v0_5 = 0;
            }
        } catch (Throwable) {
        }
        d0.c.e = v0_5;
        reflect.Method v0_6 = d0.c.a;
        String v3_5 = android.os.Build$VERSION.SDK_INT;
        try {
            if (((v3_5 == 26) || (v3_5 == 27)) && (v0_6 != null)) {
                Class v6 = java.util.List;
                Class v10 = android.content.res.Configuration;
                reflect.Method v0_7 = v0_6.getDeclaredMethod("requestRelaunchActivity", new Class[] {android.os.IBinder, Boolean.TYPE}));
                v0_7.setAccessible(1);
                v1_2 = v0_7;
            }
        } catch (Throwable) {
        }
        d0.c.f = v1_2;
        return;
    }
}
