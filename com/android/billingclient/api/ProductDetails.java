package com.android.billingclient.api;
public final class ProductDetails {
    private final String zza;
    private final org.json.JSONObject zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final String zzi;
    private final java.util.List zzj;
    private final java.util.List zzk;

    public ProductDetails(String p7)
    {
        this.zza = p7;
        com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails v0_4 = new org.json.JSONObject(p7);
        this.zzb = v0_4;
        com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails v7_30 = v0_4.optString("productId");
        this.zzc = v7_30;
        org.json.JSONArray v1_0 = v0_4.optString("type");
        this.zzd = v1_0;
        if (android.text.TextUtils.isEmpty(v7_30)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        } else {
            if (android.text.TextUtils.isEmpty(v1_0)) {
                throw new IllegalArgumentException("Product type cannot be empty.");
            } else {
                this.zze = v0_4.optString("title");
                this.zzf = v0_4.optString("name");
                this.zzg = v0_4.optString("description");
                v0_4.optString("packageDisplayName");
                v0_4.optString("iconUrl");
                this.zzh = v0_4.optString("skuDetailsToken");
                this.zzi = v0_4.optString("serializedDocid");
                com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails v7_23 = v0_4.optJSONArray("subscriptionOfferDetails");
                int v2 = 0;
                if (v7_23 == null) {
                    if ((!v1_0.equals("subs")) && (!v1_0.equals("play_pass_subs"))) {
                        com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails v7_28 = 0;
                    } else {
                        v7_28 = new java.util.ArrayList();
                    }
                    this.zzj = v7_28;
                } else {
                    org.json.JSONArray v1_2 = new java.util.ArrayList();
                    java.util.ArrayList v3_0 = 0;
                    while (v3_0 < v7_23.length()) {
                        v1_2.add(new com.android.billingclient.api.ProductDetails$SubscriptionOfferDetails(v7_23.getJSONObject(v3_0)));
                        v3_0++;
                    }
                    this.zzj = v1_2;
                }
                com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails v7_32 = this.zzb.optJSONObject("oneTimePurchaseOfferDetails");
                org.json.JSONArray v1_5 = this.zzb.optJSONArray("oneTimePurchaseOfferDetailsList");
                java.util.ArrayList v3_3 = new java.util.ArrayList();
                if (v1_5 == null) {
                    if (v7_32 == null) {
                        this.zzk = 0;
                        return;
                    } else {
                        v3_3.add(new com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails(v7_32));
                        this.zzk = v3_3;
                        return;
                    }
                }
                while (v2 < v1_5.length()) {
                    v3_3.add(new com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails(v1_5.getJSONObject(v2)));
                    v2++;
                }
                this.zzk = v3_3;
                return;
            }
        }
    }

    public boolean equals(Object p2)
    {
        if (this != p2) {
            if ((p2 instanceof com.android.billingclient.api.ProductDetails)) {
                return android.text.TextUtils.equals(this.zza, ((com.android.billingclient.api.ProductDetails) p2).zza);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public String getDescription()
    {
        return this.zzg;
    }

    public String getName()
    {
        return this.zzf;
    }

    public com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails()
    {
        com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails v0_0 = this.zzk;
        if ((v0_0 == null) || (v0_0.isEmpty())) {
            return 0;
        } else {
            return ((com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails) v0_0.get(0));
        }
    }

    public java.util.List getOneTimePurchaseOfferDetailsList()
    {
        return this.zzk;
    }

    public String getProductId()
    {
        return this.zzc;
    }

    public String getProductType()
    {
        return this.zzd;
    }

    public java.util.List getSubscriptionOfferDetails()
    {
        return this.zzj;
    }

    public String getTitle()
    {
        return this.zze;
    }

    public int hashCode()
    {
        return this.zza.hashCode();
    }

    public String toString()
    {
        String v0_0 = this.zzj;
        String v1_9 = this.zzb.toString();
        String v0_3 = String.valueOf(v0_0);
        StringBuilder v2_1 = new StringBuilder("ProductDetails{jsonString=\'");
        v2_1.append(this.zza);
        v2_1.append("\', parsedJson=");
        v2_1.append(v1_9);
        v2_1.append(", productId=\'");
        v2_1.append(this.zzc);
        v2_1.append("\', productType=\'");
        v2_1.append(this.zzd);
        v2_1.append("\', title=\'");
        v2_1.append(this.zze);
        v2_1.append("\', productDetailsToken=\'");
        v2_1.append(this.zzh);
        v2_1.append("\', subscriptionOfferDetails=");
        v2_1.append(v0_3);
        v2_1.append("}");
        return v2_1.toString();
    }

    public final String zza()
    {
        return this.zzb.optString("packageName");
    }

    public final String zzb()
    {
        return this.zzh;
    }

    public String zzc()
    {
        return this.zzi;
    }

    public final java.util.List zzd()
    {
        return this.zzk;
    }
}
