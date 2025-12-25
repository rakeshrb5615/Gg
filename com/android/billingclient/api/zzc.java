package com.android.billingclient.api;
public final class zzc {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public synthetic zzc(org.json.JSONObject p2, com.android.billingclient.api.zzd p3)
    {
        this.zza = p2.optString("productId");
        this.zzb = p2.optString("productType");
        int v2_1 = p2.optString("offerToken");
        if (1 == v2_1.isEmpty()) {
            v2_1 = 0;
        }
        this.zzc = v2_1;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.android.billingclient.api.zzc)) {
                if ((!this.zza.equals(((com.android.billingclient.api.zzc) p5).zza)) || ((!this.zzb.equals(((com.android.billingclient.api.zzc) p5).zzb)) || (!java.util.Objects.equals(this.zzc, ((com.android.billingclient.api.zzc) p5).zzc)))) {
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

    public final int hashCode()
    {
        return java.util.Objects.hash(new Object[] {this.zza, this.zzb, this.zzc}));
    }

    public final String toString()
    {
        return v1.a.n(v1.a.r("{id: ", this.zza, ", type: ", this.zzb, ", offer token: "), this.zzc, "}");
    }
}
