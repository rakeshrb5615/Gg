package z4;
public abstract class m {
    public static final com.google.android.gms.common.logging.Logger a;

    static m()
    {
        String[] v1_1 = new String[0];
        z4.m.a = new com.google.android.gms.common.logging.Logger("JSONParser", v1_1);
        return;
    }

    public static java.util.ArrayList a(org.json.JSONArray p4)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        int v1 = 0;
        while (v1 < p4.length()) {
            r.e v2_1 = p4.get(v1);
            if (!(v2_1 instanceof org.json.JSONArray)) {
                if ((v2_1 instanceof org.json.JSONObject)) {
                    v2_1 = z4.m.c(((org.json.JSONObject) v2_1));
                }
            } else {
                v2_1 = z4.m.a(((org.json.JSONArray) v2_1));
            }
            v0_1.add(v2_1);
            v1++;
        }
        return v0_1;
    }

    public static java.util.Map b(String p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p5);
        String v0_7 = com.google.android.gms.internal.firebase-auth-api.zzt.zza(46).zza(p5);
        com.google.android.gms.common.logging.Logger v4 = z4.m.a;
        if (v0_7.size() >= 2) {
            try {
                java.util.HashMap v5_5 = z4.m.d(new String(com.google.android.gms.common.util.Base64Utils.decodeUrlSafeNoPadding(((String) v0_7.get(1))), "UTF-8"));
            } catch (java.util.HashMap v5_6) {
                Object[] v1_1 = new Object[0];
                v4.e("Unable to decode token", v5_6, v1_1);
                return new java.util.HashMap();
            }
            if (v5_5 != null) {
                return v5_5;
            } else {
                return new java.util.HashMap();
            }
        } else {
            String v0_6 = new Object[0];
            v4.e(g2.g.l("Invalid idToken ", p5), v0_6);
            return new java.util.HashMap();
        }
    }

    public static r.e c(org.json.JSONObject p5)
    {
        r.e v0_1 = new r.e(0);
        java.util.Iterator v1_1 = p5.keys();
        while (v1_1.hasNext()) {
            String v2_1 = ((String) v1_1.next());
            r.e v3_0 = p5.get(v2_1);
            if (!(v3_0 instanceof org.json.JSONArray)) {
                if ((v3_0 instanceof org.json.JSONObject)) {
                    v3_0 = z4.m.c(((org.json.JSONObject) v3_0));
                }
            } else {
                v3_0 = z4.m.a(((org.json.JSONArray) v3_0));
            }
            v0_1.put(v2_1, v3_0);
        }
        return v0_1;
    }

    public static r.e d(String p2)
    {
        if (!android.text.TextUtils.isEmpty(p2)) {
            try {
                com.google.android.gms.internal.firebase-auth-api.zzaao v0_4 = new org.json.JSONObject(p2);
            } catch (r.e v2_4) {
                android.util.Log.d("JSONParser", "Failed to parse JSONObject into Map.");
                throw new com.google.android.gms.internal.firebase-auth-api.zzaao(v2_4);
            }
            if (v0_4 != org.json.JSONObject.NULL) {
                return z4.m.c(v0_4);
            }
        }
        return 0;
    }
}
