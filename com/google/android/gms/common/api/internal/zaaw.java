package com.google.android.gms.common.api.internal;
public final class zaaw implements com.google.android.gms.common.api.internal.zabf {
    private final com.google.android.gms.common.api.internal.zabi zaa;
    private final java.util.concurrent.locks.Lock zab;
    private final android.content.Context zac;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zad;
    private com.google.android.gms.common.ConnectionResult zae;
    private int zaf;
    private int zag;
    private int zah;
    private final android.os.Bundle zai;
    private final java.util.Set zaj;
    private com.google.android.gms.signin.zae zak;
    private boolean zal;
    private boolean zam;
    private boolean zan;
    private com.google.android.gms.common.internal.IAccountAccessor zao;
    private boolean zap;
    private boolean zaq;
    private final com.google.android.gms.common.internal.ClientSettings zar;
    private final java.util.Map zas;
    private final com.google.android.gms.common.api.Api$AbstractClientBuilder zat;
    private final java.util.ArrayList zau;

    public zaaw(com.google.android.gms.common.api.internal.zabi p2, com.google.android.gms.common.internal.ClientSettings p3, java.util.Map p4, com.google.android.gms.common.GoogleApiAvailabilityLight p5, com.google.android.gms.common.api.Api$AbstractClientBuilder p6, java.util.concurrent.locks.Lock p7, android.content.Context p8)
    {
        this.zag = 0;
        this.zai = new android.os.Bundle();
        this.zaj = new java.util.HashSet();
        this.zau = new java.util.ArrayList();
        this.zaa = p2;
        this.zar = p3;
        this.zas = p4;
        this.zad = p5;
        this.zat = p6;
        this.zab = p7;
        this.zac = p8;
        return;
    }

    private final void zaA()
    {
        this.zam = 0;
        this.zaa.zag.zad = java.util.Collections.EMPTY_SET;
        java.util.Iterator v0_4 = this.zaj.iterator();
        while (v0_4.hasNext()) {
            com.google.android.gms.common.api.Api$AnyClientKey v1_2 = ((com.google.android.gms.common.api.Api$AnyClientKey) v0_4.next());
            if (!this.zaa.zab.containsKey(v1_2)) {
                this.zaa.zab.put(v1_2, new com.google.android.gms.common.ConnectionResult(17, 0));
            }
        }
        return;
    }

