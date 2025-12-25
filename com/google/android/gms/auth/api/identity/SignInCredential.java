package com.google.android.gms.auth.api.identity;
public final class SignInCredential extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final String zba;
    private final String zbb;
    private final String zbc;
    private final String zbd;
    private final android.net.Uri zbe;
    private final String zbf;
    private final String zbg;
    private final String zbh;
    private final com.google.android.gms.fido.fido2.api.common.PublicKeyCredential zbi;

    static SignInCredential()
    {
        com.google.android.gms.auth.api.identity.SignInCredential.CREATOR = new com.google.android.gms.auth.api.identity.zbt();
        return;
    }

    public SignInCredential(String p1, String p2, String p3, String p4, android.net.Uri p5, String p6, String p7, String p8, com.google.android.gms.fido.fido2.api.common.PublicKeyCredential p9)
    {
        this.zba = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        this.zbb = p2;
        this.zbc = p3;
        this.zbd = p4;
        this.zbe = p5;
        this.zbf = p6;
        this.zbg = p7;
        this.zbh = p8;
        this.zbi = p9;
        return;
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.auth.api.identity.SignInCredential)) {
            if ((!com.google.android.gms.common.internal.Objects.equal(this.zba, ((com.google.android.gms.auth.api.identity.SignInCredential) p4).zba)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbb, ((com.google.android.gms.auth.api.identity.SignInCredential) p4).zbb)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbc, ((com.google.android.gms.auth.api.identity.SignInCredential) p4).zbc)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbd, ((com.google.android.gms.auth.api.identity.SignInCredential) p4).zbd)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbe, ((com.google.android.gms.auth.api.identity.SignInCredential) p4).zbe)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbf, ((com.google.android.gms.auth.api.identity.SignInCredential) p4).zbf)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbg, ((com.google.android.gms.auth.api.identity.SignInCredential) p4).zbg)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbh, ((com.google.android.gms.auth.api.identity.SignInCredential) p4).zbh)) || (!com.google.android.gms.common.internal.Objects.equal(this.zbi, ((com.google.android.gms.auth.api.identity.SignInCredential) p4).zbi)))))))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public String getDisplayName()
    {
        return this.zbb;
    }

    public String getFamilyName()
    {
        return this.zbd;
    }

    public String getGivenName()
    {
        return this.zbc;
    }

    public String getGoogleIdToken()
    {
        return this.zbg;
    }

    public String getId()
    {
        return this.zba;
    }

    public String getPassword()
    {
        return this.zbf;
    }

    public String getPhoneNumber()
    {
        return this.zbh;
    }

    public android.net.Uri getProfilePictureUri()
    {
        return this.zbe;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential getPublicKeyCredential()
    {
        return this.zbi;
    }

    public int hashCode()
    {
        String v2 = this.zbc;
        android.net.Uri v4 = this.zbe;
        String v6 = this.zbg;
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zba, this.zbi}));
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 1, this.getId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 2, this.getDisplayName(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 3, this.getGivenName(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 4, this.getFamilyName(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 5, this.getProfilePictureUri(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 6, this.getPassword(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 7, this.getGoogleIdToken(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 8, this.getPhoneNumber(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 9, this.getPublicKeyCredential(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
