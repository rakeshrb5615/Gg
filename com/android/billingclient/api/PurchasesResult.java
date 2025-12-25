package com.android.billingclient.api;
public final class PurchasesResult {
    private final com.android.billingclient.api.BillingResult zza;
    private final java.util.List zzb;

    public PurchasesResult(com.android.billingclient.api.BillingResult p2, java.util.List p3)
    {
        kotlin.jvm.internal.j.e(p2, "billingResult");
        kotlin.jvm.internal.j.e(p3, "purchasesList");
        this.zza = p2;
        this.zzb = p3;
        return;
    }

    public static synthetic com.android.billingclient.api.PurchasesResult copy$default(com.android.billingclient.api.PurchasesResult p0, com.android.billingclient.api.BillingResult p1, java.util.List p2, int p3, Object p4)
    {
        if ((p3 & 1) != 0) {
            p1 = p0.zza;
        }
        if ((p3 & 2) != 0) {
            p2 = p0.zzb;
        }
        return p0.copy(p1, p2);
    }

    public final com.android.billingclient.api.BillingResult component1()
    {
        return this.zza;
    }

    public final java.util.List component2()
    {
        return this.zzb;
    }

    public final com.android.billingclient.api.PurchasesResult copy(com.android.billingclient.api.BillingResult p2, java.util.List p3)
    {
        kotlin.jvm.internal.j.e(p2, "billingResult");
        kotlin.jvm.internal.j.e(p3, "purchasesList");
        return new com.android.billingclient.api.PurchasesResult(p2, p3);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.android.billingclient.api.PurchasesResult)) {
                if (kotlin.jvm.internal.j.a(this.zza, ((com.android.billingclient.api.PurchasesResult) p5).zza)) {
                    if (kotlin.jvm.internal.j.a(this.zzb, ((com.android.billingclient.api.PurchasesResult) p5).zzb)) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final com.android.billingclient.api.BillingResult getBillingResult()
    {
        return this.zza;
    }

    public final java.util.List getPurchasesList()
    {
        return this.zzb;
    }

    public int hashCode()
    {
        return (this.zzb.hashCode() + (this.zza.hashCode() * 31));
    }

    public String toString()
    {
        String v0_2 = new StringBuilder("PurchasesResult(billingResult=");
        v0_2.append(this.zza);
        v0_2.append(", purchasesList=");
        v0_2.append(this.zzb);
        v0_2.append(")");
        return v0_2.toString();
    }
}
