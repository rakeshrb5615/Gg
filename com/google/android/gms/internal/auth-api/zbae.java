package com.google.android.gms.internal.auth-api;
public abstract class zbae extends com.google.android.gms.internal.auth-api.zbb implements com.google.android.gms.internal.auth-api.zbaf {

    public zbae()
    {
        super("com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback");
        return;
    }

    public final boolean zba(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 != 1) {
            return 0;
        } else {
            int v1_4 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth-api.zbc.zba(p2, com.google.android.gms.common.api.Status.CREATOR));
            android.app.PendingIntent v4_1 = ((android.app.PendingIntent) com.google.android.gms.internal.auth-api.zbc.zba(p2, android.app.PendingIntent.CREATOR));
            com.google.android.gms.internal.auth-api.zbc.zbb(p2);
            this.zbb(v1_4, v4_1);
            return 1;
        }
    }
}
