package j6;
public final class t {
    public static final long d;
    public final String a;
    public final String b;
    public final long c;

    static t()
    {
        j6.t.d = java.util.concurrent.TimeUnit.DAYS.toMillis(7);
        return;
    }

    public t(String p1, String p2, long p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public static String a(String p2, String p3, long p4)
    {
        try {
            org.json.JSONObject v0_1 = new org.json.JSONObject();
            v0_1.put("token", p2);
            v0_1.put("appVersion", p3);
            v0_1.put("timestamp", p4);
            return v0_1.toString();
        } catch (int v2_1) {
            String v3_2 = new StringBuilder("Failed to encode token: ");
            v3_2.append(v2_1);
            android.util.Log.w("FirebaseMessaging", v3_2.toString());
            return 0;
        }
    }

    public static j6.t b(String p6)
    {
        if (!android.text.TextUtils.isEmpty(p6)) {
            if (!p6.startsWith("{")) {
                return new j6.t(p6, 0, 0);
            } else {
                try {
                    String v0_3 = new org.json.JSONObject(p6);
                    return new j6.t(v0_3.getString("token"), v0_3.getString("appVersion"), v0_3.getLong("timestamp"));
                } catch (String v6_3) {
                    String v0_5 = new StringBuilder("Failed to parse token: ");
                    v0_5.append(v6_3);
                    android.util.Log.w("FirebaseMessaging", v0_5.toString());
                    return 0;
                }
            }
        } else {
            return 0;
        }
    }
}
