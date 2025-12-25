package com.google.android.gms.common.api.internal;
public abstract class BasePendingResult extends com.google.android.gms.common.api.PendingResult {
    static final ThreadLocal zaa;
    public static final synthetic int zad;
    private com.google.android.gms.common.api.internal.zas resultGuardian;
    protected final com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler zab;
    protected final ref.WeakReference zac;
    private final Object zae;
    private final java.util.concurrent.CountDownLatch zaf;
    private final java.util.ArrayList zag;
    private com.google.android.gms.common.api.ResultCallback zah;
    private final java.util.concurrent.atomic.AtomicReference zai;
    private com.google.android.gms.common.api.Result zaj;
    private com.google.android.gms.common.api.Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private com.google.android.gms.common.internal.ICancelToken zao;
    private volatile com.google.android.gms.common.api.internal.zada zap;
    private boolean zaq;

    static BasePendingResult()
    {
        com.google.android.gms.common.api.internal.BasePendingResult.zaa = new com.google.android.gms.common.api.internal.zaq();
        return;
    }

    public BasePendingResult()
    {
        this.zae = new Object();
        this.zaf = new java.util.concurrent.CountDownLatch(1);
        this.zag = new java.util.ArrayList();
        this.zai = new java.util.concurrent.atomic.AtomicReference();
        this.zaq = 0;
        this.zab = new com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler(android.os.Looper.getMainLooper());
        this.zac = new ref.WeakReference(0);
        return;
    }

    public BasePendingResult(android.os.Looper p3)
    {
        this.zae = new Object();
        this.zaf = new java.util.concurrent.CountDownLatch(1);
        this.zag = new java.util.ArrayList();
        this.zai = new java.util.concurrent.atomic.AtomicReference();
        this.zaq = 0;
        this.zab = new com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler(p3);
        this.zac = new ref.WeakReference(0);
        return;
    }

    public BasePendingResult(com.google.android.gms.common.api.GoogleApiClient p3)
    {
        ref.WeakReference v0_4;
        this.zae = new Object();
        this.zaf = new java.util.concurrent.CountDownLatch(1);
        this.zag = new java.util.ArrayList();
        this.zai = new java.util.concurrent.atomic.AtomicReference();
        this.zaq = 0;
        if (p3 == null) {
            v0_4 = android.os.Looper.getMainLooper();
        } else {
            v0_4 = p3.getLooper();
        }
        this.zab = new com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler(v0_4);
        this.zac = new ref.WeakReference(p3);
        return;
    }

    public BasePendingResult(com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler p3)
    {
        this.zae = new Object();
        this.zaf = new java.util.concurrent.CountDownLatch(1);
        this.zag = new java.util.ArrayList();
        this.zai = new java.util.concurrent.atomic.AtomicReference();
        this.zaq = 0;
        this.zab = ((com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "CallbackHandler must not be null"));
        this.zac = new ref.WeakReference(0);
        return;
    }

