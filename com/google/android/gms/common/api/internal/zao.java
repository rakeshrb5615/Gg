package com.google.android.gms.common.api.internal;
final class zao implements java.lang.Runnable {
    final synthetic com.google.android.gms.common.api.internal.zap zaa;
    private final com.google.android.gms.common.api.internal.zam zab;

    public zao(com.google.android.gms.common.api.internal.zap p1, com.google.android.gms.common.api.internal.zam p2)
    {
        this.zaa = p1;
        this.zab = p2;
        return;
    }

    public final void run()
    {
        if (this.zaa.zaa) {
            com.google.android.gms.common.GoogleApiAvailability v0_6 = this.zab.zab();
            if (!v0_6.hasResolution()) {
                com.google.android.gms.common.api.internal.zap v1_11 = this.zaa;
                if (v1_11.zac.getErrorResolutionIntent(v1_11.getActivity(), v0_6.getErrorCode(), 0) == null) {
                    if (v0_6.getErrorCode() != 18) {
                        com.google.android.gms.common.api.internal.zap.zaf(this.zaa, v0_6, this.zab.zaa());
                        return;
                    } else {
                        com.google.android.gms.common.GoogleApiAvailability v0_2 = this.zaa;
                        com.google.android.gms.common.api.internal.zap v1_5 = this.zaa;
                        v1_5.zac.zac(v1_5.getActivity().getApplicationContext(), new com.google.android.gms.common.api.internal.zan(this, v0_2.zac.zab(v0_2.getActivity(), v0_2)));
                        return;
                    }
                } else {
                    com.google.android.gms.common.api.internal.zap v1_6 = this.zaa;
                    v1_6.zac.zag(v1_6.getActivity(), v1_6.mLifecycleFragment, v0_6.getErrorCode(), 2, this.zaa);
                    return;
                }
            } else {
                com.google.android.gms.common.api.internal.zap v1_7 = this.zaa;
                v1_7.mLifecycleFragment.startActivityForResult(com.google.android.gms.common.api.GoogleApiActivity.zaa(v1_7.getActivity(), ((android.app.PendingIntent) com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_6.getResolution())), this.zab.zaa(), 0), 1);
                return;
            }
        } else {
            return;
        }
    }
}
