package j6;
public abstract class e {
    public static final java.util.concurrent.atomic.AtomicInteger a;

    static e()
    {
        j6.e.a = new java.util.concurrent.atomic.AtomicInteger(((int) android.os.SystemClock.elapsedRealtime()));
        return;
    }

    public static boolean a(android.content.res.Resources p5, int p6)
    {
        if (android.os.Build$VERSION.SDK_INT == 26) {
            try {
                if (!(p5.getDrawable(p6, 0) instanceof android.graphics.drawable.AdaptiveIconDrawable)) {
                    return 1;
                } else {
                    String v5_6 = new StringBuilder("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
                    v5_6.append(p6);
                    android.util.Log.e("FirebaseMessaging", v5_6.toString());
                    return 0;
                }
            } catch (android.content.res.Resources$NotFoundException) {
                String v5_3 = new StringBuilder("Couldn\'t find resource ");
                v5_3.append(p6);
                v5_3.append(", treating it as an invalid icon");
                android.util.Log.e("FirebaseMessaging", v5_3.toString());
                return 0;
            }
        } else {
            return 1;
        }
    }
}
