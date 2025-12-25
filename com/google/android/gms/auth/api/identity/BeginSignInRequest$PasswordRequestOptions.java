package com.google.android.gms.auth.api.identity;
public final class BeginSignInRequest$PasswordRequestOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final boolean zba;

    static BeginSignInRequest$PasswordRequestOptions()
    {
        com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions.CREATOR = new com.google.android.gms.auth.api.identity.zbo();
        return;
    }

    public BeginSignInRequest$PasswordRequestOptions(boolean p1)
    {
        this.zba = p1;
        return;
    }

    public static com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions$Builder builder()
    {
        return new com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions$Builder();
    }

    public boolean equals(Object p3)
    {
        if ((p3 instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions)) {
            if (this.zba != ((com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions) p3).zba) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Boolean.valueOf(this.zba)}));
    }

    public boolean isSupported()
    {
        return this.zba;
    }

    public void writeToParcel(android.os.Parcel p3, int p4)
    {
        p4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p3);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 1, this.isSupported());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p3, p4);
        return;
    }
}
