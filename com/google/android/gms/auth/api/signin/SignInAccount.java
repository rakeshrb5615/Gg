package com.google.android.gms.auth.api.signin;
public class SignInAccount extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final String zba;
    final String zbb;
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount zbc;

    static SignInAccount()
    {
        com.google.android.gms.auth.api.signin.SignInAccount.CREATOR = new com.google.android.gms.auth.api.signin.zbc();
        return;
    }

    public SignInAccount(String p1, com.google.android.gms.auth.api.signin.GoogleSignInAccount p2, String p3)
    {
        this.zbc = p2;
        this.zba = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1, "8.3 and 8.4 SDKs require non-null email");
        this.zbb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3, "8.3 and 8.4 SDKs require non-null userId");
        return;
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 4, this.zba, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 7, this.zbc, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 8, this.zbb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount zba()
    {
        return this.zbc;
    }
}
