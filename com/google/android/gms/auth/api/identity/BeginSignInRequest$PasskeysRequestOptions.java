package com.google.android.gms.auth.api.identity;
public final class BeginSignInRequest$PasskeysRequestOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final boolean zba;
    private final byte[] zbb;
    private final String zbc;

    static BeginSignInRequest$PasskeysRequestOptions()
    {
        com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions.CREATOR = new com.google.android.gms.auth.api.identity.zbn();
        return;
    }

    public BeginSignInRequest$PasskeysRequestOptions(boolean p1, byte[] p2, String p3)
    {
        if (p1) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        }
        this.zba = p1;
        this.zbb = p2;
        this.zbc = p3;
        return;
    }

    public static com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions$Builder builder()
    {
        return new com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions$Builder();
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions)) {
                if ((this.zba == ((com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions) p5).zba) && (java.util.Arrays.equals(this.zbb, ((com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions) p5).zbb))) {
                    String v1_1 = this.zbc;
                    boolean v5_1 = ((com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions) p5).zbc;
                    if ((v1_1 == v5_1) || ((v1_1 != null) && (v1_1.equals(v5_1)))) {
                        return 1;
                    }
                }
                return 0;
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public byte[] getChallenge()
    {
        return this.zbb;
    }

    public String getRpId()
    {
        return this.zbc;
    }

    public int hashCode()
    {
        return (java.util.Arrays.hashCode(this.zbb) + (java.util.Arrays.hashCode(new Object[] {Boolean.valueOf(this.zba), this.zbc})) * 31));
    }

    public boolean isSupported()
    {
        return this.zba;
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 1, this.isSupported());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 2, this.getChallenge(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 3, this.getRpId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
