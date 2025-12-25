package com.google.android.gms.auth.api.identity;
public final class BeginSignInRequest$GoogleIdTokenRequestOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final boolean zba;
    private final String zbb;
    private final String zbc;
    private final boolean zbd;
    private final String zbe;
    private final java.util.List zbf;
    private final boolean zbg;

    static BeginSignInRequest$GoogleIdTokenRequestOptions()
    {
        com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions.CREATOR = new com.google.android.gms.auth.api.identity.zbl();
        return;
    }

    public BeginSignInRequest$GoogleIdTokenRequestOptions(boolean p3, String p4, String p5, boolean p6, String p7, java.util.List p8, boolean p9)
    {
        int v0 = 1;
        if ((p6) && (p9)) {
            v0 = 0;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
        this.zba = p3;
        if (p3 != null) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.zbb = p4;
        this.zbc = p5;
        this.zbd = p6;
        java.util.ArrayList v3_1 = 0;
        if ((p8 != null) && (!p8.isEmpty())) {
            v3_1 = new java.util.ArrayList(p8);
            java.util.Collections.sort(v3_1);
        }
        this.zbf = v3_1;
        this.zbe = p7;
        this.zbg = p9;
        return;
    }

    public static com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions$Builder builder()
    {
        return new com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions$Builder();
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions)) {
            if ((this.zba != ((com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions) p4).zba) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbb, ((com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions) p4).zbb)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbc, ((com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions) p4).zbc)) || ((this.zbd != ((com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions) p4).zbd) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbe, ((com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions) p4).zbe)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbf, ((com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions) p4).zbf)) || (this.zbg != ((com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions) p4).zbg))))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public boolean filterByAuthorizedAccounts()
    {
        return this.zbd;
    }

    public java.util.List getIdTokenDepositionScopes()
    {
        return this.zbf;
    }

    public String getLinkedServiceId()
    {
        return this.zbe;
    }

    public String getNonce()
    {
        return this.zbc;
    }

    public String getServerClientId()
    {
        return this.zbb;
    }

    public int hashCode()
    {
        Boolean v1 = Boolean.valueOf(this.zba);
        String v3 = this.zbc;
        Boolean.valueOf(this.zbd);
        String v5 = this.zbe;
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {v1, Boolean.valueOf(this.zbg)}));
    }

    public boolean isSupported()
    {
        return this.zba;
    }

    public boolean requestVerifiedPhoneNumber()
    {
        return this.zbg;
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 1, this.isSupported());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.getServerClientId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 3, this.getNonce(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 4, this.filterByAuthorizedAccounts());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 5, this.getLinkedServiceId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(p4, 6, this.getIdTokenDepositionScopes(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 7, this.requestVerifiedPhoneNumber());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
