package com.google.android.gms.auth.api.signin.internal;
public abstract class zbq extends com.google.android.gms.internal.auth-api.zbb implements com.google.android.gms.auth.api.signin.internal.zbr {

    public zbq()
    {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        return;
    }

    public final boolean zba(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        switch (p1) {
            case 101:
                int v1_5 = ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) com.google.android.gms.internal.auth-api.zbc.zba(p2, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR));
                com.google.android.gms.common.api.Status v4_2 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth-api.zbc.zba(p2, com.google.android.gms.common.api.Status.CREATOR));
                com.google.android.gms.internal.auth-api.zbc.zbb(p2);
                this.zbd(v1_5, v4_2);
                break;
            case 102:
                int v1_2 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth-api.zbc.zba(p2, com.google.android.gms.common.api.Status.CREATOR));
                com.google.android.gms.internal.auth-api.zbc.zbb(p2);
                this.zbc(v1_2);
                break;
            case 103:
                int v1_9 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth-api.zbc.zba(p2, com.google.android.gms.common.api.Status.CREATOR));
                com.google.android.gms.internal.auth-api.zbc.zbb(p2);
                this.zbb(v1_9);
                break;
            default:
                return 0;
        }
        p3.writeNoException();
        return 1;
    }
}
