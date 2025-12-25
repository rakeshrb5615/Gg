package com.google.android.gms.internal.auth-api;
public final class zbaq extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.identity.AuthorizationClient {
    private static final com.google.android.gms.common.api.Api$ClientKey zba;
    private static final com.google.android.gms.common.api.Api$AbstractClientBuilder zbb;
    private static final com.google.android.gms.common.api.Api zbc;

    static zbaq()
    {
        com.google.android.gms.common.api.Api$ClientKey v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.internal.auth-api.zbaq.zba = v0_1;
        com.google.android.gms.internal.auth-api.zbao v1_1 = new com.google.android.gms.internal.auth-api.zbao();
        com.google.android.gms.internal.auth-api.zbaq.zbb = v1_1;
        com.google.android.gms.internal.auth-api.zbaq.zbc = new com.google.android.gms.common.api.Api("Auth.Api.Identity.Authorization.API", v1_1, v0_1);
        return;
    }

    public zbaq(android.app.Activity p3, com.google.android.gms.auth.api.identity.zbc p4)
    {
        com.google.android.gms.auth.api.identity.zbc v4_1 = com.google.android.gms.auth.api.identity.zbb.zbc(p4);
        v4_1.zba(com.google.android.gms.internal.auth-api.zbbj.zba());
        super(p3, com.google.android.gms.internal.auth-api.zbaq.zbc, v4_1.zbb(), com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public zbaq(android.content.Context p3, com.google.android.gms.auth.api.identity.zbc p4)
    {
        com.google.android.gms.auth.api.identity.zbc v4_1 = com.google.android.gms.auth.api.identity.zbb.zbc(p4);
        v4_1.zba(com.google.android.gms.internal.auth-api.zbbj.zba());
        super(p3, com.google.android.gms.internal.auth-api.zbaq.zbc, v4_1.zbb(), com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public final com.google.android.gms.tasks.Task authorize(com.google.android.gms.auth.api.identity.AuthorizationRequest p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.tasks.Task v3_2 = com.google.android.gms.auth.api.identity.AuthorizationRequest.zba(p3);
        v3_2.zbb(((com.google.android.gms.auth.api.identity.zbc) this.getApiOptions()).zbb());
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.auth-api.zbbi.zbc})).run(new com.google.android.gms.internal.auth-api.zban(this, v3_2.build())).setAutoResolveMissingFeatures(0).setMethodKey(1534).build());
    }

    public final com.google.android.gms.auth.api.identity.AuthorizationResult getAuthorizationResultFromIntent(android.content.Intent p3)
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
                    com.google.android.gms.common.api.ApiException v3_7 = ((com.google.android.gms.auth.api.identity.AuthorizationResult) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(p3, "authorization_result", com.google.android.gms.auth.api.identity.AuthorizationResult.CREATOR));
                    if (v3_7 == null) {
                        throw new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
                    } else {
                        return v3_7;
                    }
                }
            }
        }
    }
}
