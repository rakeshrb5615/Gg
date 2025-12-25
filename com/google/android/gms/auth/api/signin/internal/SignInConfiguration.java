package com.google.android.gms.auth.api.signin.internal;
public final class SignInConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final String zba;
    private final com.google.android.gms.auth.api.signin.GoogleSignInOptions zbb;

    static SignInConfiguration()
    {
        com.google.android.gms.auth.api.signin.internal.SignInConfiguration.CREATOR = new com.google.android.gms.auth.api.signin.internal.zbu();
        return;
    }

    public SignInConfiguration(String p1, com.google.android.gms.auth.api.signin.GoogleSignInOptions p2)
    {
        this.zba = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        this.zbb = p2;
        return;
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.auth.api.signin.internal.SignInConfiguration)) {
            if (this.zba.equals(((com.google.android.gms.auth.api.signin.internal.SignInConfiguration) p4).zba)) {
                com.google.android.gms.auth.api.signin.GoogleSignInOptions v0_3 = this.zbb;
                int v4_1 = ((com.google.android.gms.auth.api.signin.internal.SignInConfiguration) p4).zbb;
                if (v0_3 != null) {
                    if (!v0_3.equals(v4_1)) {
                        return 0;
                    }
                } else {
                    if (v4_1 != 0) {
                        return 0;
                    }
                }
                return 1;
            }
            return 0;
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return new com.google.android.gms.auth.api.signin.internal.HashAccumulator().addObject(this.zba).addObject(this.zbb).hash();
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 2, this.zba, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 5, this.zbb, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInOptions zba()
    {
        return this.zbb;
    }
}
