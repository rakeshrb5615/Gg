package com.google.android.gms.auth.api.signin;
public class GoogleSignInClient extends com.google.android.gms.common.api.GoogleApi {
    static int zba;
    private static final com.google.android.gms.auth.api.signin.zbb zbb;

    static GoogleSignInClient()
    {
        com.google.android.gms.auth.api.signin.GoogleSignInClient.zbb = new com.google.android.gms.auth.api.signin.zbb(0);
        com.google.android.gms.auth.api.signin.GoogleSignInClient.zba = 1;
        return;
    }

    public GoogleSignInClient(android.app.Activity p3, com.google.android.gms.auth.api.signin.GoogleSignInOptions p4)
    {
        super(p3, com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API, p4, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
        return;
    }

    public GoogleSignInClient(android.content.Context p4, com.google.android.gms.auth.api.signin.GoogleSignInOptions p5)
    {
        super(p4, com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API, p5, new com.google.android.gms.common.api.GoogleApi$Settings$Builder().setMapper(new com.google.android.gms.common.api.internal.ApiExceptionMapper()).build());
        return;
    }

    private final declared_synchronized int zba()
    {
        int v0_0 = com.google.android.gms.auth.api.signin.GoogleSignInClient.zba;
        if (v0_0 == 1) {
            int v0_3 = this.getApplicationContext();
            String v1_3 = com.google.android.gms.common.GoogleApiAvailability.getInstance();
            int v2_1 = v1_3.isGooglePlayServicesAvailable(v0_3, 12451000);
            if (v2_1 != 0) {
                if ((v1_3.getErrorResolutionIntent(v0_3, v2_1, 0) != null) || (com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(v0_3, "com.google.android.gms.auth.api.fallback") == 0)) {
                    v0_0 = 2;
                    com.google.android.gms.auth.api.signin.GoogleSignInClient.zba = 2;
                } else {
                    v0_0 = 3;
                    com.google.android.gms.auth.api.signin.GoogleSignInClient.zba = 3;
                }
            } else {
                v0_0 = 4;
                com.google.android.gms.auth.api.signin.GoogleSignInClient.zba = 4;
            }
        }
        return v0_0;
    }

    public android.content.Intent getSignInIntent()
    {
        android.content.Intent v0_0 = this.getApplicationContext();
        com.google.android.gms.auth.api.signin.GoogleSignInOptions v1_7 = this.zba();
        int v2 = (v1_7 - 1);
        if (v1_7 == null) {
            throw 0;
        } else {
            if (v2 == 2) {
                return com.google.android.gms.auth.api.signin.internal.zbm.zba(v0_0, ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) this.getApiOptions()));
            } else {
                if (v2 == 3) {
                    return com.google.android.gms.auth.api.signin.internal.zbm.zbc(v0_0, ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) this.getApiOptions()));
                } else {
                    return com.google.android.gms.auth.api.signin.internal.zbm.zbb(v0_0, ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) this.getApiOptions()));
                }
            }
        }
    }

    public com.google.android.gms.tasks.Task revokeAccess()
    {
        int v2_1;
        com.google.android.gms.tasks.Task v0_0 = this.asGoogleApiClient();
        android.content.Context v1 = this.getApplicationContext();
        if (this.zba() != 3) {
            v2_1 = 0;
        } else {
            v2_1 = 1;
        }
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.auth.api.signin.internal.zbm.zbf(v0_0, v1, v2_1));
    }

    public com.google.android.gms.tasks.Task signOut()
    {
        int v2_1;
        com.google.android.gms.tasks.Task v0_0 = this.asGoogleApiClient();
        android.content.Context v1 = this.getApplicationContext();
        if (this.zba() != 3) {
            v2_1 = 0;
        } else {
            v2_1 = 1;
        }
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.auth.api.signin.internal.zbm.zbg(v0_0, v1, v2_1));
    }

    public com.google.android.gms.tasks.Task silentSignIn()
    {
        int v3_0;
        com.google.android.gms.tasks.Task v0_0 = this.asGoogleApiClient();
        com.google.android.gms.auth.api.signin.zbb v1_1 = this.getApplicationContext();
        com.google.android.gms.auth.api.signin.GoogleSignInOptions v2_0 = this.getApiOptions();
        if (this.zba() != 3) {
            v3_0 = 0;
        } else {
            v3_0 = 1;
        }
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(com.google.android.gms.auth.api.signin.internal.zbm.zbe(v0_0, v1_1, ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) v2_0), v3_0), com.google.android.gms.auth.api.signin.GoogleSignInClient.zbb);
    }
}
