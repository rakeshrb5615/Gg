package com.google.android.gms.common.api.internal;
final class zaaa implements com.google.android.gms.common.api.internal.zaca {
    private final android.content.Context zaa;
    private final com.google.android.gms.common.api.internal.zabe zab;
    private final android.os.Looper zac;
    private final com.google.android.gms.common.api.internal.zabi zad;
    private final com.google.android.gms.common.api.internal.zabi zae;
    private final java.util.Map zaf;
    private final java.util.Set zag;
    private final com.google.android.gms.common.api.Api$Client zah;
    private android.os.Bundle zai;
    private com.google.android.gms.common.ConnectionResult zaj;
    private com.google.android.gms.common.ConnectionResult zak;
    private boolean zal;
    private final java.util.concurrent.locks.Lock zam;
    private int zan;

    private zaaa(android.content.Context p15, com.google.android.gms.common.api.internal.zabe p16, java.util.concurrent.locks.Lock p17, android.os.Looper p18, com.google.android.gms.common.GoogleApiAvailabilityLight p19, java.util.Map p20, java.util.Map p21, com.google.android.gms.common.internal.ClientSettings p22, com.google.android.gms.common.api.Api$AbstractClientBuilder p23, com.google.android.gms.common.api.Api$Client p24, java.util.ArrayList p25, java.util.ArrayList p26, java.util.Map p27, java.util.Map p28)
    {
        this.zag = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
        this.zaj = 0;
        this.zak = 0;
        this.zal = 0;
        this.zan = 0;
        this.zaa = p15;
        this.zab = p16;
        this.zam = p17;
        this.zac = p18;
        this.zah = p24;
        this.zad = new com.google.android.gms.common.api.internal.zabi(p15, p16, p17, p18, p19, p21, 0, p28, 0, p26, new com.google.android.gms.common.api.internal.zax(this, 0));
        this.zae = new com.google.android.gms.common.api.internal.zabi(p15, p16, p17, p18, p19, p20, p22, p27, p23, p25, new com.google.android.gms.common.api.internal.zaz(this, 0));
        java.util.Map v15_2 = new r.e(0);
        java.util.Iterator v0_4 = p21.keySet().iterator();
        while (v0_4.hasNext()) {
            v15_2.put(((com.google.android.gms.common.api.Api$AnyClientKey) v0_4.next()), this.zad);
        }
        java.util.Iterator v0_6 = p20.keySet().iterator();
        while (v0_6.hasNext()) {
            v15_2.put(((com.google.android.gms.common.api.Api$AnyClientKey) v0_6.next()), this.zae);
        }
        this.zaf = java.util.Collections.unmodifiableMap(v15_2);
        return;
    }

    private final void zaA(com.google.android.gms.common.ConnectionResult p3)
    {
        com.google.android.gms.common.api.internal.zabe v0_0 = this.zan;
        if (v0_0 == 1) {
            this.zaB();
        } else {
            if (v0_0 == 2) {
                this.zab.zaa(p3);
            } else {
                android.util.Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
            }
        }
        this.zan = 0;
        return;
    }

    private final void zaB()
    {
        java.util.Set v0_1 = this.zag.iterator();
        while (v0_1.hasNext()) {
            ((com.google.android.gms.common.api.internal.SignInConnectionListener) v0_1.next()).onComplete();
        }
        this.zag.clear();
        return;
    }

    private final boolean zaC()
    {
        int v0_0 = this.zak;
        if ((v0_0 == 0) || (v0_0.getErrorCode() != 4)) {
            return 0;
        } else {
            return 1;
        }
    }

