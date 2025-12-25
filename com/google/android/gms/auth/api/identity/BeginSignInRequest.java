package com.google.android.gms.auth.api.identity;
public final class BeginSignInRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions zba;
    private final com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions zbb;
    private final String zbc;
    private final boolean zbd;
    private final int zbe;
    private final com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions zbf;
    private final com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions zbg;

    static BeginSignInRequest()
    {
        com.google.android.gms.auth.api.identity.BeginSignInRequest.CREATOR = new com.google.android.gms.auth.api.identity.zbf();
        return;
    }

    public BeginSignInRequest(com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions p1, com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions p2, String p3, boolean p4, int p5, com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions p6, com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions p7)
    {
        this.zba = ((com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zbb = ((com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        this.zbc = p3;
        this.zbd = p4;
        this.zbe = p5;
        if (p6 == null) {
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions$Builder v2_1 = com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions.builder();
            v2_1.setSupported(0);
            p6 = v2_1.build();
        }
        this.zbf = p6;
        if (p7 == null) {
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions$Builder v2_2 = com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions.builder();
            v2_2.setSupported(0);
            p7 = v2_2.build();
        }
        this.zbg = p7;
        return;
    }

    public static com.google.android.gms.auth.api.identity.BeginSignInRequest$Builder builder()
    {
        return new com.google.android.gms.auth.api.identity.BeginSignInRequest$Builder();
    }

    public static com.google.android.gms.auth.api.identity.BeginSignInRequest$Builder zba(com.google.android.gms.auth.api.identity.BeginSignInRequest p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        com.google.android.gms.auth.api.identity.BeginSignInRequest$Builder v0 = com.google.android.gms.auth.api.identity.BeginSignInRequest.builder();
        v0.setGoogleIdTokenRequestOptions(p2.getGoogleIdTokenRequestOptions());
        v0.setPasswordRequestOptions(p2.getPasswordRequestOptions());
        v0.setPasskeysSignInRequestOptions(p2.getPasskeysRequestOptions());
        v0.setPasskeyJsonSignInRequestOptions(p2.getPasskeyJsonRequestOptions());
        v0.setAutoSelectEnabled(p2.zbd);
        v0.zbb(p2.zbe);
        String v2_1 = p2.zbc;
        if (v2_1 != null) {
            v0.zba(v2_1);
        }
        return v0;
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest)) {
            if ((!com.google.android.gms.common.internal.Objects.equal(this.zba, ((com.google.android.gms.auth.api.identity.BeginSignInRequest) p4).zba)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbb, ((com.google.android.gms.auth.api.identity.BeginSignInRequest) p4).zbb)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbf, ((com.google.android.gms.auth.api.identity.BeginSignInRequest) p4).zbf)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbg, ((com.google.android.gms.auth.api.identity.BeginSignInRequest) p4).zbg)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbc, ((com.google.android.gms.auth.api.identity.BeginSignInRequest) p4).zbc)) || ((this.zbd != ((com.google.android.gms.auth.api.identity.BeginSignInRequest) p4).zbd) || (this.zbe != ((com.google.android.gms.auth.api.identity.BeginSignInRequest) p4).zbe))))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions getGoogleIdTokenRequestOptions()
    {
        return this.zbb;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions getPasskeyJsonRequestOptions()
    {
        return this.zbg;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions getPasskeysRequestOptions()
    {
        return this.zbf;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions getPasswordRequestOptions()
    {
        return this.zba;
    }

    public int hashCode()
    {
        com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions v2 = this.zbf;
        String v4 = this.zbc;
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zba, Boolean.valueOf(this.zbd)}));
    }

    public boolean isAutoSelectEnabled()
    {
        return this.zbd;
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 1, this.getPasswordRequestOptions(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 2, this.getGoogleIdTokenRequestOptions(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 3, this.zbc, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 4, this.isAutoSelectEnabled());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 5, this.zbe);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 6, this.getPasskeysRequestOptions(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 7, this.getPasskeyJsonRequestOptions(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
