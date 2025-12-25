package com.google.android.gms.auth.api.signin.internal;
public final class zbc extends androidx.loader.content.b implements com.google.android.gms.common.api.internal.SignInConnectionListener {
    private final java.util.concurrent.Semaphore zba;
    private final java.util.Set zbb;

    public zbc(android.content.Context p2, java.util.Set p3)
    {
        super(p2);
        super.zba = new java.util.concurrent.Semaphore(0);
        super.zbb = p3;
        return;
    }

    public final bridge synthetic Object loadInBackground()
    {
        int v0_4 = this.zbb.iterator();
        String v1_1 = 0;
        while (v0_4.hasNext()) {
            if (((com.google.android.gms.common.api.GoogleApiClient) v0_4.next()).maybeSignIn(this)) {
                v1_1++;
            }
        }
        try {
            this.zba.tryAcquire(v1_1, 5, java.util.concurrent.TimeUnit.SECONDS);
        } catch (int v0_1) {
            android.util.Log.i("GACSignInLoader", "Unexpected InterruptedException", v0_1);
            Thread.currentThread().interrupt();
        }
        return 0;
    }

    public final void onComplete()
    {
        this.zba.release();
        return;
    }

    public final void onStartLoading()
    {
        this.zba.drainPermits();
        this.forceLoad();
        return;
    }
}
