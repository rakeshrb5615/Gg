package com.google.android.gms.auth.api.signin.internal;
public class Storage {
    private static final java.util.concurrent.locks.Lock zaa;
    private static com.google.android.gms.auth.api.signin.internal.Storage zab;
    private final java.util.concurrent.locks.Lock zac;
    private final android.content.SharedPreferences zad;

    static Storage()
    {
        com.google.android.gms.auth.api.signin.internal.Storage.zaa = new java.util.concurrent.locks.ReentrantLock();
        return;
    }

    public Storage(android.content.Context p3)
    {
        this.zac = new java.util.concurrent.locks.ReentrantLock();
        this.zad = p3.getSharedPreferences("com.google.android.gms.signin", 0);
        return;
    }

    public static com.google.android.gms.auth.api.signin.internal.Storage getInstance(android.content.Context p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        java.util.concurrent.locks.Lock v0_0 = com.google.android.gms.auth.api.signin.internal.Storage.zaa;
        v0_0.lock();
        try {
            if (com.google.android.gms.auth.api.signin.internal.Storage.zab == null) {
                com.google.android.gms.auth.api.signin.internal.Storage.zab = new com.google.android.gms.auth.api.signin.internal.Storage(p2.getApplicationContext());
            }
        } catch (com.google.android.gms.auth.api.signin.internal.Storage v2_1) {
            com.google.android.gms.auth.api.signin.internal.Storage.zaa.unlock();
            throw v2_1;
        }
        v0_0.unlock();
        return com.google.android.gms.auth.api.signin.internal.Storage.zab;
    }

    private static final String zae(String p1, String p2)
    {
        return g2.g.e(p1, ":", p2);
    }

    public void clear()
    {
        this.zac.lock();
        try {
            this.zad.edit().clear().apply();
            this.zac.unlock();
            return;
        } catch (Throwable v0_1) {
            this.zac.unlock();
            throw v0_1;
        }
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInAccount getSavedDefaultGoogleSignInAccount()
    {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount v0_3 = this.zaa("defaultGoogleSignInAccount");
        if (!android.text.TextUtils.isEmpty(v0_3)) {
            com.google.android.gms.auth.api.signin.GoogleSignInAccount v0_1 = this.zaa(com.google.android.gms.auth.api.signin.internal.Storage.zae("googleSignInAccount", v0_3));
            try {
                if (v0_1 == null) {
                    return 0;
                } else {
                    return com.google.android.gms.auth.api.signin.GoogleSignInAccount.zab(v0_1);
                }
            } catch (org.json.JSONException) {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInOptions getSavedDefaultGoogleSignInOptions()
    {
        com.google.android.gms.auth.api.signin.GoogleSignInOptions v0_3 = this.zaa("defaultGoogleSignInAccount");
        if (!android.text.TextUtils.isEmpty(v0_3)) {
            com.google.android.gms.auth.api.signin.GoogleSignInOptions v0_1 = this.zaa(com.google.android.gms.auth.api.signin.internal.Storage.zae("googleSignInOptions", v0_3));
            try {
                if (v0_1 == null) {
                    return 0;
                } else {
                    return com.google.android.gms.auth.api.signin.GoogleSignInOptions.zab(v0_1);
                }
            } catch (org.json.JSONException) {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public String getSavedRefreshToken()
    {
        return this.zaa("refreshToken");
    }

    public void saveDefaultGoogleSignInAccount(com.google.android.gms.auth.api.signin.GoogleSignInAccount p3, com.google.android.gms.auth.api.signin.GoogleSignInOptions p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        this.zad("defaultGoogleSignInAccount", p3.zac());
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        String v0_1 = p3.zac();
        this.zad(com.google.android.gms.auth.api.signin.internal.Storage.zae("googleSignInAccount", v0_1), p3.zad());
        this.zad(com.google.android.gms.auth.api.signin.internal.Storage.zae("googleSignInOptions", v0_1), p4.zaf());
        return;
    }

    public final String zaa(String p3)
    {
        this.zac.lock();
        try {
            Throwable v3_1 = this.zad.getString(p3, 0);
            this.zac.unlock();
            return v3_1;
        } catch (Throwable v3_2) {
            this.zac.unlock();
            throw v3_2;
        }
    }

    public final void zab(String p2)
    {
        this.zac.lock();
        try {
            this.zad.edit().remove(p2).apply();
            this.zac.unlock();
            return;
        } catch (Throwable v2_1) {
            this.zac.unlock();
            throw v2_1;
        }
    }

    public final void zac()
    {
        String v1 = this.zaa("defaultGoogleSignInAccount");
        this.zab("defaultGoogleSignInAccount");
        if (!android.text.TextUtils.isEmpty(v1)) {
            this.zab(com.google.android.gms.auth.api.signin.internal.Storage.zae("googleSignInAccount", v1));
            this.zab(com.google.android.gms.auth.api.signin.internal.Storage.zae("googleSignInOptions", v1));
            return;
        } else {
            return;
        }
    }

    public final void zad(String p2, String p3)
    {
        this.zac.lock();
        try {
            this.zad.edit().putString(p2, p3).apply();
            this.zac.unlock();
            return;
        } catch (Throwable v2_1) {
            this.zac.unlock();
            throw v2_1;
        }
    }
}
