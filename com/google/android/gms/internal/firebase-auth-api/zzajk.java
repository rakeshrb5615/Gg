package com.google.android.gms.internal.firebase-auth-api;
public final class zzajk {

    public static com.google.android.gms.internal.firebase-auth-api.zzacn zza(Exception p4, String p5, String p6)
    {
        com.google.android.gms.internal.firebase-auth-api.zzacn v0_0 = p4.getMessage();
        StringBuilder v1_3 = v1.a.r("Failed to parse ", p5, " for string [", p6, "] with exception: ");
        v1_3.append(v0_0);
        android.util.Log.e(p5, v1_3.toString());
        StringBuilder v1_1 = new StringBuilder("Failed to parse ");
        v1_1.append(p5);
        v1_1.append(" for string [");
        v1_1.append(p6);
        v1_1.append("]");
        return new com.google.android.gms.internal.firebase-auth-api.zzacn(v1_1.toString(), p4);
    }

    public static java.util.List zza(org.json.JSONArray p3)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        if ((p3 != null) && (p3.length() != 0)) {
            int v1_0 = 0;
            while (v1_0 < p3.length()) {
                v0_1.add(p3.getString(v1_0));
                v1_0++;
            }
        }
        return v0_1;
    }

    public static void zza(org.json.JSONObject p2)
    {
        p2.put("clientType", "CLIENT_TYPE_ANDROID");
        return;
    }

    public static void zza(org.json.JSONObject p0, String p1, String p2)
    {
        p0.put(p1, p2);
        p0.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
        p0.put("clientType", "CLIENT_TYPE_ANDROID");
        return;
    }
}
