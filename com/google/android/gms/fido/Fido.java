package com.google.android.gms.fido;
public class Fido {
    public static final String FIDO2_KEY_CREDENTIAL_EXTRA = "FIDO2_CREDENTIAL_EXTRA";
    public static final String FIDO2_KEY_ERROR_EXTRA = "FIDO2_ERROR_EXTRA";
    public static final String FIDO2_KEY_RESPONSE_EXTRA = "FIDO2_RESPONSE_EXTRA";
    public static final String KEY_RESPONSE_EXTRA = "RESPONSE_EXTRA";
    public static final com.google.android.gms.common.api.Api$ClientKey zza;
    public static final com.google.android.gms.common.api.Api zzb;
    public static final com.google.android.gms.internal.fido.zzaa zzc;

    static Fido()
    {
        com.google.android.gms.internal.fido.zzaa v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.fido.Fido.zza = v0_1;
        com.google.android.gms.fido.Fido.zzb = new com.google.android.gms.common.api.Api("Fido.U2F_ZERO_PARTY_API", new com.google.android.gms.internal.fido.zzab(), v0_1);
        com.google.android.gms.fido.Fido.zzc = new com.google.android.gms.internal.fido.zzaa();
        return;
    }

    private Fido()
    {
        return;
    }

    public static com.google.android.gms.fido.fido2.Fido2ApiClient getFido2ApiClient(android.app.Activity p1)
    {
        return new com.google.android.gms.fido.fido2.Fido2ApiClient(p1);
    }

    public static com.google.android.gms.fido.fido2.Fido2ApiClient getFido2ApiClient(android.content.Context p1)
    {
        return new com.google.android.gms.fido.fido2.Fido2ApiClient(p1);
    }

    public static com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient getFido2PrivilegedApiClient(android.app.Activity p1)
    {
        return new com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient(p1);
    }

    public static com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient getFido2PrivilegedApiClient(android.content.Context p1)
    {
        return new com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient(p1);
    }

    public static com.google.android.gms.fido.u2f.U2fApiClient getU2fApiClient(android.app.Activity p1)
    {
        return new com.google.android.gms.fido.u2f.U2fApiClient(p1);
    }

    public static com.google.android.gms.fido.u2f.U2fApiClient getU2fApiClient(android.content.Context p1)
    {
        return new com.google.android.gms.fido.u2f.U2fApiClient(p1);
    }
}
