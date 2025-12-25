package com.google.android.gms.auth.api.identity;
public class AuthorizationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final java.util.List zba;
    private final String zbb;
    private final boolean zbc;
    private final boolean zbd;
    private final android.accounts.Account zbe;
    private final String zbf;
    private final String zbg;
    private final boolean zbh;

    static AuthorizationRequest()
    {
        com.google.android.gms.auth.api.identity.AuthorizationRequest.CREATOR = new com.google.android.gms.auth.api.identity.zbd();
        return;
    }

    public AuthorizationRequest(java.util.List p3, String p4, boolean p5, boolean p6, android.accounts.Account p7, String p8, String p9, boolean p10)
    {
        int v0 = 0;
        if ((p3 != null) && (!p3.isEmpty())) {
            v0 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0, "requestedScopes cannot be null or empty");
        this.zba = p3;
        this.zbb = p4;
        this.zbc = p5;
        this.zbd = p6;
        this.zbe = p7;
        this.zbf = p8;
        this.zbg = p9;
        this.zbh = p10;
        return;
    }

    public static com.google.android.gms.auth.api.identity.AuthorizationRequest$Builder builder()
    {
        return new com.google.android.gms.auth.api.identity.AuthorizationRequest$Builder();
    }

    public static com.google.android.gms.auth.api.identity.AuthorizationRequest$Builder zba(com.google.android.gms.auth.api.identity.AuthorizationRequest p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        com.google.android.gms.auth.api.identity.AuthorizationRequest$Builder v0 = com.google.android.gms.auth.api.identity.AuthorizationRequest.builder();
        v0.setRequestedScopes(p6.getRequestedScopes());
        boolean v1_1 = p6.isForceCodeForRefreshToken();
        boolean v2_1 = p6.zbg;
        String v3 = p6.getHostedDomain();
        android.accounts.Account v4 = p6.getAccount();
        String v5 = p6.getServerClientId();
        if (v2_1) {
            v0.zbb(v2_1);
        }
        if (v3 != null) {
            v0.filterByHostedDomain(v3);
        }
        if (v4 != null) {
            v0.setAccount(v4);
        }
        if ((p6.zbd) && (v5 != null)) {
            v0.zba(v5);
        }
        if ((p6.isOfflineAccessRequested()) && (v5 != null)) {
            v0.requestOfflineAccess(v5, v1_1);
        }
        return v0;
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.auth.api.identity.AuthorizationRequest)) {
            if ((this.zba.size() != ((com.google.android.gms.auth.api.identity.AuthorizationRequest) p4).zba.size()) || ((!this.zba.containsAll(((com.google.android.gms.auth.api.identity.AuthorizationRequest) p4).zba)) || ((this.zbc != ((com.google.android.gms.auth.api.identity.AuthorizationRequest) p4).zbc) || ((this.zbh != ((com.google.android.gms.auth.api.identity.AuthorizationRequest) p4).zbh) || ((this.zbd != ((com.google.android.gms.auth.api.identity.AuthorizationRequest) p4).zbd) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbb, ((com.google.android.gms.auth.api.identity.AuthorizationRequest) p4).zbb)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbe, ((com.google.android.gms.auth.api.identity.AuthorizationRequest) p4).zbe)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbf, ((com.google.android.gms.auth.api.identity.AuthorizationRequest) p4).zbf)) || (!com.google.android.gms.common.internal.Objects.equal(this.zbg, ((com.google.android.gms.auth.api.identity.AuthorizationRequest) p4).zbg)))))))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public android.accounts.Account getAccount()
    {
        return this.zbe;
    }

    public String getHostedDomain()
    {
        return this.zbf;
    }

    public java.util.List getRequestedScopes()
    {
        return this.zba;
    }

    public String getServerClientId()
    {
        return this.zbb;
    }

    public int hashCode()
    {
        int v0_0 = this.zba;
        Boolean.valueOf(this.zbc);
        Boolean.valueOf(this.zbh);
        Boolean.valueOf(this.zbd);
        android.accounts.Account v5 = this.zbe;
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {v0_0, this.zbg}));
    }

    public boolean isForceCodeForRefreshToken()
    {
        return this.zbh;
    }

    public boolean isOfflineAccessRequested()
    {
        return this.zbc;
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p5, 1, this.getRequestedScopes(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 2, this.getServerClientId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 3, this.isOfflineAccessRequested());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 4, this.zbd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 5, this.getAccount(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 6, this.getHostedDomain(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 7, this.zbg, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 8, this.isForceCodeForRefreshToken());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
