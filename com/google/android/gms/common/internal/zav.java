package com.google.android.gms.common.internal;
public final class zav extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zaa;
    final android.os.IBinder zab;
    private final com.google.android.gms.common.ConnectionResult zac;
    private final boolean zad;
    private final boolean zae;

    static zav()
    {
        com.google.android.gms.common.internal.zav.CREATOR = new com.google.android.gms.common.internal.zaw();
        return;
    }

    public zav(int p1, android.os.IBinder p2, com.google.android.gms.common.ConnectionResult p3, boolean p4, boolean p5)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        this.zad = p4;
        this.zae = p5;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5) {
            if (this != p5) {
                if ((p5 instanceof com.google.android.gms.common.internal.zav)) {
                    if ((!this.zac.equals(((com.google.android.gms.common.internal.zav) p5).zac)) || (!com.google.android.gms.common.internal.Objects.equal(this.zab(), ((com.google.android.gms.common.internal.zav) p5).zab()))) {
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
        } else {
            return 0;
        }
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, this.zaa);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(p5, 2, this.zab, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 3, this.zac, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 4, this.zad);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 5, this.zae);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }

    public final com.google.android.gms.common.ConnectionResult zaa()
    {
        return this.zac;
    }

    public final com.google.android.gms.common.internal.IAccountAccessor zab()
    {
        com.google.android.gms.common.internal.IAccountAccessor v0_0 = this.zab;
        if (v0_0 != null) {
            return com.google.android.gms.common.internal.IAccountAccessor$Stub.asInterface(v0_0);
        } else {
            return 0;
        }
    }

    public final boolean zac()
    {
        return this.zad;
    }

    public final boolean zad()
    {
        return this.zae;
    }
}
