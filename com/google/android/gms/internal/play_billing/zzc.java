package com.google.android.gms.internal.play_billing;
public final class zzc {
    public static final int zza;

    static zzc()
    {
        com.google.android.gms.internal.play_billing.zzc.zza = Runtime.getRuntime().availableProcessors();
        return;
    }

    public static int zza(android.content.Intent p0, String p1)
    {
        if (p0 != 0) {
            return com.google.android.gms.internal.play_billing.zzc.zzp(p0.getExtras(), "ProxyBillingActivity");
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivity", "Got null intent!");
            return 0;
        }
    }

    public static int zzb(android.os.Bundle p2, String p3)
    {
        if (p2 != null) {
            String v2_8 = p2.get("RESPONSE_CODE");
            if (v2_8 != null) {
                if (!(v2_8 instanceof Integer)) {
                    com.google.android.gms.internal.play_billing.zzc.zzn(p3, "Unexpected type for bundle response code: ".concat(v2_8.getClass().getName()));
                    return 6;
                } else {
                    return ((Integer) v2_8).intValue();
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzm(p3, "getResponseCodeFromBundle() got null response code, assuming OK");
                return 0;
            }
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzn(p3, "Unexpected null bundle received!");
            return 6;
        }
    }

    public static android.os.Bundle zzc(android.os.Bundle p1, String p2, String p3, long p4)
    {
        p1.putString("playBillingLibraryVersion", p2);
        if (p3 != null) {
            p1.putString("playBillingLibraryWrapperVersion", p3);
        }
        p1.putLong("billingClientSessionId", p4);
        return p1;
    }

    public static android.os.Bundle zzd(com.android.billingclient.api.BillingResult p3, com.google.android.gms.internal.play_billing.zzie p4)
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        v0_1.putInt("RESPONSE_CODE", p3.getResponseCode());
        v0_1.putString("DEBUG_MESSAGE", p3.getDebugMessage());
        v0_1.putInt("LOG_REASON", p4.zza());
        return v0_1;
    }

    public static android.os.Bundle zze(com.android.billingclient.api.BillingResult p0, com.google.android.gms.internal.play_billing.zzie p1, String p2)
    {
        android.os.Bundle v0_1 = com.google.android.gms.internal.play_billing.zzc.zzd(p0, p1);
        if (p2 != null) {
            v0_1.putString("ADDITIONAL_LOG_DETAILS", p2);
        }
        return v0_1;
    }

