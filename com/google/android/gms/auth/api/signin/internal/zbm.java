package com.google.android.gms.auth.api.signin.internal;
public final class zbm {
    private static final com.google.android.gms.common.logging.Logger zba;

    static zbm()
    {
        String[] v1_1 = new String[0];
        com.google.android.gms.auth.api.signin.internal.zbm.zba = new com.google.android.gms.common.logging.Logger("GoogleSignInCommon", v1_1);
        return;
    }

    public static android.content.Intent zba(android.content.Context p3, com.google.android.gms.auth.api.signin.GoogleSignInOptions p4)
    {
        Object[] v1_1 = new Object[0];
        com.google.android.gms.auth.api.signin.internal.zbm.zba.d("getFallbackSignInIntent()", v1_1);
        android.content.Intent v3_1 = com.google.android.gms.auth.api.signin.internal.zbm.zbc(p3, p4);
        v3_1.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return v3_1;
    }

    public static android.content.Intent zbb(android.content.Context p3, com.google.android.gms.auth.api.signin.GoogleSignInOptions p4)
    {
        Object[] v1_1 = new Object[0];
        com.google.android.gms.auth.api.signin.internal.zbm.zba.d("getNoImplementationSignInIntent()", v1_1);
        android.content.Intent v3_1 = com.google.android.gms.auth.api.signin.internal.zbm.zbc(p3, p4);
        v3_1.setAction("com.google.android.gms.auth.NO_IMPL");
        return v3_1;
    }

    public static android.content.Intent zbc(android.content.Context p3, com.google.android.gms.auth.api.signin.GoogleSignInOptions p4)
    {
        String v1_5 = new Object[0];
        com.google.android.gms.auth.api.signin.internal.zbm.zba.d("getSignInIntent()", v1_5);
        com.google.android.gms.auth.api.signin.internal.SignInConfiguration v0_2 = new com.google.android.gms.auth.api.signin.internal.SignInConfiguration(p3.getPackageName(), p4);
        android.content.Intent v4_1 = new android.content.Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        v4_1.setPackage(p3.getPackageName());
        v4_1.setClass(p3, com.google.android.gms.auth.api.signin.internal.SignInHubActivity);
        android.os.Bundle v3_2 = new android.os.Bundle();
        v3_2.putParcelable("config", v0_2);
        v4_1.putExtra("config", v3_2);
        return v4_1;
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInResult zbd(android.content.Intent p3)
    {
        if (p3 != null) {
            com.google.android.gms.common.api.Status v1_1 = ((com.google.android.gms.common.api.Status) p3.getParcelableExtra("googleSignInStatus"));
            com.google.android.gms.auth.api.signin.GoogleSignInResult v3_6 = ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) p3.getParcelableExtra("googleSignInAccount"));
            if (v3_6 != null) {
                return new com.google.android.gms.auth.api.signin.GoogleSignInResult(v3_6, com.google.android.gms.common.api.Status.RESULT_SUCCESS);
            } else {
                if (v1_1 == null) {
                    v1_1 = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR;
                }
                return new com.google.android.gms.auth.api.signin.GoogleSignInResult(0, v1_1);
            }
        } else {
            return new com.google.android.gms.auth.api.signin.GoogleSignInResult(0, com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
        }
    }

