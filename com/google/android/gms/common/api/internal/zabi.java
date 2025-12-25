package com.google.android.gms.common.api.internal;
public final class zabi implements com.google.android.gms.common.api.internal.zaca, com.google.android.gms.common.api.internal.zau {
    final java.util.Map zaa;
    final java.util.Map zab;
    final com.google.android.gms.common.internal.ClientSettings zac;
    final java.util.Map zad;
    final com.google.android.gms.common.api.Api$AbstractClientBuilder zae;
    int zaf;
    final com.google.android.gms.common.api.internal.zabe zag;
    final com.google.android.gms.common.api.internal.zabz zah;
    private final java.util.concurrent.locks.Lock zai;
    private final java.util.concurrent.locks.Condition zaj;
    private final android.content.Context zak;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zal;
    private final com.google.android.gms.common.api.internal.zabh zam;
    private volatile com.google.android.gms.common.api.internal.zabf zan;
    private com.google.android.gms.common.ConnectionResult zao;

    public zabi(android.content.Context p2, com.google.android.gms.common.api.internal.zabe p3, java.util.concurrent.locks.Lock p4, android.os.Looper p5, com.google.android.gms.common.GoogleApiAvailabilityLight p6, java.util.Map p7, com.google.android.gms.common.internal.ClientSettings p8, java.util.Map p9, com.google.android.gms.common.api.Api$AbstractClientBuilder p10, java.util.ArrayList p11, com.google.android.gms.common.api.internal.zabz p12)
    {
        this.zab = new java.util.HashMap();
        this.zao = 0;
        this.zak = p2;
        this.zai = p4;
        this.zal = p6;
        this.zaa = p7;
        this.zac = p8;
        this.zad = p9;
        this.zae = p10;
        this.zag = p3;
        this.zah = p12;
        com.google.android.gms.common.api.internal.zaax v2_1 = p11.size();
        int v3_1 = 0;
        while (v3_1 < v2_1) {
            ((com.google.android.gms.common.api.internal.zat) p11.get(v3_1)).zaa(this);
            v3_1++;
        }
        this.zam = new com.google.android.gms.common.api.internal.zabh(this, p5);
        this.zaj = p4.newCondition();
        this.zan = new com.google.android.gms.common.api.internal.zaax(this);
        return;
    }

    public static bridge synthetic com.google.android.gms.common.api.internal.zabf zag(com.google.android.gms.common.api.internal.zabi p0)
    {
        return p0.zan;
    }

    public static bridge synthetic java.util.concurrent.locks.Lock zah(com.google.android.gms.common.api.internal.zabi p0)
    {
        return p0.zai;
    }

    public final void onConnected(android.os.Bundle p2)
    {
        this.zai.lock();
        try {
            this.zan.zag(p2);
            this.zai.unlock();
            return;
        } catch (Throwable v2_2) {
            this.zai.unlock();
            throw v2_2;
        }
    }

    public final void onConnectionSuspended(int p2)
    {
        this.zai.lock();
        try {
            this.zan.zai(p2);
            this.zai.unlock();
            return;
        } catch (Throwable v2_2) {
            this.zai.unlock();
            throw v2_2;
        }
    }

    public final void zaa(com.google.android.gms.common.ConnectionResult p2, com.google.android.gms.common.api.Api p3, boolean p4)
    {
        this.zai.lock();
        try {
            this.zan.zah(p2, p3, p4);
            this.zai.unlock();
            return;
        } catch (Throwable v2_2) {
            this.zai.unlock();
            throw v2_2;
        }
    }

    public final com.google.android.gms.common.ConnectionResult zab()
    {
        this.zaq();
        while ((this.zan instanceof com.google.android.gms.common.api.internal.zaaw)) {
            try {
                this.zaj.await();
            } catch (InterruptedException) {
                Thread.currentThread().interrupt();
                return new com.google.android.gms.common.ConnectionResult(15, 0);
            }
        }
        if (!(this.zan instanceof com.google.android.gms.common.api.internal.zaaj)) {
            com.google.android.gms.common.ConnectionResult v0_11 = this.zao;
            if (v0_11 == null) {
                return new com.google.android.gms.common.ConnectionResult(13, 0);
            } else {
                return v0_11;
            }
        } else {
            return com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
        }
    }

    public final com.google.android.gms.common.ConnectionResult zac(long p4, java.util.concurrent.TimeUnit p6)
    {
        this.zaq();
        com.google.android.gms.common.ConnectionResult v4_5 = p6.toNanos(p4);
        while ((this.zan instanceof com.google.android.gms.common.api.internal.zaaw)) {
            if (v4_5 > 0) {
                v4_5 = this.zaj.awaitNanos(v4_5);
            } else {
                try {
                    this.zar();
                    return new com.google.android.gms.common.ConnectionResult(14, 0);
                } catch (InterruptedException) {
                    Thread.currentThread().interrupt();
                    return new com.google.android.gms.common.ConnectionResult(15, 0);
                }
            }
        }
        if (!(this.zan instanceof com.google.android.gms.common.api.internal.zaaj)) {
            com.google.android.gms.common.ConnectionResult v4_1 = this.zao;
            if (v4_1 == null) {
                return new com.google.android.gms.common.ConnectionResult(13, 0);
            } else {
                return v4_1;
            }
        } else {
            return com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
        }
    }

