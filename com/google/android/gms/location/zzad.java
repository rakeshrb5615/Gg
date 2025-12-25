package com.google.android.gms.location;
public final class zzad extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final boolean zza;
    private final com.google.android.gms.internal.location.zze zzb;

    static zzad()
    {
        com.google.android.gms.location.zzad.CREATOR = new com.google.android.gms.location.zzae();
        return;
    }

    public zzad(boolean p1, com.google.android.gms.internal.location.zze p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.location.zzad)) {
            if ((this.zza != ((com.google.android.gms.location.zzad) p4).zza) || (!com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.location.zzad) p4).zzb))) {
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
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Boolean.valueOf(this.zza)}));
    }

    public final String toString()
    {
        String v0_1 = u.e.b("LocationAvailabilityRequest[");
        if (this.zza) {
            v0_1.append("bypass, ");
        }
        if (this.zzb != null) {
            v0_1.append("impersonation=");
            v0_1.append(this.zzb);
            v0_1.append(", ");
        }
        v0_1.setLength((v0_1.length() - 2));
        v0_1.append(93);
        return v0_1.toString();
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        com.google.android.gms.internal.location.zze v0_0 = this.zza;
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 1, v0_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 2, this.zzb, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v1);
        return;
    }
}
