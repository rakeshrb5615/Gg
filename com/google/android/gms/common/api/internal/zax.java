package com.google.android.gms.common.api.internal;
final class zax implements com.google.android.gms.common.api.internal.zabz {
    final synthetic com.google.android.gms.common.api.internal.zaaa zaa;

    public synthetic zax(com.google.android.gms.common.api.internal.zaaa p1, com.google.android.gms.common.api.internal.zaw p2)
    {
        this.zaa = p1;
        return;
    }

    public final void zaa(com.google.android.gms.common.ConnectionResult p2)
    {
        com.google.android.gms.common.api.internal.zaaa.zaj(this.zaa).lock();
        try {
            com.google.android.gms.common.api.internal.zaaa.zak(this.zaa, p2);
            com.google.android.gms.common.api.internal.zaaa.zap(this.zaa);
            com.google.android.gms.common.api.internal.zaaa.zaj(this.zaa).unlock();
            return;
        } catch (Throwable v2_2) {
            com.google.android.gms.common.api.internal.zaaa.zaj(this.zaa).unlock();
            throw v2_2;
        }
    }

    public final void zab(android.os.Bundle p2)
    {
        com.google.android.gms.common.api.internal.zaaa.zaj(this.zaa).lock();
        try {
            com.google.android.gms.common.api.internal.zaaa.zao(this.zaa, p2);
            com.google.android.gms.common.api.internal.zaaa.zak(this.zaa, com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS);
            com.google.android.gms.common.api.internal.zaaa.zap(this.zaa);
            com.google.android.gms.common.api.internal.zaaa.zaj(this.zaa).unlock();
            return;
        } catch (Throwable v2_3) {
            com.google.android.gms.common.api.internal.zaaa.zaj(this.zaa).unlock();
            throw v2_3;
        }
    }

    public final void zac(int p3, boolean p4)
    {
        com.google.android.gms.common.api.internal.zaaa.zaj(this.zaa).lock();
        int v0_7 = this.zaa;
        if ((com.google.android.gms.common.api.internal.zaaa.zav(v0_7)) || (com.google.android.gms.common.api.internal.zaaa.zaa(v0_7) == null)) {
            com.google.android.gms.common.api.internal.zaaa.zam(this.zaa, 0);
            com.google.android.gms.common.api.internal.zaaa.zan(this.zaa, p3, p4);
        } else {
            if (com.google.android.gms.common.api.internal.zaaa.zaa(v0_7).isSuccess()) {
                com.google.android.gms.common.api.internal.zaaa.zam(this.zaa, 1);
                com.google.android.gms.common.api.internal.zaaa.zai(this.zaa).onConnectionSuspended(p3);
            } else {
            }
        }
        com.google.android.gms.common.api.internal.zaaa.zaj(this.zaa).unlock();
        return;
    }
}