    public final com.google.android.gms.common.ConnectionResult zad(com.google.android.gms.common.api.Api p2)
    {
        java.util.Map v0_0 = this.zaa;
        com.google.android.gms.common.ConnectionResult v2_2 = p2.zab();
        if (v0_0.containsKey(v2_2)) {
            if (!((com.google.android.gms.common.api.Api$Client) this.zaa.get(v2_2)).isConnected()) {
                if (this.zab.containsKey(v2_2)) {
                    return ((com.google.android.gms.common.ConnectionResult) this.zab.get(v2_2));
                }
            } else {
                return com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
            }
        }
        return 0;
    }

    public final com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl zae(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p2)
    {
        p2.zak();
        this.zan.zaa(p2);
        return p2;
    }

    public final com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl zaf(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p2)
    {
        p2.zak();
        return this.zan.zab(p2);
    }

    public final void zai()
    {
        this.zai.lock();
        try {
            this.zag.zak();
            this.zan = new com.google.android.gms.common.api.internal.zaaj(this);
            this.zan.zad();
            this.zaj.signalAll();
            this.zai.unlock();
            return;
        } catch (Throwable v0_2) {
            this.zai.unlock();
            throw v0_2;
        }
    }

    public final void zaj()
    {
        this.zai.lock();
        try {
            com.google.android.gms.common.api.internal.zabi v2 = this;
            try {
                this.zan = new com.google.android.gms.common.api.internal.zaaw(this, this.zac, this.zad, this.zal, this.zae, this.zai, this.zak);
                this.zan.zad();
                this.zaj.signalAll();
                this.zai.unlock();
                return;
            } catch (Throwable v0_1) {
                v2.zai.unlock();
                throw v0_1;
            }
        } catch (Throwable v0_1) {
            v2 = this;
        }
        this.zan = new com.google.android.gms.common.api.internal.zaaw(this, this.zac, this.zad, this.zal, this.zae, this.zai, this.zak);
        this.zan.zad();
        this.zaj.signalAll();
        this.zai.unlock();
        return;
    }

    public final void zak(com.google.android.gms.common.ConnectionResult p2)
    {
        this.zai.lock();
        try {
            this.zao = p2;
            this.zan = new com.google.android.gms.common.api.internal.zaax(this);
            this.zan.zad();
            this.zaj.signalAll();
            this.zai.unlock();
            return;
        } catch (Throwable v2_2) {
            this.zai.unlock();
            throw v2_2;
        }
    }

    public final void zal(com.google.android.gms.common.api.internal.zabg p3)
    {
        com.google.android.gms.common.api.internal.zabh v0 = this.zam;
        v0.sendMessage(v0.obtainMessage(1, p3));
        return;
    }

    public final void zam(RuntimeException p3)
    {
        com.google.android.gms.common.api.internal.zabh v0 = this.zam;
        v0.sendMessage(v0.obtainMessage(2, p3));
        return;
    }

    public final void zaq()
    {
        this.zan.zae();
        return;
    }

    public final void zar()
    {
        if (this.zan.zaj()) {
            this.zab.clear();
        }
        return;
    }

    public final void zas(String p6, java.io.FileDescriptor p7, java.io.PrintWriter p8, String[] p9)
    {
        p8.append(p6).append("mState=").println(this.zan);
        java.util.Iterator v0_1 = this.zad.keySet().iterator();
        while (v0_1.hasNext()) {
            String v1_1 = String.valueOf(p6);
            com.google.android.gms.common.api.Api$Client v2_1 = ((com.google.android.gms.common.api.Api) v0_1.next());
            p8.append(p6).append(v2_1.zad()).println(":");
            ((com.google.android.gms.common.api.Api$Client) com.google.android.gms.common.internal.Preconditions.checkNotNull(((com.google.android.gms.common.api.Api$Client) this.zaa.get(v2_1.zab())))).dump(v1_1.concat("  "), p7, p8, p9);
        }
        return;
    }

    public final void zat()
    {
        if ((this.zan instanceof com.google.android.gms.common.api.internal.zaaj)) {
            ((com.google.android.gms.common.api.internal.zaaj) this.zan).zaf();
        }
        return;
    }

    public final void zau()
    {
        return;
    }

    public final boolean zaw()
    {
        return (this.zan instanceof com.google.android.gms.common.api.internal.zaaj);
    }

    public final boolean zax()
    {
        return (this.zan instanceof com.google.android.gms.common.api.internal.zaaw);
    }

    public final boolean zay(com.google.android.gms.common.api.internal.SignInConnectionListener p1)
    {
        return 0;
    }
}
