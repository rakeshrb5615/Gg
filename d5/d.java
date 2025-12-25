package d5;
public final class d {
    public static final d5.d a;

    static d()
    {
        d5.d.a = new d5.d();
        return;
    }

    public boolean a(int p2)
    {
        if ((4 > p2) && (!android.util.Log.isLoggable("FirebaseCrashlytics", p2))) {
            return 0;
        } else {
            return 1;
        }
    }

    public void b(String p3)
    {
        if (this.a(3)) {
            android.util.Log.d("FirebaseCrashlytics", p3, 0);
        }
        return;
    }

    public void c(String p3)
    {
        if (this.a(2)) {
            android.util.Log.v("FirebaseCrashlytics", p3, 0);
        }
        return;
    }

    public void d(String p2, Exception p3)
    {
        if (this.a(5)) {
            android.util.Log.w("FirebaseCrashlytics", p2, p3);
        }
        return;
    }
}
