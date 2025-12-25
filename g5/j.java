package g5;
public final class j {
    public static final g5.h d;
    public static final g5.i e;
    public final m5.c a;
    public String b;
    public String c;

    static j()
    {
        g5.j.d = new g5.h(0);
        g5.j.e = new g5.i(0);
        return;
    }

    public j(m5.c p2)
    {
        this.b = 0;
        this.c = 0;
        this.a = p2;
        return;
    }

    public static void a(m5.c p1, String p2, String p3)
    {
        if ((p2 != null) && (p3 != null)) {
            try {
                p1.b(p2, "aqs.".concat(p3)).createNewFile();
                return;
            } catch (java.io.IOException v1_2) {
                android.util.Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", v1_2);
            }
        }
        return;
    }
}
