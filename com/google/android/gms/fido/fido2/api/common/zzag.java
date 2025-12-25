package com.google.android.gms.fido.fido2.api.common;
public final class zzag extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final String zza;

    static zzag()
    {
        com.google.android.gms.fido.fido2.api.common.zzag.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzah();
        return;
    }

    public zzag(String p1)
    {
        this.zza = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return;
    }

    public final boolean equals(Object p2)
    {
        if ((p2 instanceof com.google.android.gms.fido.fido2.api.common.zzag)) {
            return this.zza.equals(((com.google.android.gms.fido.fido2.api.common.zzag) p2).zza);
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zza}));
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 1, this.zza, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
