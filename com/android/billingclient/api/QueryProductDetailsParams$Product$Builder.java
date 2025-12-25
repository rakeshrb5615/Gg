package com.android.billingclient.api;
public class QueryProductDetailsParams$Product$Builder {
    private String zza;
    private String zzb;

    private QueryProductDetailsParams$Product$Builder()
    {
        throw 0;
    }

    public synthetic QueryProductDetailsParams$Product$Builder(com.android.billingclient.api.zzcy p1)
    {
        return;
    }

    public static bridge synthetic String zza(com.android.billingclient.api.QueryProductDetailsParams$Product$Builder p0)
    {
        return p0.zza;
    }

    public static bridge synthetic String zzb(com.android.billingclient.api.QueryProductDetailsParams$Product$Builder p0)
    {
        return p0.zzb;
    }

    public com.android.billingclient.api.QueryProductDetailsParams$Product build()
    {
        if ("first_party".equals(this.zzb)) {
            throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
        } else {
            if (this.zza == null) {
                throw new IllegalArgumentException("Product id must be provided.");
            } else {
                if (this.zzb == null) {
                    throw new IllegalArgumentException("Product type must be provided.");
                } else {
                    return new com.android.billingclient.api.QueryProductDetailsParams$Product(this, 0);
                }
            }
        }
    }

    public com.android.billingclient.api.QueryProductDetailsParams$Product$Builder setProductId(String p1)
    {
        this.zza = p1;
        return this;
    }

    public com.android.billingclient.api.QueryProductDetailsParams$Product$Builder setProductType(String p1)
    {
        this.zzb = p1;
        return this;
    }
}
