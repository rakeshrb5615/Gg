package n6;
public final class f {
    public static final java.util.Date h;
    public final org.json.JSONObject a;
    public final org.json.JSONObject b;
    public final java.util.Date c;
    public final org.json.JSONArray d;
    public final org.json.JSONObject e;
    public final long f;
    public final org.json.JSONArray g;

    static f()
    {
        n6.f.h = new java.util.Date(0);
        return;
    }

    public f(org.json.JSONObject p5, java.util.Date p6, org.json.JSONArray p7, org.json.JSONObject p8, long p9, org.json.JSONArray p11)
    {
        org.json.JSONObject v0_1 = new org.json.JSONObject();
        v0_1.put("configs_key", p5);
        v0_1.put("fetch_time_key", p6.getTime());
        v0_1.put("abt_experiments_key", p7);
        v0_1.put("personalization_metadata_key", p8);
        v0_1.put("template_version_number_key", p9);
        v0_1.put("rollout_metadata_key", p11);
        this.b = p5;
        this.c = p6;
        this.d = p7;
        this.e = p8;
        this.f = p9;
        this.g = p11;
        this.a = v0_1;
        return;
    }

    public static n6.f a(org.json.JSONObject p9)
    {
        String v0_5 = p9.optJSONObject("personalization_metadata_key");
        if (v0_5 == null) {
            v0_5 = new org.json.JSONObject();
        }
        org.json.JSONObject v5 = v0_5;
        String v0_2 = p9.optJSONArray("rollout_metadata_key");
        if (v0_2 == null) {
            v0_2 = new org.json.JSONArray();
        }
        return new n6.f(p9.getJSONObject("configs_key"), new java.util.Date(p9.getLong("fetch_time_key")), p9.getJSONArray("abt_experiments_key"), v5, p9.optLong("template_version_number_key"), v0_2);
    }

    public static n6.e c()
    {
        n6.e v0_1 = new n6.e();
        v0_1.a = new org.json.JSONObject();
        v0_1.b = n6.f.h;
        v0_1.c = new org.json.JSONArray();
        v0_1.d = new org.json.JSONObject();
        v0_1.e = 0;
        v0_1.f = new org.json.JSONArray();
        return v0_1;
    }

    public final java.util.HashMap b()
    {
        java.util.HashMap v0_1 = new java.util.HashMap();
        int v2 = 0;
        while(true) {
            org.json.JSONArray v3_2 = this.g;
            if (v2 >= v3_2.length()) {
                break;
            }
            org.json.JSONArray v3_0 = v3_2.getJSONObject(v2);
            String v4_1 = v3_0.getString("rolloutId");
            String v5_1 = v3_0.getString("variantId");
            org.json.JSONArray v3_1 = v3_0.getJSONArray("affectedParameterKeys");
            int v6_1 = 0;
            while (v6_1 < v3_1.length()) {
                java.util.Map v7_1 = v3_1.getString(v6_1);
                if (!v0_1.containsKey(v7_1)) {
                    v0_1.put(v7_1, new java.util.HashMap());
                }
                java.util.Map v7_3 = ((java.util.Map) v0_1.get(v7_1));
                if (v7_3 != null) {
                    v7_3.put(v4_1, v5_1);
                }
                v6_1++;
            }
            v2++;
        }
        return v0_1;
    }

    public final boolean equals(Object p2)
    {
        if (this != p2) {
            if ((p2 instanceof n6.f)) {
                return this.a.toString().equals(((n6.f) p2).a.toString());
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.a.hashCode();
    }

    public final String toString()
    {
        return this.a.toString();
    }
}
