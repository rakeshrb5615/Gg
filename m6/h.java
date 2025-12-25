package m6;
public final synthetic class h implements com.google.android.gms.common.util.BiConsumer {
    public final synthetic n0.a a;

    public synthetic h(n0.a p1)
    {
        this.a = p1;
        return;
    }

    public final void accept(Object p7, Object p8)
    {
        String v0_0 = this.a;
        u4.c v1_4 = ((u4.b) ((c6.b) v0_0.b).get());
        if (v1_4 != null) {
            org.json.JSONObject v2_1 = ((n6.f) p8).e;
            if (v2_1.length() >= 1) {
                String v8_1 = ((n6.f) p8).b;
                if (v8_1.length() >= 1) {
                    org.json.JSONObject v2_0 = v2_1.optJSONObject(((String) p7));
                    if (v2_0 != null) {
                        String v3_3 = v2_0.optString("choiceId");
                        if (!v3_3.isEmpty()) {
                            if (!v3_3.equals(((java.util.Map) v0_0.c).get(((String) p7)))) {
                                ((java.util.Map) v0_0.c).put(((String) p7), v3_3);
                                String v0_4 = new android.os.Bundle();
                                v0_4.putString("arm_key", ((String) p7));
                                v0_4.putString("arm_value", v8_1.optString(((String) p7)));
                                v0_4.putString("personalization_id", v2_0.optString("personalizationId"));
                                v0_4.putInt("arm_index", v2_0.optInt("armIndex", -1));
                                v0_4.putString("group", v2_0.optString("group"));
                                u4.c v1_3 = ((u4.c) v1_4);
                                v1_3.a("fp", "personalization_assignment", v0_4);
                                android.os.Bundle v7_8 = new android.os.Bundle();
                                v7_8.putString("_fpid", v3_3);
                                v1_3.a("fp", "_fpc", v7_8);
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        }
        return;
    }
}
