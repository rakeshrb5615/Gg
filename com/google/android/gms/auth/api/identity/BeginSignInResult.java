package com.google.android.gms.auth.api.identity;
public final class BeginSignInResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final android.app.PendingIntent zba;

    static BeginSignInResult()
    {
        com.google.android.gms.auth.api.identity.BeginSignInResult.CREATOR = new com.google.android.gms.auth.api.identity.zbg();
        return;
    }

    public BeginSignInResult(android.app.PendingIntent p1)
    {
        this.zba = ((android.app.PendingIntent) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return;
    }

    public android.app.PendingIntent getPendingIntent()
    {
        return this.zba;
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 1, this.getPendingIntent(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
