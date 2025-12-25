package com.google.android.gms.common.api.internal;
final class zaao extends com.google.android.gms.common.api.internal.zaav {
    final synthetic com.google.android.gms.common.api.internal.zaaw zaa;
    private final java.util.Map zac;

    public zaao(com.google.android.gms.common.api.internal.zaaw p2, java.util.Map p3)
    {
        this.zaa = p2;
        super(p2, 0);
        super.zac = p3;
        return;
    }

    public final void zaa()
    {
        com.google.android.gms.common.api.internal.zaaw v1_1 = new com.google.android.gms.common.internal.zal(com.google.android.gms.common.api.internal.zaaw.zaf(this.zaa));
        com.google.android.gms.signin.zae v0_7 = new java.util.ArrayList();
        com.google.android.gms.common.api.internal.zaaw v2_7 = new java.util.ArrayList();
        com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks v3_1 = this.zac.keySet().iterator();
        while (v3_1.hasNext()) {
            com.google.android.gms.common.api.internal.zabi v4_1 = ((com.google.android.gms.common.api.Api$Client) v3_1.next());
            if ((!v4_1.requiresGooglePlayServices()) || (com.google.android.gms.common.api.internal.zaal.zaa(((com.google.android.gms.common.api.internal.zaal) this.zac.get(v4_1))))) {
                v2_7.add(v4_1);
            } else {
                v0_7.add(v4_1);
            }
        }
        com.google.android.gms.common.api.internal.zabi v4_3 = 0;
        com.google.android.gms.common.api.internal.zaan v5_5 = -1;
        if (!v0_7.isEmpty()) {
            com.google.android.gms.common.api.internal.zaaw v2_0 = v0_7.size();
            while (v4_3 < v2_0) {
                v5_5 = v1_1.zab(com.google.android.gms.common.api.internal.zaaw.zac(this.zaa), ((com.google.android.gms.common.api.Api$Client) v0_7.get(v4_3)));
                v4_3++;
                if (v5_5 != null) {
                    break;
                }
            }
        } else {
            com.google.android.gms.signin.zae v0_2 = v2_7.size();
            while (v4_3 < v0_2) {
                v5_5 = v1_1.zab(com.google.android.gms.common.api.internal.zaaw.zac(this.zaa), ((com.google.android.gms.common.api.Api$Client) v2_7.get(v4_3)));
                v4_3++;
                if (v5_5 == null) {
                    break;
                }
            }
        }
        if (v5_5 == null) {
            com.google.android.gms.signin.zae v0_3 = this.zaa;
            if ((com.google.android.gms.common.api.internal.zaaw.zav(v0_3)) && (com.google.android.gms.common.api.internal.zaaw.zan(v0_3) != null)) {
                com.google.android.gms.common.api.internal.zaaw.zan(v0_3).zab();
            }
            com.google.android.gms.signin.zae v0_9 = this.zac.keySet().iterator();
            while (v0_9.hasNext()) {
                com.google.android.gms.common.api.internal.zaaw v2_6 = ((com.google.android.gms.common.api.Api$Client) v0_9.next());
                com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks v3_9 = ((com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks) this.zac.get(v2_6));
                if ((!v2_6.requiresGooglePlayServices()) || (v1_1.zab(com.google.android.gms.common.api.internal.zaaw.zac(this.zaa), v2_6) == 0)) {
                    v2_6.connect(v3_9);
                } else {
                    com.google.android.gms.common.api.internal.zaaw v2_8 = this.zaa;
                    com.google.android.gms.common.api.internal.zaaw.zak(v2_8).zal(new com.google.android.gms.common.api.internal.zaan(this, v2_8, v3_9));
                }
            }
            return;
        } else {
            com.google.android.gms.common.api.internal.zaaw v1_3 = this.zaa;
            com.google.android.gms.common.api.internal.zaaw.zak(v1_3).zal(new com.google.android.gms.common.api.internal.zaam(this, v1_3, new com.google.android.gms.common.ConnectionResult(v5_5, 0)));
            return;
        }
    }
}
