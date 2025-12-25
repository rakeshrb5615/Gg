package com.android.billingclient.api;
public class BillingFlowParams {
    private boolean zza;
    private String zzb;
    private String zzc;
    private com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams zzd;
    private com.google.android.gms.internal.play_billing.zzbt zze;
    private java.util.ArrayList zzf;
    private boolean zzg;

    private BillingFlowParams()
    {
        throw 0;
    }

    public synthetic BillingFlowParams(com.android.billingclient.api.zzcf p1)
    {
        return;
    }

    public static com.android.billingclient.api.BillingFlowParams$Builder newBuilder()
    {
        return new com.android.billingclient.api.BillingFlowParams$Builder(0);
    }

    public static bridge synthetic void zzl(com.android.billingclient.api.BillingFlowParams p0, boolean p1)
    {
        p0.zza = p1;
        return;
    }

    public static bridge synthetic void zzm(com.android.billingclient.api.BillingFlowParams p0, boolean p1)
    {
        p0.zzg = p1;
        return;
    }

    public static bridge synthetic void zzn(com.android.billingclient.api.BillingFlowParams p0, String p1)
    {
        p0.zzb = p1;
        return;
    }

    public static bridge synthetic void zzo(com.android.billingclient.api.BillingFlowParams p0, String p1)
    {
        p0.zzc = p1;
        return;
    }

    public static bridge synthetic void zzp(com.android.billingclient.api.BillingFlowParams p0, com.google.android.gms.internal.play_billing.zzbt p1)
    {
        p0.zze = p1;
        return;
    }

    public static bridge synthetic void zzq(com.android.billingclient.api.BillingFlowParams p0, java.util.ArrayList p1)
    {
        p0.zzf = p1;
        return;
    }

    public static bridge synthetic void zzr(com.android.billingclient.api.BillingFlowParams p0, com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams p1)
    {
        p0.zzd = p1;
        return;
    }

    public int zza()
    {
        return 0;
    }

    public final int zzb()
    {
        return this.zzd.zza();
    }

    public long zzc()
    {
        return 0;
    }

    public final com.android.billingclient.api.BillingResult zzd()
    {
        if (!this.zze.isEmpty()) {
            java.util.Iterator v1_0 = 0;
            com.android.billingclient.api.BillingResult v0_23 = ((com.android.billingclient.api.BillingFlowParams$ProductDetailsParams) this.zze.get(0));
            int v2_1 = 1;
            while (v2_1 < this.zze.size()) {
                boolean v3_4 = ((com.android.billingclient.api.BillingFlowParams$ProductDetailsParams) this.zze.get(v2_1));
                if ((!v3_4.zza().getProductType().equals(v0_23.zza().getProductType())) && (!v3_4.zza().getProductType().equals("play_pass_subs"))) {
                    return com.android.billingclient.api.zzcj.zza(5, "All products should have same ProductType.");
                } else {
                    v2_1++;
                }
            }
            int v2_2 = v0_23.zza().zza();
            boolean v3_9 = new java.util.HashMap();
            java.util.HashSet v6_4 = new java.util.HashSet();
            com.google.android.gms.internal.play_billing.zzbt v7_2 = this.zze;
            int v8 = v7_2.size();
            while (v1_0 < v8) {
                com.android.billingclient.api.BillingFlowParams$ProductDetailsParams v10_1 = ((com.android.billingclient.api.BillingFlowParams$ProductDetailsParams) v7_2.get(v1_0));
                if ((v10_1.zza().getSubscriptionOfferDetails() != null) && (v10_1.zzb() == null)) {
                    return com.android.billingclient.api.zzcj.zza(5, g2.g.l("offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: ", v10_1.zza().getProductId()));
                } else {
                    if (!v3_9.containsKey(v10_1.zza().getProductId())) {
                        v3_9.put(v10_1.zza().getProductId(), v10_1);
                        if ((!v0_23.zza().getProductType().equals("play_pass_subs")) && ((!v10_1.zza().getProductType().equals("play_pass_subs")) && (!v2_2.equals(v10_1.zza().zza())))) {
                            return com.android.billingclient.api.zzcj.zza(5, "All products must have the same package name.");
                        } else {
                            v1_0++;
                        }
                    } else {
                        return com.android.billingclient.api.zzcj.zza(5, v1.a.l("ProductId can not be duplicated. Invalid product id: ", v10_1.zza().getProductId(), "."));
                    }
                }
            }
            java.util.Iterator v1_2 = v6_4.iterator();
            while (v1_2.hasNext()) {
                int v2_8 = ((String) v1_2.next());
                if (v3_9.containsKey(v2_8)) {
                    v3_9.get(v2_8);
                    return com.android.billingclient.api.zzcj.zza(5, v1.a.l("OldProductId must not be one of the products to be purchased. Invalid old product id: ", v2_8, "."));
                }
            }
            java.util.Iterator v1_4 = v0_23.zza().getOneTimePurchaseOfferDetailsList();
            com.android.billingclient.api.BillingResult v0_12 = v0_23.zzb();
            if ((v0_12 != null) && (v1_4 != null)) {
                java.util.Iterator v1_5 = v1_4.iterator();
                while (v1_5.hasNext()) {
                    int v2_5 = ((com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails) v1_5.next());
                    if (v0_12.equals(v2_5.getOfferToken())) {
                    }
                    if ((v2_5 != 0) && (v2_5.zza() != null)) {
                        return com.android.billingclient.api.zzcj.zza(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                    }
                }
                v2_5 = 0;
            }
            return com.android.billingclient.api.zzcj.zzi;
        } else {
            return com.android.billingclient.api.zzcj.zzi;
        }
    }

    public final String zze()
    {
        return this.zzb;
    }

    public final String zzf()
    {
        return this.zzc;
    }

    public String zzg()
    {
        return 0;
    }

    public final String zzh()
    {
        return this.zzd.zzc();
    }

    public final String zzi()
    {
        return this.zzd.zzd();
    }

    public final java.util.ArrayList zzj()
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        v0_1.addAll(this.zzf);
        return v0_1;
    }

    public final java.util.List zzk()
    {
        return this.zze;
    }

    public final boolean zzs()
    {
        return this.zzg;
    }

    public final boolean zzt()
    {
        if ((this.zzb != null) || ((this.zzc != null) || ((this.zzd.zzd() != null) || ((this.zzd.zza() != 0) || ((this.zza) || (this.zzg)))))) {
            return 1;
        } else {
            com.google.android.gms.internal.play_billing.zzbt v0_5 = this.zze;
            if (v0_5 != null) {
                int v2 = v0_5.size();
                int v3 = 0;
                while (v3 < v2) {
                    v0_5.get(v3);
                    v3++;
                }
            }
            return 0;
        }
    }
}
