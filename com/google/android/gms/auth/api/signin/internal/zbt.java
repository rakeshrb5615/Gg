package com.google.android.gms.auth.api.signin.internal;
public final class zbt extends com.google.android.gms.auth.api.signin.internal.zbo {
    private final android.content.Context zba;

    public zbt(android.content.Context p1)
    {
        this.zba = p1;
        return;
    }

    private final void zbd()
    {
        if (!com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(this.zba, android.os.Binder.getCallingUid())) {
            throw new SecurityException(v1.a.j("Calling UID ", android.os.Binder.getCallingUid(), " is not Google Play services."));
        } else {
            return;
        }
    }

    public final void zbb()
    {
        this.zbd();
        com.google.android.gms.auth.api.signin.internal.zbn.zbc(this.zba).zbd();
        return;
    }

    public final void zbc()
    {
        this.zbd();
        com.google.android.gms.auth.api.signin.GoogleSignInClient v0_3 = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(this.zba);
        com.google.android.gms.auth.api.signin.GoogleSignInAccount v1 = v0_3.getSavedDefaultGoogleSignInAccount();
        com.google.android.gms.auth.api.signin.GoogleSignInOptions v2 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (v1 != null) {
            v2 = v0_3.getSavedDefaultGoogleSignInOptions();
        }
        com.google.android.gms.auth.api.signin.GoogleSignInClient v0_2 = com.google.android.gms.auth.api.signin.GoogleSignIn.getClient(this.zba, v2);
        if (v1 == null) {
            v0_2.signOut();
            return;
        } else {
            v0_2.revokeAccess();
            return;
        }
    }
}
