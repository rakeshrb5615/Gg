package com.google.android.gms.internal.auth-api;
public final class zbbg extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.identity.SignInClient {
    private static final com.google.android.gms.common.api.Api$ClientKey zba;
    private static final com.google.android.gms.common.api.Api$AbstractClientBuilder zbb;
    private static final com.google.android.gms.common.api.Api zbc;
    private final String zbd;

    static zbbg()
    {
        com.google.android.gms.common.api.Api$ClientKey v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.internal.auth-api.zbbg.zba = v0_1;
        com.google.android.gms.internal.auth-api.zbbb v1_1 = new com.google.android.gms.internal.auth-api.zbbb();
        com.google.android.gms.internal.auth-api.zbbg.zbb = v1_1;
        com.google.android.gms.internal.auth-api.zbbg.zbc = new com.google.android.gms.common.api.Api("Auth.Api.Identity.SignIn.API", v1_1, v0_1);
        return;
    }

    public zbbg(android.app.Activity p3, com.google.android.gms.auth.api.identity.zbu p4)
    {
        super(p3, com.google.android.gms.internal.auth-api.zbbg.zbc, p4, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        super.zbd = com.google.android.gms.internal.auth-api.zbbj.zba();
        return;
    }

    public zbbg(android.content.Context p3, com.google.android.gms.auth.api.identity.zbu p4)
    {
        super(p3, com.google.android.gms.internal.auth-api.zbbg.zbc, p4, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        super.zbd = com.google.android.gms.internal.auth-api.zbbj.zba();
        return;
    }

    public final com.google.android.gms.tasks.Task beginSignIn(com.google.android.gms.auth.api.identity.BeginSignInRequest p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.tasks.Task v3_2 = com.google.android.gms.auth.api.identity.BeginSignInRequest.zba(p3);
        v3_2.zba(this.zbd);
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.auth-api.zbbi.zba})).run(new com.google.android.gms.internal.auth-api.zbax(this, v3_2.build())).setAutoResolveMissingFeatures(0).setMethodKey(1553).build());
    }

    public final String getPhoneNumberFromIntent(android.content.Intent p3)
    {
        if (p3 == null) {
            throw new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
        } else {
            com.google.android.gms.common.api.Status v0_6 = ((com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(p3, "status", com.google.android.gms.common.api.Status.CREATOR));
            if (v0_6 == null) {
                throw new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_CANCELED);
            } else {
                if (!v0_6.isSuccess()) {
                    throw new com.google.android.gms.common.api.ApiException(v0_6);
                } else {
                    com.google.android.gms.common.api.ApiException v3_6 = p3.getStringExtra("phone_number_hint_result");
                    if (v3_6 == null) {
                        throw new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
                    } else {
                        return v3_6;
                    }
                }
            }
        }
    }

    public final com.google.android.gms.tasks.Task getPhoneNumberHintIntent(com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.auth-api.zbbi.zbh})).run(new com.google.android.gms.internal.auth-api.zbba(this, p3)).setMethodKey(1653).build());
    }

    public final com.google.android.gms.auth.api.identity.SignInCredential getSignInCredentialFromIntent(android.content.Intent p3)
    {
        if (p3 == null) {
            throw new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
        } else {
            com.google.android.gms.common.api.Status v0_6 = ((com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(p3, "status", com.google.android.gms.common.api.Status.CREATOR));
            if (v0_6 == null) {
                throw new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_CANCELED);
            } else {
                if (!v0_6.isSuccess()) {
                    throw new com.google.android.gms.common.api.ApiException(v0_6);
                } else {
                    com.google.android.gms.common.api.ApiException v3_7 = ((com.google.android.gms.auth.api.identity.SignInCredential) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(p3, "sign_in_credential", com.google.android.gms.auth.api.identity.SignInCredential.CREATOR));
                    if (v3_7 == null) {
                        throw new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
                    } else {
                        return v3_7;
                    }
                }
            }
        }
    }

    public final com.google.android.gms.tasks.Task getSignInIntent(com.google.android.gms.auth.api.identity.GetSignInIntentRequest p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.tasks.Task v3_2 = com.google.android.gms.auth.api.identity.GetSignInIntentRequest.zba(p3);
        v3_2.zba(this.zbd);
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.auth-api.zbbi.zbf})).run(new com.google.android.gms.internal.auth-api.zbay(this, v3_2.build())).setMethodKey(1555).build());
    }

    public final com.google.android.gms.tasks.Task signOut()
    {
        this.getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        com.google.android.gms.tasks.Task v0_2 = com.google.android.gms.common.api.GoogleApiClient.getAllClients().iterator();
        while (v0_2.hasNext()) {
            ((com.google.android.gms.common.api.GoogleApiClient) v0_2.next()).maybeSignOut();
        }
        com.google.android.gms.common.api.internal.GoogleApiManager.reportSignOut();
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.auth-api.zbbi.zbb})).run(new com.google.android.gms.internal.auth-api.zbaz(this)).setAutoResolveMissingFeatures(0).setMethodKey(1554).build());
    }

    public final synthetic void zba(com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest p2, com.google.android.gms.internal.auth-api.zbbh p3, com.google.android.gms.tasks.TaskCompletionSource p4)
    {
        ((com.google.android.gms.internal.auth-api.zbam) p3.getService()).zbd(new com.google.android.gms.internal.auth-api.zbbf(this, p4), p2, this.zbd);
        return;
    }

    public final synthetic void zbb(com.google.android.gms.internal.auth-api.zbbh p2, com.google.android.gms.tasks.TaskCompletionSource p3)
    {
        ((com.google.android.gms.internal.auth-api.zbam) p2.getService()).zbf(new com.google.android.gms.internal.auth-api.zbbd(this, p3), this.zbd);
        return;
    }
}
