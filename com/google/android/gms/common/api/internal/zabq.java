package com.google.android.gms.common.api.internal;
public final class zabq implements com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener, com.google.android.gms.common.api.internal.zau {
    final synthetic com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final java.util.Queue zab;
    private final com.google.android.gms.common.api.Api$Client zac;
    private final com.google.android.gms.common.api.internal.ApiKey zad;
    private final com.google.android.gms.common.api.internal.zaad zae;
    private final java.util.Set zaf;
    private final java.util.Map zag;
    private final int zah;
    private final com.google.android.gms.common.api.internal.zact zai;
    private boolean zaj;
    private final java.util.List zak;
    private com.google.android.gms.common.ConnectionResult zal;
    private int zam;

    public zabq(com.google.android.gms.common.api.internal.GoogleApiManager p4, com.google.android.gms.common.api.GoogleApi p5)
    {
        this.zaa = p4;
        this.zab = new java.util.LinkedList();
        this.zaf = new java.util.HashSet();
        this.zag = new java.util.HashMap();
        this.zak = new java.util.ArrayList();
        this.zal = 0;
        this.zam = 0;
        boolean v1_3 = p5.zab(com.google.android.gms.common.api.internal.GoogleApiManager.zad(p4).getLooper(), this);
        this.zac = v1_3;
        this.zad = p5.getApiKey();
        this.zae = new com.google.android.gms.common.api.internal.zaad();
        this.zah = p5.zaa();
        if (!v1_3.requiresSignIn()) {
            this.zai = 0;
            return;
        } else {
            this.zai = p5.zac(com.google.android.gms.common.api.internal.GoogleApiManager.zac(p4), com.google.android.gms.common.api.internal.GoogleApiManager.zad(p4));
            return;
        }
    }

    private final com.google.android.gms.common.Feature zaC(com.google.android.gms.common.Feature[] p10)
    {
        if ((p10 != null) && (p10.length != 0)) {
            int v1_3 = this.zac.getAvailableFeatures();
            int v2 = 0;
            if (v1_3 == 0) {
                v1_3 = new com.google.android.gms.common.Feature[0];
            }
            r.e v3_1 = new r.e(v1_3.length);
            com.google.android.gms.common.Feature v4_1 = 0;
            while (v4_1 < v1_3.length) {
                long v5_6 = v1_3[v4_1];
                v3_1.put(v5_6.getName(), Long.valueOf(v5_6.getVersion()));
                v4_1++;
            }
            while (v2 < p10.length) {
                com.google.android.gms.common.Feature v4_2 = p10[v2];
                long v5_3 = ((Long) v3_1.get(v4_2.getName()));
                if ((v5_3 != 0) && (v5_3.longValue() >= v4_2.getVersion())) {
                    v2++;
                } else {
                    return v4_2;
                }
            }
        }
        return 0;
    }

    private final void zaD(com.google.android.gms.common.ConnectionResult p5)
    {
        java.util.Iterator v0_1 = this.zaf.iterator();
        while (v0_1.hasNext()) {
            int v2_2;
            com.google.android.gms.common.api.internal.zal v1_1 = ((com.google.android.gms.common.api.internal.zal) v0_1.next());
            if (!com.google.android.gms.common.internal.Objects.equal(p5, com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS)) {
                v2_2 = 0;
            } else {
                v2_2 = this.zac.getEndpointPackageName();
            }
            v1_1.zac(this.zad, p5, v2_2);
        }
        this.zaf.clear();
        return;
    }

