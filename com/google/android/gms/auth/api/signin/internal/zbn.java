package com.google.android.gms.auth.api.signin.internal;
public final class zbn {
    private static com.google.android.gms.auth.api.signin.internal.zbn zbd;
    final com.google.android.gms.auth.api.signin.internal.Storage zba;
    com.google.android.gms.auth.api.signin.GoogleSignInAccount zbb;
    com.google.android.gms.auth.api.signin.GoogleSignInOptions zbc;

    private zbn(android.content.Context p2)
    {
        com.google.android.gms.auth.api.signin.GoogleSignInOptions v2_1 = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(p2);
        this.zba = v2_1;
        this.zbb = v2_1.getSavedDefaultGoogleSignInAccount();
        this.zbc = v2_1.getSavedDefaultGoogleSignInOptions();
        return;
    }

    public static declared_synchronized com.google.android.gms.auth.api.signin.internal.zbn zbc(android.content.Context p1)
    {
        return com.google.android.gms.auth.api.signin.internal.zbn.zbf(p1.getApplicationContext());
    }

    private static declared_synchronized com.google.android.gms.auth.api.signin.internal.zbn zbf(android.content.Context p2)
    {
        com.google.android.gms.auth.api.signin.internal.zbn v1_0 = com.google.android.gms.auth.api.signin.internal.zbn.zbd;
        if (v1_0 == null) {
            com.google.android.gms.auth.api.signin.internal.zbn v1_2 = new com.google.android.gms.auth.api.signin.internal.zbn(p2);
            com.google.android.gms.auth.api.signin.internal.zbn.zbd = v1_2;
            return v1_2;
        } else {
            return v1_0;
        }
    }

    public final declared_synchronized com.google.android.gms.auth.api.signin.GoogleSignInAccount zba()
    {
        return this.zbb;
    }

    public final declared_synchronized com.google.android.gms.auth.api.signin.GoogleSignInOptions zbb()
    {
        return this.zbc;
    }

    public final declared_synchronized void zbd()
    {
        this.zba.clear();
        this.zbb = 0;
        this.zbc = 0;
        return;
    }

    public final declared_synchronized void zbe(com.google.android.gms.auth.api.signin.GoogleSignInOptions p2, com.google.android.gms.auth.api.signin.GoogleSignInAccount p3)
    {
        this.zba.saveDefaultGoogleSignInAccount(p3, p2);
        this.zbb = p3;
        this.zbc = p2;
        return;
    }
}
