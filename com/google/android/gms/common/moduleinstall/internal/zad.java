package com.google.android.gms.common.moduleinstall.internal;
public abstract class zad extends com.google.android.gms.internal.base.zab implements com.google.android.gms.common.moduleinstall.internal.zae {

    public zad()
    {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
        return;
    }

    public final boolean zaa(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 == 1) {
            com.google.android.gms.common.api.Status v1_13 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.base.zac.zaa(p2, com.google.android.gms.common.api.Status.CREATOR));
            com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse v4_11 = ((com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse) com.google.android.gms.internal.base.zac.zaa(p2, com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse.CREATOR));
            com.google.android.gms.internal.base.zac.zab(p2);
            this.zae(v1_13, v4_11);
        } else {
            if (p1 == 2) {
                com.google.android.gms.common.api.Status v1_3 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.base.zac.zaa(p2, com.google.android.gms.common.api.Status.CREATOR));
                com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse v4_3 = ((com.google.android.gms.common.moduleinstall.ModuleInstallResponse) com.google.android.gms.internal.base.zac.zaa(p2, com.google.android.gms.common.moduleinstall.ModuleInstallResponse.CREATOR));
                com.google.android.gms.internal.base.zac.zab(p2);
                this.zad(v1_3, v4_3);
            } else {
                if (p1 == 3) {
                    com.google.android.gms.common.api.Status v1_7 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.base.zac.zaa(p2, com.google.android.gms.common.api.Status.CREATOR));
                    com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse v4_7 = ((com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse) com.google.android.gms.internal.base.zac.zaa(p2, com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse.CREATOR));
                    com.google.android.gms.internal.base.zac.zab(p2);
                    this.zac(v1_7, v4_7);
                } else {
                    if (p1 == 4) {
                        com.google.android.gms.common.api.Status v1_11 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.base.zac.zaa(p2, com.google.android.gms.common.api.Status.CREATOR));
                        com.google.android.gms.internal.base.zac.zab(p2);
                        this.zab(v1_11);
                    } else {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
}
