package com.google.android.gms.internal.auth-api;
public final class zbl implements com.google.android.gms.auth.api.credentials.CredentialsApi {

    public zbl()
    {
        return;
    }

    public final com.google.android.gms.common.api.PendingResult delete(com.google.android.gms.common.api.GoogleApiClient p2, com.google.android.gms.auth.api.credentials.Credential p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "client must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "credential must not be null");
        return p2.execute(new com.google.android.gms.internal.auth-api.zbi(this, p2, p3));
    }

    public final com.google.android.gms.common.api.PendingResult disableAutoSignIn(com.google.android.gms.common.api.GoogleApiClient p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "client must not be null");
        return p2.execute(new com.google.android.gms.internal.auth-api.zbj(this, p2));
    }

    public final android.app.PendingIntent getHintPickerIntent(com.google.android.gms.common.api.GoogleApiClient p3, com.google.android.gms.auth.api.credentials.HintRequest p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "client must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "request must not be null");
        com.google.android.gms.auth.api.Auth$AuthCredentialsOptions v0_5 = ((com.google.android.gms.internal.auth-api.zbo) p3.getClient(com.google.android.gms.auth.api.Auth.zba)).zba();
        return com.google.android.gms.internal.auth-api.zbn.zba(p3.getContext(), v0_5, p4, v0_5.zbd());
    }

    public final com.google.android.gms.common.api.PendingResult request(com.google.android.gms.common.api.GoogleApiClient p2, com.google.android.gms.auth.api.credentials.CredentialRequest p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "client must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "request must not be null");
        return p2.enqueue(new com.google.android.gms.internal.auth-api.zbg(this, p2, p3));
    }

    public final com.google.android.gms.common.api.PendingResult save(com.google.android.gms.common.api.GoogleApiClient p2, com.google.android.gms.auth.api.credentials.Credential p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "client must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "credential must not be null");
        return p2.execute(new com.google.android.gms.internal.auth-api.zbh(this, p2, p3));
    }
}