    public static android.os.Bundle zzf(String p5, String p6, java.util.ArrayList p7, String p8, String p9, com.google.android.gms.internal.play_billing.zza p10, long p11)
    {
        android.os.Bundle v8_1 = new android.os.Bundle();
        com.google.android.gms.internal.play_billing.zzc.zzc(v8_1, p5, p6, p11);
        v8_1.putBoolean("enablePendingPurchases", 1);
        v8_1.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        v8_1.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new java.util.ArrayList(com.google.android.gms.internal.play_billing.zzbt.zzm("subs", "inapp")));
        v8_1.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new java.util.ArrayList(com.google.android.gms.internal.play_billing.zzbt.zzl("inapp")));
        v8_1.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", 1);
        if (com.google.android.gms.internal.play_billing.zza.zzb(p10)) {
            v8_1.putBoolean("enablePendingPurchaseForSubscriptions", 1);
        }
        String v5_9 = new java.util.ArrayList();
        java.util.ArrayList v9_6 = new java.util.ArrayList();
        java.util.ArrayList v10_2 = new java.util.ArrayList();
        int v11_2 = p7.size();
        int v12 = 0;
        int v0 = 0;
        int v1 = 0;
        while (v12 < v11_2) {
            String v3_1 = ((com.android.billingclient.api.QueryProductDetailsParams$Product) p7.get(v12));
            v5_9.add(0);
            v0 |= (android.text.TextUtils.isEmpty(0) ^ 1);
            v10_2.add(0);
            v1 |= (android.text.TextUtils.isEmpty(0) ^ 1);
            if (v3_1.zzb().equals("first_party")) {
                com.google.android.gms.internal.play_billing.zzbg.zzc(0, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                v9_6.add(0);
            }
            v12++;
        }
        if (v0 != 0) {
            v8_1.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", v5_9);
        }
        if (!v9_6.isEmpty()) {
            v8_1.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", v9_6);
        }
        if (!android.text.TextUtils.isEmpty(0)) {
            v8_1.putString("accountName", 0);
        }
        if (v1 != 0) {
            v8_1.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", v10_2);
        }
        return v8_1;
    }

    public static android.os.Bundle zzg(String p1, String p2, long p3)
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        com.google.android.gms.internal.play_billing.zzc.zzc(v0_1, p1, p2, p3);
        return v0_1;
    }

    public static com.android.billingclient.api.BillingResult zzh(android.content.Intent p2, String p3)
    {
        if (p2 != null) {
            com.android.billingclient.api.BillingResult$Builder v0 = com.android.billingclient.api.BillingResult.newBuilder();
            v0.setResponseCode(com.google.android.gms.internal.play_billing.zzc.zzb(p2.getExtras(), p3));
            v0.setDebugMessage(com.google.android.gms.internal.play_billing.zzc.zzj(p2.getExtras(), p3));
            return v0.build();
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingHelper", "Got null intent!");
            com.android.billingclient.api.BillingResult v2_4 = com.android.billingclient.api.BillingResult.newBuilder();
            v2_4.setResponseCode(6);
            v2_4.setDebugMessage("An internal error occurred.");
            return v2_4.build();
        }
    }

    public static com.android.billingclient.api.InAppMessageResult zzi(android.os.Bundle p2, String p3)
    {
        if (p2 != null) {
            return new com.android.billingclient.api.InAppMessageResult(com.google.android.gms.internal.play_billing.zzc.zzp(p2, "BillingClient"), p2.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
        } else {
            return new com.android.billingclient.api.InAppMessageResult(0, 0);
        }
    }

    public static String zzj(android.os.Bundle p2, String p3)
    {
        if (p2 != null) {
            String v2_6 = p2.get("DEBUG_MESSAGE");
            if (v2_6 != null) {
                if (!(v2_6 instanceof String)) {
                    com.google.android.gms.internal.play_billing.zzc.zzn(p3, "Unexpected type for debug message: ".concat(v2_6.getClass().getName()));
                    return "";
                } else {
                    return ((String) v2_6);
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzm(p3, "getDebugMessageFromBundle() got null response code, assuming OK");
                return "";
            }
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzn(p3, "Unexpected null bundle received!");
            return "";
        }
    }

    public static String zzk(int p0)
    {
        return com.google.android.gms.internal.play_billing.zzb.zza(p0).toString();
    }

    public static java.util.List zzl(android.os.Bundle p6)
    {
        String v0_1 = p6.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        String v1_2 = p6.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        java.util.ArrayList v2_1 = new java.util.ArrayList();
        if ((v0_1 != null) && (v1_2 != null)) {
            int v6_1 = v0_1.size();
            String v4_1 = new StringBuilder("Found purchase list of ");
            v4_1.append(v6_1);
            v4_1.append(" items");
            com.google.android.gms.internal.play_billing.zzc.zzm("BillingHelper", v4_1.toString());
            int v6_4 = 0;
            while ((v6_4 < v0_1.size()) && (v6_4 < v1_2.size())) {
                com.android.billingclient.api.Purchase v3_4 = com.google.android.gms.internal.play_billing.zzc.zzq(((String) v0_1.get(v6_4)), ((String) v1_2.get(v6_4)));
                if (v3_4 != null) {
                    v2_1.add(v3_4);
                }
                v6_4++;
            }
            return v2_1;
        } else {
            int v6_6 = com.google.android.gms.internal.play_billing.zzc.zzq(p6.getString("INAPP_PURCHASE_DATA"), p6.getString("INAPP_DATA_SIGNATURE"));
            if (v6_6 != 0) {
                v2_1.add(v6_6);
                return v2_1;
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzm("BillingHelper", "Couldn\'t find single purchase data as well.");
                return 0;
            }
        }
    }

    public static void zzm(String p3, String p4)
    {
        if (android.util.Log.isLoggable(p3, 2)) {
            if (p4.isEmpty()) {
                android.util.Log.v(p3, p4);
            } else {
                int v0_2 = 40000;
                while ((!p4.isEmpty()) && (v0_2 > 0)) {
                    int v1_2 = Math.min(p4.length(), Math.min(4000, v0_2));
                    android.util.Log.v(p3, p4.substring(0, v1_2));
                    p4 = p4.substring(v1_2);
                    v0_2 -= v1_2;
                }
            }
        }
        return;
    }

    public static void zzn(String p1, String p2)
    {
        if (android.util.Log.isLoggable(p1, 5)) {
            android.util.Log.w(p1, p2);
        }
        return;
    }

    public static void zzo(String p1, String p2, Throwable p3)
    {
        try {
            if (android.util.Log.isLoggable(p1, 5)) {
                if (p3 != null) {
                    android.util.Log.w(p1, p2, p3);
                } else {
                    android.util.Log.w(p1, p2);
                    return;
                }
            } else {
            }
        } catch (Throwable) {
        }
        return;
    }

    private static int zzp(android.os.Bundle p1, String p2)
    {
        if (p1 != 0) {
            return p1.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzn(p2, "Unexpected null bundle received!");
            return 0;
        }
    }

    private static com.android.billingclient.api.Purchase zzq(String p3, String p4)
    {
        if ((p3 == null) || (p4 == null)) {
            com.google.android.gms.internal.play_billing.zzc.zzm("BillingHelper", "Received a null purchase data.");
            return 0;
        } else {
            try {
                return new com.android.billingclient.api.Purchase(p3, p4);
            } catch (String v3_1) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingHelper", "Got JSONException while parsing purchase data: ".concat(v3_1.toString()));
                return 0;
            }
        }
    }
}
