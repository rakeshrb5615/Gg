package com.google.android.gms.auth.api.credentials;
public final class HintRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zba;
    private final com.google.android.gms.auth.api.credentials.CredentialPickerConfig zbb;
    private final boolean zbc;
    private final boolean zbd;
    private final String[] zbe;
    private final boolean zbf;
    private final String zbg;
    private final String zbh;

    static HintRequest()
    {
        com.google.android.gms.auth.api.credentials.HintRequest.CREATOR = new com.google.android.gms.auth.api.credentials.zbe();
        return;
    }

    public HintRequest(int p1, com.google.android.gms.auth.api.credentials.CredentialPickerConfig p2, boolean p3, boolean p4, String[] p5, boolean p6, String p7, String p8)
    {
        this.zba = p1;
        this.zbb = ((com.google.android.gms.auth.api.credentials.CredentialPickerConfig) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        this.zbc = p3;
        this.zbd = p4;
        this.zbe = ((String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p5));
        if (p1 >= 2) {
            this.zbf = p6;
            this.zbg = p7;
            this.zbh = p8;
            return;
        } else {
            this.zbf = 1;
            this.zbg = 0;
            this.zbh = 0;
            return;
        }
    }

    public String[] getAccountTypes()
    {
        return this.zbe;
    }

    public com.google.android.gms.auth.api.credentials.CredentialPickerConfig getHintPickerConfig()
    {
        return this.zbb;
    }

    public String getIdTokenNonce()
    {
        return this.zbh;
    }

    public String getServerClientId()
    {
        return this.zbg;
    }

    public boolean isEmailAddressIdentifierSupported()
    {
        return this.zbc;
    }

    public boolean isIdTokenRequested()
    {
        return this.zbf;
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 1, this.getHintPickerConfig(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 2, this.isEmailAddressIdentifierSupported());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 3, this.zbd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(p5, 4, this.getAccountTypes(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 5, this.isIdTokenRequested());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 6, this.getServerClientId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 7, this.getIdTokenNonce(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1000, this.zba);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
