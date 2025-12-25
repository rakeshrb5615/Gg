package com.android.billingclient.api;
public final class InAppMessageParams {
    private final java.util.ArrayList zza;

    public synthetic InAppMessageParams(java.util.Set p2, com.android.billingclient.api.zzcq p3)
    {
        this.zza = new java.util.ArrayList(java.util.Collections.unmodifiableList(new java.util.ArrayList(p2)));
        return;
    }

    public static com.android.billingclient.api.InAppMessageParams$Builder newBuilder()
    {
        return new com.android.billingclient.api.InAppMessageParams$Builder();
    }

    public final java.util.ArrayList zza()
    {
        return this.zza;
    }
}
