package com.google.android.gms.fido.fido2.api.common;
public class UserVerificationMethodExtension extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final boolean zza;

    static UserVerificationMethodExtension()
    {
        com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzav();
        return;
    }

    public UserVerificationMethodExtension(boolean p1)
    {
        this.zza = p1;
        return;
    }

    public boolean equals(Object p3)
    {
        if ((p3 instanceof com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension)) {
            if (this.zza != ((com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension) p3).zza) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public boolean getUvm()
    {
        return this.zza;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Boolean.valueOf(this.zza)}));
    }

    public void writeToParcel(android.os.Parcel p3, int p4)
    {
        p4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p3);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 1, this.getUvm());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p3, p4);
        return;
    }
}
