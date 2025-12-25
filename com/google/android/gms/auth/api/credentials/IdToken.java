package com.google.android.gms.auth.api.credentials;
public final class IdToken extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final String zba;
    private final String zbb;

    static IdToken()
    {
        com.google.android.gms.auth.api.credentials.IdToken.CREATOR = new com.google.android.gms.auth.api.credentials.zbf();
        return;
    }

    public IdToken(String p3, String p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkArgument((android.text.TextUtils.isEmpty(p3) ^ 1), "account type string cannot be null or empty");
        com.google.android.gms.common.internal.Preconditions.checkArgument((android.text.TextUtils.isEmpty(p4) ^ 1), "id token string cannot be null or empty");
        this.zba = p3;
        this.zbb = p4;
        return;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.gms.auth.api.credentials.IdToken)) {
                if ((!com.google.android.gms.common.internal.Objects.equal(this.zba, ((com.google.android.gms.auth.api.credentials.IdToken) p5).zba)) || (!com.google.android.gms.common.internal.Objects.equal(this.zbb, ((com.google.android.gms.auth.api.credentials.IdToken) p5).zbb))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public String getAccountType()
    {
        return this.zba;
    }

    public String getIdToken()
    {
        return this.zbb;
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 1, this.getAccountType(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.getIdToken(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
