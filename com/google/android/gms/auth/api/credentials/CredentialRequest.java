package com.google.android.gms.auth.api.credentials;
public final class CredentialRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zba;
    private final boolean zbb;
    private final String[] zbc;
    private final com.google.android.gms.auth.api.credentials.CredentialPickerConfig zbd;
    private final com.google.android.gms.auth.api.credentials.CredentialPickerConfig zbe;
    private final boolean zbf;
    private final String zbg;
    private final String zbh;
    private final boolean zbi;

    static CredentialRequest()
    {
        com.google.android.gms.auth.api.credentials.CredentialRequest.CREATOR = new com.google.android.gms.auth.api.credentials.zbc();
        return;
    }

    public CredentialRequest(int p1, boolean p2, String[] p3, com.google.android.gms.auth.api.credentials.CredentialPickerConfig p4, com.google.android.gms.auth.api.credentials.CredentialPickerConfig p5, boolean p6, String p7, String p8, boolean p9)
    {
        this.zba = p1;
        this.zbb = p2;
        this.zbc = ((String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3));
        if (p4 == null) {
            p4 = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig$Builder().build();
        }
        this.zbd = p4;
        if (p5 == null) {
            p5 = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig$Builder().build();
        }
        this.zbe = p5;
        if (p1 >= 3) {
            this.zbf = p6;
            this.zbg = p7;
            this.zbh = p8;
        } else {
            this.zbf = 1;
            this.zbg = 0;
            this.zbh = 0;
        }
        this.zbi = p9;
        return;
    }

    public String[] getAccountTypes()
    {
        return this.zbc;
    }

    public java.util.Set getAccountTypesSet()
    {
        return new java.util.HashSet(java.util.Arrays.asList(this.zbc));
    }

    public com.google.android.gms.auth.api.credentials.CredentialPickerConfig getCredentialHintPickerConfig()
    {
        return this.zbe;
    }

    public com.google.android.gms.auth.api.credentials.CredentialPickerConfig getCredentialPickerConfig()
    {
        return this.zbd;
    }

    public String getIdTokenNonce()
    {
        return this.zbh;
    }

    public String getServerClientId()
    {
        return this.zbg;
    }

    public boolean getSupportsPasswordLogin()
    {
        return this.isPasswordLoginSupported();
    }

    public boolean isIdTokenRequested()
    {
        return this.zbf;
    }

    public boolean isPasswordLoginSupported()
    {
        return this.zbb;
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 1, this.isPasswordLoginSupported());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(p5, 2, this.getAccountTypes(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 3, this.getCredentialPickerConfig(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 4, this.getCredentialHintPickerConfig(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 5, this.isIdTokenRequested());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 6, this.getServerClientId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 7, this.getIdTokenNonce(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 8, this.zbi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1000, this.zba);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
