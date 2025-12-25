package com.google.android.gms.auth.api.identity;
public final class BeginSignInRequest$PasskeyJsonRequestOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final boolean zba;
    private final String zbb;

    static BeginSignInRequest$PasskeyJsonRequestOptions()
    {
        com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions.CREATOR = new com.google.android.gms.auth.api.identity.zbm();
        return;
    }

    public BeginSignInRequest$PasskeyJsonRequestOptions(boolean p1, String p2)
    {
        if (p1) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        }
        this.zba = p1;
        this.zbb = p2;
        return;
    }

    public static com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions$Builder builder()
    {
        return new com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions$Builder();
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions)) {
                if ((this.zba != ((com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions) p5).zba) || (!com.google.android.gms.common.internal.Objects.equal(this.zbb, ((com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions) p5).zbb))) {
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

    public String getRequestJson()
    {
        return this.zbb;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Boolean.valueOf(this.zba), this.zbb}));
    }

    public boolean isSupported()
    {
        return this.zba;
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 1, this.isSupported());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.getRequestJson(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
