package com.google.android.gms.auth.api.identity;
public class SavePasswordRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final com.google.android.gms.auth.api.identity.SignInPassword zba;
    private final String zbb;
    private final int zbc;

    static SavePasswordRequest()
    {
        com.google.android.gms.auth.api.identity.SavePasswordRequest.CREATOR = new com.google.android.gms.auth.api.identity.zbr();
        return;
    }

    public SavePasswordRequest(com.google.android.gms.auth.api.identity.SignInPassword p1, String p2, int p3)
    {
        this.zba = ((com.google.android.gms.auth.api.identity.SignInPassword) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zbb = p2;
        this.zbc = p3;
        return;
    }

    public static com.google.android.gms.auth.api.identity.SavePasswordRequest$Builder builder()
    {
        return new com.google.android.gms.auth.api.identity.SavePasswordRequest$Builder();
    }

    public static com.google.android.gms.auth.api.identity.SavePasswordRequest$Builder zba(com.google.android.gms.auth.api.identity.SavePasswordRequest p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        com.google.android.gms.auth.api.identity.SavePasswordRequest$Builder v0 = com.google.android.gms.auth.api.identity.SavePasswordRequest.builder();
        v0.setSignInPassword(p2.getSignInPassword());
        v0.zbb(p2.zbc);
        String v2_1 = p2.zbb;
        if (v2_1 != null) {
            v0.zba(v2_1);
        }
        return v0;
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.auth.api.identity.SavePasswordRequest)) {
            if ((!com.google.android.gms.common.internal.Objects.equal(this.zba, ((com.google.android.gms.auth.api.identity.SavePasswordRequest) p4).zba)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbb, ((com.google.android.gms.auth.api.identity.SavePasswordRequest) p4).zbb)) || (this.zbc != ((com.google.android.gms.auth.api.identity.SavePasswordRequest) p4).zbc))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public com.google.android.gms.auth.api.identity.SignInPassword getSignInPassword()
    {
        return this.zba;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zba, this.zbb}));
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 1, this.getSignInPassword(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 2, this.zbb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 3, this.zbc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
