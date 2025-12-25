package com.google.android.gms.fido.fido2.api.common;
public class PublicKeyCredentialUserEntity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final byte[] zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    static PublicKeyCredentialUserEntity()
    {
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzar();
        return;
    }

    public PublicKeyCredentialUserEntity(byte[] p1, String p2, String p3, String p4)
    {
        this.zza = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zzb = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        this.zzc = p3;
        this.zzd = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4));
        return;
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity)) {
            if ((!java.util.Arrays.equals(this.zza, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity) p4).zza)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity) p4).zzb)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzc, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity) p4).zzc)) || (!com.google.android.gms.common.internal.Objects.equal(this.zzd, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity) p4).zzd))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public String getDisplayName()
    {
        return this.zzd;
    }

    public String getIcon()
    {
        return this.zzc;
    }

    public byte[] getId()
    {
        return this.zza;
    }

    public String getName()
    {
        return this.zzb;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zza, this.zzb, this.zzc, this.zzd}));
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 2, this.getId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 3, this.getName(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 4, this.getIcon(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 5, this.getDisplayName(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
