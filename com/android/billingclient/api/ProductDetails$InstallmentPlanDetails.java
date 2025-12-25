package com.android.billingclient.api;
public final class ProductDetails$InstallmentPlanDetails {
    private final int commitmentPaymentsCount;
    private final int subsequentCommitmentPaymentsCount;

    public ProductDetails$InstallmentPlanDetails(org.json.JSONObject p2)
    {
        this.commitmentPaymentsCount = p2.getInt("commitmentPaymentsCount");
        this.subsequentCommitmentPaymentsCount = p2.optInt("subsequentCommitmentPaymentsCount");
        return;
    }

    public int getInstallmentPlanCommitmentPaymentsCount()
    {
        return this.commitmentPaymentsCount;
    }

    public int getSubsequentInstallmentPlanCommitmentPaymentsCount()
    {
        return this.subsequentCommitmentPaymentsCount;
    }
}
