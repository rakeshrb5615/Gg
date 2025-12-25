package com.google.android.gms.common.internal;
public final class zak implements android.os.Handler$Callback {
    final java.util.ArrayList zaa;
    private final com.google.android.gms.common.internal.zaj zab;
    private final java.util.ArrayList zac;
    private final java.util.ArrayList zad;
    private volatile boolean zae;
    private final java.util.concurrent.atomic.AtomicInteger zaf;
    private boolean zag;
    private final android.os.Handler zah;
    private final Object zai;

    public zak(android.os.Looper p3, com.google.android.gms.common.internal.zaj p4)
    {
        this.zac = new java.util.ArrayList();
        this.zaa = new java.util.ArrayList();
        this.zad = new java.util.ArrayList();
        this.zae = 0;
        this.zaf = new java.util.concurrent.atomic.AtomicInteger(0);
        this.zag = 0;
        this.zai = new Object();
        this.zab = p4;
        this.zah = new com.google.android.gms.internal.base.zau(p3, this);
        return;
    }

    public final boolean handleMessage(android.os.Message p4)
    {
        int v0_0 = p4.what;
        if (v0_0 != 1) {
            android.util.Log.wtf("GmsClientEvents", g2.g.c(v0_0, "Don\'t know how to handle message: "), new Exception());
            return 0;
        } else {
            Throwable v4_3 = ((com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks) p4.obj);
            if ((this.zae) && ((this.zab.isConnected()) && (this.zac.contains(v4_3)))) {
                v4_3.onConnected(0);
            }
            return 1;
        }
    }

    public final void zaa()
    {
        this.zae = 0;
        this.zaf.incrementAndGet();
        return;
    }

    public final void zab()
    {
        this.zae = 1;
        return;
    }

    public final void zac(com.google.android.gms.common.ConnectionResult p8)
    {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zah, "onConnectionFailure must only be called on the Handler thread");
        this.zah.removeMessages(1);
        java.util.ArrayList v1_3 = new java.util.ArrayList(this.zad);
        int v2_1 = this.zaf.get();
        int v3 = v1_3.size();
        int v4 = 0;
        while (v4 < v3) {
            com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener v5_0 = v1_3.get(v4);
            v4++;
            com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener v5_1 = ((com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener) v5_0);
            if (this.zae) {
                if (this.zaf.get() == v2_1) {
                    if (this.zad.contains(v5_1)) {
                        v5_1.onConnectionFailed(p8);
                    }
                } else {
                }
            }
            return;
        }
        return;
    }

    public final void zad(android.os.Bundle p9)
    {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zah, "onConnectionSuccess must only be called on the Handler thread");
        com.google.android.gms.common.internal.Preconditions.checkState((this.zag ^ 1));
        this.zah.removeMessages(1);
        this.zag = 1;
        com.google.android.gms.common.internal.Preconditions.checkState(this.zaa.isEmpty());
        java.util.ArrayList v1_4 = new java.util.ArrayList(this.zac);
        int v2_2 = this.zaf.get();
        int v3 = v1_4.size();
        int v5 = 0;
        while (v5 < v3) {
            com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks v6_0 = v1_4.get(v5);
            v5++;
            com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks v6_1 = ((com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks) v6_0);
            if ((!this.zae) || (!this.zab.isConnected())) {
                break;
            }
            if (this.zaf.get() == v2_2) {
                if (!this.zaa.contains(v6_1)) {
                    v6_1.onConnected(p9);
                }
            } else {
                break;
            }
        }
        this.zaa.clear();
        this.zag = 0;
        return;
    }

    public final void zae(int p9)
    {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zah, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.zah.removeMessages(1);
        this.zag = 1;
        java.util.ArrayList v1_1 = new java.util.ArrayList(this.zac);
        int v2_1 = this.zaf.get();
        int v3 = v1_1.size();
        int v5 = 0;
        while (v5 < v3) {
            com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks v6_0 = v1_1.get(v5);
            v5++;
            com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks v6_1 = ((com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks) v6_0);
            if (!this.zae) {
                break;
            }
            if (this.zaf.get() == v2_1) {
                if (this.zac.contains(v6_1)) {
                    v6_1.onConnectionSuspended(p9);
                }
            } else {
                break;
            }
        }
        this.zaa.clear();
        this.zag = 0;
        return;
    }

    public final void zaf(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        if (!this.zac.contains(p6)) {
            this.zac.add(p6);
        } else {
            String v3 = String.valueOf(p6);
            StringBuilder v4_1 = new StringBuilder("registerConnectionCallbacks(): listener ");
            v4_1.append(v3);
            v4_1.append(" is already registered");
            android.util.Log.w("GmsClientEvents", v4_1.toString());
        }
        if (this.zab.isConnected()) {
            android.os.Handler v0_5 = this.zah;
            v0_5.sendMessage(v0_5.obtainMessage(1, p6));
        }
        return;
    }

    public final void zag(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        if (!this.zad.contains(p5)) {
            this.zad.add(p5);
        } else {
            String v5_1 = String.valueOf(p5);
            StringBuilder v3_1 = new StringBuilder("registerConnectionFailedListener(): listener ");
            v3_1.append(v5_1);
            v3_1.append(" is already registered");
            android.util.Log.w("GmsClientEvents", v3_1.toString());
        }
        return;
    }

    public final void zah(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        if (this.zac.remove(p5)) {
            if (this.zag) {
                this.zaa.add(p5);
            }
        } else {
            String v5_1 = String.valueOf(p5);
            StringBuilder v3_1 = new StringBuilder("unregisterConnectionCallbacks(): listener ");
            v3_1.append(v5_1);
            v3_1.append(" not found");
            android.util.Log.w("GmsClientEvents", v3_1.toString());
        }
        return;
    }

    public final void zai(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        if (!this.zad.remove(p5)) {
            String v5_4 = String.valueOf(p5);
            StringBuilder v3_1 = new StringBuilder("unregisterConnectionFailedListener(): listener ");
            v3_1.append(v5_4);
            v3_1.append(" not found");
            android.util.Log.w("GmsClientEvents", v3_1.toString());
        }
        return;
    }

    public final boolean zaj(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        try {
            return this.zac.contains(p3);
        } catch (Throwable v3_2) {
            throw v3_2;
        }
    }

    public final boolean zak(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        try {
            return this.zad.contains(p3);
        } catch (Throwable v3_2) {
            throw v3_2;
        }
    }
}
