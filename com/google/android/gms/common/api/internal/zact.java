package com.google.android.gms.common.api.internal;
public final class zact extends com.google.android.gms.signin.internal.zac implements com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener {
    private static final com.google.android.gms.common.api.Api$AbstractClientBuilder zaa;
    private final android.content.Context zab;
    private final android.os.Handler zac;
    private final com.google.android.gms.common.api.Api$AbstractClientBuilder zad;
    private final java.util.Set zae;
    private final com.google.android.gms.common.internal.ClientSettings zaf;
    private com.google.android.gms.signin.zae zag;
    private com.google.android.gms.common.api.internal.zacs zah;

    static zact()
    {
        com.google.android.gms.common.api.internal.zact.zaa = com.google.android.gms.signin.zad.zac;
        return;
    }

    public zact(android.content.Context p2, android.os.Handler p3, com.google.android.gms.common.internal.ClientSettings p4)
    {
        this.zab = p2;
        this.zac = p3;
        this.zaf = ((com.google.android.gms.common.internal.ClientSettings) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "ClientSettings must not be null"));
        this.zae = p4.getRequiredScopes();
        this.zad = com.google.android.gms.common.api.internal.zact.zaa;
        return;
    }

    public static bridge synthetic com.google.android.gms.common.api.internal.zacs zac(com.google.android.gms.common.api.internal.zact p0)
    {
        return p0.zah;
    }

    public static bridge synthetic void zad(com.google.android.gms.common.api.internal.zact p4, com.google.android.gms.signin.internal.zak p5)
    {
        com.google.android.gms.common.api.internal.zacs v0_0 = p5.zaa();
        if (!v0_0.isSuccess()) {
            p4.zah.zae(v0_0);
        } else {
            com.google.android.gms.common.internal.IAccountAccessor v5_2 = ((com.google.android.gms.common.internal.zav) com.google.android.gms.common.internal.Preconditions.checkNotNull(p5.zab()));
            com.google.android.gms.common.api.internal.zacs v0_1 = v5_2.zaa();
            if (v0_1.isSuccess()) {
                p4.zah.zaf(v5_2.zab(), p4.zae);
            } else {
                android.util.Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(v0_1)), new Exception());
                p4.zah.zae(v0_1);
                p4.zag.disconnect();
                return;
            }
        }
        p4.zag.disconnect();
        return;
    }

    public final void onConnected(android.os.Bundle p1)
    {
        this.zag.zad(this);
        return;
    }

    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult p2)
    {
        this.zah.zae(p2);
        return;
    }

    public final void onConnectionSuspended(int p2)
    {
        this.zah.zag(p2);
        return;
    }

    public final void zab(com.google.android.gms.signin.internal.zak p2)
    {
        this.zac.post(new com.google.android.gms.common.api.internal.zacr(this, p2));
        return;
    }

    public final void zae(com.google.android.gms.common.api.internal.zacs p10)
    {
        com.google.android.gms.common.api.internal.zacq v0_0 = this.zag;
        if (v0_0 != null) {
            v0_0.disconnect();
        }
        this.zaf.zae(Integer.valueOf(System.identityHashCode(this)));
        com.google.android.gms.common.internal.ClientSettings v5 = this.zaf;
        this.zag = this.zad.buildClient(this.zab, this.zac.getLooper(), v5, v5.zaa(), this, this);
        this.zah = p10;
        com.google.android.gms.signin.zae v10_1 = this.zae;
        if ((v10_1 != null) && (!v10_1.isEmpty())) {
            this.zag.zab();
            return;
        } else {
            this.zac.post(new com.google.android.gms.common.api.internal.zacq(this));
            return;
        }
    }

    public final void zaf()
    {
        com.google.android.gms.signin.zae v0 = this.zag;
        if (v0 != null) {
            v0.disconnect();
        }
        return;
    }
}
