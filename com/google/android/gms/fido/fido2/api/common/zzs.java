package com.google.android.gms.fido.fido2.api.common;
public final class zzs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final java.util.List zza;

    static zzs()
    {
        com.google.android.gms.fido.fido2.api.common.zzs.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzt();
        return;
    }

    public zzs(java.util.List p1)
    {
        this.zza = ((java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return;
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.fido2.api.common.zzs)) {
            if ((!this.zza.containsAll(((com.google.android.gms.fido.fido2.api.common.zzs) p4).zza)) || (!((com.google.android.gms.fido.fido2.api.common.zzs) p4).zza.containsAll(this.zza))) {
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
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {new java.util.HashSet(this.zza)}));
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p4, 1, this.zza, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
