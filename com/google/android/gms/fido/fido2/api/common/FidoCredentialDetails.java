package com.google.android.gms.fido.fido2.api.common;
public class FidoCredentialDetails extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final String zza;
    private final String zzb;
    private final byte[] zzc;
    private final byte[] zzd;
    private final boolean zze;
    private final boolean zzf;
    private final long zzg;

    static FidoCredentialDetails()
    {
        com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzy();
        return;
    }

    public FidoCredentialDetails(String p1, String p2, byte[] p3, byte[] p4, boolean p5, boolean p6, long p7)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zze = p5;
        this.zzf = p6;
        this.zzg = p7;
        return;
    }

    public static com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails deserializeFromBytes(byte[] p1)
    {
        return ((com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(p1, com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails.CREATOR));
    }

    public boolean equals(Object p7)
    {
        if ((p7 instanceof com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails)) {
            if ((!com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails) p7).zza)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails) p7).zzb)) || ((!java.util.Arrays.equals(this.zzc, ((com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails) p7).zzc)) || ((!java.util.Arrays.equals(this.zzd, ((com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails) p7).zzd)) || ((this.zze != ((com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails) p7).zze) || ((this.zzf != ((com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails) p7).zzf) || (this.zzg != ((com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails) p7).zzg))))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public byte[] getCredentialId()
    {
        return this.zzd;
    }

    public boolean getIsDiscoverable()
    {
        return this.zze;
    }

    public boolean getIsPaymentCredential()
    {
        return this.zzf;
    }

    public long getLastUsedTime()
    {
        return this.zzg;
    }

    public String getUserDisplayName()
    {
        return this.zzb;
    }

    public byte[] getUserId()
    {
        return this.zzc;
    }

    public String getUserName()
    {
        return this.zza;
    }

    public int hashCode()
    {
        int v0_0 = this.zza;
        byte[] v2 = this.zzc;
        Boolean.valueOf(this.zze);
        Boolean.valueOf(this.zzf);
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {v0_0, Long.valueOf(this.zzg)}));
    }

    public byte[] serializeToBytes()
    {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 1, this.getUserName(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.getUserDisplayName(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 3, this.getUserId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 4, this.getCredentialId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 5, this.getIsDiscoverable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 6, this.getIsPaymentCredential());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 7, this.getLastUsedTime());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
