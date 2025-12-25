package com.google.android.gms.common.api.internal;
final class zabt implements java.lang.Runnable {
    final synthetic com.google.android.gms.common.ConnectionResult zaa;
    final synthetic com.google.android.gms.common.api.internal.zabu zab;

    public zabt(com.google.android.gms.common.api.internal.zabu p1, com.google.android.gms.common.ConnectionResult p2)
    {
        this.zab = p1;
        this.zaa = p2;
        return;
    }

    public final void run()
    {
        com.google.android.gms.common.api.internal.zabu v0_0 = this.zab;
        com.google.android.gms.common.api.internal.zabu v0_4 = ((com.google.android.gms.common.api.internal.zabq) com.google.android.gms.common.api.internal.GoogleApiManager.zar(v0_0.zaa).get(com.google.android.gms.common.api.internal.zabu.zab(v0_0)));
        if (v0_4 != null) {
            if (!this.zaa.isSuccess()) {
                v0_4.zar(this.zaa, 0);
                return;
            } else {
                com.google.android.gms.common.api.internal.zabu.zac(this.zab, 1);
                if (!com.google.android.gms.common.api.internal.zabu.zaa(this.zab).requiresSignIn()) {
                    try {
                        com.google.android.gms.common.ConnectionResult v1_8 = this.zab;
                        com.google.android.gms.common.api.internal.zabu.zaa(v1_8).getRemoteService(0, com.google.android.gms.common.api.internal.zabu.zaa(v1_8).getScopesForConnectionlessNonSignIn());
                        return;
                    } catch (com.google.android.gms.common.ConnectionResult v1_12) {
                        android.util.Log.e("GoogleApiManager", "Failed to get service from broker. ", v1_12);
                        com.google.android.gms.common.api.internal.zabu.zaa(this.zab).disconnect("Failed to get service from broker.");
                        v0_4.zar(new com.google.android.gms.common.ConnectionResult(10), 0);
                        return;
                    }
                } else {
                    com.google.android.gms.common.api.internal.zabu.zad(this.zab);
                    return;
                }
            }
        } else {
            return;
        }
    }
}
