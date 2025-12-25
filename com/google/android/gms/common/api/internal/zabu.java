package com.google.android.gms.common.api.internal;
final class zabu implements com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks, com.google.android.gms.common.api.internal.zacs {
    final synthetic com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final com.google.android.gms.common.api.Api$Client zab;
    private final com.google.android.gms.common.api.internal.ApiKey zac;
    private com.google.android.gms.common.internal.IAccountAccessor zad;
    private java.util.Set zae;
    private boolean zaf;

    public zabu(com.google.android.gms.common.api.internal.GoogleApiManager p1, com.google.android.gms.common.api.Api$Client p2, com.google.android.gms.common.api.internal.ApiKey p3)
    {
        this.zaa = p1;
        this.zad = 0;
        this.zae = 0;
        this.zaf = 0;
        this.zab = p2;
        this.zac = p3;
        return;
    }

    public static bridge synthetic com.google.android.gms.common.api.Api$Client zaa(com.google.android.gms.common.api.internal.zabu p0)
    {
        return p0.zab;
    }

    public static bridge synthetic com.google.android.gms.common.api.internal.ApiKey zab(com.google.android.gms.common.api.internal.zabu p0)
    {
        return p0.zac;
    }

    public static bridge synthetic void zac(com.google.android.gms.common.api.internal.zabu p0, boolean p1)
    {
        p0.zaf = 1;
        return;
    }

    public static bridge synthetic void zad(com.google.android.gms.common.api.internal.zabu p0)
    {
        p0.zah();
        return;
    }

    private final void zah()
    {
        if (this.zaf) {
            com.google.android.gms.common.internal.IAccountAccessor v0_1 = this.zad;
            if (v0_1 != null) {
                this.zab.getRemoteService(v0_1, this.zae);
            }
        }
        return;
    }

    public final void onReportServiceBinding(com.google.android.gms.common.ConnectionResult p3)
    {
        com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa).post(new com.google.android.gms.common.api.internal.zabt(this, p3));
        return;
    }

    public final void zae(com.google.android.gms.common.ConnectionResult p3)
    {
        com.google.android.gms.common.api.internal.zabq v0_3 = ((com.google.android.gms.common.api.internal.zabq) com.google.android.gms.common.api.internal.GoogleApiManager.zar(this.zaa).get(this.zac));
        if (v0_3 != null) {
            v0_3.zas(p3);
        }
        return;
    }

    public final void zaf(com.google.android.gms.common.internal.IAccountAccessor p2, java.util.Set p3)
    {
        if ((p2 != null) && (p3 != 0)) {
            this.zad = p2;
            this.zae = p3;
            this.zah();
            return;
        } else {
            android.util.Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            this.zae(new com.google.android.gms.common.ConnectionResult(4));
            return;
        }
    }

    public final void zag(int p3)
    {
        com.google.android.gms.common.api.internal.zabq v0_3 = ((com.google.android.gms.common.api.internal.zabq) com.google.android.gms.common.api.internal.GoogleApiManager.zar(this.zaa).get(this.zac));
        if (v0_3 != null) {
            if (!com.google.android.gms.common.api.internal.zabq.zax(v0_3)) {
                v0_3.onConnectionSuspended(p3);
            } else {
                v0_3.zas(new com.google.android.gms.common.ConnectionResult(17));
                return;
            }
        }
        return;
    }
}
