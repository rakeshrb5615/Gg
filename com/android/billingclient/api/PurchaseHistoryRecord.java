package com.android.billingclient.api;
public class PurchaseHistoryRecord {
    private final String zza;
    private final String zzb;
    private final org.json.JSONObject zzc;

    public PurchaseHistoryRecord(String p1, String p2)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = new org.json.JSONObject(p1);
        return;
    }

    private final java.util.ArrayList zza()
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        String v1_2 = this.zzc;
        if (!v1_2.has("productIds")) {
            if (v1_2.has("productId")) {
                v0_1.add(v1_2.optString("productId"));
            }
        } else {
            String v1_1 = v1_2.optJSONArray("productIds");
            if (v1_1 != null) {
                int v2_0 = 0;
                while (v2_0 < v1_1.length()) {
                    v0_1.add(v1_1.optString(v2_0));
                    v2_0++;
                }
            }
        }
        return v0_1;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.android.billingclient.api.PurchaseHistoryRecord)) {
                if ((!android.text.TextUtils.equals(this.zza, ((com.android.billingclient.api.PurchaseHistoryRecord) p5).getOriginalJson())) || (!android.text.TextUtils.equals(this.zzb, ((com.android.billingclient.api.PurchaseHistoryRecord) p5).getSignature()))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public String getDeveloperPayload()
    {
        return this.zzc.optString("developerPayload");
    }

    public String getOriginalJson()
    {
        return this.zza;
    }

    public java.util.List getProducts()
    {
        return this.zza();
    }

    public long getPurchaseTime()
    {
        return this.zzc.optLong("purchaseTime");
    }

    public String getPurchaseToken()
    {
        String v0_0 = this.zzc;
        return v0_0.optString("token", v0_0.optString("purchaseToken"));
    }

    public int getQuantity()
    {
        return this.zzc.optInt("quantity", 1);
    }

    public String getSignature()
    {
        return this.zzb;
    }

    public java.util.ArrayList getSkus()
    {
        return this.zza();
    }

    public int hashCode()
    {
        return this.zza.hashCode();
    }

    public String toString()
    {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.zza));
    }
}
