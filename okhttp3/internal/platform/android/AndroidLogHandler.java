package okhttp3.internal.platform.android;
public final class AndroidLogHandler extends java.util.logging.Handler {
    public static final okhttp3.internal.platform.android.AndroidLogHandler a;

    static AndroidLogHandler()
    {
        okhttp3.internal.platform.android.AndroidLogHandler.a = new okhttp3.internal.platform.android.AndroidLogHandler();
        return;
    }

    private AndroidLogHandler()
    {
        return;
    }

    public final void close()
    {
        return;
    }

    public final void flush()
    {
        return;
    }

    public final void publish(java.util.logging.LogRecord p6)
    {
        int v2_3;
        kotlin.jvm.internal.j.e(p6, "record");
        String v1 = p6.getLoggerName();
        kotlin.jvm.internal.j.d(v1, "getLoggerName(...)");
        String v3_0 = java.util.logging.Level.INFO;
        if (p6.getLevel().intValue() <= v3_0.intValue()) {
            if (p6.getLevel().intValue() != v3_0.intValue()) {
                v2_3 = 3;
            } else {
                v2_3 = 4;
            }
        } else {
            v2_3 = 5;
        }
        String v3_2 = p6.getMessage();
        kotlin.jvm.internal.j.d(v3_2, "getMessage(...)");
        Throwable v6_1 = p6.getThrown();
        okhttp3.internal.platform.android.AndroidLog.a.getClass();
        okhttp3.internal.platform.android.AndroidLog.a(v1, v2_3, v3_2, v6_1);
        return;
    }
}