    private final com.google.android.gms.common.api.Result zaa()
    {
        com.google.android.gms.common.internal.Preconditions.checkState((this.zal ^ 1), "Result has already been consumed.");
        com.google.android.gms.common.internal.Preconditions.checkState(this.isReady(), "Result is not ready.");
        Throwable v1_1 = this.zaj;
        this.zaj = 0;
        this.zah = 0;
        this.zal = 1;
        com.google.android.gms.common.api.Result v0_2 = ((com.google.android.gms.common.api.internal.zadb) this.zai.getAndSet(0));
        if (v0_2 != null) {
            v0_2.zaa.zab.remove(this);
        }
        return ((com.google.android.gms.common.api.Result) com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_1));
    }

    private final void zab(com.google.android.gms.common.api.Result p5)
    {
        this.zaj = p5;
        this.zak = p5.getStatus();
        this.zao = 0;
        this.zaf.countDown();
        if (!this.zam) {
            com.google.android.gms.common.api.internal.zas v0_0 = this.zah;
            if (v0_0 != null) {
                this.zab.removeMessages(2);
                this.zab.zaa(v0_0, this.zaa());
            } else {
                if ((this.zaj instanceof com.google.android.gms.common.api.Releasable)) {
                    this.resultGuardian = new com.google.android.gms.common.api.internal.zas(this, 0);
                }
            }
        } else {
            this.zah = 0;
        }
        java.util.ArrayList v5_4 = this.zag;
        com.google.android.gms.common.api.internal.zas v0_5 = v5_4.size();
        int v1_2 = 0;
        while (v1_2 < v0_5) {
            ((com.google.android.gms.common.api.PendingResult$StatusListener) v5_4.get(v1_2)).onComplete(this.zak);
            v1_2++;
        }
        this.zag.clear();
        return;
    }

    public static bridge synthetic com.google.android.gms.common.api.Result zaj(com.google.android.gms.common.api.internal.BasePendingResult p0)
    {
        return p0.zaj;
    }

    public static void zal(com.google.android.gms.common.api.Result p3)
    {
        if ((p3 instanceof com.google.android.gms.common.api.Releasable)) {
            try {
                ((com.google.android.gms.common.api.Releasable) p3).release();
                return;
            } catch (RuntimeException v0_3) {
                android.util.Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(p3)), v0_3);
            }
        }
        return;
    }

    public final void addStatusListener(com.google.android.gms.common.api.PendingResult$StatusListener p3)
    {
        Object v0;
        if (p3 == null) {
            v0 = 0;
        } else {
            v0 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0, "Callback cannot be null.");
        if (!this.isReady()) {
            this.zag.add(p3);
        } else {
            p3.onComplete(this.zak);
        }
        return;
    }

    public final com.google.android.gms.common.api.Result await()
    {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("await must not be called on the UI thread");
        String v1_1 = 1;
        com.google.android.gms.common.internal.Preconditions.checkState((this.zal ^ 1), "Result has already been consumed");
        if (this.zap != null) {
            v1_1 = 0;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v1_1, "Cannot await if then() has been called.");
        try {
            this.zaf.await();
        } catch (InterruptedException) {
            this.forceFailureUnlessReady(com.google.android.gms.common.api.Status.RESULT_INTERRUPTED);
        }
        com.google.android.gms.common.internal.Preconditions.checkState(this.isReady(), "Result is not ready.");
        return this.zaa();
    }

    public final com.google.android.gms.common.api.Result await(long p4, java.util.concurrent.TimeUnit p6)
    {
        if (p4 > 0) {
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }
        int v1 = 1;
        com.google.android.gms.common.internal.Preconditions.checkState((this.zal ^ 1), "Result has already been consumed.");
        if (this.zap != null) {
            v1 = 0;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v1, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(p4, p6)) {
                this.forceFailureUnlessReady(com.google.android.gms.common.api.Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException) {
            this.forceFailureUnlessReady(com.google.android.gms.common.api.Status.RESULT_INTERRUPTED);
        }
        com.google.android.gms.common.internal.Preconditions.checkState(this.isReady(), "Result is not ready.");
        return this.zaa();
    }

    public void cancel()
    {
        try {
            if (!this.zam) {
                if (!this.zal) {
                    com.google.android.gms.common.api.Result v1_6 = this.zao;
                    if (v1_6 != null) {
                        v1_6.cancel();
                    }
                    com.google.android.gms.common.api.internal.BasePendingResult.zal(this.zaj);
                    this.zam = 1;
                    this.zab(this.createFailedResult(com.google.android.gms.common.api.Status.RESULT_CANCELED));
                    return;
                } else {
                }
            }
        } catch (com.google.android.gms.common.api.Result v1_4) {
            throw v1_4;
        }
        return;
    }

    public abstract com.google.android.gms.common.api.Result createFailedResult();

    public final void forceFailureUnlessReady(com.google.android.gms.common.api.Status p3)
    {
        if (!this.isReady()) {
            this.setResult(this.createFailedResult(p3));
            this.zan = 1;
        }
        return;
    }

    public final boolean isCanceled()
    {
        try {
            return this.zam;
        } catch (Throwable v1_1) {
            throw v1_1;
        }
    }

    public final boolean isReady()
    {
        if (this.zaf.getCount() != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void setCancelToken(com.google.android.gms.common.internal.ICancelToken p2)
    {
        try {
            this.zao = p2;
            return;
        } catch (Throwable v2_1) {
            throw v2_1;
        }
    }

    public final void setResult(com.google.android.gms.common.api.Result p4)
    {
        if ((this.zan) || (this.zam)) {
            com.google.android.gms.common.api.internal.BasePendingResult.zal(p4);
            return;
        } else {
            this.isReady();
            com.google.android.gms.common.internal.Preconditions.checkState((this.isReady() ^ 1), "Results have already been set");
            com.google.android.gms.common.internal.Preconditions.checkState((this.zal ^ 1), "Result has already been consumed");
            this.zab(p4);
            return;
        }
    }

    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback p5)
    {
        if (p5 != null) {
            com.google.android.gms.common.api.Result v2_1 = 1;
            com.google.android.gms.common.internal.Preconditions.checkState((this.zal ^ 1), "Result has already been consumed.");
            if (this.zap != null) {
                v2_1 = 0;
            } else {
            }
            com.google.android.gms.common.internal.Preconditions.checkState(v2_1, "Cannot set callbacks if then() has been called.");
            if (!this.isCanceled()) {
                if (!this.isReady()) {
                    this.zah = p5;
                } else {
                    this.zab.zaa(p5, this.zaa());
                }
                return;
            } else {
                return;
            }
        } else {
            this.zah = 0;
            return;
        }
    }

    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback p5, long p6, java.util.concurrent.TimeUnit p8)
    {
        if (p5 != null) {
            int v2 = 1;
            com.google.android.gms.common.internal.Preconditions.checkState((this.zal ^ 1), "Result has already been consumed.");
            if (this.zap != null) {
                v2 = 0;
            } else {
            }
            com.google.android.gms.common.internal.Preconditions.checkState(v2, "Cannot set callbacks if then() has been called.");
            if (!this.isCanceled()) {
                if (!this.isReady()) {
                    this.zah = p5;
                    com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler v5_1 = this.zab;
                    v5_1.sendMessageDelayed(v5_1.obtainMessage(2, this), p8.toMillis(p6));
                } else {
                    this.zab.zaa(p5, this.zaa());
                }
                return;
            } else {
                return;
            }
        } else {
            this.zah = 0;
            return;
        }
    }

    public final com.google.android.gms.common.api.TransformedResult then(com.google.android.gms.common.api.ResultTransform p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkState((this.zal ^ 1), "Result has already been consumed.");
        com.google.android.gms.common.api.internal.zada v2_0;
        com.google.android.gms.common.api.Result v3_0 = 0;
        if (this.zap != null) {
            v2_0 = 0;
        } else {
            v2_0 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v2_0, "Cannot call then() twice.");
        if (this.zah == null) {
            v3_0 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v3_0, "Cannot call then() if callbacks are set.");
        com.google.android.gms.common.internal.Preconditions.checkState((this.zam ^ 1), "Cannot call then() if result was canceled.");
        this.zaq = 1;
        this.zap = new com.google.android.gms.common.api.internal.zada(this.zac);
        com.google.android.gms.common.api.TransformedResult v6_1 = this.zap.then(p6);
        if (!this.isReady()) {
            this.zah = this.zap;
        } else {
            this.zab.zaa(this.zap, this.zaa());
        }
        return v6_1;
    }

    public final void zak()
    {
        int v1 = 1;
        if ((!this.zaq) && (!((Boolean) com.google.android.gms.common.api.internal.BasePendingResult.zaa.get()).booleanValue())) {
            v1 = 0;
        }
        this.zaq = v1;
        return;
    }

    public final boolean zam()
    {
        if (((com.google.android.gms.common.api.GoogleApiClient) this.zac.get()) == null) {
            this.cancel();
        } else {
            if (!this.zaq) {
            }
        }
        return this.isCanceled();
    }

    public final void zan(com.google.android.gms.common.api.internal.zadb p2)
    {
        this.zai.set(p2);
        return;
    }
}
