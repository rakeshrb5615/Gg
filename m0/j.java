package m0;
public abstract class j {
    public static final long a;
    public static final reflect.Method b;

    static j()
    {
        if (android.os.Build$VERSION.SDK_INT < 29) {
            try {
                m0.j.a = android.os.Trace.getField("TRACE_TAG_APP").getLong(0);
                Class v3_0 = Long.TYPE;
                m0.j.b = android.os.Trace.getMethod("isTagEnabled", new Class[] {v3_0}));
                Class v4_1 = Integer.TYPE;
                android.os.Trace.getMethod("asyncTraceBegin", new Class[] {v3_0, String, v4_1}));
                android.os.Trace.getMethod("asyncTraceEnd", new Class[] {v3_0, String, v4_1}));
                android.os.Trace.getMethod("traceCounter", new Class[] {v3_0, String, v4_1}));
                return;
            } catch (Exception v0_2) {
                android.util.Log.i("TraceCompat", "Unable to initialize via reflection.", v0_2);
            }
        }
        return;
    }

    public static boolean a()
    {
        if (android.os.Build$VERSION.SDK_INT < 29) {
            try {
                return ((Boolean) m0.j.b.invoke(0, new Object[] {Long.valueOf(m0.j.a)}))).booleanValue();
            } catch (Exception) {
                android.util.Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
                return 0;
            }
        } else {
            return f2.b0.g();
        }
    }
}
