package com.android.billingclient.api;
public class Purchase {
    private final String zza;
    private final String zzb;
    private final org.json.JSONObject zzc;

    public Purchase(String p1, String p2)
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
            if ((p5 instanceof com.android.billingclient.api.Purchase)) {
                if ((!android.text.TextUtils.equals(this.zza, ((com.android.billingclient.api.Purchase) p5).getOriginalJson())) || (!android.text.TextUtils.equals(this.zzb, ((com.android.billingclient.api.Purchase) p5).getSignature()))) {
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

    public com.android.billingclient.api.AccountIdentifiers getAccountIdentifiers()
    {
        int v0_0 = this.zzc;
        String v1_1 = v0_0.optString("obfuscatedAccountId");
        int v0_2 = v0_0.optString("obfuscatedProfileId");
        if ((v1_1 != null) || (v0_2 != 0)) {
            return new com.android.billingclient.api.AccountIdentifiers(v1_1, v0_2);
        } else {
            return 0;
        }
    }

    public String getDeveloperPayload()
    {
        return this.zzc.optString("developerPayload");
    }

    public String getOrderId()
    {
        int v0_1 = this.zzc.optString("orderId");
        if (android.text.TextUtils.isEmpty(v0_1)) {
            v0_1 = 0;
        }
        return v0_1;
    }

    public String getOriginalJson()
    {
        return this.zza;
    }

    public String getPackageName()
    {
        return this.zzc.optString("packageName");
    }

    public com.android.billingclient.api.Purchase$PendingPurchaseUpdate getPendingPurchaseUpdate()
    {
        org.json.JSONObject v0_1 = this.zzc.optJSONObject("pendingPurchaseUpdate");
        if (v0_1 != null) {
            return new com.android.billingclient.api.Purchase$PendingPurchaseUpdate(v0_1, 0);
        } else {
            return 0;
        }
    }

    public java.util.List getProducts()
    {
        return this.zza();
    }

    public int getPurchaseState()
    {
        if (this.zzc.optInt("purchaseState", 1) == 4) {
            return 2;
        } else {
            return 1;
        }
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

    public boolean isAcknowledged()
    {
        return this.zzc.optBoolean("acknowledged", 1);
    }

    public boolean isAutoRenewing()
    {
        return this.zzc.optBoolean("autoRenewing");
    }

    public String toString()
    {
        return "Purchase. Json: ".concat(String.valueOf(this.zza));
    }
}
