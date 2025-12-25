package com.google.android.gms.fido.fido2.api.common;
public final class zzab extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final long zza;

    static zzab()
    {
        com.google.android.gms.fido.fido2.api.common.zzab.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzac();
        return;
    }

    public zzab(long p1)
    {
        this.zza = ((Long) com.google.android.gms.common.internal.Preconditions.checkNotNull(Long.valueOf(p1))).longValue();
        return;
    }

    public final boolean equals(Object p7)
    {
        if ((p7 instanceof com.google.android.gms.fido.fido2.api.common.zzab)) {
            if (this.zza != ((com.google.android.gms.fido.fido2.api.common.zzab) p7).zza) {
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
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Long.valueOf(this.zza)}));
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
