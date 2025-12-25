package com.google.android.gms.internal.auth-api;
public abstract class zbab extends com.google.android.gms.internal.auth-api.zbb implements com.google.android.gms.internal.auth-api.zbac {

    public zbab()
    {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
        return;
    }

    public final boolean zba(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 != 1) {
            return 0;
        } else {
            int v1_4 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth-api.zbc.zba(p2, com.google.android.gms.common.api.Status.CREATOR));
            com.google.android.gms.auth.api.identity.BeginSignInResult v4_1 = ((com.google.android.gms.auth.api.identity.BeginSignInResult) com.google.android.gms.internal.auth-api.zbc.zba(p2, com.google.android.gms.auth.api.identity.BeginSignInResult.CREATOR));
            com.google.android.gms.internal.auth-api.zbc.zbb(p2);
            this.zbb(v1_4, v4_1);
            return 1;
        }
    }
}
