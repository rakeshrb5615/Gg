package okhttp3.internal.platform.android;
public final class AndroidLog {
    public static final okhttp3.internal.platform.android.AndroidLog a;
    public static final java.util.concurrent.CopyOnWriteArraySet b;
    public static final java.util.Map c;

    static AndroidLog()
    {
        String v2_1;
        okhttp3.internal.platform.android.AndroidLog.a = new okhttp3.internal.platform.android.AndroidLog();
        okhttp3.internal.platform.android.AndroidLog.b = new java.util.concurrent.CopyOnWriteArraySet();
        java.util.Map v0_6 = new java.util.LinkedHashMap();
        String v2_0 = okhttp3.OkHttpClient.getPackage();
        if (v2_0 == null) {
            v2_1 = 0;
        } else {
            v2_1 = v2_0.getName();
        }
        if (v2_1 != null) {
            v0_6.put(v2_1, "OkHttp");
        }
        v0_6.put(okhttp3.OkHttpClient.getName(), "okhttp.OkHttpClient");
        v0_6.put(okhttp3.internal.http2.Http2.getName(), "okhttp.Http2");
        v0_6.put(okhttp3.internal.concurrent.TaskRunner.getName(), "okhttp.TaskRunner");
        v0_6.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        okhttp3.internal.platform.android.AndroidLog.c = i7.r.r0(v0_6);
        return;
    }

    private AndroidLog()
    {
        return;
    }

    public static void a(String p5, int p6, String p7, Throwable p8)
    {
        String v0_2 = ((String) okhttp3.internal.platform.android.AndroidLog.c.get(p5));
        if (v0_2 == null) {
            v0_2 = b8.i.G0(23, p5);
        }
        if (android.util.Log.isLoggable(v0_2, p6)) {
            if (p8 != 0) {
                int v1_1 = new StringBuilder();
                v1_1.append(p7);
                v1_1.append(10);
                v1_1.append(android.util.Log.getStackTraceString(p8));
                p7 = v1_1.toString();
            }
            int v8_1 = p7.length();
            int v1_2 = 0;
            while (v1_2 < v8_1) {
                int v2_1 = b8.i.v0(p7, 10, v1_2, 4);
                if (v2_1 == -1) {
                    v2_1 = v8_1;
                }
                while(true) {
                    int v3_2 = Math.min(v2_1, (v1_2 + 4000));
                    int v1_3 = p7.substring(v1_2, v3_2);
                    kotlin.jvm.internal.j.d(v1_3, "substring(...)");
                    android.util.Log.println(p6, v0_2, v1_3);
                    if (v3_2 >= v2_1) {
                        break;
                    }
                    v1_2 = v3_2;
                }
                v1_2 = (v3_2 + 1);
            }
        }
        return;
    }

    public static void b(String p1, String p2)
    {
        java.util.logging.Logger v1_1 = java.util.logging.Logger.getLogger(p1);
        if (okhttp3.internal.platform.android.AndroidLog.b.add(v1_1)) {
            java.util.logging.Level v2_2;
            v1_1.setUseParentHandlers(0);
            if (!android.util.Log.isLoggable(p2, 3)) {
                if (!android.util.Log.isLoggable(p2, 4)) {
                    v2_2 = java.util.logging.Level.WARNING;
                } else {
                    v2_2 = java.util.logging.Level.INFO;
                }
            } else {
                v2_2 = java.util.logging.Level.FINE;
            }
            v1_1.setLevel(v2_2);
            v1_1.addHandler(okhttp3.internal.platform.android.AndroidLogHandler.a);
        }
        return;
    }
}
