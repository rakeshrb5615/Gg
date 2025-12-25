package com.google.android.gms.fido.fido2.api.common;
public final class zzf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final byte[] zza;
    private final byte[] zzb;

    static zzf()
    {
        com.google.android.gms.fido.fido2.api.common.zzf.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzg();
        return;
    }

    public zzf(byte[] p1, byte[] p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.fido2.api.common.zzf)) {
            if ((!java.util.Arrays.equals(this.zza, ((com.google.android.gms.fido.fido2.api.common.zzf) p4).zza)) || (!java.util.Arrays.equals(this.zzb, ((com.google.android.gms.fido.fido2.api.common.zzf) p4).zzb))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zza, this.zzb}));
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 1, this.zza, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 2, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
