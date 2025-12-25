package com.google.android.gms.common.internal;
public final class zal {
    private final android.util.SparseIntArray zaa;
    private com.google.android.gms.common.GoogleApiAvailabilityLight zab;

    public zal()
    {
        this(com.google.android.gms.common.GoogleApiAvailability.getInstance());
        return;
    }

    public zal(com.google.android.gms.common.GoogleApiAvailabilityLight p2)
    {
        this.zaa = new android.util.SparseIntArray();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        this.zab = p2;
        return;
    }

    public final int zaa(android.content.Context p2, int p3)
    {
        return this.zaa.get(p3, -1);
    }

    public final int zab(android.content.Context p6, com.google.android.gms.common.api.Api$Client p7)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p7);
        int v1 = 0;
        if (p7.requiresGooglePlayServices()) {
            int v7_1 = p7.getMinApkVersion();
            com.google.android.gms.common.GoogleApiAvailabilityLight v0_3 = this.zaa(p6, v7_1);
            if (v0_3 == -1) {
                com.google.android.gms.common.GoogleApiAvailabilityLight v0_0 = 0;
                while (v0_0 < this.zaa.size()) {
                    int v3_3 = this.zaa.keyAt(v0_0);
                    if ((v3_3 <= v7_1) || (this.zaa.get(v3_3) != 0)) {
                        v0_0++;
                    }
                    if (v1 == -1) {
                        v1 = this.zab.isGooglePlayServicesAvailable(p6, v7_1);
                    }
                    this.zaa.put(v7_1, v1);
                    return v1;
                }
                v1 = -1;
            } else {
                return v0_3;
            }
        } else {
            return 0;
        }
    }

    public final void zac()
    {
        this.zaa.clear();
        return;
    }
}
