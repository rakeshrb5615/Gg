package com.google.android.gms.common.api.internal;
public abstract class zap extends com.google.android.gms.common.api.internal.LifecycleCallback implements android.content.DialogInterface$OnCancelListener {
    protected volatile boolean zaa;
    protected final java.util.concurrent.atomic.AtomicReference zab;
    protected final com.google.android.gms.common.GoogleApiAvailability zac;
    private final android.os.Handler zad;

    public zap(com.google.android.gms.common.api.internal.LifecycleFragment p2, com.google.android.gms.common.GoogleApiAvailability p3)
    {
        super(p2);
        super.zab = new java.util.concurrent.atomic.AtomicReference(0);
        super.zad = new com.google.android.gms.internal.base.zau(android.os.Looper.getMainLooper());
        super.zac = p3;
        return;
    }

    private final void zaa(com.google.android.gms.common.ConnectionResult p3, int p4)
    {
        this.zab.set(0);
        this.zab(p3, p4);
        return;
    }

    private final void zad()
    {
        this.zab.set(0);
        this.zac();
        return;
    }

    private static final int zae(com.google.android.gms.common.api.internal.zam p0)
    {
        if (p0 != 0) {
            return p0.zaa();
        } else {
            return -1;
        }
    }

    public static bridge synthetic void zaf(com.google.android.gms.common.api.internal.zap p0, com.google.android.gms.common.ConnectionResult p1, int p2)
    {
        p0.zaa(p1, p2);
        return;
    }

    public static bridge synthetic void zag(com.google.android.gms.common.api.internal.zap p0)
    {
        p0.zad();
        return;
    }

    public final void onActivityResult(int p3, int p4, android.content.Intent p5)
    {
        com.google.android.gms.common.api.internal.zam v0_2 = ((com.google.android.gms.common.api.internal.zam) this.zab.get());
        if (p3 == 1) {
            if (p4 != -1) {
                if (p4 != null) {
                    if (v0_2 != null) {
                        this.zaa(v0_2.zab(), v0_2.zaa());
                    }
                } else {
                    if (v0_2 != null) {
                        int v3_1 = 13;
                        if (p5 != null) {
                            v3_1 = p5.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                        }
                        this.zaa(new com.google.android.gms.common.ConnectionResult(v3_1, 0, v0_2.zab().toString()), com.google.android.gms.common.api.internal.zap.zae(v0_2));
                        return;
                    }
                }
            } else {
                this.zad();
                return;
            }
        } else {
            if (p3 == 2) {
                int v3_4 = this.zac.isGooglePlayServicesAvailable(this.getActivity());
                if (v3_4 != 0) {
                    if ((v0_2 != null) && ((v0_2.zab().getErrorCode() != 18) || (v3_4 != 18))) {
                    }
                } else {
                    this.zad();
                    return;
                }
            }
        }
        return;
    }

    public final void onCancel(android.content.DialogInterface p3)
    {
        this.zaa(new com.google.android.gms.common.ConnectionResult(13, 0), com.google.android.gms.common.api.internal.zap.zae(((com.google.android.gms.common.api.internal.zam) this.zab.get())));
        return;
    }

    public final void onCreate(android.os.Bundle p5)
    {
        super.onCreate(p5);
        if (p5 != 0) {
            int v2_4;
            java.util.concurrent.atomic.AtomicReference v0 = this.zab;
            if (!p5.getBoolean("resolving_error", 0)) {
                v2_4 = 0;
            } else {
                v2_4 = new com.google.android.gms.common.api.internal.zam(new com.google.android.gms.common.ConnectionResult(p5.getInt("failed_status"), ((android.app.PendingIntent) p5.getParcelable("failed_resolution"))), p5.getInt("failed_client_id", -1));
            }
            v0.set(v2_4);
        }
        return;
    }

    public final void onSaveInstanceState(android.os.Bundle p4)
    {
        super.onSaveInstanceState(p4);
        android.app.PendingIntent v0_4 = ((com.google.android.gms.common.api.internal.zam) this.zab.get());
        if (v0_4 != null) {
            p4.putBoolean("resolving_error", 1);
            p4.putInt("failed_client_id", v0_4.zaa());
            p4.putInt("failed_status", v0_4.zab().getErrorCode());
            p4.putParcelable("failed_resolution", v0_4.zab().getResolution());
            return;
        } else {
            return;
        }
    }

    public void onStart()
    {
        super.onStart();
        this.zaa = 1;
        return;
    }

    public void onStop()
    {
        super.onStop();
        this.zaa = 0;
        return;
    }

    public abstract void zab();

    public abstract void zac();

    public final void zah(com.google.android.gms.common.ConnectionResult p2, int p3)
    {
        com.google.android.gms.common.api.internal.zam v0_1 = new com.google.android.gms.common.api.internal.zam(p2, p3);
        do {
            Object v2_3 = this.zab;
            if (!v2_3.compareAndSet(0, v0_1)) {
                if (v2_3.get() != null) {
                } else {
                    while (!v2_3.compareAndSet(0, v0_1)) {
                    }
                }
                this.zad.post(new com.google.android.gms.common.api.internal.zao(this, v0_1));
                return;
            } else {
                this.zad.post(new com.google.android.gms.common.api.internal.zao(this, v0_1));
                return;
            }
        } while(v2_3.get() == null);
        return;
    }
}
