package com.google.android.gms.fido.fido2.api.common;
public class PublicKeyCredentialParameters extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType zza;
    private final com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier zzb;

    static PublicKeyCredentialParameters()
    {
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzan();
        return;
    }

    public PublicKeyCredentialParameters(String p1, int p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        try {
            this.zza = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.fromString(p1);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(Integer.valueOf(p2));
            try {
                this.zzb = com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.fromCoseValue(p2);
                return;
            } catch (com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException v1_2) {
                throw new IllegalArgumentException(v1_2);
            }
        } catch (com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException v1_5) {
            throw new IllegalArgumentException(v1_5);
        }
        this.zzb = com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.fromCoseValue(p2);
        return;
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters)) {
            if ((!this.zza.equals(((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters) p4).zza)) || (!this.zzb.equals(((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters) p4).zzb))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier getAlgorithm()
    {
        return this.zzb;
    }

    public int getAlgorithmIdAsInteger()
    {
        return this.zzb.toCoseValue();
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType getType()
    {
        return this.zza;
    }

    public String getTypeAsString()
    {
        return this.zza.toString();
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zza, this.zzb}));
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.getTypeAsString(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(p4, 3, Integer.valueOf(this.getAlgorithmIdAsInteger()), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
