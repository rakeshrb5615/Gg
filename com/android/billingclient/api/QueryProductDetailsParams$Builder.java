package com.android.billingclient.api;
public class QueryProductDetailsParams$Builder {
    private com.google.android.gms.internal.play_billing.zzbt zza;

    private QueryProductDetailsParams$Builder()
    {
        throw 0;
    }

    public synthetic QueryProductDetailsParams$Builder(com.android.billingclient.api.zzcy p1)
    {
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.play_billing.zzbt zza(com.android.billingclient.api.QueryProductDetailsParams$Builder p0)
    {
        return p0.zza;
    }

    public com.android.billingclient.api.QueryProductDetailsParams build()
    {
        if (this.zza == null) {
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        } else {
            return new com.android.billingclient.api.QueryProductDetailsParams(this, 0);
        }
    }

    public com.android.billingclient.api.QueryProductDetailsParams$Builder setProductList(java.util.List p6)
    {
        if ((p6 == null) || (p6.isEmpty())) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        } else {
            String v0_5 = new java.util.HashSet();
            int v1_0 = p6.iterator();
            while (v1_0.hasNext()) {
                String v2_2 = ((com.android.billingclient.api.QueryProductDetailsParams$Product) v1_0.next());
                if (!"play_pass_subs".equals(v2_2.zzb())) {
                    v0_5.add(v2_2.zzb());
                }
            }
            if (v0_5.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            } else {
                this.zza = com.google.android.gms.internal.play_billing.zzbt.zzj(p6);
                return this;
            }
        }
    }
}
