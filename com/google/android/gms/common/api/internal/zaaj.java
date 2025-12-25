package com.google.android.gms.common.api.internal;
public final class zaaj implements com.google.android.gms.common.api.internal.zabf {
    private final com.google.android.gms.common.api.internal.zabi zaa;
    private boolean zab;

    public zaaj(com.google.android.gms.common.api.internal.zabi p2)
    {
        this.zab = 0;
        this.zaa = p2;
        return;
    }

    public static bridge synthetic com.google.android.gms.common.api.internal.zabi zac(com.google.android.gms.common.api.internal.zaaj p0)
    {
        return p0.zaa;
    }

    public final com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl zaa(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p1)
    {
        this.zab(p1);
        return p1;
    }

    public final com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl zab(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p4)
    {
        try {
            this.zaa.zag.zai.zaa(p4);
            com.google.android.gms.common.api.Status v0_3 = ((com.google.android.gms.common.api.Api$Client) this.zaa.zag.zac.get(p4.getClientKey()));
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_3, "Appropriate Api was not requested.");
        } catch (android.os.DeadObjectException) {
            this.zaa.zal(new com.google.android.gms.common.api.internal.zaah(this, this));
            return p4;
        }
        if ((v0_3.isConnected()) || (!this.zaa.zab.containsKey(p4.getClientKey()))) {
            p4.run(v0_3);
            return p4;
        } else {
            p4.setFailedResult(new com.google.android.gms.common.api.Status(17));
            return p4;
        }
    }

    public final void zad()
    {
        return;
    }

    public final void zae()
    {
        if (this.zab) {
            this.zab = 0;
            this.zaa.zal(new com.google.android.gms.common.api.internal.zaai(this, this));
        }
        return;
    }

    public final void zaf()
    {
        if (this.zab) {
            this.zab = 0;
            this.zaa.zag.zai.zab();
            this.zaj();
        }
        return;
    }

    public final void zag(android.os.Bundle p1)
    {
        return;
    }

    public final void zah(com.google.android.gms.common.ConnectionResult p1, com.google.android.gms.common.api.Api p2, boolean p3)
    {
        return;
    }

    public final void zai(int p3)
    {
        this.zaa.zak(0);
        this.zaa.zah.zac(p3, this.zab);
        return;
    }

    public final boolean zaj()
    {
        if (!this.zab) {
            java.util.Iterator v0_6 = this.zaa.zag.zah;
            if ((v0_6 == null) || (v0_6.isEmpty())) {
                this.zaa.zak(0);
                return 1;
            } else {
                this.zab = 1;
                java.util.Iterator v0_2 = v0_6.iterator();
                while (v0_2.hasNext()) {
                    ((com.google.android.gms.common.api.internal.zada) v0_2.next()).zah();
                }
            }
        }
        return 0;
    }
}
