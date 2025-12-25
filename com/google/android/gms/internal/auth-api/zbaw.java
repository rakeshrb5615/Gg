package com.google.android.gms.internal.auth-api;
public final class zbaw extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.identity.CredentialSavingClient {
    private static final com.google.android.gms.common.api.Api$ClientKey zba;
    private static final com.google.android.gms.common.api.Api$AbstractClientBuilder zbb;
    private static final com.google.android.gms.common.api.Api zbc;
    private final String zbd;

    static zbaw()
    {
        com.google.android.gms.common.api.Api$ClientKey v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.internal.auth-api.zbaw.zba = v0_1;
        com.google.android.gms.internal.auth-api.zbat v1_1 = new com.google.android.gms.internal.auth-api.zbat();
        com.google.android.gms.internal.auth-api.zbaw.zbb = v1_1;
        com.google.android.gms.internal.auth-api.zbaw.zbc = new com.google.android.gms.common.api.Api("Auth.Api.Identity.CredentialSaving.API", v1_1, v0_1);
        return;
    }

    public zbaw(android.app.Activity p3, com.google.android.gms.auth.api.identity.zbh p4)
    {
        super(p3, com.google.android.gms.internal.auth-api.zbaw.zbc, p4, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        super.zbd = com.google.android.gms.internal.auth-api.zbbj.zba();
        return;
    }

    public zbaw(android.content.Context p3, com.google.android.gms.auth.api.identity.zbh p4)
    {
        super(p3, com.google.android.gms.internal.auth-api.zbaw.zbc, p4, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        super.zbd = com.google.android.gms.internal.auth-api.zbbj.zba();
        return;
    }

    public final com.google.android.gms.common.api.Status getStatusFromIntent(android.content.Intent p3)
    {
        if (p3 != null) {
            com.google.android.gms.common.api.Status v3_2 = ((com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(p3, "status", com.google.android.gms.common.api.Status.CREATOR));
            if (v3_2 == null) {
                v3_2 = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR;
            }
            return v3_2;
        } else {
            return com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR;
        }
    }

    public final com.google.android.gms.tasks.Task saveAccountLinkingToken(com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.tasks.Task v3_2 = com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.zba(p3);
        v3_2.zba(this.zbd);
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.auth-api.zbbi.zbg})).run(new com.google.android.gms.internal.auth-api.zbar(this, v3_2.build())).setAutoResolveMissingFeatures(0).setMethodKey(1535).build());
    }

    public final com.google.android.gms.tasks.Task savePassword(com.google.android.gms.auth.api.identity.SavePasswordRequest p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.tasks.Task v3_2 = com.google.android.gms.auth.api.identity.SavePasswordRequest.zba(p3);
        v3_2.zba(this.zbd);
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.auth-api.zbbi.zbe})).run(new com.google.android.gms.internal.auth-api.zbas(this, v3_2.build())).setAutoResolveMissingFeatures(0).setMethodKey(1536).build());
    }
}
