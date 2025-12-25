package com.google.android.gms.common.api.internal;
final class zacy implements java.lang.Runnable {
    final synthetic com.google.android.gms.common.api.Result zaa;
    final synthetic com.google.android.gms.common.api.internal.zada zab;

    public zacy(com.google.android.gms.common.api.internal.zada p1, com.google.android.gms.common.api.Result p2)
    {
        this.zab = p1;
        this.zaa = p2;
        return;
    }

    public final void run()
    {
        try {
            com.google.android.gms.common.api.GoogleApiClient v0_0 = com.google.android.gms.common.api.internal.BasePendingResult.zaa;
            v0_0.set(Boolean.TRUE);
            com.google.android.gms.common.api.internal.zada v2_0 = this.zab;
            com.google.android.gms.common.api.internal.zada.zab(v2_0).sendMessage(com.google.android.gms.common.api.internal.zada.zab(v2_0).obtainMessage(0, ((com.google.android.gms.common.api.ResultTransform) com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.common.api.internal.zada.zaa(this.zab))).onSuccess(this.zaa)));
            v0_0.set(Boolean.FALSE);
            com.google.android.gms.common.api.internal.zada.zaf(this.zab, this.zaa);
            com.google.android.gms.common.api.GoogleApiClient v0_5 = ((com.google.android.gms.common.api.GoogleApiClient) com.google.android.gms.common.api.internal.zada.zae(this.zab).get());
        } catch (com.google.android.gms.common.api.GoogleApiClient v0_6) {
            com.google.android.gms.common.api.GoogleApiClient v1_6 = this.zab;
            com.google.android.gms.common.api.internal.zada.zab(v1_6).sendMessage(com.google.android.gms.common.api.internal.zada.zab(v1_6).obtainMessage(1, v0_6));
            com.google.android.gms.common.api.internal.BasePendingResult.zaa.set(Boolean.FALSE);
            com.google.android.gms.common.api.internal.zada.zaf(this.zab, this.zaa);
            v0_5 = ((com.google.android.gms.common.api.GoogleApiClient) com.google.android.gms.common.api.internal.zada.zae(this.zab).get());
            if (v0_5 == null) {
                return;
            } else {
                v0_5.zap(this.zab);
                return;
            }
        } catch (com.google.android.gms.common.api.GoogleApiClient v0_13) {
            com.google.android.gms.common.api.internal.BasePendingResult.zaa.set(Boolean.FALSE);
            com.google.android.gms.common.api.internal.zada.zaf(this.zab, this.zaa);
            com.google.android.gms.common.api.GoogleApiClient v1_16 = ((com.google.android.gms.common.api.GoogleApiClient) com.google.android.gms.common.api.internal.zada.zae(this.zab).get());
            if (v1_16 != null) {
                v1_16.zap(this.zab);
            }
            throw v0_13;
        }
        if (v0_5 == null) {
            return;
        } else {
            v0_5.zap(this.zab);
            return;
        }
    }
}
