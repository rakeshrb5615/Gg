package com.google.android.gms.common.api;
final class zab implements com.google.android.gms.common.api.PendingResult$StatusListener {
    final synthetic com.google.android.gms.common.api.Batch zaa;

    public zab(com.google.android.gms.common.api.Batch p1)
    {
        this.zaa = p1;
        return;
    }

    public final void onComplete(com.google.android.gms.common.api.Status p5)
    {
        com.google.android.gms.common.api.Batch.zab(this.zaa);
        if (!this.zaa.isCanceled()) {
            if (!p5.isCanceled()) {
                if (!p5.isSuccess()) {
                    com.google.android.gms.common.api.Batch.zac(this.zaa, 1);
                }
            } else {
                com.google.android.gms.common.api.Batch.zad(this.zaa, 1);
            }
            com.google.android.gms.common.api.Status v5_4 = this.zaa;
            com.google.android.gms.common.api.Batch.zae(v5_4, (com.google.android.gms.common.api.Batch.zaa(v5_4) - 1));
            com.google.android.gms.common.api.Status v5_5 = this.zaa;
            if (com.google.android.gms.common.api.Batch.zaa(v5_5) == 0) {
                if (!com.google.android.gms.common.api.Batch.zah(v5_5)) {
                    com.google.android.gms.common.api.Status v5_7;
                    if (!com.google.android.gms.common.api.Batch.zag(v5_5)) {
                        v5_7 = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
                    } else {
                        v5_7 = new com.google.android.gms.common.api.Status(13);
                    }
                    com.google.android.gms.common.api.Batch v1_6 = this.zaa;
                    v1_6.setResult(new com.google.android.gms.common.api.BatchResult(v5_7, com.google.android.gms.common.api.Batch.zai(v1_6)));
                } else {
                    com.google.android.gms.common.api.Batch.zaf(v5_5);
                }
            }
            return;
        } else {
            return;
        }
    }
}