    private final boolean zaD(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p2)
    {
        boolean v2_4 = ((com.google.android.gms.common.api.internal.zabi) this.zaf.get(p2.getClientKey()));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v2_4, "GoogleApiClient is not configured to use the API required for this call.");
        return v2_4.equals(this.zae);
    }

    private static boolean zaE(com.google.android.gms.common.ConnectionResult p0)
    {
        if ((p0 == 0) || (!p0.isSuccess())) {
            return 0;
        } else {
            return 1;
        }
    }

    public static bridge synthetic com.google.android.gms.common.ConnectionResult zaa(com.google.android.gms.common.api.internal.zaaa p0)
    {
        return p0.zak;
    }

    public static com.google.android.gms.common.api.internal.zaaa zag(android.content.Context p15, com.google.android.gms.common.api.internal.zabe p16, java.util.concurrent.locks.Lock p17, android.os.Looper p18, com.google.android.gms.common.GoogleApiAvailabilityLight p19, java.util.Map p20, com.google.android.gms.common.internal.ClientSettings p21, java.util.Map p22, com.google.android.gms.common.api.Api$AbstractClientBuilder p23, java.util.ArrayList p24)
    {
        int v1_0 = 0;
        r.e v6_1 = new r.e(0);
        r.e v7_1 = new r.e(0);
        com.google.android.gms.common.api.internal.zabe v2_7 = p20.entrySet().iterator();
        com.google.android.gms.common.api.Api$Client v10 = 0;
        while (v2_7.hasNext()) {
            java.util.concurrent.locks.Lock v3_14 = ((java.util.Map$Entry) v2_7.next());
            com.google.android.gms.common.GoogleApiAvailabilityLight v5_3 = ((com.google.android.gms.common.api.Api$Client) v3_14.getValue());
            if (1 == v5_3.providesSignIn()) {
                v10 = v5_3;
            }
            if (!v5_3.requiresSignIn()) {
                v7_1.put(((com.google.android.gms.common.api.Api$AnyClientKey) v3_14.getKey()), v5_3);
            } else {
                v6_1.put(((com.google.android.gms.common.api.Api$AnyClientKey) v3_14.getKey()), v5_3);
            }
        }
        com.google.android.gms.common.internal.Preconditions.checkState((v6_1.isEmpty() ^ 1), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        r.e v13_1 = new r.e(0);
        r.e v14_1 = new r.e(0);
        com.google.android.gms.common.api.internal.zabe v2_3 = p22.keySet().iterator();
        while (v2_3.hasNext()) {
            java.util.concurrent.locks.Lock v3_12 = ((com.google.android.gms.common.api.Api) v2_3.next());
            boolean v4_7 = v3_12.zab();
            if (!v6_1.containsKey(v4_7)) {
                if (!v7_1.containsKey(v4_7)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                } else {
                    v14_1.put(v3_12, ((Boolean) p22.get(v3_12)));
                }
            } else {
                v13_1.put(v3_12, ((Boolean) p22.get(v3_12)));
            }
        }
        java.util.ArrayList v11_1 = new java.util.ArrayList();
        java.util.ArrayList v12_1 = new java.util.ArrayList();
        String v0_1 = p24.size();
        while (v1_0 < v0_1) {
            java.util.concurrent.locks.Lock v3_10 = ((com.google.android.gms.common.api.internal.zat) p24.get(v1_0));
            if (!v13_1.containsKey(v3_10.zaa)) {
                if (!v14_1.containsKey(v3_10.zaa)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                } else {
                    v12_1.add(v3_10);
                }
            } else {
                v11_1.add(v3_10);
            }
            v1_0++;
        }
        return new com.google.android.gms.common.api.internal.zaaa(p15, p16, p17, p18, p19, v6_1, v7_1, p21, p23, v10, v11_1, v12_1, v13_1, v14_1);
    }

    public static bridge synthetic com.google.android.gms.common.api.internal.zabi zah(com.google.android.gms.common.api.internal.zaaa p0)
    {
        return p0.zad;
    }

    public static bridge synthetic com.google.android.gms.common.api.internal.zabi zai(com.google.android.gms.common.api.internal.zaaa p0)
    {
        return p0.zae;
    }

    public static bridge synthetic java.util.concurrent.locks.Lock zaj(com.google.android.gms.common.api.internal.zaaa p0)
    {
        return p0.zam;
    }

    public static bridge synthetic void zak(com.google.android.gms.common.api.internal.zaaa p0, com.google.android.gms.common.ConnectionResult p1)
    {
        p0.zaj = p1;
        return;
    }

    public static bridge synthetic void zal(com.google.android.gms.common.api.internal.zaaa p0, com.google.android.gms.common.ConnectionResult p1)
    {
        p0.zak = p1;
        return;
    }

    public static bridge synthetic void zam(com.google.android.gms.common.api.internal.zaaa p0, boolean p1)
    {
        p0.zal = p1;
        return;
    }

    public static bridge synthetic void zan(com.google.android.gms.common.api.internal.zaaa p1, int p2, boolean p3)
    {
        p1.zab.zac(p2, p3);
        p1.zak = 0;
        p1.zaj = 0;
        return;
    }

    public static bridge synthetic void zao(com.google.android.gms.common.api.internal.zaaa p1, android.os.Bundle p2)
    {
        android.os.Bundle v0 = p1.zai;
        if (v0 != null) {
            if (p2 != null) {
                v0.putAll(p2);
            }
            return;
        } else {
            p1.zai = p2;
            return;
        }
    }

    public static bridge synthetic void zap(com.google.android.gms.common.api.internal.zaaa p4)
    {
        if (!com.google.android.gms.common.api.internal.zaaa.zaE(p4.zaj)) {
            if ((p4.zaj != null) && (com.google.android.gms.common.api.internal.zaaa.zaE(p4.zak))) {
                p4.zae.zar();
                p4.zaA(((com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4.zaj)));
                return;
            } else {
                android.os.Bundle v0_5 = p4.zaj;
                if (v0_5 != null) {
                    android.os.Bundle v1_0 = p4.zak;
                    if (v1_0 != null) {
                        if (p4.zae.zaf < p4.zad.zaf) {
                            v0_5 = v1_0;
                        }
                        p4.zaA(v0_5);
                    }
                }
            }
        } else {
            if ((!com.google.android.gms.common.api.internal.zaaa.zaE(p4.zak)) && (!p4.zaC())) {
                android.os.Bundle v0_10 = p4.zak;
                if (v0_10 != null) {
                    if (p4.zan != 1) {
                        p4.zaA(v0_10).zad.zar();
                        return;
                    } else {
                        p4.zaB();
                        return;
                    }
                }
            } else {
                android.os.Bundle v0_12 = p4.zan;
                if (v0_12 == 1) {
                    p4 = p4.zaB();
                } else {
                    if (v0_12 == 2) {
                        ((com.google.android.gms.common.api.internal.zabe) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4.zab)).zab(p4.zai);
                    } else {
                        android.util.Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    }
                }
                p4.zan = 0;
                return;
            }
        }
        return;
    }

    public static bridge synthetic boolean zav(com.google.android.gms.common.api.internal.zaaa p0)
    {
        return p0.zal;
    }

    private final android.app.PendingIntent zaz()
    {
        android.app.PendingIntent v0_0 = this.zah;
        if (v0_0 != null) {
            return android.app.PendingIntent.getActivity(this.zaa, System.identityHashCode(this.zab), v0_0.getSignInIntent(), (com.google.android.gms.internal.base.zap.zaa | 134217728));
        } else {
            return 0;
        }
    }

    public final com.google.android.gms.common.ConnectionResult zab()
    {
        throw new UnsupportedOperationException();
    }

    public final com.google.android.gms.common.ConnectionResult zac(long p1, java.util.concurrent.TimeUnit p3)
    {
        throw new UnsupportedOperationException();
    }

    public final com.google.android.gms.common.ConnectionResult zad(com.google.android.gms.common.api.Api p3)
    {
        if (!com.google.android.gms.common.internal.Objects.equal(this.zaf.get(p3.zab()), this.zae)) {
            return this.zad.zad(p3);
        } else {
            if (!this.zaC()) {
                return this.zae.zad(p3);
            } else {
                return new com.google.android.gms.common.ConnectionResult(4, this.zaz());
            }
        }
    }

    public final com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl zae(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p5)
    {
        if (!this.zaD(p5)) {
            this.zad.zae(p5);
            return p5;
        } else {
            if (!this.zaC()) {
                this.zae.zae(p5);
                return p5;
            } else {
                p5.setFailedResult(new com.google.android.gms.common.api.Status(4, 0, this.zaz()));
                return p5;
            }
        }
    }

    public final com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl zaf(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p5)
    {
        if (!this.zaD(p5)) {
            return this.zad.zaf(p5);
        } else {
            if (!this.zaC()) {
                return this.zae.zaf(p5);
            } else {
                p5.setFailedResult(new com.google.android.gms.common.api.Status(4, 0, this.zaz()));
                return p5;
            }
        }
    }

    public final void zaq()
    {
        this.zan = 2;
        this.zal = 0;
        this.zak = 0;
        this.zaj = 0;
        this.zad.zaq();
        this.zae.zaq();
        return;
    }

    public final void zar()
    {
        this.zak = 0;
        this.zaj = 0;
        this.zan = 0;
        this.zad.zar();
        this.zae.zar();
        this.zaB();
        return;
    }

    public final void zas(String p5, java.io.FileDescriptor p6, java.io.PrintWriter p7, String[] p8)
    {
        p7.append(p5).append("authClient").println(":");
        this.zae.zas(String.valueOf(p5).concat("  "), p6, p7, p8);
        p7.append(p5).append("anonClient").println(":");
        this.zad.zas(String.valueOf(p5).concat("  "), p6, p7, p8);
        return;
    }

    public final void zat()
    {
        this.zad.zat();
        this.zae.zat();
        return;
    }

    public final void zau()
    {
        this.zam.lock();
        java.util.concurrent.locks.Lock v0_5 = this.zax();
        this.zae.zar();
        this.zak = new com.google.android.gms.common.ConnectionResult(4);
        if (v0_5 == null) {
            this.zaB();
        } else {
            new com.google.android.gms.internal.base.zau(this.zac).post(new com.google.android.gms.common.api.internal.zav(this));
        }
        this.zam.unlock();
        return;
    }

    public final boolean zaw()
    {
        this.zam.lock();
        try {
            int v1_1 = 0;
        } catch (int v0_2) {
            this.zam.unlock();
            throw v0_2;
        }
        if ((this.zad.zaw()) && ((this.zae.zaw()) || ((this.zaC()) || (this.zan == 1)))) {
            v1_1 = 1;
        }
        this.zam.unlock();
        return v1_1;
    }

    public final boolean zax()
    {
        this.zam.lock();
        try {
            int v0_1;
            if (this.zan != 2) {
                v0_1 = 0;
            } else {
                v0_1 = 1;
            }
        } catch (int v0_3) {
            this.zam.unlock();
            throw v0_3;
        }
        this.zam.unlock();
        return v0_1;
    }

    public final boolean zay(com.google.android.gms.common.api.internal.SignInConnectionListener p3)
    {
        this.zam.lock();
        int v1 = 0;
        if (this.zax()) {
            if (!this.zae.zaw()) {
                this.zag.add(p3);
                v1 = 1;
                if (this.zan == 0) {
                    this.zan = 1;
                }
                this.zak = 0;
                this.zae.zaq();
            }
        } else {
            if (this.zaw()) {
            }
        }
        this.zam.unlock();
        return v1;
    }
}
