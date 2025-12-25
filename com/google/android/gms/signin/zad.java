package com.google.android.gms.signin;
public final class zad {
    public static final com.google.android.gms.common.api.Api$ClientKey zaa;
    public static final com.google.android.gms.common.api.Api$ClientKey zab;
    public static final com.google.android.gms.common.api.Api$AbstractClientBuilder zac;
    static final com.google.android.gms.common.api.Api$AbstractClientBuilder zad;
    public static final com.google.android.gms.common.api.Scope zae;
    public static final com.google.android.gms.common.api.Scope zaf;
    public static final com.google.android.gms.common.api.Api zag;
    public static final com.google.android.gms.common.api.Api zah;

    static zad()
    {
        com.google.android.gms.common.api.Api v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.signin.zad.zaa = v0_1;
        com.google.android.gms.common.api.Api$ClientKey v1_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.signin.zad.zab = v1_1;
        String v2_2 = new com.google.android.gms.signin.zaa();
        com.google.android.gms.signin.zad.zac = v2_2;
        com.google.android.gms.signin.zab v3_0 = new com.google.android.gms.signin.zab();
        com.google.android.gms.signin.zad.zad = v3_0;
        com.google.android.gms.signin.zad.zae = new com.google.android.gms.common.api.Scope("profile");
        com.google.android.gms.signin.zad.zaf = new com.google.android.gms.common.api.Scope("email");
        com.google.android.gms.signin.zad.zag = new com.google.android.gms.common.api.Api("SignIn.API", v2_2, v0_1);
        com.google.android.gms.signin.zad.zah = new com.google.android.gms.common.api.Api("SignIn.INTERNAL_API", v3_0, v1_1);
        return;
    }
}
