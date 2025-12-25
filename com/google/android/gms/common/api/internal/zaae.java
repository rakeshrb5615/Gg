package com.google.android.gms.common.api.internal;
public final class zaae extends com.google.android.gms.common.api.internal.zap {
    private final r.f zad;
    private final com.google.android.gms.common.api.internal.GoogleApiManager zae;

    public zaae(com.google.android.gms.common.api.internal.LifecycleFragment p1, com.google.android.gms.common.api.internal.GoogleApiManager p2, com.google.android.gms.common.GoogleApiAvailability p3)
    {
        super(p1, p3);
        super.zad = new r.f(0);
        super.zae = p2;
        super.mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", super);
        return;
    }

    public static void zad(android.app.Activity p2, com.google.android.gms.common.api.internal.GoogleApiManager p3, com.google.android.gms.common.api.internal.ApiKey p4)
    {
        r.f v2_1 = com.google.android.gms.common.api.internal.LifecycleCallback.getFragment(p2);
        com.google.android.gms.common.api.internal.zaae v0_0 = ((com.google.android.gms.common.api.internal.zaae) v2_1.getCallbackOrNull("ConnectionlessLifecycleHelper", com.google.android.gms.common.api.internal.zaae));
        if (v0_0 == null) {
            v0_0 = new com.google.android.gms.common.api.internal.zaae(v2_1, p3, com.google.android.gms.common.GoogleApiAvailability.getInstance());
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "ApiKey cannot be null");
        v0_0.zad.add(p4);
        p3.zaA(v0_0);
        return;
    }

    private final void zae()
    {
        if (!this.zad.isEmpty()) {
            this.zae.zaA(this);
        }
        return;
    }

    public final void onResume()
    {
        super.onResume();
        this.zae();
        return;
    }

    public final void onStart()
    {
        super.onStart();
        this.zae();
        return;
    }

    public final void onStop()
    {
        super.onStop();
        this.zae.zaB(this);
        return;
    }

    public final r.f zaa()
    {
        return this.zad;
    }

    public final void zab(com.google.android.gms.common.ConnectionResult p2, int p3)
    {
        this.zae.zax(p2, p3);
        return;
    }

    public final void zac()
    {
        this.zae.zay();
        return;
    }
}
