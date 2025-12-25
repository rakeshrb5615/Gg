package com.google.android.gms.common.api.internal;
public final class zada extends com.google.android.gms.common.api.TransformedResult implements com.google.android.gms.common.api.ResultCallback {
    private com.google.android.gms.common.api.ResultTransform zaa;
    private com.google.android.gms.common.api.internal.zada zab;
    private volatile com.google.android.gms.common.api.ResultCallbacks zac;
    private com.google.android.gms.common.api.PendingResult zad;
    private final Object zae;
    private com.google.android.gms.common.api.Status zaf;
    private final ref.WeakReference zag;
    private final com.google.android.gms.common.api.internal.zacz zah;
    private boolean zai;

    public zada(ref.WeakReference p3)
    {
        android.os.Looper v3_3;
        this.zaa = 0;
        this.zab = 0;
        this.zac = 0;
        this.zad = 0;
        this.zae = new Object();
        this.zaf = 0;
        this.zai = 0;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "GoogleApiClient reference must not be null");
        this.zag = p3;
        android.os.Looper v3_2 = ((com.google.android.gms.common.api.GoogleApiClient) p3.get());
        if (v3_2 == null) {
            v3_3 = android.os.Looper.getMainLooper();
        } else {
            v3_3 = v3_2.getLooper();
        }
        this.zah = new com.google.android.gms.common.api.internal.zacz(this, v3_3);
        return;
    }

    public static bridge synthetic com.google.android.gms.common.api.ResultTransform zaa(com.google.android.gms.common.api.internal.zada p0)
    {
        return p0.zaa;
    }

    public static bridge synthetic com.google.android.gms.common.api.internal.zacz zab(com.google.android.gms.common.api.internal.zada p0)
    {
        return p0.zah;
    }

    public static bridge synthetic com.google.android.gms.common.api.internal.zada zac(com.google.android.gms.common.api.internal.zada p0)
    {
        return p0.zab;
    }

    public static bridge synthetic Object zad(com.google.android.gms.common.api.internal.zada p0)
    {
        return p0.zae;
    }

    public static bridge synthetic ref.WeakReference zae(com.google.android.gms.common.api.internal.zada p0)
    {
        return p0.zag;
    }

    public static bridge synthetic void zaf(com.google.android.gms.common.api.internal.zada p0, com.google.android.gms.common.api.Result p1)
    {
        com.google.android.gms.common.api.internal.zada.zan(p1);
        return;
    }

    public static bridge synthetic void zag(com.google.android.gms.common.api.internal.zada p0, com.google.android.gms.common.api.Status p1)
    {
        p0.zaj(p1);
        return;
    }

    private final void zaj(com.google.android.gms.common.api.Status p2)
    {
        try {
            this.zaf = p2;
            this.zal(p2);
            return;
        } catch (Throwable v2_1) {
            throw v2_1;
        }
    }

    private final void zak()
    {
        if ((this.zaa != null) || (this.zac != null)) {
            int v0_7 = ((com.google.android.gms.common.api.GoogleApiClient) this.zag.get());
            if ((!this.zai) && ((this.zaa != null) && (v0_7 != 0))) {
                v0_7.zao(this);
                this.zai = 1;
            }
            int v0_2 = this.zaf;
            if (v0_2 == 0) {
                int v0_3 = this.zad;
                if (v0_3 != 0) {
                    v0_3.setResultCallback(this);
                }
            } else {
                this.zal(v0_2);
                return;
            }
        }
        return;
    }

    private final void zal(com.google.android.gms.common.api.Status p3)
    {
        com.google.android.gms.common.api.ResultCallbacks v1_0 = this.zaa;
        if (v1_0 == null) {
            if (this.zam()) {
                ((com.google.android.gms.common.api.ResultCallbacks) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zac)).onFailure(p3);
            }
        } else {
            ((com.google.android.gms.common.api.internal.zada) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zab)).zaj(((com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_0.onFailure(p3), "onFailure must not return null")));
        }
        return;
    }

    private final boolean zam()
    {
        Object vtmp1 = this.zag.get();
        if ((this.zac == null) || (((com.google.android.gms.common.api.GoogleApiClient) vtmp1) == null)) {
            return 0;
        } else {
            return 1;
        }
    }

    private static final void zan(com.google.android.gms.common.api.Result p3)
    {
        if ((p3 instanceof com.google.android.gms.common.api.Releasable)) {
            try {
                ((com.google.android.gms.common.api.Releasable) p3).release();
                return;
            } catch (RuntimeException v0_3) {
                android.util.Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(p3)), v0_3);
            }
        }
        return;
    }

    public final void andFinally(com.google.android.gms.common.api.ResultCallbacks p6)
    {
        try {
            String v1_2;
            int v2 = 0;
        } catch (Throwable v6_1) {
            throw v6_1;
        }
        if (this.zac != null) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v1_2, "Cannot call andFinally() twice.");
        if (this.zaa == null) {
            v2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v2, "Cannot call then() and andFinally() on the same TransformedResult.");
        this.zac = p6;
        this.zak();
        return;
    }

    public final void onResult(com.google.android.gms.common.api.Result p4)
    {
        if (!p4.getStatus().isSuccess()) {
            this.zaj(p4.getStatus());
            com.google.android.gms.common.api.internal.zada.zan(p4);
        } else {
            if (this.zaa == null) {
                if (this.zam()) {
                    ((com.google.android.gms.common.api.ResultCallbacks) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zac)).onSuccess(p4);
                }
            } else {
                com.google.android.gms.common.api.internal.zaco.zaa().submit(new com.google.android.gms.common.api.internal.zacy(this, p4));
            }
        }
        return;
    }

    public final com.google.android.gms.common.api.TransformedResult then(com.google.android.gms.common.api.ResultTransform p6)
    {
        try {
            ref.WeakReference v1_3;
            int v2 = 0;
        } catch (com.google.android.gms.common.api.internal.zada v6_3) {
            throw v6_3;
        }
        if (this.zaa != null) {
            v1_3 = 0;
        } else {
            v1_3 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v1_3, "Cannot call then() twice.");
        if (this.zac == null) {
            v2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v2, "Cannot call then() and andFinally() on the same TransformedResult.");
        this.zaa = p6;
        com.google.android.gms.common.api.internal.zada v6_2 = new com.google.android.gms.common.api.internal.zada(this.zag);
        this.zab = v6_2;
        this.zak();
        return v6_2;
    }

    public final void zah()
    {
        this.zac = 0;
        return;
    }

    public final void zai(com.google.android.gms.common.api.PendingResult p2)
    {
        try {
            this.zad = p2;
            this.zak();
            return;
        } catch (Throwable v2_1) {
            throw v2_1;
        }
    }
}
