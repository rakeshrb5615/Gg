package z4;
public abstract class v {
    public static final java.util.HashMap a;

    static v()
    {
        java.util.HashMap v0_1 = new java.util.HashMap();
        z4.v.a = v0_1;
        v0_1.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        v0_1.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        v0_1.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        v0_1.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        v0_1.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
        return;
    }

    public static com.google.android.gms.common.api.Status a(String p5)
    {
        String v1_2 = new org.json.JSONObject(p5);
        String v2_6 = v1_2.getString("code");
        String v1_8 = v1_2.getString("message");
        if ((!android.text.TextUtils.isEmpty(v2_6)) && (!android.text.TextUtils.isEmpty(v1_8))) {
            StringBuilder v3_2 = z4.v.a;
            if (v3_2.containsKey(v2_6)) {
                String v2_1 = ((String) v3_2.get(v2_6));
                StringBuilder v3_4 = new StringBuilder();
                v3_4.append(v2_1);
                v3_4.append(":");
                v3_4.append(v1_8);
                p5 = w0.a.k(v3_4.toString());
                return p5;
            }
        }
        String v1_3 = new StringBuilder("WEB_INTERNAL_ERROR:");
        v1_3.append(p5);
        return w0.a.k(v1_3.toString());
    }
}
