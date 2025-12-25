package com.google.android.gms.signin.internal;
public class SignInClientImpl extends com.google.android.gms.common.internal.GmsClient implements com.google.android.gms.signin.zae {
    public static final synthetic int zaa;
    private final boolean zab;
    private final com.google.android.gms.common.internal.ClientSettings zac;
    private final android.os.Bundle zad;
    private final Integer zae;

    public SignInClientImpl(android.content.Context p8, android.os.Looper p9, boolean p10, com.google.android.gms.common.internal.ClientSettings p11, android.os.Bundle p12, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks p13, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p14)
    {
        com.google.android.gms.signin.internal.SignInClientImpl v0_1 = super(p8, p9, 44, p11, p13, p14);
        v0_1.zab = 1;
        v0_1.zac = p11;
        v0_1.zad = p12;
        v0_1.zae = p11.zab();
        return;
    }

    public static android.os.Bundle createBundleFromClientSettings(com.google.android.gms.common.internal.ClientSettings p4)
    {
        p4.zaa();
        int v0_2 = p4.zab();
        android.os.Bundle v1_1 = new android.os.Bundle();
        v1_1.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", p4.getAccount());
        if (v0_2 != 0) {
            v1_1.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", v0_2.intValue());
        }
        v1_1.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", 0);
        v1_1.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", 0);
        v1_1.putString("com.google.android.gms.signin.internal.serverClientId", 0);
        v1_1.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", 1);
        v1_1.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", 0);
        v1_1.putString("com.google.android.gms.signin.internal.hostedDomain", 0);
        v1_1.putString("com.google.android.gms.signin.internal.logSessionId", 0);
        v1_1.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", 0);
        return v1_1;
    }

    public final synthetic android.os.IInterface createServiceInterface(android.os.IBinder p3)
    {
        if (p3 != 0) {
            com.google.android.gms.signin.internal.zaf v0_1 = p3.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            if (!(v0_1 instanceof com.google.android.gms.signin.internal.zaf)) {
                return new com.google.android.gms.signin.internal.zaf(p3);
            } else {
                return ((com.google.android.gms.signin.internal.zaf) v0_1);
            }
        } else {
            return 0;
        }
    }

    public final android.os.Bundle getGetServiceRequestExtraArgs()
    {
        if (!this.getContext().getPackageName().equals(this.zac.getRealClientPackageName())) {
            this.zad.putString("com.google.android.gms.signin.internal.realClientPackageName", this.zac.getRealClientPackageName());
        }
        return this.zad;
    }

    public final int getMinApkVersion()
    {
        return 12451000;
    }

    public final String getServiceDescriptor()
    {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final String getStartServiceAction()
    {
        return "com.google.android.gms.signin.service.START";
    }

    public final boolean requiresSignIn()
    {
        return this.zab;
    }

    public final void zaa()
    {
        try {
            ((com.google.android.gms.signin.internal.zaf) this.getService()).zae(((Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zae)).intValue());
            return;
        } catch (android.os.RemoteException) {
            android.util.Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
            return;
        }
    }

    public final void zab()
    {
        this.connect(new com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter(this));
        return;
    }

    public final void zac(com.google.android.gms.common.internal.IAccountAccessor p3, boolean p4)
    {
        try {
            ((com.google.android.gms.signin.internal.zaf) this.getService()).zaf(p3, ((Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zae)).intValue(), p4);
            return;
        } catch (android.os.RemoteException) {
            android.util.Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
            return;
        }
    }

    public final void zad(com.google.android.gms.signin.internal.zae p8)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p8, "Expecting a valid ISignInCallbacks");
        com.google.android.gms.signin.internal.zak v3_1;
        com.google.android.gms.signin.internal.zaf v2_4 = this.zac.getAccountOrDefault();
        if (!"<<default account>>".equals(v2_4.name)) {
            v3_1 = 0;
        } else {
            v3_1 = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(this.getContext()).getSavedDefaultGoogleSignInAccount();
        }
        ((com.google.android.gms.signin.internal.zaf) this.getService()).zag(new com.google.android.gms.signin.internal.zai(1, new com.google.android.gms.common.internal.zat(v2_4, ((Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zae)).intValue(), v3_1)), p8);
        return;
    }
}
