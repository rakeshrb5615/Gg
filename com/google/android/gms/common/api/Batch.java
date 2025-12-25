package com.google.android.gms.common.api;
public final class Batch extends com.google.android.gms.common.api.internal.BasePendingResult {
    private int zae;
    private boolean zaf;
    private boolean zag;
    private final com.google.android.gms.common.api.PendingResult[] zah;
    private final Object zai;

    public synthetic Batch(java.util.List p2, com.google.android.gms.common.api.GoogleApiClient p3, com.google.android.gms.common.api.zac p4)
    {
        super(p3);
        super.zai = new Object();
        int v3_4 = p2.size();
        super.zae = v3_4;
        int v3_5 = new com.google.android.gms.common.api.PendingResult[v3_4];
        super.zah = v3_5;
        if (p2.isEmpty()) {
            super.setResult(new com.google.android.gms.common.api.BatchResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS, v3_5));
            return;
        } else {
            int v3_2 = 0;
            while (v3_2 < p2.size()) {
                com.google.android.gms.common.api.PendingResult v4_4 = ((com.google.android.gms.common.api.PendingResult) p2.get(v3_2));
                super.zah[v3_2] = v4_4;
                v4_4.addStatusListener(new com.google.android.gms.common.api.zab(super));
                v3_2++;
            }
            return;
        }
    }

    public static bridge synthetic int zaa(com.google.android.gms.common.api.Batch p0)
    {
        return p0.zae;
    }

    public static bridge synthetic Object zab(com.google.android.gms.common.api.Batch p0)
    {
        return p0.zai;
    }

    public static bridge synthetic void zac(com.google.android.gms.common.api.Batch p0, boolean p1)
    {
        p0.zaf = 1;
        return;
    }

    public static bridge synthetic void zad(com.google.android.gms.common.api.Batch p0, boolean p1)
    {
        p0.zag = 1;
        return;
    }

    public static bridge synthetic void zae(com.google.android.gms.common.api.Batch p0, int p1)
    {
        p0.zae = p1;
        return;
    }

    public static synthetic void zaf(com.google.android.gms.common.api.Batch p0)
    {
        super.cancel();
        return;
    }

    public static bridge synthetic boolean zag(com.google.android.gms.common.api.Batch p0)
    {
        return p0.zaf;
    }

    public static bridge synthetic boolean zah(com.google.android.gms.common.api.Batch p0)
    {
        return p0.zag;
    }

    public static bridge synthetic com.google.android.gms.common.api.PendingResult[] zai(com.google.android.gms.common.api.Batch p0)
    {
        return p0.zah;
    }

    public void cancel()
    {
        super.cancel();
        int v0 = 0;
        while(true) {
            com.google.android.gms.common.api.PendingResult v1_0 = this.zah;
            if (v0 >= v1_0.length) {
                break;
            }
            v1_0[v0].cancel();
            v0++;
        }
        return;
    }

    public com.google.android.gms.common.api.BatchResult createFailedResult(com.google.android.gms.common.api.Status p3)
    {
        return new com.google.android.gms.common.api.BatchResult(p3, this.zah);
    }

    public final bridge synthetic com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status p1)
    {
        return this.createFailedResult(p1);
    }
}
