package n6;
public final class n {
    public static final java.util.Date e;
    public static final java.util.Date f;
    public final android.content.SharedPreferences a;
    public final Object b;
    public final Object c;
    public final Object d;

    static n()
    {
        n6.n.e = new java.util.Date(-1);
        n6.n.f = new java.util.Date(-1);
        return;
    }

    public n(android.content.SharedPreferences p1)
    {
        this.a = p1;
        this.b = new Object();
        this.c = new Object();
        this.d = new Object();
        return;
    }

    public final n6.m a()
    {
        try {
            int v2_1 = this.a.getInt("num_failed_fetches", 0);
            java.util.Date v3_0 = new java.util.Date(this.a.getLong("backoff_end_time_in_millis", -1));
            Throwable v1_1 = new n6.m();
            v1_1.a = v2_1;
            v1_1.b = v3_0;
            return v1_1;
        } catch (Throwable v1_2) {
            throw v1_2;
        }
    }

    public final java.util.HashMap b()
    {
        try {
            org.json.JSONObject v1_2 = new org.json.JSONObject(this.a.getString("customSignals", "{}"));
            java.util.HashMap v0_5 = new java.util.HashMap();
            java.util.Iterator v2_0 = v1_2.keys();
        } catch (org.json.JSONException) {
            return new java.util.HashMap();
        }
        while (v2_0.hasNext()) {
            String v3_2 = ((String) v2_0.next());
            v0_5.put(v3_2, v1_2.optString(v3_2));
        }
        return v0_5;
    }

    public final n6.m c()
    {
        try {
            int v2_1 = this.a.getInt("num_failed_realtime_streams", 0);
            java.util.Date v3_0 = new java.util.Date(this.a.getLong("realtime_backoff_end_time_in_millis", -1));
            Throwable v1_1 = new n6.m();
            v1_1.a = v2_1;
            v1_1.b = v3_0;
            return v1_1;
        } catch (Throwable v1_2) {
            throw v1_2;
        }
    }

    public final void d(int p5, java.util.Date p6)
    {
        try {
            this.a.edit().putInt("num_failed_fetches", p5).putLong("backoff_end_time_in_millis", p6.getTime()).apply();
            return;
        } catch (Throwable v5_2) {
            throw v5_2;
        }
    }

    public final void e(int p5, java.util.Date p6)
    {
        try {
            this.a.edit().putInt("num_failed_realtime_streams", p5).putLong("realtime_backoff_end_time_in_millis", p6.getTime()).apply();
            return;
        } catch (Throwable v5_2) {
            throw v5_2;
        }
    }
}
