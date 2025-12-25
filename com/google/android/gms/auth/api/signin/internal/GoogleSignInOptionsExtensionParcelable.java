package com.google.android.gms.auth.api.signin.internal;
public class GoogleSignInOptionsExtensionParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zaa;
    private int zab;
    private android.os.Bundle zac;

    static GoogleSignInOptionsExtensionParcelable()
    {
        com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable.CREATOR = new com.google.android.gms.auth.api.signin.internal.zaa();
        return;
    }

    public GoogleSignInOptionsExtensionParcelable(int p1, int p2, android.os.Bundle p3)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        return;
    }

    public GoogleSignInOptionsExtensionParcelable(com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension p3)
    {
        this(1, p3.getExtensionType(), p3.toBundle());
        return;
    }

    public int getType()
    {
        return this.zab;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, this.zaa);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 2, this.getType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(p4, 3, this.zac, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
