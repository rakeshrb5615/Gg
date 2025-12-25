package com.google.android.gms.common.api.internal;
public final class zabe extends com.google.android.gms.common.api.GoogleApiClient implements com.google.android.gms.common.api.internal.zabz {
    final java.util.Queue zaa;
    com.google.android.gms.common.api.internal.zabx zab;
    final java.util.Map zac;
    java.util.Set zad;
    final com.google.android.gms.common.internal.ClientSettings zae;
    final java.util.Map zaf;
    final com.google.android.gms.common.api.Api$AbstractClientBuilder zag;
    java.util.Set zah;
    final com.google.android.gms.common.api.internal.zadc zai;
    private final java.util.concurrent.locks.Lock zaj;
    private final com.google.android.gms.common.internal.zak zak;
    private com.google.android.gms.common.api.internal.zaca zal;
    private final int zam;
    private final android.content.Context zan;
    private final android.os.Looper zao;
    private volatile boolean zap;
    private long zaq;
    private long zar;
    private final com.google.android.gms.common.api.internal.zabc zas;
    private final com.google.android.gms.common.GoogleApiAvailability zat;
    private final com.google.android.gms.common.api.internal.ListenerHolders zau;
    private final java.util.ArrayList zav;
    private Integer zaw;
    private final com.google.android.gms.common.internal.zaj zax;

    public zabe(android.content.Context p4, java.util.concurrent.locks.Lock p5, android.os.Looper p6, com.google.android.gms.common.internal.ClientSettings p7, com.google.android.gms.common.GoogleApiAvailability p8, com.google.android.gms.common.api.Api$AbstractClientBuilder p9, java.util.Map p10, java.util.List p11, java.util.List p12, java.util.Map p13, int p14, int p15, java.util.ArrayList p16)
    {
        com.google.android.gms.common.api.internal.ListenerHolders v1_0;
        this.zal = 0;
        this.zaa = new java.util.LinkedList();
        if (1 == com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
            v1_0 = 10000;
        } else {
            v1_0 = 120000;
        }
        this.zaq = v1_0;
        this.zar = 5000;
        this.zad = new java.util.HashSet();
        this.zau = new com.google.android.gms.common.api.internal.ListenerHolders();
        this.zaw = 0;
        this.zah = 0;
        com.google.android.gms.common.api.internal.zaay v0_2 = new com.google.android.gms.common.api.internal.zaay(this);
        this.zax = v0_2;
        this.zan = p4;
        this.zaj = p5;
        this.zak = new com.google.android.gms.common.internal.zak(p6, v0_2);
        this.zao = p6;
        this.zas = new com.google.android.gms.common.api.internal.zabc(this, p6);
        this.zat = p8;
        this.zam = p14;
        if (p14 >= 0) {
            this.zaw = Integer.valueOf(p15);
        }
        this.zaf = p10;
        this.zac = p13;
        this.zav = p16;
        this.zai = new com.google.android.gms.common.api.internal.zadc();
        java.util.Iterator v4_9 = p11.iterator();
        while (v4_9.hasNext()) {
            this.zak.zaf(((com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks) v4_9.next()));
        }
        java.util.Iterator v4_10 = p12.iterator();
        while (v4_10.hasNext()) {
            this.zak.zag(((com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener) v4_10.next()));
        }
        this.zae = p7;
        this.zag = p9;
        return;
    }

    public static int zad(Iterable p4, boolean p5)
    {
        int v4_1 = p4.iterator();
        int v0 = 0;
        int v1 = 0;
        while (v4_1.hasNext()) {
            boolean v2_1 = ((com.google.android.gms.common.api.Api$Client) v4_1.next());
            v0 |= v2_1.requiresSignIn();
            v1 |= v2_1.providesSignIn();
        }
        if (v0 == 0) {
            return 3;
        } else {
            if ((v1 == 0) || (!p5)) {
                return 1;
            } else {
                return 2;
            }
        }
    }

    public static bridge synthetic android.content.Context zae(com.google.android.gms.common.api.internal.zabe p0)
    {
        return p0.zan;
    }

