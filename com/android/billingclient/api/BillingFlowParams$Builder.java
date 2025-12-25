package com.android.billingclient.api;
public class BillingFlowParams$Builder {
    private String zza;
    private String zzb;
    private java.util.List zzc;
    private java.util.ArrayList zzd;
    private boolean zze;
    private com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams$Builder zzf;

    private BillingFlowParams$Builder()
    {
        com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams$Builder v0 = com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams.newBuilder();
        com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams$Builder.zza(v0);
        this.zzf = v0;
        return;
    }

    public synthetic BillingFlowParams$Builder(com.android.billingclient.api.zzcf p1)
    {
        p1 = com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams.newBuilder();
        com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams$Builder.zza(p1);
        this.zzf = p1;
        return;
    }

    public com.android.billingclient.api.BillingFlowParams build()
    {
        IllegalArgumentException v0_22;
        IllegalArgumentException v0_0 = this.zzd;
        String v1_0 = 1;
        if ((v0_0 == null) || (v0_0.isEmpty())) {
            v0_22 = 0;
        } else {
            v0_22 = 1;
        }
        int v3_1;
        int v3_2 = this.zzc;
        if ((v3_2 == 0) || (v3_2.isEmpty())) {
            v3_1 = 0;
        } else {
            v3_1 = 1;
        }
        if ((v0_22 == null) && (v3_1 == 0)) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        } else {
            if ((v0_22 != null) && (v3_1 != 0)) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            } else {
                if (v0_22 == null) {
                    String v5_0 = this.zzc;
                    if (v5_0 != null) {
                        String v5_1 = v5_0.iterator();
                        while (v5_1.hasNext()) {
                            if (((com.android.billingclient.api.BillingFlowParams$ProductDetailsParams) v5_1.next()) == null) {
                                throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                            }
                        }
                    }
                } else {
                    if (this.zzd.contains(0)) {
                        throw new IllegalArgumentException("SKU cannot be null.");
                    } else {
                        if (this.zzd.size() > 1) {
                            String v5_8 = ((com.android.billingclient.api.SkuDetails) this.zzd.get(0));
                            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams v6_3 = v5_8.getType();
                            java.util.ArrayList v7_0 = this.zzd;
                            int v8_0 = v7_0.size();
                            int v9_1 = 0;
                            while (v9_1 < v8_0) {
                                boolean v11_5 = ((com.android.billingclient.api.SkuDetails) v7_0.get(v9_1));
                                if ((!v6_3.equals("play_pass_subs")) && ((!v11_5.getType().equals("play_pass_subs")) && (!v6_3.equals(v11_5.getType())))) {
                                    throw new IllegalArgumentException("SKUs should have the same type.");
                                } else {
                                    v9_1++;
                                }
                            }
                            String v5_9 = v5_8.zzd();
                            java.util.ArrayList v7_1 = this.zzd;
                            int v8_1 = v7_1.size();
                            int v9_0 = 0;
                            while (v9_0 < v8_1) {
                                boolean v11_1 = ((com.android.billingclient.api.SkuDetails) v7_1.get(v9_0));
                                if ((!v6_3.equals("play_pass_subs")) && ((!v11_1.getType().equals("play_pass_subs")) && (!v5_9.equals(v11_1.zzd())))) {
                                    throw new IllegalArgumentException("All SKUs must have the same package name.");
                                } else {
                                    v9_0++;
                                }
                            }
                        }
                    }
                }
                String v5_11 = new com.android.billingclient.api.BillingFlowParams(0);
                if (((v0_22 == null) || (((com.android.billingclient.api.SkuDetails) this.zzd.get(0)).zzd().isEmpty())) && ((v3_1 == 0) || (((com.android.billingclient.api.BillingFlowParams$ProductDetailsParams) this.zzc.get(0)).zza().zza().isEmpty()))) {
                    v1_0 = 0;
                }
                String v1_2;
                com.android.billingclient.api.BillingFlowParams.zzl(v5_11, v1_0);
                com.android.billingclient.api.BillingFlowParams.zzn(v5_11, this.zza);
                com.android.billingclient.api.BillingFlowParams.zzo(v5_11, this.zzb);
                com.android.billingclient.api.BillingFlowParams.zzr(v5_11, this.zzf.build());
                IllegalArgumentException v0_5 = this.zzd;
                if (v0_5 == null) {
                    v1_2 = new java.util.ArrayList();
                } else {
                    v1_2 = new java.util.ArrayList(v0_5);
                }
                IllegalArgumentException v0_8;
                com.android.billingclient.api.BillingFlowParams.zzq(v5_11, v1_2);
                com.android.billingclient.api.BillingFlowParams.zzm(v5_11, this.zze);
                IllegalArgumentException v0_7 = this.zzc;
                if (v0_7 == null) {
                    v0_8 = com.google.android.gms.internal.play_billing.zzbt.zzk();
                } else {
                    v0_8 = com.google.android.gms.internal.play_billing.zzbt.zzj(v0_7);
                }
                com.android.billingclient.api.BillingFlowParams.zzp(v5_11, v0_8);
                return v5_11;
            }
        }
    }

    public com.android.billingclient.api.BillingFlowParams$Builder setIsOfferPersonalized(boolean p1)
    {
        this.zze = p1;
        return this;
    }

    public com.android.billingclient.api.BillingFlowParams$Builder setObfuscatedAccountId(String p1)
    {
        this.zza = p1;
        return this;
    }

    public com.android.billingclient.api.BillingFlowParams$Builder setObfuscatedProfileId(String p1)
    {
        this.zzb = p1;
        return this;
    }

    public com.android.billingclient.api.BillingFlowParams$Builder setProductDetailsParamsList(java.util.List p2)
    {
        this.zzc = new java.util.ArrayList(p2);
        return this;
    }

    public com.android.billingclient.api.BillingFlowParams$Builder setSkuDetails(com.android.billingclient.api.SkuDetails p2)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        v0_1.add(p2);
        this.zzd = v0_1;
        return this;
    }

    public com.android.billingclient.api.BillingFlowParams$Builder setSubscriptionUpdateParams(com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams p1)
    {
        this.zzf = com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams.zzb(p1);
        return this;
    }
}
