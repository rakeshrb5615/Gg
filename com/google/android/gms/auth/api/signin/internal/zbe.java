package com.google.android.gms.auth.api.signin.internal;
public final class zbe extends com.google.android.gms.common.internal.GmsClient {
    private final com.google.android.gms.auth.api.signin.GoogleSignInOptions zba;

    public zbe(android.content.Context p8, android.os.Looper p9, com.google.android.gms.common.internal.ClientSettings p10, com.google.android.gms.auth.api.signin.GoogleSignInOptions p11, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks p12, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p13)
    {
        com.google.android.gms.auth.api.signin.GoogleSignInOptions v8_1;
        com.google.android.gms.auth.api.signin.internal.zbe v0_1 = super(p8, p9, 91, p10, p12, p13);
        if (p11 == null) {
            v8_1 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder();
        } else {
            v8_1 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder(p11);
        }
        v8_1.setLogSessionId(com.google.android.gms.internal.auth-api.zbbj.zba());
        if (!p10.getAllRequestedScopes().isEmpty()) {
            java.util.Iterator v9_5 = p10.getAllRequestedScopes().iterator();
            while (v9_5.hasNext()) {
                com.google.android.gms.common.api.Scope[] v11_2 = new com.google.android.gms.common.api.Scope[0];
                v8_1.requestScopes(((com.google.android.gms.common.api.Scope) v9_5.next()), v11_2);
            }
        }
        v0_1.zba = v8_1.build();
        return;
    }

    public final synthetic android.os.IInterface createServiceInterface(android.os.IBinder p3)
    {
        if (p3 != 0) {
            com.google.android.gms.auth.api.signin.internal.zbs v0_1 = p3.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
            if (!(v0_1 instanceof com.google.android.gms.auth.api.signin.internal.zbs)) {
                return new com.google.android.gms.auth.api.signin.internal.zbs(p3);
            } else {
                return ((com.google.android.gms.auth.api.signin.internal.zbs) v0_1);
            }
        } else {
            return 0;
        }
    }

    public final int getMinApkVersion()
    {
        return 12451000;
    }

    public final String getServiceDescriptor()
    {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final android.content.Intent getSignInIntent()
    {
        return com.google.android.gms.auth.api.signin.internal.zbm.zbc(this.getContext(), this.zba);
    }

    public final String getStartServiceAction()
    {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final boolean providesSignIn()
    {
        return 1;
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInOptions zba()
    {
        return this.zba;
    }
}