    private final void zaB(boolean p3)
    {
        com.google.android.gms.signin.zae v0 = this.zak;
        if (v0 != null) {
            if ((v0.isConnected()) && (p3 != 0)) {
                v0.zaa();
            }
            v0.disconnect();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zar);
            this.zao = 0;
        }
        return;
    }

    private final void zaC()
    {
        this.zaa.zai();
        com.google.android.gms.common.api.internal.zabj.zaa().execute(new com.google.android.gms.common.api.internal.zaak(this));
        android.os.Bundle v0_10 = this.zak;
        if (v0_10 != null) {
            if (this.zap) {
                v0_10.zac(((com.google.android.gms.common.internal.IAccountAccessor) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zao)), this.zaq);
            }
            this.zaB(0);
        }
        android.os.Bundle v0_5 = this.zaa.zab.keySet().iterator();
        while (v0_5.hasNext()) {
            ((com.google.android.gms.common.api.Api$Client) com.google.android.gms.common.internal.Preconditions.checkNotNull(((com.google.android.gms.common.api.Api$Client) this.zaa.zaa.get(((com.google.android.gms.common.api.Api$AnyClientKey) v0_5.next()))))).disconnect();
        }
        android.os.Bundle v0_9;
        if (!this.zai.isEmpty()) {
            v0_9 = this.zai;
        } else {
            v0_9 = 0;
        }
        this.zaa.zah.zab(v0_9);
        return;
    }

    private final void zaD(com.google.android.gms.common.ConnectionResult p2)
    {
        this.zaz();
        this.zaB((p2.hasResolution() ^ 1));
        this.zaa.zak(p2);
        this.zaa.zah.zaa(p2);
        return;
    }

    private final void zaE(com.google.android.gms.common.ConnectionResult p3, com.google.android.gms.common.api.Api p4, boolean p5)
    {
        int v0_1 = p4.zac().getPriority();
        if (((p5 == null) || ((p3.hasResolution()) || (this.zad.getErrorResolutionIntent(p3.getErrorCode()) != null))) && ((this.zae == null) || (v0_1 < this.zaf))) {
            this.zae = p3;
            this.zaf = v0_1;
        }
        this.zaa.zab.put(p4.zab(), p3);
        return;
    }

    private final void zaF()
    {
        if ((this.zah == 0) && ((!this.zam) || (this.zan))) {
            java.util.concurrent.Future v0_5 = new java.util.ArrayList();
            this.zag = 1;
            this.zah = this.zaa.zaa.size();
            java.util.ArrayList v1_6 = this.zaa.zaa.keySet().iterator();
            while (v1_6.hasNext()) {
                java.util.concurrent.ExecutorService v2_3 = ((com.google.android.gms.common.api.Api$AnyClientKey) v1_6.next());
                if (!this.zaa.zab.containsKey(v2_3)) {
                    v0_5.add(((com.google.android.gms.common.api.Api$Client) this.zaa.zaa.get(v2_3)));
                } else {
                    if (this.zaH()) {
                        this.zaC();
                    }
                }
            }
            if (!v0_5.isEmpty()) {
                this.zau.add(com.google.android.gms.common.api.internal.zabj.zaa().submit(new com.google.android.gms.common.api.internal.zaap(this, v0_5)));
            }
        }
        return;
    }

    private final boolean zaG(int p5)
    {
        if (this.zag == p5) {
            return 1;
        } else {
            android.util.Log.w("GACConnecting", this.zaa.zag.zaf());
            android.util.Log.w("GACConnecting", "Unexpected callback in ".concat(this.toString()));
            int v0_3 = this.zah;
            String v2_2 = new StringBuilder("mRemainingConnections=");
            v2_2.append(v0_3);
            android.util.Log.w("GACConnecting", v2_2.toString());
            int v0_7 = v1.a.q("GoogleApiClient connecting is in step ", com.google.android.gms.common.api.internal.zaaw.zaJ(this.zag), " but received callback for step ");
            v0_7.append(com.google.android.gms.common.api.internal.zaaw.zaJ(p5));
            android.util.Log.e("GACConnecting", v0_7.toString(), new Exception());
            this.zaD(new com.google.android.gms.common.ConnectionResult(8, 0));
            return 0;
        }
    }

    private final boolean zaH()
    {
        int v0_1 = (this.zah - 1);
        this.zah = v0_1;
        if (v0_1 <= 0) {
            if (v0_1 >= 0) {
                int v0_9 = this.zae;
                if (v0_9 == 0) {
                    return 1;
                } else {
                    this.zaa.zaf = this.zaf;
                    this.zaD(v0_9);
                    return 0;
                }
            } else {
                android.util.Log.w("GACConnecting", this.zaa.zag.zaf());
                android.util.Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
                this.zaD(new com.google.android.gms.common.ConnectionResult(8, 0));
                return 0;
            }
        } else {
            return 0;
        }
    }

    private final boolean zaI(com.google.android.gms.common.ConnectionResult p2)
    {
        if ((!this.zal) || (p2.hasResolution())) {
            return 0;
        } else {
            return 1;
        }
    }

    private static final String zaJ(int p0)
    {
        if (p0 == null) {
            return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        } else {
            return "STEP_GETTING_REMOTE_SERVICE";
        }
    }

    public static bridge synthetic android.content.Context zac(com.google.android.gms.common.api.internal.zaaw p0)
    {
        return p0.zac;
    }

    public static bridge synthetic com.google.android.gms.common.GoogleApiAvailabilityLight zaf(com.google.android.gms.common.api.internal.zaaw p0)
    {
        return p0.zad;
    }

    public static bridge synthetic com.google.android.gms.common.api.internal.zabi zak(com.google.android.gms.common.api.internal.zaaw p0)
    {
        return p0.zaa;
    }

    public static bridge synthetic com.google.android.gms.common.internal.ClientSettings zal(com.google.android.gms.common.api.internal.zaaw p0)
    {
        return p0.zar;
    }

    public static bridge synthetic com.google.android.gms.common.internal.IAccountAccessor zam(com.google.android.gms.common.api.internal.zaaw p0)
    {
        return p0.zao;
    }

    public static bridge synthetic com.google.android.gms.signin.zae zan(com.google.android.gms.common.api.internal.zaaw p0)
    {
        return p0.zak;
    }

    public static bridge synthetic java.util.Set zao(com.google.android.gms.common.api.internal.zaaw p6)
    {
        java.util.Map v0_0 = p6.zar;
        if (v0_0 != null) {
            java.util.HashSet v1_1 = new java.util.HashSet(v0_0.getRequiredScopes());
            java.util.Map v0_3 = p6.zar.zad();
            java.util.Iterator v2_1 = v0_3.keySet().iterator();
            while (v2_1.hasNext()) {
                java.util.Set v3_2 = ((com.google.android.gms.common.api.Api) v2_1.next());
                if (!p6.zaa.zab.containsKey(v3_2.zab())) {
                    v1_1.addAll(((com.google.android.gms.common.internal.zab) v0_3.get(v3_2)).zaa);
                }
            }
            return v1_1;
        } else {
            return java.util.Collections.EMPTY_SET;
        }
    }

    public static bridge synthetic java.util.concurrent.locks.Lock zap(com.google.android.gms.common.api.internal.zaaw p0)
    {
        return p0.zab;
    }

    public static bridge synthetic void zaq(com.google.android.gms.common.api.internal.zaaw p0)
    {
        p0.zaA();
        return;
    }

    public static bridge synthetic void zar(com.google.android.gms.common.api.internal.zaaw p4, com.google.android.gms.signin.internal.zak p5)
    {
        if (p4.zaG(0)) {
            boolean v0_8 = p5.zaa();
            if (!v0_8.isSuccess()) {
                if (!p4.zaI(v0_8)) {
                    p4.zaD(v0_8);
                    return;
                } else {
                    p4.zaA().zaF();
                    return;
                }
            } else {
                boolean v5_4 = ((com.google.android.gms.common.internal.zav) com.google.android.gms.common.internal.Preconditions.checkNotNull(p5.zab()));
                boolean v0_2 = v5_4.zaa();
                if (v0_2.isSuccess()) {
                    p4.zan = 1;
                    p4.zao = ((com.google.android.gms.common.internal.IAccountAccessor) com.google.android.gms.common.internal.Preconditions.checkNotNull(v5_4.zab()));
                    p4.zap = v5_4.zac();
                    p4.zaq = v5_4.zad();
                    p4.zaF();
                    return;
                } else {
                    android.util.Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(v0_2)), new Exception());
                    p4.zaD(v0_2);
                    return;
                }
            }
        } else {
            return;
        }
    }

    public static bridge synthetic void zas(com.google.android.gms.common.api.internal.zaaw p0, com.google.android.gms.common.ConnectionResult p1)
    {
        p0.zaD(p1);
        return;
    }

    public static bridge synthetic void zat(com.google.android.gms.common.api.internal.zaaw p0, com.google.android.gms.common.ConnectionResult p1, com.google.android.gms.common.api.Api p2, boolean p3)
    {
        p0.zaE(p1, p2, p3);
        return;
    }

    public static bridge synthetic void zau(com.google.android.gms.common.api.internal.zaaw p0)
    {
        p0.zaF();
        return;
    }

    public static bridge synthetic boolean zav(com.google.android.gms.common.api.internal.zaaw p0)
    {
        return p0.zam;
    }

    public static bridge synthetic boolean zaw(com.google.android.gms.common.api.internal.zaaw p0, int p1)
    {
        return p0.zaG(0);
    }

    public static bridge synthetic boolean zax(com.google.android.gms.common.api.internal.zaaw p0)
    {
        return p0.zaH();
    }

    public static bridge synthetic boolean zay(com.google.android.gms.common.api.internal.zaaw p0, com.google.android.gms.common.ConnectionResult p1)
    {
        return p0.zaI(p1);
    }

    private final void zaz()
    {
        java.util.ArrayList v0_0 = this.zau;
        int v1 = v0_0.size();
        int v2 = 0;
        while (v2 < v1) {
            ((java.util.concurrent.Future) v0_0.get(v2)).cancel(1);
            v2++;
        }
        this.zau.clear();
        return;
    }

    public final com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl zaa(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p2)
    {
        this.zaa.zag.zaa.add(p2);
        return p2;
    }

    public final com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl zab(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p2)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void zad()
    {
        this.zaa.zab.clear();
        this.zam = 0;
        this.zae = 0;
        this.zag = 0;
        this.zal = 1;
        this.zan = 0;
        this.zap = 0;
        java.util.HashMap v3_1 = new java.util.HashMap();
        com.google.android.gms.common.api.Api$AbstractClientBuilder v4_2 = this.zas.keySet().iterator();
        android.content.Context v5_0 = 0;
        while (v4_2.hasNext()) {
            com.google.android.gms.signin.SignInOptions v8_4;
            android.os.Looper v6_3 = ((com.google.android.gms.common.api.Api) v4_2.next());
            com.google.android.gms.common.internal.ClientSettings v7_6 = ((com.google.android.gms.common.api.Api$Client) com.google.android.gms.common.internal.Preconditions.checkNotNull(((com.google.android.gms.common.api.Api$Client) this.zaa.zaa.get(v6_3.zab()))));
            if (v6_3.zac().getPriority() != 1) {
                v8_4 = 0;
            } else {
                v8_4 = 1;
            }
            v5_0 |= v8_4;
            com.google.android.gms.signin.SignInOptions v8_8 = ((Boolean) this.zas.get(v6_3)).booleanValue();
            if (v7_6.requiresSignIn()) {
                this.zam = 1;
                if (v8_8 == null) {
                    this.zal = 0;
                } else {
                    this.zaj.add(v6_3.zab());
                }
            }
            v3_1.put(v7_6, new com.google.android.gms.common.api.internal.zaal(this, v6_3, v8_8));
        }
        if (v5_0 != null) {
            this.zam = 0;
        }
        if (this.zam) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zar);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zat);
            this.zar.zae(Integer.valueOf(System.identityHashCode(this.zaa.zag)));
            java.util.Set v9_4 = new com.google.android.gms.common.api.internal.zaat(this, 0);
            com.google.android.gms.common.internal.ClientSettings v7_0 = this.zar;
            this.zak = this.zat.buildClient(this.zac, this.zaa.zag.getLooper(), v7_0, v7_0.zaa(), v9_4, v9_4);
        }
        this.zah = this.zaa.zaa.size();
        this.zau.add(com.google.android.gms.common.api.internal.zabj.zaa().submit(new com.google.android.gms.common.api.internal.zaao(this, v3_1)));
        return;
    }

    public final void zae()
    {
        return;
    }

    public final void zag(android.os.Bundle p2)
    {
        if (this.zaG(1)) {
            if (p2) {
                this.zai.putAll(p2);
            }
            if (this.zaH()) {
                this.zaC();
            }
        }
        return;
    }

    public final void zah(com.google.android.gms.common.ConnectionResult p2, com.google.android.gms.common.api.Api p3, boolean p4)
    {
        if (this.zaG(1)) {
            this.zaE(p2, p3, p4);
            if (this.zaH()) {
                this.zaC();
            }
        }
        return;
    }

    public final void zai(int p3)
    {
        this.zaD(new com.google.android.gms.common.ConnectionResult(8, 0));
        return;
    }

    public final boolean zaj()
    {
        this.zaz();
        this.zaB(1);
        this.zaa.zak(0);
        return 1;
    }
}
