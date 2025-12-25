package com.android.billingclient.api;
public final class CreateAlternativeBillingOnlyReportingDetailsResult {
    private final com.android.billingclient.api.BillingResult zza;
    private final com.android.billingclient.api.AlternativeBillingOnlyReportingDetails zzb;

    public CreateAlternativeBillingOnlyReportingDetailsResult(com.android.billingclient.api.BillingResult p2, com.android.billingclient.api.AlternativeBillingOnlyReportingDetails p3)
    {
        kotlin.jvm.internal.j.e(p2, "billingResult");
        this.zza = p2;
        this.zzb = p3;
        return;
    }

    public static synthetic com.android.billingclient.api.CreateAlternativeBillingOnlyReportingDetailsResult copy$default(com.android.billingclient.api.CreateAlternativeBillingOnlyReportingDetailsResult p0, com.android.billingclient.api.BillingResult p1, com.android.billingclient.api.AlternativeBillingOnlyReportingDetails p2, int p3, Object p4)
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

    public final com.android.billingclient.api.AlternativeBillingOnlyReportingDetails component2()
    {
        return this.zzb;
    }

    public final com.android.billingclient.api.CreateAlternativeBillingOnlyReportingDetailsResult copy(com.android.billingclient.api.BillingResult p2, com.android.billingclient.api.AlternativeBillingOnlyReportingDetails p3)
    {
        kotlin.jvm.internal.j.e(p2, "billingResult");
        return new com.android.billingclient.api.CreateAlternativeBillingOnlyReportingDetailsResult(p2, p3);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.android.billingclient.api.CreateAlternativeBillingOnlyReportingDetailsResult)) {
                if (kotlin.jvm.internal.j.a(this.zza, ((com.android.billingclient.api.CreateAlternativeBillingOnlyReportingDetailsResult) p5).zza)) {
                    if (kotlin.jvm.internal.j.a(this.zzb, ((com.android.billingclient.api.CreateAlternativeBillingOnlyReportingDetailsResult) p5).zzb)) {
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

    public final com.android.billingclient.api.AlternativeBillingOnlyReportingDetails getAlternativeBillingOnlyReportingDetails()
    {
        return this.zzb;
    }

    public final com.android.billingclient.api.BillingResult getBillingResult()
    {
        return this.zza;
    }

    public int hashCode()
    {
        int v1_1;
        int v0_2 = (this.zza.hashCode() * 31);
        int v1_0 = this.zzb;
        if (v1_0 != 0) {
            v1_1 = v1_0.hashCode();
        } else {
            v1_1 = 0;
        }
        return (v0_2 + v1_1);
    }

    public String toString()
    {
        String v0_2 = new StringBuilder("CreateAlternativeBillingOnlyReportingDetailsResult(billingResult=");
        v0_2.append(this.zza);
        v0_2.append(", alternativeBillingOnlyReportingDetails=");
        v0_2.append(this.zzb);
        v0_2.append(")");
        return v0_2.toString();
    }
}