    public static com.google.android.gms.common.api.OptionalPendingResult zbe(com.google.android.gms.common.api.GoogleApiClient p6, android.content.Context p7, com.google.android.gms.auth.api.signin.GoogleSignInOptions p8, boolean p9)
    {
        com.google.android.gms.auth.api.signin.GoogleSignInResult v4_11;
        com.google.android.gms.common.logging.Logger v0 = com.google.android.gms.auth.api.signin.internal.zbm.zba;
        com.google.android.gms.auth.api.signin.GoogleSignInAccount v2_2 = new Object[0];
        v0.d("silentSignIn()", v2_2);
        int v3_2 = new Object[0];
        v0.d("getEligibleSavedSignInResult()", v3_2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p8);
        com.google.android.gms.auth.api.signin.GoogleSignInAccount v2_1 = com.google.android.gms.auth.api.signin.internal.zbn.zbc(p7).zbb();
        if (v2_1 != null) {
            com.google.android.gms.auth.api.signin.GoogleSignInResult v4_0 = v2_1.getAccount();
            com.google.android.gms.common.api.Status v5_0 = p8.getAccount();
            if (v4_0 != null) {
                if (!v4_0.equals(v5_0)) {
                    v4_11 = 0;
                    if (v4_11 == null) {
                        if (p9 == null) {
                            Object[] v1_1 = new Object[0];
                            v0.d("trySilentSignIn()", v1_1);
                            return new com.google.android.gms.common.api.internal.OptionalPendingResultImpl(p6.enqueue(new com.google.android.gms.auth.api.signin.internal.zbg(p6, p7, p8)));
                        } else {
                            return com.google.android.gms.common.api.PendingResults.immediatePendingResult(new com.google.android.gms.auth.api.signin.GoogleSignInResult(0, new com.google.android.gms.common.api.Status(4)), p6);
                        }
                    } else {
                        com.google.android.gms.common.api.internal.OptionalPendingResultImpl v7_5 = new Object[0];
                        v0.d("Eligible saved sign in result found", v7_5);
                        return com.google.android.gms.common.api.PendingResults.immediatePendingResult(v4_11, p6);
                    }
                }
            } else {
                if (v5_0 != null) {
                }
            }
            if (((!p8.isServerAuthCodeRequested()) && ((!p8.isIdTokenRequested()) || ((v2_1.isIdTokenRequested()) && (com.google.android.gms.common.internal.Objects.equal(p8.getServerClientId(), v2_1.getServerClientId()))))) && (new java.util.HashSet(v2_1.getScopes()).containsAll(new java.util.HashSet(p8.getScopes())))) {
                com.google.android.gms.auth.api.signin.GoogleSignInAccount v2_9 = com.google.android.gms.auth.api.signin.internal.zbn.zbc(p7).zba();
                if ((v2_9 == null) || (v2_9.isExpired())) {
                } else {
                    v4_11 = new com.google.android.gms.auth.api.signin.GoogleSignInResult(v2_9, com.google.android.gms.common.api.Status.RESULT_SUCCESS);
                }
            }
        }
    }

    public static com.google.android.gms.common.api.PendingResult zbf(com.google.android.gms.common.api.GoogleApiClient p3, android.content.Context p4, boolean p5)
    {
        Object[] v1_1 = new Object[0];
        com.google.android.gms.auth.api.signin.internal.zbm.zba.d("Revoking access", v1_1);
        String v0_2 = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(p4).getSavedRefreshToken();
        com.google.android.gms.auth.api.signin.internal.zbm.zbh(p4);
        if (!p5) {
            return p3.execute(new com.google.android.gms.auth.api.signin.internal.zbk(p3));
        } else {
            return com.google.android.gms.auth.api.signin.internal.zbb.zba(v0_2);
        }
    }

    public static com.google.android.gms.common.api.PendingResult zbg(com.google.android.gms.common.api.GoogleApiClient p3, android.content.Context p4, boolean p5)
    {
        Object[] v1_1 = new Object[0];
        com.google.android.gms.auth.api.signin.internal.zbm.zba.d("Signing out", v1_1);
        com.google.android.gms.auth.api.signin.internal.zbm.zbh(p4);
        if (!p5) {
            return p3.execute(new com.google.android.gms.auth.api.signin.internal.zbi(p3));
        } else {
            return com.google.android.gms.common.api.PendingResults.immediatePendingResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS, p3);
        }
    }

    private static void zbh(android.content.Context p1)
    {
        com.google.android.gms.auth.api.signin.internal.zbn.zbc(p1).zbd();
        java.util.Iterator v1_3 = com.google.android.gms.common.api.GoogleApiClient.getAllClients().iterator();
        while (v1_3.hasNext()) {
            ((com.google.android.gms.common.api.GoogleApiClient) v1_3.next()).maybeSignOut();
        }
        com.google.android.gms.common.api.internal.GoogleApiManager.reportSignOut();
        return;
    }
}
