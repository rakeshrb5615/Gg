package com.google.android.gms.fido.fido2.api.common;
public final class zzu extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final boolean zza;

    static zzu()
    {
        com.google.android.gms.fido.fido2.api.common.zzu.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzv();
        return;
    }

    public zzu(boolean p1)
    {
        this.zza = ((Boolean) com.google.android.gms.common.internal.Preconditions.checkNotNull(Boolean.valueOf(p1))).booleanValue();
        return;
    }

    public final boolean equals(Object p3)
    {
        if ((p3 instanceof com.google.android.gms.fido.fido2.api.common.zzu)) {
            if (this.zza != ((com.google.android.gms.fido.fido2.api.common.zzu) p3).zza) {
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

    public final void writeToParcel(android.os.Parcel p3, int p4)
    {
        p4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p3);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p3, p4);
        return;
    }
}