    public static String zag(int p1)
    {
        if (p1 == 1) {
            return "SIGN_IN_MODE_REQUIRED";
        } else {
            if (p1 == 2) {
                return "SIGN_IN_MODE_OPTIONAL";
            } else {
                if (p1 == 3) {
                    return "SIGN_IN_MODE_NONE";
                } else {
                    return "UNKNOWN";
                }
            }
        }
    }

    public static bridge synthetic void zah(com.google.android.gms.common.api.internal.zabe p0, com.google.android.gms.common.api.GoogleApiClient p1, com.google.android.gms.common.api.internal.StatusPendingResult p2, boolean p3)
    {
        p0.zam(p1, p2, 1);
        return;
    }

    public static bridge synthetic void zai(com.google.android.gms.common.api.internal.zabe p1)
    {
        p1.zaj.lock();
        try {
            if (p1.zap) {
                p1 = p1.zan();
            }
        } catch (Throwable v0_2) {
            p1.zaj.unlock();
            throw v0_2;
        }
        p1.zaj.unlock();
        return;
    }

    public static bridge synthetic void zaj(com.google.android.gms.common.api.internal.zabe p1)
    {
        p1.zaj.lock();
        try {
            if (p1.zak()) {
                p1 = p1.zan();
            }
        } catch (Throwable v0_2) {
            p1.zaj.unlock();
            throw v0_2;
        }
        p1.zaj.unlock();
        return;
    }

    private final void zal(int p13)
    {
        String v0_0 = this.zaw;
        if (v0_0 != null) {
            if (v0_0.intValue() != p13) {
                android.content.Context v1_0 = com.google.android.gms.common.api.internal.zabe.zag(this.zaw.intValue());
                com.google.android.gms.common.api.internal.zabe v3_1 = new StringBuilder("Cannot use sign-in mode: ");
                v3_1.append(com.google.android.gms.common.api.internal.zabe.zag(p13));
                v3_1.append(". Mode was already set to ");
                v3_1.append(v1_0);
                throw new IllegalStateException(v3_1.toString());
            }
        } else {
            this.zaw = Integer.valueOf(p13);
        }
        if (this.zal == null) {
            IllegalStateException v13_8 = this.zac.values().iterator();
            String v0_3 = 0;
            android.content.Context v1_1 = 0;
            while (v13_8.hasNext()) {
                com.google.android.gms.common.api.internal.zabe v2_7 = ((com.google.android.gms.common.api.Api$Client) v13_8.next());
                v0_3 |= v2_7.requiresSignIn();
                v1_1 |= v2_7.providesSignIn();
            }
            com.google.android.gms.common.api.internal.zabe v2_2;
            IllegalStateException v13_10 = this.zaw.intValue();
            if (v13_10 == 1) {
                v2_2 = this;
                if (v0_3 == null) {
                    throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                } else {
                    if (v1_1 != null) {
                        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                }
            } else {
                if ((v13_10 != 2) || (v0_3 == null)) {
                    v2_2 = this;
                } else {
                    this.zal = com.google.android.gms.common.api.internal.zaaa.zag(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav);
                    return;
                }
            }
            v2_2.zal = new com.google.android.gms.common.api.internal.zabi(v2_2.zan, v2_2, v2_2.zaj, v2_2.zao, v2_2.zat, v2_2.zac, v2_2.zae, v2_2.zaf, v2_2.zag, v2_2.zav, this);
            return;
        } else {
            return;
        }
    }

    private final void zam(com.google.android.gms.common.api.GoogleApiClient p3, com.google.android.gms.common.api.internal.StatusPendingResult p4, boolean p5)
    {
        com.google.android.gms.common.internal.service.Common.zaa.zaa(p3).setResultCallback(new com.google.android.gms.common.api.internal.zabb(this, p4, p5, p3));
        return;
    }

    private final void zan()
    {
        this.zak.zab();
        ((com.google.android.gms.common.api.internal.zaca) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zal)).zaq();
        return;
    }

