package com.android.billingclient.api;
public final class InAppMessageParams$Builder {
    private final java.util.Set zza;

    public InAppMessageParams$Builder()
    {
        this.zza = new java.util.HashSet();
        return;
    }

    public com.android.billingclient.api.InAppMessageParams$Builder addAllInAppMessageCategoriesToShow()
    {
        this.zza.add(Integer.valueOf(2));
        return this;
    }

    public com.android.billingclient.api.InAppMessageParams$Builder addInAppMessageCategoryToShow(int p2)
    {
        this.zza.add(Integer.valueOf(p2));
        return this;
    }

    public com.android.billingclient.api.InAppMessageParams build()
    {
        return new com.android.billingclient.api.InAppMessageParams(this.zza, 0);
    }
}
