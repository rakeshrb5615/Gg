package com.google.android.gms.auth.api.signin.internal;
public abstract class zbo extends com.google.android.gms.internal.auth-api.zbb implements com.google.android.gms.auth.api.signin.internal.zbp {

    public zbo()
    {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        return;
    }

    public final boolean zba(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 == 1) {
            this.zbc();
        } else {
            if (p1 == 2) {
                this.zbb();
            } else {
                return 0;
            }
        }
        return 1;
    }
}
