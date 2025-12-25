package com.google.android.gms.auth.api.identity;
public final class AuthorizationResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final String zba;
    private final String zbb;
    private final String zbc;
    private final java.util.List zbd;
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount zbe;
    private final android.app.PendingIntent zbf;

    static AuthorizationResult()
    {
        com.google.android.gms.auth.api.identity.AuthorizationResult.CREATOR = new com.google.android.gms.auth.api.identity.zbe();
        return;
    }

    public AuthorizationResult(String p1, String p2, String p3, java.util.List p4, com.google.android.gms.auth.api.signin.GoogleSignInAccount p5, android.app.PendingIntent p6)
    {
        this.zba = p1;
        this.zbb = p2;
        this.zbc = p3;
        this.zbd = ((java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4));
        this.zbf = p6;
        this.zbe = p5;
        return;
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.auth.api.identity.AuthorizationResult)) {
            if ((!com.google.android.gms.common.internal.Objects.equal(this.zba, ((com.google.android.gms.auth.api.identity.AuthorizationResult) p4).zba)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbb, ((com.google.android.gms.auth.api.identity.AuthorizationResult) p4).zbb)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbc, ((com.google.android.gms.auth.api.identity.AuthorizationResult) p4).zbc)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbd, ((com.google.android.gms.auth.api.identity.AuthorizationResult) p4).zbd)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbf, ((com.google.android.gms.auth.api.identity.AuthorizationResult) p4).zbf)) || (!com.google.android.gms.common.internal.Objects.equal(this.zbe, ((com.google.android.gms.auth.api.identity.AuthorizationResult) p4).zbe))))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public String getAccessToken()
    {
        return this.zbb;
    }

    public java.util.List getGrantedScopes()
    {
        return this.zbd;
    }

    public android.app.PendingIntent getPendingIntent()
    {
        return this.zbf;
    }

    public String getServerAuthCode()
    {
        return this.zba;
    }

    public boolean hasResolution()
    {
        if (this.zbf == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public int hashCode()
    {
        String v2 = this.zbc;
        android.app.PendingIntent v4 = this.zbf;
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zba, this.zbe}));
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInAccount toGoogleSignInAccount()
    {
        return this.zbe;
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 1, this.getServerAuthCode(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 2, this.getAccessToken(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 3, this.zbc, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(p5, 4, this.getGrantedScopes(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 5, this.toGoogleSignInAccount(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 6, this.getPendingIntent(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