    private final void zaE(com.google.android.gms.common.api.Status p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa));
        this.zaF(p3, 0, 0);
        return;
    }

    private final void zaF(com.google.android.gms.common.api.Status p5, Exception p6, boolean p7)
    {
        int v2_1;
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa));
        java.util.Iterator v0_1 = 1;
        if (p5 == null) {
            v2_1 = 1;
        } else {
            v2_1 = 0;
        }
        if (p6 != null) {
            v0_1 = 0;
        }
        if (v2_1 == v0_1) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        } else {
            java.util.Iterator v0_3 = this.zab.iterator();
            while (v0_3.hasNext()) {
                com.google.android.gms.common.api.internal.zai v1_2 = ((com.google.android.gms.common.api.internal.zai) v0_3.next());
                if ((!p7) || (v1_2.zac == 2)) {
                    if (p5 == null) {
                        v1_2.zae(p6);
                    } else {
                        v1_2.zad(p5);
                    }
                    v0_3.remove();
                }
            }
            return;
        }
    }

    private final void zaG()
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList(this.zab);
        int v1_1 = v0_1.size();
        int v2 = 0;
        while (v2 < v1_1) {
            com.google.android.gms.common.api.internal.zai v3_1 = ((com.google.android.gms.common.api.internal.zai) v0_1.get(v2));
            if (!this.zac.isConnected()) {
                break;
            }
            if (this.zaM(v3_1)) {
                this.zab.remove(v3_1);
            }
            v2++;
        }
        return;
    }

    private final void zaH()
    {
        this.zan();
        this.zaD(com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS);
        this.zaL();
        com.google.android.gms.common.api.Api$Client v0_5 = this.zag.values().iterator();
        while (v0_5.hasNext()) {
            String v1_2 = ((com.google.android.gms.common.api.internal.zaci) v0_5.next());
            if (this.zaC(v1_2.zaa.getRequiredFeatures()) == null) {
                try {
                    v1_2.zaa.registerListener(this.zac, new com.google.android.gms.tasks.TaskCompletionSource());
                } catch (android.os.DeadObjectException) {
                    this.onConnectionSuspended(3);
                    this.zac.disconnect("DeadObjectException thrown while calling register listener method.");
                    break;
                } catch (android.os.RemoteException) {
                    v0_5.remove();
                }
            } else {
                v0_5.remove();
            }
        }
        this.zaG();
        this.zaJ();
        return;
    }

    private final void zaI(int p5)
    {
        this.zan();
        this.zaj = 1;
        this.zae.zae(p5, this.zac.getLastDisconnectMessage());
        Runnable v0_10 = this.zaa;
        com.google.android.gms.common.api.internal.GoogleApiManager.zad(v0_10).sendMessageDelayed(android.os.Message.obtain(com.google.android.gms.common.api.internal.GoogleApiManager.zad(v0_10), 9, this.zad), 5000);
        Runnable v0_2 = this.zaa;
        com.google.android.gms.common.api.internal.GoogleApiManager.zad(v0_2).sendMessageDelayed(android.os.Message.obtain(com.google.android.gms.common.api.internal.GoogleApiManager.zad(v0_2), 11, this.zad), 120000);
        com.google.android.gms.common.api.internal.GoogleApiManager.zal(this.zaa).zac();
        java.util.Iterator v5_8 = this.zag.values().iterator();
        while (v5_8.hasNext()) {
            ((com.google.android.gms.common.api.internal.zaci) v5_8.next()).zac.run();
        }
        return;
    }

    private final void zaJ()
    {
        com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa).removeMessages(12, this.zad);
        long v1_5 = this.zaa;
        com.google.android.gms.common.api.internal.GoogleApiManager.zad(v1_5).sendMessageDelayed(com.google.android.gms.common.api.internal.GoogleApiManager.zad(v1_5).obtainMessage(12, this.zad), com.google.android.gms.common.api.internal.GoogleApiManager.zab(this.zaa));
        return;
    }

    private final void zaK(com.google.android.gms.common.api.internal.zai p3)
    {
        p3.zag(this.zae, this.zaA());
        try {
            p3.zaf(this);
            return;
        } catch (android.os.DeadObjectException) {
            this.onConnectionSuspended(1);
            this.zac.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            return;
        }
    }

    private final void zaL()
    {
        if (this.zaj) {
            com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa).removeMessages(11, this.zad);
            com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa).removeMessages(9, this.zad);
            this.zaj = 0;
        }
        return;
    }

    private final boolean zaM(com.google.android.gms.common.api.internal.zai p8)
    {
        if ((p8 instanceof com.google.android.gms.common.api.internal.zac)) {
            android.os.Handler v2_3 = this.zaC(((com.google.android.gms.common.api.internal.zac) p8).zab(this));
            if (v2_3 != null) {
                int v8_4 = this.zac.getClass().getName();
                long v3_0 = v2_3.getName();
                int v4_0 = v2_3.getVersion();
                StringBuilder v6_1 = new StringBuilder();
                v6_1.append(v8_4);
                v6_1.append(" could not execute call because it requires feature (");
                v6_1.append(v3_0);
                v6_1.append(", ");
                v6_1.append(v4_0);
                v6_1.append(").");
                android.util.Log.w("GoogleApiManager", v6_1.toString());
                if ((!com.google.android.gms.common.api.internal.GoogleApiManager.zaC(this.zaa)) || (!((com.google.android.gms.common.api.internal.zac) p8).zaa(this))) {
                    ((com.google.android.gms.common.api.internal.zac) p8).zae(new com.google.android.gms.common.api.UnsupportedApiCallException(v2_3));
                    return 1;
                } else {
                    com.google.android.gms.common.api.internal.GoogleApiManager v0_4 = new com.google.android.gms.common.api.internal.zabs(this.zad, v2_3, 0);
                    int v8_16 = this.zak.indexOf(v0_4);
                    if (v8_16 < 0) {
                        this.zak.add(v0_4);
                        int v8_18 = this.zaa;
                        com.google.android.gms.common.api.internal.GoogleApiManager.zad(v8_18).sendMessageDelayed(android.os.Message.obtain(com.google.android.gms.common.api.internal.GoogleApiManager.zad(v8_18), 15, v0_4), 5000);
                        int v8_21 = this.zaa;
                        com.google.android.gms.common.api.internal.GoogleApiManager.zad(v8_21).sendMessageDelayed(android.os.Message.obtain(com.google.android.gms.common.api.internal.GoogleApiManager.zad(v8_21), 16, v0_4), 120000);
                        int v8_25 = new com.google.android.gms.common.ConnectionResult(2, 0);
                        if (!this.zaN(v8_25)) {
                            this.zaa.zaE(v8_25, this.zah);
                        }
                    } else {
                        int v8_27 = ((com.google.android.gms.common.api.internal.zabs) this.zak.get(v8_16));
                        com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa).removeMessages(15, v8_27);
                        com.google.android.gms.common.api.internal.GoogleApiManager v0_11 = this.zaa;
                        com.google.android.gms.common.api.internal.GoogleApiManager.zad(v0_11).sendMessageDelayed(android.os.Message.obtain(com.google.android.gms.common.api.internal.GoogleApiManager.zad(v0_11), 15, v8_27), 5000);
                    }
                    return 0;
                }
            } else {
                this.zaK(p8);
                return 1;
            }
        } else {
            this.zaK(p8);
            return 1;
        }
    }

    private final boolean zaN(com.google.android.gms.common.ConnectionResult p4)
    {
        com.google.android.gms.common.api.internal.GoogleApiManager.zaq();
        com.google.android.gms.common.api.internal.zaae v1_3 = this.zaa;
        if ((com.google.android.gms.common.api.internal.GoogleApiManager.zah(v1_3) == null) || (!com.google.android.gms.common.api.internal.GoogleApiManager.zas(v1_3).contains(this.zad))) {
            return 0;
        } else {
            com.google.android.gms.common.api.internal.GoogleApiManager.zah(this.zaa).zah(p4, this.zah);
            return 1;
        }
    }

    private final boolean zaO(boolean p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa));
        if ((this.zac.isConnected()) && (this.zag.isEmpty())) {
            if (!this.zae.zag()) {
                this.zac.disconnect("Timing out service connection.");
                return 1;
            } else {
                if (p2 != 0) {
                    this.zaJ();
                }
            }
        }
        return 0;
    }

    public static bridge synthetic com.google.android.gms.common.api.Api$Client zae(com.google.android.gms.common.api.internal.zabq p0)
    {
        return p0.zac;
    }

    public static bridge synthetic com.google.android.gms.common.api.internal.ApiKey zag(com.google.android.gms.common.api.internal.zabq p0)
    {
        return p0.zad;
    }

    public static bridge synthetic void zai(com.google.android.gms.common.api.internal.zabq p0, com.google.android.gms.common.api.Status p1)
    {
        p0.zaE(p1);
        return;
    }

    public static bridge synthetic void zaj(com.google.android.gms.common.api.internal.zabq p0)
    {
        p0.zaH();
        return;
    }

    public static bridge synthetic void zak(com.google.android.gms.common.api.internal.zabq p0, int p1)
    {
        p0.zaI(p1);
        return;
    }

    public static bridge synthetic void zal(com.google.android.gms.common.api.internal.zabq p1, com.google.android.gms.common.api.internal.zabs p2)
    {
        if ((p1.zak.contains(p2)) && (!p1.zaj)) {
            if (p1.zac.isConnected()) {
                p1.zaG();
            } else {
                p1.zao();
                return;
            }
        }
        return;
    }

    public static bridge synthetic void zam(com.google.android.gms.common.api.internal.zabq p5, com.google.android.gms.common.api.internal.zabs p6)
    {
        if (p5.zak.remove(p6)) {
            com.google.android.gms.common.api.internal.GoogleApiManager.zad(p5.zaa).removeMessages(15, p6);
            com.google.android.gms.common.api.internal.GoogleApiManager.zad(p5.zaa).removeMessages(16, p6);
            com.google.android.gms.common.Feature v6_1 = com.google.android.gms.common.api.internal.zabs.zaa(p6);
            java.util.ArrayList v1_2 = new java.util.ArrayList(p5.zab.size());
            int v0_6 = p5.zab.iterator();
            while (v0_6.hasNext()) {
                int v2_3 = ((com.google.android.gms.common.api.internal.zai) v0_6.next());
                if ((v2_3 instanceof com.google.android.gms.common.api.internal.zac)) {
                    com.google.android.gms.common.api.internal.zai v3_5 = ((com.google.android.gms.common.api.internal.zac) v2_3).zab(p5);
                    if ((v3_5 != null) && (com.google.android.gms.common.util.ArrayUtils.contains(v3_5, v6_1))) {
                        v1_2.add(v2_3);
                    }
                }
            }
            int v0_7 = v1_2.size();
            int v2_1 = 0;
            while (v2_1 < v0_7) {
                com.google.android.gms.common.api.internal.zai v3_1 = ((com.google.android.gms.common.api.internal.zai) v1_2.get(v2_1));
                p5.zab.remove(v3_1);
                v3_1.zae(new com.google.android.gms.common.api.UnsupportedApiCallException(v6_1));
                v2_1++;
            }
        }
        return;
    }

    public static bridge synthetic boolean zax(com.google.android.gms.common.api.internal.zabq p0)
    {
        return p0.zaj;
    }

    public static bridge synthetic boolean zay(com.google.android.gms.common.api.internal.zabq p0, boolean p1)
    {
        return p0.zaO(0);
    }

    public final void onConnected(android.os.Bundle p2)
    {
        if (android.os.Looper.myLooper() != com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa).getLooper()) {
            com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa).post(new com.google.android.gms.common.api.internal.zabm(this));
            return;
        } else {
            this.zaH();
            return;
        }
    }

    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult p2)
    {
        this.zar(p2, 0);
        return;
    }

    public final void onConnectionSuspended(int p3)
    {
        if (android.os.Looper.myLooper() != com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa).getLooper()) {
            com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa).post(new com.google.android.gms.common.api.internal.zabn(this, p3));
            return;
        } else {
            this.zaI(p3);
            return;
        }
    }

    public final boolean zaA()
    {
        return this.zac.requiresSignIn();
    }

    public final boolean zaB()
    {
        return this.zaO(1);
    }

    public final void zaa(com.google.android.gms.common.ConnectionResult p1, com.google.android.gms.common.api.Api p2, boolean p3)
    {
        throw 0;
    }

    public final int zab()
    {
        return this.zah;
    }

    public final int zac()
    {
        return this.zam;
    }

    public final com.google.android.gms.common.ConnectionResult zad()
    {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa));
        return this.zal;
    }

    public final com.google.android.gms.common.api.Api$Client zaf()
    {
        return this.zac;
    }

    public final java.util.Map zah()
    {
        return this.zag;
    }

    public final void zan()
    {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa));
        this.zal = 0;
        return;
    }

    public final void zao()
    {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa));
        if ((!this.zac.isConnected()) && (!this.zac.isConnecting())) {
            try {
                com.google.android.gms.common.ConnectionResult v2_0 = this.zaa;
                com.google.android.gms.common.ConnectionResult v2_2 = com.google.android.gms.common.api.internal.GoogleApiManager.zal(v2_0).zab(com.google.android.gms.common.api.internal.GoogleApiManager.zac(v2_0), this.zac);
            } catch (SecurityException v0_1) {
                this.zar(new com.google.android.gms.common.ConnectionResult(10), v0_1);
            }
            if (v2_2 == null) {
                com.google.android.gms.common.ConnectionResult v2_5 = this.zac;
                com.google.android.gms.common.api.internal.zabu v4_2 = new com.google.android.gms.common.api.internal.zabu(this.zaa, v2_5, this.zad);
                if (v2_5.requiresSignIn()) {
                    ((com.google.android.gms.common.api.internal.zact) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zai)).zae(v4_2);
                }
                try {
                    this.zac.connect(v4_2);
                    return;
                } catch (SecurityException v0_8) {
                    this.zar(new com.google.android.gms.common.ConnectionResult(10), v0_8);
                    return;
                }
            } else {
                com.google.android.gms.common.api.internal.ApiKey v3_3 = new com.google.android.gms.common.ConnectionResult(v2_2, 0);
                String v5_2 = this.zac.getClass().getName();
                String v6 = v3_3.toString();
                StringBuilder v7_1 = new StringBuilder("The service for ");
                v7_1.append(v5_2);
                v7_1.append(" is not available: ");
                v7_1.append(v6);
                android.util.Log.w("GoogleApiManager", v7_1.toString());
                this.zar(v3_3, 0);
                return;
            }
        }
        return;
    }

    public final void zap(com.google.android.gms.common.api.internal.zai p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa));
        if (!this.zac.isConnected()) {
            this.zab.add(p2);
            com.google.android.gms.common.ConnectionResult v2_1 = this.zal;
            if ((v2_1 == null) || (!v2_1.hasResolution())) {
                this.zao();
                return;
            } else {
                this.zar(this.zal, 0);
                return;
            }
        } else {
            if (!this.zaM(p2)) {
                this.zab.add(p2);
                return;
            } else {
                this.zaJ();
                return;
            }
        }
    }

    public final void zaq()
    {
        this.zam = (this.zam + 1);
        return;
    }

    public final void zar(com.google.android.gms.common.ConnectionResult p6, Exception p7)
    {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa));
        android.os.Handler v0_13 = this.zai;
        if (v0_13 != null) {
            v0_13.zaf();
        }
        this.zan();
        com.google.android.gms.common.api.internal.GoogleApiManager.zal(this.zaa).zac();
        this.zaD(p6);
        if (((this.zac instanceof com.google.android.gms.common.internal.service.zap)) && (p6.getErrorCode() != 24)) {
            com.google.android.gms.common.api.internal.GoogleApiManager.zat(this.zaa, 1);
            android.os.Handler v0_7 = this.zaa;
            com.google.android.gms.common.api.internal.GoogleApiManager.zad(v0_7).sendMessageDelayed(com.google.android.gms.common.api.internal.GoogleApiManager.zad(v0_7).obtainMessage(19), 300000);
        }
        if (p6.getErrorCode() != 4) {
            if (!this.zab.isEmpty()) {
                if (p7 == null) {
                    if (!com.google.android.gms.common.api.internal.GoogleApiManager.zaC(this.zaa)) {
                        this.zaE(com.google.android.gms.common.api.internal.GoogleApiManager.zag(this.zad, p6));
                        return;
                    } else {
                        this.zaF(com.google.android.gms.common.api.internal.GoogleApiManager.zag(this.zad, p6), 0, 1);
                        if ((!this.zab.isEmpty()) && ((!this.zaN(p6)) && (!this.zaa.zaE(p6, this.zah)))) {
                            if (p6.getErrorCode() == 18) {
                                this.zaj = 1;
                            }
                            if (!this.zaj) {
                                this.zaE(com.google.android.gms.common.api.internal.GoogleApiManager.zag(this.zad, p6));
                            } else {
                                com.google.android.gms.common.api.Status v6_4 = this.zaa;
                                com.google.android.gms.common.api.internal.GoogleApiManager.zad(v6_4).sendMessageDelayed(android.os.Message.obtain(com.google.android.gms.common.api.internal.GoogleApiManager.zad(v6_4), 9, this.zad), 5000);
                                return;
                            }
                        }
                        return;
                    }
                } else {
                    com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa));
                    this.zaF(0, p7, 0);
                    return;
                }
            } else {
                this.zal = p6;
                return;
            }
        } else {
            this.zaE(com.google.android.gms.common.api.internal.GoogleApiManager.zaf());
            return;
        }
    }

    public final void zas(com.google.android.gms.common.ConnectionResult p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa));
        int v0_3 = this.zac;
        String v1_3 = v0_3.getClass().getName();
        String v2 = String.valueOf(p6);
        StringBuilder v3_1 = new StringBuilder("onSignInFailed for ");
        v3_1.append(v1_3);
        v3_1.append(" with ");
        v3_1.append(v2);
        v0_3.disconnect(v3_1.toString());
        this.zar(p6, 0);
        return;
    }

    public final void zat(com.google.android.gms.common.api.internal.zal p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa));
        this.zaf.add(p2);
        return;
    }

    public final void zau()
    {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa));
        if (this.zaj) {
            this.zao();
        }
        return;
    }

    public final void zav()
    {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa));
        this.zaE(com.google.android.gms.common.api.internal.GoogleApiManager.zaa);
        this.zae.zaf();
        com.google.android.gms.common.api.internal.zabp v1_0 = 0;
        int v2_0 = new com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey[0];
        com.google.android.gms.common.api.Api$Client v0_3 = ((com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey[]) this.zag.keySet().toArray(v2_0));
        int v2_1 = v0_3.length;
        while (v1_0 < v2_1) {
            this.zap(new com.google.android.gms.common.api.internal.zah(v0_3[v1_0], new com.google.android.gms.tasks.TaskCompletionSource()));
            v1_0++;
        }
        this.zaD(new com.google.android.gms.common.ConnectionResult(4));
        if (this.zac.isConnected()) {
            this.zac.onUserSignOut(new com.google.android.gms.common.api.internal.zabp(this));
        }
        return;
    }

    public final void zaw()
    {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa));
        if (this.zaj) {
            com.google.android.gms.common.api.Api$Client v0_4;
            this.zaL();
            com.google.android.gms.common.api.Api$Client v0_9 = this.zaa;
            if (com.google.android.gms.common.api.internal.GoogleApiManager.zae(v0_9).isGooglePlayServicesAvailable(com.google.android.gms.common.api.internal.GoogleApiManager.zac(v0_9)) != 18) {
                v0_4 = new com.google.android.gms.common.api.Status(22, "API failed to connect while resuming due to an unknown error.");
            } else {
                v0_4 = new com.google.android.gms.common.api.Status(21, "Connection timed out waiting for Google Play services update to complete.");
            }
            this.zaE(v0_4);
            this.zac.disconnect("Timing out connection while resuming.");
        }
        return;
    }

    public final boolean zaz()
    {
        return this.zac.isConnected();
    }
}
