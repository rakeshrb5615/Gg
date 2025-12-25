package com.google.android.gms.signin.internal;
public abstract class zad extends com.google.android.gms.internal.base.zab implements com.google.android.gms.signin.internal.zae {

    public zad()
    {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        return;
    }

    public final boolean zaa(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        switch (p1) {
            case 3:
                com.google.android.gms.internal.base.zac.zaa(p2, com.google.android.gms.common.ConnectionResult.CREATOR);
                com.google.android.gms.internal.base.zac.zaa(p2, com.google.android.gms.signin.internal.zaa.CREATOR);
                com.google.android.gms.internal.base.zac.zab(p2);
                break;
            case 4:
                com.google.android.gms.internal.base.zac.zaa(p2, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.base.zac.zab(p2);
                break;
            case 5:
            default:
                return 0;
            case 6:
                com.google.android.gms.internal.base.zac.zaa(p2, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.base.zac.zab(p2);
                break;
            case 7:
                com.google.android.gms.internal.base.zac.zaa(p2, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.base.zac.zaa(p2, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR);
                com.google.android.gms.internal.base.zac.zab(p2);
                break;
            case 8:
                int v1_19 = ((com.google.android.gms.signin.internal.zak) com.google.android.gms.internal.base.zac.zaa(p2, com.google.android.gms.signin.internal.zak.CREATOR));
                com.google.android.gms.internal.base.zac.zab(p2);
                this.zab(v1_19);
                break;
            case 9:
                com.google.android.gms.internal.base.zac.zaa(p2, com.google.android.gms.signin.internal.zag.CREATOR);
                com.google.android.gms.internal.base.zac.zab(p2);
                break;
        }
        p3.writeNoException();
        return 1;
    }
}
