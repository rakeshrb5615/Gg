package com.google.android.gms.auth.api.identity;
public class SignInPassword extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final String zba;
    private final String zbb;

    static SignInPassword()
    {
        com.google.android.gms.auth.api.identity.SignInPassword.CREATOR = new com.google.android.gms.auth.api.identity.zbv();
        return;
    }

    public SignInPassword(String p2, String p3)
    {
        this.zba = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.zbb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3);
        return;
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.auth.api.identity.SignInPassword)) {
            if ((!com.google.android.gms.common.internal.Objects.equal(this.zba, ((com.google.android.gms.auth.api.identity.SignInPassword) p4).zba)) || (!com.google.android.gms.common.internal.Objects.equal(this.zbb, ((com.google.android.gms.auth.api.identity.SignInPassword) p4).zbb))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public String getId()
    {
        return this.zba;
    }

    public String getPassword()
    {
        return this.zbb;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zba, this.zbb}));
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 1, this.getId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.getPassword(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
