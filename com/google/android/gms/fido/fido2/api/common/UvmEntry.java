package com.google.android.gms.fido.fido2.api.common;
public class UvmEntry extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final int zza;
    private final short zzb;
    private final short zzc;

    static UvmEntry()
    {
        com.google.android.gms.fido.fido2.api.common.UvmEntry.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzba();
        return;
    }

    public UvmEntry(int p1, short p2, short p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.fido2.api.common.UvmEntry)) {
            if ((this.zza != ((com.google.android.gms.fido.fido2.api.common.UvmEntry) p4).zza) || ((this.zzb != ((com.google.android.gms.fido.fido2.api.common.UvmEntry) p4).zzb) || (this.zzc != ((com.google.android.gms.fido.fido2.api.common.UvmEntry) p4).zzc))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public short getKeyProtectionType()
    {
        return this.zzb;
    }

    public short getMatcherProtectionType()
    {
        return this.zzc;
    }

    public int getUserVerificationMethod()
    {
        return this.zza;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Integer.valueOf(this.zza), Short.valueOf(this.zzb), Short.valueOf(this.zzc)}));
    }

    public void writeToParcel(android.os.Parcel p3, int p4)
    {
        p4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p3);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 1, this.getUserVerificationMethod());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeShort(p3, 2, this.getKeyProtectionType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeShort(p3, 3, this.getMatcherProtectionType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p3, p4);
        return;
    }
}
