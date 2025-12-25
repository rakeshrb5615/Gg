package com.google.android.gms.auth.api.identity;
public class SaveAccountLinkingTokenRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable$Creator CREATOR = None;
    public static final String EXTRA_TOKEN = "extra_token";
    public static final String TOKEN_TYPE_AUTH_CODE = "auth_code";
    private final android.app.PendingIntent zba;
    private final String zbb;
    private final String zbc;
    private final java.util.List zbd;
    private final String zbe;
    private final int zbf;

    static SaveAccountLinkingTokenRequest()
    {
        com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.CREATOR = new com.google.android.gms.auth.api.identity.zbp();
        return;
    }

    public SaveAccountLinkingTokenRequest(android.app.PendingIntent p1, String p2, String p3, java.util.List p4, String p5, int p6)
    {
        this.zba = p1;
        this.zbb = p2;
        this.zbc = p3;
        this.zbd = p4;
        this.zbe = p5;
        this.zbf = p6;
        return;
    }

    public static com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$Builder builder()
    {
        return new com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$Builder();
    }

    public static com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$Builder zba(com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$Builder v0 = com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.builder();
        v0.setScopes(p2.getScopes());
        v0.setServiceId(p2.getServiceId());
        v0.setConsentPendingIntent(p2.getConsentPendingIntent());
        v0.setTokenType(p2.getTokenType());
        v0.zbb(p2.zbf);
        String v2_1 = p2.zbe;
        if (!android.text.TextUtils.isEmpty(v2_1)) {
            v0.zba(v2_1);
        }
        return v0;
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest)) {
            if ((this.zbd.size() != ((com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest) p4).zbd.size()) || ((!this.zbd.containsAll(((com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest) p4).zbd)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zba, ((com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest) p4).zba)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbb, ((com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest) p4).zbb)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbc, ((com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest) p4).zbc)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbe, ((com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest) p4).zbe)) || (this.zbf != ((com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest) p4).zbf))))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public android.app.PendingIntent getConsentPendingIntent()
    {
        return this.zba;
    }

    public java.util.List getScopes()
    {
        return this.zbd;
    }

    public String getServiceId()
    {
        return this.zbc;
    }

    public String getTokenType()
    {
        return this.zbb;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zba, this.zbb, this.zbc, this.zbd, this.zbe}));
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 1, this.getConsentPendingIntent(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 2, this.getTokenType(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 3, this.getServiceId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(p5, 4, this.getScopes(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 5, this.zbe, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 6, this.zbf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
