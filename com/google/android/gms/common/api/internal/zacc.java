package com.google.android.gms.common.api.internal;
public final class zacc extends com.google.android.gms.common.api.internal.zap {
    private com.google.android.gms.tasks.TaskCompletionSource zad;

    private zacc(com.google.android.gms.common.api.internal.LifecycleFragment p2)
    {
        super(p2, com.google.android.gms.common.GoogleApiAvailability.getInstance());
        super.zad = new com.google.android.gms.tasks.TaskCompletionSource();
        super.mLifecycleFragment.addCallback("GmsAvailabilityHelper", super);
        return;
    }

    public static com.google.android.gms.common.api.internal.zacc zaa(android.app.Activity p2)
    {
        com.google.android.gms.tasks.TaskCompletionSource v2_1 = com.google.android.gms.common.api.internal.LifecycleCallback.getFragment(p2);
        com.google.android.gms.common.api.internal.zacc v0_2 = ((com.google.android.gms.common.api.internal.zacc) v2_1.getCallbackOrNull("GmsAvailabilityHelper", com.google.android.gms.common.api.internal.zacc));
        if (v0_2 == null) {
            return new com.google.android.gms.common.api.internal.zacc(v2_1);
        } else {
            if (v0_2.zad.getTask().isComplete()) {
                v0_2.zad = new com.google.android.gms.tasks.TaskCompletionSource();
            }
            return v0_2;
        }
    }

    public final void onDestroy()
    {
        super.onDestroy();
        this.zad.trySetException(new java.util.concurrent.CancellationException("Host activity was destroyed before Google Play services could be made available."));
        return;
    }

    public final void zab(com.google.android.gms.common.ConnectionResult p5, int p6)
    {
        p6 = p5.getErrorMessage();
        if (p6 == null) {
            p6 = "Error connecting to Google Play services";
        }
        this.zad.setException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(p5, p6, p5.getErrorCode())));
        return;
    }

    public final void zac()
    {
        int v0_2 = this.mLifecycleFragment.getLifecycleActivity();
        if (v0_2 != 0) {
            int v0_5 = this.zac.isGooglePlayServicesAvailable(v0_2);
            if (v0_5 != 0) {
                if (!this.zad.getTask().isComplete()) {
                    this.zah(new com.google.android.gms.common.ConnectionResult(v0_5, 0), 0);
                }
                return;
            } else {
                this.zad.trySetResult(0);
                return;
            }
        } else {
            this.zad.trySetException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(8)));
            return;
        }
    }

    public final com.google.android.gms.tasks.Task zad()
    {
        return this.zad.getTask();
    }
}
