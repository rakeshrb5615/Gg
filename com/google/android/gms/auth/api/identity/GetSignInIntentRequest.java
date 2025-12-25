package com.google.android.gms.auth.api.identity;
public class GetSignInIntentRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final String zba;
    private final String zbb;
    private final String zbc;
    private final String zbd;
    private final boolean zbe;
    private final int zbf;

    static GetSignInIntentRequest()
    {
        com.google.android.gms.auth.api.identity.GetSignInIntentRequest.CREATOR = new com.google.android.gms.auth.api.identity.zbk();
        return;
    }

    public GetSignInIntentRequest(String p1, String p2, String p3, String p4, boolean p5, int p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        this.zba = p1;
        this.zbb = p2;
        this.zbc = p3;
        this.zbd = p4;
        this.zbe = p5;
        this.zbf = p6;
        return;
    }

    public static com.google.android.gms.auth.api.identity.GetSignInIntentRequest$Builder builder()
    {
        return new com.google.android.gms.auth.api.identity.GetSignInIntentRequest$Builder();
    }

    public static com.google.android.gms.auth.api.identity.GetSignInIntentRequest$Builder zba(com.google.android.gms.auth.api.identity.GetSignInIntentRequest p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        com.google.android.gms.auth.api.identity.GetSignInIntentRequest$Builder v0 = com.google.android.gms.auth.api.identity.GetSignInIntentRequest.builder();
        v0.setServerClientId(p2.getServerClientId());
        v0.setNonce(p2.getNonce());
        v0.filterByHostedDomain(p2.getHostedDomainFilter());
        v0.setRequestVerifiedPhoneNumber(p2.zbe);
        v0.zbb(p2.zbf);
        String v2_1 = p2.zbc;
        if (v2_1 != null) {
            v0.zba(v2_1);
        }
        return v0;
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.auth.api.identity.GetSignInIntentRequest)) {
            if ((!com.google.android.gms.common.internal.Objects.equal(this.zba, ((com.google.android.gms.auth.api.identity.GetSignInIntentRequest) p4).zba)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbd, ((com.google.android.gms.auth.api.identity.GetSignInIntentRequest) p4).zbd)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbb, ((com.google.android.gms.auth.api.identity.GetSignInIntentRequest) p4).zbb)) || ((!com.google.android.gms.common.internal.Objects.equal(Boolean.valueOf(this.zbe), Boolean.valueOf(((com.google.android.gms.auth.api.identity.GetSignInIntentRequest) p4).zbe))) || (this.zbf != ((com.google.android.gms.auth.api.identity.GetSignInIntentRequest) p4).zbf))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public String getHostedDomainFilter()
    {
        return this.zbb;
    }

    public String getNonce()
    {
        return this.zbd;
    }

    public String getServerClientId()
    {
        return this.zba;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zba, this.zbb, this.zbd, Boolean.valueOf(this.zbe), Integer.valueOf(this.zbf)}));
    }

    public boolean requestVerifiedPhoneNumber()
    {
        return this.zbe;
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 1, this.getServerClientId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.getHostedDomainFilter(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 3, this.zbc, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 4, this.getNonce(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 5, this.requestVerifiedPhoneNumber());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 6, this.zbf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