    public final com.google.android.gms.common.ConnectionResult blockingConnect()
    {
        IllegalStateException v0_23;
        int v2 = 1;
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            v0_23 = 0;
        } else {
            v0_23 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v0_23, "blockingConnect must not be called on the UI thread");
        this.zaj.lock();
        if (this.zam < 0) {
            IllegalStateException v0_3 = this.zaw;
            if (v0_3 != null) {
                if (v0_3.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            } else {
                this.zaw = Integer.valueOf(com.google.android.gms.common.api.internal.zabe.zad(this.zac.values(), 0));
            }
        } else {
            if (this.zaw == null) {
                v2 = 0;
            } else {
            }
            com.google.android.gms.common.internal.Preconditions.checkState(v2, "Sign-in mode should have been set explicitly by auto-manage.");
        }
        this.zal(((Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaw)).intValue());
        this.zak.zab();
        IllegalStateException v0_22 = ((com.google.android.gms.common.api.internal.zaca) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zal)).zab();
        this.zaj.unlock();
        return v0_22;
    }

    public final com.google.android.gms.common.ConnectionResult blockingConnect(long p4, java.util.concurrent.TimeUnit p6)
    {
        com.google.android.gms.common.api.internal.zaca v0_17;
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            v0_17 = 0;
        } else {
            v0_17 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v0_17, "blockingConnect must not be called on the UI thread");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6, "TimeUnit must not be null");
        this.zaj.lock();
        com.google.android.gms.common.api.internal.zaca v0_3 = this.zaw;
        if (v0_3 != null) {
            if (v0_3.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else {
            this.zaw = Integer.valueOf(com.google.android.gms.common.api.internal.zabe.zad(this.zac.values(), 0));
        }
        this.zal(((Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaw)).intValue());
        this.zak.zab();
        IllegalStateException v4_4 = ((com.google.android.gms.common.api.internal.zaca) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zal)).zac(p4, p6);
        this.zaj.unlock();
        return v4_4;
    }

    public final com.google.android.gms.common.api.PendingResult clearDefaultAccountAndReconnect()
    {
        com.google.android.gms.common.internal.Preconditions.checkState(this.isConnected(), "GoogleApiClient is not connected yet.");
        com.google.android.gms.common.api.internal.StatusPendingResult v0_4 = this.zaw;
        com.google.android.gms.common.api.GoogleApiClient v2_0 = 1;
        if ((v0_4 != null) && (v0_4.intValue() == 2)) {
            v2_0 = 0;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v2_0, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        com.google.android.gms.common.api.internal.StatusPendingResult v0_3 = new com.google.android.gms.common.api.internal.StatusPendingResult(this);
        if (!this.zac.containsKey(com.google.android.gms.common.internal.service.Common.CLIENT_KEY)) {
            java.util.concurrent.atomic.AtomicReference v1_2 = new java.util.concurrent.atomic.AtomicReference();
            com.google.android.gms.common.api.GoogleApiClient v2_4 = new com.google.android.gms.common.api.internal.zaaz(this, v1_2, v0_3);
            com.google.android.gms.common.api.internal.zaba v3_3 = new com.google.android.gms.common.api.internal.zaba(this, v0_3);
            com.google.android.gms.common.api.GoogleApiClient$Builder v5_1 = new com.google.android.gms.common.api.GoogleApiClient$Builder(this.zan);
            v5_1.addApi(com.google.android.gms.common.internal.service.Common.API);
            v5_1.addConnectionCallbacks(v2_4);
            v5_1.addOnConnectionFailedListener(v3_3);
            v5_1.setHandler(this.zas);
            com.google.android.gms.common.api.GoogleApiClient v2_6 = v5_1.build();
            v1_2.set(v2_6);
            v2_6.connect();
            return v0_3;
        } else {
            this.zam(this, v0_3, 0);
            return v0_3;
        }
    }

    public final void connect()
    {
        this.zaj.lock();
        String v2 = 2;
        int v3 = 0;
        if (this.zam < 0) {
            java.util.concurrent.locks.Lock v1_18 = this.zaw;
            if (v1_18 != null) {
                if (v1_18.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            } else {
                this.zaw = Integer.valueOf(com.google.android.gms.common.api.internal.zabe.zad(this.zac.values(), 0));
            }
        } else {
            java.util.concurrent.locks.Lock v1_8;
            if (this.zaw == null) {
                v1_8 = 0;
            } else {
                v1_8 = 1;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(v1_8, "Sign-in mode should have been set explicitly by auto-manage.");
        }
        java.util.concurrent.locks.Lock v1_13 = ((Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaw)).intValue();
        this.zaj.lock();
        if ((v1_13 == 3) || (v1_13 == 1)) {
            v2 = v1_13;
            v3 = 1;
        } else {
            if (v1_13 != 2) {
                v2 = v1_13;
            }
        }
        try {
            java.util.concurrent.locks.Lock v1_15 = new StringBuilder("Illegal sign-in mode: ");
            v1_15.append(v2);
            com.google.android.gms.common.internal.Preconditions.checkArgument(v3, v1_15.toString());
            this.zal(v2);
            this.zan();
        } catch (java.util.concurrent.locks.Lock v0_4) {
            this.zaj.unlock();
            throw v0_4;
        }
        this.zaj.unlock();
        this.zaj.unlock();
        return;
    }

    public final void connect(int p4)
    {
        this.zaj.lock();
        int v2 = 1;
        if ((p4 != 3) && (p4 != 1)) {
            if (p4 != 2) {
                v2 = 0;
            } else {
                p4 = 2;
            }
        }
        try {
            int v1_2 = new StringBuilder("Illegal sign-in mode: ");
            v1_2.append(p4);
            com.google.android.gms.common.internal.Preconditions.checkArgument(v2, v1_2.toString());
            this.zal(p4);
            this.zan();
            this.zaj.unlock();
            return;
        } catch (int v4_2) {
            this.zaj.unlock();
            throw v4_2;
        }
    }

    public final void disconnect()
    {
        this.zaj.lock();
        this.zai.zab();
        java.util.concurrent.locks.Lock v0_8 = this.zal;
        if (v0_8 != null) {
            v0_8.zar();
        }
        this.zau.zab();
        java.util.concurrent.locks.Lock v0_1 = this.zaa.iterator();
        while (v0_1.hasNext()) {
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl v1_2 = ((com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl) v0_1.next());
            v1_2.zan(0);
            v1_2.cancel();
        }
        this.zaa.clear();
        if (this.zal != null) {
            this.zak();
            this.zak.zaa();
        }
        this.zaj.unlock();
        return;
    }

    public final void dump(String p3, java.io.FileDescriptor p4, java.io.PrintWriter p5, String[] p6)
    {
        p5.append(p3).append("mContext=").println(this.zan);
        p5.append(p3).append("mResuming=").print(this.zap);
        p5.append(" mWorkQueue.size()=").print(this.zaa.size());
        p5.append(" mUnconsumedApiCalls.size()=").println(this.zai.zab.size());
        com.google.android.gms.common.api.internal.zaca v0_7 = this.zal;
        if (v0_7 != null) {
            v0_7.zas(p3, p4, p5, p6);
        }
        return;
    }

    public final com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl enqueue(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p5)
    {
        java.util.concurrent.locks.Lock v0_1;
        java.util.concurrent.locks.Lock v0_0 = p5.getApi();
        boolean v1_1 = this.zac.containsKey(p5.getClientKey());
        if (v0_0 == null) {
            v0_1 = "the API";
        } else {
            v0_1 = v0_0.zad();
        }
        StringBuilder v2_1 = new StringBuilder("GoogleApiClient is not configured to use ");
        v2_1.append(v0_1);
        v2_1.append(" required for this call.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(v1_1, v2_1.toString());
        this.zaj.lock();
        java.util.concurrent.locks.Lock v0_5 = this.zal;
        if (v0_5 != null) {
            p5 = v0_5.zae(p5);
        } else {
            this.zaa.add(p5);
        }
        this.zaj.unlock();
        return p5;
    }

    public final com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p5)
    {
        com.google.android.gms.common.api.Status v1_0;
        com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl v0_0 = this.zac;
        com.google.android.gms.common.api.Status v1_3 = p5.getApi();
        com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl v0_12 = v0_0.containsKey(p5.getClientKey());
        if (v1_3 == null) {
            v1_0 = "the API";
        } else {
            v1_0 = v1_3.zad();
        }
        StringBuilder v2_1 = new StringBuilder("GoogleApiClient is not configured to use ");
        v2_1.append(v1_0);
        v2_1.append(" required for this call.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_12, v2_1.toString());
        this.zaj.lock();
        com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl v0_2 = this.zal;
        if (v0_2 == null) {
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } else {
            if (!this.zap) {
                p5 = v0_2.zaf(p5);
            } else {
                this.zaa.add(p5);
                while (!this.zaa.isEmpty()) {
                    com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl v0_10 = ((com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl) this.zaa.remove());
                    this.zai.zaa(v0_10);
                    v0_10.setFailedResult(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
                }
            }
            this.zaj.unlock();
            return p5;
        }
    }

    public final com.google.android.gms.common.api.Api$Client getClient(com.google.android.gms.common.api.Api$AnyClientKey p2)
    {
        com.google.android.gms.common.api.Api$Client v2_2 = ((com.google.android.gms.common.api.Api$Client) this.zac.get(p2));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v2_2, "Appropriate Api was not requested.");
        return v2_2;
    }

    public final com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.Api p4)
    {
        this.zaj.lock();
        if (!this.isConnected()) {
            if (!this.zap) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            } else {
            }
        }
        if (!this.zac.containsKey(p4.zab())) {
            com.google.android.gms.common.ConnectionResult v4_2 = p4.zad();
            int v1_4 = new StringBuilder();
            v1_4.append(v4_2);
            v1_4.append(" was never registered with GoogleApiClient");
            throw new IllegalArgumentException(v1_4.toString());
        } else {
            int v1_8 = ((com.google.android.gms.common.api.internal.zaca) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zal)).zad(p4);
            if (v1_8 != 0) {
                this.zaj.unlock();
                return v1_8;
            } else {
                com.google.android.gms.common.ConnectionResult v4_10;
                if (!this.zap) {
                    android.util.Log.w("GoogleApiClientImpl", this.zaf());
                    com.google.android.gms.common.ConnectionResult v4_6 = p4.zad();
                    int v1_13 = new StringBuilder();
                    v1_13.append(v4_6);
                    v1_13.append(" requested in getConnectionResult is not connected but is not present in the failed  connections map");
                    android.util.Log.wtf("GoogleApiClientImpl", v1_13.toString(), new Exception());
                    v4_10 = new com.google.android.gms.common.ConnectionResult(8, 0);
                } else {
                    v4_10 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
                }
                this.zaj.unlock();
                return v4_10;
            }
        }
    }

    public final android.content.Context getContext()
    {
        return this.zan;
    }

    public final android.os.Looper getLooper()
    {
        return this.zao;
    }

    public final boolean hasApi(com.google.android.gms.common.api.Api p2)
    {
        return this.zac.containsKey(p2.zab());
    }

    public final boolean hasConnectedApi(com.google.android.gms.common.api.Api p3)
    {
        if (this.isConnected()) {
            int v3_5 = ((com.google.android.gms.common.api.Api$Client) this.zac.get(p3.zab()));
            if ((v3_5 == 0) || (!v3_5.isConnected())) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final boolean isConnected()
    {
        int v0_0 = this.zal;
        if ((v0_0 == 0) || (!v0_0.zaw())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isConnecting()
    {
        int v0_0 = this.zal;
        if ((v0_0 == 0) || (!v0_0.zax())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks p2)
    {
        return this.zak.zaj(p2);
    }

    public final boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p2)
    {
        return this.zak.zak(p2);
    }

    public final boolean maybeSignIn(com.google.android.gms.common.api.internal.SignInConnectionListener p2)
    {
        com.google.android.gms.common.api.internal.zaca v0 = this.zal;
        if ((v0 == null) || (!v0.zay(p2))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void maybeSignOut()
    {
        com.google.android.gms.common.api.internal.zaca v0 = this.zal;
        if (v0 != null) {
            v0.zau();
        }
        return;
    }

    public final void reconnect()
    {
        this.disconnect();
        this.connect();
        return;
    }

    public final void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks p2)
    {
        this.zak.zaf(p2);
        return;
    }

    public final void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p2)
    {
        this.zak.zag(p2);
        return;
    }

    public final com.google.android.gms.common.api.internal.ListenerHolder registerListener(Object p4)
    {
        this.zaj.lock();
        try {
            Throwable v4_2 = this.zau.zaa(p4, this.zao, "NO_TYPE");
            this.zaj.unlock();
            return v4_2;
        } catch (Throwable v4_1) {
            this.zaj.unlock();
            throw v4_1;
        }
    }

    public final void stopAutoManage(androidx.fragment.app.j0 p2)
    {
        String v0_1 = new com.google.android.gms.common.api.internal.LifecycleActivity(p2);
        if (this.zam < 0) {
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        } else {
            com.google.android.gms.common.api.internal.zak.zaa(v0_1).zae(this.zam);
            return;
        }
    }

    public final void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks p2)
    {
        this.zak.zah(p2);
        return;
    }

    public final void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p2)
    {
        this.zak.zai(p2);
        return;
    }

    public final void zaa(com.google.android.gms.common.ConnectionResult p4)
    {
        if (!this.zat.isPlayServicesPossiblyUpdating(this.zan, p4.getErrorCode())) {
            this.zak();
        }
        if (!this.zap) {
            this.zak.zac(p4);
            this.zak.zaa();
        }
        return;
    }

    public final void zab(android.os.Bundle p2)
    {
        while (!this.zaa.isEmpty()) {
            this.execute(((com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl) this.zaa.remove()));
        }
        this.zak.zad(p2);
        return;
    }

    public final void zac(int p6, boolean p7)
    {
        if (p6 == 1) {
            if ((p7 == null) && (!this.zap)) {
                this.zap = 1;
                try {
                    if ((this.zab == null) && (!com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide())) {
                        this.zab = this.zat.zac(this.zan.getApplicationContext(), new com.google.android.gms.common.api.internal.zabd(this));
                    }
                } catch (SecurityException) {
                }
                com.google.android.gms.common.api.internal.zabx v6_4 = this.zas;
                v6_4.sendMessageDelayed(v6_4.obtainMessage(1), this.zaq);
                com.google.android.gms.common.api.internal.zabx v6_5 = this.zas;
                v6_5.sendMessageDelayed(v6_5.obtainMessage(2), this.zar);
            }
            p6 = 1;
        }
        int v1_1 = 0;
        com.google.android.gms.common.api.internal.zabd v2_4 = new com.google.android.gms.common.api.internal.BasePendingResult[0];
        android.content.Context v7_8 = ((com.google.android.gms.common.api.internal.BasePendingResult[]) this.zai.zab.toArray(v2_4));
        com.google.android.gms.common.api.internal.zabd v2_5 = v7_8.length;
        while (v1_1 < v2_5) {
            v7_8[v1_1].forceFailureUnlessReady(com.google.android.gms.common.api.internal.zadc.zaa);
            v1_1++;
        }
        this.zak.zae(p6);
        this.zak.zaa();
        if (p6 == 2) {
            this.zan();
        }
        return;
    }

    public final String zaf()
    {
        String v0_1 = new java.io.StringWriter();
        this.dump("", 0, new java.io.PrintWriter(v0_1), 0);
        return v0_1.toString();
    }

    public final boolean zak()
    {
        if (this.zap) {
            this.zap = 0;
            this.zas.removeMessages(2);
            this.zas.removeMessages(1);
            int v0_1 = this.zab;
            if (v0_1 != 0) {
                v0_1.zab();
                this.zab = 0;
            }
            return 1;
        } else {
            return 0;
        }
    }

    public final void zao(com.google.android.gms.common.api.internal.zada p2)
    {
        this.zaj.lock();
        if (this.zah == null) {
            this.zah = new java.util.HashSet();
        }
        this.zah.add(p2);
        this.zaj.unlock();
        return;
    }

    public final void zap(com.google.android.gms.common.api.internal.zada p3)
    {
        this.zaj.lock();
        java.util.concurrent.locks.Lock v0_3 = this.zah;
        if (v0_3 != null) {
            if (v0_3.remove(p3)) {
                this.zaj.lock();
                try {
                    com.google.android.gms.common.api.internal.zaca v3_1 = this.zah;
                } catch (com.google.android.gms.common.api.internal.zaca v3_3) {
                    this.zaj.unlock();
                    throw v3_3;
                }
                if (v3_1 != null) {
                    com.google.android.gms.common.api.internal.zaca v3_2 = v3_1.isEmpty();
                    this.zaj.unlock();
                    if (v3_2 == null) {
                        this.zaj.unlock();
                        return;
                    }
                } else {
                    this.zaj.unlock();
                }
                com.google.android.gms.common.api.internal.zaca v3_5 = this.zal;
                if (v3_5 != null) {
                    v3_5.zat();
                }
            } else {
                android.util.Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            }
        } else {
            android.util.Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
        }
        this.zaj.unlock();
        return;
    }
}
