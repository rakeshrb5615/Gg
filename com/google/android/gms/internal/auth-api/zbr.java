package com.google.android.gms.internal.auth-api;
public abstract class zbr extends com.google.android.gms.internal.auth-api.zbb implements com.google.android.gms.internal.auth-api.zbs {

    public zbr()
    {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
        return;
    }

    public final boolean zba(int p2, android.os.Parcel p3, android.os.Parcel p4, int p5)
    {
        if (p2 == 1) {
            com.google.android.gms.common.api.Status v2_10 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth-api.zbc.zba(p3, com.google.android.gms.common.api.Status.CREATOR));
            String v0_5 = ((com.google.android.gms.auth.api.credentials.Credential) com.google.android.gms.internal.auth-api.zbc.zba(p3, com.google.android.gms.auth.api.credentials.Credential.CREATOR));
            com.google.android.gms.internal.auth-api.zbc.zbb(p3);
            this.zbb(v2_10, v0_5);
        } else {
            if (p2 == 2) {
                com.google.android.gms.common.api.Status v2_3 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth-api.zbc.zba(p3, com.google.android.gms.common.api.Status.CREATOR));
                com.google.android.gms.internal.auth-api.zbc.zbb(p3);
                this.zbc(v2_3);
            } else {
                if (p2 == 3) {
                    com.google.android.gms.common.api.Status v2_7 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth-api.zbc.zba(p3, com.google.android.gms.common.api.Status.CREATOR));
                    String v0_2 = p3.readString();
                    com.google.android.gms.internal.auth-api.zbc.zbb(p3);
                    this.zbd(v2_7, v0_2);
                } else {
                    return 0;
                }
            }
        }
        p4.writeNoException();
        return 1;
    }
}
